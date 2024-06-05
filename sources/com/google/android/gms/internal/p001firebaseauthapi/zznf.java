package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznf extends zzch {
    private final zzor zza;

    public zznf(zzor zzor) {
        this.zza = zzor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznf)) {
            return false;
        }
        zzor zzor = ((zznf) obj).zza;
        if (!this.zza.zza().zzd().equals(zzor.zza().zzd()) || !this.zza.zza().zzf().equals(zzor.zza().zzf()) || !this.zza.zza().zze().equals(zzor.zza().zze())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza.zza(), this.zza.zzb()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zzni.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final boolean zza() {
        return this.zza.zza().zzd() != zzvs.RAW;
    }

    public final zzor zzb() {
        return this.zza;
    }
}
