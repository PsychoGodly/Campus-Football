package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcrg implements t {
    private final zzcvv zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcrg(zzcvv zzcvv) {
        this.zza = zzcvv;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    public final void zzb() {
        this.zza.zzc();
    }

    public final void zzbF() {
    }

    public final void zzbo() {
    }

    public final void zzby() {
        zzh();
    }

    public final void zze() {
    }

    public final void zzf(int i10) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
