package y3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import k4.n0;
import n2.h;
import r6.k;

/* compiled from: Cue */
public final class b implements h {
    private static final String A = n0.r0(7);
    private static final String B = n0.r0(8);
    private static final String C = n0.r0(9);
    private static final String D = n0.r0(10);
    private static final String E = n0.r0(11);
    private static final String F = n0.r0(12);
    private static final String G = n0.r0(13);
    private static final String H = n0.r0(14);
    private static final String I = n0.r0(15);
    private static final String J = n0.r0(16);
    public static final h.a<b> K = a.f39376a;

    /* renamed from: s  reason: collision with root package name */
    public static final b f23820s = new C0250b().o(MaxReward.DEFAULT_LABEL).a();

    /* renamed from: t  reason: collision with root package name */
    private static final String f23821t = n0.r0(0);

    /* renamed from: u  reason: collision with root package name */
    private static final String f23822u = n0.r0(1);

    /* renamed from: v  reason: collision with root package name */
    private static final String f23823v = n0.r0(2);

    /* renamed from: w  reason: collision with root package name */
    private static final String f23824w = n0.r0(3);

    /* renamed from: x  reason: collision with root package name */
    private static final String f23825x = n0.r0(4);

    /* renamed from: y  reason: collision with root package name */
    private static final String f23826y = n0.r0(5);

    /* renamed from: z  reason: collision with root package name */
    private static final String f23827z = n0.r0(6);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f23828a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f23829b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f23830c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f23831d;

    /* renamed from: f  reason: collision with root package name */
    public final float f23832f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23833g;

    /* renamed from: h  reason: collision with root package name */
    public final int f23834h;

    /* renamed from: i  reason: collision with root package name */
    public final float f23835i;

    /* renamed from: j  reason: collision with root package name */
    public final int f23836j;

    /* renamed from: k  reason: collision with root package name */
    public final float f23837k;

    /* renamed from: l  reason: collision with root package name */
    public final float f23838l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f23839m;

    /* renamed from: n  reason: collision with root package name */
    public final int f23840n;

    /* renamed from: o  reason: collision with root package name */
    public final int f23841o;

    /* renamed from: p  reason: collision with root package name */
    public final float f23842p;

    /* renamed from: q  reason: collision with root package name */
    public final int f23843q;

    /* renamed from: r  reason: collision with root package name */
    public final float f23844r;

    /* renamed from: y3.b$b  reason: collision with other inner class name */
    /* compiled from: Cue */
    public static final class C0250b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f23845a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f23846b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f23847c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f23848d;

        /* renamed from: e  reason: collision with root package name */
        private float f23849e;

        /* renamed from: f  reason: collision with root package name */
        private int f23850f;

        /* renamed from: g  reason: collision with root package name */
        private int f23851g;

        /* renamed from: h  reason: collision with root package name */
        private float f23852h;

        /* renamed from: i  reason: collision with root package name */
        private int f23853i;

        /* renamed from: j  reason: collision with root package name */
        private int f23854j;

        /* renamed from: k  reason: collision with root package name */
        private float f23855k;

        /* renamed from: l  reason: collision with root package name */
        private float f23856l;

        /* renamed from: m  reason: collision with root package name */
        private float f23857m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f23858n;

        /* renamed from: o  reason: collision with root package name */
        private int f23859o;

        /* renamed from: p  reason: collision with root package name */
        private int f23860p;

        /* renamed from: q  reason: collision with root package name */
        private float f23861q;

        public b a() {
            return new b(this.f23845a, this.f23847c, this.f23848d, this.f23846b, this.f23849e, this.f23850f, this.f23851g, this.f23852h, this.f23853i, this.f23854j, this.f23855k, this.f23856l, this.f23857m, this.f23858n, this.f23859o, this.f23860p, this.f23861q);
        }

        public C0250b b() {
            this.f23858n = false;
            return this;
        }

        public int c() {
            return this.f23851g;
        }

        public int d() {
            return this.f23853i;
        }

        public CharSequence e() {
            return this.f23845a;
        }

        public C0250b f(Bitmap bitmap) {
            this.f23846b = bitmap;
            return this;
        }

        public C0250b g(float f10) {
            this.f23857m = f10;
            return this;
        }

        public C0250b h(float f10, int i10) {
            this.f23849e = f10;
            this.f23850f = i10;
            return this;
        }

        public C0250b i(int i10) {
            this.f23851g = i10;
            return this;
        }

        public C0250b j(Layout.Alignment alignment) {
            this.f23848d = alignment;
            return this;
        }

        public C0250b k(float f10) {
            this.f23852h = f10;
            return this;
        }

        public C0250b l(int i10) {
            this.f23853i = i10;
            return this;
        }

        public C0250b m(float f10) {
            this.f23861q = f10;
            return this;
        }

        public C0250b n(float f10) {
            this.f23856l = f10;
            return this;
        }

        public C0250b o(CharSequence charSequence) {
            this.f23845a = charSequence;
            return this;
        }

        public C0250b p(Layout.Alignment alignment) {
            this.f23847c = alignment;
            return this;
        }

        public C0250b q(float f10, int i10) {
            this.f23855k = f10;
            this.f23854j = i10;
            return this;
        }

        public C0250b r(int i10) {
            this.f23860p = i10;
            return this;
        }

        public C0250b s(int i10) {
            this.f23859o = i10;
            this.f23858n = true;
            return this;
        }

        public C0250b() {
            this.f23845a = null;
            this.f23846b = null;
            this.f23847c = null;
            this.f23848d = null;
            this.f23849e = -3.4028235E38f;
            this.f23850f = RecyclerView.UNDEFINED_DURATION;
            this.f23851g = RecyclerView.UNDEFINED_DURATION;
            this.f23852h = -3.4028235E38f;
            this.f23853i = RecyclerView.UNDEFINED_DURATION;
            this.f23854j = RecyclerView.UNDEFINED_DURATION;
            this.f23855k = -3.4028235E38f;
            this.f23856l = -3.4028235E38f;
            this.f23857m = -3.4028235E38f;
            this.f23858n = false;
            this.f23859o = -16777216;
            this.f23860p = RecyclerView.UNDEFINED_DURATION;
        }

        private C0250b(b bVar) {
            this.f23845a = bVar.f23828a;
            this.f23846b = bVar.f23831d;
            this.f23847c = bVar.f23829b;
            this.f23848d = bVar.f23830c;
            this.f23849e = bVar.f23832f;
            this.f23850f = bVar.f23833g;
            this.f23851g = bVar.f23834h;
            this.f23852h = bVar.f23835i;
            this.f23853i = bVar.f23836j;
            this.f23854j = bVar.f23841o;
            this.f23855k = bVar.f23842p;
            this.f23856l = bVar.f23837k;
            this.f23857m = bVar.f23838l;
            this.f23858n = bVar.f23839m;
            this.f23859o = bVar.f23840n;
            this.f23860p = bVar.f23843q;
            this.f23861q = bVar.f23844r;
        }
    }

    /* access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0250b bVar = new C0250b();
        CharSequence charSequence = bundle.getCharSequence(f23821t);
        if (charSequence != null) {
            bVar.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f23822u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f23823v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f23824w);
        if (bitmap != null) {
            bVar.f(bitmap);
        }
        String str = f23825x;
        if (bundle.containsKey(str)) {
            String str2 = f23826y;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f23827z;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = A;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = B;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = D;
        if (bundle.containsKey(str6)) {
            String str7 = C;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = E;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = F;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = G;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(H, false)) {
            bVar.b();
        }
        String str11 = I;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = J;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    public C0250b b() {
        return new C0250b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f23828a, bVar.f23828a) && this.f23829b == bVar.f23829b && this.f23830c == bVar.f23830c && ((bitmap = this.f23831d) != null ? !((bitmap2 = bVar.f23831d) == null || !bitmap.sameAs(bitmap2)) : bVar.f23831d == null) && this.f23832f == bVar.f23832f && this.f23833g == bVar.f23833g && this.f23834h == bVar.f23834h && this.f23835i == bVar.f23835i && this.f23836j == bVar.f23836j && this.f23837k == bVar.f23837k && this.f23838l == bVar.f23838l && this.f23839m == bVar.f23839m && this.f23840n == bVar.f23840n && this.f23841o == bVar.f23841o && this.f23842p == bVar.f23842p && this.f23843q == bVar.f23843q && this.f23844r == bVar.f23844r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(this.f23828a, this.f23829b, this.f23830c, this.f23831d, Float.valueOf(this.f23832f), Integer.valueOf(this.f23833g), Integer.valueOf(this.f23834h), Float.valueOf(this.f23835i), Integer.valueOf(this.f23836j), Float.valueOf(this.f23837k), Float.valueOf(this.f23838l), Boolean.valueOf(this.f23839m), Integer.valueOf(this.f23840n), Integer.valueOf(this.f23841o), Float.valueOf(this.f23842p), Integer.valueOf(this.f23843q), Float.valueOf(this.f23844r));
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            k4.a.e(bitmap);
        } else {
            k4.a.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f23828a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f23828a = charSequence.toString();
        } else {
            this.f23828a = null;
        }
        this.f23829b = alignment;
        this.f23830c = alignment2;
        this.f23831d = bitmap2;
        this.f23832f = f10;
        this.f23833g = i10;
        this.f23834h = i11;
        this.f23835i = f11;
        this.f23836j = i12;
        this.f23837k = f13;
        this.f23838l = f14;
        this.f23839m = z10;
        this.f23840n = i14;
        this.f23841o = i13;
        this.f23842p = f12;
        this.f23843q = i15;
        this.f23844r = f15;
    }
}
