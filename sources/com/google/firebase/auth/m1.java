package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class m1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f26272a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f26273b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a0 f26274c;

    m1(a0 a0Var, String str, e eVar) {
        this.f26274c = a0Var;
        this.f26272a = str;
        this.f26273b = eVar;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f26274c.l0()).Y((String) q.k(((c0) task.getResult()).g()), this.f26272a, this.f26273b);
    }
}
