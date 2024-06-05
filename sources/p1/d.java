package p1;

import android.content.Context;
import androidx.work.p;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f21108f = p.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final t1.a f21109a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f21110b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f21111c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<n1.a<T>> f21112d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f21113e;

    /* compiled from: ConstraintTracker */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f21114a;

        a(List list) {
            this.f21114a = list;
        }

        public void run() {
            for (n1.a a10 : this.f21114a) {
                a10.a(d.this.f21113e);
            }
        }
    }

    d(Context context, t1.a aVar) {
        this.f21110b = context.getApplicationContext();
        this.f21109a = aVar;
    }

    public void a(n1.a<T> aVar) {
        synchronized (this.f21111c) {
            if (this.f21112d.add(aVar)) {
                if (this.f21112d.size() == 1) {
                    this.f21113e = b();
                    p.c().a(f21108f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f21113e}), new Throwable[0]);
                    e();
                }
                aVar.a(this.f21113e);
            }
        }
    }

    public abstract T b();

    public void c(n1.a<T> aVar) {
        synchronized (this.f21111c) {
            if (this.f21112d.remove(aVar) && this.f21112d.isEmpty()) {
                f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f21111c
            monitor-enter(r0)
            T r1 = r3.f21113e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f21113e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<n1.a<T>> r1 = r3.f21112d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            t1.a r1 = r3.f21109a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.a()     // Catch:{ all -> 0x002b }
            p1.d$a r2 = new p1.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.d.d(java.lang.Object):void");
    }

    public abstract void e();

    public abstract void f();
}
