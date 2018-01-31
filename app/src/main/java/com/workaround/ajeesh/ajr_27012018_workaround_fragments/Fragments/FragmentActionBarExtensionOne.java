package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class FragmentActionBarExtensionOne extends Fragment {
    private final String logName = "WWF-FRG-AB-EXT1";

    public FragmentActionBarExtensionOne() {
        LogHelper.LogThreadId(logName, "Fragment  - Action Bar - Extension one - Initiated.");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragment_fragment_action_bar_extension_one, container, false);

        String setTextExtOne = getResources().getStringArray(R.array.courseDescriptionsForList)[3];
        TextView textView = theView.findViewById(R.id.courseAndroid40DescriptionTextView);
        textView.setText(setTextExtOne);

        return theView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        LogHelper.LogThreadId(logName, "Fragment  - Action Bar - Extension one - Additional options in menu.");
        inflater.inflate(R.menu.menu_additional_extension_one, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean handled = true;

        switch (id) {
            case R.id.menuAndroid40Opt1: {
                displayHandledMessage(item);
                break;
            }
            case R.id.menuAndroid40Opt2: {
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
