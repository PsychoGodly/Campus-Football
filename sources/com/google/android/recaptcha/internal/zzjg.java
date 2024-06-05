package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzjg {
    private static final zzjg zza = new zzjg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjg() {
        this(0, new int[8], new Object[8], true);
    }

    private zzjg(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzjg zzc() {
        return zza;
    }

    static zzjg zze(zzjg zzjg, zzjg zzjg2) {
        int i10 = zzjg.zzb + zzjg2.zzb;
        int[] copyOf = Arrays.copyOf(zzjg.zzc, i10);
        System.arraycopy(zzjg2.zzc, 0, copyOf, zzjg.zzb, zzjg2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjg.zzd, i10);
        System.arraycopy(zzjg2.zzd, 0, copyOf2, zzjg.zzb, zzjg2.zzb);
        return new zzjg(i10, copyOf, copyOf2, true);
    }

    static zzjg zzf() {
        return new zzjg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjg)) {
            return false;
        }
        zzjg zzjg = (zzjg) obj;
        int i10 = this.zzb;
        if (i10 == zzjg.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjg.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjg.zzd;
                    int i12 = this.zzb;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    public final int zza() {
        int i10;
        int i11;
        int i12;
        int i13 = this.zze;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.zzd[i15]).longValue();
                    i10 = zzfk.zzy(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int i19 = zzfk.zzb;
                    int zzd2 = ((zzez) this.zzd[i15]).zzd();
                    i10 = zzfk.zzy(i17 << 3) + zzfk.zzy(zzd2) + zzd2;
                } else if (i18 == 3) {
                    int i20 = i17 << 3;
                    int i21 = zzfk.zzb;
                    i11 = ((zzjg) this.zzd[i15]).zza();
                    int zzy = zzfk.zzy(i20);
                    i12 = zzy + zzy;
                } else if (i18 == 5) {
                    ((Integer) this.zzd[i15]).intValue();
                    i10 = zzfk.zzy(i17 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzgy.zza());
                }
                i14 += i10;
            } else {
                int i22 = i17 << 3;
                i11 = zzfk.zzz(((Long) this.zzd[i15]).longValue());
                i12 = zzfk.zzy(i22);
            }
            i10 = i12 + i11;
            i14 += i10;
        }
        this.zze = i14;
        return i14;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = zzfk.zzb;
            int zzd2 = ((zzez) this.zzd[i12]).zzd();
            int zzy = zzfk.zzy(zzd2) + zzd2;
            int zzy2 = zzfk.zzy(16);
            int zzy3 = zzfk.zzy(this.zzc[i12] >>> 3);
            int zzy4 = zzfk.zzy(8);
            i11 += zzy4 + zzy4 + zzy2 + zzy3 + zzfk.zzy(24) + zzy;
        }
        this.zze = i11;
        return i11;
    }

    /* access modifiers changed from: package-private */
    public final zzjg zzd(zzjg zzjg) {
        if (zzjg.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzjg.zzb;
        zzm(i10);
        System.arraycopy(zzjg.zzc, 0, this.zzc, this.zzb, zzjg.zzb);
        System.arraycopy(zzjg.zzd, 0, this.zzd, this.zzb, zzjg.zzb);
        this.zzb = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzia.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public final void zzk(zzjx zzjx) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzjx.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzjx zzjx) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzjx.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzjx.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzjx.zzd(i13, (zzez) obj);
                } else if (i12 == 3) {
                    zzjx.zzF(i13);
                    ((zzjg) obj).zzl(zzjx);
                    zzjx.zzh(i13);
                } else if (i12 == 5) {
                    zzjx.zzk(i13, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzgy.zza());
                }
            }
        }
    }
}
