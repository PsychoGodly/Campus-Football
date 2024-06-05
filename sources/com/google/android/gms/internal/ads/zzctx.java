package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzctx {
    /* access modifiers changed from: private */
    public Context zza;
    /* access modifiers changed from: private */
    public zzeyx zzb;
    /* access modifiers changed from: private */
    public Bundle zzc;
    /* access modifiers changed from: private */
    public zzeyp zzd;
    /* access modifiers changed from: private */
    public zzctr zze;

    public final zzctx zzd(Context context) {
        this.zza = context;
        return this;
    }

    public final zzctx zze(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzctx zzf(zzctr zzctr) {
        this.zze = zzctr;
        return this;
    }

    public final zzctx zzg(zzeyp zzeyp) {
        this.zzd = zzeyp;
        return this;
    }

    public final zzctx zzh(zzeyx zzeyx) {
        this.zzb = zzeyx;
        return this;
    }

    public final zzctz zzi() {
        return new zzctz(this, (zzcty) null);
    }
}
