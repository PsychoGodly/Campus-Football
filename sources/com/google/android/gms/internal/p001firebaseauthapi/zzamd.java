package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzamd {
    private static final zzamd zza = new zzamd(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamd() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamd zzc() {
        return zza;
    }

    static zzamd zzd() {
        return new zzamd();
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
        if (obj == null || !(obj instanceof zzamd)) {
            return false;
        }
        zzamd zzamd = (zzamd) obj;
        int i10 = this.zzb;
        if (i10 == zzamd.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamd.zzc;
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
                Object[] objArr2 = zzamd.zzd;
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
                i10 = zzaik.zze(i15, ((Long) this.zzd[i13]).longValue());
            } else if (i16 == 1) {
                i10 = zzaik.zza(i15, ((Long) this.zzd[i13]).longValue());
            } else if (i16 == 2) {
                i10 = zzaik.zza(i15, (zzahp) this.zzd[i13]);
            } else if (i16 == 3) {
                i10 = (zzaik.zzi(i15) << 1) + ((zzamd) this.zzd[i13]).zza();
            } else if (i16 == 5) {
                i10 = zzaik.zzc(i15, ((Integer) this.zzd[i13]).intValue());
            } else {
                throw new IllegalStateException(zzaji.zza());
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
            i11 += zzaik.zzb(this.zzc[i12] >>> 3, (zzahp) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamd(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzana zzana) throws IOException {
        if (this.zzb != 0) {
            if (zzana.zza() == zzand.zza) {
                for (int i10 = 0; i10 < this.zzb; i10++) {
                    zza(this.zzc[i10], this.zzd[i10], zzana);
                }
                return;
            }
            for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
                zza(this.zzc[i11], this.zzd[i11], zzana);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzamd zza(zzamd zzamd) {
        if (zzamd.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzamd.zzb;
        zza(i10);
        System.arraycopy(zzamd.zzc, 0, this.zzc, this.zzb, zzamd.zzb);
        System.arraycopy(zzamd.zzd, 0, this.zzd, this.zzb, zzamd.zzb);
        this.zzb = i10;
        return this;
    }

    static zzamd zza(zzamd zzamd, zzamd zzamd2) {
        int i10 = zzamd.zzb + zzamd2.zzb;
        int[] copyOf = Arrays.copyOf(zzamd.zzc, i10);
        System.arraycopy(zzamd2.zzc, 0, copyOf, zzamd.zzb, zzamd2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamd.zzd, i10);
        System.arraycopy(zzamd2.zzd, 0, copyOf2, zzamd.zzb, zzamd2.zzb);
        return new zzamd(i10, copyOf, copyOf2, true);
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
            zzako.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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
    public final void zza(zzana zzana) throws IOException {
        if (zzana.zza() == zzand.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzana.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzana.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzana zzana) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzana.zzb(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            zzana.zza(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            zzana.zza(i11, (zzahp) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                zzana.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzaji.zza());
        } else if (zzana.zza() == zzand.zza) {
            zzana.zzb(i11);
            ((zzamd) obj).zzb(zzana);
            zzana.zza(i11);
        } else {
            zzana.zza(i11);
            ((zzamd) obj).zzb(zzana);
            zzana.zzb(i11);
        }
    }
}
