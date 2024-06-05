package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
class zzhw extends zzhx {
    protected final byte[] zzb;

    zzhw(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm) || zzb() != ((zzhm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzhw)) {
            return obj.equals(this);
        }
        zzhw zzhw = (zzhw) obj;
        int zza = zza();
        int zza2 = zzhw.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzhw, 0, zzb());
        }
        return false;
    }

    public byte zza(int i10) {
        return this.zzb[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    public final boolean zzd() {
        int zze = zze();
        return zzmh.zzc(this.zzb, zze, zzb() + zze);
    }

    /* access modifiers changed from: protected */
    public int zze() {
        return 0;
    }

    public final zzhm zza(int i10, int i11) {
        int zza = zzhm.zza(0, i11, zzb());
        if (zza == 0) {
            return zzhm.zza;
        }
        return new zzhq(this.zzb, zze(), zza);
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i10, int i11, int i12) {
        return zziz.zza(i10, this.zzb, zze(), i12);
    }

    public int zzb() {
        return this.zzb.length;
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzhn zzhn) throws IOException {
        zzhn.zza(this.zzb, zze(), zzb());
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzhm zzhm, int i10, int i11) {
        if (i11 > zzhm.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i11 + zzb2);
        } else if (i11 > zzhm.zzb()) {
            int zzb3 = zzhm.zzb();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + zzb3);
        } else if (!(zzhm instanceof zzhw)) {
            return zzhm.zza(0, i11).equals(zza(0, i11));
        } else {
            zzhw zzhw = (zzhw) zzhm;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzhw.zzb;
            int zze = zze() + i11;
            int zze2 = zze();
            int zze3 = zzhw.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }
}
