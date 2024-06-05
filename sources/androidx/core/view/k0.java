package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat */
public class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f3200b;

    /* renamed from: a  reason: collision with root package name */
    private final l f3201a;

    /* compiled from: WindowInsetsCompat */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f3202a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f3203b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f3204c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f3205d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3202a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3203b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3204c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static k0 a(View view) {
            if (f3205d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3202a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3203b.get(obj);
                        Rect rect2 = (Rect) f3204c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            k0 a10 = new b().b(androidx.core.graphics.c.c(rect)).c(androidx.core.graphics.c.c(rect2)).a();
                            a10.s(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class e extends d {
        e() {
        }

        e(k0 k0Var) {
            super(k0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final k0 f3214a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.c[] f3215b;

        f() {
            this(new k0((k0) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            androidx.core.graphics.c[] cVarArr = this.f3215b;
            if (cVarArr != null) {
                androidx.core.graphics.c cVar = cVarArr[m.b(1)];
                androidx.core.graphics.c cVar2 = this.f3215b[m.b(2)];
                if (cVar2 == null) {
                    cVar2 = this.f3214a.f(2);
                }
                if (cVar == null) {
                    cVar = this.f3214a.f(1);
                }
                f(androidx.core.graphics.c.a(cVar, cVar2));
                androidx.core.graphics.c cVar3 = this.f3215b[m.b(16)];
                if (cVar3 != null) {
                    e(cVar3);
                }
                androidx.core.graphics.c cVar4 = this.f3215b[m.b(32)];
                if (cVar4 != null) {
                    c(cVar4);
                }
                androidx.core.graphics.c cVar5 = this.f3215b[m.b(64)];
                if (cVar5 != null) {
                    g(cVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            a();
            return this.f3214a;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.c cVar) {
        }

        f(k0 k0Var) {
            this.f3214a = k0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class i extends h {
        i(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public k0 a() {
            return k0.v(this.f3221c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Objects.equals(this.f3221c, iVar.f3221c) || !Objects.equals(this.f3225g, iVar.f3225g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return d.e(this.f3221c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f3221c.hashCode();
        }

        i(k0 k0Var, i iVar) {
            super(k0Var, (h) iVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final k0 f3230q = k0.v(WindowInsets.CONSUMED);

        k(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public androidx.core.graphics.c g(int i10) {
            return androidx.core.graphics.c.d(this.f3221c.getInsets(n.a(i10)));
        }

        public boolean p(int i10) {
            return this.f3221c.isVisible(n.a(i10));
        }

        k(k0 k0Var, k kVar) {
            super(k0Var, (j) kVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class l {

        /* renamed from: b  reason: collision with root package name */
        static final k0 f3231b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final k0 f3232a;

        l(k0 k0Var) {
            this.f3232a = k0Var;
        }

        /* access modifiers changed from: package-private */
        public k0 a() {
            return this.f3232a;
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            return this.f3232a;
        }

        /* access modifiers changed from: package-private */
        public k0 c() {
            return this.f3232a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(k0 k0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (o() != lVar.o() || n() != lVar.n() || !androidx.core.util.c.a(k(), lVar.k()) || !androidx.core.util.c.a(i(), lVar.i()) || !androidx.core.util.c.a(f(), lVar.f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c g(int i10) {
            return androidx.core.graphics.c.f2897e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c i() {
            return androidx.core.graphics.c.f2897e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c j() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c k() {
            return androidx.core.graphics.c.f2897e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c l() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public k0 m(int i10, int i11, int i12, int i13) {
            return f3231b;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i10) {
            return true;
        }

        public void q(androidx.core.graphics.c[] cVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void s(k0 k0Var) {
        }

        public void t(androidx.core.graphics.c cVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static final class n {
        static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3200b = k.f3230q;
        } else {
            f3200b = l.f3231b;
        }
    }

    private k0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3201a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f3201a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3201a = new i(this, windowInsets);
        } else if (i10 >= 21) {
            this.f3201a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f3201a = new g(this, windowInsets);
        } else {
            this.f3201a = new l(this);
        }
    }

    static androidx.core.graphics.c m(androidx.core.graphics.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f2898a - i10);
        int max2 = Math.max(0, cVar.f2899b - i11);
        int max3 = Math.max(0, cVar.f2900c - i12);
        int max4 = Math.max(0, cVar.f2901d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return cVar;
        }
        return androidx.core.graphics.c.b(max, max2, max3, max4);
    }

    public static k0 v(WindowInsets windowInsets) {
        return w(windowInsets, (View) null);
    }

    public static k0 w(WindowInsets windowInsets, View view) {
        k0 k0Var = new k0((WindowInsets) androidx.core.util.h.f(windowInsets));
        if (view != null && a0.Q(view)) {
            k0Var.s(a0.H(view));
            k0Var.d(view.getRootView());
        }
        return k0Var;
    }

    @Deprecated
    public k0 a() {
        return this.f3201a.a();
    }

    @Deprecated
    public k0 b() {
        return this.f3201a.b();
    }

    @Deprecated
    public k0 c() {
        return this.f3201a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f3201a.d(view);
    }

    public d e() {
        return this.f3201a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return androidx.core.util.c.a(this.f3201a, ((k0) obj).f3201a);
    }

    public androidx.core.graphics.c f(int i10) {
        return this.f3201a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.c g() {
        return this.f3201a.i();
    }

    @Deprecated
    public int h() {
        return this.f3201a.k().f2901d;
    }

    public int hashCode() {
        l lVar = this.f3201a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f3201a.k().f2898a;
    }

    @Deprecated
    public int j() {
        return this.f3201a.k().f2900c;
    }

    @Deprecated
    public int k() {
        return this.f3201a.k().f2899b;
    }

    public k0 l(int i10, int i11, int i12, int i13) {
        return this.f3201a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f3201a.n();
    }

    public boolean o(int i10) {
        return this.f3201a.p(i10);
    }

    @Deprecated
    public k0 p(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.c.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void q(androidx.core.graphics.c[] cVarArr) {
        this.f3201a.q(cVarArr);
    }

    /* access modifiers changed from: package-private */
    public void r(androidx.core.graphics.c cVar) {
        this.f3201a.r(cVar);
    }

    /* access modifiers changed from: package-private */
    public void s(k0 k0Var) {
        this.f3201a.s(k0Var);
    }

    /* access modifiers changed from: package-private */
    public void t(androidx.core.graphics.c cVar) {
        this.f3201a.t(cVar);
    }

    public WindowInsets u() {
        l lVar = this.f3201a;
        if (lVar instanceof g) {
            return ((g) lVar).f3221c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f3207e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f3208f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f3209g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f3210h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f3211c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.c f3212d;

        c() {
            this.f3211c = h();
        }

        private static WindowInsets h() {
            if (!f3208f) {
                try {
                    f3207e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3208f = true;
            }
            Field field = f3207e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f3210h) {
                try {
                    f3209g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3210h = true;
            }
            Constructor<WindowInsets> constructor = f3209g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            a();
            k0 v10 = k0.v(this.f3211c);
            v10.q(this.f3215b);
            v10.t(this.f3212d);
            return v10;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
            this.f3212d = cVar;
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
            WindowInsets windowInsets = this.f3211c;
            if (windowInsets != null) {
                this.f3211c = windowInsets.replaceSystemWindowInsets(cVar.f2898a, cVar.f2899b, cVar.f2900c, cVar.f2901d);
            }
        }

        c(k0 k0Var) {
            super(k0Var);
            this.f3211c = k0Var.u();
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f3213c;

        d() {
            this.f3213c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            a();
            k0 v10 = k0.v(this.f3213c.build());
            v10.q(this.f3215b);
            return v10;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.c cVar) {
            this.f3213c.setMandatorySystemGestureInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
            this.f3213c.setStableInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.c cVar) {
            this.f3213c.setSystemGestureInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
            this.f3213c.setSystemWindowInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.c cVar) {
            this.f3213c.setTappableElementInsets(cVar.e());
        }

        d(k0 k0Var) {
            super(k0Var);
            WindowInsets.Builder builder;
            WindowInsets u10 = k0Var.u();
            if (u10 != null) {
                builder = new WindowInsets.Builder(u10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3213c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.c f3226m = null;

        h(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            return k0.v(this.f3221c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public k0 c() {
            return k0.v(this.f3221c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.c i() {
            if (this.f3226m == null) {
                this.f3226m = androidx.core.graphics.c.b(this.f3221c.getStableInsetLeft(), this.f3221c.getStableInsetTop(), this.f3221c.getStableInsetRight(), this.f3221c.getStableInsetBottom());
            }
            return this.f3226m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.f3221c.isConsumed();
        }

        public void t(androidx.core.graphics.c cVar) {
            this.f3226m = cVar;
        }

        h(k0 k0Var, h hVar) {
            super(k0Var, (g) hVar);
            this.f3226m = hVar.f3226m;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f3216h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f3217i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f3218j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f3219k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f3220l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f3221c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.c[] f3222d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.c f3223e;

        /* renamed from: f  reason: collision with root package name */
        private k0 f3224f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.c f3225g;

        g(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var);
            this.f3223e = null;
            this.f3221c = windowInsets;
        }

        private androidx.core.graphics.c u(int i10, boolean z10) {
            androidx.core.graphics.c cVar = androidx.core.graphics.c.f2897e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    cVar = androidx.core.graphics.c.a(cVar, v(i11, z10));
                }
            }
            return cVar;
        }

        private androidx.core.graphics.c w() {
            k0 k0Var = this.f3224f;
            if (k0Var != null) {
                return k0Var.g();
            }
            return androidx.core.graphics.c.f2897e;
        }

        private androidx.core.graphics.c x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3216h) {
                    z();
                }
                Method method = f3217i;
                if (!(method == null || f3218j == null || f3219k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3219k.get(f3220l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.c.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void z() {
            try {
                f3217i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3218j = cls;
                f3219k = cls.getDeclaredField("mVisibleInsets");
                f3220l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3219k.setAccessible(true);
                f3220l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3216h = true;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            androidx.core.graphics.c x10 = x(view);
            if (x10 == null) {
                x10 = androidx.core.graphics.c.f2897e;
            }
            r(x10);
        }

        /* access modifiers changed from: package-private */
        public void e(k0 k0Var) {
            k0Var.s(this.f3224f);
            k0Var.r(this.f3225g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3225g, ((g) obj).f3225g);
        }

        public androidx.core.graphics.c g(int i10) {
            return u(i10, false);
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.c k() {
            if (this.f3223e == null) {
                this.f3223e = androidx.core.graphics.c.b(this.f3221c.getSystemWindowInsetLeft(), this.f3221c.getSystemWindowInsetTop(), this.f3221c.getSystemWindowInsetRight(), this.f3221c.getSystemWindowInsetBottom());
            }
            return this.f3223e;
        }

        /* access modifiers changed from: package-private */
        public k0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(k0.v(this.f3221c));
            bVar.c(k0.m(k(), i10, i11, i12, i13));
            bVar.b(k0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f3221c.isRound();
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !y(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void q(androidx.core.graphics.c[] cVarArr) {
            this.f3222d = cVarArr;
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.c cVar) {
            this.f3225g = cVar;
        }

        /* access modifiers changed from: package-private */
        public void s(k0 k0Var) {
            this.f3224f = k0Var;
        }

        /* access modifiers changed from: protected */
        public androidx.core.graphics.c v(int i10, boolean z10) {
            int i11;
            d dVar;
            if (i10 != 1) {
                androidx.core.graphics.c cVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        androidx.core.graphics.c[] cVarArr = this.f3222d;
                        if (cVarArr != null) {
                            cVar = cVarArr[m.b(8)];
                        }
                        if (cVar != null) {
                            return cVar;
                        }
                        androidx.core.graphics.c k10 = k();
                        androidx.core.graphics.c w10 = w();
                        int i12 = k10.f2901d;
                        if (i12 > w10.f2901d) {
                            return androidx.core.graphics.c.b(0, 0, 0, i12);
                        }
                        androidx.core.graphics.c cVar2 = this.f3225g;
                        if (cVar2 == null || cVar2.equals(androidx.core.graphics.c.f2897e) || (i11 = this.f3225g.f2901d) <= w10.f2901d) {
                            return androidx.core.graphics.c.f2897e;
                        }
                        return androidx.core.graphics.c.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return j();
                    } else {
                        if (i10 == 32) {
                            return h();
                        }
                        if (i10 == 64) {
                            return l();
                        }
                        if (i10 != 128) {
                            return androidx.core.graphics.c.f2897e;
                        }
                        k0 k0Var = this.f3224f;
                        if (k0Var != null) {
                            dVar = k0Var.e();
                        } else {
                            dVar = f();
                        }
                        if (dVar != null) {
                            return androidx.core.graphics.c.b(dVar.b(), dVar.d(), dVar.c(), dVar.a());
                        }
                        return androidx.core.graphics.c.f2897e;
                    }
                } else if (z10) {
                    androidx.core.graphics.c w11 = w();
                    androidx.core.graphics.c i13 = i();
                    return androidx.core.graphics.c.b(Math.max(w11.f2898a, i13.f2898a), 0, Math.max(w11.f2900c, i13.f2900c), Math.max(w11.f2901d, i13.f2901d));
                } else {
                    androidx.core.graphics.c k11 = k();
                    k0 k0Var2 = this.f3224f;
                    if (k0Var2 != null) {
                        cVar = k0Var2.g();
                    }
                    int i14 = k11.f2901d;
                    if (cVar != null) {
                        i14 = Math.min(i14, cVar.f2901d);
                    }
                    return androidx.core.graphics.c.b(k11.f2898a, 0, k11.f2900c, i14);
                }
            } else if (z10) {
                return androidx.core.graphics.c.b(0, Math.max(w().f2899b, k().f2899b), 0, 0);
            } else {
                return androidx.core.graphics.c.b(0, k().f2899b, 0, 0);
            }
        }

        /* access modifiers changed from: protected */
        public boolean y(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !v(i10, false).equals(androidx.core.graphics.c.f2897e);
        }

        g(k0 k0Var, g gVar) {
            this(k0Var, new WindowInsets(gVar.f3221c));
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.c f3227n = null;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.c f3228o = null;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.c f3229p = null;

        j(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c h() {
            if (this.f3228o == null) {
                this.f3228o = androidx.core.graphics.c.d(this.f3221c.getMandatorySystemGestureInsets());
            }
            return this.f3228o;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c j() {
            if (this.f3227n == null) {
                this.f3227n = androidx.core.graphics.c.d(this.f3221c.getSystemGestureInsets());
            }
            return this.f3227n;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c l() {
            if (this.f3229p == null) {
                this.f3229p = androidx.core.graphics.c.d(this.f3221c.getTappableElementInsets());
            }
            return this.f3229p;
        }

        /* access modifiers changed from: package-private */
        public k0 m(int i10, int i11, int i12, int i13) {
            return k0.v(this.f3221c.inset(i10, i11, i12, i13));
        }

        public void t(androidx.core.graphics.c cVar) {
        }

        j(k0 k0Var, j jVar) {
            super(k0Var, (i) jVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f3206a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3206a = new e();
            } else if (i10 >= 29) {
                this.f3206a = new d();
            } else if (i10 >= 20) {
                this.f3206a = new c();
            } else {
                this.f3206a = new f();
            }
        }

        public k0 a() {
            return this.f3206a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.c cVar) {
            this.f3206a.d(cVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.c cVar) {
            this.f3206a.f(cVar);
            return this;
        }

        public b(k0 k0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3206a = new e(k0Var);
            } else if (i10 >= 29) {
                this.f3206a = new d(k0Var);
            } else if (i10 >= 20) {
                this.f3206a = new c(k0Var);
            } else {
                this.f3206a = new f(k0Var);
            }
        }
    }

    public k0(k0 k0Var) {
        if (k0Var != null) {
            l lVar = k0Var.f3201a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f3201a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f3201a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f3201a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f3201a = new h(this, (h) lVar);
            } else if (i10 < 20 || !(lVar instanceof g)) {
                this.f3201a = new l(this);
            } else {
                this.f3201a = new g(this, (g) lVar);
            }
            lVar.e(this);
            return;
        }
        this.f3201a = new l(this);
    }
}
