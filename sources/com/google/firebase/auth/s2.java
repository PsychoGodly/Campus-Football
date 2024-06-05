package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagj;
import com.google.android.gms.internal.p001firebaseauthapi.zzagp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d7.z0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class s2 implements Continuation<zzagj, Task<z0>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26325a;

    s2(FirebaseAuth firebaseAuth) {
        this.f26325a = firebaseAuth;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) q.k(task.getException()));
        }
        zzagj zzagj = (zzagj) task.getResult();
        if (zzagj instanceof zzagp) {
            zzagp zzagp = (zzagp) zzagj;
            return Tasks.forResult(new z0(q.g(zzagp.zzf()), q.g(zzagp.zze()), zzagp.zzc(), zzagp.zzb(), zzagp.zzd(), q.g(zzagp.zza()), this.f26325a));
        }
        String name = zzagj.getClass().getName();
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + name + ".");
    }
}
