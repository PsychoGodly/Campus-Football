package ff;

import bf.d;
import bf.h;
import bf.o;
import bf.s;
import bf.x;
import bf.z;
import ef.c;
import java.io.IOException;
import java.util.List;

/* compiled from: RealInterceptorChain */
public final class g implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<s> f32780a;

    /* renamed from: b  reason: collision with root package name */
    private final ef.g f32781b;

    /* renamed from: c  reason: collision with root package name */
    private final c f32782c;

    /* renamed from: d  reason: collision with root package name */
    private final c f32783d;

    /* renamed from: e  reason: collision with root package name */
    private final int f32784e;

    /* renamed from: f  reason: collision with root package name */
    private final x f32785f;

    /* renamed from: g  reason: collision with root package name */
    private final d f32786g;

    /* renamed from: h  reason: collision with root package name */
    private final o f32787h;

    /* renamed from: i  reason: collision with root package name */
    private final int f32788i;

    /* renamed from: j  reason: collision with root package name */
    private final int f32789j;

    /* renamed from: k  reason: collision with root package name */
    private final int f32790k;

    /* renamed from: l  reason: collision with root package name */
    private int f32791l;

    public g(List<s> list, ef.g gVar, c cVar, c cVar2, int i10, x xVar, d dVar, o oVar, int i11, int i12, int i13) {
        this.f32780a = list;
        this.f32783d = cVar2;
        this.f32781b = gVar;
        this.f32782c = cVar;
        this.f32784e = i10;
        this.f32785f = xVar;
        this.f32786g = dVar;
        this.f32787h = oVar;
        this.f32788i = i11;
        this.f32789j = i12;
        this.f32790k = i13;
    }

    public int a() {
        return this.f32789j;
    }

    public int b() {
        return this.f32790k;
    }

    public int c() {
        return this.f32788i;
    }

    public z d(x xVar) throws IOException {
        return j(xVar, this.f32781b, this.f32782c, this.f32783d);
    }

    public d e() {
        return this.f32786g;
    }

    public h f() {
        return this.f32783d;
    }

    public o g() {
        return this.f32787h;
    }

    public x h() {
        return this.f32785f;
    }

    public c i() {
        return this.f32782c;
    }

    public z j(x xVar, ef.g gVar, c cVar, c cVar2) throws IOException {
        if (this.f32784e < this.f32780a.size()) {
            this.f32791l++;
            if (this.f32782c != null && !this.f32783d.s(xVar.h())) {
                throw new IllegalStateException("network interceptor " + this.f32780a.get(this.f32784e - 1) + " must retain the same host and port");
            } else if (this.f32782c == null || this.f32791l <= 1) {
                g gVar2 = new g(this.f32780a, gVar, cVar, cVar2, this.f32784e + 1, xVar, this.f32786g, this.f32787h, this.f32788i, this.f32789j, this.f32790k);
                s sVar = this.f32780a.get(this.f32784e);
                z a10 = sVar.a(gVar2);
                if (cVar != null && this.f32784e + 1 < this.f32780a.size() && gVar2.f32791l != 1) {
                    throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
                } else if (a10 == null) {
                    throw new NullPointerException("interceptor " + sVar + " returned null");
                } else if (a10.h() != null) {
                    return a10;
                } else {
                    throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f32780a.get(this.f32784e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public ef.g k() {
        return this.f32781b;
    }
}
