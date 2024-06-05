package androidx.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.accessibility.c;
import androidx.core.view.k0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f3089a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static Field f3090b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3091c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f3092d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3093e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, String> f3094f;

    /* renamed from: g  reason: collision with root package name */
    private static WeakHashMap<View, g0> f3095g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Field f3096h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f3097i = false;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadLocal<Rect> f3098j;

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f3099k = {z.d.f24044b, z.d.f24046c, z.d.f24061n, z.d.f24072y, z.d.B, z.d.C, z.d.D, z.d.E, z.d.F, z.d.G, z.d.f24048d, z.d.f24050e, z.d.f24052f, z.d.f24054g, z.d.f24055h, z.d.f24056i, z.d.f24057j, z.d.f24058k, z.d.f24059l, z.d.f24060m, z.d.f24062o, z.d.f24063p, z.d.f24064q, z.d.f24065r, z.d.f24066s, z.d.f24067t, z.d.f24068u, z.d.f24069v, z.d.f24070w, z.d.f24071x, z.d.f24073z, z.d.A};

    /* renamed from: l  reason: collision with root package name */
    private static final w f3100l = z.f3250a;

    /* renamed from: m  reason: collision with root package name */
    private static final e f3101m = new e();

    /* compiled from: ViewCompat */
    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat */
    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat */
    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f3102a = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                a0.W(view, z11 ? 16 : 32);
                this.f3102a.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            this.f3102a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f3102a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f3102a.entrySet()) {
                    b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f3103a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f3104b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3105c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3106d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f3105c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract T d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, T t10);

        /* access modifiers changed from: package-private */
        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T tag = view.getTag(this.f3103a);
            if (this.f3104b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                a0.k(view);
                view.setTag(this.f3103a, t10);
                a0.W(view, this.f3106d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f3103a = i10;
            this.f3104b = cls;
            this.f3106d = i11;
            this.f3105c = i12;
        }
    }

    /* compiled from: ViewCompat */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat */
    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat */
    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat */
    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat */
    private static class m {

        /* compiled from: ViewCompat */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            k0 f3107a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f3108b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u f3109c;

            a(View view, u uVar) {
                this.f3108b = view;
                this.f3109c = uVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                k0 w10 = k0.w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f3108b);
                    if (w10.equals(this.f3107a)) {
                        return this.f3109c.a(view, w10).u();
                    }
                }
                this.f3107a = w10;
                k0 a10 = this.f3109c.a(view, w10);
                if (i10 >= 30) {
                    return a10.u();
                }
                a0.k0(view);
                return a10.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(z.d.f24045b0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static k0 b(View view, k0 k0Var, Rect rect) {
            WindowInsets u10 = k0Var.u();
            if (u10 != null) {
                return k0.w(view.computeSystemWindowInsets(u10, rect), view);
            }
            rect.setEmpty();
            return k0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static k0 j(View view) {
            return k0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(z.d.T, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(z.d.f24045b0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat */
    private static class n {
        public static k0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            k0 v10 = k0.v(rootWindowInsets);
            v10.s(v10);
            v10.d(view.getRootView());
            return v10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat */
    static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    static class p {
        static void a(View view, u uVar) {
            int i10 = z.d.f24043a0;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(uVar);
            b0 b0Var = new b0(uVar);
            gVar.put(uVar, b0Var);
            view.addOnUnhandledKeyEventListener(b0Var);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(z.d.f24043a0);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat */
    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat */
    private static class r {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo f10 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f10) {
                return cVar;
            }
            return c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(vVar));
            }
        }
    }

    /* compiled from: ViewCompat */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final v f3110a;

        t(v vVar) {
            this.f3110a = vVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c g10 = c.g(contentInfo);
            c a10 = this.f3110a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            if (a10 == g10) {
                return contentInfo;
            }
            return a10.f();
        }
    }

    /* compiled from: ViewCompat */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    static class v {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f3111d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f3112a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f3113b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f3114c = null;

        v() {
        }

        static v a(View view) {
            int i10 = z.d.Z;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3112a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f3113b == null) {
                this.f3113b = new SparseArray<>();
            }
            return this.f3113b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(z.d.f24043a0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3112a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3111d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f3112a == null) {
                        this.f3112a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f3111d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3112a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3112a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3114c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3114c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && a0.Q(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static void A0(View view, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 17) {
            i.k(view, i10, i11, i12, i13);
        } else {
            view.setPadding(i10, i11, i12, i13);
        }
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static void B0(View view, boolean z10) {
        m0().g(view, Boolean.valueOf(z10));
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f3093e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3092d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3093e = true;
        }
        Field field = f3092d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void C0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f3091c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3090b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3091c = true;
        }
        Field field = f3090b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void D0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (f3094f == null) {
            f3094f = new WeakHashMap<>();
        }
        f3094f.put(view, str);
    }

    public static String[] E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s.a(view);
        }
        return (String[]) view.getTag(z.d.V);
    }

    private static void E0(View view) {
        if (z(view) == 0) {
            x0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (z((View) parent) == 4) {
                x0(view, 2);
                return;
            }
        }
    }

    public static int F(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.e(view);
        }
        return view.getPaddingRight();
    }

    private static f<CharSequence> F0() {
        return new c(z.d.X, CharSequence.class, 64, 30);
    }

    public static int G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.f(view);
        }
        return view.getPaddingLeft();
    }

    public static void G0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof o) {
            ((o) view).stopNestedScroll();
        }
    }

    public static k0 H(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.a(view);
        }
        if (i10 >= 21) {
            return m.j(view);
        }
        return null;
    }

    private static void H0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static CharSequence I(View view) {
        return F0().f(view);
    }

    public static String J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f3094f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static float L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m(view);
        }
        return 0.0f;
    }

    public static boolean M(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean O(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean P(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean S(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.p(view);
        }
        if (view instanceof o) {
            return ((o) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean T(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.g(view);
        }
        return false;
    }

    public static boolean U(View view) {
        Boolean f10 = m0().f(view);
        return f10 != null && f10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c V(c cVar) {
        return cVar;
    }

    static void W(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (o(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(p(view));
                    E0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void X(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
        } else if (i11 >= 21) {
            Rect w10 = w();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                w10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !w10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i10);
            if (z10 && w10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(w10);
            }
        } else {
            e(view, i10);
        }
    }

    public static void Y(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
        } else if (i11 >= 21) {
            Rect w10 = w();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                w10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !w10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i10);
            if (z10 && w10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(w10);
            }
        } else {
            f(view, i10);
        }
    }

    public static k0 Z(View view, k0 k0Var) {
        WindowInsets u10;
        if (Build.VERSION.SDK_INT >= 21 && (u10 = k0Var.u()) != null) {
            WindowInsets b10 = l.b(view, u10);
            if (!b10.equals(u10)) {
                return k0.w(b10, view);
            }
        }
        return k0Var;
    }

    public static void a0(View view, androidx.core.view.accessibility.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.u0());
    }

    private static f<Boolean> b() {
        return new d(z.d.R, Boolean.class, 28);
    }

    private static f<CharSequence> b0() {
        return new b(z.d.S, CharSequence.class, 8, 28);
    }

    private static void c(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            k(view);
            i0(aVar.b(), view);
            q(view).add(aVar);
            W(view, 0);
        }
    }

    public static boolean c0(View view, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.j(view, i10, bundle);
        }
        return false;
    }

    public static g0 d(View view) {
        if (f3095g == null) {
            f3095g = new WeakHashMap<>();
        }
        g0 g0Var = f3095g.get(view);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(view);
        f3095g.put(view, g0Var2);
        return g0Var2;
    }

    public static c d0(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, cVar);
        }
        v vVar = (v) view.getTag(z.d.U);
        if (vVar == null) {
            return x(view).a(cVar);
        }
        c a10 = vVar.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return x(view).a(a10);
    }

    private static void e(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                H0((View) parent);
            }
        }
    }

    public static void e0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    private static void f(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                H0((View) parent);
            }
        }
    }

    public static void f0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static k0 g(View view, k0 k0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, k0Var, rect) : k0Var;
    }

    public static void g0(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    public static k0 h(View view, k0 k0Var) {
        WindowInsets u10;
        if (Build.VERSION.SDK_INT >= 21 && (u10 = k0Var.u()) != null) {
            WindowInsets a10 = l.a(view, u10);
            if (!a10.equals(u10)) {
                return k0.w(a10, view);
            }
        }
        return k0Var;
    }

    public static void h0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            i0(i10, view);
            W(view, 0);
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    private static void i0(int i10, View view) {
        List<c.a> q10 = q(view);
        for (int i11 = 0; i11 < q10.size(); i11++) {
            if (q10.get(i11).b() == i10) {
                q10.remove(i11);
                return;
            }
        }
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void j0(View view, c.a aVar, CharSequence charSequence, androidx.core.view.accessibility.f fVar) {
        if (fVar == null && charSequence == null) {
            h0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, fVar));
        }
    }

    static void k(View view) {
        a l10 = l(view);
        if (l10 == null) {
            l10 = new a();
        }
        n0(view, l10);
    }

    public static void k0(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            l.c(view);
        } else if (i10 >= 16) {
            h.p(view);
        }
    }

    public static a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        if (m10 instanceof a.C0044a) {
            return ((a.C0044a) m10).f3088a;
        }
        return new a(m10);
    }

    public static void l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.a(view);
        }
        return n(view);
    }

    private static f<Boolean> m0() {
        return new a(z.d.W, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f3097i) {
            return null;
        }
        if (f3096h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3096h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3097i = true;
                return null;
            }
        }
        try {
            Object obj = f3096h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3097i = true;
            return null;
        }
    }

    public static void n0(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m(view) instanceof a.C0044a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    public static void o0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static CharSequence p(View view) {
        return b0().f(view);
    }

    public static void p0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            k.f(view, i10);
        }
    }

    private static List<c.a> q(View view) {
        int i10 = z.d.P;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            b0().g(view, charSequence);
            if (charSequence != null) {
                f3101m.a(view);
            } else {
                f3101m.d(view);
            }
        }
    }

    public static ColorStateList r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof y) {
            return ((y) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void r0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static PorterDuff.Mode s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof y) {
            return ((y) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void s0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof y) {
            ((y) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static Rect t(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static void t0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.r(view, mode);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof y) {
            ((y) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static Display u(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.b(view);
        }
        if (Q(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void u0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    public static float v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.i(view);
        }
        return 0.0f;
    }

    public static void v0(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f10);
        }
    }

    private static Rect w() {
        if (f3098j == null) {
            f3098j = new ThreadLocal<>();
        }
        Rect rect = f3098j.get();
        if (rect == null) {
            rect = new Rect();
            f3098j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void w0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z10);
        }
    }

    private static w x(View view) {
        if (view instanceof w) {
            return (w) view;
        }
        return f3100l;
    }

    public static void x0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            h.s(view, i10);
        } else if (i11 >= 16) {
            if (i10 == 4) {
                i10 = 2;
            }
            h.s(view, i10);
        }
    }

    public static boolean y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.b(view);
        }
        return false;
    }

    public static void y0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i10);
        }
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static void z0(View view, u uVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, uVar);
        }
    }
}
