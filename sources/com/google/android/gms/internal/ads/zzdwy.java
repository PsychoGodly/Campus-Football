package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdwy extends zzbtf {
    final /* synthetic */ zzdwz zza;

    protected zzdwy(zzdwz zzdwz) {
        this.zza = zzdwz;
    }

    public final void zze(a0 a0Var) {
        this.zza.zza.zze(a0Var.v());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
