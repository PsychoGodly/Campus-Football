package ef;

import bf.b0;
import bf.d;
import bf.i;
import bf.o;
import bf.s;
import bf.u;
import ef.f;
import ff.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* compiled from: StreamAllocation */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final bf.a f32562a;

    /* renamed from: b  reason: collision with root package name */
    private f.a f32563b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f32564c;

    /* renamed from: d  reason: collision with root package name */
    private final i f32565d;

    /* renamed from: e  reason: collision with root package name */
    public final d f32566e;

    /* renamed from: f  reason: collision with root package name */
    public final o f32567f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f32568g;

    /* renamed from: h  reason: collision with root package name */
    private final f f32569h;

    /* renamed from: i  reason: collision with root package name */
    private int f32570i;

    /* renamed from: j  reason: collision with root package name */
    private c f32571j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32572k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32573l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f32574m;

    /* renamed from: n  reason: collision with root package name */
    private c f32575n;

    /* compiled from: StreamAllocation */
    public static final class a extends WeakReference<g> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f32576a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f32576a = obj;
        }
    }

    public g(i iVar, bf.a aVar, d dVar, o oVar, Object obj) {
        this.f32565d = iVar;
        this.f32562a = aVar;
        this.f32566e = dVar;
        this.f32567f = oVar;
        this.f32569h = new f(aVar, p(), dVar, oVar);
        this.f32568g = obj;
    }

    private Socket e(boolean z10, boolean z11, boolean z12) {
        Socket socket;
        if (z12) {
            this.f32575n = null;
        }
        if (z11) {
            this.f32573l = true;
        }
        c cVar = this.f32571j;
        if (cVar == null) {
            return null;
        }
        if (z10) {
            cVar.f32544k = true;
        }
        if (this.f32575n != null) {
            return null;
        }
        if (!this.f32573l && !cVar.f32544k) {
            return null;
        }
        l(cVar);
        if (this.f32571j.f32547n.isEmpty()) {
            this.f32571j.f32548o = System.nanoTime();
            if (cf.a.f31981a.e(this.f32565d, this.f32571j)) {
                socket = this.f32571j.q();
                this.f32571j = null;
                return socket;
            }
        }
        socket = null;
        this.f32571j = null;
        return socket;
    }

    private c f(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        c cVar;
        Socket n10;
        c cVar2;
        Socket socket;
        boolean z11;
        b0 b0Var;
        boolean z12;
        f.a aVar;
        synchronized (this.f32565d) {
            if (this.f32573l) {
                throw new IllegalStateException("released");
            } else if (this.f32575n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f32574m) {
                cVar = this.f32571j;
                n10 = n();
                cVar2 = this.f32571j;
                socket = null;
                if (cVar2 != null) {
                    cVar = null;
                } else {
                    cVar2 = null;
                }
                if (!this.f32572k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    cf.a.f31981a.h(this.f32565d, this.f32562a, this, (b0) null);
                    c cVar3 = this.f32571j;
                    if (cVar3 != null) {
                        cVar2 = cVar3;
                        z11 = true;
                        b0Var = null;
                    } else {
                        b0Var = this.f32564c;
                    }
                } else {
                    b0Var = null;
                }
                z11 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        cf.c.h(n10);
        if (cVar != null) {
            this.f32567f.h(this.f32566e, cVar);
        }
        if (z11) {
            this.f32567f.g(this.f32566e, cVar2);
        }
        if (cVar2 != null) {
            this.f32564c = this.f32571j.p();
            return cVar2;
        }
        if (b0Var != null || ((aVar = this.f32563b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f32563b = this.f32569h.e();
            z12 = true;
        }
        synchronized (this.f32565d) {
            if (!this.f32574m) {
                if (z12) {
                    List<b0> a10 = this.f32563b.a();
                    int size = a10.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        b0 b0Var2 = a10.get(i14);
                        cf.a.f31981a.h(this.f32565d, this.f32562a, this, b0Var2);
                        c cVar4 = this.f32571j;
                        if (cVar4 != null) {
                            this.f32564c = b0Var2;
                            cVar2 = cVar4;
                            z11 = true;
                            break;
                        }
                        i14++;
                    }
                }
                if (!z11) {
                    if (b0Var == null) {
                        b0Var = this.f32563b.c();
                    }
                    this.f32564c = b0Var;
                    this.f32570i = 0;
                    cVar2 = new c(this.f32565d, b0Var);
                    a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z11) {
            this.f32567f.g(this.f32566e, cVar2);
            return cVar2;
        }
        cVar2.d(i10, i11, i12, i13, z10, this.f32566e, this.f32567f);
        p().a(cVar2.p());
        synchronized (this.f32565d) {
            this.f32572k = true;
            cf.a.f31981a.i(this.f32565d, cVar2);
            if (cVar2.n()) {
                socket = cf.a.f31981a.f(this.f32565d, this.f32562a, this);
                cVar2 = this.f32571j;
            }
        }
        cf.c.h(socket);
        this.f32567f.g(this.f32566e, cVar2);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.m(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ef.c g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            ef.c r0 = r3.f(r4, r5, r6, r7, r8)
            bf.i r1 = r3.f32565d
            monitor-enter(r1)
            int r2 = r0.f32545l     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.n()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.m(r9)
            if (r1 != 0) goto L_0x001e
            r3.j()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.g.g(int, int, int, int, boolean, boolean):ef.c");
    }

    private void l(c cVar) {
        int size = cVar.f32547n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f32547n.get(i10).get() == this) {
                cVar.f32547n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket n() {
        c cVar = this.f32571j;
        if (cVar == null || !cVar.f32544k) {
            return null;
        }
        return e(false, false, true);
    }

    private d p() {
        return cf.a.f31981a.j(this.f32565d);
    }

    public void a(c cVar, boolean z10) {
        if (this.f32571j == null) {
            this.f32571j = cVar;
            this.f32572k = z10;
            cVar.f32547n.add(new a(this, this.f32568g));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        c cVar;
        c cVar2;
        synchronized (this.f32565d) {
            this.f32574m = true;
            cVar = this.f32575n;
            cVar2 = this.f32571j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.c();
        }
    }

    public c c() {
        c cVar;
        synchronized (this.f32565d) {
            cVar = this.f32575n;
        }
        return cVar;
    }

    public synchronized c d() {
        return this.f32571j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f32563b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r1 = this;
            bf.b0 r0 = r1.f32564c
            if (r0 != 0) goto L_0x0019
            ef.f$a r0 = r1.f32563b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            ef.f r0 = r1.f32569h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.g.h():boolean");
    }

    public c i(u uVar, s.a aVar, boolean z10) {
        try {
            c o10 = g(aVar.c(), aVar.a(), aVar.b(), uVar.x(), uVar.E(), z10).o(uVar, aVar, this);
            synchronized (this.f32565d) {
                this.f32575n = o10;
            }
            return o10;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public void j() {
        c cVar;
        Socket e10;
        synchronized (this.f32565d) {
            cVar = this.f32571j;
            e10 = e(true, false, false);
            if (this.f32571j != null) {
                cVar = null;
            }
        }
        cf.c.h(e10);
        if (cVar != null) {
            this.f32567f.h(this.f32566e, cVar);
        }
    }

    public void k() {
        c cVar;
        Socket e10;
        synchronized (this.f32565d) {
            cVar = this.f32571j;
            e10 = e(false, true, false);
            if (this.f32571j != null) {
                cVar = null;
            }
        }
        cf.c.h(e10);
        if (cVar != null) {
            cf.a.f31981a.k(this.f32566e, (IOException) null);
            this.f32567f.h(this.f32566e, cVar);
            this.f32567f.a(this.f32566e);
        }
    }

    public Socket m(c cVar) {
        if (this.f32575n == null && this.f32571j.f32547n.size() == 1) {
            Socket e10 = e(true, false, false);
            this.f32571j = cVar;
            cVar.f32547n.add(this.f32571j.f32547n.get(0));
            return e10;
        }
        throw new IllegalStateException();
    }

    public b0 o() {
        return this.f32564c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.io.IOException r7) {
        /*
            r6 = this;
            bf.i r0 = r6.f32565d
            monitor-enter(r0)
            boolean r1 = r7 instanceof hf.n     // Catch:{ all -> 0x0065 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            hf.n r7 = (hf.n) r7     // Catch:{ all -> 0x0065 }
            hf.b r7 = r7.f33241a     // Catch:{ all -> 0x0065 }
            hf.b r1 = hf.b.REFUSED_STREAM     // Catch:{ all -> 0x0065 }
            if (r7 != r1) goto L_0x001c
            int r7 = r6.f32570i     // Catch:{ all -> 0x0065 }
            int r7 = r7 + r4
            r6.f32570i = r7     // Catch:{ all -> 0x0065 }
            if (r7 <= r4) goto L_0x0046
            r6.f32564c = r3     // Catch:{ all -> 0x0065 }
            goto L_0x0044
        L_0x001c:
            hf.b r1 = hf.b.CANCEL     // Catch:{ all -> 0x0065 }
            if (r7 == r1) goto L_0x0046
            r6.f32564c = r3     // Catch:{ all -> 0x0065 }
            goto L_0x0044
        L_0x0023:
            ef.c r1 = r6.f32571j     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r1.n()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof hf.a     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0046
        L_0x0031:
            ef.c r1 = r6.f32571j     // Catch:{ all -> 0x0065 }
            int r1 = r1.f32545l     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0044
            bf.b0 r1 = r6.f32564c     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            ef.f r5 = r6.f32569h     // Catch:{ all -> 0x0065 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0065 }
        L_0x0042:
            r6.f32564c = r3     // Catch:{ all -> 0x0065 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            ef.c r1 = r6.f32571j     // Catch:{ all -> 0x0065 }
            java.net.Socket r7 = r6.e(r7, r2, r4)     // Catch:{ all -> 0x0065 }
            ef.c r2 = r6.f32571j     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.f32572k     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            cf.c.h(r7)
            if (r3 == 0) goto L_0x0064
            bf.o r7 = r6.f32567f
            bf.d r0 = r6.f32566e
            r7.h(r0, r3)
        L_0x0064:
            return
        L_0x0065:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.g.q(java.io.IOException):void");
    }

    public void r(boolean z10, c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket e10;
        boolean z11;
        this.f32567f.p(this.f32566e, j10);
        synchronized (this.f32565d) {
            if (cVar != null) {
                if (cVar == this.f32575n) {
                    if (!z10) {
                        this.f32571j.f32545l++;
                    }
                    cVar2 = this.f32571j;
                    e10 = e(z10, false, true);
                    if (this.f32571j != null) {
                        cVar2 = null;
                    }
                    z11 = this.f32573l;
                }
            }
            throw new IllegalStateException("expected " + this.f32575n + " but was " + cVar);
        }
        cf.c.h(e10);
        if (cVar2 != null) {
            this.f32567f.h(this.f32566e, cVar2);
        }
        if (iOException != null) {
            this.f32567f.b(this.f32566e, cf.a.f31981a.k(this.f32566e, iOException));
        } else if (z11) {
            cf.a.f31981a.k(this.f32566e, (IOException) null);
            this.f32567f.a(this.f32566e);
        }
    }

    public String toString() {
        c d10 = d();
        return d10 != null ? d10.toString() : this.f32562a.toString();
    }
}
