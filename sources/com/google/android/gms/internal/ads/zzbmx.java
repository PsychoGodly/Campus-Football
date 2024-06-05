package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.b;
import q5.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzbmx implements Runnable {
    public final /* synthetic */ zzbmy zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbmx(zzbmy zzbmy, Context context, String str) {
        this.zza = zzbmy;
        this.zzb = context;
        this.zzc = str;
    }

    public final void run() {
        Context context = this.zzb;
        String str = this.zzc;
        zzbar.zzc(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) a0.c().zzb(zzbar.zzaf)).booleanValue());
        if (((Boolean) a0.c().zzb(zzbar.zzam)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzcgc) zzbze.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbmw.zza)).zze(b.B1(context), new zzbmv(a.k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
