package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class d9 implements m2 {
    private static final d9 H = new b().a();
    public static final m2.a I = cw.f7054a;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;

    /* renamed from: a  reason: collision with root package name */
    public final String f7142a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7143b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7144c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7145d;

    /* renamed from: f  reason: collision with root package name */
    public final int f7146f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7147g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7148h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7149i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7150j;

    /* renamed from: k  reason: collision with root package name */
    public final we f7151k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7152l;

    /* renamed from: m  reason: collision with root package name */
    public final String f7153m;

    /* renamed from: n  reason: collision with root package name */
    public final int f7154n;

    /* renamed from: o  reason: collision with root package name */
    public final List f7155o;

    /* renamed from: p  reason: collision with root package name */
    public final w6 f7156p;

    /* renamed from: q  reason: collision with root package name */
    public final long f7157q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7158r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7159s;

    /* renamed from: t  reason: collision with root package name */
    public final float f7160t;

    /* renamed from: u  reason: collision with root package name */
    public final int f7161u;

    /* renamed from: v  reason: collision with root package name */
    public final float f7162v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f7163w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7164x;

    /* renamed from: y  reason: collision with root package name */
    public final p3 f7165y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7166z;

    public static final class b {
        /* access modifiers changed from: private */
        public int A;
        /* access modifiers changed from: private */
        public int B;
        /* access modifiers changed from: private */
        public int C;
        /* access modifiers changed from: private */
        public int D;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f7167a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f7168b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f7169c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f7170d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f7171e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f7172f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f7173g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String f7174h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public we f7175i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public String f7176j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public String f7177k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public int f7178l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public List f7179m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public w6 f7180n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public long f7181o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f7182p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f7183q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public float f7184r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public int f7185s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public float f7186t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public byte[] f7187u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public int f7188v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public p3 f7189w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public int f7190x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public int f7191y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public int f7192z;

        public b() {
            this.f7172f = -1;
            this.f7173g = -1;
            this.f7178l = -1;
            this.f7181o = Long.MAX_VALUE;
            this.f7182p = -1;
            this.f7183q = -1;
            this.f7184r = -1.0f;
            this.f7186t = 1.0f;
            this.f7188v = -1;
            this.f7190x = -1;
            this.f7191y = -1;
            this.f7192z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b a(int i10) {
            this.C = i10;
            return this;
        }

        public b b(int i10) {
            this.f7172f = i10;
            return this;
        }

        public b c(int i10) {
            this.f7190x = i10;
            return this;
        }

        public b d(int i10) {
            this.D = i10;
            return this;
        }

        public b e(int i10) {
            this.A = i10;
            return this;
        }

        public b f(int i10) {
            this.B = i10;
            return this;
        }

        public b g(int i10) {
            this.f7183q = i10;
            return this;
        }

        public b h(int i10) {
            this.f7167a = Integer.toString(i10);
            return this;
        }

        public b i(int i10) {
            this.f7178l = i10;
            return this;
        }

        public b j(int i10) {
            this.f7192z = i10;
            return this;
        }

        public b k(int i10) {
            this.f7173g = i10;
            return this;
        }

        public b l(int i10) {
            this.f7171e = i10;
            return this;
        }

        public b m(int i10) {
            this.f7185s = i10;
            return this;
        }

        public b n(int i10) {
            this.f7191y = i10;
            return this;
        }

        public b o(int i10) {
            this.f7170d = i10;
            return this;
        }

        public b p(int i10) {
            this.f7188v = i10;
            return this;
        }

        public b q(int i10) {
            this.f7182p = i10;
            return this;
        }

        public b a(String str) {
            this.f7174h = str;
            return this;
        }

        public b b(String str) {
            this.f7176j = str;
            return this;
        }

        public b c(String str) {
            this.f7167a = str;
            return this;
        }

        public b d(String str) {
            this.f7168b = str;
            return this;
        }

        public b e(String str) {
            this.f7169c = str;
            return this;
        }

        public b f(String str) {
            this.f7177k = str;
            return this;
        }

        public b a(p3 p3Var) {
            this.f7189w = p3Var;
            return this;
        }

        public b b(float f10) {
            this.f7186t = f10;
            return this;
        }

        public b a(w6 w6Var) {
            this.f7180n = w6Var;
            return this;
        }

        public b a(float f10) {
            this.f7184r = f10;
            return this;
        }

        public b a(List list) {
            this.f7179m = list;
            return this;
        }

        public b a(we weVar) {
            this.f7175i = weVar;
            return this;
        }

        public b a(byte[] bArr) {
            this.f7187u = bArr;
            return this;
        }

        public b a(long j10) {
            this.f7181o = j10;
            return this;
        }

        public d9 a() {
            return new d9(this);
        }

        private b(d9 d9Var) {
            this.f7167a = d9Var.f7142a;
            this.f7168b = d9Var.f7143b;
            this.f7169c = d9Var.f7144c;
            this.f7170d = d9Var.f7145d;
            this.f7171e = d9Var.f7146f;
            this.f7172f = d9Var.f7147g;
            this.f7173g = d9Var.f7148h;
            this.f7174h = d9Var.f7150j;
            this.f7175i = d9Var.f7151k;
            this.f7176j = d9Var.f7152l;
            this.f7177k = d9Var.f7153m;
            this.f7178l = d9Var.f7154n;
            this.f7179m = d9Var.f7155o;
            this.f7180n = d9Var.f7156p;
            this.f7181o = d9Var.f7157q;
            this.f7182p = d9Var.f7158r;
            this.f7183q = d9Var.f7159s;
            this.f7184r = d9Var.f7160t;
            this.f7185s = d9Var.f7161u;
            this.f7186t = d9Var.f7162v;
            this.f7187u = d9Var.f7163w;
            this.f7188v = d9Var.f7164x;
            this.f7189w = d9Var.f7165y;
            this.f7190x = d9Var.f7166z;
            this.f7191y = d9Var.A;
            this.f7192z = d9Var.B;
            this.A = d9Var.C;
            this.B = d9Var.D;
            this.C = d9Var.E;
            this.D = d9Var.F;
        }
    }

    private d9(b bVar) {
        this.f7142a = bVar.f7167a;
        this.f7143b = bVar.f7168b;
        this.f7144c = yp.f(bVar.f7169c);
        this.f7145d = bVar.f7170d;
        this.f7146f = bVar.f7171e;
        int A2 = bVar.f7172f;
        this.f7147g = A2;
        int B2 = bVar.f7173g;
        this.f7148h = B2;
        this.f7149i = B2 != -1 ? B2 : A2;
        this.f7150j = bVar.f7174h;
        this.f7151k = bVar.f7175i;
        this.f7152l = bVar.f7176j;
        this.f7153m = bVar.f7177k;
        this.f7154n = bVar.f7178l;
        this.f7155o = bVar.f7179m == null ? Collections.emptyList() : bVar.f7179m;
        w6 f10 = bVar.f7180n;
        this.f7156p = f10;
        this.f7157q = bVar.f7181o;
        this.f7158r = bVar.f7182p;
        this.f7159s = bVar.f7183q;
        this.f7160t = bVar.f7184r;
        int i10 = 0;
        this.f7161u = bVar.f7185s == -1 ? 0 : bVar.f7185s;
        this.f7162v = bVar.f7186t == -1.0f ? 1.0f : bVar.f7186t;
        this.f7163w = bVar.f7187u;
        this.f7164x = bVar.f7188v;
        this.f7165y = bVar.f7189w;
        this.f7166z = bVar.f7190x;
        this.A = bVar.f7191y;
        this.B = bVar.f7192z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : i10;
        this.E = bVar.C;
        if (bVar.D != 0 || f10 == null) {
            this.F = bVar.D;
        } else {
            this.F = 1;
        }
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i10) {
        return b(12) + "_" + Integer.toString(i10, 36);
    }

    public d9 a(int i10) {
        return a().d(i10).a();
    }

    public int b() {
        int i10;
        int i11 = this.f7158r;
        if (i11 == -1 || (i10 = this.f7159s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.class != obj.getClass()) {
            return false;
        }
        d9 d9Var = (d9) obj;
        int i11 = this.G;
        if ((i11 == 0 || (i10 = d9Var.G) == 0 || i11 == i10) && this.f7145d == d9Var.f7145d && this.f7146f == d9Var.f7146f && this.f7147g == d9Var.f7147g && this.f7148h == d9Var.f7148h && this.f7154n == d9Var.f7154n && this.f7157q == d9Var.f7157q && this.f7158r == d9Var.f7158r && this.f7159s == d9Var.f7159s && this.f7161u == d9Var.f7161u && this.f7164x == d9Var.f7164x && this.f7166z == d9Var.f7166z && this.A == d9Var.A && this.B == d9Var.B && this.C == d9Var.C && this.D == d9Var.D && this.E == d9Var.E && this.F == d9Var.F && Float.compare(this.f7160t, d9Var.f7160t) == 0 && Float.compare(this.f7162v, d9Var.f7162v) == 0 && yp.a((Object) this.f7142a, (Object) d9Var.f7142a) && yp.a((Object) this.f7143b, (Object) d9Var.f7143b) && yp.a((Object) this.f7150j, (Object) d9Var.f7150j) && yp.a((Object) this.f7152l, (Object) d9Var.f7152l) && yp.a((Object) this.f7153m, (Object) d9Var.f7153m) && yp.a((Object) this.f7144c, (Object) d9Var.f7144c) && Arrays.equals(this.f7163w, d9Var.f7163w) && yp.a((Object) this.f7151k, (Object) d9Var.f7151k) && yp.a((Object) this.f7165y, (Object) d9Var.f7165y) && yp.a((Object) this.f7156p, (Object) d9Var.f7156p) && a(d9Var)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.G == 0) {
            String str = this.f7142a;
            int i10 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f7143b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f7144c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7145d) * 31) + this.f7146f) * 31) + this.f7147g) * 31) + this.f7148h) * 31;
            String str4 = this.f7150j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            we weVar = this.f7151k;
            int hashCode5 = (hashCode4 + (weVar == null ? 0 : weVar.hashCode())) * 31;
            String str5 = this.f7152l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f7153m;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.G = ((((((((((((((((((((((((((((((hashCode6 + i10) * 31) + this.f7154n) * 31) + ((int) this.f7157q)) * 31) + this.f7158r) * 31) + this.f7159s) * 31) + Float.floatToIntBits(this.f7160t)) * 31) + this.f7161u) * 31) + Float.floatToIntBits(this.f7162v)) * 31) + this.f7164x) * 31) + this.f7166z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public String toString() {
        return "Format(" + this.f7142a + ", " + this.f7143b + ", " + this.f7152l + ", " + this.f7153m + ", " + this.f7150j + ", " + this.f7149i + ", " + this.f7144c + ", [" + this.f7158r + ", " + this.f7159s + ", " + this.f7160t + "], [" + this.f7166z + ", " + this.A + "])";
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean a(d9 d9Var) {
        if (this.f7155o.size() != d9Var.f7155o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f7155o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f7155o.get(i10), (byte[]) d9Var.f7155o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public b a() {
        return new b();
    }

    /* access modifiers changed from: private */
    public static d9 a(Bundle bundle) {
        b bVar = new b();
        n2.a(bundle);
        int i10 = 0;
        String string = bundle.getString(b(0));
        d9 d9Var = H;
        bVar.c((String) a(string, d9Var.f7142a)).d((String) a(bundle.getString(b(1)), d9Var.f7143b)).e((String) a(bundle.getString(b(2)), d9Var.f7144c)).o(bundle.getInt(b(3), d9Var.f7145d)).l(bundle.getInt(b(4), d9Var.f7146f)).b(bundle.getInt(b(5), d9Var.f7147g)).k(bundle.getInt(b(6), d9Var.f7148h)).a((String) a(bundle.getString(b(7)), d9Var.f7150j)).a((we) a((we) bundle.getParcelable(b(8)), d9Var.f7151k)).b((String) a(bundle.getString(b(9)), d9Var.f7152l)).f((String) a(bundle.getString(b(10)), d9Var.f7153m)).i(bundle.getInt(b(11), d9Var.f7154n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i10));
            if (byteArray == null) {
                b a10 = bVar.a((List) arrayList).a((w6) bundle.getParcelable(b(13)));
                String b10 = b(14);
                d9 d9Var2 = H;
                a10.a(bundle.getLong(b10, d9Var2.f7157q)).q(bundle.getInt(b(15), d9Var2.f7158r)).g(bundle.getInt(b(16), d9Var2.f7159s)).a(bundle.getFloat(b(17), d9Var2.f7160t)).m(bundle.getInt(b(18), d9Var2.f7161u)).b(bundle.getFloat(b(19), d9Var2.f7162v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), d9Var2.f7164x)).a((p3) n2.a(p3.f10568g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), d9Var2.f7166z)).n(bundle.getInt(b(24), d9Var2.A)).j(bundle.getInt(b(25), d9Var2.B)).e(bundle.getInt(b(26), d9Var2.C)).f(bundle.getInt(b(27), d9Var2.D)).a(bundle.getInt(b(28), d9Var2.E)).d(bundle.getInt(b(29), d9Var2.F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }
}
