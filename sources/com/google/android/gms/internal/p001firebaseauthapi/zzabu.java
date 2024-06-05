package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabu extends zzacx<Void, i1> {
    private final String zzaa;
    private final String zzy;
    private final String zzz;

    public zzabu(String str, String str2, String str3) {
        super(2);
        this.zzy = q.g(str);
        this.zzz = q.g(str2);
        this.zzaa = str3;
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, this.zzz, this.zzaa, (zzace) this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
