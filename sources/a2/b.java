package a2;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class b implements l7.a {

    /* renamed from: a  reason: collision with root package name */
    public static final l7.a f31a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class a implements k7.d<a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f32a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f33b = k7.c.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f34c = k7.c.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final k7.c f35d = k7.c.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final k7.c f36e = k7.c.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final k7.c f37f = k7.c.d(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g  reason: collision with root package name */
        private static final k7.c f38g = k7.c.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final k7.c f39h = k7.c.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final k7.c f40i = k7.c.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final k7.c f41j = k7.c.d("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final k7.c f42k = k7.c.d("country");

        /* renamed from: l  reason: collision with root package name */
        private static final k7.c f43l = k7.c.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final k7.c f44m = k7.c.d("applicationBuild");

        private a() {
        }

        /* renamed from: b */
        public void a(a aVar, k7.e eVar) throws IOException {
            eVar.e(f33b, aVar.m());
            eVar.e(f34c, aVar.j());
            eVar.e(f35d, aVar.f());
            eVar.e(f36e, aVar.d());
            eVar.e(f37f, aVar.l());
            eVar.e(f38g, aVar.k());
            eVar.e(f39h, aVar.h());
            eVar.e(f40i, aVar.e());
            eVar.e(f41j, aVar.g());
            eVar.e(f42k, aVar.c());
            eVar.e(f43l, aVar.i());
            eVar.e(f44m, aVar.b());
        }
    }

    /* renamed from: a2.b$b  reason: collision with other inner class name */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C0001b implements k7.d<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0001b f45a = new C0001b();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f46b = k7.c.d("logRequest");

        private C0001b() {
        }

        /* renamed from: b */
        public void a(j jVar, k7.e eVar) throws IOException {
            eVar.e(f46b, jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class c implements k7.d<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f47a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f48b = k7.c.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f49c = k7.c.d("androidClientInfo");

        private c() {
        }

        /* renamed from: b */
        public void a(k kVar, k7.e eVar) throws IOException {
            eVar.e(f48b, kVar.c());
            eVar.e(f49c, kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class d implements k7.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f50a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f51b = k7.c.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f52c = k7.c.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final k7.c f53d = k7.c.d("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final k7.c f54e = k7.c.d("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final k7.c f55f = k7.c.d("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final k7.c f56g = k7.c.d("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final k7.c f57h = k7.c.d("networkConnectionInfo");

        private d() {
        }

        /* renamed from: b */
        public void a(l lVar, k7.e eVar) throws IOException {
            eVar.b(f51b, lVar.c());
            eVar.e(f52c, lVar.b());
            eVar.b(f53d, lVar.d());
            eVar.e(f54e, lVar.f());
            eVar.e(f55f, lVar.g());
            eVar.b(f56g, lVar.h());
            eVar.e(f57h, lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class e implements k7.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f58a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f59b = k7.c.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f60c = k7.c.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final k7.c f61d = k7.c.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final k7.c f62e = k7.c.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final k7.c f63f = k7.c.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final k7.c f64g = k7.c.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final k7.c f65h = k7.c.d("qosTier");

        private e() {
        }

        /* renamed from: b */
        public void a(m mVar, k7.e eVar) throws IOException {
            eVar.b(f59b, mVar.g());
            eVar.b(f60c, mVar.h());
            eVar.e(f61d, mVar.b());
            eVar.e(f62e, mVar.d());
            eVar.e(f63f, mVar.e());
            eVar.e(f64g, mVar.c());
            eVar.e(f65h, mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class f implements k7.d<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f66a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f67b = k7.c.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f68c = k7.c.d("mobileSubtype");

        private f() {
        }

        /* renamed from: b */
        public void a(o oVar, k7.e eVar) throws IOException {
            eVar.e(f67b, oVar.c());
            eVar.e(f68c, oVar.b());
        }
    }

    private b() {
    }

    public void a(l7.b<?> bVar) {
        C0001b bVar2 = C0001b.f45a;
        bVar.a(j.class, bVar2);
        bVar.a(d.class, bVar2);
        e eVar = e.f58a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.f47a;
        bVar.a(k.class, cVar);
        bVar.a(e.class, cVar);
        a aVar = a.f32a;
        bVar.a(a.class, aVar);
        bVar.a(c.class, aVar);
        d dVar = d.f50a;
        bVar.a(l.class, dVar);
        bVar.a(f.class, dVar);
        f fVar = f.f66a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}
