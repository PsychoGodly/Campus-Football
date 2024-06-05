package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzza  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzza implements zzadk<zzahb> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzza(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahb zzahb = (zzahb) obj;
        this.zzb.zza(new zzafn(zzahb.zzd(), zzahb.zzb(), Long.valueOf(zzahb.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzahb.zzf()), (d2) null, this.zza, this);
    }
}
