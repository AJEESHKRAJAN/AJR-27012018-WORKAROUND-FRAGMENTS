package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentCourseName extends Fragment implements View.OnClickListener {

    private String logName = "WWF-FRG-CSNAM";


    public FragmentCourseName() {
        // Required empty public constructor
        LogHelper.LogThreadId(logName, "Course name fragment has been initiated");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_fragment_course_name, container, false);
        setUpOnClickListeners(theView);
        return theView;
    }

    private void setUpOnClickListeners(View theView) {
        radioOptionListener(theView, R.id.courseForNewFeaturesRadioButton);
        radioOptionListener(theView, R.id.courseIntroRadioButton);
        radioOptionListener(theView, R.id.courseIntentsRadioButton);
        radioOptionListener(theView, R.id.courseActionBarRadioButton);
        radioOptionListener(theView, R.id.courseAsyncAndServices);
    }

    private void radioOptionListener(View theView, int radioOptionId) {
        LogHelper.LogThreadId(logName, "Course name fragment : Radio button listener created for : " + radioOptionId);
        View childView = theView.findViewById(radioOptionId);
        childView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int selectedId = v.getId();
        RadioButton radioButton = (RadioButton) v;
        CharSequence courseText = radioButton.getText();

        int index = translateIdToIndex(selectedId);
    }

    int translateIdToIndex(int id) {
        int index = 0;
        switch (id) {
            case R.id.courseForNewFeaturesRadioButton:
                index = 0;
                break;
            case R.id.courseIntroRadioButton:
                index = 1;
                break;
            case R.id.courseIntentsRadioButton:
                index = 2;
                break;
            case R.id.courseActionBarRadioButton:
                index = 3;
                break;
            case R.id.courseAsyncAndServices:
                index = 4;
                break;
        }

        return index;
    }


}
