package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.c0;
import d7.h0;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaap  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaap extends zzacx<c0, i1> {
    private final String zzy;

    public zzaap(String str) {
        super(1);
        q.h(str, "refresh token cannot be null");
        this.zzy = str;
    }

    public final String zza() {
        return "getAccessToken";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzb(this.zzy, this.zzb);
    }

    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((i1) this.zze).a(this.zzj, this.zzd);
        zzb(h0.a(this.zzj.zzc()));
    }
}
