package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
class zzew extends zzev {
    protected final byte[] zza;

    zzew(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzez) || zzd() != ((zzez) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return obj.equals(this);
        }
        zzew zzew = (zzew) obj;
        int zzl = zzl();
        int zzl2 = zzew.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzew.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zzew.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzew.zza;
            zzew.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            int zzd3 = zzew.zzd();
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd3);
        }
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
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    /* access modifiers changed from: protected */
    public final int zzf(int i10, int i11, int i12) {
        return zzgw.zzb(i10, this.zza, 0, i12);
    }

    public final zzez zzg(int i10, int i11) {
        int zzk = zzez.zzk(0, i11, zzd());
        if (zzk == 0) {
            return zzez.zzb;
        }
        return new zzet(this.zza, 0, zzk);
    }

    /* access modifiers changed from: protected */
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzep zzep) throws IOException {
        ((zzfh) zzep).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzju.zzf(this.zza, 0, zzd());
    }
}
