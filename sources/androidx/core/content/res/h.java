package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2870a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<e, SparseArray<d>> f2871b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2872c = new Object();

    /* compiled from: ResourcesCompat */
    static class a {
        static Drawable a(Resources resources, int i10, int i11) {
            return resources.getDrawableForDensity(i10, i11);
        }
    }

    /* compiled from: ResourcesCompat */
    static class b {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    static class c {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f2873a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f2874b;

        /* renamed from: c  reason: collision with root package name */
        final int f2875c;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i10;
            this.f2873a = colorStateList;
            this.f2874b = configuration;
            if (theme == null) {
                i10 = 0;
            } else {
                i10 = theme.hashCode();
            }
            this.f2875c = i10;
        }
    }

    /* compiled from: ResourcesCompat */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Resources f2876a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f2877b;

        e(Resources resources, Resources.Theme theme) {
            this.f2876a = resources;
            this.f2877b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f2876a.equals(eVar.f2876a) || !androidx.core.util.c.a(this.f2877b, eVar.f2877b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f2876a, this.f2877b);
        }
    }

    /* compiled from: ResourcesCompat */
    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(int i10, Handler handler) {
            e(handler).post(new i(this, i10));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new j(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i10);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* compiled from: ResourcesCompat */
    public static final class g {

        /* compiled from: ResourcesCompat */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f2878a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f2879b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f2880c;

            static void a(Resources.Theme theme) {
                synchronized (f2878a) {
                    if (!f2880c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2879b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f2880c = true;
                    }
                    Method method = f2879b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f2879b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(theme);
            } else if (i10 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(e eVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2872c) {
            WeakHashMap<e, SparseArray<d>> weakHashMap = f2871b;
            SparseArray sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i10, new d(colorStateList, eVar.f2876a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.e r5, int r6) {
        /*
            java.lang.Object r0 = f2872c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.h$e, android.util.SparseArray<androidx.core.content.res.h$d>> r1 = f2871b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$d r2 = (androidx.core.content.res.h.d) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f2874b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f2876a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f2877b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f2875c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f2875c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f2873a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$e, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList b10 = b(eVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList j10 = j(resources, i10, theme);
        if (j10 != null) {
            a(eVar, i10, j10, theme);
            return j10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return c.b(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.a(resources, i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Drawable e(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return b.b(resources, i10, i11, theme);
        }
        if (i12 >= 15) {
            return a.a(resources, i10, i11);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface f(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i10, new TypedValue(), 0, (f) null, (Handler) null, false, false);
    }

    public static Typeface g(Context context, int i10, TypedValue typedValue, int i11, f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i10, typedValue, i11, fVar, (Handler) null, true, false);
    }

    public static void h(Context context, int i10, f fVar, Handler handler) throws Resources.NotFoundException {
        androidx.core.util.h.f(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
            return;
        }
        l(context, i10, new TypedValue(), 0, fVar, handler, false, false);
    }

    private static TypedValue i() {
        ThreadLocal<TypedValue> threadLocal = f2870a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList j(Resources resources, int i10, Resources.Theme theme) {
        if (k(resources, i10)) {
            return null;
        }
        try {
            return c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean k(Resources resources, int i10) {
        TypedValue i11 = i();
        resources.getValue(i10, i11, true);
        int i12 = i11.type;
        if (i12 < 28 || i12 > 31) {
            return false;
        }
        return true;
    }

    private static Typeface l(Context context, int i10, TypedValue typedValue, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        int i12 = i10;
        resources.getValue(i10, typedValue, true);
        Typeface m10 = m(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (m10 != null || fVar != null || z11) {
            return m10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.h.f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00bb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.f.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.e.b(r2, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.f.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.f.d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.d(r0, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00b5
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            r11.c(r15, r12)
        L_0x00ba:
            return r16
        L_0x00bb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
