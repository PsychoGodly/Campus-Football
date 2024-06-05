package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaki  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaki {
    private static final zzakg zza = zzc();
    private static final zzakg zzb = new zzakj();

    static zzakg zza() {
        return zza;
    }

    static zzakg zzb() {
        return zzb;
    }

    private static zzakg zzc() {
        try {
            return (zzakg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
