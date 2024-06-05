package kc;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: PlatformViewsChannel */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final k f35889a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public g f35890b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f35891c;

    /* compiled from: PlatformViewsChannel */
    class a implements k.c {
        a() {
        }

        private void b(j jVar, k.d dVar) {
            try {
                l.this.f35890b.h(((Integer) jVar.b()).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        private void c(j jVar, k.d dVar) {
            d.a aVar;
            k.d dVar2 = dVar;
            Map map = (Map) jVar.b();
            boolean z10 = true;
            boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z11) {
                try {
                    l.this.f35890b.e(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                    dVar2.success((Object) null);
                } catch (IllegalStateException e10) {
                    dVar2.error("error", l.c(e10), (Object) null);
                }
            } else {
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z10 = false;
                }
                if (z10) {
                    aVar = d.a.TEXTURE_WITH_HYBRID_FALLBACK;
                } else {
                    aVar = d.a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                }
                d.a aVar2 = aVar;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d10 = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d10 = ((Double) map.get("left")).doubleValue();
                }
                long g10 = l.this.f35890b.g(new d(intValue, str, doubleValue, d10, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar2, wrap));
                if (g10 != -2) {
                    dVar2.success(Long.valueOf(g10));
                } else if (z10) {
                    dVar2.success((Object) null);
                } else {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
        }

        private void d(j jVar, k.d dVar) {
            try {
                l.this.f35890b.i(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.error("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f35893a));
            hashMap.put("height", Double.valueOf((double) cVar.f35894b));
            dVar.success(hashMap);
        }

        private void f(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f35890b.f(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        private void g(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f35890b.c(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new k(dVar));
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        private void h(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f35890b.b(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        private void i(j jVar, k.d dVar) {
            try {
                l.this.f35890b.a(((Boolean) jVar.b()).booleanValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e10) {
                dVar.error("error", l.c(e10), (Object) null);
            }
        }

        private void j(j jVar, k.d dVar) {
            k.d dVar2;
            k.d dVar3 = dVar;
            List list = (List) jVar.b();
            f fVar = r2;
            f fVar2 = fVar;
            f fVar3 = new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                l.this.f35890b.d(fVar);
                dVar2 = dVar;
                try {
                    dVar2.success((Object) null);
                } catch (IllegalStateException e10) {
                    e = e10;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                dVar2 = dVar;
                dVar2.error("error", l.c(e), (Object) null);
            }
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (l.this.f35890b != null) {
                xb.b.f("PlatformViewsChannel", "Received '" + jVar.f36116a + "' message.");
                String str = jVar.f36116a;
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c10 = 7;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        c(jVar, dVar);
                        return;
                    case 1:
                        f(jVar, dVar);
                        return;
                    case 2:
                        g(jVar, dVar);
                        return;
                    case 3:
                        b(jVar, dVar);
                        return;
                    case 4:
                        i(jVar, dVar);
                        return;
                    case 5:
                        j(jVar, dVar);
                        return;
                    case 6:
                        h(jVar, dVar);
                        return;
                    case 7:
                        d(jVar, dVar);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    /* compiled from: PlatformViewsChannel */
    public interface b {
        void a(c cVar);
    }

    /* compiled from: PlatformViewsChannel */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f35893a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35894b;

        public c(int i10, int i11) {
            this.f35893a = i10;
            this.f35894b = i11;
        }
    }

    /* compiled from: PlatformViewsChannel */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f35895a;

        /* renamed from: b  reason: collision with root package name */
        public final String f35896b;

        /* renamed from: c  reason: collision with root package name */
        public final double f35897c;

        /* renamed from: d  reason: collision with root package name */
        public final double f35898d;

        /* renamed from: e  reason: collision with root package name */
        public final double f35899e;

        /* renamed from: f  reason: collision with root package name */
        public final double f35900f;

        /* renamed from: g  reason: collision with root package name */
        public final int f35901g;

        /* renamed from: h  reason: collision with root package name */
        public final a f35902h;

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f35903i;

        /* compiled from: PlatformViewsChannel */
        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i10, String str, double d10, double d11, double d12, double d13, int i11, a aVar, ByteBuffer byteBuffer) {
            this.f35895a = i10;
            this.f35896b = str;
            this.f35899e = d10;
            this.f35900f = d11;
            this.f35897c = d12;
            this.f35898d = d13;
            this.f35901g = i11;
            this.f35902h = aVar;
            this.f35903i = byteBuffer;
        }
    }

    /* compiled from: PlatformViewsChannel */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f35908a;

        /* renamed from: b  reason: collision with root package name */
        public final double f35909b;

        /* renamed from: c  reason: collision with root package name */
        public final double f35910c;

        public e(int i10, double d10, double d11) {
            this.f35908a = i10;
            this.f35909b = d10;
            this.f35910c = d11;
        }
    }

    /* compiled from: PlatformViewsChannel */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f35911a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f35912b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f35913c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35914d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35915e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f35916f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f35917g;

        /* renamed from: h  reason: collision with root package name */
        public final int f35918h;

        /* renamed from: i  reason: collision with root package name */
        public final int f35919i;

        /* renamed from: j  reason: collision with root package name */
        public final float f35920j;

        /* renamed from: k  reason: collision with root package name */
        public final float f35921k;

        /* renamed from: l  reason: collision with root package name */
        public final int f35922l;

        /* renamed from: m  reason: collision with root package name */
        public final int f35923m;

        /* renamed from: n  reason: collision with root package name */
        public final int f35924n;

        /* renamed from: o  reason: collision with root package name */
        public final int f35925o;

        /* renamed from: p  reason: collision with root package name */
        public final long f35926p;

        public f(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f35911a = i10;
            this.f35912b = number;
            this.f35913c = number2;
            this.f35914d = i11;
            this.f35915e = i12;
            this.f35916f = obj;
            this.f35917g = obj2;
            this.f35918h = i13;
            this.f35919i = i14;
            this.f35920j = f10;
            this.f35921k = f11;
            this.f35922l = i15;
            this.f35923m = i16;
            this.f35924n = i17;
            this.f35925o = i18;
            this.f35926p = j10;
        }
    }

    /* compiled from: PlatformViewsChannel */
    public interface g {
        void a(boolean z10);

        void b(int i10, int i11);

        void c(e eVar, b bVar);

        void d(f fVar);

        void e(d dVar);

        void f(int i10, double d10, double d11);

        long g(d dVar);

        void h(int i10);

        void i(int i10);
    }

    public l(zb.a aVar) {
        a aVar2 = new a();
        this.f35891c = aVar2;
        k kVar = new k(aVar, "flutter/platform_views", s.f36131b);
        this.f35889a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public static String c(Exception exc) {
        return xb.b.d(exc);
    }

    public void d(int i10) {
        k kVar = this.f35889a;
        if (kVar != null) {
            kVar.c("viewFocused", Integer.valueOf(i10));
        }
    }

    public void e(g gVar) {
        this.f35890b = gVar;
    }
}
