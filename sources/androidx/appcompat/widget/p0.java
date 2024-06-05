package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ResourceManagerInternal */
public final class p0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1757h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static p0 f1758i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1759j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, h<ColorStateList>> f1760a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.g<String, e> f1761b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f1762c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.d<WeakReference<Drawable.ConstantState>>> f1763d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1764e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1765f;

    /* renamed from: g  reason: collision with root package name */
    private f f1766g;

    /* compiled from: ResourceManagerInternal */
    static class a implements e {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return j.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class b implements e {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class c extends androidx.collection.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(a(i10, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal */
    static class d implements e {
        d() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        k.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal */
    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(p0 p0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal */
    private static class g implements e {
        g() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1761b == null) {
            this.f1761b = new androidx.collection.g<>();
        }
        this.f1761b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.d dVar = this.f1763d.get(context);
        if (dVar == null) {
            dVar = new androidx.collection.d();
            this.f1763d.put(context, dVar);
        }
        dVar.j(j10, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1760a == null) {
            this.f1760a = new WeakHashMap<>();
        }
        h hVar = this.f1760a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f1760a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (!this.f1765f) {
            this.f1765f = true;
            Drawable j10 = j(context, k.d.f19500a);
            if (j10 == null || !q(j10)) {
                this.f1765f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i10) {
        Drawable drawable;
        if (this.f1764e == null) {
            this.f1764e = new TypedValue();
        }
        TypedValue typedValue = this.f1764e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1766g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.c(this, context, i10);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized p0 h() {
        p0 p0Var;
        synchronized (p0.class) {
            if (f1758i == null) {
                p0 p0Var2 = new p0();
                f1758i = p0Var2;
                p(p0Var2);
            }
            p0Var = f1758i;
        }
        return p0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1763d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.d r0 = (androidx.collection.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.k(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (p0.class) {
            c cVar = f1759j;
            b10 = cVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                cVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList n(Context context, int i10) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f1760a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.e(i10);
    }

    private static void p(p0 p0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            p0Var.a("vector", new g());
            p0Var.a("animated-vector", new b());
            p0Var.a("animated-selector", new a());
            p0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.p0$e> r0 = r10.f1761b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            androidx.collection.h<java.lang.String> r0 = r10.f1762c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.p0$e> r3 = r10.f1761b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.h r0 = new androidx.collection.h
            r0.<init>()
            r10.f1762c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1764e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1764e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1764e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.h<java.lang.String> r8 = r10.f1762c     // Catch:{ Exception -> 0x00a2 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.p0$e> r8 = r10.f1761b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.p0$e r3 = (androidx.appcompat.widget.p0.e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            androidx.collection.h<java.lang.String> r11 = r10.f1762c
            r11.a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r10, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 == null) {
                return r10;
            }
            androidx.core.graphics.drawable.a.p(r10, o10);
            return r10;
        }
        f fVar = this.f1766g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (h0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x0Var.f1850d;
        if (z10 || x0Var.f1849c) {
            drawable.setColorFilter(g(z10 ? x0Var.f1847a : null, x0Var.f1849c ? x0Var.f1848b : f1757h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.getDrawable(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            h0.b(r10);
        }
        return r10;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1766g;
            n10 = fVar == null ? null : fVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i10) {
        f fVar = this.f1766g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.d dVar = this.f1763d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, j1 j1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = j1Var.a(i10);
        }
        if (r10 == null) {
            return null;
        }
        return v(context, i10, false, r10);
    }

    public synchronized void u(f fVar) {
        this.f1766g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1766g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}
