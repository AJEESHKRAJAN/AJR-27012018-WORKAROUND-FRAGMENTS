package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Adapter.AdapterPagerTabbedNavigation;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityTabbedNavigation extends AppCompatActivity {
    private final String logName = "WWF-ACT-TAB-NAV";
    private final String _tab1DisplayName = "Fragment Display One";
    private final String _tab2DisplayName = "Fragment Display Two";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LogHelper.LogThreadId(logName, "Activity Tabbed Navigation has been initiated.");
        configureTabbedLayout();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void configureTabbedLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(_tab1DisplayName));
        tabLayout.addTab(tabLayout.newTab().setText(_tab2DisplayName));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        LogHelper.LogThreadId(logName, "Activity Tabbed Navigation - Tab Layout initiated");
        FragmentManager fragmentManagerTab = getSupportFragmentManager();

        final ViewPager viewPager = findViewById(R.id.pager);

        AdapterPagerTabbedNavigation adapter = new AdapterPagerTabbedNavigation(fragmentManagerTab, tabLayout.getTabCount());
        LogHelper.LogThreadId(logName, "Activity Tabbed Navigation - Adapter is being called.");

        viewPager.setAdapter(adapter);
        LogHelper.LogThreadId(logName, "Activity Tabbed Navigation - Adapter is being set.");

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        LogHelper.LogThreadId(logName, "Activity Tabbed Navigation - Adapter - addOnPageChangeListener");

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                CharSequence displayName = tab.getText();
                viewPager.setCurrentItem(tab.getPosition());
                LogHelper.LogThreadId(logName, "Activity Tabbed Navigation : onTabSelected.");
                //fragmentManagerTab.beginTransaction().replace(android.R.id.content, theFragment).addToBackStack("TabFragmentOne").commit();
                //fragmentManager.beginTransaction().replace(android.R.id.content, theFragment).addToBackStack("TabFragmentTwo").commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                LogHelper.LogThreadId(logName, "Activity Tabbed Navigation : onTabUnselected.");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                LogHelper.LogThreadId(logName, "Activity Tabbed Navigation : onTabReselected.");
            }
        });
    }


    public void onToggleTitleClick(MenuItem menuItem) {

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        int currentOptions = actionBar.getDisplayOptions();
        boolean currentVisibleValue =
                (currentOptions & ActionBar.DISPLAY_SHOW_TITLE) != 0;
        boolean newVisibleValue = !currentVisibleValue;

        actionBar.setDisplayShowHomeEnabled(newVisibleValue);
        actionBar.setDisplayShowTitleEnabled(newVisibleValue);
    }
}
