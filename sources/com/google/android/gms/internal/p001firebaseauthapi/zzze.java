package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.o0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzze implements zzadk<zzahb> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzzb zzb;

    zzze(zzzb zzzb, zzadk zzadk) {
        this.zzb = zzzb;
        this.zza = zzadk;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahb zzahb = (zzahb) obj;
        if (!TextUtils.isEmpty(zzahb.zze())) {
            this.zzb.zza.zza(new Status(17025), o0.C(zzahb.zzc(), zzahb.zze()));
            return;
        }
        this.zzb.zzb.zza(new zzafn(zzahb.zzd(), zzahb.zzb(), Long.valueOf(zzahb.zza()), "Bearer"), (String) null, "phone", Boolean.valueOf(zzahb.zzf()), (d2) null, this.zzb.zza, this.zza);
    }
}
