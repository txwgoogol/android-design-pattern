package com.txw.designpattern.mvc;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import top.txwgoogol.designpattern.mvc.model.MVCActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by txwgoogol on 2018/2/7.
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
