package k4;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k4.l;

/* compiled from: ListenerSet */
public final class q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f19753a;

    /* renamed from: b  reason: collision with root package name */
    private final n f19754b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f19755c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f19756d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f19757e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f19758f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f19759g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19760h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19761i;

    /* compiled from: ListenerSet */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: ListenerSet */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* compiled from: ListenerSet */
    private static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f19762a;

        /* renamed from: b  reason: collision with root package name */
        private l.b f19763b = new l.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f19764c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f19765d;

        public c(T t10) {
            this.f19762a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (!this.f19765d) {
                if (i10 != -1) {
                    this.f19763b.a(i10);
                }
                this.f19764c = true;
                aVar.invoke(this.f19762a);
            }
        }

        public void b(b<T> bVar) {
            if (!this.f19765d && this.f19764c) {
                l e10 = this.f19763b.e();
                this.f19763b = new l.b();
                this.f19764c = false;
                bVar.a(this.f19762a, e10);
            }
        }

        public void c(b<T> bVar) {
            this.f19765d = true;
            if (this.f19764c) {
                this.f19764c = false;
                bVar.a(this.f19762a, this.f19763b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f19762a.equals(((c) obj).f19762a);
        }

        public int hashCode() {
            return this.f19762a.hashCode();
        }
    }

    public q(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    /* access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f19756d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f19755c);
            if (this.f19754b.d(0)) {
                return true;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void l() {
        if (this.f19761i) {
            a.f(Thread.currentThread() == this.f19754b.l().getThread());
        }
    }

    public void c(T t10) {
        a.e(t10);
        synchronized (this.f19759g) {
            if (!this.f19760h) {
                this.f19756d.add(new c(t10));
            }
        }
    }

    public q<T> d(Looper looper, d dVar, b<T> bVar) {
        return new q<>(this.f19756d, looper, dVar, bVar);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f19753a, bVar);
    }

    public void f() {
        l();
        if (!this.f19758f.isEmpty()) {
            if (!this.f19754b.d(0)) {
                n nVar = this.f19754b;
                nVar.e(nVar.c(0));
            }
            boolean z10 = !this.f19757e.isEmpty();
            this.f19757e.addAll(this.f19758f);
            this.f19758f.clear();
            if (!z10) {
                while (!this.f19757e.isEmpty()) {
                    this.f19757e.peekFirst().run();
                    this.f19757e.removeFirst();
                }
            }
        }
    }

    public void i(int i10, a<T> aVar) {
        l();
        this.f19758f.add(new p(new CopyOnWriteArraySet(this.f19756d), i10, aVar));
    }

    public void j() {
        l();
        synchronized (this.f19759g) {
            this.f19760h = true;
        }
        Iterator<c<T>> it = this.f19756d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f19755c);
        }
        this.f19756d.clear();
    }

    public void k(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f19753a = dVar;
        this.f19756d = copyOnWriteArraySet;
        this.f19755c = bVar;
        this.f19759g = new Object();
        this.f19757e = new ArrayDeque<>();
        this.f19758f = new ArrayDeque<>();
        this.f19754b = dVar.d(looper, new o(this));
        this.f19761i = true;
    }
}
