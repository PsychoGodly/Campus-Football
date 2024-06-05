package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import com.google.firebase.auth.j0;
import d7.i0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzyk {
    private String zza;
    private List<zzafr> zzb;
    private d2 zzc;

    public zzyk(String str, List<zzafr> list, d2 d2Var) {
        this.zza = str;
        this.zzb = list;
        this.zzc = d2Var;
    }

    public final d2 zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<j0> zzc() {
        return i0.b(this.zzb);
    }
}
