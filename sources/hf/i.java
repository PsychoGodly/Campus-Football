package hf;

import bf.q;
import hf.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import lf.e;
import lf.r;
import lf.s;
import lf.t;

/* compiled from: Http2Stream */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    long f33201a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f33202b;

    /* renamed from: c  reason: collision with root package name */
    final int f33203c;

    /* renamed from: d  reason: collision with root package name */
    final g f33204d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Deque<q> f33205e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c.a f33206f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33207g;

    /* renamed from: h  reason: collision with root package name */
    private final b f33208h;

    /* renamed from: i  reason: collision with root package name */
    final a f33209i;

    /* renamed from: j  reason: collision with root package name */
    final c f33210j;

    /* renamed from: k  reason: collision with root package name */
    final c f33211k;

    /* renamed from: l  reason: collision with root package name */
    b f33212l;

    /* compiled from: Http2Stream */
    final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        private final lf.c f33213a = new lf.c();

        /* renamed from: b  reason: collision with root package name */
        boolean f33214b;

        /* renamed from: c  reason: collision with root package name */
        boolean f33215c;

        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f33211k.u();
            r11.f33216d.e();
            r9 = java.lang.Math.min(r11.f33216d.f33202b, r11.f33213a.v0());
            r1 = r11.f33216d;
            r1.f33202b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void h(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                hf.i r0 = hf.i.this
                monitor-enter(r0)
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x007f }
                hf.i$c r1 = r1.f33211k     // Catch:{ all -> 0x007f }
                r1.k()     // Catch:{ all -> 0x007f }
            L_0x000a:
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x0076 }
                long r2 = r1.f33202b     // Catch:{ all -> 0x0076 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f33215c     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f33214b     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                hf.b r2 = r1.f33212l     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                r1.t()     // Catch:{ all -> 0x0076 }
                goto L_0x000a
            L_0x0024:
                hf.i$c r1 = r1.f33211k     // Catch:{ all -> 0x007f }
                r1.u()     // Catch:{ all -> 0x007f }
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x007f }
                r1.e()     // Catch:{ all -> 0x007f }
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x007f }
                long r1 = r1.f33202b     // Catch:{ all -> 0x007f }
                lf.c r3 = r11.f33213a     // Catch:{ all -> 0x007f }
                long r3 = r3.v0()     // Catch:{ all -> 0x007f }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x007f }
                long r2 = r1.f33202b     // Catch:{ all -> 0x007f }
                long r2 = r2 - r9
                r1.f33202b = r2     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                hf.i$c r0 = r1.f33211k
                r0.k()
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x006d }
                hf.g r5 = r0.f33204d     // Catch:{ all -> 0x006d }
                int r6 = r0.f33203c     // Catch:{ all -> 0x006d }
                if (r12 == 0) goto L_0x005e
                lf.c r12 = r11.f33213a     // Catch:{ all -> 0x006d }
                long r0 = r12.v0()     // Catch:{ all -> 0x006d }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005e
                r12 = 1
                r7 = 1
                goto L_0x0060
            L_0x005e:
                r12 = 0
                r7 = 0
            L_0x0060:
                lf.c r8 = r11.f33213a     // Catch:{ all -> 0x006d }
                r5.b1(r6, r7, r8, r9)     // Catch:{ all -> 0x006d }
                hf.i r12 = hf.i.this
                hf.i$c r12 = r12.f33211k
                r12.u()
                return
            L_0x006d:
                r12 = move-exception
                hf.i r0 = hf.i.this
                hf.i$c r0 = r0.f33211k
                r0.u()
                throw r12
            L_0x0076:
                r12 = move-exception
                hf.i r1 = hf.i.this     // Catch:{ all -> 0x007f }
                hf.i$c r1 = r1.f33211k     // Catch:{ all -> 0x007f }
                r1.u()     // Catch:{ all -> 0x007f }
                throw r12     // Catch:{ all -> 0x007f }
            L_0x007f:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.i.a.h(boolean):void");
        }

        public void V0(lf.c cVar, long j10) throws IOException {
            this.f33213a.V0(cVar, j10);
            while (this.f33213a.v0() >= 16384) {
                h(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f33213a.v0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f33213a.v0() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            h(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f33216d;
            r0.f33204d.b1(r0.f33203c, true, (lf.c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f33216d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f33214b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f33216d.f33204d.flush();
            r8.f33216d.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f33216d.f33209i.f33215c != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                hf.i r0 = hf.i.this
                monitor-enter(r0)
                boolean r1 = r8.f33214b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                hf.i r0 = hf.i.this
                hf.i$a r0 = r0.f33209i
                boolean r0 = r0.f33215c
                r1 = 1
                if (r0 != 0) goto L_0x003a
                lf.c r0 = r8.f33213a
                long r2 = r0.v0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                lf.c r0 = r8.f33213a
                long r2 = r0.v0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.h(r1)
                goto L_0x001f
            L_0x002d:
                hf.i r0 = hf.i.this
                hf.g r2 = r0.f33204d
                int r3 = r0.f33203c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.b1(r3, r4, r5, r6)
            L_0x003a:
                hf.i r2 = hf.i.this
                monitor-enter(r2)
                r8.f33214b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                hf.i r0 = hf.i.this
                hf.g r0 = r0.f33204d
                r0.flush()
                hf.i r0 = hf.i.this
                r0.d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.i.a.close():void");
        }

        public t e() {
            return i.this.f33211k;
        }

        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.e();
            }
            while (this.f33213a.v0() > 0) {
                h(false);
                i.this.f33204d.flush();
            }
        }
    }

    /* compiled from: Http2Stream */
    private final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final lf.c f33217a = new lf.c();

        /* renamed from: b  reason: collision with root package name */
        private final lf.c f33218b = new lf.c();

        /* renamed from: c  reason: collision with root package name */
        private final long f33219c;

        /* renamed from: d  reason: collision with root package name */
        boolean f33220d;

        /* renamed from: f  reason: collision with root package name */
        boolean f33221f;

        b(long j10) {
            this.f33219c = j10;
        }

        private void i(long j10) {
            i.this.f33204d.a1(j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: bf.q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long P(lf.c r17, long r18) throws java.io.IOException {
            /*
                r16 = this;
                r1 = r16
                r2 = r18
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x00e0
            L_0x000a:
                hf.i r6 = hf.i.this
                monitor-enter(r6)
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00dd }
                hf.i$c r0 = r0.f33210j     // Catch:{ all -> 0x00dd }
                r0.k()     // Catch:{ all -> 0x00dd }
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                hf.b r7 = r0.f33212l     // Catch:{ all -> 0x00d4 }
                if (r7 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r7 = 0
            L_0x001c:
                boolean r9 = r1.f33220d     // Catch:{ all -> 0x00d4 }
                if (r9 != 0) goto L_0x00cc
                java.util.Deque r0 = r0.f33205e     // Catch:{ all -> 0x00d4 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x0049
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                hf.c$a r0 = r0.f33206f     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0049
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                java.util.Deque r0 = r0.f33205e     // Catch:{ all -> 0x00d4 }
                java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x00d4 }
                r8 = r0
                bf.q r8 = (bf.q) r8     // Catch:{ all -> 0x00d4 }
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                hf.c$a r0 = r0.f33206f     // Catch:{ all -> 0x00d4 }
                r13 = r17
                r10 = r0
                goto L_0x00a6
            L_0x0049:
                lf.c r0 = r1.f33218b     // Catch:{ all -> 0x00d4 }
                long r11 = r0.v0()     // Catch:{ all -> 0x00d4 }
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x008d
                lf.c r0 = r1.f33218b     // Catch:{ all -> 0x00d4 }
                long r11 = r0.v0()     // Catch:{ all -> 0x00d4 }
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x00d4 }
                r13 = r17
                long r11 = r0.P(r13, r11)     // Catch:{ all -> 0x00d4 }
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                long r14 = r0.f33201a     // Catch:{ all -> 0x00d4 }
                long r14 = r14 + r11
                r0.f33201a = r14     // Catch:{ all -> 0x00d4 }
                if (r7 != 0) goto L_0x008a
                hf.g r0 = r0.f33204d     // Catch:{ all -> 0x00d4 }
                hf.m r0 = r0.f33140u     // Catch:{ all -> 0x00d4 }
                int r0 = r0.d()     // Catch:{ all -> 0x00d4 }
                int r0 = r0 / 2
                long r8 = (long) r0     // Catch:{ all -> 0x00d4 }
                int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x008a
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                hf.g r8 = r0.f33204d     // Catch:{ all -> 0x00d4 }
                int r9 = r0.f33203c     // Catch:{ all -> 0x00d4 }
                long r14 = r0.f33201a     // Catch:{ all -> 0x00d4 }
                r8.f1(r9, r14)     // Catch:{ all -> 0x00d4 }
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                r0.f33201a = r4     // Catch:{ all -> 0x00d4 }
            L_0x008a:
                r8 = 0
                r10 = 0
                goto L_0x00a8
            L_0x008d:
                r13 = r17
                boolean r0 = r1.f33221f     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x00a4
                if (r7 != 0) goto L_0x00a4
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00d4 }
                r0.t()     // Catch:{ all -> 0x00d4 }
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00dd }
                hf.i$c r0 = r0.f33210j     // Catch:{ all -> 0x00dd }
                r0.u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                goto L_0x000a
            L_0x00a4:
                r8 = 0
                r10 = 0
            L_0x00a6:
                r11 = -1
            L_0x00a8:
                hf.i r0 = hf.i.this     // Catch:{ all -> 0x00dd }
                hf.i$c r0 = r0.f33210j     // Catch:{ all -> 0x00dd }
                r0.u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                if (r8 == 0) goto L_0x00b9
                if (r10 == 0) goto L_0x00b9
                r10.a(r8)
                goto L_0x000a
            L_0x00b9:
                r2 = -1
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00c3
                r1.i(r11)
                return r11
            L_0x00c3:
                if (r7 != 0) goto L_0x00c6
                return r2
            L_0x00c6:
                hf.n r0 = new hf.n
                r0.<init>(r7)
                throw r0
            L_0x00cc:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x00d4 }
                throw r0     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r0 = move-exception
                hf.i r2 = hf.i.this     // Catch:{ all -> 0x00dd }
                hf.i$c r2 = r2.f33210j     // Catch:{ all -> 0x00dd }
                r2.u()     // Catch:{ all -> 0x00dd }
                throw r0     // Catch:{ all -> 0x00dd }
            L_0x00dd:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                throw r0
            L_0x00e0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "byteCount < 0: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.i.b.P(lf.c, long):long");
        }

        public void close() throws IOException {
            long v02;
            c.a aVar;
            ArrayList<q> arrayList;
            synchronized (i.this) {
                this.f33220d = true;
                v02 = this.f33218b.v0();
                this.f33218b.i();
                aVar = null;
                if (i.this.f33205e.isEmpty() || i.this.f33206f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(i.this.f33205e);
                    i.this.f33205e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = i.this.f33206f;
                    arrayList = arrayList3;
                }
                i.this.notifyAll();
            }
            if (v02 > 0) {
                i(v02);
            }
            i.this.d();
            if (aVar != null) {
                for (q a10 : arrayList) {
                    aVar.a(a10);
                }
            }
        }

        public t e() {
            return i.this.f33210j;
        }

        /* access modifiers changed from: package-private */
        public void h(e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f33221f;
                    z11 = true;
                    z12 = this.f33218b.v0() + j10 > this.f33219c;
                }
                if (z12) {
                    eVar.skip(j10);
                    i.this.h(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    eVar.skip(j10);
                    return;
                } else {
                    long P = eVar.P(this.f33217a, j10);
                    if (P != -1) {
                        j10 -= P;
                        synchronized (i.this) {
                            if (this.f33220d) {
                                j11 = this.f33217a.v0();
                                this.f33217a.i();
                            } else {
                                if (this.f33218b.v0() != 0) {
                                    z11 = false;
                                }
                                this.f33218b.p(this.f33217a);
                                if (z11) {
                                    i.this.notifyAll();
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 > 0) {
                            i(j11);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* compiled from: Http2Stream */
    class c extends lf.a {
        c() {
        }

        /* access modifiers changed from: protected */
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void t() {
            i.this.h(b.CANCEL);
            i.this.f33204d.Q0();
        }

        public void u() throws IOException {
            if (n()) {
                throw o((IOException) null);
            }
        }
    }

    i(int i10, g gVar, boolean z10, boolean z11, q qVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f33205e = arrayDeque;
        this.f33210j = new c();
        this.f33211k = new c();
        this.f33212l = null;
        Objects.requireNonNull(gVar, "connection == null");
        this.f33203c = i10;
        this.f33204d = gVar;
        this.f33202b = (long) gVar.f33141v.d();
        b bVar = new b((long) gVar.f33140u.d());
        this.f33208h = bVar;
        a aVar = new a();
        this.f33209i = aVar;
        bVar.f33221f = z11;
        aVar.f33215c = z10;
        if (qVar != null) {
            arrayDeque.add(qVar);
        }
        if (l() && qVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!l() && qVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean g(b bVar) {
        synchronized (this) {
            if (this.f33212l != null) {
                return false;
            }
            if (this.f33208h.f33221f && this.f33209i.f33215c) {
                return false;
            }
            this.f33212l = bVar;
            notifyAll();
            this.f33204d.G0(this.f33203c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j10) {
        this.f33202b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() throws IOException {
        boolean z10;
        boolean m10;
        synchronized (this) {
            b bVar = this.f33208h;
            if (!bVar.f33221f && bVar.f33220d) {
                a aVar = this.f33209i;
                if (aVar.f33215c || aVar.f33214b) {
                    z10 = true;
                    m10 = m();
                }
            }
            z10 = false;
            m10 = m();
        }
        if (z10) {
            f(b.CANCEL);
        } else if (!m10) {
            this.f33204d.G0(this.f33203c);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() throws IOException {
        a aVar = this.f33209i;
        if (aVar.f33214b) {
            throw new IOException("stream closed");
        } else if (aVar.f33215c) {
            throw new IOException("stream finished");
        } else if (this.f33212l != null) {
            throw new n(this.f33212l);
        }
    }

    public void f(b bVar) throws IOException {
        if (g(bVar)) {
            this.f33204d.d1(this.f33203c, bVar);
        }
    }

    public void h(b bVar) {
        if (g(bVar)) {
            this.f33204d.e1(this.f33203c, bVar);
        }
    }

    public int i() {
        return this.f33203c;
    }

    public r j() {
        synchronized (this) {
            if (!this.f33207g) {
                if (!l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f33209i;
    }

    public s k() {
        return this.f33208h;
    }

    public boolean l() {
        if (this.f33204d.f33121a == ((this.f33203c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean m() {
        if (this.f33212l != null) {
            return false;
        }
        b bVar = this.f33208h;
        if (bVar.f33221f || bVar.f33220d) {
            a aVar = this.f33209i;
            if ((aVar.f33215c || aVar.f33214b) && this.f33207g) {
                return false;
            }
        }
        return true;
    }

    public t n() {
        return this.f33210j;
    }

    /* access modifiers changed from: package-private */
    public void o(e eVar, int i10) throws IOException {
        this.f33208h.h(eVar, (long) i10);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        boolean m10;
        synchronized (this) {
            this.f33208h.f33221f = true;
            m10 = m();
            notifyAll();
        }
        if (!m10) {
            this.f33204d.G0(this.f33203c);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(List<c> list) {
        boolean m10;
        synchronized (this) {
            this.f33207g = true;
            this.f33205e.add(cf.c.H(list));
            m10 = m();
            notifyAll();
        }
        if (!m10) {
            this.f33204d.G0(this.f33203c);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(b bVar) {
        if (this.f33212l == null) {
            this.f33212l = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f33210j.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized bf.q s() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            hf.i$c r0 = r2.f33210j     // Catch:{ all -> 0x003c }
            r0.k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<bf.q> r0 = r2.f33205e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            hf.b r0 = r2.f33212l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            hf.i$c r0 = r2.f33210j     // Catch:{ all -> 0x003c }
            r0.u()     // Catch:{ all -> 0x003c }
            java.util.Deque<bf.q> r0 = r2.f33205e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<bf.q> r0 = r2.f33205e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            bf.q r0 = (bf.q) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            hf.n r0 = new hf.n     // Catch:{ all -> 0x003c }
            hf.b r1 = r2.f33212l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            hf.i$c r1 = r2.f33210j     // Catch:{ all -> 0x003c }
            r1.u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.i.s():bf.q");
    }

    /* access modifiers changed from: package-private */
    public void t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t u() {
        return this.f33211k;
    }
}
