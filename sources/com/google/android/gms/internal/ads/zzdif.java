package com.google.android.gms.internal.ads;

import androidx.collection.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdif implements zzcvi {
    private final zzdgi zza;
    private final zzdgn zzb;

    public zzdif(zzdgi zzdgi, zzdgn zzdgn) {
        this.zza = zzdgi;
        this.zzb = zzdgn;
    }

    public final void zzl() {
        zzdgi zzdgi = this.zza;
        if (zzdgi.zzu() != null) {
            zzcei zzq = zzdgi.zzq();
            zzcei zzr = zzdgi.zzr();
            if (zzq == null) {
                zzq = zzr == null ? null : zzr;
            }
            if (this.zzb.zzd() && zzq != null) {
                zzq.zzd("onSdkImpression", new a());
            }
        }
    }
}
