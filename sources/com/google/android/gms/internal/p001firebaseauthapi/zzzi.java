package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzi implements zzadk<zzafn> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzacd zzb;
    final /* synthetic */ zzyj zzc;

    zzzi(zzyj zzyj, String str, zzacd zzacd) {
        this.zzc = zzyj;
        this.zza = str;
        this.zzb = zzacd;
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzafn zzafn = (zzafn) obj;
        this.zzc.zza.zza(new zzafa(zzafn.zzc()), (zzadk<zzafd>) new zzzh(this, this, zzafn));
    }
}
