package com.unity3d.ads.gl;

import kotlin.jvm.internal.m;

/* compiled from: OffscreenSurface.kt */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i10, int i11) {
        super(eglCore);
        m.e(eglCore, "eglCore");
        createOffscreenSurface(i10, i11);
    }

    public final void release() {
        releaseEglSurface();
    }
}
