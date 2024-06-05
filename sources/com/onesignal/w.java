package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* compiled from: GenerateNotificationOpenIntent.kt */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28295a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f28296b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28297c;

    public w(Context context, Intent intent, boolean z10) {
        m.e(context, "context");
        this.f28295a = context;
        this.f28296b = intent;
        this.f28297c = z10;
    }

    private final Intent a() {
        Intent launchIntentForPackage;
        if (!this.f28297c || (launchIntentForPackage = this.f28295a.getPackageManager().getLaunchIntentForPackage(this.f28295a.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent b() {
        Intent intent = this.f28296b;
        if (intent != null) {
            return intent;
        }
        return a();
    }
}
