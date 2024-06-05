package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d1;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaac implements zzadk<zzafn> {
    private final /* synthetic */ d1 zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    zzaac(zzyj zzyj, d1 d1Var, zzacd zzacd) {
        this.zzc = zzyj;
        this.zza = d1Var;
        this.zzb = zzacd;
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzafn zzafn = (zzafn) obj;
        zzagc zzagc = new zzagc();
        zzagc.zzd(zzafn.zzc());
        if (this.zza.w() || this.zza.m() != null) {
            zzagc.zzb(this.zza.m());
        }
        if (this.zza.zzc() || this.zza.v() != null) {
            zzagc.zzg(this.zza.zza());
        }
        zzyj.zza(this.zzc, this.zzb, zzafn, zzagc, (zzadl) this);
    }
}
