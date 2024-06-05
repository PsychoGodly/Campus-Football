package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzade  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzade<ResultT, CallbackT> implements zzacv<ResultT> {
    private final zzacx<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzade(zzacx<ResultT, CallbackT> zzacx, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacx;
        this.zzb = taskCompletionSource;
    }

    public final void zza(ResultT resultt, Status status) {
        a0 a0Var;
        q.l(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzacx<ResultT, CallbackT> zzacx = this.zza;
            if (zzacx.zzs != null) {
                TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzacx.zzc);
                zzacx<ResultT, CallbackT> zzacx2 = this.zza;
                zzyk zzyk = zzacx2.zzs;
                if ("reauthenticateWithCredential".equals(zzacx2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    a0Var = this.zza.zzd;
                } else {
                    a0Var = null;
                }
                taskCompletionSource.setException(zzacf.zza(instance, zzyk, a0Var));
                return;
            }
            h hVar = zzacx.zzp;
            if (hVar != null) {
                this.zzb.setException(zzacf.zza(status, hVar, zzacx.zzq, zzacx.zzr));
            } else {
                this.zzb.setException(zzacf.zza(status));
            }
        } else {
            this.zzb.setResult(resultt);
        }
    }
}
