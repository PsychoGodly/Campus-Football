package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.p0;
import androidx.core.graphics.b;
import h.c;
import h.d;
import h.e;

/* compiled from: AppCompatDrawableManager */
public final class j {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1663b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f1664c;

    /* renamed from: a  reason: collision with root package name */
    private p0 f1665a;

    /* compiled from: AppCompatDrawableManager */
    class a implements p0.f {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1666a = {e.R, e.P, e.f18215a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1667b = {e.f18229o, e.B, e.f18234t, e.f18230p, e.f18231q, e.f18233s, e.f18232r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1668c = {e.O, e.Q, e.f18225k, e.K, e.L, e.M, e.N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1669d = {e.f18237w, e.f18223i, e.f18236v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1670e = {e.J, e.S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1671f = {e.f18217c, e.f18221g, e.f18218d, e.f18222h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = u0.c(context, h.a.f18187w);
            int b10 = u0.b(context, h.a.f18185u);
            return new ColorStateList(new int[][]{u0.f1832b, u0.f1835e, u0.f1833c, u0.f1839i}, new int[]{b10, b.c(c10, i10), b.c(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, u0.c(context, h.a.f18184t));
        }

        private ColorStateList j(Context context) {
            return h(context, u0.c(context, h.a.f18185u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = h.a.f18189y;
            ColorStateList e10 = u0.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = u0.f1832b;
                iArr2[0] = u0.b(context, i10);
                iArr[1] = u0.f1836f;
                iArr2[1] = u0.c(context, h.a.f18186v);
                iArr[2] = u0.f1839i;
                iArr2[2] = u0.c(context, i10);
            } else {
                iArr[0] = u0.f1832b;
                iArr2[0] = e10.getColorForState(iArr[0], 0);
                iArr[1] = u0.f1836f;
                iArr2[1] = u0.c(context, h.a.f18186v);
                iArr[2] = u0.f1839i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(p0 p0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = p0Var.j(context, e.F);
            Drawable j11 = p0Var.j(context, e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1663b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.f1663b
                int[] r1 = r6.f1666a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = h.a.f18188x
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1668c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = h.a.f18186v
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1669d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = h.e.f18235u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = h.e.f18226l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.h0.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.u0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i10) {
            if (i10 == e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(p0 p0Var, Context context, int i10) {
            if (i10 == e.f18224j) {
                return new LayerDrawable(new Drawable[]{p0Var.j(context, e.f18223i), p0Var.j(context, e.f18225k)});
            } else if (i10 == e.f18239y) {
                return l(p0Var, context, d.f18208i);
            } else {
                if (i10 == e.f18238x) {
                    return l(p0Var, context, d.f18209j);
                }
                if (i10 == e.f18240z) {
                    return l(p0Var, context, d.f18210k);
                }
                return null;
            }
        }

        public ColorStateList d(Context context, int i10) {
            if (i10 == e.f18227m) {
                return i.a.a(context, c.f18196e);
            }
            if (i10 == e.I) {
                return i.a.a(context, c.f18199h);
            }
            if (i10 == e.H) {
                return k(context);
            }
            if (i10 == e.f18220f) {
                return j(context);
            }
            if (i10 == e.f18216b) {
                return g(context);
            }
            if (i10 == e.f18219e) {
                return i(context);
            }
            if (i10 == e.D || i10 == e.E) {
                return i.a.a(context, c.f18198g);
            }
            if (f(this.f1667b, i10)) {
                return u0.e(context, h.a.f18188x);
            }
            if (f(this.f1670e, i10)) {
                return i.a.a(context, c.f18195d);
            }
            if (f(this.f1671f, i10)) {
                return i.a.a(context, c.f18194c);
            }
            if (i10 == e.A) {
                return i.a.a(context, c.f18197f);
            }
            return null;
        }

        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = h.a.f18188x;
                m(findDrawableByLayerId, u0.c(context, i11), j.f1663b);
                m(layerDrawable.findDrawableByLayerId(16908303), u0.c(context, i11), j.f1663b);
                m(layerDrawable.findDrawableByLayerId(16908301), u0.c(context, h.a.f18186v), j.f1663b);
                return true;
            } else if (i10 != e.f18239y && i10 != e.f18238x && i10 != e.f18240z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), u0.b(context, h.a.f18188x), j.f1663b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = h.a.f18186v;
                m(findDrawableByLayerId2, u0.c(context, i12), j.f1663b);
                m(layerDrawable2.findDrawableByLayerId(16908301), u0.c(context, i12), j.f1663b);
                return true;
            }
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1664c == null) {
                h();
            }
            jVar = f1664c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = p0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1664c == null) {
                j jVar = new j();
                f1664c = jVar;
                jVar.f1665a = p0.h();
                f1664c.f1665a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        p0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1665a.j(context, i10);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1665a.k(context, i10, z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1665a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1665a.s(context);
    }
}
