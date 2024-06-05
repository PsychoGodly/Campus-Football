package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaeh extends zzafu {
    private final String zza;
    private final String zzb;

    zzaeh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzafu) {
            zzafu zzafu = (zzafu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzafu.zzb()) : zzafu.zzb() == null) {
                String str2 = this.zzb;
                return str2 != null ? str2.equals(zzafu.zza()) : zzafu.zza() == null;
            }
        }
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "RecaptchaEnforcementState{provider=" + str + ", enforcementState=" + str2 + "}";
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zza;
    }
}
