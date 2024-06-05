package com.startapp;

import android.text.TextUtils;

/* compiled from: Sta */
public class fc {
    public static void a(eb ebVar) {
        if (!ebVar.f15796f) {
            throw new IllegalStateException("AdSession is not started");
        } else if (ebVar.f15797g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void b(eb ebVar) {
        if (ebVar.f15797g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(eb ebVar) {
        if (!ebVar.d()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
