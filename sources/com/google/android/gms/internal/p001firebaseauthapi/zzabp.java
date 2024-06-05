package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;
import d7.o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabp extends zzacx<Void, i1> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabp(o oVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        q.k(oVar);
        q.g(str);
        this.zzy = q.g(oVar.zzb());
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j10;
        this.zzac = z10;
        this.zzad = z11;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z12;
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }

    public final void zzb() {
    }
}
