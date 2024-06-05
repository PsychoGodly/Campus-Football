package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzzl implements zzzn {
    public static final /* synthetic */ zzzl zza = new zzzl();

    private /* synthetic */ zzzl() {
    }

    public final Constructor zza() {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzu.class).getConstructor(new Class[]{Integer.TYPE});
    }
}
