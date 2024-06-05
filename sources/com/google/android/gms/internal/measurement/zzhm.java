package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public abstract class zzhm implements Serializable, Iterable<Byte> {
    public static final zzhm zza = new zzhw(zziz.zzb);
    private static final zzht zzb = new zzhz();
    private static final Comparator<zzhm> zzc = new zzho();
    private int zzd = 0;

    zzhm() {
    }

    static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    static int zza(int i10, int i11, int i12) {
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

    static zzhv zzc(int i10) {
        return new zzhv(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzd = i10;
        }
        return i10;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzhp(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzlw.zza(this);
        } else {
            str = zzlw.zza(zza(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract zzhm zza(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzhn zzhn) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzb();

    /* access modifiers changed from: protected */
    public abstract int zzb(int i10, int i11, int i12);

    public abstract boolean zzd();

    public final String zzc() {
        return zzb() == 0 ? MaxReward.DEFAULT_LABEL : zza(zziz.zza);
    }

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzd;
    }

    public static zzhm zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzhw(zzb.zza(bArr, i10, i11));
    }

    public static zzhm zza(String str) {
        return new zzhw(str.getBytes(zziz.zza));
    }

    static zzhm zza(byte[] bArr) {
        return new zzhw(bArr);
    }
}
