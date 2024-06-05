package n6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final c f29351m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    d f29352a;

    /* renamed from: b  reason: collision with root package name */
    d f29353b;

    /* renamed from: c  reason: collision with root package name */
    d f29354c;

    /* renamed from: d  reason: collision with root package name */
    d f29355d;

    /* renamed from: e  reason: collision with root package name */
    c f29356e;

    /* renamed from: f  reason: collision with root package name */
    c f29357f;

    /* renamed from: g  reason: collision with root package name */
    c f29358g;

    /* renamed from: h  reason: collision with root package name */
    c f29359h;

    /* renamed from: i  reason: collision with root package name */
    f f29360i;

    /* renamed from: j  reason: collision with root package name */
    f f29361j;

    /* renamed from: k  reason: collision with root package name */
    f f29362k;

    /* renamed from: l  reason: collision with root package name */
    f f29363l;

    /* compiled from: ShapeAppearanceModel */
    public interface c {
        c a(c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new a((float) i12));
    }

    private static b d(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, x5.k.f31011z2);
        try {
            int i12 = obtainStyledAttributes.getInt(x5.k.A2, 0);
            int i13 = obtainStyledAttributes.getInt(x5.k.D2, i12);
            int i14 = obtainStyledAttributes.getInt(x5.k.E2, i12);
            int i15 = obtainStyledAttributes.getInt(x5.k.C2, i12);
            int i16 = obtainStyledAttributes.getInt(x5.k.B2, i12);
            c m10 = m(obtainStyledAttributes, x5.k.F2, cVar);
            c m11 = m(obtainStyledAttributes, x5.k.I2, m10);
            c m12 = m(obtainStyledAttributes, x5.k.J2, m10);
            c m13 = m(obtainStyledAttributes, x5.k.H2, m10);
            return new b().x(i13, m11).B(i14, m12).t(i15, m13).p(i16, m(obtainStyledAttributes, x5.k.G2, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new a((float) i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x5.k.f30885d2, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(x5.k.f30891e2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(x5.k.f30897f2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c m(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f29362k;
    }

    public d i() {
        return this.f29355d;
    }

    public c j() {
        return this.f29359h;
    }

    public d k() {
        return this.f29354c;
    }

    public c l() {
        return this.f29358g;
    }

    public f n() {
        return this.f29363l;
    }

    public f o() {
        return this.f29361j;
    }

    public f p() {
        return this.f29360i;
    }

    public d q() {
        return this.f29352a;
    }

    public c r() {
        return this.f29356e;
    }

    public d s() {
        return this.f29353b;
    }

    public c t() {
        return this.f29357f;
    }

    public boolean u(RectF rectF) {
        Class<f> cls = f.class;
        boolean z10 = this.f29363l.getClass().equals(cls) && this.f29361j.getClass().equals(cls) && this.f29360i.getClass().equals(cls) && this.f29362k.getClass().equals(cls);
        float a10 = this.f29356e.a(rectF);
        boolean z11 = this.f29357f.a(rectF) == a10 && this.f29359h.a(rectF) == a10 && this.f29358g.a(rectF) == a10;
        boolean z12 = (this.f29353b instanceof j) && (this.f29352a instanceof j) && (this.f29354c instanceof j) && (this.f29355d instanceof j);
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(c cVar) {
        return v().A(cVar.a(r())).E(cVar.a(t())).s(cVar.a(j())).w(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f29352a = bVar.f29364a;
        this.f29353b = bVar.f29365b;
        this.f29354c = bVar.f29366c;
        this.f29355d = bVar.f29367d;
        this.f29356e = bVar.f29368e;
        this.f29357f = bVar.f29369f;
        this.f29358g = bVar.f29370g;
        this.f29359h = bVar.f29371h;
        this.f29360i = bVar.f29372i;
        this.f29361j = bVar.f29373j;
        this.f29362k = bVar.f29374k;
        this.f29363l = bVar.f29375l;
    }

    /* compiled from: ShapeAppearanceModel */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f29364a = h.b();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public d f29365b = h.b();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public d f29366c = h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public d f29367d = h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f29368e = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f29369f = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f29370g = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f29371h = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public f f29372i = h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public f f29373j = h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public f f29374k = h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public f f29375l = h.c();

        public b() {
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f29350a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f29301a;
            }
            return -1.0f;
        }

        public b A(c cVar) {
            this.f29368e = cVar;
            return this;
        }

        public b B(int i10, c cVar) {
            return C(h.a(i10)).E(cVar);
        }

        public b C(d dVar) {
            this.f29365b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                D(n10);
            }
            return this;
        }

        public b D(float f10) {
            this.f29369f = new a(f10);
            return this;
        }

        public b E(c cVar) {
            this.f29369f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return z(f10).D(f10).v(f10).r(f10);
        }

        public b p(int i10, c cVar) {
            return q(h.a(i10)).s(cVar);
        }

        public b q(d dVar) {
            this.f29367d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                r(n10);
            }
            return this;
        }

        public b r(float f10) {
            this.f29371h = new a(f10);
            return this;
        }

        public b s(c cVar) {
            this.f29371h = cVar;
            return this;
        }

        public b t(int i10, c cVar) {
            return u(h.a(i10)).w(cVar);
        }

        public b u(d dVar) {
            this.f29366c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                v(n10);
            }
            return this;
        }

        public b v(float f10) {
            this.f29370g = new a(f10);
            return this;
        }

        public b w(c cVar) {
            this.f29370g = cVar;
            return this;
        }

        public b x(int i10, c cVar) {
            return y(h.a(i10)).A(cVar);
        }

        public b y(d dVar) {
            this.f29364a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                z(n10);
            }
            return this;
        }

        public b z(float f10) {
            this.f29368e = new a(f10);
            return this;
        }

        public b(k kVar) {
            this.f29364a = kVar.f29352a;
            this.f29365b = kVar.f29353b;
            this.f29366c = kVar.f29354c;
            this.f29367d = kVar.f29355d;
            this.f29368e = kVar.f29356e;
            this.f29369f = kVar.f29357f;
            this.f29370g = kVar.f29358g;
            this.f29371h = kVar.f29359h;
            this.f29372i = kVar.f29360i;
            this.f29373j = kVar.f29361j;
            this.f29374k = kVar.f29362k;
            this.f29375l = kVar.f29363l;
        }
    }

    public k() {
        this.f29352a = h.b();
        this.f29353b = h.b();
        this.f29354c = h.b();
        this.f29355d = h.b();
        this.f29356e = new a(0.0f);
        this.f29357f = new a(0.0f);
        this.f29358g = new a(0.0f);
        this.f29359h = new a(0.0f);
        this.f29360i = h.c();
        this.f29361j = h.c();
        this.f29362k = h.c();
        this.f29363l = h.c();
    }
}
