package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzq implements zzadk<zzaes> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzzq(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaes zzaes = (zzaes) obj;
        this.zzb.zza(new zzafn(zzaes.zzb(), zzaes.zza(), Long.valueOf(zzafp.zza(zzaes.zza())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (d2) null, this.zza, this);
    }
}
