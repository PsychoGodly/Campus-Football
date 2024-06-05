package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyq implements zzadk<zzaeo> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzyq(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaeo zzaeo = (zzaeo) obj;
        if (zzaeo.zzf()) {
            this.zza.zza(new zzyk(zzaeo.zzc(), zzaeo.zze(), (d2) null));
            return;
        }
        this.zzb.zza(new zzafn(zzaeo.zzd(), zzaeo.zzb(), Long.valueOf(zzaeo.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaeo.zzg()), (d2) null, this.zza, this);
    }
}
