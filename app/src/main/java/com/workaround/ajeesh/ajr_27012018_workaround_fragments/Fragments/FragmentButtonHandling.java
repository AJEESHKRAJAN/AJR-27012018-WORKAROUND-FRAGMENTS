package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentButtonHandling extends Fragment implements View.OnClickListener {
    private int _clickCount = 0;
    private TextView _textViewClickCount = null;
    String logName = "WWF-FRG-BTNHNDL";

    public FragmentButtonHandling() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Button Handling Fragment has been initiated.");

        View theView = inflater.inflate(R.layout.fragment_fragment_button_handling, container, false);

        _textViewClickCount = theView.findViewById(R.id.textViewClickCount);

        FrameLayout layout = theView.findViewById(R.id.buttonHandlingFrame);
        List<View> childViews = new ArrayList<View>();
        for (int count = 0; count < layout.getChildCount(); count++) {
            childViews.add(layout.getChildAt(count));
            LogHelper.LogThreadId(logName, "Button Handling Fragment : Control No : " + count++ + " : " + layout.getChildAt(count));
        }


        Button button = theView.findViewById(R.id.buttonPushMe);
        button.setOnClickListener(this);

        return theView;
    }

    private void initiateCount(View view) {
        _clickCount++;

        StringBuilder countMessage = new StringBuilder("Clicked Count : ");
        countMessage.append(_clickCount);

        _textViewClickCount.setText(countMessage);
    }

    @Override
    public void onClick(View v) {
        initiateCount(v);
    }
}
