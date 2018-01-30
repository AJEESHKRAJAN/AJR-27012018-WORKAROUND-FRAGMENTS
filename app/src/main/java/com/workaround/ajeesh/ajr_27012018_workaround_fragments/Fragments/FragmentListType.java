package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentListType extends ListFragment {

    private final String logName = "WWF-FRG-LSTTYP";

    public FragmentListType() {
        LogHelper.LogThreadId(logName, "Fragment List has been initiated.");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogHelper.LogThreadId(logName, "Fragment List : onActivityCreated. ");
        //String[] courseTitlesList = getResources().getStringArray(R.array.courseTitlesForList);
        String[] courseTitlesList = getResources().getStringArray(R.array.emptyList);

        ArrayAdapter<String> courseTitleAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_activated_1, courseTitlesList);

        setListAdapter(courseTitleAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Fragment List : onCreateView. ");
        return inflater.inflate(R.layout.fragment_fragment_customized_list_layout, container, false);
    }
}
