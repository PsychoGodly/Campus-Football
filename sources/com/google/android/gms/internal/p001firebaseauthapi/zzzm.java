package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzm implements zzadk<zzagv> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzzm(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagv zzagv = (zzagv) obj;
        if (!zzagv.zzl()) {
            zzyj.zza(this.zzb, zzagv, this.zza, (zzadl) this);
        } else {
            this.zza.zza(new zzyk(zzagv.zzf(), zzagv.zzk(), zzagv.zzb()));
        }
    }
}
