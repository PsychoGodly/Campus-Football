package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import bd.h;
import io.flutter.view.f;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PlatformViewWrapper */
class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f33709a;

    /* renamed from: b  reason: collision with root package name */
    private int f33710b;

    /* renamed from: c  reason: collision with root package name */
    private int f33711c;

    /* renamed from: d  reason: collision with root package name */
    private int f33712d;

    /* renamed from: f  reason: collision with root package name */
    private int f33713f;

    /* renamed from: g  reason: collision with root package name */
    private int f33714g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f33715h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f33716i;

    /* renamed from: j  reason: collision with root package name */
    private io.flutter.embedding.android.a f33717j;

    /* renamed from: k  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f33718k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final AtomicLong f33719l;

    /* renamed from: m  reason: collision with root package name */
    private final f.a f33720m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f33721n;

    /* renamed from: o  reason: collision with root package name */
    private final f.b f33722o;

    /* compiled from: PlatformViewWrapper */
    class a implements f.a {
        a() {
        }

        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                j.this.f33719l.decrementAndGet();
            }
        }
    }

    /* compiled from: PlatformViewWrapper */
    class b implements f.b {
        b() {
        }

        public void onTrimMemory(int i10) {
            if (i10 == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = j.this.f33721n = true;
            }
        }
    }

    /* compiled from: PlatformViewWrapper */
    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f33725a;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f33725a = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f33725a;
            j jVar = j.this;
            onFocusChangeListener.onFocusChange(jVar, h.d(jVar));
        }
    }

    public j(Context context) {
        super(context);
        this.f33719l = new AtomicLong(0);
        this.f33720m = new a();
        this.f33721n = false;
        this.f33722o = new b();
        setWillNotDraw(false);
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f33719l.incrementAndGet();
        }
    }

    private void g() {
        if (this.f33721n) {
            Surface surface = this.f33716i;
            if (surface != null) {
                surface.release();
            }
            this.f33716i = c(this.f33715h);
            this.f33721n = false;
        }
    }

    private boolean n() {
        if (Build.VERSION.SDK_INT != 29 || this.f33719l.get() <= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f33714g;
    }

    public void draw(Canvas canvas) {
        Surface surface = this.f33716i;
        if (surface == null) {
            super.draw(canvas);
            xb.b.b("PlatformViewWrapper", "Platform view cannot be composed without a surface.");
        } else if (!surface.isValid()) {
            xb.b.b("PlatformViewWrapper", "Invalid surface. The platform view cannot be displayed.");
        } else {
            SurfaceTexture surfaceTexture = this.f33715h;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                xb.b.b("PlatformViewWrapper", "Invalid texture. The platform view cannot be displayed.");
            } else if (!n()) {
                invalidate();
            } else {
                g();
                Canvas lockHardwareCanvas = this.f33716i.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                } finally {
                    this.f33716i.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
    }

    public int e() {
        return this.f33713f;
    }

    public void h() {
        this.f33715h = null;
        Surface surface = this.f33716i;
        if (surface != null) {
            surface.release();
            this.f33716i = null;
        }
    }

    public void i(int i10, int i11) {
        this.f33713f = i10;
        this.f33714g = i11;
        SurfaceTexture surfaceTexture = this.f33715h;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f33711c = layoutParams.leftMargin;
        this.f33712d = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f33718k == null) {
            c cVar = new c(onFocusChangeListener);
            this.f33718k = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    public void l(SurfaceTexture surfaceTexture) {
        int i10;
        if (Build.VERSION.SDK_INT < 23) {
            xb.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f33715h = surfaceTexture;
        int i11 = this.f33713f;
        if (i11 > 0 && (i10 = this.f33714g) > 0) {
            surfaceTexture.setDefaultBufferSize(i11, i10);
        }
        Surface surface = this.f33716i;
        if (surface != null) {
            surface.release();
        }
        Surface c10 = c(surfaceTexture);
        this.f33716i = c10;
        Canvas lockHardwareCanvas = c10.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f33716i.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f33717j = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f33718k) != null) {
            this.f33718k = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33717j == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.f33711c;
            this.f33709a = i10;
            int i11 = this.f33712d;
            this.f33710b = i11;
            matrix.postTranslate((float) i10, (float) i11);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f33711c, (float) this.f33712d);
        } else {
            matrix.postTranslate((float) this.f33709a, (float) this.f33710b);
            this.f33709a = this.f33711c;
            this.f33710b = this.f33712d;
        }
        return this.f33717j.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public j(Context context, f.c cVar) {
        this(context);
        cVar.d(this.f33720m);
        cVar.a(this.f33722o);
        l(cVar.b());
    }
}
