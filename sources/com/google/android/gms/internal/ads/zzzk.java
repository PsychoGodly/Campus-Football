package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzk implements zzzv {
    private final byte[] zza = new byte[4096];
    private final zzr zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[65536];
    private int zzf;
    private int zzg;

    static {
        zzbh.zzb("media3.extractor");
    }

    public zzzk(zzr zzr, long j10, long j11) {
        this.zzb = zzr;
        this.zzd = j10;
        this.zzc = j11;
    }

    private final int zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzg;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.zze, 0, bArr, i10, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int zza2 = this.zzb.zza(bArr, i10 + i12, i11 - i12);
            if (zza2 != -1) {
                return i12 + zza2;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private final int zzr(int i10) {
        int min = Math.min(this.zzg, i10);
        zzu(min);
        return min;
    }

    private final void zzs(int i10) {
        if (i10 != -1) {
            this.zzd += (long) i10;
        }
    }

    private final void zzt(int i10) {
        int i11 = this.zzf + i10;
        int length = this.zze.length;
        if (i11 > length) {
            this.zze = Arrays.copyOf(this.zze, zzew.zzf(length + length, 65536 + i11, i11 + 524288));
        }
    }

    private final void zzu(int i10) {
        int i11 = this.zzg - i10;
        this.zzg = i11;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i11 < bArr.length + -524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.zze = bArr2;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zzp = zzp(bArr, i10, i11);
        if (zzp == 0) {
            zzp = zzq(bArr, i10, i11, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    public final int zzb(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        zzt(i11);
        int i13 = this.zzg;
        int i14 = this.zzf;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = zzq(this.zze, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.zzg += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i10, i12);
        this.zzf += i12;
        return i12;
    }

    public final int zzc(int i10) throws IOException {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd + ((long) this.zzf);
    }

    public final long zzf() {
        return this.zzd;
    }

    public final void zzg(int i10) throws IOException {
        zzl(i10, false);
    }

    public final void zzh(byte[] bArr, int i10, int i11) throws IOException {
        zzm(bArr, i10, i11, false);
    }

    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        zzn(bArr, i10, i11, false);
    }

    public final void zzj() {
        this.zzf = 0;
    }

    public final void zzk(int i10) throws IOException {
        zzo(i10, false);
    }

    public final boolean zzl(int i10, boolean z10) throws IOException {
        zzt(i10);
        int i11 = this.zzg - this.zzf;
        while (i11 < i10) {
            i11 = zzq(this.zze, this.zzf, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.zzg = this.zzf + i11;
        }
        this.zzf += i10;
        return true;
    }

    public final boolean zzm(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!zzl(i11, z10)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i11, bArr, i10, i11);
        return true;
    }

    public final boolean zzn(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int zzp = zzp(bArr, i10, i11);
        while (zzp < i11 && zzp != -1) {
            zzp = zzq(bArr, i10, i11, zzp, z10);
        }
        zzs(zzp);
        return zzp != -1;
    }

    public final boolean zzo(int i10, boolean z10) throws IOException {
        int zzr = zzr(i10);
        while (zzr < i10 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i10, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        return zzr != -1;
    }
}
