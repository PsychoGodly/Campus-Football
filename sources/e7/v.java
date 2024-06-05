package e7;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o7.a;
import o7.b;
import o7.c;
import o7.d;

/* compiled from: EventBus */
class v implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f28793a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<a<?>> f28794b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f28795c;

    v(Executor executor) {
        this.f28795c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> g(a<?> aVar) {
        Map map;
        map = this.f28793a.get(aVar.b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        e0.b(cls);
        e0.b(bVar);
        e0.b(executor);
        if (!this.f28793a.containsKey(cls)) {
            this.f28793a.put(cls, new ConcurrentHashMap());
        }
        this.f28793a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new e7.u(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = g(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(o7.a<?> r5) {
        /*
            r4 = this;
            e7.e0.b(r5)
            monitor-enter(r4)
            java.util.Queue<o7.a<?>> r0 = r4.f28794b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.g(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            e7.u r3 = new e7.u
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.v.b(o7.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void c(java.lang.Class<T> r2, o7.b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            e7.e0.b(r2)     // Catch:{ all -> 0x0029 }
            e7.e0.b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<o7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f28793a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<o7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f28793a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<o7.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f28793a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.v.c(java.lang.Class, o7.b):void");
    }

    public <T> void d(Class<T> cls, b<? super T> bVar) {
        a(cls, this.f28795c, bVar);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.f28794b;
            if (queue != null) {
                this.f28794b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a b10 : queue) {
                b(b10);
            }
        }
    }
}
