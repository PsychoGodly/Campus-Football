package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.z0;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.f;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.k0;
import androidx.lifecycle.i;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class h extends g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: k0  reason: collision with root package name */
    private static final androidx.collection.g<String, Integer> f850k0 = new androidx.collection.g<>();

    /* renamed from: l0  reason: collision with root package name */
    private static final boolean f851l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final int[] f852m0 = {16842836};

    /* renamed from: n0  reason: collision with root package name */
    private static final boolean f853n0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: o0  reason: collision with root package name */
    private static final boolean f854o0;

    /* renamed from: p0  reason: collision with root package name */
    private static boolean f855p0 = true;
    private boolean A;
    private boolean B;
    ViewGroup C;
    private TextView D;
    private View E;
    private boolean F;
    private boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    private boolean M;
    private w[] N;
    private w O;
    private boolean P;
    private boolean Q;
    private boolean R;
    boolean S;
    private Configuration T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private s Y;
    private s Z;

    /* renamed from: a0  reason: collision with root package name */
    boolean f856a0;

    /* renamed from: b0  reason: collision with root package name */
    int f857b0;

    /* renamed from: c0  reason: collision with root package name */
    private final Runnable f858c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f859d0;

    /* renamed from: e0  reason: collision with root package name */
    private Rect f860e0;

    /* renamed from: f0  reason: collision with root package name */
    private Rect f861f0;

    /* renamed from: g0  reason: collision with root package name */
    private l f862g0;

    /* renamed from: h0  reason: collision with root package name */
    private p f863h0;

    /* renamed from: i0  reason: collision with root package name */
    private OnBackInvokedDispatcher f864i0;

    /* renamed from: j0  reason: collision with root package name */
    private OnBackInvokedCallback f865j0;

    /* renamed from: k  reason: collision with root package name */
    final Object f866k;

    /* renamed from: l  reason: collision with root package name */
    final Context f867l;

    /* renamed from: m  reason: collision with root package name */
    Window f868m;

    /* renamed from: n  reason: collision with root package name */
    private q f869n;

    /* renamed from: o  reason: collision with root package name */
    final e f870o;

    /* renamed from: p  reason: collision with root package name */
    a f871p;

    /* renamed from: q  reason: collision with root package name */
    MenuInflater f872q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f873r;

    /* renamed from: s  reason: collision with root package name */
    private f0 f874s;

    /* renamed from: t  reason: collision with root package name */
    private j f875t;

    /* renamed from: u  reason: collision with root package name */
    private x f876u;

    /* renamed from: v  reason: collision with root package name */
    androidx.appcompat.view.b f877v;

    /* renamed from: w  reason: collision with root package name */
    ActionBarContextView f878w;

    /* renamed from: x  reason: collision with root package name */
    PopupWindow f879x;

    /* renamed from: y  reason: collision with root package name */
    Runnable f880y;

    /* renamed from: z  reason: collision with root package name */
    g0 f881z;

    /* compiled from: AppCompatDelegateImpl */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f882a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f882a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f882a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f882a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements Runnable {
        b() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.f857b0 & 1) != 0) {
                hVar.i0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f857b0 & 4096) != 0) {
                hVar2.i0(108);
            }
            h hVar3 = h.this;
            hVar3.f856a0 = false;
            hVar3.f857b0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements androidx.core.view.u {
        c() {
        }

        public k0 a(View view, k0 k0Var) {
            int k10 = k0Var.k();
            int e12 = h.this.e1(k0Var, (Rect) null);
            if (k10 != e12) {
                k0Var = k0Var.p(k0Var.i(), e12, k0Var.j(), k0Var.h());
            }
            return a0.Z(view, k0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d implements j0.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = h.this.e1((k0) null, rect);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class e implements ContentFrameLayout.a {
        e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            h.this.g0();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl */
        class a extends i0 {
            a() {
            }

            public void b(View view) {
                h.this.f878w.setAlpha(1.0f);
                h.this.f881z.h((h0) null);
                h.this.f881z = null;
            }

            public void c(View view) {
                h.this.f878w.setVisibility(0);
            }
        }

        f() {
        }

        public void run() {
            h hVar = h.this;
            hVar.f879x.showAtLocation(hVar.f878w, 55, 0, 0);
            h.this.j0();
            if (h.this.U0()) {
                h.this.f878w.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f881z = a0.d(hVar2.f878w).b(1.0f);
                h.this.f881z.h(new a());
                return;
            }
            h.this.f878w.setAlpha(1.0f);
            h.this.f878w.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class g extends i0 {
        g() {
        }

        public void b(View view) {
            h.this.f878w.setAlpha(1.0f);
            h.this.f881z.h((h0) null);
            h.this.f881z = null;
        }

        public void c(View view) {
            h.this.f878w.setVisibility(0);
            if (h.this.f878w.getParent() instanceof View) {
                a0.k0((View) h.this.f878w.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    private class C0013h implements b {
        C0013h() {
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    interface i {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class j implements m.a {
        j() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            h.this.Z(gVar);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02 = h.this.v0();
            if (v02 == null) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class k implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f892a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends i0 {
            a() {
            }

            public void b(View view) {
                h.this.f878w.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f879x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f878w.getParent() instanceof View) {
                    a0.k0((View) h.this.f878w.getParent());
                }
                h.this.f878w.k();
                h.this.f881z.h((h0) null);
                h hVar2 = h.this;
                hVar2.f881z = null;
                a0.k0(hVar2.C);
            }
        }

        public k(b.a aVar) {
            this.f892a = aVar;
        }

        public void a(androidx.appcompat.view.b bVar) {
            this.f892a.a(bVar);
            h hVar = h.this;
            if (hVar.f879x != null) {
                hVar.f868m.getDecorView().removeCallbacks(h.this.f880y);
            }
            h hVar2 = h.this;
            if (hVar2.f878w != null) {
                hVar2.j0();
                h hVar3 = h.this;
                hVar3.f881z = a0.d(hVar3.f878w).b(0.0f);
                h.this.f881z.h(new a());
            }
            h hVar4 = h.this;
            e eVar = hVar4.f870o;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(hVar4.f877v);
            }
            h hVar5 = h.this;
            hVar5.f877v = null;
            a0.k0(hVar5.C);
            h.this.c1();
        }

        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f892a.b(bVar, menu);
        }

        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            a0.k0(h.this.C);
            return this.f892a.c(bVar, menu);
        }

        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f892a.d(bVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class l {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class m {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static androidx.core.os.j b(Configuration configuration) {
            return androidx.core.os.j.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.h()));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class p {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, h hVar) {
            Objects.requireNonNull(hVar);
            i iVar = new i(hVar);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, iVar);
            return iVar;
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class r extends s {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f900c;

        r(Context context) {
            super();
            this.f900c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !m.a(this.f900c)) {
                return 1;
            }
            return 2;
        }

        public void d() {
            h.this.T();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    abstract class s {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f902a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                s.this.d();
            }
        }

        s() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f902a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f867l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f902a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f902a == null) {
                    this.f902a = new a();
                }
                h.this.f867l.registerReceiver(this.f902a, b10);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class t extends s {

        /* renamed from: c  reason: collision with root package name */
        private final u f905c;

        t(u uVar) {
            super();
            this.f905c = uVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f905c.d() ? 2 : 1;
        }

        public void d() {
            h.this.T();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private static class u {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class v extends ContentFrameLayout {
        public v(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(i.a.b(getContext(), i10));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class w {

        /* renamed from: a  reason: collision with root package name */
        int f908a;

        /* renamed from: b  reason: collision with root package name */
        int f909b;

        /* renamed from: c  reason: collision with root package name */
        int f910c;

        /* renamed from: d  reason: collision with root package name */
        int f911d;

        /* renamed from: e  reason: collision with root package name */
        int f912e;

        /* renamed from: f  reason: collision with root package name */
        int f913f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f914g;

        /* renamed from: h  reason: collision with root package name */
        View f915h;

        /* renamed from: i  reason: collision with root package name */
        View f916i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f917j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f918k;

        /* renamed from: l  reason: collision with root package name */
        Context f919l;

        /* renamed from: m  reason: collision with root package name */
        boolean f920m;

        /* renamed from: n  reason: collision with root package name */
        boolean f921n;

        /* renamed from: o  reason: collision with root package name */
        boolean f922o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f923p;

        /* renamed from: q  reason: collision with root package name */
        boolean f924q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f925r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f926s;

        w(int i10) {
            this.f908a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f917j == null) {
                return null;
            }
            if (this.f918k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f919l, h.g.f18276j);
                this.f918k = eVar;
                eVar.g(aVar);
                this.f917j.b(this.f918k);
            }
            return this.f918k.i(this.f914g);
        }

        public boolean b() {
            if (this.f915h == null) {
                return false;
            }
            if (this.f916i == null && this.f918k.b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f917j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.O(this.f918k);
                }
                this.f917j = gVar;
                if (gVar != null && (eVar = this.f918k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(h.a.f18165a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(h.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(h.i.f18300b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f919l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(h.j.f18425y0);
            this.f909b = obtainStyledAttributes.getResourceId(h.j.B0, 0);
            this.f913f = obtainStyledAttributes.getResourceId(h.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class x implements m.a {
        x() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z11 = D != gVar;
            h hVar = h.this;
            if (z11) {
                gVar = D;
            }
            w m02 = hVar.m0(gVar);
            if (m02 == null) {
                return;
            }
            if (z11) {
                h.this.Y(m02.f908a, m02, D);
                h.this.c0(m02, true);
                return;
            }
            h.this.c0(m02, z10);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02;
            if (gVar != gVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.H || (v02 = hVar.v0()) == null || h.this.S) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        boolean z11 = i10 < 21;
        f851l0 = z11;
        if (i10 >= 17) {
            z10 = true;
        }
        f854o0 = z10;
        if (z11 && !f855p0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    h(Activity activity, e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    private void A0(int i10) {
        this.f857b0 = (1 << i10) | this.f857b0;
        if (!this.f856a0) {
            a0.f0(this.f868m.getDecorView(), this.f858c0);
            this.f856a0 = true;
        }
    }

    private boolean F0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        w t02 = t0(i10, true);
        if (!t02.f922o) {
            return P0(t02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f877v
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$w r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.f0 r5 = r4.f874s
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f867l
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.f0 r5 = r4.f874s
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.S
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.f0 r5 = r4.f874s
            boolean r0 = r5.h()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.f0 r5 = r4.f874s
            boolean r0 = r5.g()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f922o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f921n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f920m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f925r
            if (r5 == 0) goto L_0x005b
            r2.f920m = r1
            boolean r5 = r4.P0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.M0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.c0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f867l
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M0(androidx.appcompat.app.h.w r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f922o
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r13.S
            if (r0 == 0) goto L_0x000a
            goto L_0x00f8
        L_0x000a:
            int r0 = r14.f908a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f867l
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.v0()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f908a
            androidx.appcompat.view.menu.g r4 = r14.f917j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.c0(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f867l
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.P0(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.f914g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006a
            boolean r5 = r14.f924q
            if (r5 == 0) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            android.view.View r15 = r14.f916i
            if (r15 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x00cc
            int r15 = r15.width
            if (r15 != r3) goto L_0x00cc
            r6 = -1
            goto L_0x00cd
        L_0x006a:
            if (r15 != 0) goto L_0x0077
            boolean r15 = r13.y0(r14)
            if (r15 == 0) goto L_0x0076
            android.view.ViewGroup r15 = r14.f914g
            if (r15 != 0) goto L_0x0086
        L_0x0076:
            return
        L_0x0077:
            boolean r3 = r14.f924q
            if (r3 == 0) goto L_0x0086
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x0086
            android.view.ViewGroup r15 = r14.f914g
            r15.removeAllViews()
        L_0x0086:
            boolean r15 = r13.x0(r14)
            if (r15 == 0) goto L_0x00f6
            boolean r15 = r14.b()
            if (r15 != 0) goto L_0x0093
            goto L_0x00f6
        L_0x0093:
            android.view.View r15 = r14.f915h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x00a0:
            int r3 = r14.f909b
            android.view.ViewGroup r5 = r14.f914g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f915h
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00b8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f915h
            r3.removeView(r5)
        L_0x00b8:
            android.view.ViewGroup r3 = r14.f914g
            android.view.View r5 = r14.f915h
            r3.addView(r5, r15)
            android.view.View r15 = r14.f915h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x00cc
            android.view.View r15 = r14.f915h
            r15.requestFocus()
        L_0x00cc:
            r6 = -2
        L_0x00cd:
            r14.f921n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.f911d
            int r9 = r14.f912e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f910c
            r15.gravity = r1
            int r1 = r14.f913f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f914g
            r0.addView(r1, r15)
            r14.f922o = r2
            int r14 = r14.f908a
            if (r14 != 0) goto L_0x00f5
            r13.c1()
        L_0x00f5:
            return
        L_0x00f6:
            r14.f924q = r2
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M0(androidx.appcompat.app.h$w, android.view.KeyEvent):void");
    }

    private boolean O0(w wVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f920m || P0(wVar, keyEvent)) && (gVar = wVar.f917j) != null) {
            z10 = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f874s == null) {
            c0(wVar, true);
        }
        return z10;
    }

    private boolean P0(w wVar, KeyEvent keyEvent) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        if (this.S) {
            return false;
        }
        if (wVar.f920m) {
            return true;
        }
        w wVar2 = this.O;
        if (!(wVar2 == null || wVar2 == wVar)) {
            c0(wVar2, false);
        }
        Window.Callback v02 = v0();
        if (v02 != null) {
            wVar.f916i = v02.onCreatePanelView(wVar.f908a);
        }
        int i10 = wVar.f908a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (f0Var3 = this.f874s) != null) {
            f0Var3.d();
        }
        if (wVar.f916i == null && (!z10 || !(N0() instanceof s))) {
            androidx.appcompat.view.menu.g gVar = wVar.f917j;
            if (gVar == null || wVar.f925r) {
                if (gVar == null && (!z0(wVar) || wVar.f917j == null)) {
                    return false;
                }
                if (z10 && this.f874s != null) {
                    if (this.f875t == null) {
                        this.f875t = new j();
                    }
                    this.f874s.b(wVar.f917j, this.f875t);
                }
                wVar.f917j.e0();
                if (!v02.onCreatePanelMenu(wVar.f908a, wVar.f917j)) {
                    wVar.c((androidx.appcompat.view.menu.g) null);
                    if (z10 && (f0Var2 = this.f874s) != null) {
                        f0Var2.b((Menu) null, this.f875t);
                    }
                    return false;
                }
                wVar.f925r = false;
            }
            wVar.f917j.e0();
            Bundle bundle = wVar.f926s;
            if (bundle != null) {
                wVar.f917j.P(bundle);
                wVar.f926s = null;
            }
            if (!v02.onPreparePanel(0, wVar.f916i, wVar.f917j)) {
                if (z10 && (f0Var = this.f874s) != null) {
                    f0Var.b((Menu) null, this.f875t);
                }
                wVar.f917j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            wVar.f923p = z11;
            wVar.f917j.setQwertyMode(z11);
            wVar.f917j.d0();
        }
        wVar.f920m = true;
        wVar.f921n = false;
        this.O = wVar;
        return true;
    }

    private void Q0(boolean z10) {
        f0 f0Var = this.f874s;
        if (f0Var == null || !f0Var.e() || (ViewConfiguration.get(this.f867l).hasPermanentMenuKey() && !this.f874s.f())) {
            w t02 = t0(0, true);
            t02.f924q = true;
            c0(t02, false);
            M0(t02, (KeyEvent) null);
            return;
        }
        Window.Callback v02 = v0();
        if (this.f874s.c() && z10) {
            this.f874s.g();
            if (!this.S) {
                v02.onPanelClosed(108, t0(0, true).f917j);
            }
        } else if (v02 != null && !this.S) {
            if (this.f856a0 && (this.f857b0 & 1) != 0) {
                this.f868m.getDecorView().removeCallbacks(this.f858c0);
                this.f858c0.run();
            }
            w t03 = t0(0, true);
            androidx.appcompat.view.menu.g gVar = t03.f917j;
            if (gVar != null && !t03.f925r && v02.onPreparePanel(0, t03.f916i, gVar)) {
                v02.onMenuOpened(108, t03.f917j);
                this.f874s.h();
            }
        }
    }

    private boolean R(boolean z10) {
        return S(z10, true);
    }

    private int R0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean S(boolean z10, boolean z11) {
        if (this.S) {
            return false;
        }
        int X2 = X();
        int C0 = C0(this.f867l, X2);
        androidx.core.os.j jVar = null;
        if (Build.VERSION.SDK_INT < 33) {
            jVar = W(this.f867l);
        }
        if (!z11 && jVar != null) {
            jVar = s0(this.f867l.getResources().getConfiguration());
        }
        boolean b12 = b1(C0, jVar, z10);
        if (X2 == 0) {
            r0(this.f867l).e();
        } else {
            s sVar = this.Y;
            if (sVar != null) {
                sVar.a();
            }
        }
        if (X2 == 3) {
            q0(this.f867l).e();
        } else {
            s sVar2 = this.Z;
            if (sVar2 != null) {
                sVar2.a();
            }
        }
        return b12;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.C.findViewById(16908290);
        View decorView = this.f868m.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f867l.obtainStyledAttributes(h.j.f18425y0);
        obtainStyledAttributes.getValue(h.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(h.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = h.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = h.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = h.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = h.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f868m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof q)) {
                q qVar = new q(callback);
                this.f869n = qVar;
                window.setCallback(qVar);
                z0 u10 = z0.u(this.f867l, (AttributeSet) null, f852m0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.w();
                this.f868m = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f864i0 == null) {
                    L((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f868m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || a0.Q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i10 = this.U;
        return i10 != -100 ? i10 : g.m();
    }

    private void Y0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private d Z0() {
        Context context = this.f867l;
        while (context != null) {
            if (!(context instanceof d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (d) context;
            }
        }
        return null;
    }

    private void a0() {
        s sVar = this.Y;
        if (sVar != null) {
            sVar.a();
        }
        s sVar2 = this.Z;
        if (sVar2 != null) {
            sVar2.a();
        }
    }

    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f866k;
        if (activity instanceof androidx.lifecycle.p) {
            if (((androidx.lifecycle.p) activity).getLifecycle().b().c(i.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.R && !this.S) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b1(int r9, androidx.core.os.j r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f867l
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f867l
            int r1 = r8.p0(r1)
            android.content.res.Configuration r2 = r8.T
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f867l
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.j r2 = r8.s0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.j r0 = r8.s0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x004d
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004d
            r3 = r3 | 4
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r2 < r7) goto L_0x004d
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
        L_0x004d:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x0077
            if (r11 == 0) goto L_0x0077
            boolean r11 = r8.Q
            if (r11 == 0) goto L_0x0077
            boolean r11 = f853n0
            if (r11 != 0) goto L_0x0060
            boolean r11 = r8.R
            if (r11 == 0) goto L_0x0077
        L_0x0060:
            java.lang.Object r11 = r8.f866k
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0077
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x0077
            java.lang.Object r11 = r8.f866k
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.f(r11)
            r11 = 1
            goto L_0x0078
        L_0x0077:
            r11 = 0
        L_0x0078:
            if (r11 != 0) goto L_0x0085
            if (r3 == 0) goto L_0x0085
            r11 = r3 & r1
            if (r11 != r3) goto L_0x0081
            r6 = 1
        L_0x0081:
            r8.d1(r4, r0, r6, r5)
            goto L_0x0086
        L_0x0085:
            r7 = r11
        L_0x0086:
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r11 = r8.f866k
            boolean r1 = r11 instanceof androidx.appcompat.app.d
            if (r1 == 0) goto L_0x00a2
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0097
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.d) r11
            r11.onNightModeChanged(r9)
        L_0x0097:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x00a2
            java.lang.Object r9 = r8.f866k
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.d) r9
            r9.onLocalesChanged(r10)
        L_0x00a2:
            if (r7 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b7
            android.content.Context r9 = r8.f867l
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.j r9 = r8.s0(r9)
            r8.T0(r9)
        L_0x00b7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b1(int, androidx.core.os.j, boolean):boolean");
    }

    private Configuration d0(Context context, int i10, androidx.core.os.j jVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (jVar != null) {
            S0(configuration2, jVar);
        }
        return configuration2;
    }

    private void d1(int i10, androidx.core.os.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f867l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        if (jVar != null) {
            S0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            r.a(resources);
        }
        int i12 = this.V;
        if (i12 != 0) {
            this.f867l.setTheme(i12);
            if (i11 >= 23) {
                this.f867l.getTheme().applyStyle(this.V, true);
            }
        }
        if (z10 && (this.f866k instanceof Activity)) {
            a1(configuration2);
        }
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f867l.obtainStyledAttributes(h.j.f18425y0);
        int i10 = h.j.D0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(h.j.M0, false)) {
                H(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                H(108);
            }
            if (obtainStyledAttributes.getBoolean(h.j.E0, false)) {
                H(109);
            }
            if (obtainStyledAttributes.getBoolean(h.j.F0, false)) {
                H(10);
            }
            this.K = obtainStyledAttributes.getBoolean(h.j.f18430z0, false);
            obtainStyledAttributes.recycle();
            l0();
            this.f868m.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f867l);
            if (this.L) {
                viewGroup = this.J ? (ViewGroup) from.inflate(h.g.f18281o, (ViewGroup) null) : (ViewGroup) from.inflate(h.g.f18280n, (ViewGroup) null);
            } else if (this.K) {
                viewGroup = (ViewGroup) from.inflate(h.g.f18272f, (ViewGroup) null);
                this.I = false;
                this.H = false;
            } else if (this.H) {
                TypedValue typedValue = new TypedValue();
                this.f867l.getTheme().resolveAttribute(h.a.f18170f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new androidx.appcompat.view.d(this.f867l, typedValue.resourceId);
                } else {
                    context = this.f867l;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(h.g.f18282p, (ViewGroup) null);
                f0 f0Var = (f0) viewGroup.findViewById(h.f.f18256p);
                this.f874s = f0Var;
                f0Var.setWindowCallback(v0());
                if (this.I) {
                    this.f874s.i(109);
                }
                if (this.F) {
                    this.f874s.i(2);
                }
                if (this.G) {
                    this.f874s.i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    a0.z0(viewGroup, new c());
                } else if (viewGroup instanceof j0) {
                    ((j0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f874s == null) {
                    this.D = (TextView) viewGroup.findViewById(h.f.M);
                }
                k1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.f18242b);
                ViewGroup viewGroup2 = (ViewGroup) this.f868m.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f868m.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void f1(View view) {
        int i10;
        if ((a0.K(view) & 8192) != 0) {
            i10 = androidx.core.content.a.getColor(this.f867l, h.c.f18193b);
        } else {
            i10 = androidx.core.content.a.getColor(this.f867l, h.c.f18192a);
        }
        view.setBackgroundColor(i10);
    }

    private void k0() {
        if (!this.B) {
            this.C = e0();
            CharSequence u02 = u0();
            if (!TextUtils.isEmpty(u02)) {
                f0 f0Var = this.f874s;
                if (f0Var != null) {
                    f0Var.setWindowTitle(u02);
                } else if (N0() != null) {
                    N0().x(u02);
                } else {
                    TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(u02);
                    }
                }
            }
            U();
            L0(this.C);
            this.B = true;
            w t02 = t0(0, false);
            if (this.S) {
                return;
            }
            if (t02 == null || t02.f917j == null) {
                A0(108);
            }
        }
    }

    private void l0() {
        if (this.f868m == null) {
            Object obj = this.f866k;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f868m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                n.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                l.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.X && (this.f866k instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f866k.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.W = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.W = 0;
            }
        }
        this.X = true;
        return this.W;
    }

    private s q0(Context context) {
        if (this.Z == null) {
            this.Z = new r(context);
        }
        return this.Z;
    }

    private s r0(Context context) {
        if (this.Y == null) {
            this.Y = new t(u.a(context));
        }
        return this.Y;
    }

    private void w0() {
        k0();
        if (this.H && this.f871p == null) {
            Object obj = this.f866k;
            if (obj instanceof Activity) {
                this.f871p = new v((Activity) this.f866k, this.I);
            } else if (obj instanceof Dialog) {
                this.f871p = new v((Dialog) this.f866k);
            }
            a aVar = this.f871p;
            if (aVar != null) {
                aVar.t(this.f859d0);
            }
        }
    }

    private boolean x0(w wVar) {
        View view = wVar.f916i;
        if (view != null) {
            wVar.f915h = view;
            return true;
        } else if (wVar.f917j == null) {
            return false;
        } else {
            if (this.f876u == null) {
                this.f876u = new x();
            }
            View view2 = (View) wVar.a(this.f876u);
            wVar.f915h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean y0(w wVar) {
        wVar.d(o0());
        wVar.f914g = new v(wVar.f919l);
        wVar.f910c = 81;
        return true;
    }

    private boolean z0(w wVar) {
        Context context = this.f867l;
        int i10 = wVar.f908a;
        if ((i10 == 0 || i10 == 108) && this.f874s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(h.a.f18170f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(h.a.f18171g, typedValue, true);
            } else {
                theme.resolveAttribute(h.a.f18171g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        wVar.c(gVar);
        return true;
    }

    public void A(Bundle bundle) {
        k0();
    }

    public void B() {
        a s10 = s();
        if (s10 != null) {
            s10.v(true);
        }
    }

    public boolean B0() {
        return this.A;
    }

    public void C(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int C0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        return q0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return r0(context).c();
            } else {
                return -1;
            }
        }
        return i10;
    }

    public void D() {
        S(true, false);
    }

    /* access modifiers changed from: package-private */
    public boolean D0() {
        boolean z10 = this.P;
        this.P = false;
        w t02 = t0(0, false);
        if (t02 == null || !t02.f922o) {
            androidx.appcompat.view.b bVar = this.f877v;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            a s10 = s();
            if (s10 == null || !s10.g()) {
                return false;
            }
            return true;
        }
        if (!z10) {
            c0(t02, true);
        }
        return true;
    }

    public void E() {
        a s10 = s();
        if (s10 != null) {
            s10.v(false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.P = z10;
        } else if (i10 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G0(int i10, KeyEvent keyEvent) {
        a s10 = s();
        if (s10 != null && s10.p(i10, keyEvent)) {
            return true;
        }
        w wVar = this.O;
        if (wVar == null || !O0(wVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.O == null) {
                w t02 = t0(0, true);
                P0(t02, keyEvent);
                boolean O0 = O0(t02, keyEvent.getKeyCode(), keyEvent, 1);
                t02.f920m = false;
                if (O0) {
                    return true;
                }
            }
            return false;
        }
        w wVar2 = this.O;
        if (wVar2 != null) {
            wVar2.f921n = true;
        }
        return true;
    }

    public boolean H(int i10) {
        int R0 = R0(i10);
        if (this.L && R0 == 108) {
            return false;
        }
        if (this.H && R0 == 1) {
            this.H = false;
        }
        if (R0 == 1) {
            Y0();
            this.L = true;
            return true;
        } else if (R0 == 2) {
            Y0();
            this.F = true;
            return true;
        } else if (R0 == 5) {
            Y0();
            this.G = true;
            return true;
        } else if (R0 == 10) {
            Y0();
            this.J = true;
            return true;
        } else if (R0 == 108) {
            Y0();
            this.H = true;
            return true;
        } else if (R0 != 109) {
            return this.f868m.requestFeature(R0);
        } else {
            Y0();
            this.I = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    public void I(int i10) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f867l).inflate(i10, viewGroup);
        this.f869n.c(this.f868m.getCallback());
    }

    public void J(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f869n.c(this.f868m.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void J0(int i10) {
        a s10;
        if (i10 == 108 && (s10 = s()) != null) {
            s10.h(true);
        }
    }

    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f869n.c(this.f868m.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void K0(int i10) {
        if (i10 == 108) {
            a s10 = s();
            if (s10 != null) {
                s10.h(false);
            }
        } else if (i10 == 0) {
            w t02 = t0(i10, true);
            if (t02.f922o) {
                c0(t02, false);
            }
        }
    }

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.L(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f864i0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f865j0) == null)) {
            p.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f865j0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f866k;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f864i0 = p.a((Activity) this.f866k);
                c1();
            }
        }
        this.f864i0 = onBackInvokedDispatcher;
        c1();
    }

    /* access modifiers changed from: package-private */
    public void L0(ViewGroup viewGroup) {
    }

    public void M(Toolbar toolbar) {
        if (this.f866k instanceof Activity) {
            a s10 = s();
            if (!(s10 instanceof v)) {
                this.f872q = null;
                if (s10 != null) {
                    s10.o();
                }
                this.f871p = null;
                if (toolbar != null) {
                    s sVar = new s(toolbar, u0(), this.f869n);
                    this.f871p = sVar;
                    this.f869n.e(sVar.f953c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f869n.e((i) null);
                }
                u();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void N(int i10) {
        this.V = i10;
    }

    /* access modifiers changed from: package-private */
    public final a N0() {
        return this.f871p;
    }

    public final void O(CharSequence charSequence) {
        this.f873r = charSequence;
        f0 f0Var = this.f874s;
        if (f0Var != null) {
            f0Var.setWindowTitle(charSequence);
        } else if (N0() != null) {
            N0().x(charSequence);
        } else {
            TextView textView = this.D;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public androidx.appcompat.view.b P(b.a aVar) {
        e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f877v;
            if (bVar != null) {
                bVar.c();
            }
            k kVar = new k(aVar);
            a s10 = s();
            if (s10 != null) {
                androidx.appcompat.view.b z10 = s10.z(kVar);
                this.f877v = z10;
                if (!(z10 == null || (eVar = this.f870o) == null)) {
                    eVar.onSupportActionModeStarted(z10);
                }
            }
            if (this.f877v == null) {
                this.f877v = X0(kVar);
            }
            c1();
            return this.f877v;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void S0(Configuration configuration, androidx.core.os.j jVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            n.d(configuration, jVar);
        } else if (i10 >= 17) {
            l.d(configuration, jVar.d(0));
            l.c(configuration, jVar.d(0));
        } else {
            configuration.locale = jVar.d(0);
        }
    }

    public boolean T() {
        return R(true);
    }

    /* access modifiers changed from: package-private */
    public void T0(androidx.core.os.j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.c(jVar);
        } else {
            Locale.setDefault(jVar.d(0));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U0() {
        /*
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.C
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.a0.R(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.U0():boolean");
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.j W(Context context) {
        androidx.core.os.j r10;
        androidx.core.os.j jVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (r10 = g.r()) == null) {
            return null;
        }
        androidx.core.os.j s02 = s0(context.getApplicationContext().getResources().getConfiguration());
        if (i10 >= 24) {
            jVar = q.b(r10, s02);
        } else if (r10.f()) {
            jVar = androidx.core.os.j.e();
        } else {
            jVar = androidx.core.os.j.c(r10.d(0).toString());
        }
        return jVar.f() ? s02 : jVar;
    }

    /* access modifiers changed from: package-private */
    public boolean W0() {
        if (this.f864i0 == null) {
            return false;
        }
        w t02 = t0(0, false);
        if ((t02 == null || !t02.f922o) && this.f877v == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.b X0(androidx.appcompat.view.b.a r8) {
        /*
            r7 = this;
            r7.j0()
            androidx.appcompat.view.b r0 = r7.f877v
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.h.k
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$k r0 = new androidx.appcompat.app.h$k
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f870o
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.S
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f877v = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f878w
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.K
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f867l
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = h.a.f18170f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f867l
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f867l
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f867l
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f878w = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = h.a.f18173i
            r5.<init>(r4, r1, r6)
            r7.f879x = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f879x
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f878w
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f879x
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = h.a.f18166b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f878w
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f879x
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$f r0 = new androidx.appcompat.app.h$f
            r0.<init>()
            r7.f880y = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.C
            int r4 = h.f.f18248h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.o0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f878w = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f878w
            if (r0 == 0) goto L_0x015b
            r7.j0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f878w
            r0.k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f878w
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f878w
            android.widget.PopupWindow r6 = r7.f879x
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            r8.h(r0)
            r7.f877v = r0
            boolean r8 = r7.U0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            androidx.core.view.g0 r8 = androidx.core.view.a0.d(r8)
            androidx.core.view.g0 r8 = r8.b(r0)
            r7.f881z = r8
            androidx.appcompat.app.h$g r0 = new androidx.appcompat.app.h$g
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f878w
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.a0.k0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f879x
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f868m
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f880y
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f877v = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f877v
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f870o
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            r7.c1()
            androidx.appcompat.view.b r8 = r7.f877v
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.X0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10, w wVar, Menu menu) {
        if (menu == null) {
            if (wVar == null && i10 >= 0) {
                w[] wVarArr = this.N;
                if (i10 < wVarArr.length) {
                    wVar = wVarArr[i10];
                }
            }
            if (wVar != null) {
                menu = wVar.f917j;
            }
        }
        if ((wVar == null || wVar.f922o) && !this.S) {
            this.f869n.d(this.f868m.getCallback(), i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(androidx.appcompat.view.menu.g gVar) {
        if (!this.M) {
            this.M = true;
            this.f874s.j();
            Window.Callback v02 = v0();
            if (v02 != null && !this.S) {
                v02.onPanelClosed(108, gVar);
            }
            this.M = false;
        }
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        w m02;
        Window.Callback v02 = v0();
        if (v02 == null || this.S || (m02 = m0(gVar.D())) == null) {
            return false;
        }
        return v02.onMenuItemSelected(m02.f908a, menuItem);
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        Q0(true);
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        c0(t0(i10, true), true);
    }

    /* access modifiers changed from: package-private */
    public void c0(w wVar, boolean z10) {
        ViewGroup viewGroup;
        f0 f0Var;
        if (!z10 || wVar.f908a != 0 || (f0Var = this.f874s) == null || !f0Var.c()) {
            WindowManager windowManager = (WindowManager) this.f867l.getSystemService("window");
            if (!(windowManager == null || !wVar.f922o || (viewGroup = wVar.f914g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    Y(wVar.f908a, wVar, (Menu) null);
                }
            }
            wVar.f920m = false;
            wVar.f921n = false;
            wVar.f922o = false;
            wVar.f915h = null;
            wVar.f924q = true;
            if (this.O == wVar) {
                this.O = null;
            }
            if (wVar.f908a == 0) {
                c1();
                return;
            }
            return;
        }
        Z(wVar.f917j);
    }

    /* access modifiers changed from: package-private */
    public void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean W0 = W0();
            if (W0 && this.f865j0 == null) {
                this.f865j0 = p.b(this.f864i0, this);
            } else if (!W0 && (onBackInvokedCallback = this.f865j0) != null) {
                p.c(this.f864i0, onBackInvokedCallback);
            }
        }
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.C.findViewById(16908290)).addView(view, layoutParams);
        this.f869n.c(this.f868m.getCallback());
    }

    /* access modifiers changed from: package-private */
    public final int e1(k0 k0Var, Rect rect) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int i14 = 0;
        if (k0Var != null) {
            i10 = k0Var.k();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f878w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f878w.getLayoutParams();
            boolean z12 = true;
            if (this.f878w.isShown()) {
                if (this.f860e0 == null) {
                    this.f860e0 = new Rect();
                    this.f861f0 = new Rect();
                }
                Rect rect2 = this.f860e0;
                Rect rect3 = this.f861f0;
                if (k0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k0Var.i(), k0Var.k(), k0Var.j(), k0Var.h());
                }
                k1.a(this.C, rect2, rect3);
                int i15 = rect2.top;
                int i16 = rect2.left;
                int i17 = rect2.right;
                k0 H2 = a0.H(this.C);
                if (H2 == null) {
                    i11 = 0;
                } else {
                    i11 = H2.i();
                }
                if (H2 == null) {
                    i12 = 0;
                } else {
                    i12 = H2.j();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                if (i15 <= 0 || this.E != null) {
                    View view = this.E;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i11;
                        marginLayoutParams.rightMargin = i12;
                        this.E.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f867l);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    f1(this.E);
                }
                if (!this.J && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f878w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.E;
        if (view4 != null) {
            if (!z10) {
                i14 = 8;
            }
            view4.setVisibility(i14);
        }
        return i10;
    }

    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.f862g0 == null) {
            String string = this.f867l.obtainStyledAttributes(h.j.f18425y0).getString(h.j.C0);
            if (string == null) {
                this.f862g0 = new l();
            } else {
                try {
                    this.f862g0 = (l) this.f867l.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f862g0 = new l();
                }
            }
        }
        boolean z12 = f851l0;
        if (z12) {
            if (this.f863h0 == null) {
                this.f863h0 = new p();
            }
            if (this.f863h0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z11 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z11 = true;
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.f862g0.createView(view, str, context, attributeSet, z10, z12, true, j1.c());
    }

    public Context g(Context context) {
        boolean z10 = true;
        this.Q = true;
        int C0 = C0(context, X());
        if (g.v(context)) {
            g.Q(context);
        }
        androidx.core.os.j W2 = W(context);
        if (f854o0 && (context instanceof ContextThemeWrapper)) {
            try {
                u.a((ContextThemeWrapper) context, d0(context, C0, W2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, C0, W2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f853n0) {
            return super.g(context);
        }
        Configuration configuration = null;
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = l.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = n0(configuration3, configuration4);
            }
        }
        Configuration d02 = d0(context, C0, W2, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, h.i.f18302d);
        dVar.a(d02);
        boolean z11 = false;
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            h.g.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        androidx.appcompat.view.menu.g gVar;
        f0 f0Var = this.f874s;
        if (f0Var != null) {
            f0Var.j();
        }
        if (this.f879x != null) {
            this.f868m.getDecorView().removeCallbacks(this.f880y);
            if (this.f879x.isShowing()) {
                try {
                    this.f879x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f879x = null;
        }
        j0();
        w t02 = t0(0, false);
        if (t02 != null && (gVar = t02.f917j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f866k;
        boolean z10 = true;
        if (((obj instanceof f.a) || (obj instanceof k)) && (decorView = this.f868m.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f869n.b(this.f868m.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void i0(int i10) {
        w t02;
        w t03 = t0(i10, true);
        if (t03.f917j != null) {
            Bundle bundle = new Bundle();
            t03.f917j.Q(bundle);
            if (bundle.size() > 0) {
                t03.f926s = bundle;
            }
            t03.f917j.e0();
            t03.f917j.clear();
        }
        t03.f925r = true;
        t03.f924q = true;
        if ((i10 == 108 || i10 == 0) && this.f874s != null && (t02 = t0(0, false)) != null) {
            t02.f920m = false;
            P0(t02, (KeyEvent) null);
        }
    }

    public <T extends View> T j(int i10) {
        k0();
        return this.f868m.findViewById(i10);
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        g0 g0Var = this.f881z;
        if (g0Var != null) {
            g0Var.c();
        }
    }

    public Context l() {
        return this.f867l;
    }

    /* access modifiers changed from: package-private */
    public w m0(Menu menu) {
        w[] wVarArr = this.N;
        int length = wVarArr != null ? wVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            w wVar = wVarArr[i10];
            if (wVar != null && wVar.f917j == menu) {
                return wVar;
            }
        }
        return null;
    }

    public final b n() {
        return new C0013h();
    }

    public int o() {
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public final Context o0() {
        a s10 = s();
        Context j10 = s10 != null ? s10.j() : null;
        return j10 == null ? this.f867l : j10;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    public MenuInflater q() {
        if (this.f872q == null) {
            w0();
            a aVar = this.f871p;
            this.f872q = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f867l);
        }
        return this.f872q;
    }

    public a s() {
        w0();
        return this.f871p;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.j s0(Configuration configuration) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return n.b(configuration);
        }
        if (i10 >= 21) {
            return androidx.core.os.j.c(m.b(configuration.locale));
        }
        return androidx.core.os.j.a(configuration.locale);
    }

    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f867l);
        if (from.getFactory() == null) {
            androidx.core.view.g.b(from, this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: protected */
    public w t0(int i10, boolean z10) {
        w[] wVarArr = this.N;
        if (wVarArr == null || wVarArr.length <= i10) {
            w[] wVarArr2 = new w[(i10 + 1)];
            if (wVarArr != null) {
                System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
            }
            this.N = wVarArr2;
            wVarArr = wVarArr2;
        }
        w wVar = wVarArr[i10];
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(i10);
        wVarArr[i10] = wVar2;
        return wVar2;
    }

    public void u() {
        if (N0() != null && !s().l()) {
            A0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence u0() {
        Object obj = this.f866k;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f873r;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback v0() {
        return this.f868m.getCallback();
    }

    public void x(Configuration configuration) {
        a s10;
        if (this.H && this.B && (s10 = s()) != null) {
            s10.n(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f867l);
        this.T = new Configuration(this.f867l.getResources().getConfiguration());
        S(false, false);
    }

    public void y(Bundle bundle) {
        this.Q = true;
        R(false);
        l0();
        Object obj = this.f866k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a N0 = N0();
                if (N0 == null) {
                    this.f859d0 = true;
                } else {
                    N0.t(true);
                }
            }
            g.d(this);
        }
        this.T = new Configuration(this.f867l.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f866k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.g.F(r3)
        L_0x0009:
            boolean r0 = r3.f856a0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f868m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f858c0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.S = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f866k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = f850k0
            java.lang.Object r1 = r3.f866k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = f850k0
            java.lang.Object r1 = r3.f866k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f871p
            if (r0 == 0) goto L_0x005b
            r0.o()
        L_0x005b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    h(Dialog dialog, e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f850k0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.e r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f881z = r0
            r0 = 1
            r2.A = r0
            r0 = -100
            r2.U = r0
            androidx.appcompat.app.h$b r1 = new androidx.appcompat.app.h$b
            r1.<init>()
            r2.f858c0 = r1
            r2.f867l = r3
            r2.f870o = r5
            r2.f866k = r6
            int r3 = r2.U
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.d r3 = r2.Z0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.g r3 = r3.getDelegate()
            int r3 = r3.o()
            r2.U = r3
        L_0x0032:
            int r3 = r2.U
            if (r3 != r0) goto L_0x0059
            androidx.collection.g<java.lang.String, java.lang.Integer> r3 = f850k0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.U = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.V(r4)
        L_0x005e:
            androidx.appcompat.widget.j.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.e, java.lang.Object):void");
    }

    /* compiled from: AppCompatDelegateImpl */
    class q extends androidx.appcompat.view.i {

        /* renamed from: b  reason: collision with root package name */
        private i f895b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f896c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f897d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f898f;

        q(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f897d = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f897d = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f897d = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback) {
            try {
                this.f896c = true;
                callback.onContentChanged();
                this.f896c = false;
            } catch (Throwable th) {
                this.f896c = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f898f = true;
                callback.onPanelClosed(i10, menu);
                this.f898f = false;
            } catch (Throwable th) {
                this.f898f = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f897d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar) {
            this.f895b = iVar;
        }

        /* access modifiers changed from: package-private */
        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f867l, callback);
            androidx.appcompat.view.b P = h.this.P(aVar);
            if (P != null) {
                return aVar.e(P);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f896c) {
                a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            i iVar = this.f895b;
            if (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i10)) == null) {
                return super.onCreatePanelView(i10);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.J0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            if (this.f898f) {
                a().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            h.this.K0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            boolean z10 = true;
            if (gVar != null) {
                gVar.b0(true);
            }
            i iVar = this.f895b;
            if (iVar == null || !iVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.b0(false);
            }
            return z10;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            w t02 = h.this.t0(0, true);
            if (t02 == null || (gVar = t02.f917j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (h.this.B0()) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (!h.this.B0() || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            return f(callback);
        }
    }
}
