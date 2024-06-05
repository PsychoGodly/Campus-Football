package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzavy implements c.a {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzavq zza;
    final /* synthetic */ zzbzs zzb;
    final /* synthetic */ zzawa zzc;

    zzavy(zzawa zzawa, zzavq zzavq, zzbzs zzbzs) {
        this.zzc = zzawa;
        this.zza = zzavq;
        this.zzb = zzbzs;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzawa zzawa = this.zzc;
            if (!zzawa.zzb) {
                zzawa.zzb = true;
                zzavp zza2 = this.zzc.zza;
                if (zza2 != null) {
                    zzfut zza3 = zzbzn.zza.zza(new zzavv(this, zza2, this.zza, this.zzb));
                    zzbzs zzbzs = this.zzb;
                    zzbzs.zzc(new zzavw(zzbzs, zza3), zzbzn.zzf);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i10) {
    }
}
