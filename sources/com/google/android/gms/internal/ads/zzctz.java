package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzctz {
    private final Context zza;
    private final zzeyx zzb;
    private final Bundle zzc;
    private final zzeyp zzd;
    private final zzctr zze;

    /* synthetic */ zzctz(zzctx zzctx, zzcty zzcty) {
        this.zza = zzctx.zza;
        this.zzb = zzctx.zzb;
        this.zzc = zzctx.zzc;
        this.zzd = zzctx.zzd;
        this.zze = zzctx.zze;
    }

    /* access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzctr zzc() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final zzctx zzd() {
        zzctx zzctx = new zzctx();
        zzctx.zzd(this.zza);
        zzctx.zzh(this.zzb);
        zzctx.zze(this.zzc);
        zzctx.zzf(this.zze);
        return zzctx;
    }

    /* access modifiers changed from: package-private */
    public final zzeyp zze() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzeyx zzf() {
        return this.zzb;
    }
}
