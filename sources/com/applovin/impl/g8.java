package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public final class g8 implements ll {

    /* renamed from: a  reason: collision with root package name */
    private final a5 f7924a = new a5();

    /* renamed from: b  reason: collision with root package name */
    private final ol f7925b = new ol();

    /* renamed from: c  reason: collision with root package name */
    private final Deque f7926c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f7927d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7928e;

    public g8() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f7926c.addFirst(new ck(new ex(this)));
        }
        this.f7927d = 0;
    }

    public void a(long j10) {
    }

    public void a(ol olVar) {
        boolean z10 = true;
        a1.b(!this.f7928e);
        a1.b(this.f7927d == 1);
        if (this.f7925b != olVar) {
            z10 = false;
        }
        a1.a(z10);
        this.f7927d = 2;
    }

    public void b() {
        a1.b(!this.f7928e);
        this.f7925b.b();
        this.f7927d = 0;
    }

    /* renamed from: e */
    public ol d() {
        a1.b(!this.f7928e);
        if (this.f7927d != 0) {
            return null;
        }
        this.f7927d = 1;
        return this.f7925b;
    }

    /* renamed from: f */
    public pl c() {
        a1.b(!this.f7928e);
        if (this.f7927d != 2 || this.f7926c.isEmpty()) {
            return null;
        }
        pl plVar = (pl) this.f7926c.removeFirst();
        if (this.f7925b.e()) {
            plVar.b(4);
        } else {
            ol olVar = this.f7925b;
            a aVar = new a(olVar.f9908f, this.f7924a.a(((ByteBuffer) a1.a((Object) olVar.f9906c)).array()));
            plVar.a(this.f7925b.f9908f, aVar, 0);
        }
        this.f7925b.b();
        this.f7927d = 0;
        return plVar;
    }

    private static final class a implements kl {

        /* renamed from: a  reason: collision with root package name */
        private final long f7929a;

        /* renamed from: b  reason: collision with root package name */
        private final ab f7930b;

        public a(long j10, ab abVar) {
            this.f7929a = j10;
            this.f7930b = abVar;
        }

        public int a() {
            return 1;
        }

        public long a(int i10) {
            a1.a(i10 == 0);
            return this.f7929a;
        }

        public List b(long j10) {
            return j10 >= this.f7929a ? this.f7930b : ab.h();
        }

        public int a(long j10) {
            return this.f7929a > j10 ? 0 : -1;
        }
    }

    public void a() {
        this.f7928e = true;
    }

    /* access modifiers changed from: private */
    public void a(pl plVar) {
        a1.b(this.f7926c.size() < 2);
        a1.a(!this.f7926c.contains(plVar));
        plVar.b();
        this.f7926c.addFirst(plVar);
    }
}
