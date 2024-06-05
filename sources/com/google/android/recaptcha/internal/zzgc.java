package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzgc {
    private static final zzga zza = new zzgb();
    private static final zzga zzb;

    static {
        zzga zzga;
        try {
            zzga = (zzga) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzga = null;
        }
        zzb = zzga;
    }

    static zzga zza() {
        zzga zzga = zzb;
        if (zzga != null) {
            return zzga;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzga zzb() {
        return zza;
    }
}
