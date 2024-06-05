package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class zzadg implements Runnable {
    private /* synthetic */ zzadh zza;
    private /* synthetic */ zzadj zzb;
    private /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzadg(zzadh zzadh, zzadj zzadj, TaskCompletionSource taskCompletionSource) {
        this.zza = zzadh;
        this.zzb = zzadj;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zza(this.zzc, this.zza.zza);
    }
}
