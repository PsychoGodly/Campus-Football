package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzh implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzi zzc;

    zzzh(zzzi zzzi, zzadk zzadk, zzafn zzafn) {
        this.zzc = zzzi;
        this.zza = zzadk;
        this.zzb = zzafn;
    }

    public final void zza(String str) {
        this.zzc.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzafc> zza2 = ((zzafd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzagc zzagc = new zzagc();
        zzagc.zzd(this.zzb.zzc()).zza(this.zzc.zza);
        zzzi zzzi = this.zzc;
        zzyj.zza(zzzi.zzc, zzzi.zzb, this.zzb, zza2.get(0), zzagc, (zzadl) this.zza);
    }
}
