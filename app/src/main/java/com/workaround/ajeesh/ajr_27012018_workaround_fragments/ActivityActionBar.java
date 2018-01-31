package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentActionBarExtensionOne;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentActionBarExtensionTwo;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTransactionBuilderOne;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTransactionBuilderTwo;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityActionBar extends AppCompatActivity {
    private final String logName = "WWF-ACT-ACTN-BAR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean handled = true;

        switch (id) {
            case R.id.menuAndroid40CourseFragment: {
                buildExtensionOne(item);
                break;
            }
            case R.id.menuIntentsCourseFragment: {
                buildExtensionTwo(item);
                break;
            }
            case R.id.menuFragmentListNavigationActivity: {
                generateActivityForClass(ActivityListNavigation.class);
                break;
            }
            case R.id.menuFragmentTabbedNavigationActivity: {
                generateActivityForClass(ActivityTabbedNavigation.class);
                break;
            }
            case R.id.menuAndroid40Opt1: {
                displayHandledMessage(item);
                break;
            }
            case R.id.menuAndroid40Opt2: {
                displayHandledMessage(item);
                break;
            }
            case R.id.menuIntentsOnlyOption: {
                displayHandledMessage(item);
                break;
            }
            case R.id.menuExit: {
                onClickExit(item);
            }
            default:
                handled = super.onOptionsItemSelected(item);
                break;
        }
        return handled;
    }


    private void buildExtensionOne(MenuItem item) {
        FragmentActionBarExtensionOne extOne = new FragmentActionBarExtensionOne();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(android.R.id.content, extOne);
        ft.addToBackStack("Extension One");
        ft.commit();
    }

    private void buildExtensionTwo(MenuItem item) {
        FragmentActionBarExtensionTwo extTwo = new FragmentActionBarExtensionTwo();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(android.R.id.content, extTwo);
        ft.addToBackStack("Extension Two");
        ft.commit();
    }


    private void onClickExit(MenuItem item) {
        finish();
    }

    private void displayHandledMessage(MenuItem item) {
        Toast.makeText(this, "Handled by ACTIVITY", Toast.LENGTH_LONG).show();
    }

    private void generateActivityForClass(Class<?> activityClass) {
        LogHelper.LogThreadId(logName, "Activity generated for :" + activityClass);
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

}
