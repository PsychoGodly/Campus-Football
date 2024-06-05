package bf;

import bf.w;
import cf.c;
import com.google.android.gms.common.api.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Dispatcher */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f31801a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f31802b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f31803c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f31804d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<w.b> f31805e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<w.b> f31806f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<w> f31807g = new ArrayDeque();

    private <T> void d(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f31803c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!e() && runnable != null) {
            runnable.run();
        }
    }

    private boolean e() {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<w.b> it = this.f31805e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w.b next = it.next();
                if (this.f31806f.size() >= this.f31801a) {
                    break;
                } else if (g(next) < this.f31802b) {
                    it.remove();
                    arrayList.add(next);
                    this.f31806f.add(next);
                }
            }
            z10 = f() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((w.b) arrayList.get(i10)).l(b());
        }
        return z10;
    }

    private int g(w.b bVar) {
        int i10 = 0;
        for (w.b next : this.f31806f) {
            if (!next.m().f31905g && next.n().equals(bVar.n())) {
                i10++;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void a(w.b bVar) {
        synchronized (this) {
            this.f31805e.add(bVar);
        }
        e();
    }

    public synchronized ExecutorService b() {
        if (this.f31804d == null) {
            this.f31804d = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.G("OkHttp Dispatcher", false));
        }
        return this.f31804d;
    }

    /* access modifiers changed from: package-private */
    public void c(w.b bVar) {
        d(this.f31806f, bVar);
    }

    public synchronized int f() {
        return this.f31806f.size() + this.f31807g.size();
    }
}
