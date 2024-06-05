package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.d;
import d7.i1;
import d7.v1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaak  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaak extends zzacx<d, i1> {
    private final String zzy;
    private final String zzz;

    public zzaak(String str, String str2) {
        super(4);
        q.h(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzd(this.zzy, this.zzz, this.zzb);
    }

    public final void zzb() {
        zzb(new v1(this.zzm));
    }
}
