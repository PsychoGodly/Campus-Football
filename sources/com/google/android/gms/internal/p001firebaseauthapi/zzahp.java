package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzahp implements Serializable, Iterable<Byte> {
    public static final zzahp zza = new zzahz(zzajf.zzb);
    private static final zzahs zzb = new zzahy();
    private static final Comparator<zzahp> zzc = new zzahr();
    private int zzd = 0;

    zzahp() {
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

    static zzahp zzb(byte[] bArr) {
        return new zzahz(bArr);
    }

    static zzahu zzc(int i10) {
        return new zzahu(i10);
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
        return new zzaho(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzalw.zza(this);
        } else {
            str = zzalw.zza(zza(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract zzahp zza(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzahm zzahm) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzb();

    /* access modifiers changed from: protected */
    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaia zzc();

    public final String zzd() {
        return zzb() == 0 ? MaxReward.DEFAULT_LABEL : zza(zzajf.zza);
    }

    public final boolean zze() {
        return zzb() == 0;
    }

    public abstract boolean zzf();

    public final byte[] zzg() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzajf.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzd;
    }

    public static zzahp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzahp zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzahz(zzb.zza(bArr, i10, i11));
    }

    public static zzahp zza(String str) {
        return new zzahz(str.getBytes(zzajf.zza));
    }
}
