package com.txw.designpattern.mvp;

import android.app.ProgressDialog;
import android.content.Context;

public class ProgressDialogEx {

    private Context mContext;
    public ProgressDialog progressDialog;

    public ProgressDialogEx(Context mContext) {
        this.mContext = mContext;
    }

    public ProgressDialog showProgressDialog() {
        progressDialog = new ProgressDialog(mContext);
        progressDialog.setMessage("加载中");
        progressDialog.show();
        return progressDialog;
    }

    public ProgressDialog showProgressDialog(CharSequence message) {
        progressDialog = new ProgressDialog(mContext);
        progressDialog.setMessage(message);
        progressDialog.show();
        return progressDialog;
    }

    public void dismissProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            // progressDialog.hide();会导致android.view.WindowLeaked
            progressDialog.dismiss();
        }
    }

}
