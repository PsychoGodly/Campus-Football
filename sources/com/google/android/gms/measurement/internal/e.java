package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24489a = false;

    e(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
