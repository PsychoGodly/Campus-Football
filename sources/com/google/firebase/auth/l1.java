package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class l1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a0 f26269a;

    l1(a0 a0Var) {
        this.f26269a = a0Var;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f26269a.l0()).L((e) null, (String) q.k(((c0) task.getResult()).g()));
    }
}
