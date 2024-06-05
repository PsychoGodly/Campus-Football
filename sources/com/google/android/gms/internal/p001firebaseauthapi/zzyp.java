package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyp implements zzadk<zzafd> {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzafn zzc;
    private final /* synthetic */ zzagc zzd;
    private final /* synthetic */ zzyj zze;

    zzyp(zzyj zzyj, zzadl zzadl, zzacd zzacd, zzafn zzafn, zzagc zzagc) {
        this.zze = zzyj;
        this.zza = zzadl;
        this.zzb = zzacd;
        this.zzc = zzafn;
        this.zzd = zzagc;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzafc> zza2 = ((zzafd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzyj.zza(this.zze, this.zzb, this.zzc, zza2.get(0), this.zzd, this.zza);
        }
    }
}
