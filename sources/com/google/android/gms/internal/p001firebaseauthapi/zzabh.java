package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabh extends zzacx<Void, i1> {
    private final zzyc zzy;
    private final String zzz;

    public zzabh(String str, e eVar, String str2, String str3, String str4) {
        super(4);
        q.h(str, "email cannot be null or empty");
        this.zzy = new zzyc(str, eVar, str2, str3);
        this.zzz = str4;
    }

    public final String zza() {
        return this.zzz;
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }
}
