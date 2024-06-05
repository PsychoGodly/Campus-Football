package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgqb {
    private static final zzgpz zza = new zzgqa();
    private static final zzgpz zzb;

    static {
        zzgpz zzgpz;
        try {
            zzgpz = (zzgpz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgpz = null;
        }
        zzb = zzgpz;
    }

    static zzgpz zza() {
        zzgpz zzgpz = zzb;
        if (zzgpz != null) {
            return zzgpz;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgpz zzb() {
        return zza;
    }
}
