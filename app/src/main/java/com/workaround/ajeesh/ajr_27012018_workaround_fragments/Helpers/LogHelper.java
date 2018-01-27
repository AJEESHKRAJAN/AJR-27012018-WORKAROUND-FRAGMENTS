package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Package Name : com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers
 * Created by ajesh on 27-01-2018.
 * Project Name : AJR-27012018-WORKAROUND-FRAGMENTS
 */

public class LogHelper {
    public static void LogThreadId(String logName, String message) {
        long processId = android.os.Process.myPid();
        long threadId = Thread.currentThread().getId();
        Log.d(logName, String.format(Locale.US, "[ Process: %d | Thread: %d | Processed Time : %s] %s",
                processId, threadId, getDateTime(), message));
    }

    private static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        Date date = new Date();
        return dateFormat.format(date);
    }
}
