package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaid  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaid extends zzaia {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private zzaid(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
        this.zzf = z10;
    }

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzh = i13;
            this.zzg = i10 - i13;
            return;
        }
        this.zzh = 0;
    }

    private final byte zzv() throws IOException {
        int i10 = this.zzi;
        if (i10 != this.zzg) {
            byte[] bArr = this.zze;
            this.zzi = i10 + 1;
            return bArr[i10];
        }
        throw zzaji.zzi();
    }

    private final int zzw() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzi = i10 + 4;
            return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
        }
        throw zzaji.zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzx() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.zzi = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.zzi = r1
            return r0
        L_0x006b:
            long r0 = r5.zzm()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaid.zzx():int");
    }

    private final long zzy() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzi = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
        throw zzaji.zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzz() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzi
            int r1 = r11.zzg
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.zze
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.zzi = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.zzi = r1
            return r2
        L_0x00b8:
            long r0 = r11.zzm()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaid.zzz():long");
    }

    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    public final int zzc() {
        return this.zzi - this.zzj;
    }

    public final int zzd() throws IOException {
        return zzx();
    }

    public final int zze() throws IOException {
        return zzw();
    }

    public final int zzf() throws IOException {
        return zzx();
    }

    public final int zzg() throws IOException {
        return zzw();
    }

    public final int zzh() throws IOException {
        return zzaia.zza(zzx());
    }

    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzk = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzk = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzaji.zzc();
    }

    public final int zzj() throws IOException {
        return zzx();
    }

    public final long zzk() throws IOException {
        return zzy();
    }

    public final long zzl() throws IOException {
        return zzz();
    }

    /* access modifiers changed from: package-private */
    public final long zzm() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zzv = zzv();
            j10 |= ((long) (zzv & Ascii.DEL)) << i10;
            if ((zzv & 128) == 0) {
                return j10;
            }
        }
        throw zzaji.zze();
    }

    public final long zzn() throws IOException {
        return zzy();
    }

    public final long zzo() throws IOException {
        return zzaia.zza(zzz());
    }

    public final long zzp() throws IOException {
        return zzz();
    }

    public final zzahp zzq() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                zzahp zza = zzahp.zza(this.zze, i11, zzx);
                this.zzi += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzahp.zza;
        }
        if (zzx > 0) {
            int i12 = this.zzg;
            int i13 = this.zzi;
            if (zzx <= i12 - i13) {
                int i14 = zzx + i13;
                this.zzi = i14;
                bArr = Arrays.copyOfRange(this.zze, i13, i14);
                return zzahp.zzb(bArr);
            }
        }
        if (zzx > 0) {
            throw zzaji.zzi();
        } else if (zzx == 0) {
            bArr = zzajf.zzb;
            return zzahp.zzb(bArr);
        } else {
            throw zzaji.zzf();
        }
    }

    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String str = new String(this.zze, i11, zzx, zzajf.zza);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzx < 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    public final String zzs() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String zzb = zzaml.zzb(this.zze, i11, zzx);
                this.zzi += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzx <= 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg;
    }

    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    private final void zzf(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    public final int zzb(int i10) throws zzaji {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            if (zzc >= 0) {
                int i11 = this.zzl;
                if (zzc <= i11) {
                    this.zzl = zzc;
                    zzaa();
                    return i11;
                }
                throw zzaji.zzi();
            }
            throw zzaji.zzg();
        }
        throw zzaji.zzf();
    }

    public final void zzc(int i10) throws zzaji {
        if (this.zzk != i10) {
            throw zzaji.zzb();
        }
    }

    public final void zzd(int i10) {
        this.zzl = i10;
        zzaa();
    }

    public final boolean zze(int i10) throws IOException {
        int zzi2;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zze;
                    int i13 = this.zzi;
                    this.zzi = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzaji.zze();
            }
            while (i12 < 10) {
                if (zzv() < 0) {
                    i12++;
                }
            }
            throw zzaji.zze();
            return true;
        } else if (i11 == 1) {
            zzf(8);
            return true;
        } else if (i11 == 2) {
            zzf(zzx());
            return true;
        } else if (i11 == 3) {
            do {
                zzi2 = zzi();
                if (zzi2 == 0 || !zze(zzi2)) {
                    zzc(((i10 >>> 3) << 3) | 4);
                }
                zzi2 = zzi();
                break;
            } while (!zze(zzi2));
            zzc(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzf(4);
                return true;
            }
            throw zzaji.zza();
        }
    }
}
