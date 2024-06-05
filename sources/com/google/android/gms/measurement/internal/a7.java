package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class a7 {

    /* renamed from: a  reason: collision with root package name */
    final Context f24359a;

    /* renamed from: b  reason: collision with root package name */
    String f24360b;

    /* renamed from: c  reason: collision with root package name */
    String f24361c;

    /* renamed from: d  reason: collision with root package name */
    String f24362d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f24363e;

    /* renamed from: f  reason: collision with root package name */
    long f24364f;

    /* renamed from: g  reason: collision with root package name */
    zzdd f24365g;

    /* renamed from: h  reason: collision with root package name */
    boolean f24366h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f24367i;

    /* renamed from: j  reason: collision with root package name */
    String f24368j;

    public a7(Context context, zzdd zzdd, Long l10) {
        q.k(context);
        Context applicationContext = context.getApplicationContext();
        q.k(applicationContext);
        this.f24359a = applicationContext;
        this.f24367i = l10;
        if (zzdd != null) {
            this.f24365g = zzdd;
            this.f24360b = zzdd.zzf;
            this.f24361c = zzdd.zze;
            this.f24362d = zzdd.zzd;
            this.f24366h = zzdd.zzc;
            this.f24364f = zzdd.zzb;
            this.f24368j = zzdd.zzh;
            Bundle bundle = zzdd.zzg;
            if (bundle != null) {
                this.f24363e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
