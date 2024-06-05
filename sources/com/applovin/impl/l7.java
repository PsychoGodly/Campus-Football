package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class l7 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f9200h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f9201a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9202b;

    /* renamed from: c  reason: collision with root package name */
    private EGLDisplay f9203c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f9204d;

    /* renamed from: f  reason: collision with root package name */
    private EGLSurface f9205f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceTexture f9206g;

    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    public interface c {
    }

    public l7(Handler handler) {
        this(handler, (c) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9200h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new b(yp.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private void a() {
    }

    private static EGLDisplay b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public SurfaceTexture c() {
        return (SurfaceTexture) a1.a((Object) this.f9206g);
    }

    public void d() {
        this.f9201a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9206g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9202b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9203c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9203c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9205f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9203c, this.f9205f);
            }
            EGLContext eGLContext = this.f9204d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9203c, eGLContext);
            }
            if (yp.f13662a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f9203c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f9203c);
            }
            this.f9203c = null;
            this.f9204d = null;
            this.f9205f = null;
            this.f9206g = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9201a.post(this);
    }

    public void run() {
        a();
        SurfaceTexture surfaceTexture = this.f9206g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public l7(Handler handler, c cVar) {
        this.f9201a = handler;
        this.f9202b = new int[1];
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        int[] iArr;
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
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        z9.a();
    }

    public void a(int i10) {
        EGLDisplay b10 = b();
        this.f9203c = b10;
        EGLConfig a10 = a(b10);
        EGLContext a11 = a(this.f9203c, a10, i10);
        this.f9204d = a11;
        this.f9205f = a(this.f9203c, a10, a11, i10);
        a(this.f9202b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9202b[0]);
        this.f9206g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
