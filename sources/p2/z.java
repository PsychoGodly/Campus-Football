package p2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2.g;

/* compiled from: BaseAudioProcessor */
public abstract class z implements g {

    /* renamed from: b  reason: collision with root package name */
    protected g.a f21390b;

    /* renamed from: c  reason: collision with root package name */
    protected g.a f21391c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f21392d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f21393e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f21394f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f21395g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21396h;

    public z() {
        ByteBuffer byteBuffer = g.f21263a;
        this.f21394f = byteBuffer;
        this.f21395g = byteBuffer;
        g.a aVar = g.a.f21264e;
        this.f21392d = aVar;
        this.f21393e = aVar;
        this.f21390b = aVar;
        this.f21391c = aVar;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f21395g;
        this.f21395g = g.f21263a;
        return byteBuffer;
    }

    public boolean b() {
        return this.f21396h && this.f21395g == g.f21263a;
    }

    public final g.a d(g.a aVar) throws g.b {
        this.f21392d = aVar;
        this.f21393e = g(aVar);
        return isActive() ? this.f21393e : g.a.f21264e;
    }

    public final void e() {
        this.f21396h = true;
        i();
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        return this.f21395g.hasRemaining();
    }

    public final void flush() {
        this.f21395g = g.f21263a;
        this.f21396h = false;
        this.f21390b = this.f21392d;
        this.f21391c = this.f21393e;
        h();
    }

    /* access modifiers changed from: protected */
    public abstract g.a g(g.a aVar) throws g.b;

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public boolean isActive() {
        return this.f21393e != g.a.f21264e;
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer k(int i10) {
        if (this.f21394f.capacity() < i10) {
            this.f21394f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f21394f.clear();
        }
        ByteBuffer byteBuffer = this.f21394f;
        this.f21395g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f21394f = g.f21263a;
        g.a aVar = g.a.f21264e;
        this.f21392d = aVar;
        this.f21393e = aVar;
        this.f21390b = aVar;
        this.f21391c = aVar;
        j();
    }
}
