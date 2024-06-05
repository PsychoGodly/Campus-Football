package p2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import k4.a;
import k4.n0;
import p2.g;

/* compiled from: SonicAudioProcessor */
public final class m0 implements g {

    /* renamed from: b  reason: collision with root package name */
    private int f21318b;

    /* renamed from: c  reason: collision with root package name */
    private float f21319c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f21320d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private g.a f21321e;

    /* renamed from: f  reason: collision with root package name */
    private g.a f21322f;

    /* renamed from: g  reason: collision with root package name */
    private g.a f21323g;

    /* renamed from: h  reason: collision with root package name */
    private g.a f21324h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21325i;

    /* renamed from: j  reason: collision with root package name */
    private l0 f21326j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f21327k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f21328l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f21329m;

    /* renamed from: n  reason: collision with root package name */
    private long f21330n;

    /* renamed from: o  reason: collision with root package name */
    private long f21331o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21332p;

    public m0() {
        g.a aVar = g.a.f21264e;
        this.f21321e = aVar;
        this.f21322f = aVar;
        this.f21323g = aVar;
        this.f21324h = aVar;
        ByteBuffer byteBuffer = g.f21263a;
        this.f21327k = byteBuffer;
        this.f21328l = byteBuffer.asShortBuffer();
        this.f21329m = byteBuffer;
        this.f21318b = -1;
    }

    public ByteBuffer a() {
        int k10;
        l0 l0Var = this.f21326j;
        if (l0Var != null && (k10 = l0Var.k()) > 0) {
            if (this.f21327k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f21327k = order;
                this.f21328l = order.asShortBuffer();
            } else {
                this.f21327k.clear();
                this.f21328l.clear();
            }
            l0Var.j(this.f21328l);
            this.f21331o += (long) k10;
            this.f21327k.limit(k10);
            this.f21329m = this.f21327k;
        }
        ByteBuffer byteBuffer = this.f21329m;
        this.f21329m = g.f21263a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f21326j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r1 = this;
            boolean r0 = r1.f21332p
            if (r0 == 0) goto L_0x0010
            p2.l0 r0 = r1.f21326j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.m0.b():boolean");
    }

    public void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f21330n += (long) remaining;
            ((l0) a.e(this.f21326j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public g.a d(g.a aVar) throws g.b {
        if (aVar.f21267c == 2) {
            int i10 = this.f21318b;
            if (i10 == -1) {
                i10 = aVar.f21265a;
            }
            this.f21321e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f21266b, 2);
            this.f21322f = aVar2;
            this.f21325i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }

    public void e() {
        l0 l0Var = this.f21326j;
        if (l0Var != null) {
            l0Var.s();
        }
        this.f21332p = true;
    }

    public long f(long j10) {
        if (this.f21331o < 1024) {
            return (long) (((double) this.f21319c) * ((double) j10));
        }
        long l10 = this.f21330n - ((long) ((l0) a.e(this.f21326j)).l());
        int i10 = this.f21324h.f21265a;
        int i11 = this.f21323g.f21265a;
        if (i10 == i11) {
            return n0.O0(j10, l10, this.f21331o);
        }
        return n0.O0(j10, l10 * ((long) i10), this.f21331o * ((long) i11));
    }

    public void flush() {
        if (isActive()) {
            g.a aVar = this.f21321e;
            this.f21323g = aVar;
            g.a aVar2 = this.f21322f;
            this.f21324h = aVar2;
            if (this.f21325i) {
                this.f21326j = new l0(aVar.f21265a, aVar.f21266b, this.f21319c, this.f21320d, aVar2.f21265a);
            } else {
                l0 l0Var = this.f21326j;
                if (l0Var != null) {
                    l0Var.i();
                }
            }
        }
        this.f21329m = g.f21263a;
        this.f21330n = 0;
        this.f21331o = 0;
        this.f21332p = false;
    }

    public void g(float f10) {
        if (this.f21320d != f10) {
            this.f21320d = f10;
            this.f21325i = true;
        }
    }

    public void h(float f10) {
        if (this.f21319c != f10) {
            this.f21319c = f10;
            this.f21325i = true;
        }
    }

    public boolean isActive() {
        return this.f21322f.f21265a != -1 && (Math.abs(this.f21319c - 1.0f) >= 1.0E-4f || Math.abs(this.f21320d - 1.0f) >= 1.0E-4f || this.f21322f.f21265a != this.f21321e.f21265a);
    }

    public void reset() {
        this.f21319c = 1.0f;
        this.f21320d = 1.0f;
        g.a aVar = g.a.f21264e;
        this.f21321e = aVar;
        this.f21322f = aVar;
        this.f21323g = aVar;
        this.f21324h = aVar;
        ByteBuffer byteBuffer = g.f21263a;
        this.f21327k = byteBuffer;
        this.f21328l = byteBuffer.asShortBuffer();
        this.f21329m = byteBuffer;
        this.f21318b = -1;
        this.f21325i = false;
        this.f21326j = null;
        this.f21330n = 0;
        this.f21331o = 0;
        this.f21332p = false;
    }
}
