package i2;

import android.content.Context;
import c2.e;
import d2.b;
import j2.c;
import j2.d;
import java.util.concurrent.Executor;
import rd.a;

/* compiled from: Uploader_Factory */
public final class t implements b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f18902a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f18903b;

    /* renamed from: c  reason: collision with root package name */
    private final a<d> f18904c;

    /* renamed from: d  reason: collision with root package name */
    private final a<y> f18905d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f18906e;

    /* renamed from: f  reason: collision with root package name */
    private final a<k2.b> f18907f;

    /* renamed from: g  reason: collision with root package name */
    private final a<l2.a> f18908g;

    /* renamed from: h  reason: collision with root package name */
    private final a<l2.a> f18909h;

    /* renamed from: i  reason: collision with root package name */
    private final a<c> f18910i;

    public t(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<y> aVar4, a<Executor> aVar5, a<k2.b> aVar6, a<l2.a> aVar7, a<l2.a> aVar8, a<c> aVar9) {
        this.f18902a = aVar;
        this.f18903b = aVar2;
        this.f18904c = aVar3;
        this.f18905d = aVar4;
        this.f18906e = aVar5;
        this.f18907f = aVar6;
        this.f18908g = aVar7;
        this.f18909h = aVar8;
        this.f18910i = aVar9;
    }

    public static t a(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<y> aVar4, a<Executor> aVar5, a<k2.b> aVar6, a<l2.a> aVar7, a<l2.a> aVar8, a<c> aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static s c(Context context, e eVar, d dVar, y yVar, Executor executor, k2.b bVar, l2.a aVar, l2.a aVar2, c cVar) {
        return new s(context, eVar, dVar, yVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public s get() {
        return c(this.f18902a.get(), this.f18903b.get(), this.f18904c.get(), this.f18905d.get(), this.f18906e.get(), this.f18907f.get(), this.f18908g.get(), this.f18909h.get(), this.f18910i.get());
    }
}
