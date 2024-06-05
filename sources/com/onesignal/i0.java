package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.m;

/* compiled from: NavigateToAndroidSettingsForLocation.kt */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f27844a = new i0();

    private i0() {
    }

    public final void a(Context context) {
        m.e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse(m.m("package:", context.getPackageName())));
        context.startActivity(intent);
    }
}
