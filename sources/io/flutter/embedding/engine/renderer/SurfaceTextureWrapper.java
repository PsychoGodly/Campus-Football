package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public class SurfaceTextureWrapper {
    private boolean attached;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture2) {
        this(surfaceTexture2, (Runnable) null);
    }

    public void attachToGLContext(int i10) {
        synchronized (this) {
            if (!this.released) {
                if (this.attached) {
                    this.surfaceTexture.detachFromGLContext();
                }
                this.surfaceTexture.attachToGLContext(i10);
                this.attached = true;
            }
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            if (this.attached && !this.released) {
                this.surfaceTexture.detachFromGLContext();
                this.attached = false;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void release() {
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.release();
                this.released = true;
                this.attached = false;
            }
        }
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.updateTexImage();
                Runnable runnable = this.onFrameConsumed;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture2, Runnable runnable) {
        this.surfaceTexture = surfaceTexture2;
        this.released = false;
        this.onFrameConsumed = runnable;
    }
}
