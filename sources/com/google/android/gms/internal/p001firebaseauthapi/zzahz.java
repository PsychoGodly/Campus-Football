package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
class zzahz extends zzahw {
    protected final byte[] zzb;

    zzahz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahp) || zzb() != ((zzahp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzahz)) {
            return obj.equals(this);
        }
        zzahz zzahz = (zzahz) obj;
        int zza = zza();
        int zza2 = zzahz.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzahz, 0, zzb());
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

    public final zzaia zzc() {
        return zzaia.zza(this.zzb, zzh(), zzb(), true);
    }

    public final boolean zzf() {
        int zzh = zzh();
        return zzaml.zzc(this.zzb, zzh, zzb() + zzh);
    }

    /* access modifiers changed from: protected */
    public int zzh() {
        return 0;
    }

    public final zzahp zza(int i10, int i11) {
        int zza = zzahp.zza(0, i11, zzb());
        if (zza == 0) {
            return zzahp.zza;
        }
        return new zzaht(this.zzb, zzh(), zza);
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i10, int i11, int i12) {
        return zzajf.zza(i10, this.zzb, zzh(), i12);
    }

    public int zzb() {
        return this.zzb.length;
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzb, zzh(), zzb(), charset);
    }

    /* access modifiers changed from: protected */
    public void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzahm zzahm) throws IOException {
        zzahm.zza(this.zzb, zzh(), zzb());
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzahp zzahp, int i10, int i11) {
        if (i11 > zzahp.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i11 + zzb2);
        } else if (i11 > zzahp.zzb()) {
            int zzb3 = zzahp.zzb();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + zzb3);
        } else if (!(zzahp instanceof zzahz)) {
            return zzahp.zza(0, i11).equals(zza(0, i11));
        } else {
            zzahz zzahz = (zzahz) zzahp;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzahz.zzb;
            int zzh = zzh() + i11;
            int zzh2 = zzh();
            int zzh3 = zzahz.zzh();
            while (zzh2 < zzh) {
                if (bArr[zzh2] != bArr2[zzh3]) {
                    return false;
                }
                zzh2++;
                zzh3++;
            }
            return true;
        }
    }
}
