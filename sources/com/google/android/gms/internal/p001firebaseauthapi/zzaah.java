package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaah extends zzacx<Void, i1> {
    private final String zzy;
    private final String zzz;

    public zzaah(String str, String str2) {
        super(7);
        q.h(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "applyActionCode";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, this.zzz, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
