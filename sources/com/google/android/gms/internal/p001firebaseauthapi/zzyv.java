package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyv implements zzadk<zzagx> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzyv(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagx zzagx = (zzagx) obj;
        this.zzb.zza(new zzafn(zzagx.zzc(), zzagx.zzb(), Long.valueOf(zzagx.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzagx.zzd()), (d2) null, this.zza, this);
    }
}
