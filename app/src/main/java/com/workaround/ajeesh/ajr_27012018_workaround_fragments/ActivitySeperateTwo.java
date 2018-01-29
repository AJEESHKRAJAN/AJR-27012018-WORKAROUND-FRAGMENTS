package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentCourseDescription;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivitySeperateTwo extends AppCompatActivity {
    private String logName = "WWF-ACT-SEP2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Seperate Two Activity has been initiated.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seperate_two);

        Intent intent = getIntent();
        int passedCourseIndexValue = intent.getIntExtra("passCourseIndex", 0);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentCourseDescription fragmentCourseDescription = (FragmentCourseDescription)
                fragmentManager.findFragmentById(R.id.splitActivityContent_CourseDescriptionFragment);

        fragmentCourseDescription.setSelectedRadioOptionDescription(passedCourseIndexValue);
    }

}
