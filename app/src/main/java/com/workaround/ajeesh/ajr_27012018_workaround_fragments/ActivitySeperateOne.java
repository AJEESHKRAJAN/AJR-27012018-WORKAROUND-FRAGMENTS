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
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Interface.ICourseCoordinator;

public class ActivitySeperateOne extends AppCompatActivity implements ICourseCoordinator {
    private String logName = "WWF-ACT-SEP1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Seperate One Activity has been initiated.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seperate_one);
    }

    @Override
    public void onSelectedOptionChanged(int selectedIndex) {
        FragmentManager fragmentManager = getFragmentManager();

        FragmentCourseDescription fragmentCourseDescription = (FragmentCourseDescription)
                fragmentManager.findFragmentById(R.id.splitActivityContent_CourseDescriptionFragment);


        if (fragmentCourseDescription != null && fragmentCourseDescription.isVisible()) {
            LogHelper.LogThreadId(logName, "Seperate One Activity: Is fragment course desc visible ... ? "
                    + fragmentCourseDescription.isVisible());
            fragmentCourseDescription.setSelectedRadioOptionDescription(selectedIndex);
        } else {
            LogHelper.LogThreadId(logName, "Seperate One Activity: New intent for desc frag has been created.");
            Intent intent = new Intent(this, ActivitySeperateTwo.class);
            intent.putExtra("passCourseIndex", selectedIndex);
            startActivity(intent);
        }
    }
}
