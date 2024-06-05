package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzd implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    final /* synthetic */ zzyj zzb;
    private final /* synthetic */ zzagt zzc;

    zzzd(zzyj zzyj, zzagt zzagt, zzacd zzacd) {
        this.zzb = zzyj;
        this.zzc = zzagt;
        this.zza = zzacd;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        this.zzc.zzb(true);
        this.zzc.zza(((zzafn) obj).zzc());
        this.zzb.zza.zza(this.zzc, (zzadk<zzagv>) new zzzg(this, this));
    }
}
