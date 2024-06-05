package io.flutter.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import io.flutter.embedding.android.s;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.editing.f;
import io.flutter.view.f;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import kc.i;
import kc.n;
import lc.c;
import nc.a;

@Deprecated
/* compiled from: FlutterView */
public class e extends SurfaceView implements c, f, a.c, s.e {

    /* renamed from: a  reason: collision with root package name */
    private final zb.a f34647a;

    /* renamed from: b  reason: collision with root package name */
    private final i f34648b;

    /* renamed from: c  reason: collision with root package name */
    private final n f34649c;

    /* renamed from: d  reason: collision with root package name */
    private final f f34650d;

    /* renamed from: f  reason: collision with root package name */
    private final mc.a f34651f;

    /* renamed from: g  reason: collision with root package name */
    private final s f34652g;

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.embedding.android.a f34653h;

    /* renamed from: i  reason: collision with root package name */
    private c f34654i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicLong f34655j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public d f34656k;

    /* compiled from: FlutterView */
    final class a implements f.c {

        /* renamed from: a  reason: collision with root package name */
        private final long f34657a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f34658b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f34659c;

        /* renamed from: d  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f34660d = new C0394a();

        /* renamed from: io.flutter.view.e$a$a  reason: collision with other inner class name */
        /* compiled from: FlutterView */
        class C0394a implements SurfaceTexture.OnFrameAvailableListener {
            C0394a() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!a.this.f34659c) {
                    d unused = e.this.f34656k;
                }
            }
        }

        a(long j10, SurfaceTexture surfaceTexture) {
            this.f34657a = j10;
            this.f34658b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                b().setOnFrameAvailableListener(this.f34660d, new Handler());
            } else {
                b().setOnFrameAvailableListener(this.f34660d);
            }
        }

        public /* synthetic */ void a(f.b bVar) {
            g.b(this, bVar);
        }

        public SurfaceTexture b() {
            return this.f34658b.surfaceTexture();
        }

        public long c() {
            return this.f34657a;
        }

        public /* synthetic */ void d(f.a aVar) {
            g.a(this, aVar);
        }

        public void release() {
            if (!this.f34659c) {
                this.f34659c = true;
                b().setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                this.f34658b.release();
                d unused = e.this.f34656k;
                throw null;
            }
        }
    }

    /* compiled from: FlutterView */
    private enum b {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private b m() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return b.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? b.LEFT : b.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return b.BOTH;
            }
        }
        return b.NONE;
    }

    private boolean n() {
        return false;
    }

    private void p() {
        c cVar = this.f34654i;
        if (cVar != null) {
            cVar.Q();
            this.f34654i = null;
        }
    }

    private void q() {
        n.b bVar;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            bVar = n.b.dark;
        } else {
            bVar = n.b.light;
        }
        this.f34649c.a().e(getResources().getConfiguration().fontScale).f(DateFormat.is24HourFormat(getContext())).d(bVar).a();
    }

    public c.C0412c a(c.d dVar) {
        return null;
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f34650d.j(sparseArray);
    }

    public /* synthetic */ c.C0412c b() {
        return lc.b.a(this);
    }

    public PointerIcon c(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public boolean checkInputConnectionProxy(View view) {
        throw null;
    }

    public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
        if (!n()) {
            xb.b.a("FlutterView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        throw null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        xb.b.b("FlutterView", "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!n() || !this.f34652g.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void e(String str, c.a aVar, c.C0412c cVar) {
        throw null;
    }

    public void f(String str, ByteBuffer byteBuffer) {
        d(str, byteBuffer, (c.b) null);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        int i10 = rect.top;
        throw null;
    }

    public void g(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        c cVar = this.f34654i;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.f34654i;
    }

    public c getBinaryMessenger() {
        return this;
    }

    public Bitmap getBitmap() {
        l();
        throw null;
    }

    public zb.a getDartExecutor() {
        return this.f34647a;
    }

    /* access modifiers changed from: package-private */
    public float getDevicePixelRatio() {
        throw null;
    }

    public d getFlutterNativeView() {
        return this.f34656k;
    }

    public yb.a getPluginRegistry() {
        throw null;
    }

    public f.c h() {
        return o(new SurfaceTexture(0));
    }

    public void i(String str, c.a aVar) {
        throw null;
    }

    public boolean j(KeyEvent keyEvent) {
        return this.f34650d.r(keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (!n()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    public f.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        new a(this.f34655j.getAndIncrement(), surfaceTexture);
        throw null;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 29) {
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
                int i12 = windowInsets.getInsets(i11).top;
                throw null;
            }
            b bVar = b.NONE;
            if (!z10) {
                m();
            }
            if (z11) {
                windowInsets.getSystemWindowInsetTop();
            }
            throw null;
        }
        int i13 = windowInsets.getSystemGestureInsets().top;
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPluginRegistry();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f34651f.d(configuration);
        q();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f34650d.o(this, this.f34652g, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (n() && this.f34653h.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!n()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f34654i.J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f34650d.A(viewStructure, i10);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f34653h.f(motionEvent);
    }

    public void setInitialRoute(String str) {
        this.f34648b.c(str);
    }
}
