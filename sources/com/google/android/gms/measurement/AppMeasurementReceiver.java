package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import n0.a;
import r5.n;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class AppMeasurementReceiver extends a implements n.a {

    /* renamed from: c  reason: collision with root package name */
    private n f24323c;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f24323c == null) {
            this.f24323c = new n(this);
        }
        this.f24323c.a(context, intent);
    }
}
