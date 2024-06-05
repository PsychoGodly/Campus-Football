package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfnz extends zzfnq {
    private final Object zza;

    zzfnz(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfnz) {
            return this.zza.equals(((zzfnz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    public final zzfnq zza(zzfnj zzfnj) {
        Object apply = zzfnj.apply(this.zza);
        zzfnu.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfnz(apply);
    }

    public final Object zzb(Object obj) {
        return this.zza;
    }
}
