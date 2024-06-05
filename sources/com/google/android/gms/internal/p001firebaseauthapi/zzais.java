package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzais  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzais {
    private static final zzaiq<?> zza = new zzait();
    private static final zzaiq<?> zzb = zzc();

    static zzaiq<?> zza() {
        zzaiq<?> zzaiq = zzb;
        if (zzaiq != null) {
            return zzaiq;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzaiq<?> zzb() {
        return zza;
    }

    private static zzaiq<?> zzc() {
        try {
            return (zzaiq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
