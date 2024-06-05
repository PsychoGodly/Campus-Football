package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings */
class e {
    static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    static String b(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r.b(locale).format(new Date(j10));
        }
        return r.f(locale).format(new Date(j10));
    }

    static String c(long j10) {
        return d(j10, Locale.getDefault());
    }

    static String d(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r.m(locale).format(new Date(j10));
        }
        return r.f(locale).format(new Date(j10));
    }
}
