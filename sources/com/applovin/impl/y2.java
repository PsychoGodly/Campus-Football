package com.applovin.impl;

import com.applovin.impl.wg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class y2 implements ll {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f13484a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f13485b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue f13486c;

    /* renamed from: d  reason: collision with root package name */
    private b f13487d;

    /* renamed from: e  reason: collision with root package name */
    private long f13488e;

    /* renamed from: f  reason: collision with root package name */
    private long f13489f;

    private static final class b extends ol implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public long f13490k;

        private b() {
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            if (e() == bVar.e()) {
                long j10 = this.f9908f - bVar.f9908f;
                if (j10 == 0) {
                    j10 = this.f13490k - bVar.f13490k;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
                return -1;
            } else if (e()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    private static final class c extends pl {

        /* renamed from: g  reason: collision with root package name */
        private wg.a f13491g;

        public c(wg.a aVar) {
            this.f13491g = aVar;
        }

        public final void g() {
            this.f13491g.a(this);
        }
    }

    public y2() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f13484a.add(new b());
        }
        this.f13485b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f13485b.add(new c(new j80(this)));
        }
        this.f13486c = new PriorityQueue();
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(ol olVar);

    public void b() {
        this.f13489f = 0;
        this.f13488e = 0;
        while (!this.f13486c.isEmpty()) {
            a((b) yp.a((Object) (b) this.f13486c.poll()));
        }
        b bVar = this.f13487d;
        if (bVar != null) {
            a(bVar);
            this.f13487d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract kl e();

    /* renamed from: f */
    public ol d() {
        a1.b(this.f13487d == null);
        if (this.f13484a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f13484a.pollFirst();
        this.f13487d = bVar;
        return bVar;
    }

    /* renamed from: g */
    public pl c() {
        if (this.f13485b.isEmpty()) {
            return null;
        }
        while (!this.f13486c.isEmpty() && ((b) yp.a((Object) (b) this.f13486c.peek())).f9908f <= this.f13488e) {
            b bVar = (b) yp.a((Object) (b) this.f13486c.poll());
            if (bVar.e()) {
                pl plVar = (pl) yp.a((Object) (pl) this.f13485b.pollFirst());
                plVar.b(4);
                a(bVar);
                return plVar;
            }
            a((ol) bVar);
            if (j()) {
                kl e10 = e();
                pl plVar2 = (pl) yp.a((Object) (pl) this.f13485b.pollFirst());
                plVar2.a(bVar.f9908f, e10, Long.MAX_VALUE);
                a(bVar);
                return plVar2;
            }
            a(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final pl h() {
        return (pl) this.f13485b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long i() {
        return this.f13488e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    private void a(b bVar) {
        bVar.b();
        this.f13484a.add(bVar);
    }

    /* access modifiers changed from: protected */
    public void a(pl plVar) {
        plVar.b();
        this.f13485b.add(plVar);
    }

    public void a(long j10) {
        this.f13488e = j10;
    }

    /* renamed from: b */
    public void a(ol olVar) {
        a1.a(olVar == this.f13487d);
        b bVar = (b) olVar;
        if (bVar.d()) {
            a(bVar);
        } else {
            long j10 = this.f13489f;
            this.f13489f = 1 + j10;
            long unused = bVar.f13490k = j10;
            this.f13486c.add(bVar);
        }
        this.f13487d = null;
    }
}
