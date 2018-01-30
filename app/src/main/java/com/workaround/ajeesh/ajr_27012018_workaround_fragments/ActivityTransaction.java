package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTransactionBuilderOne;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTransactionBuilderTwo;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityTransaction extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {
    final String _fragmentTag = "dynamicFragment";
    static final String logName = "WWF-ACT-TRAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        FragmentManager fm = getFragmentManager();
        fm.addOnBackStackChangedListener(this);
    }

    public void onClickBtnAdd(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnAdd");
        FragmentTransactionBuilderOne frTranOne = new FragmentTransactionBuilderOne();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.group1, frTranOne, _fragmentTag);
        ft.addToBackStack("Add");
        ft.commit();
    }

    public void onClickBtnRemove(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnRemove");

        FragmentManager fm = getFragmentManager();
        FragmentTransactionBuilderTwo frTranTwo = new FragmentTransactionBuilderTwo();

        Fragment oldFragment = fm.findFragmentByTag(_fragmentTag);

        FragmentTransaction ft = fm.beginTransaction();

        if (oldFragment != null) {
            ft.remove(oldFragment);
        }
        ft.add(R.id.group1, frTranTwo, _fragmentTag);
        ft.addToBackStack("Remove");
        ft.commit();

    }

    public void onClickBtnReplace(View theView) {
        LogHelper.LogThreadId(logName, "onClickBtnReplace");

        FragmentManager fm = getFragmentManager();

        FragmentTransactionBuilderOne frTranOne = new FragmentTransactionBuilderOne();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.group1, frTranOne, _fragmentTag);
        ft.addToBackStack("Replace");
        ft.commit();

    }

    public void onClickBtnAttach(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnAttach");

        FragmentManager fm = getFragmentManager();
        Fragment theFragment = fm.findFragmentByTag(_fragmentTag);

        if (theFragment != null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.attach(theFragment);
            ft.addToBackStack("Attach");
            ft.commit();
        }

    }

    public void onClickBtnDetach(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
        Fragment theFragment = fm.findFragmentByTag(_fragmentTag);

        if (theFragment != null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.detach(theFragment);
            ft.addToBackStack("Detach");
            ft.commit();
        }
    }

    public void onClickBtnPrevious(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnPrevious");
        FragmentManager fm = getFragmentManager();
        fm.popBackStack();
    }

    public void showMsg(String msg) {
        LogHelper.LogThreadId(logName, "Transaction Activity : Message formed : " + msg);
        Toast t = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        t.show();
    }

    public static void LogBackStackEntry(FragmentManager.BackStackEntry entry) {
        if (entry != null) {
            LogHelper.LogThreadId(logName, "Transaction Activity :  BackStackEntry Name: " + entry.getName());
        } else {
            LogHelper.LogThreadId(logName, "Transaction Activity :  BackStackEntry Name:<NULL> ");
        }
    }

    @Override
    public void onBackStackChanged() {
        showMsg("BackStack Changed");
        LogHelper.LogThreadId(logName, "************************************************************");
        LogHelper.LogThreadId(logName, "BackStack Changed - BackStackEntry's (starting with index 0)");
        FragmentManager fm = getFragmentManager();
        int backStackEntryCount = fm.getBackStackEntryCount();

        for (int i = 0; i < backStackEntryCount; i++) {
            LogBackStackEntry(fm.getBackStackEntryAt(i));
        }
    }
}
