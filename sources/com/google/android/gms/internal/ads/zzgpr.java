package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpr extends zzgpo {
    private final OutputStream zzg;

    zzgpr(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzL() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzL();
        }
    }

    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    public final void zzO(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b10);
    }

    public final void zzP(int i10, boolean z10) throws IOException {
        zzM(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : 0);
    }

    public final void zzQ(int i10, zzgpe zzgpe) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzgpe.zzd());
        zzgpe.zzo(this);
    }

    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, i10, i11);
    }

    public final void zzh(int i10, int i11) throws IOException {
        zzM(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    public final void zzi(int i10) throws IOException {
        zzM(4);
        zzd(i10);
    }

    public final void zzj(int i10, long j10) throws IOException {
        zzM(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    public final void zzk(long j10) throws IOException {
        zzM(8);
        zze(j10);
    }

    public final void zzl(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg((long) i11);
        }
    }

    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu((long) i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i10, zzgrw zzgrw, zzgsp zzgsp) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(((zzgon) zzgrw).zzat(zzgsp));
        zzgsp.zzm(zzgrw, this.zze);
    }

    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.zza, i13, i14);
        int i15 = i10 + i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzL();
        int i16 = i11 - i14;
        if (i16 <= this.zzb) {
            System.arraycopy(bArr, i15, this.zza, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    public final void zzr(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    public final void zzs(int i10) throws IOException {
        zzM(5);
        zzf(i10);
    }

    public final void zzt(int i10, long j10) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    public final void zzu(long j10) throws IOException {
        zzM(10);
        zzg(j10);
    }

    public final void zzv(String str) throws IOException {
        int i10;
        int i11;
        try {
            int length = str.length() * 3;
            int zzE = zzgpt.zzE(length);
            int i12 = zzE + length;
            int i13 = this.zzb;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int zzd = zzgtv.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i12 > i13 - this.zzc) {
                zzL();
            }
            int zzE2 = zzgpt.zzE(str.length());
            i10 = this.zzc;
            if (zzE2 == zzE) {
                int i14 = i10 + zzE2;
                this.zzc = i14;
                int zzd2 = zzgtv.zzd(str, this.zza, i14, this.zzb - i14);
                this.zzc = i10;
                i11 = (zzd2 - i10) - zzE2;
                zzf(i11);
                this.zzc = zzd2;
            } else {
                i11 = zzgtv.zze(str);
                zzf(i11);
                this.zzc = zzgtv.zzd(str, this.zza, this.zzc, i11);
            }
            this.zzd += i11;
        } catch (zzgtu e10) {
            this.zzd -= this.zzc - i10;
            this.zzc = i10;
            throw e10;
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new zzgpq(e11);
        } catch (zzgtu e12) {
            zzJ(str, e12);
        }
    }
}
