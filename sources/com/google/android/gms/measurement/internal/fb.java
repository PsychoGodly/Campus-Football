package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class fb {

    /* renamed from: a  reason: collision with root package name */
    final Context f24592a;

    public fb(Context context) {
        q.k(context);
        Context applicationContext = context.getApplicationContext();
        q.k(applicationContext);
        this.f24592a = applicationContext;
    }
}
