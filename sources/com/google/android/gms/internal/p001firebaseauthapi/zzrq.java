package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrq {
    private final zzrn zza;
    private final List<zzrs> zzb;
    private final Integer zzc;

    private zzrq(zzrn zzrn, List<zzrs> list, Integer num) {
        this.zza = zzrn;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrq)) {
            return false;
        }
        zzrq zzrq = (zzrq) obj;
        if (this.zza.equals(zzrq.zza) && this.zzb.equals(zzrq.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzrq.zzc;
            if (num == num2 || (num != null && num.equals(num2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
