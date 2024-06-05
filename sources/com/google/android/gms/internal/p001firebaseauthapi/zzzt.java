package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzt implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzu zzc;

    zzzt(zzzu zzzu, zzadk zzadk, zzafn zzafn) {
        this.zzc = zzzu;
        this.zza = zzadk;
        this.zzb = zzafn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzafc> zza2 = ((zzafd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zza(this.zzb, zza2.get(0));
        }
    }
}
