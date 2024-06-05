package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import r7.j1;
import r7.r1;
import r7.s1;
import u7.s;
import y7.b;
import y7.p;
import y7.x;

/* compiled from: Transaction */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final j1 f26453a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseFirestore f26454b;

    /* compiled from: Transaction */
    public interface a<TResult> {
        TResult a(e1 e1Var) throws z;
    }

    e1(j1 j1Var, FirebaseFirestore firebaseFirestore) {
        this.f26453a = (j1) x.b(j1Var);
        this.f26454b = (FirebaseFirestore) x.b(firebaseFirestore);
    }

    private Task<n> d(m mVar) {
        return this.f26453a.j(Collections.singletonList(mVar.l())).continueWith(p.f31400b, new d1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ n e(Task task) throws Exception {
        if (task.isSuccessful()) {
            List list = (List) task.getResult();
            if (list.size() == 1) {
                s sVar = (s) list.get(0);
                if (sVar.b()) {
                    return n.b(this.f26454b, sVar, false, false);
                }
                if (sVar.g()) {
                    return n.c(this.f26454b, sVar.getKey(), false);
                }
                throw b.a("BatchGetDocumentsRequest returned unexpected document type: " + s.class.getCanonicalName(), new Object[0]);
            }
            throw b.a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        throw task.getException();
    }

    private e1 i(m mVar, s1 s1Var) {
        this.f26454b.N(mVar);
        this.f26453a.o(mVar.l(), s1Var);
        return this;
    }

    public e1 b(m mVar) {
        this.f26454b.N(mVar);
        this.f26453a.e(mVar.l());
        return this;
    }

    public n c(m mVar) throws z {
        this.f26454b.N(mVar);
        try {
            return (n) Tasks.await(d(mVar));
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof z) {
                throw ((z) e10.getCause());
            }
            throw new RuntimeException(e10.getCause());
        } catch (InterruptedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public e1 f(m mVar, Object obj) {
        return g(mVar, obj, z0.f26588c);
    }

    public e1 g(m mVar, Object obj, z0 z0Var) {
        r1 r1Var;
        this.f26454b.N(mVar);
        x.c(obj, "Provided data must not be null.");
        x.c(z0Var, "Provided options must not be null.");
        if (z0Var.b()) {
            r1Var = this.f26454b.w().g(obj, z0Var.a());
        } else {
            r1Var = this.f26454b.w().l(obj);
        }
        this.f26453a.n(mVar.l(), r1Var);
        return this;
    }

    public e1 h(m mVar, Map<String, Object> map) {
        return i(mVar, this.f26454b.w().o(map));
    }
}
