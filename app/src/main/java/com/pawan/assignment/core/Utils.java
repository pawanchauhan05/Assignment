package com.pawan.assignment.core;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by pawan on 13/4/17.
 */

public class Utils {

    /**
     * to generate progress dialog
     * @param title - progress dialog title
     * @param message - progress dialog title
     * @param progressDialog - progress dialog instance
     */
    public static void generateProgressDialog(String title, String message, ProgressDialog progressDialog) {
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.show();
        progressDialog.setCancelable(true);
    }

    /**
     * to hide Progress Dialog
     * @param progressDialog
     */
    public static void hideProgressDialog(ProgressDialog progressDialog) {
        try {
            if (progressDialog != null)
                progressDialog.cancel();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
