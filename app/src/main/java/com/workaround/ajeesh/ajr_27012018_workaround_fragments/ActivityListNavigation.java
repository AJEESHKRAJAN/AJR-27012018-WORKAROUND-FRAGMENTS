package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentActionBarExtensionOne;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentActionBarExtensionTwo;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityListNavigation extends AppCompatActivity implements OnItemSelectedListener {

    private final String _fragment0DisplayName = "Whats new in Android 4.0";
    private final String _fragment1DisplayName = "Android Intents";
    private final String logName = "WWF-ACT-LIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_navigation);
        LogHelper.LogThreadId(logName, "List navigation activity is initiated.");
        String[] listMembers = {"Select a Fragment", _fragment0DisplayName, _fragment1DisplayName};

        /*ActionBar actionBar = getActionBar();

        if (actionBar != null) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);


            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listMembers);
            actionBar.setListNavigationCallbacks(arrayAdapter, this);
        }*/
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, listMembers);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        LogHelper.LogThreadId(logName, "List navigation activity : ItemPosition : " + position);
        Fragment theFragment = null;
        switch (position) {
            case 0:
                return;
            case 1: {
                theFragment = new FragmentActionBarExtensionOne();
                break;
            }
            case 2: {
                theFragment = new FragmentActionBarExtensionTwo();
                break;
            }
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(android.R.id.content, theFragment);
        ft.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(parent.getContext(), "Nothing is selected", Toast.LENGTH_LONG).show();
    }
}
