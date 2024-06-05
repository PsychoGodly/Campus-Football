package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgl {
    private int zza;

    public final void zza(int i10) {
        this.zza |= RecyclerView.UNDEFINED_DURATION;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i10) {
        this.zza = i10;
    }

    /* access modifiers changed from: protected */
    public final boolean zzd(int i10) {
        return (this.zza & i10) == i10;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean zzg() {
        return zzd(4);
    }

    public final boolean zzh() {
        return zzd(1);
    }
}
