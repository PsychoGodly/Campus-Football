package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyo implements zzadk<zzagz> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    zzyo(zzyj zzyj, zzacd zzacd) {
        this.zzb = zzyj;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagz zzagz = (zzagz) obj;
        if (zzagz.zzf()) {
            this.zza.zza(new zzyk(zzagz.zzc(), zzagz.zze(), (d2) null));
            return;
        }
        this.zzb.zza(new zzafn(zzagz.zzd(), zzagz.zzb(), Long.valueOf(zzagz.zza()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (d2) null, this.zza, this);
    }
}
