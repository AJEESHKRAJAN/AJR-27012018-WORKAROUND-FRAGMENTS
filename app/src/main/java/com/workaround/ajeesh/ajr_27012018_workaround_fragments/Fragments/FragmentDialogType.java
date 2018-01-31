package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

public class FragmentDialogType extends DialogFragment implements View.OnClickListener {

    private final String logName = "WWF-FRG-DLG-TYP";

    public FragmentDialogType() {
        LogHelper.LogThreadId(logName, "Dialog Type Fragment has been initiated. ");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragment_fragment_dialog_type, container, false);

        View yesButton = theView.findViewById(R.id.btnYes);
        yesButton.setOnClickListener(this);
        yesButton.requestFocus();

        View noButton = theView.findViewById(R.id.btnNo);
        noButton.setOnClickListener(this);

        Dialog currentDialog = getDialog();
        if (currentDialog != null) {
            currentDialog.setTitle("The Dialog Title!");
            currentDialog.setCanceledOnTouchOutside(false);
            LogHelper.LogThreadId(logName, " Touch from outside of the dialog is Disabled");
        }
        return theView;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.btnYes:
                break;
            case R.id.btnNo:
                break;
            default:
                break;
        }
        dismiss();
    }
}
