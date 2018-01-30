package com.workaround.ajeesh.ajr_27012018_workaround_fragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class ActivityTransaction extends AppCompatActivity {
    final String _fragmentTag = "dynamicFragment";
    static final String logName = "WWF-ACT-TRAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
    }

    public void onClickBtnAdd(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnAdd");
    }

    public void onClickBtnRemove(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnRemove");

        FragmentManager fm = getFragmentManager();

    }

    public void onClickBtnReplace(View theView) {
        LogHelper.LogThreadId(logName, "onClickBtnReplace");

        FragmentManager fm = getFragmentManager();
    }

    public void onClickBtnAttach(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnAttach");

        FragmentManager fm = getFragmentManager();
    }

    public void onClickBtnDetach(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
    }

    public void onClickBtnPrevious(View theView) {
        LogHelper.LogThreadId(logName, "Transaction Activity :  onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
    }

    public void showMsg(String msg) {
        LogHelper.LogThreadId(logName, "Transaction Activity : Message formed : " + msg);
        Toast t = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        t.show();
    }

    public static void LogBackStackEntry(FragmentManager.BackStackEntry entry) {
        if (entry != null) {
            LogHelper.LogThreadId(logName, "Transaction Activity :  BackStackEntry Name:" + entry.getName());
        } else {
            LogHelper.LogThreadId(logName, "Transaction Activity :  BackStackEntry Name:<NULL>");
        }
    }
}
