package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f15408a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15409b;

    public i(String str) {
        this(str, (String) null);
    }

    private final String f(String str) {
        String str2 = this.f15409b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f15408a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }

    public i(String str, String str2) {
        q.l(str, "log tag cannot be null");
        q.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15408a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f15409b = null;
        } else {
            this.f15409b = str2;
        }
    }
}
