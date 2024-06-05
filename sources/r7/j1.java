package r7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u7.l;
import u7.s;
import u7.w;
import v7.c;
import v7.f;
import v7.m;
import x7.q;
import y7.b;
import y7.p;

/* compiled from: Transaction */
public class j1 {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f29925g = d();

    /* renamed from: a  reason: collision with root package name */
    private final q f29926a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<l, w> f29927b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<f> f29928c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f29929d;

    /* renamed from: e  reason: collision with root package name */
    private z f29930e;

    /* renamed from: f  reason: collision with root package name */
    private Set<l> f29931f = new HashSet();

    public j1(q qVar) {
        this.f29926a = qVar;
    }

    private static Executor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, (long) 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void f() {
        b.d(!this.f29929d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor g() {
        return f29925g;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task h(Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        return Tasks.forException(task.getException());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task i(Task task) throws Exception {
        if (task.isSuccessful()) {
            for (s m10 : (List) task.getResult()) {
                m(m10);
            }
        }
        return task;
    }

    private m k(l lVar) {
        w wVar = this.f29927b.get(lVar);
        if (this.f29931f.contains(lVar) || wVar == null) {
            return m.f30717c;
        }
        if (wVar.equals(w.f30653b)) {
            return m.a(false);
        }
        return m.f(wVar);
    }

    private m l(l lVar) throws z {
        w wVar = this.f29927b.get(lVar);
        if (this.f29931f.contains(lVar) || wVar == null) {
            return m.a(true);
        }
        if (!wVar.equals(w.f30653b)) {
            return m.f(wVar);
        }
        throw new z("Can't update a document that doesn't exist.", z.a.INVALID_ARGUMENT);
    }

    private void m(s sVar) throws z {
        w wVar;
        if (sVar.b()) {
            wVar = sVar.getVersion();
        } else if (sVar.g()) {
            wVar = w.f30653b;
        } else {
            throw b.a("Unexpected document type in transaction: " + sVar, new Object[0]);
        }
        if (!this.f29927b.containsKey(sVar.getKey())) {
            this.f29927b.put(sVar.getKey(), wVar);
        } else if (!this.f29927b.get(sVar.getKey()).equals(sVar.getVersion())) {
            throw new z("Document version changed between two reads.", z.a.ABORTED);
        }
    }

    private void p(List<f> list) {
        f();
        this.f29928c.addAll(list);
    }

    public Task<Void> c() {
        f();
        z zVar = this.f29930e;
        if (zVar != null) {
            return Tasks.forException(zVar);
        }
        HashSet hashSet = new HashSet(this.f29927b.keySet());
        Iterator<f> it = this.f29928c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().g());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            this.f29928c.add(new v7.q(lVar, k(lVar)));
        }
        this.f29929d = true;
        return this.f29926a.e(this.f29928c).continueWithTask(p.f31400b, i1.f37831a);
    }

    public void e(l lVar) {
        p(Collections.singletonList(new c(lVar, k(lVar))));
        this.f29931f.add(lVar);
    }

    public Task<List<s>> j(List<l> list) {
        f();
        if (this.f29928c.size() != 0) {
            return Tasks.forException(new z("Firestore transactions require all reads to be executed before all writes.", z.a.INVALID_ARGUMENT));
        }
        return this.f29926a.p(list).continueWithTask(p.f31400b, new h1(this));
    }

    public void n(l lVar, r1 r1Var) {
        p(Collections.singletonList(r1Var.a(lVar, k(lVar))));
        this.f29931f.add(lVar);
    }

    public void o(l lVar, s1 s1Var) {
        try {
            p(Collections.singletonList(s1Var.a(lVar, l(lVar))));
        } catch (z e10) {
            this.f29930e = e10;
        }
        this.f29931f.add(lVar);
    }
}
