package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaae implements zzadk<zzafn> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    zzaae(zzyj zzyj, String str, zzacd zzacd) {
        this.zzc = zzyj;
        this.zza = str;
        this.zzb = zzacd;
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzafn zzafn = (zzafn) obj;
        String zzc2 = zzafn.zzc();
        zzagc zzagc = new zzagc();
        zzagc.zzd(zzc2).zzf(this.zza);
        zzyj.zza(this.zzc, this.zzb, zzafn, zzagc, (zzadl) this);
    }
}
