package sb;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import lc.r;

/* compiled from: Pigeon */
public class a {

    /* renamed from: sb.a$a  reason: collision with other inner class name */
    /* compiled from: Pigeon */
    public static class C0429a {

        /* renamed from: a  reason: collision with root package name */
        private String f38034a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38035b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f38036c;

        static C0429a a(Map<String, Object> map) {
            Long l10;
            C0429a aVar = new C0429a();
            aVar.f((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.g(l10);
            aVar.e((Boolean) map.get("autoCloseAndroid"));
            return aVar;
        }

        public Boolean b() {
            return this.f38036c;
        }

        public String c() {
            return this.f38034a;
        }

        public Long d() {
            return this.f38035b;
        }

        public void e(Boolean bool) {
            this.f38036c = bool;
        }

        public void f(String str) {
            this.f38034a = str;
        }

        public void g(Long l10) {
            this.f38035b = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> h() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f38034a);
            hashMap.put("pageNumber", this.f38035b);
            hashMap.put("autoCloseAndroid", this.f38036c);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f38037a;

        /* renamed from: b  reason: collision with root package name */
        private Double f38038b;

        /* renamed from: c  reason: collision with root package name */
        private Double f38039c;

        static b a(Map<String, Object> map) {
            b bVar = new b();
            bVar.c((String) map.get("id"));
            bVar.d((Double) map.get("width"));
            bVar.b((Double) map.get("height"));
            return bVar;
        }

        public void b(Double d10) {
            this.f38039c = d10;
        }

        public void c(String str) {
            this.f38037a = str;
        }

        public void d(Double d10) {
            this.f38038b = d10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f38037a);
            hashMap.put("width", this.f38038b);
            hashMap.put("height", this.f38039c);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f38040a;

        static c a(Map<String, Object> map) {
            c cVar = new c();
            cVar.c((String) map.get("id"));
            return cVar;
        }

        public String b() {
            return this.f38040a;
        }

        public void c(String str) {
            this.f38040a = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f38040a);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f38041a;

        /* renamed from: b  reason: collision with root package name */
        private String f38042b;

        static d a(Map<String, Object> map) {
            d dVar = new d();
            dVar.c((byte[]) map.get(JsonStorageKeyNames.DATA_KEY));
            dVar.d((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            return dVar;
        }

        public byte[] b() {
            return this.f38041a;
        }

        public void c(byte[] bArr) {
            this.f38041a = bArr;
        }

        public void d(String str) {
            this.f38042b = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> e() {
            HashMap hashMap = new HashMap();
            hashMap.put(JsonStorageKeyNames.DATA_KEY, this.f38041a);
            hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.f38042b);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private String f38043a;

        /* renamed from: b  reason: collision with root package name */
        private String f38044b;

        static e a(Map<String, Object> map) {
            e eVar = new e();
            eVar.d((String) map.get("path"));
            eVar.c((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            return eVar;
        }

        public String b() {
            return this.f38043a;
        }

        public void c(String str) {
            this.f38044b = str;
        }

        public void d(String str) {
            this.f38043a = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.f38043a);
            hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.f38044b);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private String f38045a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38046b;

        static f a(Map<String, Object> map) {
            Long l10;
            f fVar = new f();
            fVar.b((String) map.get("id"));
            Object obj = map.get("pagesCount");
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fVar.c(l10);
            return fVar;
        }

        public void b(String str) {
            this.f38045a = str;
        }

        public void c(Long l10) {
            this.f38046b = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f38045a);
            hashMap.put("pagesCount", this.f38046b);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public interface g {
        void a(l lVar, m<Void> mVar);

        void b(c cVar);

        void c(n nVar);

        void d(c cVar);

        void e(C0429a aVar, m<b> mVar);

        void f(o oVar, m<Void> mVar);

        void g(e eVar, m<f> mVar);

        void h(e eVar, m<f> mVar);

        void i(d dVar, m<f> mVar);

        i j();

        void k(j jVar, m<k> mVar);
    }

    /* compiled from: Pigeon */
    private static class h extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final h f38047d = new h();

        private h() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return C0429a.a((Map) f(byteBuffer));
                case -127:
                    return b.a((Map) f(byteBuffer));
                case -126:
                    return c.a((Map) f(byteBuffer));
                case -125:
                    return d.a((Map) f(byteBuffer));
                case -124:
                    return e.a((Map) f(byteBuffer));
                case -123:
                    return f.a((Map) f(byteBuffer));
                case -122:
                    return i.a((Map) f(byteBuffer));
                case -121:
                    return j.a((Map) f(byteBuffer));
                case -120:
                    return k.a((Map) f(byteBuffer));
                case -119:
                    return l.a((Map) f(byteBuffer));
                case -118:
                    return n.a((Map) f(byteBuffer));
                case -117:
                    return o.a((Map) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C0429a) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((C0429a) obj).h());
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((b) obj).e());
            } else if (obj instanceof c) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((c) obj).d());
            } else if (obj instanceof d) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((d) obj).e());
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((e) obj).e());
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((f) obj).d());
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((i) obj).c());
            } else if (obj instanceof j) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((j) obj).z());
            } else if (obj instanceof k) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((k) obj).f());
            } else if (obj instanceof l) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((l) obj).h());
            } else if (obj instanceof n) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((n) obj).d());
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((o) obj).F());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: Pigeon */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private Long f38048a;

        static i a(Map<String, Object> map) {
            Long l10;
            i iVar = new i();
            Object obj = map.get("id");
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.b(l10);
            return iVar;
        }

        public void b(Long l10) {
            this.f38048a = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f38048a);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private String f38049a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38050b;

        /* renamed from: c  reason: collision with root package name */
        private Long f38051c;

        /* renamed from: d  reason: collision with root package name */
        private Long f38052d;

        /* renamed from: e  reason: collision with root package name */
        private String f38053e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f38054f;

        /* renamed from: g  reason: collision with root package name */
        private Long f38055g;

        /* renamed from: h  reason: collision with root package name */
        private Long f38056h;

        /* renamed from: i  reason: collision with root package name */
        private Long f38057i;

        /* renamed from: j  reason: collision with root package name */
        private Long f38058j;

        /* renamed from: k  reason: collision with root package name */
        private Long f38059k;

        /* renamed from: l  reason: collision with root package name */
        private Boolean f38060l;

        static j a(Map<String, Object> map) {
            Long l10;
            Long l11;
            Long l12;
            Long l13;
            Long l14;
            Long l15;
            Long l16;
            j jVar = new j();
            jVar.w((String) map.get("pageId"));
            Object obj = map.get("width");
            Long l17 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.y(l10);
            Object obj2 = map.get("height");
            if (obj2 == null) {
                l11 = null;
            } else {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            jVar.v(l11);
            Object obj3 = map.get("format");
            if (obj3 == null) {
                l12 = null;
            } else {
                l12 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            jVar.u(l12);
            jVar.n((String) map.get("backgroundColor"));
            jVar.o((Boolean) map.get("crop"));
            Object obj4 = map.get("cropX");
            if (obj4 == null) {
                l13 = null;
            } else {
                l13 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            jVar.r(l13);
            Object obj5 = map.get("cropY");
            if (obj5 == null) {
                l14 = null;
            } else {
                l14 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            jVar.s(l14);
            Object obj6 = map.get("cropHeight");
            if (obj6 == null) {
                l15 = null;
            } else {
                l15 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            jVar.p(l15);
            Object obj7 = map.get("cropWidth");
            if (obj7 == null) {
                l16 = null;
            } else {
                l16 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            jVar.q(l16);
            Object obj8 = map.get("quality");
            if (obj8 != null) {
                l17 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            jVar.x(l17);
            jVar.t((Boolean) map.get("forPrint"));
            return jVar;
        }

        public String b() {
            return this.f38053e;
        }

        public Boolean c() {
            return this.f38054f;
        }

        public Long d() {
            return this.f38057i;
        }

        public Long e() {
            return this.f38058j;
        }

        public Long f() {
            return this.f38055g;
        }

        public Long g() {
            return this.f38056h;
        }

        public Boolean h() {
            return this.f38060l;
        }

        public Long i() {
            return this.f38052d;
        }

        public Long j() {
            return this.f38051c;
        }

        public String k() {
            return this.f38049a;
        }

        public Long l() {
            return this.f38059k;
        }

        public Long m() {
            return this.f38050b;
        }

        public void n(String str) {
            this.f38053e = str;
        }

        public void o(Boolean bool) {
            this.f38054f = bool;
        }

        public void p(Long l10) {
            this.f38057i = l10;
        }

        public void q(Long l10) {
            this.f38058j = l10;
        }

        public void r(Long l10) {
            this.f38055g = l10;
        }

        public void s(Long l10) {
            this.f38056h = l10;
        }

        public void t(Boolean bool) {
            this.f38060l = bool;
        }

        public void u(Long l10) {
            this.f38052d = l10;
        }

        public void v(Long l10) {
            this.f38051c = l10;
        }

        public void w(String str) {
            this.f38049a = str;
        }

        public void x(Long l10) {
            this.f38059k = l10;
        }

        public void y(Long l10) {
            this.f38050b = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> z() {
            HashMap hashMap = new HashMap();
            hashMap.put("pageId", this.f38049a);
            hashMap.put("width", this.f38050b);
            hashMap.put("height", this.f38051c);
            hashMap.put("format", this.f38052d);
            hashMap.put("backgroundColor", this.f38053e);
            hashMap.put("crop", this.f38054f);
            hashMap.put("cropX", this.f38055g);
            hashMap.put("cropY", this.f38056h);
            hashMap.put("cropHeight", this.f38057i);
            hashMap.put("cropWidth", this.f38058j);
            hashMap.put("quality", this.f38059k);
            hashMap.put("forPrint", this.f38060l);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private Long f38061a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38062b;

        /* renamed from: c  reason: collision with root package name */
        private String f38063c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f38064d;

        static k a(Map<String, Object> map) {
            Long l10;
            k kVar = new k();
            Object obj = map.get("width");
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            kVar.e(l10);
            Object obj2 = map.get("height");
            if (obj2 != null) {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            kVar.c(l11);
            kVar.d((String) map.get("path"));
            kVar.b((byte[]) map.get(JsonStorageKeyNames.DATA_KEY));
            return kVar;
        }

        public void b(byte[] bArr) {
            this.f38064d = bArr;
        }

        public void c(Long l10) {
            this.f38062b = l10;
        }

        public void d(String str) {
            this.f38063c = str;
        }

        public void e(Long l10) {
            this.f38061a = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("width", this.f38061a);
            hashMap.put("height", this.f38062b);
            hashMap.put("path", this.f38063c);
            hashMap.put(JsonStorageKeyNames.DATA_KEY, this.f38064d);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private Long f38065a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38066b;

        /* renamed from: c  reason: collision with root package name */
        private Long f38067c;

        static l a(Map<String, Object> map) {
            Long l10;
            Long l11;
            l lVar = new l();
            Object obj = map.get("textureId");
            Long l12 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            lVar.f(l10);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l11 = null;
            } else {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            lVar.g(l11);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l12 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            lVar.e(l12);
            return lVar;
        }

        public Long b() {
            return this.f38067c;
        }

        public Long c() {
            return this.f38065a;
        }

        public Long d() {
            return this.f38066b;
        }

        public void e(Long l10) {
            this.f38067c = l10;
        }

        public void f(Long l10) {
            this.f38065a = l10;
        }

        public void g(Long l10) {
            this.f38066b = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> h() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f38065a);
            hashMap.put("width", this.f38066b);
            hashMap.put("height", this.f38067c);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public interface m<T> {
        void a(Throwable th);

        void success(T t10);
    }

    /* compiled from: Pigeon */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private Long f38068a;

        static n a(Map<String, Object> map) {
            Long l10;
            n nVar = new n();
            Object obj = map.get("id");
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            nVar.c(l10);
            return nVar;
        }

        public Long b() {
            return this.f38068a;
        }

        public void c(Long l10) {
            this.f38068a = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f38068a);
            return hashMap;
        }
    }

    /* compiled from: Pigeon */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        private String f38069a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38070b;

        /* renamed from: c  reason: collision with root package name */
        private String f38071c;

        /* renamed from: d  reason: collision with root package name */
        private Long f38072d;

        /* renamed from: e  reason: collision with root package name */
        private Long f38073e;

        /* renamed from: f  reason: collision with root package name */
        private Long f38074f;

        /* renamed from: g  reason: collision with root package name */
        private String f38075g;

        /* renamed from: h  reason: collision with root package name */
        private Long f38076h;

        /* renamed from: i  reason: collision with root package name */
        private Long f38077i;

        /* renamed from: j  reason: collision with root package name */
        private Long f38078j;

        /* renamed from: k  reason: collision with root package name */
        private Long f38079k;

        /* renamed from: l  reason: collision with root package name */
        private Double f38080l;

        /* renamed from: m  reason: collision with root package name */
        private Double f38081m;

        /* renamed from: n  reason: collision with root package name */
        private Long f38082n;

        /* renamed from: o  reason: collision with root package name */
        private Long f38083o;

        /* renamed from: p  reason: collision with root package name */
        private Boolean f38084p;

        static o a(Map<String, Object> map) {
            Long l10;
            Long l11;
            Long l12;
            Long l13;
            Long l14;
            Long l15;
            Long l16;
            Long l17;
            Long l18;
            o oVar = new o();
            oVar.t((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            Long l19 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            oVar.y(l10);
            oVar.x((String) map.get("pageId"));
            Object obj2 = map.get("textureId");
            if (obj2 == null) {
                l11 = null;
            } else {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            oVar.C(l11);
            Object obj3 = map.get("width");
            if (obj3 == null) {
                l12 = null;
            } else {
                l12 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            oVar.E(l12);
            Object obj4 = map.get("height");
            if (obj4 == null) {
                l13 = null;
            } else {
                l13 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            oVar.w(l13);
            oVar.q((String) map.get("backgroundColor"));
            Object obj5 = map.get("sourceX");
            if (obj5 == null) {
                l14 = null;
            } else {
                l14 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            oVar.z(l14);
            Object obj6 = map.get("sourceY");
            if (obj6 == null) {
                l15 = null;
            } else {
                l15 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            oVar.A(l15);
            Object obj7 = map.get("destinationX");
            if (obj7 == null) {
                l16 = null;
            } else {
                l16 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            oVar.r(l16);
            Object obj8 = map.get("destinationY");
            if (obj8 == null) {
                l17 = null;
            } else {
                l17 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            oVar.s(l17);
            oVar.v((Double) map.get("fullWidth"));
            oVar.u((Double) map.get("fullHeight"));
            Object obj9 = map.get("textureWidth");
            if (obj9 == null) {
                l18 = null;
            } else {
                l18 = Long.valueOf(obj9 instanceof Integer ? (long) ((Integer) obj9).intValue() : ((Long) obj9).longValue());
            }
            oVar.D(l18);
            Object obj10 = map.get("textureHeight");
            if (obj10 != null) {
                l19 = Long.valueOf(obj10 instanceof Integer ? (long) ((Integer) obj10).intValue() : ((Long) obj10).longValue());
            }
            oVar.B(l19);
            oVar.p((Boolean) map.get("allowAntiAliasing"));
            return oVar;
        }

        public void A(Long l10) {
            this.f38077i = l10;
        }

        public void B(Long l10) {
            this.f38083o = l10;
        }

        public void C(Long l10) {
            this.f38072d = l10;
        }

        public void D(Long l10) {
            this.f38082n = l10;
        }

        public void E(Long l10) {
            this.f38073e = l10;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> F() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f38069a);
            hashMap.put("pageNumber", this.f38070b);
            hashMap.put("pageId", this.f38071c);
            hashMap.put("textureId", this.f38072d);
            hashMap.put("width", this.f38073e);
            hashMap.put("height", this.f38074f);
            hashMap.put("backgroundColor", this.f38075g);
            hashMap.put("sourceX", this.f38076h);
            hashMap.put("sourceY", this.f38077i);
            hashMap.put("destinationX", this.f38078j);
            hashMap.put("destinationY", this.f38079k);
            hashMap.put("fullWidth", this.f38080l);
            hashMap.put("fullHeight", this.f38081m);
            hashMap.put("textureWidth", this.f38082n);
            hashMap.put("textureHeight", this.f38083o);
            hashMap.put("allowAntiAliasing", this.f38084p);
            return hashMap;
        }

        public String b() {
            return this.f38075g;
        }

        public Long c() {
            return this.f38078j;
        }

        public Long d() {
            return this.f38079k;
        }

        public String e() {
            return this.f38069a;
        }

        public Double f() {
            return this.f38081m;
        }

        public Double g() {
            return this.f38080l;
        }

        public Long h() {
            return this.f38074f;
        }

        public Long i() {
            return this.f38070b;
        }

        public Long j() {
            return this.f38076h;
        }

        public Long k() {
            return this.f38077i;
        }

        public Long l() {
            return this.f38083o;
        }

        public Long m() {
            return this.f38072d;
        }

        public Long n() {
            return this.f38082n;
        }

        public Long o() {
            return this.f38073e;
        }

        public void p(Boolean bool) {
            this.f38084p = bool;
        }

        public void q(String str) {
            this.f38075g = str;
        }

        public void r(Long l10) {
            this.f38078j = l10;
        }

        public void s(Long l10) {
            this.f38079k = l10;
        }

        public void t(String str) {
            this.f38069a = str;
        }

        public void u(Double d10) {
            this.f38081m = d10;
        }

        public void v(Double d10) {
            this.f38080l = d10;
        }

        public void w(Long l10) {
            this.f38074f = l10;
        }

        public void x(String str) {
            this.f38071c = str;
        }

        public void y(Long l10) {
            this.f38070b = l10;
        }

        public void z(Long l10) {
            this.f38076h = l10;
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
