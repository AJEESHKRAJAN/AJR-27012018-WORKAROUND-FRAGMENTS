package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

public class FragmentWebViewType extends WebViewFragment {
    private final String logName = "WWF-FRG-WEBTYP";

    public FragmentWebViewType() {
        LogHelper.LogThreadId(logName, "Fragment Web view type has been initiated.");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final String htmlText =
                "<html>\n" + "<body>\n" + "<h1 style=\"color: #5e9ca0;\">This is&nbsp;<span style=\"color: #2b2301;\">Web View</span>&nbsp;Fragment!</h1><p><strong>&nbsp;</strong></p>\n" + "\n" + "</body>\n" + "</html>";
        LogHelper.LogThreadId(logName, "Fragment Web view : Given HTML content :\n" + htmlText);
        WebView webView = getWebView();
        webView.loadData(htmlText, "text/html", null);
    }
}
