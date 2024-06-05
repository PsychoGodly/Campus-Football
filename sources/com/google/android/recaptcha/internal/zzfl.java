package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzfl implements zzjx {
    private final zzfk zza;

    private zzfl(zzfk zzfk) {
        byte[] bArr = zzgw.zzd;
        this.zza = zzfk;
        zzfk.zza = this;
    }

    public static zzfl zza(zzfk zzfk) {
        zzfl zzfl = zzfk.zza;
        return zzfl != null ? zzfl : new zzfl(zzfk);
    }

    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzfk.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzfk zzfk = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzfk.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzfk zzfk2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzfk2.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzfk.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzfk zzfk = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzfk.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzfk zzfk2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzfk2.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzo(i10, 3);
    }

    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzm(i10, str);
    }

    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            while (i11 < list.size()) {
                Object zzf = zzhg.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzm(i10, (String) zzf);
                } else {
                    this.zza.zze(i10, (zzez) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzp(i10, i11);
    }

    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzfk.zzy(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzr(i10, j10);
    }

    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzfk.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void zzd(int i10, zzez zzez) throws IOException {
        this.zza.zze(i10, zzez);
    }

    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzez) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzo(i10, 4);
    }

    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzfk.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void zzq(int i10, Object obj, zzil zzil) throws IOException {
        zzfk zzfk = this.zza;
        zzfk.zzo(i10, 3);
        zzil.zzj((zzhy) obj, zzfk.zza);
        zzfk.zzo(i10, 4);
    }

    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzfk.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzr(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzfk.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzv(int i10, Object obj, zzil zzil) throws IOException {
        zzhy zzhy = (zzhy) obj;
        zzfh zzfh = (zzfh) this.zza;
        zzfh.zzq((i10 << 3) | 2);
        zzfh.zzq(((zzei) zzhy).zza(zzil));
        zzil.zzj(zzhy, zzfh.zza);
    }

    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzez) {
            zzfh zzfh = (zzfh) this.zza;
            zzfh.zzq(11);
            zzfh.zzp(2, i10);
            zzfh.zze(3, (zzez) obj);
            zzfh.zzq(12);
            return;
        }
        zzfk zzfk = this.zza;
        zzhy zzhy = (zzhy) obj;
        zzfh zzfh2 = (zzfh) zzfk;
        zzfh2.zzq(11);
        zzfh2.zzp(2, i10);
        zzfh2.zzq(26);
        zzfh2.zzq(zzhy.zzn());
        zzhy.zze(zzfk);
        zzfh2.zzq(12);
    }

    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }
}
