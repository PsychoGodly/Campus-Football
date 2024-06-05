package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaej  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaej extends zzafy {
    private String zza;
    private String zzb;
    private String zzc;
    private zzaey zzd;
    private String zze;

    zzaej() {
    }

    public final zzafy zza(String str) {
        Objects.requireNonNull(str, "Null idToken");
        this.zze = str;
        return this;
    }

    public final zzafy zzb(String str) {
        Objects.requireNonNull(str, "Null providerId");
        this.zza = str;
        return this;
    }

    public final zzafy zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzafy zzd(String str) {
        Objects.requireNonNull(str, "Null token");
        this.zzc = str;
        return this;
    }

    public final zzafy zza(zzaey zzaey) {
        Objects.requireNonNull(zzaey, "Null tokenType");
        this.zzd = zzaey;
        return this;
    }

    public final zzafz zza() {
        String str;
        zzaey zzaey;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzaey = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzaeg(str3, this.zzb, str, zzaey, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        String valueOf = String.valueOf(sb2);
        throw new IllegalStateException("Missing required properties:" + valueOf);
    }
}
