package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdqx implements zzdqh {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final zzdqm zzb;
    private final zzext zzc;

    zzdqx(long j10, Context context, zzdqm zzdqm, zzcgd zzcgd, String str) {
        this.zza = j10;
        this.zzb = zzdqm;
        zzexv zzu = zzcgd.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzc = zzu.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(u4 u4Var) {
        try {
            this.zzc.zzf(u4Var, new zzdqv(this));
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzc() {
        try {
            this.zzc.zzk(new zzdqw(this));
            this.zzc.zzm(b.B1(null));
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
