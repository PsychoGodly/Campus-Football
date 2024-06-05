package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class lk implements o1 {

    /* renamed from: b  reason: collision with root package name */
    private int f9238b;

    /* renamed from: c  reason: collision with root package name */
    private float f9239c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f9240d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private o1.a f9241e;

    /* renamed from: f  reason: collision with root package name */
    private o1.a f9242f;

    /* renamed from: g  reason: collision with root package name */
    private o1.a f9243g;

    /* renamed from: h  reason: collision with root package name */
    private o1.a f9244h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9245i;

    /* renamed from: j  reason: collision with root package name */
    private kk f9246j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f9247k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f9248l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f9249m;

    /* renamed from: n  reason: collision with root package name */
    private long f9250n;

    /* renamed from: o  reason: collision with root package name */
    private long f9251o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9252p;

    public lk() {
        o1.a aVar = o1.a.f10045e;
        this.f9241e = aVar;
        this.f9242f = aVar;
        this.f9243g = aVar;
        this.f9244h = aVar;
        ByteBuffer byteBuffer = o1.f10044a;
        this.f9247k = byteBuffer;
        this.f9248l = byteBuffer.asShortBuffer();
        this.f9249m = byteBuffer;
        this.f9238b = -1;
    }

    public o1.a a(o1.a aVar) {
        if (aVar.f10048c == 2) {
            int i10 = this.f9238b;
            if (i10 == -1) {
                i10 = aVar.f10046a;
            }
            this.f9241e = aVar;
            o1.a aVar2 = new o1.a(i10, aVar.f10047b, 2);
            this.f9242f = aVar2;
            this.f9245i = true;
            return aVar2;
        }
        throw new o1.b(aVar);
    }

    public void b() {
        if (f()) {
            o1.a aVar = this.f9241e;
            this.f9243g = aVar;
            o1.a aVar2 = this.f9242f;
            this.f9244h = aVar2;
            if (this.f9245i) {
                this.f9246j = new kk(aVar.f10046a, aVar.f10047b, this.f9239c, this.f9240d, aVar2.f10046a);
            } else {
                kk kkVar = this.f9246j;
                if (kkVar != null) {
                    kkVar.a();
                }
            }
        }
        this.f9249m = o1.f10044a;
        this.f9250n = 0;
        this.f9251o = 0;
        this.f9252p = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f9246j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r1 = this;
            boolean r0 = r1.f9252p
            if (r0 == 0) goto L_0x0010
            com.applovin.impl.kk r0 = r1.f9246j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.b()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.lk.c():boolean");
    }

    public ByteBuffer d() {
        int b10;
        kk kkVar = this.f9246j;
        if (kkVar != null && (b10 = kkVar.b()) > 0) {
            if (this.f9247k.capacity() < b10) {
                ByteBuffer order = ByteBuffer.allocateDirect(b10).order(ByteOrder.nativeOrder());
                this.f9247k = order;
                this.f9248l = order.asShortBuffer();
            } else {
                this.f9247k.clear();
                this.f9248l.clear();
            }
            kkVar.a(this.f9248l);
            this.f9251o += (long) b10;
            this.f9247k.limit(b10);
            this.f9249m = this.f9247k;
        }
        ByteBuffer byteBuffer = this.f9249m;
        this.f9249m = o1.f10044a;
        return byteBuffer;
    }

    public void e() {
        kk kkVar = this.f9246j;
        if (kkVar != null) {
            kkVar.e();
        }
        this.f9252p = true;
    }

    public boolean f() {
        return this.f9242f.f10046a != -1 && (Math.abs(this.f9239c - 1.0f) >= 1.0E-4f || Math.abs(this.f9240d - 1.0f) >= 1.0E-4f || this.f9242f.f10046a != this.f9241e.f10046a);
    }

    public void reset() {
        this.f9239c = 1.0f;
        this.f9240d = 1.0f;
        o1.a aVar = o1.a.f10045e;
        this.f9241e = aVar;
        this.f9242f = aVar;
        this.f9243g = aVar;
        this.f9244h = aVar;
        ByteBuffer byteBuffer = o1.f10044a;
        this.f9247k = byteBuffer;
        this.f9248l = byteBuffer.asShortBuffer();
        this.f9249m = byteBuffer;
        this.f9238b = -1;
        this.f9245i = false;
        this.f9246j = null;
        this.f9250n = 0;
        this.f9251o = 0;
        this.f9252p = false;
    }

    public long a(long j10) {
        if (this.f9251o < 1024) {
            return (long) (((double) this.f9239c) * ((double) j10));
        }
        long c10 = this.f9250n - ((long) ((kk) a1.a((Object) this.f9246j)).c());
        int i10 = this.f9244h.f10046a;
        int i11 = this.f9243g.f10046a;
        if (i10 == i11) {
            return yp.c(j10, c10, this.f9251o);
        }
        return yp.c(j10, c10 * ((long) i10), this.f9251o * ((long) i11));
    }

    public void b(float f10) {
        if (this.f9239c != f10) {
            this.f9239c = f10;
            this.f9245i = true;
        }
    }

    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f9250n += (long) remaining;
            ((kk) a1.a((Object) this.f9246j)).b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void a(float f10) {
        if (this.f9240d != f10) {
            this.f9240d = f10;
            this.f9245i = true;
        }
    }
}
