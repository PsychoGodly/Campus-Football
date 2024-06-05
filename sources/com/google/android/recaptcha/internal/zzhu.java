package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzhu {
    private static final zzht zza;
    private static final zzht zzb = new zzht();

    static {
        zzht zzht;
        try {
            zzht = (zzht) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzht = null;
        }
        zza = zzht;
    }

    static zzht zza() {
        return zza;
    }

    static zzht zzb() {
        return zzb;
    }
}
