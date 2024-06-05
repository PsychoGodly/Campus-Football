package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.j;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyn implements zzadk<zzafn> {
    private final /* synthetic */ j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacd zzc;
    private final /* synthetic */ zzyj zzd;

    zzyn(zzyj zzyj, j jVar, String str, zzacd zzacd) {
        this.zzd = zzyj;
        this.zza = jVar;
        this.zzb = str;
        this.zzc = zzacd;
    }

    public final void zza(String str) {
        this.zzc.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        this.zzd.zza(new zzaep(this.zza, ((zzafn) obj).zzc(), this.zzb), this.zzc);
    }
}
