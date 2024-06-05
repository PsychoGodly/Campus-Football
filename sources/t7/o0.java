package t7;

import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import y7.g;
import y7.v;

/* compiled from: LruGarbageCollector */
public class o0 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f30491c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f30492d;

    /* renamed from: a  reason: collision with root package name */
    private final k0 f30493a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f30494b;

    /* compiled from: LruGarbageCollector */
    public class a implements g4 {

        /* renamed from: a  reason: collision with root package name */
        private final g f30495a;

        /* renamed from: b  reason: collision with root package name */
        private final i0 f30496b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f30497c = false;

        /* renamed from: d  reason: collision with root package name */
        private g.b f30498d;

        public a(g gVar, i0 i0Var) {
            this.f30495a = gVar;
            this.f30496b = i0Var;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.f30496b.y(o0.this);
            this.f30497c = true;
            c();
        }

        private void c() {
            this.f30498d = this.f30495a.k(g.d.GARBAGE_COLLECTION, this.f30497c ? o0.f30492d : o0.f30491c, new n0(this));
        }

        public void start() {
            if (o0.this.f30494b.f30500a != -1) {
                c();
            }
        }

        public void stop() {
            g.b bVar = this.f30498d;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* compiled from: LruGarbageCollector */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f30500a;

        /* renamed from: b  reason: collision with root package name */
        int f30501b;

        /* renamed from: c  reason: collision with root package name */
        final int f30502c;

        b(long j10, int i10, int i11) {
            this.f30500a = j10;
            this.f30501b = i10;
            this.f30502c = i11;
        }

        public static b a(long j10) {
            return new b(j10, 10, 1000);
        }
    }

    /* compiled from: LruGarbageCollector */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f30503a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30504b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30505c;

        /* renamed from: d  reason: collision with root package name */
        private final int f30506d;

        c(boolean z10, int i10, int i11, int i12) {
            this.f30503a = z10;
            this.f30504b = i10;
            this.f30505c = i11;
            this.f30506d = i12;
        }

        static c a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* compiled from: LruGarbageCollector */
    private static class d {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator<Long> f30507c = p0.f38468a;

        /* renamed from: a  reason: collision with root package name */
        private final PriorityQueue<Long> f30508a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30509b;

        d(int i10) {
            this.f30509b = i10;
            this.f30508a = new PriorityQueue<>(i10, f30507c);
        }

        /* access modifiers changed from: package-private */
        public void b(Long l10) {
            if (this.f30508a.size() < this.f30509b) {
                this.f30508a.add(l10);
            } else if (l10.longValue() < this.f30508a.peek().longValue()) {
                this.f30508a.poll();
                this.f30508a.add(l10);
            }
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return this.f30508a.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f30491c = timeUnit.toMillis(1);
        f30492d = timeUnit.toMillis(5);
    }

    o0(k0 k0Var, b bVar) {
        this.f30493a = k0Var;
        this.f30494b = bVar;
    }

    private c m(SparseArray<?> sparseArray) {
        long currentTimeMillis = System.currentTimeMillis();
        int e10 = e(this.f30494b.f30501b);
        if (e10 > this.f30494b.f30502c) {
            v.a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f30494b.f30502c + " from " + e10, new Object[0]);
            e10 = this.f30494b.f30502c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long h10 = h(e10);
        long currentTimeMillis3 = System.currentTimeMillis();
        int l10 = l(h10, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int k10 = k(h10);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (v.c()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LRU Garbage Collection:\n" + "\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", new Object[]{Integer.valueOf(e10), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)}));
            v.a("LruGarbageCollector", ((sb2.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", new Object[]{Integer.valueOf(l10), Long.valueOf(currentTimeMillis4 - currentTimeMillis3)})) + String.format(locale, "\tRemoved %d documents in %dms\n", new Object[]{Integer.valueOf(k10), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)})) + String.format(locale, "Total Duration: %dms", new Object[]{Long.valueOf(currentTimeMillis5 - currentTimeMillis)}), new Object[0]);
        }
        return new c(true, e10, l10, k10);
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        return (int) ((((float) i10) / 100.0f) * ((float) this.f30493a.m()));
    }

    /* access modifiers changed from: package-private */
    public c f(SparseArray<?> sparseArray) {
        if (this.f30494b.f30500a == -1) {
            v.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return c.a();
        }
        long g10 = g();
        if (g10 >= this.f30494b.f30500a) {
            return m(sparseArray);
        }
        v.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + g10 + " is lower than threshold " + this.f30494b.f30500a, new Object[0]);
        return c.a();
    }

    /* access modifiers changed from: package-private */
    public long g() {
        return this.f30493a.o();
    }

    /* access modifiers changed from: package-private */
    public long h(int i10) {
        if (i10 == 0) {
            return -1;
        }
        d dVar = new d(i10);
        this.f30493a.b(new l0(dVar));
        this.f30493a.p(new m0(dVar));
        return dVar.c();
    }

    public a j(g gVar, i0 i0Var) {
        return new a(gVar, i0Var);
    }

    /* access modifiers changed from: package-private */
    public int k(long j10) {
        return this.f30493a.n(j10);
    }

    /* access modifiers changed from: package-private */
    public int l(long j10, SparseArray<?> sparseArray) {
        return this.f30493a.a(j10, sparseArray);
    }
}
