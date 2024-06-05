package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzts implements zzuj {
    final /* synthetic */ zztv zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzts(zztv zztv, int i10) {
        this.zza = zztv;
        this.zzb = i10;
    }

    public final int zza(zzjo zzjo, zzgr zzgr, int i10) {
        return this.zza.zzg(this.zzb, zzjo, zzgr, i10);
    }

    public final int zzb(long j10) {
        return this.zza.zzi(this.zzb, j10);
    }

    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
