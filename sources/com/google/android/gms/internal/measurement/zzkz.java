package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzkz implements zzkh {
    private final zzkj zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzkz(zzkj zzkj, String str, Object[] objArr) {
        this.zza = zzkj;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.zzd = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final zzkj zza() {
        return this.zza;
    }

    public final zzky zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzky.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzky.EDITIONS;
        }
        return zzky.PROTO3;
    }

    public final boolean zzc() {
        return (this.zzd & 2) == 2;
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
