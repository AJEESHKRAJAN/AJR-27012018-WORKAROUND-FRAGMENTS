package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentTabbedTwo extends Fragment {
    private final String logName = "WWF-FRG-AB-TAB2";

    public FragmentTabbedTwo() {
        LogHelper.LogThreadId(logName, "Fragment  - Tab Navigation - Extension two - Initiated.");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_fragment_action_bar_extension_two, container, false);
        String setTextExtTwo = getResources().getStringArray(R.array.courseDescriptionsForList)[1];
        TextView textView = theView.findViewById(R.id.courseIntentsDescriptionTextView);
        textView.setText(setTextExtTwo);
        return theView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        LogHelper.LogThreadId(logName, "Fragment  - Tab Navigation - Extension two - Additional options in menu.");
        inflater.inflate(R.menu.menu_additional_extension_two, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean handled = true;

        switch (id) {
            case R.id.menuIntentsOnlyOption: {
                displayHandledMessage(item);
                break;
            }
            default:
                handled = super.onOptionsItemSelected(item);
                break;
        }
        return handled;
    }

    private void displayHandledMessage(MenuItem item) {
        Toast.makeText(getActivity(), "Handled by Fragment", Toast.LENGTH_LONG).show();
    }
}
