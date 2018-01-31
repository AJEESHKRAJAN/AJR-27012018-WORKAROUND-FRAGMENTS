package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class FragmentAlertDialog extends DialogFragment implements DialogInterface.OnClickListener {

    private final String logName = "WWF-FRG-DLG-ALRT";

    public FragmentAlertDialog() {
        LogHelper.LogThreadId(logName, "Alert Dialog Fragment has been initiated.");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setMessage("What action you'd like to do?");
        alertDialogBuilder.setPositiveButton("Move up!", this);
        alertDialogBuilder.setNegativeButton("Stay here!", this);

        Dialog theDialog = alertDialogBuilder.create();
        theDialog.setCanceledOnTouchOutside(false);
        return theDialog;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                break;
            case Dialog.BUTTON_NEGATIVE:
                break;
            default:
                break;
        }
    }
}
