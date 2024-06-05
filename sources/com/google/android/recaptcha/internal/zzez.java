package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public abstract class zzez implements Iterable, Serializable {
    private static final Comparator zza = new zzer();
    public static final zzez zzb = new zzew(zzgw.zzd);
    private static final zzey zzd = new zzey((zzex) null);
    private int zzc = 0;

    static {
        int i10 = zzel.zza;
    }

    zzez() {
    }

    static int zzk(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static zzez zzm(byte[] bArr, int i10, int i11) {
        zzk(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzew(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzeq(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzja.zza(this) : zzja.zza(zzg(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzez zzg(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zzh(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zzi(zzep zzep) throws IOException;

    public abstract boolean zzj();

    /* access modifiers changed from: protected */
    public final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? MaxReward.DEFAULT_LABEL : zzh(charset);
    }

    public final byte[] zzo() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgw.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
