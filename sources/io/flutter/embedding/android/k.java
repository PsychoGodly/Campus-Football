package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import bd.h;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jc.a;
import nc.a;

/* compiled from: FlutterView */
public class k extends FrameLayout implements a.c, s.e {

    /* renamed from: a  reason: collision with root package name */
    private h f33439a;

    /* renamed from: b  reason: collision with root package name */
    private i f33440b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public g f33441c;

    /* renamed from: d  reason: collision with root package name */
    jc.c f33442d;

    /* renamed from: f  reason: collision with root package name */
    private jc.c f33443f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Set<jc.b> f33444g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f33445h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public io.flutter.embedding.engine.a f33446i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<f> f33447j;

    /* renamed from: k  reason: collision with root package name */
    private nc.a f33448k;

    /* renamed from: l  reason: collision with root package name */
    private io.flutter.plugin.editing.f f33449l;

    /* renamed from: m  reason: collision with root package name */
    private io.flutter.plugin.editing.d f33450m;

    /* renamed from: n  reason: collision with root package name */
    private mc.a f33451n;

    /* renamed from: o  reason: collision with root package name */
    private s f33452o;

    /* renamed from: p  reason: collision with root package name */
    private a f33453p;

    /* renamed from: q  reason: collision with root package name */
    private io.flutter.view.c f33454q;

    /* renamed from: r  reason: collision with root package name */
    private TextServicesManager f33455r;

    /* renamed from: s  reason: collision with root package name */
    private z f33456s;

    /* renamed from: t  reason: collision with root package name */
    private final a.g f33457t;

    /* renamed from: u  reason: collision with root package name */
    private final c.k f33458u;

    /* renamed from: v  reason: collision with root package name */
    private final ContentObserver f33459v;

    /* renamed from: w  reason: collision with root package name */
    private final jc.b f33460w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.core.util.a<WindowLayoutInfo> f33461x;

    /* compiled from: FlutterView */
    class a implements c.k {
        a() {
        }

        public void a(boolean z10, boolean z11) {
            k.this.C(z10, z11);
        }
    }

    /* compiled from: FlutterView */
    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            super.onChange(z10);
            if (k.this.f33446i != null) {
                xb.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                k.this.E();
            }
        }
    }

    /* compiled from: FlutterView */
    class c implements jc.b {
        c() {
        }

        public void b() {
            boolean unused = k.this.f33445h = false;
            for (jc.b b10 : k.this.f33444g) {
                b10.b();
            }
        }

        public void d() {
            boolean unused = k.this.f33445h = true;
            for (jc.b d10 : k.this.f33444g) {
                d10.d();
            }
        }
    }

    /* compiled from: FlutterView */
    class d implements androidx.core.util.a<WindowLayoutInfo> {
        d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* compiled from: FlutterView */
    class e implements jc.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ jc.a f33466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f33467b;

        e(jc.a aVar, Runnable runnable) {
            this.f33466a = aVar;
            this.f33467b = runnable;
        }

        public void b() {
        }

        public void d() {
            this.f33466a.q(this);
            this.f33467b.run();
            k kVar = k.this;
            if (!(kVar.f33442d instanceof g) && kVar.f33441c != null) {
                k.this.f33441c.b();
                k.this.z();
            }
        }
    }

    /* compiled from: FlutterView */
    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    /* compiled from: FlutterView */
    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    /* access modifiers changed from: private */
    public void C(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.f33446i.r().l()) {
            if (!z10 && !z11) {
                z12 = true;
            }
            setWillNotDraw(z12);
            return;
        }
        setWillNotDraw(false);
    }

    private void F() {
        if (!x()) {
            xb.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f33457t.f35754a = getResources().getDisplayMetrics().density;
        this.f33457t.f35769p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f33446i.r().t(this.f33457t);
    }

    private g p() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    private int u(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void w() {
        xb.b.f("FlutterView", "Initializing FlutterView");
        if (this.f33439a != null) {
            xb.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f33439a);
        } else if (this.f33440b != null) {
            xb.b.f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f33440b);
        } else {
            xb.b.f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f33441c);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        g gVar = this.f33441c;
        if (gVar != null) {
            gVar.e();
            removeView(this.f33441c);
            this.f33441c = null;
        }
    }

    public void A(f fVar) {
        this.f33447j.remove(fVar);
    }

    public void B(jc.b bVar) {
        this.f33444g.remove(bVar);
    }

    public void D(Runnable runnable) {
        if (this.f33441c == null) {
            xb.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        jc.c cVar = this.f33443f;
        if (cVar == null) {
            xb.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f33442d = cVar;
        this.f33443f = null;
        jc.a r10 = this.f33446i.r();
        if (this.f33446i == null || r10 == null) {
            this.f33441c.b();
            z();
            runnable.run();
            return;
        }
        this.f33442d.a(r10);
        r10.f(new e(r10, runnable));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            kc.n$b r0 = kc.n.b.dark
            goto L_0x001c
        L_0x001a:
            kc.n$b r0 = kc.n.b.light
        L_0x001c:
            android.view.textservice.TextServicesManager r3 = r6.f33455r
            if (r3 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x003e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = io.flutter.embedding.android.j.f33438a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f33455r
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            io.flutter.embedding.engine.a r4 = r6.f33446i
            kc.n r4 = r4.t()
            kc.n$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            kc.n$a r4 = r4.e(r5)
            kc.n$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L_0x006e
            r1 = 1
        L_0x006e:
            kc.n$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            kc.n$a r1 = r1.f(r2)
            kc.n$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.k.E():void");
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f33449l.j(sparseArray);
    }

    public PointerIcon c(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f33446i;
        if (aVar != null) {
            return aVar.p().H(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!x() || !this.f33452o.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        a.g gVar = this.f33457t;
        gVar.f35757d = rect.top;
        gVar.f35758e = rect.right;
        gVar.f35759f = 0;
        gVar.f35760g = rect.left;
        gVar.f35761h = 0;
        gVar.f35762i = 0;
        gVar.f35763j = rect.bottom;
        gVar.f35764k = 0;
        xb.b.f("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f33457t.f35757d + ", Left: " + this.f33457t.f35760g + ", Right: " + this.f33457t.f35758e + "\nKeyboard insets: Bottom: " + this.f33457t.f35763j + ", Left: " + this.f33457t.f35764k + ", Right: " + this.f33457t.f35762i);
        F();
        return true;
    }

    public void g(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.f33454q;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.f33454q;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f33446i;
    }

    public lc.c getBinaryMessenger() {
        return this.f33446i.j();
    }

    public g getCurrentImageSurface() {
        return this.f33441c;
    }

    public boolean j(KeyEvent keyEvent) {
        return this.f33449l.r(keyEvent);
    }

    public boolean k() {
        g gVar = this.f33441c;
        if (gVar != null) {
            return gVar.c();
        }
        return false;
    }

    public void l(f fVar) {
        this.f33447j.add(fVar);
    }

    public void m(jc.b bVar) {
        this.f33444g.add(bVar);
    }

    public void n(g gVar) {
        io.flutter.embedding.engine.a aVar = this.f33446i;
        if (aVar != null) {
            gVar.a(aVar.r());
        }
    }

    public void o(io.flutter.embedding.engine.a aVar) {
        xb.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (x()) {
            if (aVar == this.f33446i) {
                xb.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                xb.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                t();
            }
        }
        this.f33446i = aVar;
        jc.a r10 = aVar.r();
        this.f33445h = r10.k();
        this.f33442d.a(r10);
        r10.f(this.f33460w);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f33448k = new nc.a(this, this.f33446i.m());
        }
        this.f33449l = new io.flutter.plugin.editing.f(this, this.f33446i.w(), this.f33446i.p());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f33455r = textServicesManager;
            this.f33450m = new io.flutter.plugin.editing.d(textServicesManager, this.f33446i.u());
        } catch (Exception unused) {
            xb.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f33451n = this.f33446i.l();
        this.f33452o = new s(this);
        this.f33453p = new a(this.f33446i.r(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f33446i.p());
        this.f33454q = cVar;
        cVar.Y(this.f33458u);
        C(this.f33454q.C(), this.f33454q.D());
        this.f33446i.p().a(this.f33454q);
        this.f33446i.p().F(this.f33446i.r());
        this.f33449l.q().restartInput(this);
        E();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f33459v);
        F();
        aVar.p().G(this);
        for (f b10 : this.f33447j) {
            b10.b(aVar);
        }
        if (this.f33445h) {
            this.f33460w.d();
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.f33457t;
            gVar.f35765l = systemGestureInsets.top;
            gVar.f35766m = systemGestureInsets.right;
            gVar.f35767n = systemGestureInsets.bottom;
            gVar.f35768o = systemGestureInsets.left;
        }
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z10 = false;
        }
        if (i10 >= 30) {
            if (z10) {
                i11 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z11) {
                i11 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i11);
            a.g gVar2 = this.f33457t;
            gVar2.f35757d = insets.top;
            gVar2.f35758e = insets.right;
            gVar2.f35759f = insets.bottom;
            gVar2.f35760g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.f33457t;
            gVar3.f35761h = insets2.top;
            gVar3.f35762i = insets2.right;
            gVar3.f35763j = insets2.bottom;
            gVar3.f35764k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.f33457t;
            gVar4.f35765l = insets3.top;
            gVar4.f35766m = insets3.right;
            gVar4.f35767n = insets3.bottom;
            gVar4.f35768o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.f33457t;
                gVar5.f35757d = Math.max(Math.max(gVar5.f35757d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.f33457t;
                gVar6.f35758e = Math.max(Math.max(gVar6.f35758e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.f33457t;
                gVar7.f35759f = Math.max(Math.max(gVar7.f35759f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.f33457t;
                gVar8.f35760g = Math.max(Math.max(gVar8.f35760g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z10) {
                gVar9 = p();
            }
            this.f33457t.f35757d = z11 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f33457t.f35758e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f33457t.f35759f = (!z10 || u(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f33457t.f35760g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.f33457t;
            gVar10.f35761h = 0;
            gVar10.f35762i = 0;
            gVar10.f35763j = u(windowInsets);
            this.f33457t.f35764k = 0;
        }
        xb.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f33457t.f35757d + ", Left: " + this.f33457t.f35760g + ", Right: " + this.f33457t.f35758e + "\nKeyboard insets: Bottom: " + this.f33457t.f35763j + ", Left: " + this.f33457t.f35764k + ", Right: " + this.f33457t.f35762i + "System Gesture Insets - Left: " + this.f33457t.f35768o + ", Top: " + this.f33457t.f35765l + ", Right: " + this.f33457t.f35766m + ", Bottom: " + this.f33457t.f35763j);
        F();
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33456s = s();
        Activity f10 = h.f(getContext());
        z zVar = this.f33456s;
        if (zVar != null && f10 != null) {
            zVar.a(f10, androidx.core.content.a.getMainExecutor(getContext()), this.f33461x);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f33446i != null) {
            xb.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f33451n.d(configuration);
            E();
            h.c(getContext(), this.f33446i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!x()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.f33449l.o(this, this.f33452o, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        z zVar = this.f33456s;
        if (zVar != null) {
            zVar.b(this.f33461x);
        }
        this.f33456s = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (x() && this.f33453p.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!x()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f33454q.J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f33449l.A(viewStructure, i10);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        xb.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        a.g gVar = this.f33457t;
        gVar.f35755b = i10;
        gVar.f35756c = i11;
        F();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!x()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f33453p.f(motionEvent);
    }

    public void q() {
        this.f33442d.pause();
        g gVar = this.f33441c;
        if (gVar == null) {
            g r10 = r();
            this.f33441c = r10;
            addView(r10);
        } else {
            gVar.i(getWidth(), getHeight());
        }
        this.f33443f = this.f33442d;
        g gVar2 = this.f33441c;
        this.f33442d = gVar2;
        io.flutter.embedding.engine.a aVar = this.f33446i;
        if (aVar != null) {
            gVar2.a(aVar.r());
        }
    }

    public g r() {
        return new g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    /* access modifiers changed from: protected */
    public z s() {
        try {
            return new z(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        jc.c cVar = this.f33442d;
        if (cVar instanceof h) {
            ((h) cVar).setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        a.d dVar;
        a.c cVar;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            xb.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                if (foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL) {
                    dVar = a.d.HINGE;
                } else {
                    dVar = a.d.FOLD;
                }
                if (foldingFeature.getState() == FoldingFeature.State.FLAT) {
                    cVar = a.c.POSTURE_FLAT;
                } else if (foldingFeature.getState() == FoldingFeature.State.HALF_OPENED) {
                    cVar = a.c.POSTURE_HALF_OPENED;
                } else {
                    cVar = a.c.UNKNOWN;
                }
                arrayList.add(new a.b(next.getBounds(), dVar, cVar));
            } else {
                arrayList.add(new a.b(next.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : displayCutout.getBoundingRects()) {
                xb.b.f("FlutterView", "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new a.b(next2, a.d.CUTOUT));
            }
        }
        this.f33457t.f35770q = arrayList;
        F();
    }

    public void t() {
        xb.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f33446i);
        if (!x()) {
            xb.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f a10 : this.f33447j) {
            a10.a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f33459v);
        this.f33446i.p().Q();
        this.f33446i.p().d();
        this.f33454q.Q();
        this.f33454q = null;
        this.f33449l.q().restartInput(this);
        this.f33449l.p();
        this.f33452o.d();
        io.flutter.plugin.editing.d dVar = this.f33450m;
        if (dVar != null) {
            dVar.b();
        }
        nc.a aVar = this.f33448k;
        if (aVar != null) {
            aVar.c();
        }
        jc.a r10 = this.f33446i.r();
        this.f33445h = false;
        r10.q(this.f33460w);
        r10.v();
        r10.s(false);
        jc.c cVar = this.f33443f;
        if (cVar != null && this.f33442d == this.f33441c) {
            this.f33442d = cVar;
        }
        this.f33442d.b();
        z();
        this.f33443f = null;
        this.f33446i = null;
    }

    public boolean v() {
        return this.f33445h;
    }

    public boolean x() {
        io.flutter.embedding.engine.a aVar = this.f33446i;
        return aVar != null && aVar.r() == this.f33442d.getAttachedRenderer();
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f33444g = new HashSet();
        this.f33447j = new HashSet();
        this.f33457t = new a.g();
        this.f33458u = new a();
        this.f33459v = new b(new Handler(Looper.getMainLooper()));
        this.f33460w = new c();
        this.f33461x = new d();
        this.f33439a = hVar;
        this.f33442d = hVar;
        w();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f33444g = new HashSet();
        this.f33447j = new HashSet();
        this.f33457t = new a.g();
        this.f33458u = new a();
        this.f33459v = new b(new Handler(Looper.getMainLooper()));
        this.f33460w = new c();
        this.f33461x = new d();
        this.f33440b = iVar;
        this.f33442d = iVar;
        w();
    }
}
