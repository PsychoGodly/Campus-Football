package q2;

import java.util.ArrayDeque;
import q2.f;
import q2.g;
import q2.h;

/* compiled from: SimpleDecoder */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f21770a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f21771b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f21772c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f21773d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f21774e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f21775f;

    /* renamed from: g  reason: collision with root package name */
    private int f21776g;

    /* renamed from: h  reason: collision with root package name */
    private int f21777h;

    /* renamed from: i  reason: collision with root package name */
    private I f21778i;

    /* renamed from: j  reason: collision with root package name */
    private E f21779j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21780k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21781l;

    /* renamed from: m  reason: collision with root package name */
    private int f21782m;

    /* compiled from: SimpleDecoder */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            j.this.t();
        }
    }

    protected j(I[] iArr, O[] oArr) {
        this.f21774e = iArr;
        this.f21776g = iArr.length;
        for (int i10 = 0; i10 < this.f21776g; i10++) {
            this.f21774e[i10] = g();
        }
        this.f21775f = oArr;
        this.f21777h = oArr.length;
        for (int i11 = 0; i11 < this.f21777h; i11++) {
            this.f21775f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f21770a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f21772c.isEmpty() && this.f21777h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.l() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.f(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.k() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.f(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1.m() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r3.f(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = j(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r0 = i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = i(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f21771b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f21781l     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.f()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f21771b     // Catch:{ all -> 0x009b }
            r1.wait()     // Catch:{ all -> 0x009b }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f21781l     // Catch:{ all -> 0x009b }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f21772c     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x009b }
            q2.g r1 = (q2.g) r1     // Catch:{ all -> 0x009b }
            O[] r3 = r6.f21775f     // Catch:{ all -> 0x009b }
            int r4 = r6.f21777h     // Catch:{ all -> 0x009b }
            r5 = 1
            int r4 = r4 - r5
            r6.f21777h = r4     // Catch:{ all -> 0x009b }
            r3 = r3[r4]     // Catch:{ all -> 0x009b }
            boolean r4 = r6.f21780k     // Catch:{ all -> 0x009b }
            r6.f21780k = r2     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            boolean r0 = r1.l()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.f(r0)
            goto L_0x006e
        L_0x003c:
            boolean r0 = r1.k()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f(r0)
        L_0x0047:
            boolean r0 = r1.m()
            if (r0 == 0) goto L_0x0052
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.f(r0)
        L_0x0052:
            q2.f r0 = r6.j(r1, r3, r4)     // Catch:{ RuntimeException -> 0x005d, OutOfMemoryError -> 0x0057 }
            goto L_0x0062
        L_0x0057:
            r0 = move-exception
            q2.f r0 = r6.i(r0)
            goto L_0x0062
        L_0x005d:
            r0 = move-exception
            q2.f r0 = r6.i(r0)
        L_0x0062:
            if (r0 == 0) goto L_0x006e
            java.lang.Object r4 = r6.f21771b
            monitor-enter(r4)
            r6.f21779j = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            java.lang.Object r4 = r6.f21771b
            monitor-enter(r4)
            boolean r0 = r6.f21780k     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0079
            r3.q()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0079:
            boolean r0 = r3.k()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0088
            int r0 = r6.f21782m     // Catch:{ all -> 0x0098 }
            int r0 = r0 + r5
            r6.f21782m = r0     // Catch:{ all -> 0x0098 }
            r3.q()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0088:
            int r0 = r6.f21782m     // Catch:{ all -> 0x0098 }
            r3.f21764c = r0     // Catch:{ all -> 0x0098 }
            r6.f21782m = r2     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque<O> r0 = r6.f21773d     // Catch:{ all -> 0x0098 }
            r0.addLast(r3)     // Catch:{ all -> 0x0098 }
        L_0x0093:
            r6.q(r1)     // Catch:{ all -> 0x0098 }
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            return r5
        L_0x0098:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.j.k():boolean");
    }

    private void n() {
        if (f()) {
            this.f21771b.notify();
        }
    }

    private void o() throws f {
        E e10 = this.f21779j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void q(I i10) {
        i10.g();
        I[] iArr = this.f21774e;
        int i11 = this.f21776g;
        this.f21776g = i11 + 1;
        iArr[i11] = i10;
    }

    private void s(O o10) {
        o10.g();
        O[] oArr = this.f21775f;
        int i10 = this.f21777h;
        this.f21777h = i10 + 1;
        oArr[i10] = o10;
    }

    /* access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    public final void flush() {
        synchronized (this.f21771b) {
            this.f21780k = true;
            this.f21782m = 0;
            I i10 = this.f21778i;
            if (i10 != null) {
                q(i10);
                this.f21778i = null;
            }
            while (!this.f21772c.isEmpty()) {
                q((g) this.f21772c.removeFirst());
            }
            while (!this.f21773d.isEmpty()) {
                ((h) this.f21773d.removeFirst()).q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract I g();

    /* access modifiers changed from: protected */
    public abstract O h();

    /* access modifiers changed from: protected */
    public abstract E i(Throwable th);

    /* access modifiers changed from: protected */
    public abstract E j(I i10, O o10, boolean z10);

    /* renamed from: l */
    public final I c() throws f {
        I i10;
        synchronized (this.f21771b) {
            o();
            k4.a.f(this.f21778i == null);
            int i11 = this.f21776g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f21774e;
                int i12 = i11 - 1;
                this.f21776g = i12;
                i10 = iArr[i12];
            }
            this.f21778i = i10;
        }
        return i10;
    }

    /* renamed from: m */
    public final O b() throws f {
        synchronized (this.f21771b) {
            o();
            if (this.f21773d.isEmpty()) {
                return null;
            }
            O o10 = (h) this.f21773d.removeFirst();
            return o10;
        }
    }

    /* renamed from: p */
    public final void d(I i10) throws f {
        synchronized (this.f21771b) {
            o();
            k4.a.a(i10 == this.f21778i);
            this.f21772c.addLast(i10);
            n();
            this.f21778i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void r(O o10) {
        synchronized (this.f21771b) {
            s(o10);
            n();
        }
    }

    public void release() {
        synchronized (this.f21771b) {
            this.f21781l = true;
            this.f21771b.notify();
        }
        try {
            this.f21770a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public final void u(int i10) {
        k4.a.f(this.f21776g == this.f21774e.length);
        for (I r10 : this.f21774e) {
            r10.r(i10);
        }
    }
}
