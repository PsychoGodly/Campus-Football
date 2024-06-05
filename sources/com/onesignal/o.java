package com.onesignal;

import android.os.Build;

/* compiled from: BundleCompat */
class o {
    static m a() {
        if (Build.VERSION.SDK_INT >= 22) {
            return new p();
        }
        return new n();
    }
}
