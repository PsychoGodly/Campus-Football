package com.google.android.gms.internal.p001firebaseauthapi;

import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzl implements zzadk<zzagj> {
    private final /* synthetic */ zzagg zza;
    private final /* synthetic */ zzacd zzb;

    zzzl(zzyj zzyj, zzagg zzagg, zzacd zzacd) {
        this.zza = zzagg;
        this.zzb = zzacd;
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagj zzagj = (zzagj) obj;
        zzagg zzagg = this.zza;
        if (zzagg instanceof zzagk) {
            this.zzb.zzb(zzagj.zza());
        } else if (zzagg instanceof zzagm) {
            this.zzb.zza(zzagj);
        } else {
            String name = this.zza.getClass().getName();
            throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + name + ".");
        }
    }
}
