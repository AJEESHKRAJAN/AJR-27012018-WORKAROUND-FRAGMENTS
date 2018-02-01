package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Adapter.AdapterPagerTabbedNavigation;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentTabbedOne extends Fragment {
    private final String logName = "WWF-FRG-AB-TAB1";

    public FragmentTabbedOne() {
        LogHelper.LogThreadId(logName, "Fragment  - Tab Navigation - Extension one - Initiated.");
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
        LogHelper.LogThreadId(logName, "Fragment  - Tab Navigation - Extension one - Additional options in menu.");
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

    /*@Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(new AdapterPagerTabbedNavigation(getActivity().getSupportFragmentManager(),
                getActivity()));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }*/
}
