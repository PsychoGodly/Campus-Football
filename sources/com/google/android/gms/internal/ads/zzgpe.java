package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgpe implements Iterable, Serializable {
    private static final Comparator zza = new zzgov();
    public static final zzgpe zzb = new zzgpa(zzgqw.zzd);
    private static final zzgpd zzd = new zzgpd((zzgpc) null);
    private int zzc = 0;

    static {
        int i10 = zzgop.zza;
    }

    zzgpe() {
    }

    static void zzB(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    private static zzgpe zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i10)}));
        } else if (i10 == 1) {
            return (zzgpe) it.next();
        } else {
            int i11 = i10 >>> 1;
            zzgpe zzc2 = zzc(it, i11);
            zzgpe zzc3 = zzc(it, i10 - i11);
            if (a.e.API_PRIORITY_OTHER - zzc2.zzd() >= zzc3.zzd()) {
                return zzgso.zzG(zzc2, zzc3);
            }
            int zzd2 = zzc2.zzd();
            int zzd3 = zzc3.zzd();
            throw new IllegalArgumentException("ByteString would be too long: " + zzd2 + "+" + zzd3);
        }
    }

    static int zzq(int i10, int i11, int i12) {
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

    public static zzgpb zzt() {
        return new zzgpb(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzgpe zzu(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzgpe r3 = zzb
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.zzgpe r3 = zzc(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpe.zzu(java.lang.Iterable):com.google.android.gms.internal.ads.zzgpe");
    }

    public static zzgpe zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgpe zzw(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgpa(bArr2);
    }

    public static zzgpe zzx(String str) {
        return new zzgpa(str.getBytes(zzgqw.zzb));
    }

    public static zzgpe zzy(InputStream inputStream) throws IOException {
        zzgpe zzgpe;
        ArrayList arrayList = new ArrayList();
        int i10 = 256;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            if (i11 == 0) {
                zzgpe = null;
            } else {
                zzgpe = zzw(bArr, 0, i11);
            }
            if (zzgpe == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzgpe);
            i10 = Math.min(i10 + i10, 8192);
        }
    }

    static zzgpe zzz(byte[] bArr) {
        return new zzgpa(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzi(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgte.zza(this) : zzgte.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? MaxReward.DEFAULT_LABEL : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgqw.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzf();

    /* access modifiers changed from: protected */
    public abstract boolean zzh();

    /* access modifiers changed from: protected */
    public abstract int zzi(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgpe zzk(int i10, int i11);

    public abstract zzgpm zzl();

    /* access modifiers changed from: protected */
    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    /* access modifiers changed from: package-private */
    public abstract void zzo(zzgot zzgot) throws IOException;

    public abstract boolean zzp();

    /* access modifiers changed from: protected */
    public final int zzr() {
        return this.zzc;
    }

    /* renamed from: zzs */
    public zzgoy iterator() {
        return new zzgou(this);
    }
}
