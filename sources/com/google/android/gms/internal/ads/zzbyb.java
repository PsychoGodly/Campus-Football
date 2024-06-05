package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbyb {
    final /* synthetic */ zzbyc zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbyb(zzbyc zzbyc) {
        this.zza = zzbyc;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        this.zzc = this.zza.zza.b();
    }

    public final void zzd() {
        this.zzb = this.zza.zza.b();
    }
}
