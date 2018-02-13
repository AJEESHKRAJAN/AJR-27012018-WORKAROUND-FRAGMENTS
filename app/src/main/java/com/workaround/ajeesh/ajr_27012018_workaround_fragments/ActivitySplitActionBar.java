package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ActivitySplitActionBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_action_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_split_action_options, menu);
        return true;
    }

    public void onOption1Clicked(MenuItem menuItem) {
        //setActionBarPSLogo();
        showToast("Option 1");
    }

    public void onOption2Clicked(MenuItem menuItem) {
        setActionBarTitleAndSubtitle();
        showToast("Option 2");
    }

    public void onOption3Clicked(MenuItem menuItem) {
        hideActionBarTitleAndSubtitle();
        showToast("Option 3");
    }

    public void onExitClicked(MenuItem menuItem) {
        finish();
    }

    private void showToast(CharSequence message) {
        Toast t = Toast.makeText(this, message, Toast.LENGTH_LONG);
        t.show();
    }

    public void setActionBarTitleAndSubtitle() {
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Android ActionBar");
            actionBar.setSubtitle("Improve UI Interaction");
        }
    }

    public void hideActionBarTitleAndSubtitle() {
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN)
            toggleActionBar();

        return true;
    }

    private void toggleActionBar() {
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            if(actionBar.isShowing())
                actionBar.hide();
            else
                actionBar.show();
        }
    }

}
