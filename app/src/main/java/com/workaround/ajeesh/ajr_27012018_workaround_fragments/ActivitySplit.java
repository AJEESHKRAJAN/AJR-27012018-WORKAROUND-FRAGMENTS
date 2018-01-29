package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentCourseDescription;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Interface.ICourseCoordinator;

public class ActivitySplit extends AppCompatActivity implements ICourseCoordinator {
    private String logName = "WWF-ACT-SPLIT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Split Activity has been initiated");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split);
    }

    @Override
    public void onSelectedOptionChanged(int selectedIndex) {
        LogHelper.LogThreadId(logName, "Split Activity: selectedIndex : " + selectedIndex);
        FragmentManager fragmentManager = getFragmentManager();

        FragmentCourseDescription fragmentCourseDescription = (FragmentCourseDescription) fragmentManager.findFragmentById(R.id.splitActivityContent_CourseDescriptionFragment);

        fragmentCourseDescription.setSelectedRadioOptionDescription(selectedIndex);

        LogHelper.LogThreadId(logName, "Split Activity: " + fragmentManager.toString());
    }
}
