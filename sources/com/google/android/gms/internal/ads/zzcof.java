package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcof extends zzaux {
    private final zzcoe zza;
    private final u0 zzb;
    private final zzeua zzc;
    private boolean zzd = false;

    public zzcof(zzcoe zzcoe, u0 u0Var, zzeua zzeua) {
        this.zza = zzcoe;
        this.zzb = u0Var;
        this.zzc = zzeua;
    }

    public final u0 zze() {
        return this.zzb;
    }

    public final p2 zzf() {
        if (!((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    public final void zzh(i2 i2Var) {
        q.f("setOnPaidEventListener must be called on the main UI thread.");
        zzeua zzeua = this.zzc;
        if (zzeua != null) {
            zzeua.zzo(i2Var);
        }
    }

    public final void zzi(a aVar, zzavf zzavf) {
        try {
            this.zzc.zzq(zzavf);
            this.zza.zzd((Activity) b.A1(aVar), zzavf, this.zzd);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
