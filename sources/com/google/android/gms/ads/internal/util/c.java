package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14782a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f14783b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean f() {
        return this.f14783b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f14783b;
    }

    public final synchronized void c(boolean z10) {
        this.f14782a = z10;
    }

    public final synchronized void d(float f10) {
        this.f14783b = f10;
    }

    public final synchronized boolean e() {
        return this.f14782a;
    }
}
