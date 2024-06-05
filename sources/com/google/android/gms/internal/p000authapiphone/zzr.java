package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzr extends a.C0154a<zzv, a.d.c> {
    zzr() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, e eVar, m mVar) {
        a.d.c cVar = (a.d.c) obj;
        return new zzv(context, looper, dVar, eVar, mVar);
    }
}
