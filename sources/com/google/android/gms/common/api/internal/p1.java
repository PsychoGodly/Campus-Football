package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class p1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f15218a;

    /* renamed from: b  reason: collision with root package name */
    private final o1 f15219b;

    public p1(o1 o1Var) {
        this.f15219b = o1Var;
    }

    public final void a(Context context) {
        this.f15218a = context;
    }

    public final synchronized void b() {
        Context context = this.f15218a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f15218a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f15219b.a();
            b();
        }
    }
}
