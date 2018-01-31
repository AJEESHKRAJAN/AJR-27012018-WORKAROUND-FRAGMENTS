package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentAlertDialog;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentDialogType;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityDialogType extends AppCompatActivity {
    private final String logName = "WWF-ACT-DLG-TYPE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_type);
        LogHelper.LogThreadId(logName, "Dialog Activity has been initiated.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dialog_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean handled = true;

        switch (id) {
            case R.id.menuDialogBasic: {
                openDialogBasic();
                break;
            }
            case R.id.menuDialogAlert: {
                openDialogAlert();
                break;
            }
            case R.id.menuDialogFragment: {
                openDialogFragment();
                break;
            }
            case R.id.menuExit: {
                finish();
                break;
            }

            default:
                handled = super.onOptionsItemSelected(item);
                break;
        }
        return handled;
    }


    public void openDialogBasic() {
        FragmentManager fm = getFragmentManager();
        FragmentDialogType fragmentDialogType = new FragmentDialogType();
        LogHelper.LogThreadId(logName, "Dialog Activity : Calling FragmentDialogType fragment.");

        //fragmentDialogType.show(fm, "Basic Dialog");
        FragmentTransaction ft = fm.beginTransaction();
        fragmentDialogType.show(ft, "Basic dialog Transaction");
    }


    private void openDialogAlert() {
        LogHelper.LogThreadId(logName, "Alert dialog is created up.");

        FragmentManager fm = getFragmentManager();

        FragmentAlertDialog fragmentAlertDialog = new FragmentAlertDialog();

        fragmentAlertDialog.show(fm, "Alert Dialog");
    }

    private void openDialogFragment() {
        LogHelper.LogThreadId(logName, "Dialog as a fragment is being created.");

        FragmentManager fm = getFragmentManager();

        FragmentDialogType fragmentDialogType = new FragmentDialogType();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(android.R.id.content, fragmentDialogType, "FragmentDialog");
        ft.addToBackStack("Fragment Dialog");
        ft.commit();
    }

}
