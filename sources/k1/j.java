package k1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.k;
import androidx.work.p;
import androidx.work.y;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import r1.q;
import r1.t;
import s1.d;
import s1.l;
import s1.m;
import w6.f;

/* compiled from: WorkerWrapper */
public class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    static final String f19591u = p.f("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f19592a;

    /* renamed from: b  reason: collision with root package name */
    private String f19593b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f19594c;

    /* renamed from: d  reason: collision with root package name */
    private WorkerParameters.a f19595d;

    /* renamed from: f  reason: collision with root package name */
    r1.p f19596f;

    /* renamed from: g  reason: collision with root package name */
    ListenableWorker f19597g;

    /* renamed from: h  reason: collision with root package name */
    t1.a f19598h;

    /* renamed from: i  reason: collision with root package name */
    ListenableWorker.a f19599i = ListenableWorker.a.a();

    /* renamed from: j  reason: collision with root package name */
    private androidx.work.b f19600j;

    /* renamed from: k  reason: collision with root package name */
    private q1.a f19601k;

    /* renamed from: l  reason: collision with root package name */
    private WorkDatabase f19602l;

    /* renamed from: m  reason: collision with root package name */
    private q f19603m;

    /* renamed from: n  reason: collision with root package name */
    private r1.b f19604n;

    /* renamed from: o  reason: collision with root package name */
    private t f19605o;

    /* renamed from: p  reason: collision with root package name */
    private List<String> f19606p;

    /* renamed from: q  reason: collision with root package name */
    private String f19607q;

    /* renamed from: r  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f19608r = androidx.work.impl.utils.futures.c.t();

    /* renamed from: s  reason: collision with root package name */
    f<ListenableWorker.a> f19609s = null;

    /* renamed from: t  reason: collision with root package name */
    private volatile boolean f19610t;

    /* compiled from: WorkerWrapper */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f19611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f19612b;

        a(f fVar, androidx.work.impl.utils.futures.c cVar) {
            this.f19611a = fVar;
            this.f19612b = cVar;
        }

        public void run() {
            try {
                this.f19611a.get();
                p.c().a(j.f19591u, String.format("Starting work for %s", new Object[]{j.this.f19596f.f21928c}), new Throwable[0]);
                j jVar = j.this;
                jVar.f19609s = jVar.f19597g.startWork();
                this.f19612b.r(j.this.f19609s);
            } catch (Throwable th) {
                this.f19612b.q(th);
            }
        }
    }

    /* compiled from: WorkerWrapper */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f19614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19615b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f19614a = cVar;
            this.f19615b = str;
        }

        public void run() {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f19614a.get();
                if (aVar == null) {
                    p.c().b(j.f19591u, String.format("%s returned a null result. Treating it as a failure.", new Object[]{j.this.f19596f.f21928c}), new Throwable[0]);
                } else {
                    p.c().a(j.f19591u, String.format("%s returned a %s result.", new Object[]{j.this.f19596f.f21928c, aVar}), new Throwable[0]);
                    j.this.f19599i = aVar;
                }
            } catch (CancellationException e10) {
                p.c().d(j.f19591u, String.format("%s was cancelled", new Object[]{this.f19615b}), e10);
            } catch (InterruptedException | ExecutionException e11) {
                p.c().b(j.f19591u, String.format("%s failed because it threw an exception/error", new Object[]{this.f19615b}), e11);
            } catch (Throwable th) {
                j.this.f();
                throw th;
            }
            j.this.f();
        }
    }

    /* compiled from: WorkerWrapper */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f19617a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f19618b;

        /* renamed from: c  reason: collision with root package name */
        q1.a f19619c;

        /* renamed from: d  reason: collision with root package name */
        t1.a f19620d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.b f19621e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f19622f;

        /* renamed from: g  reason: collision with root package name */
        String f19623g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f19624h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f19625i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, t1.a aVar, q1.a aVar2, WorkDatabase workDatabase, String str) {
            this.f19617a = context.getApplicationContext();
            this.f19620d = aVar;
            this.f19619c = aVar2;
            this.f19621e = bVar;
            this.f19622f = workDatabase;
            this.f19623g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f19625i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f19624h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f19592a = cVar.f19617a;
        this.f19598h = cVar.f19620d;
        this.f19601k = cVar.f19619c;
        this.f19593b = cVar.f19623g;
        this.f19594c = cVar.f19624h;
        this.f19595d = cVar.f19625i;
        this.f19597g = cVar.f19618b;
        this.f19600j = cVar.f19621e;
        WorkDatabase workDatabase = cVar.f19622f;
        this.f19602l = workDatabase;
        this.f19603m = workDatabase.B();
        this.f19604n = this.f19602l.t();
        this.f19605o = this.f19602l.C();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f19593b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String next : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            p.c().d(f19591u, String.format("Worker result SUCCESS for %s", new Object[]{this.f19607q}), new Throwable[0]);
            if (this.f19596f.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            p.c().d(f19591u, String.format("Worker result RETRY for %s", new Object[]{this.f19607q}), new Throwable[0]);
            g();
        } else {
            p.c().d(f19591u, String.format("Worker result FAILURE for %s", new Object[]{this.f19607q}), new Throwable[0]);
            if (this.f19596f.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f19603m.l(str2) != y.a.CANCELLED) {
                this.f19603m.b(y.a.FAILED, str2);
            }
            linkedList.addAll(this.f19604n.b(str2));
        }
    }

    private void g() {
        this.f19602l.c();
        try {
            this.f19603m.b(y.a.ENQUEUED, this.f19593b);
            this.f19603m.r(this.f19593b, System.currentTimeMillis());
            this.f19603m.c(this.f19593b, -1);
            this.f19602l.r();
        } finally {
            this.f19602l.g();
            i(true);
        }
    }

    private void h() {
        this.f19602l.c();
        try {
            this.f19603m.r(this.f19593b, System.currentTimeMillis());
            this.f19603m.b(y.a.ENQUEUED, this.f19593b);
            this.f19603m.n(this.f19593b);
            this.f19603m.c(this.f19593b, -1);
            this.f19602l.r();
        } finally {
            this.f19602l.g();
            i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f19602l.c();
        try {
            if (!this.f19602l.B().j()) {
                d.a(this.f19592a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f19603m.b(y.a.ENQUEUED, this.f19593b);
                this.f19603m.c(this.f19593b, -1);
            }
            if (!(this.f19596f == null || (listenableWorker = this.f19597g) == null || !listenableWorker.isRunInForeground())) {
                this.f19601k.b(this.f19593b);
            }
            this.f19602l.r();
            this.f19602l.g();
            this.f19608r.p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f19602l.g();
            throw th;
        }
    }

    private void j() {
        y.a l10 = this.f19603m.l(this.f19593b);
        if (l10 == y.a.RUNNING) {
            p.c().a(f19591u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f19593b}), new Throwable[0]);
            i(true);
            return;
        }
        p.c().a(f19591u, String.format("Status for %s is %s; not doing any work", new Object[]{this.f19593b, l10}), new Throwable[0]);
        i(false);
    }

    private void k() {
        e b10;
        if (!n()) {
            this.f19602l.c();
            try {
                r1.p m10 = this.f19603m.m(this.f19593b);
                this.f19596f = m10;
                if (m10 == null) {
                    p.c().b(f19591u, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f19593b}), new Throwable[0]);
                    i(false);
                    this.f19602l.r();
                } else if (m10.f21927b != y.a.ENQUEUED) {
                    j();
                    this.f19602l.r();
                    p.c().a(f19591u, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f19596f.f21928c}), new Throwable[0]);
                    this.f19602l.g();
                } else {
                    if (m10.d() || this.f19596f.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        r1.p pVar = this.f19596f;
                        if (!(pVar.f21939n == 0) && currentTimeMillis < pVar.a()) {
                            p.c().a(f19591u, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f19596f.f21928c}), new Throwable[0]);
                            i(true);
                            this.f19602l.r();
                            this.f19602l.g();
                            return;
                        }
                    }
                    this.f19602l.r();
                    this.f19602l.g();
                    if (this.f19596f.d()) {
                        b10 = this.f19596f.f21930e;
                    } else {
                        k b11 = this.f19600j.f().b(this.f19596f.f21929d);
                        if (b11 == null) {
                            p.c().b(f19591u, String.format("Could not create Input Merger %s", new Object[]{this.f19596f.f21929d}), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f19596f.f21930e);
                        arrayList.addAll(this.f19603m.p(this.f19593b));
                        b10 = b11.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f19593b), b10, this.f19606p, this.f19595d, this.f19596f.f21936k, this.f19600j.e(), this.f19598h, this.f19600j.m(), new m(this.f19602l, this.f19598h), new l(this.f19602l, this.f19601k, this.f19598h));
                    if (this.f19597g == null) {
                        this.f19597g = this.f19600j.m().b(this.f19592a, this.f19596f.f21928c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f19597g;
                    if (listenableWorker == null) {
                        p.c().b(f19591u, String.format("Could not create Worker %s", new Object[]{this.f19596f.f21928c}), new Throwable[0]);
                        l();
                    } else if (listenableWorker.isUsed()) {
                        p.c().b(f19591u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f19596f.f21928c}), new Throwable[0]);
                        l();
                    } else {
                        this.f19597g.setUsed();
                        if (!o()) {
                            j();
                        } else if (!n()) {
                            androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
                            s1.k kVar = new s1.k(this.f19592a, this.f19596f, this.f19597g, workerParameters.b(), this.f19598h);
                            this.f19598h.a().execute(kVar);
                            f<Void> a10 = kVar.a();
                            a10.a(new a(a10, t10), this.f19598h.a());
                            t10.a(new b(t10, this.f19607q), this.f19598h.c());
                        }
                    }
                }
            } finally {
                this.f19602l.g();
            }
        }
    }

    private void m() {
        this.f19602l.c();
        try {
            this.f19603m.b(y.a.SUCCEEDED, this.f19593b);
            this.f19603m.h(this.f19593b, ((ListenableWorker.a.c) this.f19599i).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f19604n.b(this.f19593b)) {
                if (this.f19603m.l(next) == y.a.BLOCKED && this.f19604n.c(next)) {
                    p.c().d(f19591u, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f19603m.b(y.a.ENQUEUED, next);
                    this.f19603m.r(next, currentTimeMillis);
                }
            }
            this.f19602l.r();
        } finally {
            this.f19602l.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f19610t) {
            return false;
        }
        p.c().a(f19591u, String.format("Work interrupted for %s", new Object[]{this.f19607q}), new Throwable[0]);
        y.a l10 = this.f19603m.l(this.f19593b);
        if (l10 == null) {
            i(false);
        } else {
            i(!l10.a());
        }
        return true;
    }

    private boolean o() {
        this.f19602l.c();
        try {
            boolean z10 = true;
            if (this.f19603m.l(this.f19593b) == y.a.ENQUEUED) {
                this.f19603m.b(y.a.RUNNING, this.f19593b);
                this.f19603m.q(this.f19593b);
            } else {
                z10 = false;
            }
            this.f19602l.r();
            return z10;
        } finally {
            this.f19602l.g();
        }
    }

    public f<Boolean> b() {
        return this.f19608r;
    }

    public void d() {
        boolean z10;
        this.f19610t = true;
        n();
        f<ListenableWorker.a> fVar = this.f19609s;
        if (fVar != null) {
            z10 = fVar.isDone();
            this.f19609s.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f19597g;
        if (listenableWorker == null || z10) {
            p.c().a(f19591u, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f19596f}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (!n()) {
            this.f19602l.c();
            try {
                y.a l10 = this.f19603m.l(this.f19593b);
                this.f19602l.A().a(this.f19593b);
                if (l10 == null) {
                    i(false);
                } else if (l10 == y.a.RUNNING) {
                    c(this.f19599i);
                } else if (!l10.a()) {
                    g();
                }
                this.f19602l.r();
            } finally {
                this.f19602l.g();
            }
        }
        List<e> list = this.f19594c;
        if (list != null) {
            for (e e10 : list) {
                e10.e(this.f19593b);
            }
            f.b(this.f19600j, this.f19602l, this.f19594c);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f19602l.c();
        try {
            e(this.f19593b);
            this.f19603m.h(this.f19593b, ((ListenableWorker.a.C0090a) this.f19599i).e());
            this.f19602l.r();
        } finally {
            this.f19602l.g();
            i(false);
        }
    }

    public void run() {
        List<String> a10 = this.f19605o.a(this.f19593b);
        this.f19606p = a10;
        this.f19607q = a(a10);
        k();
    }
}
