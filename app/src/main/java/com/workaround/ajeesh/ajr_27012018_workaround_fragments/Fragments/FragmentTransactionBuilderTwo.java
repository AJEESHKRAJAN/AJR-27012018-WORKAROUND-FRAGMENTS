package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.R;


public class FragmentTransactionBuilderTwo extends Fragment {
    String logName = "WWF-FRG-TRAN-BLD2";

    public FragmentTransactionBuilderTwo() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two has been initiated.");
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : Creating the fragment.");
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onCreateView");
        return inflater.inflate(R.layout.fragment_fragment_transaction_builder_two, container, false);
    }


    @Override
    public void onAttach(Context context) {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onAttach");

        super.onAttach(context);

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onActivityCreated");

        super.onActivityCreated(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStart() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onStart");

        super.onStart();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStop() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onStop");

        super.onStop();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onPause() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onPause");

        super.onPause();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onResume() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onResume");

        super.onResume();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroyView() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onDestroyView");

        super.onDestroyView();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroy() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onDestroy");

        super.onDestroy();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDetach() {
        LogHelper.LogThreadId(logName, "Transaction Builder Two : onDetach");

        super.onDetach();    //To change body of overridden methods use File | Settings | File Templates.
    }

}
