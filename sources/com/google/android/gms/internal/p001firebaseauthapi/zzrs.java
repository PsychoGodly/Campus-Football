package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrs {
    private final zzbv zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    private zzrs(zzbv zzbv, int i10, String str, String str2) {
        this.zza = zzbv;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrs)) {
            return false;
        }
        zzrs zzrs = (zzrs) obj;
        if (this.zza != zzrs.zza || this.zzb != zzrs.zzb || !this.zzc.equals(zzrs.zzc) || !this.zzd.equals(zzrs.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zzb;
    }
}
