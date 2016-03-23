package com.accel.myowncustomexception;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Venkat on 23-03-2016.
 */
public class BaseActivity extends AppCompatActivity {
    //https://trivedihardik.wordpress.com/tag/solution-of-forced-close-error/
    private final String LINE_SEPARATOR = "\n";

    protected void getCaughtException(Activity _activiyContext) {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(_activiyContext));
    }
}
