package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsc {
    private static final zzgsb zza;
    private static final zzgsb zzb = new zzgsb();

    static {
        zzgsb zzgsb;
        try {
            zzgsb = (zzgsb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgsb = null;
        }
        zza = zzgsb;
    }

    static zzgsb zza() {
        return zza;
    }

    static zzgsb zzb() {
        return zzb;
    }
}
