package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzear {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);
    
    private final String zze;

    private zzear(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
