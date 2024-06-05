package com.unity3d.ads.core.domain;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import com.google.protobuf.i;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.m;
import ne.c;

/* compiled from: GetAndroidOpenGLRendererInfo.kt */
public final class GetAndroidOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public GetAndroidOpenGLRendererInfo(SessionRepository sessionRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        this.sessionRepository = sessionRepository2;
    }

    public i invoke() {
        if (this.sessionRepository.getFeatureFlags().h0()) {
            EglCore eglCore = new EglCore((EGLContext) null, 2);
            OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            String glGetString = GLES20.glGetString(7937);
            m.d(glGetString, "renderer");
            byte[] bytes = glGetString.getBytes(c.f36517g);
            m.d(bytes, "this as java.lang.String).getBytes(charset)");
            i o10 = i.o(bytes);
            offscreenSurface.release();
            eglCore.release();
            m.d(o10, "{\n            // We need…dererByteString\n        }");
            return o10;
        }
        i w10 = i.w();
        m.d(w10, "{\n            ByteString.empty()\n        }");
        return w10;
    }
}
