package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
final class zzn extends a.C0154a<zzd, a.d.c> {
    zzn() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, e eVar, m mVar) {
        a.d.c cVar = (a.d.c) obj;
        return new zzd(context, looper, dVar, eVar, mVar);
    }
}
