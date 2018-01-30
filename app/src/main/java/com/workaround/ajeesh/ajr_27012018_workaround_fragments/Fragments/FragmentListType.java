package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

        String[] courseTitlesList = getResources().getStringArray(R.array.courseTitlesForList);

        ArrayAdapter<String> courseTitleAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, courseTitlesList);

        setListAdapter(courseTitleAdapter);

    }
}
