package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaah {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaag zzk;
    private final zzbq zzl;

    private zzaah(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzaag zzaag, zzbq zzbq) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzaag;
        this.zzl = zzbq;
    }

    public zzaah(byte[] bArr, int i10) {
        zzem zzem = new zzem(bArr, bArr.length);
        zzem.zzj(i10 * 8);
        this.zza = zzem.zzd(16);
        this.zzb = zzem.zzd(16);
        this.zzc = zzem.zzd(24);
        this.zzd = zzem.zzd(24);
        int zzd2 = zzem.zzd(20);
        this.zze = zzd2;
        this.zzf = zzi(zzd2);
        this.zzg = zzem.zzd(3) + 1;
        int zzd3 = zzem.zzd(5) + 1;
        this.zzh = zzd3;
        this.zzi = zzh(zzd3);
        this.zzj = zzew.zzy(zzem.zzd(4), zzem.zzd(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j10) {
        return zzew.zzr((j10 * ((long) this.zze)) / 1000000, 0, this.zzj - 1);
    }

    public final zzaf zzc(byte[] bArr, zzbq zzbq) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzbq zzd2 = zzd(zzbq);
        zzad zzad = new zzad();
        zzad.zzS("audio/flac");
        zzad.zzL(i10);
        zzad.zzw(this.zzg);
        zzad.zzT(this.zze);
        zzad.zzI(Collections.singletonList(bArr));
        zzad.zzM(zzd2);
        return zzad.zzY();
    }

    public final zzbq zzd(zzbq zzbq) {
        zzbq zzbq2 = this.zzl;
        return zzbq2 == null ? zzbq : zzbq2.zzd(zzbq);
    }

    public final zzaah zze(List list) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbq(list)));
    }

    public final zzaah zzf(zzaag zzaag) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaag, this.zzl);
    }

    public final zzaah zzg(List list) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzabh.zzb(list)));
    }
}
