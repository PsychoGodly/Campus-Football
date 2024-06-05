package com.applovin.impl.sdk.network;

import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f11881a;

    /* renamed from: b  reason: collision with root package name */
    private String f11882b;

    /* renamed from: c  reason: collision with root package name */
    private Map f11883c;

    /* renamed from: d  reason: collision with root package name */
    private Map f11884d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f11885e;

    /* renamed from: f  reason: collision with root package name */
    private String f11886f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f11887g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11888h;

    /* renamed from: i  reason: collision with root package name */
    private int f11889i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11890j;

    /* renamed from: k  reason: collision with root package name */
    private final int f11891k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f11892l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11893m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f11894n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11895o;

    /* renamed from: p  reason: collision with root package name */
    private final qi.a f11896p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f11897q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f11898r;

    /* renamed from: com.applovin.impl.sdk.network.a$a  reason: collision with other inner class name */
    public static class C0139a {

        /* renamed from: a  reason: collision with root package name */
        String f11899a;

        /* renamed from: b  reason: collision with root package name */
        String f11900b;

        /* renamed from: c  reason: collision with root package name */
        String f11901c;

        /* renamed from: d  reason: collision with root package name */
        Map f11902d;

        /* renamed from: e  reason: collision with root package name */
        Map f11903e;

        /* renamed from: f  reason: collision with root package name */
        JSONObject f11904f;

        /* renamed from: g  reason: collision with root package name */
        Object f11905g;

        /* renamed from: h  reason: collision with root package name */
        int f11906h = 1;

        /* renamed from: i  reason: collision with root package name */
        int f11907i;

        /* renamed from: j  reason: collision with root package name */
        int f11908j;

        /* renamed from: k  reason: collision with root package name */
        boolean f11909k;

        /* renamed from: l  reason: collision with root package name */
        boolean f11910l;

        /* renamed from: m  reason: collision with root package name */
        boolean f11911m;

        /* renamed from: n  reason: collision with root package name */
        boolean f11912n;

        /* renamed from: o  reason: collision with root package name */
        boolean f11913o;

        /* renamed from: p  reason: collision with root package name */
        boolean f11914p;

        /* renamed from: q  reason: collision with root package name */
        qi.a f11915q;

        public C0139a(k kVar) {
            this.f11907i = ((Integer) kVar.a(oj.f10268b3)).intValue();
            this.f11908j = ((Integer) kVar.a(oj.f10261a3)).intValue();
            this.f11910l = true;
            this.f11911m = ((Boolean) kVar.a(oj.f10451y3)).booleanValue();
            this.f11912n = ((Boolean) kVar.a(oj.f10333j5)).booleanValue();
            this.f11915q = qi.a.a(((Integer) kVar.a(oj.f10341k5)).intValue());
            this.f11914p = ((Boolean) kVar.a(oj.H5)).booleanValue();
            this.f11902d = new HashMap();
        }

        public C0139a a(qi.a aVar) {
            this.f11915q = aVar;
            return this;
        }

        public C0139a b(String str) {
            this.f11900b = str;
            return this;
        }

        public C0139a c(String str) {
            this.f11899a = str;
            return this;
        }

        public C0139a d(boolean z10) {
            this.f11910l = z10;
            return this;
        }

        public C0139a e(boolean z10) {
            this.f11911m = z10;
            return this;
        }

        public C0139a f(boolean z10) {
            this.f11913o = z10;
            return this;
        }

        public C0139a a(Map map) {
            this.f11903e = map;
            return this;
        }

        public C0139a b(Map map) {
            this.f11902d = map;
            return this;
        }

        public C0139a c(int i10) {
            this.f11907i = i10;
            return this;
        }

        public C0139a a(JSONObject jSONObject) {
            this.f11904f = jSONObject;
            return this;
        }

        public C0139a b(int i10) {
            this.f11908j = i10;
            return this;
        }

        public C0139a c(boolean z10) {
            this.f11909k = z10;
            return this;
        }

        public C0139a a(String str) {
            this.f11901c = str;
            return this;
        }

        public C0139a b(boolean z10) {
            this.f11914p = z10;
            return this;
        }

        public C0139a a(Object obj) {
            this.f11905g = obj;
            return this;
        }

        public C0139a a(int i10) {
            this.f11906h = i10;
            return this;
        }

        public C0139a a(boolean z10) {
            this.f11912n = z10;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    protected a(C0139a aVar) {
        this.f11881a = aVar.f11900b;
        this.f11882b = aVar.f11899a;
        this.f11883c = aVar.f11902d;
        this.f11884d = aVar.f11903e;
        this.f11885e = aVar.f11904f;
        this.f11886f = aVar.f11901c;
        this.f11887g = aVar.f11905g;
        int i10 = aVar.f11906h;
        this.f11888h = i10;
        this.f11889i = i10;
        this.f11890j = aVar.f11907i;
        this.f11891k = aVar.f11908j;
        this.f11892l = aVar.f11909k;
        this.f11893m = aVar.f11910l;
        this.f11894n = aVar.f11911m;
        this.f11895o = aVar.f11912n;
        this.f11896p = aVar.f11915q;
        this.f11897q = aVar.f11913o;
        this.f11898r = aVar.f11914p;
    }

    public void a(String str) {
        this.f11881a = str;
    }

    public void b(String str) {
        this.f11882b = str;
    }

    public int c() {
        return this.f11888h - this.f11889i;
    }

    public Object d() {
        return this.f11887g;
    }

    public qi.a e() {
        return this.f11896p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f11881a;
        if (str == null ? aVar.f11881a != null : !str.equals(aVar.f11881a)) {
            return false;
        }
        Map map = this.f11883c;
        if (map == null ? aVar.f11883c != null : !map.equals(aVar.f11883c)) {
            return false;
        }
        Map map2 = this.f11884d;
        if (map2 == null ? aVar.f11884d != null : !map2.equals(aVar.f11884d)) {
            return false;
        }
        String str2 = this.f11886f;
        if (str2 == null ? aVar.f11886f != null : !str2.equals(aVar.f11886f)) {
            return false;
        }
        String str3 = this.f11882b;
        if (str3 == null ? aVar.f11882b != null : !str3.equals(aVar.f11882b)) {
            return false;
        }
        JSONObject jSONObject = this.f11885e;
        if (jSONObject == null ? aVar.f11885e != null : !jSONObject.equals(aVar.f11885e)) {
            return false;
        }
        Object obj2 = this.f11887g;
        if (obj2 == null ? aVar.f11887g == null : obj2.equals(aVar.f11887g)) {
            return this.f11888h == aVar.f11888h && this.f11889i == aVar.f11889i && this.f11890j == aVar.f11890j && this.f11891k == aVar.f11891k && this.f11892l == aVar.f11892l && this.f11893m == aVar.f11893m && this.f11894n == aVar.f11894n && this.f11895o == aVar.f11895o && this.f11896p == aVar.f11896p && this.f11897q == aVar.f11897q && this.f11898r == aVar.f11898r;
        }
        return false;
    }

    public String f() {
        return this.f11881a;
    }

    public Map g() {
        return this.f11884d;
    }

    public String h() {
        return this.f11882b;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f11881a;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11886f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11882b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f11887g;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        int b10 = ((((((((((((((((((((((hashCode4 + i10) * 31) + this.f11888h) * 31) + this.f11889i) * 31) + this.f11890j) * 31) + this.f11891k) * 31) + (this.f11892l ? 1 : 0)) * 31) + (this.f11893m ? 1 : 0)) * 31) + (this.f11894n ? 1 : 0)) * 31) + (this.f11895o ? 1 : 0)) * 31) + this.f11896p.b()) * 31) + (this.f11897q ? 1 : 0)) * 31) + (this.f11898r ? 1 : 0);
        Map map = this.f11883c;
        if (map != null) {
            b10 = (b10 * 31) + map.hashCode();
        }
        Map map2 = this.f11884d;
        if (map2 != null) {
            b10 = (b10 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f11885e;
        if (jSONObject == null) {
            return b10;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (b10 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f11883c;
    }

    public int j() {
        return this.f11889i;
    }

    public int k() {
        return this.f11891k;
    }

    public int l() {
        return this.f11890j;
    }

    public boolean m() {
        return this.f11895o;
    }

    public boolean n() {
        return this.f11892l;
    }

    public boolean o() {
        return this.f11898r;
    }

    public boolean p() {
        return this.f11893m;
    }

    public boolean q() {
        return this.f11894n;
    }

    public boolean r() {
        return this.f11897q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f11881a + ", backupEndpoint=" + this.f11886f + ", httpMethod=" + this.f11882b + ", httpHeaders=" + this.f11884d + ", body=" + this.f11885e + ", emptyResponse=" + this.f11887g + ", initialRetryAttempts=" + this.f11888h + ", retryAttemptsLeft=" + this.f11889i + ", timeoutMillis=" + this.f11890j + ", retryDelayMillis=" + this.f11891k + ", exponentialRetries=" + this.f11892l + ", retryOnAllErrors=" + this.f11893m + ", retryOnNoConnection=" + this.f11894n + ", encodingEnabled=" + this.f11895o + ", encodingType=" + this.f11896p + ", trackConnectionSpeed=" + this.f11897q + ", gzipBodyEncoding=" + this.f11898r + '}';
    }

    public String a() {
        return this.f11886f;
    }

    public JSONObject b() {
        return this.f11885e;
    }

    public void a(int i10) {
        this.f11889i = i10;
    }

    public static C0139a a(k kVar) {
        return new C0139a(kVar);
    }
}
