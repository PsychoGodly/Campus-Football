package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zzlz {
    private static final zzlz zza = new zzlz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlz() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzlz zzc() {
        return zza;
    }

    static zzlz zzd() {
        return new zzlz();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlz)) {
            return false;
        }
        zzlz zzlz = (zzlz) obj;
        int i10 = this.zzb;
        if (i10 == zzlz.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlz.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzlz.zzd;
                int i12 = this.zzb;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                return z11;
            }
        }
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int i10;
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = zzig.zzg(i15, ((Long) this.zzd[i13]).longValue());
            } else if (i16 == 1) {
                i10 = zzig.zzc(i15, ((Long) this.zzd[i13]).longValue());
            } else if (i16 == 2) {
                i10 = zzig.zzc(i15, (zzhm) this.zzd[i13]);
            } else if (i16 == 3) {
                i10 = (zzig.zzi(i15) << 1) + ((zzlz) this.zzd[i13]).zza();
            } else if (i16 == 5) {
                i10 = zzig.zzf(i15, ((Integer) this.zzd[i13]).intValue());
            } else {
                throw new IllegalStateException(zzji.zza());
            }
            i12 += i10;
        }
        this.zze = i12;
        return i12;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzig.zzd(this.zzc[i12] >>> 3, (zzhm) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzlz(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzmw zzmw) throws IOException {
        if (this.zzb != 0) {
            if (zzmw.zza() == zzmz.zza) {
                for (int i10 = 0; i10 < this.zzb; i10++) {
                    zza(this.zzc[i10], this.zzd[i10], zzmw);
                }
                return;
            }
            for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
                zza(this.zzc[i11], this.zzd[i11], zzmw);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzlz zza(zzlz zzlz) {
        if (zzlz.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzlz.zzb;
        zza(i10);
        System.arraycopy(zzlz.zzc, 0, this.zzc, this.zzb, zzlz.zzb);
        System.arraycopy(zzlz.zzd, 0, this.zzd, this.zzb, zzlz.zzb);
        this.zzb = i10;
        return this;
    }

    static zzlz zza(zzlz zzlz, zzlz zzlz2) {
        int i10 = zzlz.zzb + zzlz2.zzb;
        int[] copyOf = Arrays.copyOf(zzlz.zzc, i10);
        System.arraycopy(zzlz2.zzc, 0, copyOf, zzlz.zzb, zzlz2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzlz.zzd, i10);
        System.arraycopy(zzlz2.zzd, 0, copyOf2, zzlz.zzb, zzlz2.zzb);
        return new zzlz(i10, copyOf, copyOf2, true);
    }

    private final void zza(int i10) {
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

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzko.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzmw zzmw) throws IOException {
        if (zzmw.zza() == zzmz.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzmw.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzmw.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzmw zzmw) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzmw.zzb(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            zzmw.zza(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            zzmw.zza(i11, (zzhm) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                zzmw.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzji.zza());
        } else if (zzmw.zza() == zzmz.zza) {
            zzmw.zzb(i11);
            ((zzlz) obj).zzb(zzmw);
            zzmw.zza(i11);
        } else {
            zzmw.zza(i11);
            ((zzlz) obj).zzb(zzmw);
            zzmw.zzb(i11);
        }
    }
}
