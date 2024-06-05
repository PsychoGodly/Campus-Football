package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class y1 implements o1 {

    /* renamed from: b  reason: collision with root package name */
    protected o1.a f13476b;

    /* renamed from: c  reason: collision with root package name */
    protected o1.a f13477c;

    /* renamed from: d  reason: collision with root package name */
    private o1.a f13478d;

    /* renamed from: e  reason: collision with root package name */
    private o1.a f13479e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f13480f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f13481g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13482h;

    public y1() {
        ByteBuffer byteBuffer = o1.f10044a;
        this.f13480f = byteBuffer;
        this.f13481g = byteBuffer;
        o1.a aVar = o1.a.f10045e;
        this.f13478d = aVar;
        this.f13479e = aVar;
        this.f13476b = aVar;
        this.f13477c = aVar;
    }

    public final o1.a a(o1.a aVar) {
        this.f13478d = aVar;
        this.f13479e = b(aVar);
        return f() ? this.f13479e : o1.a.f10045e;
    }

    /* access modifiers changed from: protected */
    public abstract o1.a b(o1.a aVar);

    public final void b() {
        this.f13481g = o1.f10044a;
        this.f13482h = false;
        this.f13476b = this.f13478d;
        this.f13477c = this.f13479e;
        g();
    }

    public boolean c() {
        return this.f13482h && this.f13481g == o1.f10044a;
    }

    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f13481g;
        this.f13481g = o1.f10044a;
        return byteBuffer;
    }

    public final void e() {
        this.f13482h = true;
        h();
    }

    public boolean f() {
        return this.f13479e != o1.a.f10045e;
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public final void reset() {
        b();
        this.f13480f = o1.f10044a;
        o1.a aVar = o1.a.f10045e;
        this.f13478d = aVar;
        this.f13479e = aVar;
        this.f13476b = aVar;
        this.f13477c = aVar;
        i();
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return this.f13481g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer a(int i10) {
        if (this.f13480f.capacity() < i10) {
            this.f13480f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f13480f.clear();
        }
        ByteBuffer byteBuffer = this.f13480f;
        this.f13481g = byteBuffer;
        return byteBuffer;
    }
}
