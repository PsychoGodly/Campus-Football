package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzn implements zzadk<zzaeq> {
    private final /* synthetic */ zzzo zza;

    zzzn(zzzo zzzo) {
        this.zza = zzzo;
    }

    public final void zza(String str) {
        this.zza.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaeq zzaeq = (zzaeq) obj;
        zzafn zzafn = new zzafn(zzaeq.zzb(), zzaeq.zza(), Long.valueOf(zzafp.zza(zzaeq.zza())), "Bearer");
        zzzo zzzo = this.zza;
        zzzo.zzb.zza(zzafn, (String) null, (String) null, Boolean.FALSE, (d2) null, zzzo.zza, this);
    }
}
