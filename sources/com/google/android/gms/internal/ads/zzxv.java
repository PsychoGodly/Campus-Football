package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzxv extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzxt zzd;
    private boolean zze;

    /* synthetic */ zzxv(zzxt zzxt, SurfaceTexture surfaceTexture, boolean z10, zzxu zzxu) {
        super(surfaceTexture);
        this.zzd = zzxt;
        this.zza = z10;
    }

    public static zzxv zza(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdl.zzf(z11);
        zzxt zzxt = new zzxt();
        if (z10) {
            i10 = zzb;
        }
        return zzxt.zza(i10);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        synchronized (zzxv.class) {
            if (!zzc) {
                int i11 = zzew.zza;
                int i12 = 2;
                if (i11 >= 24) {
                    if (i11 < 26) {
                        if (!"samsung".equals(zzew.zzc)) {
                            if ("XT1650".equals(zzew.zzd)) {
                            }
                        }
                    }
                    if (i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i12 = 1;
                            }
                            zzb = i12;
                            zzc = true;
                        }
                    }
                }
                i12 = 0;
                zzb = i12;
                zzc = true;
            }
            i10 = zzb;
        }
        return i10 != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
