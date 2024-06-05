package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbll extends zzbzz {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzblq zzb;
    private boolean zzc;

    public zzbll(zzblq zzblq) {
        this.zzb = zzblq;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (!this.zzc) {
                this.zzc = true;
                zzi(new zzbli(this), new zzbzv());
                zzi(new zzblj(this), new zzblk(this));
            }
        }
    }
}
