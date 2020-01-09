package com.rokan.mychat.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.WindowManager;

/**
 * Created by ibrar on 5/25/2016.
 */
public class DialogControl {

    public static void ShowDialog(Activity activity, Dialog dialog) {
        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
        dialog.show();
        dialog.setCancelable(true);
        dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
    }


}
