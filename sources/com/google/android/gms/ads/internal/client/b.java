package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class b extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f14417b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f14418c;

    b(v vVar, Activity activity) {
        this.f14418c = vVar;
        this.f14417b = activity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14417b, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.zzm(com.google.android.gms.dynamic.b.B1(this.f14417b));
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbar.zzc(this.f14417b);
        if (!((Boolean) a0.c().zzb(zzbar.zzjb)).booleanValue()) {
            return this.f14418c.f14580f.zza(this.f14417b);
        }
        try {
            return zzbrb.zzF(((zzbrf) zzbze.zzb(this.f14417b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", i5.f14478a)).zze(com.google.android.gms.dynamic.b.B1(this.f14417b)));
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            this.f14418c.f14582h = zzbsf.zza(this.f14417b.getApplicationContext());
            this.f14418c.f14582h.zzf(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
