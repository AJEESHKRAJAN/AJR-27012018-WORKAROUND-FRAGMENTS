package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentCourseDescription extends Fragment {

    private String logName = "WWF-FRG-CSDESC";


    final int _courseIndexDefaultValue = 0;

    TextView _descriptionView;
    String[] _courseDescriptions;
    int _courseIndex;


    public FragmentCourseDescription() {
        LogHelper.LogThreadId(logName, "Course description fragment has been initiated");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_fragment_course_description, container, false);
        _descriptionView = theView.findViewById(R.id.textViewCourseDesc);
        _courseDescriptions = getResources().getStringArray(R.array.courseDescriptions);

        _courseIndex = _courseIndexDefaultValue;
        LogHelper.LogThreadId(logName, "Course description fragment : Default index is : " + _courseIndex);
        setSelectedRadioOptionDescription(_courseIndex);

        return theView;
    }

    private void setSelectedRadioOptionDescription(int courseIndex) {
        _courseIndex = courseIndex;
        _descriptionView.setText(_courseDescriptions[_courseIndex]);
    }

}
