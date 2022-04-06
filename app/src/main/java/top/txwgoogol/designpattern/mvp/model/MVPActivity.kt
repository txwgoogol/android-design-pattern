package top.txwgoogol.designpattern.mvp.model

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.util.Preconditions.checkNotNull
import top.txwgoogol.designpattern.R

/**
 * 主界面
 * Created by txwgoogol on 2018/2/13.
 */
class MVPActivity : AppCompatActivity(), WeatherContact.View, View.OnClickListener {
	
	private var mProgressDialogEx: ProgressDialogEx? = null
	private var mPresenter: WeatherContact.Presenter? = null
	private var mWeatherPresenter: WeatherPresenter? = null

	private lateinit var okHttp: Button
	private lateinit var tvDesc: TextView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_weather)
		
		mProgressDialogEx = ProgressDialogEx(this)
		mWeatherPresenter = WeatherPresenter(this)

		tvDesc = findViewById(R.id.tv_desc)
		okHttp = findViewById(R.id.ok_http)
		okHttp.setOnClickListener(this)
	}
	
	override fun onClick(v: View) {
		when(v.id){
			R.id.ok_http -> mPresenter!!.start()
		}
	}
	
	override fun loading() {
		mProgressDialogEx!!.showProgressDialog()
	}
	
	override fun hide() {
		mProgressDialogEx!!.dismissProgressDialog()
	}
	
	override fun success(weather: Weather) {
		dataSuccess(weather)
	}
	
	override fun failure() {
		mProgressDialogEx!!.dismissProgressDialog()
	}
	
	override fun setPresenter(presenter: WeatherContact.Presenter) {
		mPresenter = checkNotNull<WeatherContact.Presenter>(presenter)
	}
	
	//填充数据
	private fun dataSuccess(model: Weather) {
		val weatherinfo = model.weatherinfo
		val showData = (resources.getString(R.string.city) + weatherinfo.city
			+ resources.getString(R.string.wd) + weatherinfo.wd
			+ resources.getString(R.string.ws) + weatherinfo.ws
			+ resources.getString(R.string.time) + weatherinfo.time)
		tvDesc.text = showData
	}
	
}