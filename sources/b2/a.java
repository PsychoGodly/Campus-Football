package b2;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class a implements l7.a {

    /* renamed from: a  reason: collision with root package name */
    public static final l7.a f5368a = new a();

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class C0097a implements k7.d<e2.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0097a f5369a = new C0097a();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5370b = k7.c.a("window").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f5371c = k7.c.a("logSourceMetrics").b(n7.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final k7.c f5372d = k7.c.a("globalMetrics").b(n7.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final k7.c f5373e = k7.c.a("appNamespace").b(n7.a.b().c(4).a()).a();

        private C0097a() {
        }

        /* renamed from: b */
        public void a(e2.a aVar, k7.e eVar) throws IOException {
            eVar.e(f5370b, aVar.d());
            eVar.e(f5371c, aVar.c());
            eVar.e(f5372d, aVar.b());
            eVar.e(f5373e, aVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class b implements k7.d<e2.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f5374a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5375b = k7.c.a("storageMetrics").b(n7.a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(e2.b bVar, k7.e eVar) throws IOException {
            eVar.e(f5375b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class c implements k7.d<e2.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f5376a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5377b = k7.c.a("eventsDroppedCount").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f5378c = k7.c.a("reason").b(n7.a.b().c(3).a()).a();

        private c() {
        }

        /* renamed from: b */
        public void a(e2.c cVar, k7.e eVar) throws IOException {
            eVar.b(f5377b, cVar.a());
            eVar.e(f5378c, cVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class d implements k7.d<e2.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f5379a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5380b = k7.c.a("logSource").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f5381c = k7.c.a("logEventDropped").b(n7.a.b().c(2).a()).a();

        private d() {
        }

        /* renamed from: b */
        public void a(e2.d dVar, k7.e eVar) throws IOException {
            eVar.e(f5380b, dVar.b());
            eVar.e(f5381c, dVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class e implements k7.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final e f5382a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5383b = k7.c.d("clientMetrics");

        private e() {
        }

        /* renamed from: b */
        public void a(l lVar, k7.e eVar) throws IOException {
            eVar.e(f5383b, lVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class f implements k7.d<e2.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f5384a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5385b = k7.c.a("currentCacheSizeBytes").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f5386c = k7.c.a("maxCacheSizeBytes").b(n7.a.b().c(2).a()).a();

        private f() {
        }

        /* renamed from: b */
        public void a(e2.e eVar, k7.e eVar2) throws IOException {
            eVar2.b(f5385b, eVar.a());
            eVar2.b(f5386c, eVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class g implements k7.d<e2.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f5387a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f5388b = k7.c.a("startMs").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f5389c = k7.c.a("endMs").b(n7.a.b().c(2).a()).a();

        private g() {
        }

        /* renamed from: b */
        public void a(e2.f fVar, k7.e eVar) throws IOException {
            eVar.b(f5388b, fVar.b());
            eVar.b(f5389c, fVar.a());
        }
    }

    private a() {
    }

    public void a(l7.b<?> bVar) {
        bVar.a(l.class, e.f5382a);
        bVar.a(e2.a.class, C0097a.f5369a);
        bVar.a(e2.f.class, g.f5387a);
        bVar.a(e2.d.class, d.f5379a);
        bVar.a(e2.c.class, c.f5376a);
        bVar.a(e2.b.class, b.f5374a);
        bVar.a(e2.e.class, f.f5384a);
    }
}
