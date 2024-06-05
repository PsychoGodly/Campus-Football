package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaaa implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzaaa(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagh zzagh = (zzagh) obj;
        this.zzb.zza(new zzafn(zzagh.zzc(), zzagh.zzb(), Long.valueOf(zzagh.zza()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (d2) null, this.zza, this);
    }
}
