package k4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import k4.m;

/* compiled from: EGLSurfaceTexture */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f19720i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19721a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f19722b;

    /* renamed from: c  reason: collision with root package name */
    private final a f19723c;

    /* renamed from: d  reason: collision with root package name */
    private EGLDisplay f19724d;

    /* renamed from: f  reason: collision with root package name */
    private EGLContext f19725f;

    /* renamed from: g  reason: collision with root package name */
    private EGLSurface f19726g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f19727h;

    /* compiled from: EGLSurfaceTexture */
    public interface a {
        void a();
    }

    public j(Handler handler) {
        this(handler, (a) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws m.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f19720i, 0, eGLConfigArr, 0, 1, iArr, 0);
        m.b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, n0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws m.a {
        boolean z10 = false;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z10 = true;
        }
        m.b(z10, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws m.a {
        EGLSurface eGLSurface;
        int[] iArr;
        boolean z10 = true;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                z10 = false;
            }
            m.b(z10, "eglCreatePbufferSurface failed");
        }
        m.b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurface;
    }

    private void d() {
        a aVar = this.f19723c;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void e(int[] iArr) throws m.a {
        GLES20.glGenTextures(1, iArr, 0);
        m.a();
    }

    private static EGLDisplay f() throws m.a {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        m.b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        m.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) a.e(this.f19727h);
    }

    public void h(int i10) throws m.a {
        EGLDisplay f10 = f();
        this.f19724d = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f19724d, a10, i10);
        this.f19725f = b10;
        this.f19726g = c(this.f19724d, a10, b10, i10);
        e(this.f19722b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f19722b[0]);
        this.f19727h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f19721a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f19727h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f19722b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f19724d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f19724d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f19726g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f19724d, this.f19726g);
            }
            EGLContext eGLContext = this.f19725f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f19724d, eGLContext);
            }
            if (n0.f19738a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f19724d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f19724d);
            }
            this.f19724d = null;
            this.f19725f = null;
            this.f19726g = null;
            this.f19727h = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19721a.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f19727h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public j(Handler handler, a aVar) {
        this.f19721a = handler;
        this.f19723c = aVar;
        this.f19722b = new int[1];
    }
}
