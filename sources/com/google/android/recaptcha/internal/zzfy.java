package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzfy {
    private final Object zza;
    private final int zzb;

    zzfy(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfy = (zzfy) obj;
        if (this.zza == zzfy.zza && this.zzb == zzfy.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
