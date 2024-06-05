package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import r7.a1;
import r7.d;
import r7.h;
import r7.o;
import r7.r1;
import r7.s1;
import r7.v0;
import r7.x1;
import u7.i;
import u7.l;
import u7.u;
import v7.c;
import y7.b;
import y7.g0;
import y7.p;
import y7.x;

/* compiled from: DocumentReference */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final l f26503a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseFirestore f26504b;

    m(l lVar, FirebaseFirestore firebaseFirestore) {
        this.f26503a = (l) x.b(lVar);
        this.f26504b = firebaseFirestore;
    }

    private f0 f(Executor executor, o.a aVar, Activity activity, o<n> oVar) {
        h hVar = new h(executor, new l(this, oVar));
        return d.c(activity, new v0(this.f26504b.s(), this.f26504b.s().d0(g(), aVar, hVar), hVar));
    }

    private a1 g() {
        return a1.b(this.f26503a.l());
    }

    static m i(u uVar, FirebaseFirestore firebaseFirestore) {
        if (uVar.k() % 2 == 0) {
            return new m(l.g(uVar), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + uVar.d() + " has " + uVar.k());
    }

    private Task<n> n(b1 b1Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        o.a aVar = new o.a();
        aVar.f29961a = true;
        aVar.f29962b = true;
        aVar.f29963c = true;
        taskCompletionSource2.setResult(f(p.f31400b, aVar, (Activity) null, new k(taskCompletionSource, taskCompletionSource2, b1Var)));
        return taskCompletionSource.getTask();
    }

    private static o.a o(o0 o0Var) {
        o.a aVar = new o.a();
        o0 o0Var2 = o0.INCLUDE;
        boolean z10 = true;
        aVar.f29961a = o0Var == o0Var2;
        if (o0Var != o0Var2) {
            z10 = false;
        }
        aVar.f29962b = z10;
        aVar.f29963c = false;
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(o oVar, x1 x1Var, z zVar) {
        n nVar;
        if (zVar != null) {
            oVar.a(null, zVar);
            return;
        }
        boolean z10 = true;
        b.d(x1Var != null, "Got event without value or error set", new Object[0]);
        if (x1Var.e().size() > 1) {
            z10 = false;
        }
        b.d(z10, "Too many documents returned on a document query", new Object[0]);
        i f10 = x1Var.e().f(this.f26503a);
        if (f10 != null) {
            nVar = n.b(this.f26504b, f10, x1Var.k(), x1Var.f().contains(f10.getKey()));
        } else {
            nVar = n.c(this.f26504b, this.f26503a, x1Var.k());
        }
        oVar.a(nVar, (z) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ n q(Task task) throws Exception {
        i iVar = (i) task.getResult();
        return new n(this.f26504b, this.f26503a, iVar, true, iVar != null && iVar.d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void r(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, b1 b1Var, n nVar, z zVar) {
        if (zVar != null) {
            taskCompletionSource.setException(zVar);
            return;
        }
        try {
            ((f0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!nVar.a() && nVar.f().b()) {
                taskCompletionSource.setException(new z("Failed to get document because the client is offline.", z.a.UNAVAILABLE));
            } else if (!nVar.a() || !nVar.f().b() || b1Var != b1.SERVER) {
                taskCompletionSource.setResult(nVar);
            } else {
                taskCompletionSource.setException(new z("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", z.a.UNAVAILABLE));
            }
        } catch (ExecutionException e10) {
            throw b.b(e10, "Failed to register a listener for a single document", new Object[0]);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw b.b(e11, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    private Task<Void> v(s1 s1Var) {
        return this.f26504b.s().m0(Collections.singletonList(s1Var.a(this.f26503a, v7.m.a(true)))).continueWith(p.f31400b, g0.C());
    }

    public f0 d(o0 o0Var, o<n> oVar) {
        return e(p.f31399a, o0Var, oVar);
    }

    public f0 e(Executor executor, o0 o0Var, o<n> oVar) {
        x.c(executor, "Provided executor must not be null.");
        x.c(o0Var, "Provided MetadataChanges value must not be null.");
        x.c(oVar, "Provided EventListener must not be null.");
        return f(executor, o(o0Var), (Activity) null, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f26503a.equals(mVar.f26503a) || !this.f26504b.equals(mVar.f26504b)) {
            return false;
        }
        return true;
    }

    public Task<Void> h() {
        return this.f26504b.s().m0(Collections.singletonList(new c(this.f26503a, v7.m.f30717c))).continueWith(p.f31400b, g0.C());
    }

    public int hashCode() {
        return (this.f26503a.hashCode() * 31) + this.f26504b.hashCode();
    }

    public Task<n> j(b1 b1Var) {
        if (b1Var == b1.CACHE) {
            return this.f26504b.s().B(this.f26503a).continueWith(p.f31400b, new j(this));
        }
        return n(b1Var);
    }

    public FirebaseFirestore k() {
        return this.f26504b;
    }

    /* access modifiers changed from: package-private */
    public l l() {
        return this.f26503a;
    }

    public String m() {
        return this.f26503a.l().d();
    }

    public Task<Void> s(Object obj) {
        return t(obj, z0.f26588c);
    }

    public Task<Void> t(Object obj, z0 z0Var) {
        r1 r1Var;
        x.c(obj, "Provided data must not be null.");
        x.c(z0Var, "Provided options must not be null.");
        if (z0Var.b()) {
            r1Var = this.f26504b.w().g(obj, z0Var.a());
        } else {
            r1Var = this.f26504b.w().l(obj);
        }
        return this.f26504b.s().m0(Collections.singletonList(r1Var.a(this.f26503a, v7.m.f30717c))).continueWith(p.f31400b, g0.C());
    }

    public Task<Void> u(q qVar, Object obj, Object... objArr) {
        return v(this.f26504b.w().n(g0.f(1, qVar, obj, objArr)));
    }
}
