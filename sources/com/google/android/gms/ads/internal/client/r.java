package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class r extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14533b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f14534c;

    r(v vVar, Context context) {
        this.f14534c = vVar;
        this.f14533b = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14533b, "mobile_ads_settings");
        return new b4();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.zzg(b.B1(this.f14533b), ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbar.zzc(this.f14533b);
        if (!((Boolean) a0.c().zzb(zzbar.zzjb)).booleanValue()) {
            return this.f14534c.f14577c.a(this.f14533b);
        }
        try {
            IBinder M0 = ((q1) zzbze.zzb(this.f14533b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", q.f14527a)).M0(b.B1(this.f14533b), ModuleDescriptor.MODULE_VERSION);
            if (M0 == null) {
                return null;
            }
            IInterface queryLocalInterface = M0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(M0);
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            this.f14534c.f14582h = zzbsf.zza(this.f14533b);
            this.f14534c.f14582h.zzf(e10, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
