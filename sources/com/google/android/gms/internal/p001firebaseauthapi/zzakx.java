package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakx {
    private static final zzakv zza = zzc();
    private static final zzakv zzb = new zzaku();

    static zzakv zza() {
        return zza;
    }

    static zzakv zzb() {
        return zzb;
    }

    private static zzakv zzc() {
        try {
            return (zzakv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
