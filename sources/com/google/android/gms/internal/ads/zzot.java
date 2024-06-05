package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzot {
    final zzos zza = zzos.zza;
    /* access modifiers changed from: private */
    public zznq zzb = zznq.zza;
    /* access modifiers changed from: private */
    public zzov zzc;

    public final zzot zzb(zznq zznq) {
        this.zzb = zznq;
        return this;
    }

    public final zzot zzc(zzde[] zzdeArr) {
        this.zzc = new zzov(zzdeArr);
        return this;
    }

    public final zzpf zzd() {
        if (this.zzc == null) {
            this.zzc = new zzov(new zzde[0]);
        }
        return new zzpf(this, (zzpe) null);
    }
}
