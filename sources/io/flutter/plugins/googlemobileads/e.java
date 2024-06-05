package io.flutter.plugins.googlemobileads;

import io.flutter.plugin.platform.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n4.k;
import n4.n;
import n4.y;

/* compiled from: FlutterAd */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f33956a;

    /* compiled from: FlutterAd */
    static abstract class d extends e {
        d(int i10) {
            super(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void d();
    }

    e(int i10) {
        this.f33956a = i10;
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public f b() {
        return null;
    }

    /* compiled from: FlutterAd */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f33957a;

        /* renamed from: b  reason: collision with root package name */
        final String f33958b;

        /* renamed from: c  reason: collision with root package name */
        final String f33959c;

        a(n4.a aVar) {
            this.f33957a = aVar.a();
            this.f33958b = aVar.b();
            this.f33959c = aVar.c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f33957a == aVar.f33957a && this.f33958b.equals(aVar.f33958b)) {
                return this.f33959c.equals(aVar.f33959c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f33957a), this.f33958b, this.f33959c});
        }

        a(int i10, String str, String str2) {
            this.f33957a = i10;
            this.f33958b = str;
            this.f33959c = str2;
        }
    }

    /* compiled from: FlutterAd */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f33969a;

        /* renamed from: b  reason: collision with root package name */
        final String f33970b;

        /* renamed from: c  reason: collision with root package name */
        final String f33971c;

        /* renamed from: d  reason: collision with root package name */
        C0388e f33972d;

        c(n nVar) {
            this.f33969a = nVar.a();
            this.f33970b = nVar.b();
            this.f33971c = nVar.c();
            if (nVar.f() != null) {
                this.f33972d = new C0388e(nVar.f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f33969a == cVar.f33969a && this.f33970b.equals(cVar.f33970b) && Objects.equals(this.f33972d, cVar.f33972d)) {
                return this.f33971c.equals(cVar.f33971c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f33969a), this.f33970b, this.f33971c, this.f33972d});
        }

        c(int i10, String str, String str2, C0388e eVar) {
            this.f33969a = i10;
            this.f33970b = str;
            this.f33971c = str2;
            this.f33972d = eVar;
        }
    }

    /* compiled from: FlutterAd */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f33960a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33961b;

        /* renamed from: c  reason: collision with root package name */
        private final String f33962c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f33963d;

        /* renamed from: e  reason: collision with root package name */
        private a f33964e;

        /* renamed from: f  reason: collision with root package name */
        private final String f33965f;

        /* renamed from: g  reason: collision with root package name */
        private final String f33966g;

        /* renamed from: h  reason: collision with root package name */
        private final String f33967h;

        /* renamed from: i  reason: collision with root package name */
        private final String f33968i;

        b(k kVar) {
            this.f33960a = kVar.f();
            this.f33961b = kVar.h();
            this.f33962c = kVar.toString();
            if (kVar.g() != null) {
                this.f33963d = new HashMap();
                for (String str : kVar.g().keySet()) {
                    this.f33963d.put(str, kVar.g().get(str).toString());
                }
            } else {
                this.f33963d = new HashMap();
            }
            if (kVar.a() != null) {
                this.f33964e = new a(kVar.a());
            }
            this.f33965f = kVar.e();
            this.f33966g = kVar.b();
            this.f33967h = kVar.d();
            this.f33968i = kVar.c();
        }

        public String a() {
            return this.f33966g;
        }

        public String b() {
            return this.f33968i;
        }

        public String c() {
            return this.f33967h;
        }

        public String d() {
            return this.f33965f;
        }

        public Map<String, String> e() {
            return this.f33963d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Objects.equals(this.f33960a, bVar.f33960a) || this.f33961b != bVar.f33961b || !Objects.equals(this.f33962c, bVar.f33962c) || !Objects.equals(this.f33964e, bVar.f33964e) || !Objects.equals(this.f33963d, bVar.f33963d) || !Objects.equals(this.f33965f, bVar.f33965f) || !Objects.equals(this.f33966g, bVar.f33966g) || !Objects.equals(this.f33967h, bVar.f33967h) || !Objects.equals(this.f33968i, bVar.f33968i)) {
                return false;
            }
            return true;
        }

        public String f() {
            return this.f33960a;
        }

        public String g() {
            return this.f33962c;
        }

        public a h() {
            return this.f33964e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f33960a, Long.valueOf(this.f33961b), this.f33962c, this.f33964e, this.f33965f, this.f33966g, this.f33967h, this.f33968i});
        }

        public long i() {
            return this.f33961b;
        }

        b(String str, long j10, String str2, Map<String, String> map, a aVar, String str3, String str4, String str5, String str6) {
            this.f33960a = str;
            this.f33961b = j10;
            this.f33962c = str2;
            this.f33963d = map;
            this.f33964e = aVar;
            this.f33965f = str3;
            this.f33966g = str4;
            this.f33967h = str5;
            this.f33968i = str6;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$e  reason: collision with other inner class name */
    /* compiled from: FlutterAd */
    static class C0388e {

        /* renamed from: a  reason: collision with root package name */
        private final String f33973a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33974b;

        /* renamed from: c  reason: collision with root package name */
        private final List<b> f33975c;

        /* renamed from: d  reason: collision with root package name */
        private final b f33976d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<String, String> f33977e;

        C0388e(y yVar) {
            this.f33973a = yVar.e();
            this.f33974b = yVar.c();
            ArrayList arrayList = new ArrayList();
            for (k bVar : yVar.a()) {
                arrayList.add(new b(bVar));
            }
            this.f33975c = arrayList;
            if (yVar.b() != null) {
                this.f33976d = new b(yVar.b());
            } else {
                this.f33976d = null;
            }
            HashMap hashMap = new HashMap();
            if (yVar.d() != null) {
                for (String str : yVar.d().keySet()) {
                    hashMap.put(str, yVar.d().get(str).toString());
                }
            }
            this.f33977e = hashMap;
        }

        /* access modifiers changed from: package-private */
        public List<b> a() {
            return this.f33975c;
        }

        /* access modifiers changed from: package-private */
        public b b() {
            return this.f33976d;
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.f33974b;
        }

        /* access modifiers changed from: package-private */
        public Map<String, String> d() {
            return this.f33977e;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f33973a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0388e)) {
                return false;
            }
            C0388e eVar = (C0388e) obj;
            if (!Objects.equals(this.f33973a, eVar.f33973a) || !Objects.equals(this.f33974b, eVar.f33974b) || !Objects.equals(this.f33975c, eVar.f33975c) || !Objects.equals(this.f33976d, eVar.f33976d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f33973a, this.f33974b, this.f33975c, this.f33976d});
        }

        C0388e(String str, String str2, List<b> list, b bVar, Map<String, String> map) {
            this.f33973a = str;
            this.f33974b = str2;
            this.f33975c = list;
            this.f33976d = bVar;
            this.f33977e = map;
        }
    }
}
