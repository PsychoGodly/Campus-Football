package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.h;

/* compiled from: EglCore.kt */
public final class EglCore {
    public static final Companion Companion = new Companion((h) null);
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private int glVersion;
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;

    /* compiled from: EglCore.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public EglCore() {
        this((EGLContext) null, 0, 3, (h) null);
    }

    public EglCore(EGLContext eGLContext, int i10) {
        EGLConfig config;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLDisplay = eGLDisplay;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.glVersion = -1;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.mEGLDisplay = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    if (!((i10 & 2) == 0 || (config = getConfig(i10, 3)) == null)) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, config, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.mEGLConfig = config;
                            this.mEGLContext = eglCreateContext;
                            this.glVersion = 3;
                        }
                    }
                    if (this.mEGLContext == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig config2 = getConfig(i10, 2);
                        if (config2 != null) {
                            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.mEGLDisplay, config2, eGLContext, new int[]{12440, 2, 12344}, 0);
                            checkEglError("eglCreateContext");
                            this.mEGLConfig = config2;
                            this.mEGLContext = eglCreateContext2;
                            this.glVersion = 2;
                        } else {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                    }
                    EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 12440, new int[1], 0);
                    return;
                }
                this.mEGLDisplay = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
        throw new RuntimeException("EGL already set up");
    }

    private final void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    private final EGLConfig getConfig(int i10, int i11) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i11 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i10 & 1) != 0) {
            iArr[10] = EGL_RECORDABLE_ANDROID;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    public final EGLSurface createOffscreenSurface(int i10, int i11) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        checkEglError("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            release();
        }
    }

    public final int getGlVersion() {
        return this.glVersion;
    }

    public final void makeCurrent(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void release() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public final boolean releaseSurface(EGLSurface eGLSurface) {
        return EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public final void setGlVersion(int i10) {
        this.glVersion = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EglCore(EGLContext eGLContext, int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? null : eGLContext, (i11 & 2) != 0 ? 0 : i10);
    }
}
