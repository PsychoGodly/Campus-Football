package r7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.f1;
import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.o;
import com.google.firebase.firestore.z;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.a;
import p7.j;
import p8.d0;
import q7.f;
import r7.j;
import r7.o;
import t7.e1;
import t7.g4;
import t7.i1;
import t7.k;
import u7.i;
import u7.l;
import x7.i0;
import x7.n0;
import x7.q;
import x7.r0;
import y7.b;
import y7.g;
import y7.t;
import y7.v;

/* compiled from: FirestoreClient */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final l f29967a;

    /* renamed from: b  reason: collision with root package name */
    private final a<j> f29968b;

    /* renamed from: c  reason: collision with root package name */
    private final a<String> f29969c;

    /* renamed from: d  reason: collision with root package name */
    private final g f29970d;

    /* renamed from: e  reason: collision with root package name */
    private final q7.g f29971e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f29972f;

    /* renamed from: g  reason: collision with root package name */
    private e1 f29973g;

    /* renamed from: h  reason: collision with root package name */
    private t7.i0 f29974h;

    /* renamed from: i  reason: collision with root package name */
    private r0 f29975i;

    /* renamed from: j  reason: collision with root package name */
    private e1 f29976j;

    /* renamed from: k  reason: collision with root package name */
    private o f29977k;

    /* renamed from: l  reason: collision with root package name */
    private g4 f29978l;

    /* renamed from: m  reason: collision with root package name */
    private g4 f29979m;

    public o0(Context context, l lVar, a0 a0Var, a<j> aVar, a<String> aVar2, g gVar, i0 i0Var) {
        this.f29967a = lVar;
        this.f29968b = aVar;
        this.f29969c = aVar2;
        this.f29970d = gVar;
        this.f29972f = i0Var;
        this.f29971e = new q7.g(new n0(lVar.a()));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gVar.l(new l0(this, taskCompletionSource, context, a0Var));
        aVar.d(new e0(this, atomicBoolean, taskCompletionSource, gVar));
        aVar2.d(f0.f37823a);
    }

    private void E(Context context, j jVar, a0 a0Var) {
        j jVar2;
        v.a("FirestoreClient", "Initializing. user=%s", jVar.a());
        Context context2 = context;
        j.a aVar = new j.a(context2, this.f29970d, this.f29967a, new q(this.f29967a, this.f29970d, this.f29968b, this.f29969c, context, this.f29972f), jVar, 100, a0Var);
        if (a0Var.d()) {
            jVar2 = new d1();
        } else {
            jVar2 = new w0();
        }
        jVar2.q(aVar);
        this.f29973g = jVar2.n();
        this.f29979m = jVar2.k();
        this.f29974h = jVar2.m();
        this.f29975i = jVar2.o();
        this.f29976j = jVar2.p();
        this.f29977k = jVar2.j();
        k l10 = jVar2.l();
        g4 g4Var = this.f29979m;
        if (g4Var != null) {
            g4Var.start();
        }
        if (l10 != null) {
            k.a f10 = l10.f();
            this.f29978l = f10;
            f10.start();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(o oVar) {
        this.f29977k.e(oVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(List list) {
        this.f29974h.z(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f29975i.r();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f29975i.t();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i K(Task task) throws Exception {
        i iVar = (i) task.getResult();
        if (iVar.b()) {
            return iVar;
        }
        if (iVar.g()) {
            return null;
        }
        throw new z("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", z.a.UNAVAILABLE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i L(l lVar) throws Exception {
        return this.f29974h.h0(lVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ x1 M(a1 a1Var) throws Exception {
        i1 A = this.f29974h.A(a1Var, true);
        v1 v1Var = new v1(a1Var, A.b());
        return v1Var.b(v1Var.g(A.a())).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(String str, TaskCompletionSource taskCompletionSource) {
        q7.j H = this.f29974h.H(str);
        if (H != null) {
            f1 b10 = H.a().b();
            taskCompletionSource.setResult(new a1(b10.n(), b10.d(), b10.h(), b10.m(), b10.j(), H.a().a(), b10.p(), b10.f()));
            return;
        }
        taskCompletionSource.setResult(null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(b1 b1Var) {
        this.f29977k.d(b1Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(f fVar, h0 h0Var) {
        this.f29976j.o(fVar, h0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q(TaskCompletionSource taskCompletionSource, Context context, a0 a0Var) {
        try {
            E(context, (p7.j) Tasks.await(taskCompletionSource.getTask()), a0Var);
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R(p7.j jVar) {
        b.d(this.f29976j != null, "SyncEngine not yet initialized", new Object[0]);
        v.a("FirestoreClient", "Credential changed. Current user: %s", jVar.a());
        this.f29976j.l(jVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, g gVar, p7.j jVar) {
        if (atomicBoolean.compareAndSet(false, true)) {
            b.d(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(jVar);
            return;
        }
        gVar.l(new v(this, jVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(String str) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U(o oVar) {
        this.f29977k.h(oVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X(a1 a1Var, List list, TaskCompletionSource taskCompletionSource) {
        this.f29976j.w(a1Var, list).addOnSuccessListener(new g0(taskCompletionSource)).addOnFailureListener(new c0(taskCompletionSource));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y(b1 b1Var) {
        this.f29977k.g(b1Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z() {
        this.f29975i.P();
        this.f29973g.l();
        g4 g4Var = this.f29979m;
        if (g4Var != null) {
            g4Var.stop();
        }
        g4 g4Var2 = this.f29978l;
        if (g4Var2 != null) {
            g4Var2.stop();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task a0(f1 f1Var, t tVar) throws Exception {
        return this.f29976j.A(this.f29970d, f1Var, tVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b0(TaskCompletionSource taskCompletionSource) {
        this.f29976j.s(taskCompletionSource);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0(List list, TaskCompletionSource taskCompletionSource) {
        this.f29976j.C(list, taskCompletionSource);
    }

    private void k0() {
        if (F()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public Task<Void> A() {
        k0();
        return this.f29970d.i(new j0(this));
    }

    public Task<i> B(l lVar) {
        k0();
        return this.f29970d.j(new d0(this, lVar)).continueWith(r.f37848a);
    }

    public Task<x1> C(a1 a1Var) {
        k0();
        return this.f29970d.j(new b0(this, a1Var));
    }

    public Task<a1> D(String str) {
        k0();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29970d.l(new s(this, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean F() {
        return this.f29970d.p();
    }

    public b1 d0(a1 a1Var, o.a aVar, com.google.firebase.firestore.o<x1> oVar) {
        k0();
        b1 b1Var = new b1(a1Var, aVar, oVar);
        this.f29970d.l(new z(this, b1Var));
        return b1Var;
    }

    public void e0(InputStream inputStream, h0 h0Var) {
        k0();
        this.f29970d.l(new w(this, new f(this.f29971e, inputStream), h0Var));
    }

    public void f0(com.google.firebase.firestore.o<Void> oVar) {
        if (!F()) {
            this.f29970d.l(new m0(this, oVar));
        }
    }

    public Task<Map<String, d0>> g0(a1 a1Var, List<com.google.firebase.firestore.a> list) {
        k0();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29970d.l(new x(this, a1Var, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void h0(b1 b1Var) {
        if (!F()) {
            this.f29970d.l(new y(this, b1Var));
        }
    }

    public Task<Void> i0() {
        this.f29968b.c();
        this.f29969c.c();
        return this.f29970d.n(new h0(this));
    }

    public <TResult> Task<TResult> j0(f1 f1Var, t<j1, Task<TResult>> tVar) {
        k0();
        return g.g(this.f29970d.o(), new a0(this, f1Var, tVar));
    }

    public Task<Void> l0() {
        k0();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29970d.l(new k0(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Void> m0(List<v7.f> list) {
        k0();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29970d.l(new u(this, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void x(com.google.firebase.firestore.o<Void> oVar) {
        k0();
        this.f29970d.l(new n0(this, oVar));
    }

    public Task<Void> y(List<u7.q> list) {
        k0();
        return this.f29970d.i(new t(this, list));
    }

    public Task<Void> z() {
        k0();
        return this.f29970d.i(new i0(this));
    }
}
