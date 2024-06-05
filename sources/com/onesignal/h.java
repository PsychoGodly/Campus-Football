package com.onesignal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;

/* compiled from: AndroidSupportV4Compat */
class h {
    static int a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    static int b(Context context, int i10) {
        if (Build.VERSION.SDK_INT > 22) {
            return context.getColor(i10);
        }
        return context.getResources().getColor(i10);
    }
}
