package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.v0;
import d7.i1;
import d7.p;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaao  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaao extends zzacx<v0, i1> {
    private final String zzy;
    private final String zzz;

    public zzaao(String str, String str2) {
        super(3);
        q.h(str, "email cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zze(this.zzy, this.zzz, this.zzb);
    }

    public final void zzb() {
        List list;
        if (this.zzl.zza() == null) {
            list = zzap.zzh();
        } else {
            list = (List) q.k(this.zzl.zza());
        }
        zzb(new p(list));
    }
}
