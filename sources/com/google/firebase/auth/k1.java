package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class k1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f26263a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a0 f26264b;

    k1(a0 a0Var, e eVar) {
        this.f26264b = a0Var;
        this.f26263a = eVar;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f26264b.l0()).L(this.f26263a, (String) q.k(((c0) task.getResult()).g()));
    }
}
