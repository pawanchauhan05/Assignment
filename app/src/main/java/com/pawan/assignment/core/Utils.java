package com.pawan.assignment.core;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by pawan on 13/4/17.
 */

public class Utils {

    public static void generateProgressDialog(String title, String message, ProgressDialog progressDialog) {
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.show();
        progressDialog.setCancelable(true);
    }

    public static void hideProgressBar(ProgressDialog progressDialog) {
        try {
            if (progressDialog != null)
                progressDialog.cancel();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
