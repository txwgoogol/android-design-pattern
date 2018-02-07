package com.txw.designpattern.mvc;

import android.graphics.Color;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.txw.designpattern.R;
import com.txw.designpattern.mvc.model.MVCActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by txw on 2018/2/7.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MVCActivityTest {

    @Rule
    public ActivityTestRule<MVCActivity> rule = new ActivityTestRule<MVCActivity>(MVCActivity.class);

    @Test
    public void setData() {

    }
}
