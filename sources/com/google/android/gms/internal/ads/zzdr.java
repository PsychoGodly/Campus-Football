package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdr implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] zza = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler zzb;
    private final int[] zzc = new int[1];
    private EGLDisplay zzd;
    private EGLContext zze;
    private EGLSurface zzf;
    private SurfaceTexture zzg;

    public zzdr(Handler handler, zzdq zzdq) {
        this.zzb = handler;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzb.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.zzg;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final SurfaceTexture zza() {
        SurfaceTexture surfaceTexture = this.zzg;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    public final void zzb(int i10) throws zzds {
        EGLSurface eGLSurface;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        zzdt.zza(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr2 = new int[2];
        zzdt.zza(EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1), "eglInitialize failed");
        this.zzd = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, zza, 0, eGLConfigArr, 0, 1, iArr3, 0);
        zzdt.zza(eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null, zzew.zzI("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.zzd, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        zzdt.zza(eglCreateContext != null, "eglCreateContext failed");
        this.zze = eglCreateContext;
        EGLDisplay eGLDisplay = this.zzd;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            zzdt.zza(eGLSurface != null, "eglCreatePbufferSurface failed");
        }
        zzdt.zza(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext), "eglMakeCurrent failed");
        this.zzf = eGLSurface;
        GLES20.glGenTextures(1, this.zzc, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append(10);
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (!z10) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.zzc[0]);
            this.zzg = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new zzds(sb2.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void zzc() {
        this.zzb.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.zzg;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.zzc, 0);
            }
            EGLDisplay eGLDisplay = this.zzd;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.zzd;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.zzf;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            EGLContext eGLContext = this.zze;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.zzd, eGLContext);
            }
            int i10 = zzew.zza;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.zzd;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.zzd;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.zzd;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.zzf;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            EGLContext eGLContext2 = this.zze;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.zzd, eGLContext2);
            }
            int i11 = zzew.zza;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.zzd;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            throw th;
        }
    }
}
