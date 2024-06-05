package io.flutter.plugins.webviewflutter;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GeneratedAndroidWebView */
public class n {

    /* compiled from: GeneratedAndroidWebView */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Long f34319a;

        /* renamed from: b  reason: collision with root package name */
        private String f34320b;

        /* renamed from: c  reason: collision with root package name */
        private b f34321c;

        /* renamed from: d  reason: collision with root package name */
        private String f34322d;

        /* renamed from: io.flutter.plugins.webviewflutter.n$a$a  reason: collision with other inner class name */
        /* compiled from: GeneratedAndroidWebView */
        public static final class C0389a {

            /* renamed from: a  reason: collision with root package name */
            private Long f34323a;

            /* renamed from: b  reason: collision with root package name */
            private String f34324b;

            /* renamed from: c  reason: collision with root package name */
            private b f34325c;

            /* renamed from: d  reason: collision with root package name */
            private String f34326d;

            public a a() {
                a aVar = new a();
                aVar.c(this.f34323a);
                aVar.d(this.f34324b);
                aVar.b(this.f34325c);
                aVar.e(this.f34326d);
                return aVar;
            }

            public C0389a b(b bVar) {
                this.f34325c = bVar;
                return this;
            }

            public C0389a c(Long l10) {
                this.f34323a = l10;
                return this;
            }

            public C0389a d(String str) {
                this.f34324b = str;
                return this;
            }

            public C0389a e(String str) {
                this.f34326d = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            Long l10;
            a aVar = new a();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.c(l10);
            aVar.d((String) arrayList.get(1));
            aVar.b(b.values()[((Integer) arrayList.get(2)).intValue()]);
            aVar.e((String) arrayList.get(3));
            return aVar;
        }

        public void b(b bVar) {
            if (bVar != null) {
                this.f34321c = bVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"level\" is null.");
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f34319a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"lineNumber\" is null.");
        }

        public void d(String str) {
            if (str != null) {
                this.f34320b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"message\" is null.");
        }

        public void e(String str) {
            if (str != null) {
                this.f34322d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"sourceId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f34319a);
            arrayList.add(this.f34320b);
            b bVar = this.f34321c;
            arrayList.add(bVar == null ? null : Integer.valueOf(bVar.f34334a));
            arrayList.add(this.f34322d);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface a0 {
        void a(Long l10);

        void b(Long l10, Boolean bool);

        void c(Long l10, Boolean bool);

        void d(Long l10, Boolean bool);

        void e(Long l10, Boolean bool);

        void f(Long l10, Boolean bool);
    }

    /* compiled from: GeneratedAndroidWebView */
    public enum b {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);
        

        /* renamed from: a  reason: collision with root package name */
        final int f34334a;

        private b(int i10) {
            this.f34334a = i10;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static final class b0 {

        /* renamed from: a  reason: collision with root package name */
        private Long f34335a;

        /* renamed from: b  reason: collision with root package name */
        private String f34336b;

        /* compiled from: GeneratedAndroidWebView */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f34337a;

            /* renamed from: b  reason: collision with root package name */
            private String f34338b;

            public b0 a() {
                b0 b0Var = new b0();
                b0Var.c(this.f34337a);
                b0Var.b(this.f34338b);
                return b0Var;
            }

            public a b(String str) {
                this.f34338b = str;
                return this;
            }

            public a c(Long l10) {
                this.f34337a = l10;
                return this;
            }
        }

        b0() {
        }

        static b0 a(ArrayList<Object> arrayList) {
            Long l10;
            b0 b0Var = new b0();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            b0Var.c(l10);
            b0Var.b((String) arrayList.get(1));
            return b0Var;
        }

        public void b(String str) {
            if (str != null) {
                this.f34336b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"description\" is null.");
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f34335a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f34335a);
            arrayList.add(this.f34336b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface c {
        void a(Long l10, w<Boolean> wVar);

        void b(Long l10);

        void c(Long l10, Long l11, Boolean bool);

        void d(Long l10, String str, String str2);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static final class c0 {

        /* renamed from: a  reason: collision with root package name */
        private String f34339a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f34340b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f34341c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f34342d;

        /* renamed from: e  reason: collision with root package name */
        private String f34343e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f34344f;

        /* compiled from: GeneratedAndroidWebView */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f34345a;

            /* renamed from: b  reason: collision with root package name */
            private Boolean f34346b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f34347c;

            /* renamed from: d  reason: collision with root package name */
            private Boolean f34348d;

            /* renamed from: e  reason: collision with root package name */
            private String f34349e;

            /* renamed from: f  reason: collision with root package name */
            private Map<String, String> f34350f;

            public c0 a() {
                c0 c0Var = new c0();
                c0Var.g(this.f34345a);
                c0Var.c(this.f34346b);
                c0Var.d(this.f34347c);
                c0Var.b(this.f34348d);
                c0Var.e(this.f34349e);
                c0Var.f(this.f34350f);
                return c0Var;
            }

            public a b(Boolean bool) {
                this.f34348d = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f34346b = bool;
                return this;
            }

            public a d(Boolean bool) {
                this.f34347c = bool;
                return this;
            }

            public a e(String str) {
                this.f34349e = str;
                return this;
            }

            public a f(Map<String, String> map) {
                this.f34350f = map;
                return this;
            }

            public a g(String str) {
                this.f34345a = str;
                return this;
            }
        }

        c0() {
        }

        static c0 a(ArrayList<Object> arrayList) {
            c0 c0Var = new c0();
            c0Var.g((String) arrayList.get(0));
            c0Var.c((Boolean) arrayList.get(1));
            c0Var.d((Boolean) arrayList.get(2));
            c0Var.b((Boolean) arrayList.get(3));
            c0Var.e((String) arrayList.get(4));
            c0Var.f((Map) arrayList.get(5));
            return c0Var;
        }

        public void b(Boolean bool) {
            if (bool != null) {
                this.f34342d = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f34340b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
        }

        public void d(Boolean bool) {
            this.f34341c = bool;
        }

        public void e(String str) {
            if (str != null) {
                this.f34343e = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"method\" is null.");
        }

        public void f(Map<String, String> map) {
            if (map != null) {
                this.f34344f = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
        }

        public void g(String str) {
            if (str != null) {
                this.f34339a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f34339a);
            arrayList.add(this.f34340b);
            arrayList.add(this.f34341c);
            arrayList.add(this.f34342d);
            arrayList.add(this.f34343e);
            arrayList.add(this.f34344f);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34351a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public d(lc.c cVar) {
            this.f34351a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, a<Void> aVar) {
            new lc.a(this.f34351a, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l10)), new t(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static final class d0 {

        /* renamed from: a  reason: collision with root package name */
        private Long f34352a;

        /* compiled from: GeneratedAndroidWebView */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f34353a;

            public d0 a() {
                d0 d0Var = new d0();
                d0Var.b(this.f34353a);
                return d0Var;
            }

            public a b(Long l10) {
                this.f34353a = l10;
                return this;
            }
        }

        d0() {
        }

        static d0 a(ArrayList<Object> arrayList) {
            Long l10;
            d0 d0Var = new d0();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            d0Var.b(l10);
            return d0Var;
        }

        public void b(Long l10) {
            if (l10 != null) {
                this.f34352a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"statusCode\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> c() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f34352a);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface e {
        void a(Long l10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface e0 {
        String a(Long l10);

        void b(Long l10, Boolean bool);

        void c(Long l10, Boolean bool);

        void d(Long l10, Long l11);

        void e(Long l10, Boolean bool);

        void f(Long l10, Boolean bool);

        void g(Long l10, Long l11);

        void h(Long l10, Boolean bool);

        void i(Long l10, Boolean bool);

        void j(Long l10, Boolean bool);

        void k(Long l10, Boolean bool);

        void l(Long l10, Boolean bool);

        void m(Long l10, String str);

        void n(Long l10, Boolean bool);

        void o(Long l10, Boolean bool);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34354a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public f(lc.c cVar) {
            this.f34354a = cVar;
        }

        static lc.i<Object> b() {
            return new lc.r();
        }

        public void d(Long l10, String str, String str2, String str3, String str4, Long l11, a<Void> aVar) {
            new lc.a(this.f34354a, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", b()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, str, str2, str3, str4, l11})), new w(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface f0 {
        void a(Long l10);

        void b(Long l10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface g {
        void a(Long l10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class g0 {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34355a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public g0(lc.c cVar) {
            this.f34355a = cVar;
        }

        static lc.i<Object> k() {
            return h0.f34361d;
        }

        public void A(Long l10, Long l11, c0 c0Var, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", k()).d(new ArrayList(Arrays.asList(new Object[]{l10, l11, c0Var})), new j2(aVar));
        }

        public void B(Long l10, Long l11, String str, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new m2(aVar));
        }

        public void j(Long l10, Long l11, String str, Boolean bool, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str, bool})), new k2(aVar));
        }

        public void u(Long l10, Long l11, String str, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new l2(aVar));
        }

        public void v(Long l10, Long l11, String str, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new n2(aVar));
        }

        public void w(Long l10, Long l11, Long l12, String str, String str2, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, l12, str, str2})), new o2(aVar));
        }

        public void x(Long l10, Long l11, Long l12, String str, String str2, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", k()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, l12, str, str2})), new p2(aVar));
        }

        public void y(Long l10, Long l11, c0 c0Var, d0 d0Var, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpError", k()).d(new ArrayList(Arrays.asList(new Object[]{l10, l11, c0Var, d0Var})), new q2(aVar));
        }

        public void z(Long l10, Long l11, c0 c0Var, b0 b0Var, a<Void> aVar) {
            new lc.a(this.f34355a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", k()).d(new ArrayList(Arrays.asList(new Object[]{l10, l11, c0Var, b0Var})), new r2(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public enum h {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);
        

        /* renamed from: a  reason: collision with root package name */
        final int f34360a;

        private h(int i10) {
            this.f34360a = i10;
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    private static class h0 extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final h0 f34361d = new h0();

        private h0() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return b0.a((ArrayList) f(byteBuffer));
                case -127:
                    return c0.a((ArrayList) f(byteBuffer));
                case -126:
                    return d0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b0) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b0) obj).d());
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((c0) obj).h());
            } else if (obj instanceof d0) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((d0) obj).c());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34362a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public i(lc.c cVar) {
            this.f34362a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, Boolean bool, List<String> list, h hVar, String str, a<Void> aVar) {
            new lc.a(this.f34362a, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", c()).d(new ArrayList(Arrays.asList(new Object[]{l10, bool, list, Integer.valueOf(hVar.f34360a), str})), new z(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface i0 {
        void a(Long l10);

        void b(Long l10, Boolean bool);
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface j {
        String a(String str);

        List<String> b(String str);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class j0 {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34363a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public j0(lc.c cVar) {
            this.f34363a = cVar;
        }

        static lc.i<Object> d() {
            return new lc.r();
        }

        public void c(Long l10, a<Void> aVar) {
            new lc.a(this.f34363a, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", d()).d(new ArrayList(Collections.singletonList(l10)), new v2(aVar));
        }

        public void g(Long l10, Long l11, Long l12, Long l13, Long l14, a<Void> aVar) {
            new lc.a(this.f34363a, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.onScrollChanged", d()).d(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12, l13, l14})), new w2(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class k extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f34364a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f34365b;
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface k0 {
        void a(Long l10);

        Long b(Long l10);

        void c(Long l10, String str, String str2, String str3);

        void d(Long l10, Long l11);

        void e(Boolean bool);

        void f(Long l10, Long l11);

        void g(Long l10);

        void h(Long l10, String str, Map<String, String> map);

        void i(Long l10, Boolean bool);

        void j(Long l10, String str, w<String> wVar);

        void k(Long l10, Long l11, Long l12);

        void l(Long l10, Long l11);

        Long m(Long l10);

        m0 n(Long l10);

        String o(Long l10);

        void p(Long l10);

        Boolean q(Long l10);

        void r(Long l10, String str, String str2, String str3, String str4, String str5);

        void s(Long l10);

        void t(Long l10, Long l11);

        void u(Long l10, Long l11);

        Boolean v(Long l10);

        String w(Long l10);

        void x(Long l10, String str, byte[] bArr);

        void y(Long l10, Long l11, Long l12);

        void z(Long l10, Long l11);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34366a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public l(lc.c cVar) {
            this.f34366a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, a<Void> aVar) {
            new lc.a(this.f34366a, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l10)), new d0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    private static class l0 extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final l0 f34367d = new l0();

        private l0() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.g(b10, byteBuffer);
            }
            return m0.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof m0) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((m0) obj).d());
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface m {
        void a(Long l10, String str, Boolean bool, Boolean bool2);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static final class m0 {

        /* renamed from: a  reason: collision with root package name */
        private Long f34368a;

        /* renamed from: b  reason: collision with root package name */
        private Long f34369b;

        /* compiled from: GeneratedAndroidWebView */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f34370a;

            /* renamed from: b  reason: collision with root package name */
            private Long f34371b;

            public m0 a() {
                m0 m0Var = new m0();
                m0Var.b(this.f34370a);
                m0Var.c(this.f34371b);
                return m0Var;
            }

            public a b(Long l10) {
                this.f34370a = l10;
                return this;
            }

            public a c(Long l10) {
                this.f34371b = l10;
                return this;
            }
        }

        m0() {
        }

        static m0 a(ArrayList<Object> arrayList) {
            Long l10;
            m0 m0Var = new m0();
            Object obj = arrayList.get(0);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            m0Var.b(l10);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            m0Var.c(l11);
            return m0Var;
        }

        public void b(Long l10) {
            if (l10 != null) {
                this.f34368a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"x\" is null.");
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f34369b = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"y\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f34368a);
            arrayList.add(this.f34369b);
            return arrayList;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.n$n  reason: collision with other inner class name */
    /* compiled from: GeneratedAndroidWebView */
    public static class C0390n {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34372a;

        /* renamed from: io.flutter.plugins.webviewflutter.n$n$a */
        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public C0390n(lc.c cVar) {
            this.f34372a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, a<Void> aVar) {
            new lc.a(this.f34372a, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l10)), new g0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface o {
        void a(Long l10);

        Boolean b(Long l10);

        void c(Long l10, String str, String str2);
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface p {
        void clear();
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class q {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34373a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public q(lc.c cVar) {
            this.f34373a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, a<Void> aVar) {
            new lc.a(this.f34373a, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", c()).d(new ArrayList(Collections.singletonList(l10)), new n0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface r {
        void a(Long l10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34374a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public s(lc.c cVar) {
            this.f34374a = cVar;
        }

        static lc.i<Object> b() {
            return new lc.r();
        }

        public void d(Long l10, String str, a<Void> aVar) {
            new lc.a(this.f34374a, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", b()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, str})), new q0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface t {
        void a(Long l10, String str);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34375a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public u(lc.c cVar) {
            this.f34375a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, List<String> list, a<Void> aVar) {
            new lc.a(this.f34375a, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", c()).d(new ArrayList(Arrays.asList(new Object[]{l10, list})), new t0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface v {
        void a(Long l10, List<String> list);

        void b(Long l10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public interface w<T> {
        void success(T t10);
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class x {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34376a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public x(lc.c cVar) {
            this.f34376a = cVar;
        }

        static lc.i<Object> c() {
            return new lc.r();
        }

        public void b(Long l10, a<Void> aVar) {
            new lc.a(this.f34376a, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l10)), new x0(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    public static class y {

        /* renamed from: a  reason: collision with root package name */
        private final lc.c f34377a;

        /* compiled from: GeneratedAndroidWebView */
        public interface a<T> {
            void a(T t10);
        }

        public y(lc.c cVar) {
            this.f34377a = cVar;
        }

        static lc.i<Object> l() {
            return z.f34378d;
        }

        public void A(Long l10, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", l()).d(new ArrayList(Collections.singletonList(l10)), new h1(aVar));
        }

        public void B(Long l10, String str, String str2, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", l()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, str, str2})), new b1(aVar));
        }

        public void C(Long l10, String str, String str2, a<Boolean> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", l()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, str, str2})), new i1(aVar));
        }

        public void D(Long l10, String str, String str2, String str3, a<String> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", l()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, str, str2, str3})), new c1(aVar));
        }

        public void E(Long l10, Long l11, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", l()).d(new ArrayList(Arrays.asList(new Long[]{l10, l11})), new y0(aVar));
        }

        public void F(Long l10, Long l11, Long l12, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", l()).d(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12})), new a1(aVar));
        }

        public void G(Long l10, Long l11, Long l12, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", l()).d(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12})), new e1(aVar));
        }

        public void H(Long l10, Long l11, Long l12, a<List<String>> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", l()).d(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12})), new z0(aVar));
        }

        public void x(Long l10, a aVar, a<Void> aVar2) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", l()).d(new ArrayList(Arrays.asList(new Object[]{l10, aVar})), new d1(aVar2));
        }

        public void y(Long l10, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", l()).d(new ArrayList(Collections.singletonList(l10)), new g1(aVar));
        }

        public void z(Long l10, Long l11, String str, a<Void> aVar) {
            new lc.a(this.f34377a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", l()).d(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new f1(aVar));
        }
    }

    /* compiled from: GeneratedAndroidWebView */
    private static class z extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final z f34378d = new z();

        private z() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.g(b10, byteBuffer);
            }
            return a.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((a) obj).f());
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof k) {
            k kVar = (k) th;
            arrayList.add(kVar.f34364a);
            arrayList.add(kVar.getMessage());
            arrayList.add(kVar.f34365b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
