package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqp {
    /* access modifiers changed from: private */
    public final d.c zza;
    /* access modifiers changed from: private */
    public final d.b zzb;
    private d zzc;

    public zzbqp(d.c cVar, d.b bVar) {
        this.zza = cVar;
        this.zzb = bVar;
    }

    /* access modifiers changed from: private */
    public final synchronized d zzf(zzber zzber) {
        d dVar = this.zzc;
        if (dVar != null) {
            return dVar;
        }
        zzbqq zzbqq = new zzbqq(zzber);
        this.zzc = zzbqq;
        return zzbqq;
    }

    public final zzbfb zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbqm(this, (zzbql) null);
    }

    public final zzbfe zzb() {
        return new zzbqo(this, (zzbqn) null);
    }
}
