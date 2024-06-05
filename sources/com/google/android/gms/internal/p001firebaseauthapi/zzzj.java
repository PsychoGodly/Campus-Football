package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.d2;
import d7.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzj implements zzadk<zzahd> {
    private final /* synthetic */ zzzk zza;

    zzzj(zzzk zzzk) {
        this.zza = zzzk;
    }

    public final void zza(String str) {
        this.zza.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahd zzahd = (zzahd) obj;
        if (TextUtils.isEmpty(zzahd.zza()) || TextUtils.isEmpty(zzahd.zzb())) {
            this.zza.zza.zza(q.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzafn zzafn = new zzafn(zzahd.zzb(), zzahd.zza(), Long.valueOf(zzafp.zza(zzahd.zza())), "Bearer");
        zzzk zzzk = this.zza;
        zzzk.zzb.zza(zzafn, (String) null, (String) null, Boolean.FALSE, (d2) null, zzzk.zza, this);
    }
}
