package b2;

import z1.b;
import z1.c;
import z1.e;
import z1.f;
import z1.h;

/* compiled from: TransportImpl */
final class r<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o f5442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5443b;

    /* renamed from: c  reason: collision with root package name */
    private final b f5444c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f5445d;

    /* renamed from: e  reason: collision with root package name */
    private final s f5446e;

    r(o oVar, String str, b bVar, e<T, byte[]> eVar, s sVar) {
        this.f5442a = oVar;
        this.f5443b = str;
        this.f5444c = bVar;
        this.f5445d = eVar;
        this.f5446e = sVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    public void a(c<T> cVar) {
        d(cVar, q.f5441a);
    }

    public void d(c<T> cVar, h hVar) {
        this.f5446e.a(n.a().e(this.f5442a).c(cVar).f(this.f5443b).d(this.f5445d).b(this.f5444c).a(), hVar);
    }
}
