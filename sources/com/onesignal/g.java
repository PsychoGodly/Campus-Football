package com.onesignal;

import android.app.Activity;
import androidx.core.app.b;

/* compiled from: AndroidSupportV4Compat */
class g {
    static void a(Activity activity, String[] strArr, int i10) {
        if (activity instanceof i) {
            ((i) activity).validateRequestPermissionsRequestCode(i10);
        }
        activity.requestPermissions(strArr, i10);
    }

    static boolean b(Activity activity, String str) {
        return b.j(activity, str);
    }
}
