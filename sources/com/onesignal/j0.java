package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import kotlin.jvm.internal.m;

/* compiled from: NavigateToAndroidSettingsForNotifications.kt */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f27863a = new j0();

    private j0() {
    }

    public final void a(Context context) {
        m.e(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        ApplicationInfo a10 = j.f27861a.a(context);
        if (a10 != null) {
            intent.putExtra("app_uid", a10.uid);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
