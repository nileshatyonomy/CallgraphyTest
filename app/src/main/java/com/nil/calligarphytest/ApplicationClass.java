package com.nil.calligarphytest;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Nilesh Thakkar on Dec 05,2016 14:58.
 */
public class ApplicationClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/orange.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );


       // asfdsaf asfs adfasfs

        }
}
