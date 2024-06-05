package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsg implements zzgrt {
    private final zzgrw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzgsg(zzgrw zzgrw, String str, Object[] objArr) {
        this.zza = zzgrw;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.zzd = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final zzgrw zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}