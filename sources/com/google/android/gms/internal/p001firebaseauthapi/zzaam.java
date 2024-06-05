package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaam extends zzacx<i, i1> {
    private final String zzaa;
    private final String zzab;
    private final String zzy;
    private final String zzz;

    public zzaam(String str, String str2, String str3, String str4) {
        super(2);
        q.h(str, "email cannot be null or empty");
        q.h(str2, "password cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
        this.zzaa = str3;
        this.zzab = str4;
    }

    public final String zza() {
        return "createUserWithEmailAndPassword";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, this.zzz, this.zzaa, this.zzab, (zzace) this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
