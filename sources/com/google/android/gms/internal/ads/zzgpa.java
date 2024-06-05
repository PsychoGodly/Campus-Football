package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzgpa extends zzgoz {
    protected final byte[] zza;

    zzgpa(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpe) || zzd() != ((zzgpe) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgpa)) {
            return obj.equals(this);
        }
        zzgpa zzgpa = (zzgpa) obj;
        int zzr = zzr();
        int zzr2 = zzgpa.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgpa, 0, zzd());
        }
        return false;
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(zzgpe zzgpe, int i10, int i11) {
        if (i11 <= zzgpe.zzd()) {
            int i12 = i10 + i11;
            if (i12 > zzgpe.zzd()) {
                int zzd = zzgpe.zzd();
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzd);
            } else if (!(zzgpe instanceof zzgpa)) {
                return zzgpe.zzk(i10, i12).equals(zzk(0, i11));
            } else {
                zzgpa zzgpa = (zzgpa) zzgpe;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgpa.zza;
                int zzc = zzc() + i11;
                int zzc2 = zzc();
                int zzc3 = zzgpa.zzc() + i10;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + i11 + zzd2);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i10, int i11, int i12) {
        return zzgqw.zzd(i10, this.zza, zzc() + i11, i12);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzgtv.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    public final zzgpe zzk(int i10, int i11) {
        int zzq = zzgpe.zzq(i10, i11, zzd());
        if (zzq == 0) {
            return zzgpe.zzb;
        }
        return new zzgox(this.zza, zzc() + i10, zzq);
    }

    public final zzgpm zzl() {
        return zzgpm.zzI(this.zza, zzc(), zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgot zzgot) throws IOException {
        zzgot.zza(this.zza, zzc(), zzd());
    }

    public final boolean zzp() {
        int zzc = zzc();
        return zzgtv.zzj(this.zza, zzc, zzd() + zzc);
    }
}
