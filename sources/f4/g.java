package f4;

import android.text.Layout;

/* compiled from: TtmlStyle */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f18048a;

    /* renamed from: b  reason: collision with root package name */
    private int f18049b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18050c;

    /* renamed from: d  reason: collision with root package name */
    private int f18051d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18052e;

    /* renamed from: f  reason: collision with root package name */
    private int f18053f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f18054g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f18055h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f18056i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f18057j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f18058k;

    /* renamed from: l  reason: collision with root package name */
    private String f18059l;

    /* renamed from: m  reason: collision with root package name */
    private int f18060m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f18061n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f18062o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f18063p;

    /* renamed from: q  reason: collision with root package name */
    private int f18064q = -1;

    /* renamed from: r  reason: collision with root package name */
    private b f18065r;

    /* renamed from: s  reason: collision with root package name */
    private float f18066s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f18050c && gVar.f18050c) {
                w(gVar.f18049b);
            }
            if (this.f18055h == -1) {
                this.f18055h = gVar.f18055h;
            }
            if (this.f18056i == -1) {
                this.f18056i = gVar.f18056i;
            }
            if (this.f18048a == null && (str = gVar.f18048a) != null) {
                this.f18048a = str;
            }
            if (this.f18053f == -1) {
                this.f18053f = gVar.f18053f;
            }
            if (this.f18054g == -1) {
                this.f18054g = gVar.f18054g;
            }
            if (this.f18061n == -1) {
                this.f18061n = gVar.f18061n;
            }
            if (this.f18062o == null && (alignment2 = gVar.f18062o) != null) {
                this.f18062o = alignment2;
            }
            if (this.f18063p == null && (alignment = gVar.f18063p) != null) {
                this.f18063p = alignment;
            }
            if (this.f18064q == -1) {
                this.f18064q = gVar.f18064q;
            }
            if (this.f18057j == -1) {
                this.f18057j = gVar.f18057j;
                this.f18058k = gVar.f18058k;
            }
            if (this.f18065r == null) {
                this.f18065r = gVar.f18065r;
            }
            if (this.f18066s == Float.MAX_VALUE) {
                this.f18066s = gVar.f18066s;
            }
            if (z10 && !this.f18052e && gVar.f18052e) {
                u(gVar.f18051d);
            }
            if (z10 && this.f18060m == -1 && (i10 = gVar.f18060m) != -1) {
                this.f18060m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f18059l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f18056i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f18053f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f18063p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f18061n = i10;
        return this;
    }

    public g F(int i10) {
        this.f18060m = i10;
        return this;
    }

    public g G(float f10) {
        this.f18066s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f18062o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f18064q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f18065r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f18054g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f18052e) {
            return this.f18051d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f18050c) {
            return this.f18049b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f18048a;
    }

    public float e() {
        return this.f18058k;
    }

    public int f() {
        return this.f18057j;
    }

    public String g() {
        return this.f18059l;
    }

    public Layout.Alignment h() {
        return this.f18063p;
    }

    public int i() {
        return this.f18061n;
    }

    public int j() {
        return this.f18060m;
    }

    public float k() {
        return this.f18066s;
    }

    public int l() {
        int i10 = this.f18055h;
        if (i10 == -1 && this.f18056i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f18056i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment m() {
        return this.f18062o;
    }

    public boolean n() {
        return this.f18064q == 1;
    }

    public b o() {
        return this.f18065r;
    }

    public boolean p() {
        return this.f18052e;
    }

    public boolean q() {
        return this.f18050c;
    }

    public boolean s() {
        return this.f18053f == 1;
    }

    public boolean t() {
        return this.f18054g == 1;
    }

    public g u(int i10) {
        this.f18051d = i10;
        this.f18052e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f18055h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f18049b = i10;
        this.f18050c = true;
        return this;
    }

    public g x(String str) {
        this.f18048a = str;
        return this;
    }

    public g y(float f10) {
        this.f18058k = f10;
        return this;
    }

    public g z(int i10) {
        this.f18057j = i10;
        return this;
    }
}
