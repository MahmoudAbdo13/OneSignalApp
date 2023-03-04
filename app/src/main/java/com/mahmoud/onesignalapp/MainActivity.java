package com.mahmoud.onesignalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    //8f2d5fbe-0988-4238-9fcd-fedb161d80da
    private static final String ONESIGNAL_APP_ID = "8f2d5fbe-0988-4238-9fcd-fedb161d80da";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}