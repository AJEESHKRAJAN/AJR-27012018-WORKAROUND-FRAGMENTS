package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityButtonClick extends AppCompatActivity {
    String logName = "WWF-ACT-BTNACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Activity Button Click has been initiated.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
    }

}
