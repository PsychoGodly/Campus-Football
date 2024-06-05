package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.m;

/* compiled from: EglSurfaceBase.kt */
public class EglSurfaceBase {
    private EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    private EglCore mEglCore;
    private int mHeight = -1;
    private int mWidth = -1;

    protected EglSurfaceBase(EglCore eglCore) {
        m.e(eglCore, "eglCore");
        this.mEglCore = eglCore;
    }

    public final void createOffscreenSurface(int i10, int i11) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i10, i11);
            this.mWidth = i10;
            this.mHeight = i11;
            return;
        }
        throw new IllegalStateException("surface already created".toString());
    }

    public final void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public final void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }
}
