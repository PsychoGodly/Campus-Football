package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaeg extends zzafz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzaey zzd;
    private final String zze;

    private zzaeg(String str, String str2, String str3, zzaey zzaey, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzaey;
        this.zze = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzafz
            r2 = 0
            if (r1 == 0) goto L_0x0051
            com.google.android.gms.internal.firebase-auth-api.zzafz r5 = (com.google.android.gms.internal.p001firebaseauthapi.zzafz) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.zze()
            if (r1 != 0) goto L_0x0051
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
        L_0x002c:
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzf()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            com.google.android.gms.internal.firebase-auth-api.zzaey r1 = r4.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaey r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.zze
            java.lang.String r5 = r5.zzc()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0051
            return r0
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaeg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        String str4 = this.zze;
        return "RevokeTokenRequest{providerId=" + str + ", tenantId=" + str2 + ", token=" + str3 + ", tokenType=" + valueOf + ", idToken=" + str4 + "}";
    }

    public final zzaey zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }
}
