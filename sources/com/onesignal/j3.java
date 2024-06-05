package com.onesignal;

import android.content.Context;
import androidx.work.b;
import androidx.work.z;
import k1.i;
import kotlin.jvm.internal.m;

/* compiled from: OSWorkManagerHelper.kt */
public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public static final j3 f27881a = new j3();

    private j3() {
    }

    public static final synchronized z a(Context context) {
        z g10;
        synchronized (j3.class) {
            m.e(context, "context");
            if (!f27881a.b()) {
                z.h(context, new b.C0091b().a());
            }
            g10 = z.g(context);
            m.d(g10, "getInstance(context)");
        }
        return g10;
    }

    private final boolean b() {
        return i.l() != null;
    }
}
