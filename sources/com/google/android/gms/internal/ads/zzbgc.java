package com.google.android.gms.internal.ads;

import q4.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbgc {
    /* access modifiers changed from: private */
    public final f.c zza;
    /* access modifiers changed from: private */
    public final f.b zzb;
    private f zzc;

    public zzbgc(f.c cVar, f.b bVar) {
        this.zza = cVar;
        this.zzb = bVar;
    }

    /* access modifiers changed from: private */
    public final synchronized f zzf(zzber zzber) {
        f fVar = this.zzc;
        if (fVar != null) {
            return fVar;
        }
        zzbes zzbes = new zzbes(zzber);
        this.zzc = zzbes;
        return zzbes;
    }

    public final zzbfb zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbfz(this, (zzbfy) null);
    }

    public final zzbfe zze() {
        return new zzbgb(this, (zzbga) null);
    }
}
