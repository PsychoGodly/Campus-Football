package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Map;
import r7.r1;
import r7.s1;
import v7.c;
import v7.f;
import v7.m;
import y7.x;

/* compiled from: WriteBatch */
public class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f26492a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f> f26493b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f26494c = false;

    i1(FirebaseFirestore firebaseFirestore) {
        this.f26492a = (FirebaseFirestore) x.b(firebaseFirestore);
    }

    private i1 f(m mVar, s1 s1Var) {
        this.f26492a.N(mVar);
        g();
        this.f26493b.add(s1Var.a(mVar.l(), m.a(true)));
        return this;
    }

    private void g() {
        if (this.f26494c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    public Task<Void> a() {
        g();
        this.f26494c = true;
        if (this.f26493b.size() > 0) {
            return this.f26492a.s().m0(this.f26493b);
        }
        return Tasks.forResult(null);
    }

    public i1 b(m mVar) {
        this.f26492a.N(mVar);
        g();
        this.f26493b.add(new c(mVar.l(), m.f30717c));
        return this;
    }

    public i1 c(m mVar, Object obj) {
        return d(mVar, obj, z0.f26588c);
    }

    public i1 d(m mVar, Object obj, z0 z0Var) {
        r1 r1Var;
        this.f26492a.N(mVar);
        x.c(obj, "Provided data must not be null.");
        x.c(z0Var, "Provided options must not be null.");
        g();
        if (z0Var.b()) {
            r1Var = this.f26492a.w().g(obj, z0Var.a());
        } else {
            r1Var = this.f26492a.w().l(obj);
        }
        this.f26493b.add(r1Var.a(mVar.l(), m.f30717c));
        return this;
    }

    public i1 e(m mVar, Map<String, Object> map) {
        return f(mVar, this.f26492a.w().o(map));
    }
}
