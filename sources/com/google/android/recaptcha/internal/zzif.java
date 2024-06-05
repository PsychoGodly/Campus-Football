package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzif {
    private static final zzie zza;
    private static final zzie zzb = new zzie();

    static {
        zzie zzie;
        try {
            zzie = (zzie) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzie = null;
        }
        zza = zzie;
    }

    static zzie zza() {
        return zza;
    }

    static zzie zzb() {
        return zzb;
    }
}
