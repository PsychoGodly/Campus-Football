package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzacl {
    final zzact zza;
    private final String zzb;

    public zzacl(String str, zzact zzact) {
        this.zzb = str;
        this.zza = zzact;
    }

    /* access modifiers changed from: package-private */
    public final String zza(String str, String str2) {
        String str3 = this.zzb;
        return str3 + str + "?key=" + str2;
    }
}
