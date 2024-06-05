package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainerCompat */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f19145a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f19146b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f19147c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f19148d;

    /* renamed from: f  reason: collision with root package name */
    private int f19149f = 255;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19150g;

    /* renamed from: h  reason: collision with root package name */
    private int f19151h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19152i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f19153j;

    /* renamed from: k  reason: collision with root package name */
    private long f19154k;

    /* renamed from: l  reason: collision with root package name */
    private long f19155l;

    /* renamed from: m  reason: collision with root package name */
    private c f19156m;

    /* compiled from: DrawableContainerCompat */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainerCompat */
    private static class C0204b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: DrawableContainerCompat */
    static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f19158a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f19158a;
            this.f19158a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f19158a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f19158a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f19158a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainerCompat */
    static abstract class d extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f19159a;

        /* renamed from: b  reason: collision with root package name */
        Resources f19160b;

        /* renamed from: c  reason: collision with root package name */
        int f19161c;

        /* renamed from: d  reason: collision with root package name */
        int f19162d;

        /* renamed from: e  reason: collision with root package name */
        int f19163e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f19164f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f19165g;

        /* renamed from: h  reason: collision with root package name */
        int f19166h;

        /* renamed from: i  reason: collision with root package name */
        boolean f19167i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f19168j;

        /* renamed from: k  reason: collision with root package name */
        Rect f19169k;

        /* renamed from: l  reason: collision with root package name */
        boolean f19170l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f19171m;

        /* renamed from: n  reason: collision with root package name */
        int f19172n;

        /* renamed from: o  reason: collision with root package name */
        int f19173o;

        /* renamed from: p  reason: collision with root package name */
        int f19174p;

        /* renamed from: q  reason: collision with root package name */
        int f19175q;

        /* renamed from: r  reason: collision with root package name */
        boolean f19176r;

        /* renamed from: s  reason: collision with root package name */
        int f19177s;

        /* renamed from: t  reason: collision with root package name */
        boolean f19178t;

        /* renamed from: u  reason: collision with root package name */
        boolean f19179u;

        /* renamed from: v  reason: collision with root package name */
        boolean f19180v;

        /* renamed from: w  reason: collision with root package name */
        boolean f19181w;

        /* renamed from: x  reason: collision with root package name */
        boolean f19182x = true;

        /* renamed from: y  reason: collision with root package name */
        boolean f19183y;

        /* renamed from: z  reason: collision with root package name */
        int f19184z;

        d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f19159a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f19160b : null;
            }
            this.f19160b = resources2;
            int f10 = b.f(resources, dVar != null ? dVar.f19161c : 0);
            this.f19161c = f10;
            if (dVar != null) {
                this.f19162d = dVar.f19162d;
                this.f19163e = dVar.f19163e;
                this.f19180v = true;
                this.f19181w = true;
                this.f19167i = dVar.f19167i;
                this.f19170l = dVar.f19170l;
                this.f19182x = dVar.f19182x;
                this.f19183y = dVar.f19183y;
                this.f19184z = dVar.f19184z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f19161c == f10) {
                    if (dVar.f19168j) {
                        this.f19169k = dVar.f19169k != null ? new Rect(dVar.f19169k) : rect;
                        this.f19168j = true;
                    }
                    if (dVar.f19171m) {
                        this.f19172n = dVar.f19172n;
                        this.f19173o = dVar.f19173o;
                        this.f19174p = dVar.f19174p;
                        this.f19175q = dVar.f19175q;
                        this.f19171m = true;
                    }
                }
                if (dVar.f19176r) {
                    this.f19177s = dVar.f19177s;
                    this.f19176r = true;
                }
                if (dVar.f19178t) {
                    this.f19179u = dVar.f19179u;
                    this.f19178t = true;
                }
                Drawable[] drawableArr = dVar.f19165g;
                this.f19165g = new Drawable[drawableArr.length];
                this.f19166h = dVar.f19166h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f19164f;
                if (sparseArray != null) {
                    this.f19164f = sparseArray.clone();
                } else {
                    this.f19164f = new SparseArray<>(this.f19166h);
                }
                int i10 = this.f19166h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f19164f.put(i11, constantState);
                        } else {
                            this.f19165g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f19165g = new Drawable[10];
            this.f19166h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f19164f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f19165g[this.f19164f.keyAt(i10)] = s(this.f19164f.valueAt(i10).newDrawable(this.f19160b));
                }
                this.f19164f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f19184z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f19159a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f19166h;
            if (i10 >= this.f19165g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f19159a);
            this.f19165g[i10] = drawable;
            this.f19166h++;
            this.f19163e = drawable.getChangingConfigurations() | this.f19163e;
            p();
            this.f19169k = null;
            this.f19168j = false;
            this.f19171m = false;
            this.f19180v = false;
            return i10;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f19166h;
                Drawable[] drawableArr = this.f19165g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f19163e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0204b.c(theme));
            }
        }

        public boolean c() {
            if (this.f19180v) {
                return this.f19181w;
            }
            e();
            this.f19180v = true;
            int i10 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f19181w = false;
                    return false;
                }
            }
            this.f19181w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i10 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f19164f.get(i11);
                    if (constantState != null && C0204b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f19171m = true;
            e();
            int i10 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            this.f19173o = -1;
            this.f19172n = -1;
            this.f19175q = 0;
            this.f19174p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f19172n) {
                    this.f19172n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f19173o) {
                    this.f19173o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f19174p) {
                    this.f19174p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f19175q) {
                    this.f19175q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f19165g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f19165g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f19164f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f19164f.valueAt(indexOfKey).newDrawable(this.f19160b));
            this.f19165g[i10] = s10;
            this.f19164f.removeAt(indexOfKey);
            if (this.f19164f.size() == 0) {
                this.f19164f = null;
            }
            return s10;
        }

        public int getChangingConfigurations() {
            return this.f19162d | this.f19163e;
        }

        public final int h() {
            return this.f19166h;
        }

        public final int i() {
            if (!this.f19171m) {
                d();
            }
            return this.f19173o;
        }

        public final int j() {
            if (!this.f19171m) {
                d();
            }
            return this.f19175q;
        }

        public final int k() {
            if (!this.f19171m) {
                d();
            }
            return this.f19174p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f19167i) {
                return null;
            }
            Rect rect2 = this.f19169k;
            if (rect2 != null || this.f19168j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f19168j = true;
            this.f19169k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f19171m) {
                d();
            }
            return this.f19172n;
        }

        public final int n() {
            if (this.f19176r) {
                return this.f19177s;
            }
            e();
            int i10 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f19177s = opacity;
            this.f19176r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f19165g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f19165g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f19176r = false;
            this.f19178t = false;
        }

        public final boolean q() {
            return this.f19170l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z10) {
            this.f19170l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i10, int i11) {
            int i12 = this.f19166h;
            Drawable[] drawableArr = this.f19165g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m10 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f19184z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f19167i = z10;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f19160b = resources;
                int f10 = b.f(resources, this.f19161c);
                int i10 = this.f19161c;
                this.f19161c = f10;
                if (i10 != f10) {
                    this.f19171m = false;
                    this.f19168j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f19156m == null) {
            this.f19156m = new c();
        }
        drawable.setCallback(this.f19156m.b(drawable.getCallback()));
        try {
            if (this.f19145a.A <= 0 && this.f19150g) {
                drawable.setAlpha(this.f19149f);
            }
            d dVar = this.f19145a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f19145a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f19145a.f19182x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            if (i10 >= 19) {
                androidx.core.graphics.drawable.a.j(drawable, this.f19145a.C);
            }
            Rect rect = this.f19146b;
            if (i10 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f19156m.a());
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f19150g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f19147c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f19154k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f19149f
            r3.setAlpha(r9)
            r13.f19154k = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            j.b$d r9 = r13.f19145a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f19149f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f19154k = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f19148d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f19155l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f19148d = r0
            r13.f19155l = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b$d r4 = r13.f19145a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f19149f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f19155l = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f19153j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f19145a.b(theme);
    }

    /* access modifiers changed from: package-private */
    public d b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f19151h;
    }

    public boolean canApplyTheme() {
        return this.f19145a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f19148d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f19151h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b$d r0 = r9.f19145a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f19148d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f19147c
            if (r0 == 0) goto L_0x0029
            r9.f19148d = r0
            j.b$d r0 = r9.f19145a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f19155l = r0
            goto L_0x0035
        L_0x0029:
            r9.f19148d = r4
            r9.f19155l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f19147c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            j.b$d r0 = r9.f19145a
            int r1 = r0.f19166h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f19147c = r0
            r9.f19151h = r10
            if (r0 == 0) goto L_0x005a
            j.b$d r10 = r9.f19145a
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f19154k = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f19147c = r4
            r10 = -1
            r9.f19151h = r10
        L_0x005a:
            long r0 = r9.f19154k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f19155l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f19153j
            if (r0 != 0) goto L_0x0073
            j.b$a r0 = new j.b$a
            r0.<init>()
            r9.f19153j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f19149f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f19145a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f19145a.c()) {
            return null;
        }
        this.f19145a.f19162d = getChangingConfigurations();
        return this.f19145a;
    }

    public Drawable getCurrent() {
        return this.f19147c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f19146b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f19145a.q()) {
            return this.f19145a.i();
        }
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f19145a.q()) {
            return this.f19145a.m();
        }
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f19145a.q()) {
            return this.f19145a.j();
        }
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f19145a.q()) {
            return this.f19145a.k();
        }
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f19147c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f19145a.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            C0204b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z10;
        Rect l10 = this.f19145a.l();
        if (l10 != null) {
            rect.set(l10);
            z10 = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f19147c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f19145a = dVar;
        int i10 = this.f19151h;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f19147c = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f19148d = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f19145a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f19145a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f19147c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f19145a.C;
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f19148d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f19148d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f19147c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f19150g) {
                this.f19147c.setAlpha(this.f19149f);
            }
        }
        if (this.f19155l != 0) {
            this.f19155l = 0;
            z10 = true;
        }
        if (this.f19154k != 0) {
            this.f19154k = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f19152i && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f19152i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19148d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f19147c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return this.f19145a.w(i10, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f19148d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f19147c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19148d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f19147c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f19147c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (!this.f19150g || this.f19149f != i10) {
            this.f19150g = true;
            this.f19149f = i10;
            Drawable drawable = this.f19147c;
            if (drawable == null) {
                return;
            }
            if (this.f19154k == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z10) {
        d dVar = this.f19145a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f19147c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f19145a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f19147c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z10) {
        d dVar = this.f19145a;
        if (dVar.f19182x != z10) {
            dVar.f19182x = z10;
            Drawable drawable = this.f19147c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f19146b;
        if (rect == null) {
            this.f19146b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f19147c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f19145a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f19147c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f19145a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f19147c, mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f19148d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f19147c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f19147c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
