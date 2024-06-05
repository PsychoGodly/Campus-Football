package com.onesignal;

import android.content.Context;
import kotlin.jvm.internal.m;

/* compiled from: OSNotificationOpenAppSettings.kt */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public static final d2 f27648a = new d2();

    private d2() {
    }

    public final boolean a(Context context) {
        m.e(context, "context");
        return !m.a("DISABLE", OSUtils.f(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean b(Context context) {
        m.e(context, "context");
        return OSUtils.g(context, "com.onesignal.suppressLaunchURLs");
    }
}
