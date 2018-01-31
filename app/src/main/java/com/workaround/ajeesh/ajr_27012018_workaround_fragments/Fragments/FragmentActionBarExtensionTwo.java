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

public class FragmentActionBarExtensionTwo extends Fragment {
    private final String logName = "WWF-FRG-AB-EXT2";

    public FragmentActionBarExtensionTwo() {
        LogHelper.LogThreadId(logName, "Fragment  - Action Bar - Extension two - Initiated.");
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
        LogHelper.LogThreadId(logName, "Fragment  - Action Bar - Extension two - Additional options in menu.");
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
