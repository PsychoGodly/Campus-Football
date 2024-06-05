package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import jc.c;

/* compiled from: FlutterSurfaceView */
public class h extends SurfaceView implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33422a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f33423b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33424c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f33425d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public jc.a f33426f;

    /* renamed from: g  reason: collision with root package name */
    private final SurfaceHolder.Callback f33427g;

    /* renamed from: h  reason: collision with root package name */
    private final jc.b f33428h;

    /* compiled from: FlutterSurfaceView */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            xb.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f33425d) {
                h.this.i(i11, i12);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            xb.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = h.this.f33423b = true;
            if (h.this.f33425d) {
                h.this.j();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            xb.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = h.this.f33423b = false;
            if (h.this.f33425d) {
                h.this.k();
            }
        }
    }

    /* compiled from: FlutterSurfaceView */
    class b implements jc.b {
        b() {
        }

        public void b() {
        }

        public void d() {
            xb.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f33426f != null) {
                h.this.f33426f.q(this);
            }
        }
    }

    public h(Context context, boolean z10) {
        this(context, (AttributeSet) null, z10);
    }

    /* access modifiers changed from: private */
    public void i(int i10, int i11) {
        if (this.f33426f != null) {
            xb.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
            this.f33426f.w(i10, i11);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void j() {
        if (this.f33426f == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f33426f.u(getHolder().getSurface(), this.f33424c);
    }

    /* access modifiers changed from: private */
    public void k() {
        jc.a aVar = this.f33426f;
        if (aVar != null) {
            aVar.v();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void l() {
        if (this.f33422a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f33427g);
        setAlpha(0.0f);
    }

    public void a(jc.a aVar) {
        xb.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f33426f != null) {
            xb.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f33426f.v();
            this.f33426f.q(this.f33428h);
        }
        this.f33426f = aVar;
        this.f33425d = true;
        aVar.f(this.f33428h);
        if (this.f33423b) {
            xb.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            j();
        }
        this.f33424c = false;
    }

    public void b() {
        if (this.f33426f != null) {
            if (getWindowToken() != null) {
                xb.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                k();
            }
            setAlpha(0.0f);
            this.f33426f.q(this.f33428h);
            this.f33426f = null;
            this.f33425d = false;
            return;
        }
        xb.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public jc.a getAttachedRenderer() {
        return this.f33426f;
    }

    public void pause() {
        if (this.f33426f != null) {
            this.f33426f = null;
            this.f33424c = true;
            this.f33425d = false;
            return;
        }
        xb.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    private h(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.f33423b = false;
        this.f33424c = false;
        this.f33425d = false;
        this.f33427g = new a();
        this.f33428h = new b();
        this.f33422a = z10;
        l();
    }
}
