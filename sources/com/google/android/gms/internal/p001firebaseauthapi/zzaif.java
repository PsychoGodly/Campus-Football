package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaif  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaif extends zzaia {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaie zzm;

    private zzaif(InputStream inputStream, int i10) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zzm = null;
        zzajf.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
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
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzg(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
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
            byte[] r2 = r5.zzf
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaif.zzx():int");
    }

    private final long zzy() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzg(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
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
            byte[] r2 = r11.zzf
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaif.zzz():long");
    }

    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    public final int zzc() {
        return this.zzk + this.zzi;
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
            this.zzj = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzj = zzx;
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
        int zzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzx <= i10 - i11 && zzx > 0) {
            zzahp zza = zzahp.zza(this.zzf, i11, zzx);
            this.zzi += zzx;
            return zza;
        } else if (zzx == 0) {
            return zzahp.zza;
        } else {
            byte[] zzj2 = zzj(zzx);
            if (zzj2 != null) {
                return zzahp.zza(zzj2);
            }
            int i12 = this.zzi;
            int i13 = this.zzg;
            int i14 = i13 - i12;
            this.zzk += i13;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzf2 = zzf(zzx - i14);
            byte[] bArr = new byte[zzx];
            System.arraycopy(this.zzf, i12, bArr, 0, i14);
            for (byte[] next : zzf2) {
                System.arraycopy(next, 0, bArr, i14, next.length);
                i14 += next.length;
            }
            return zzahp.zzb(bArr);
        }
    }

    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String str = new String(this.zzf, i11, zzx, zzajf.zza);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzx > this.zzg) {
            return new String(zza(zzx, false), zzajf.zza);
        }
        zzg(zzx);
        String str2 = new String(this.zzf, this.zzi, zzx, zzajf.zza);
        this.zzi += zzx;
        return str2;
    }

    public final String zzs() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzx <= i11 - i10 && zzx > 0) {
            bArr = this.zzf;
            this.zzi = i10 + zzx;
        } else if (zzx == 0) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            if (zzx <= i11) {
                zzg(zzx);
                bArr = this.zzf;
                this.zzi = zzx;
            } else {
                bArr = zza(zzx, false);
            }
            i10 = 0;
        }
        return zzaml.zzb(bArr, i10, zzx);
    }

    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg && !zzi(1);
    }

    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    private static int zza(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (zzaji e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final List<byte[]> zzf(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw zzaji.zzi();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) throws IOException {
        if (zzi(i10)) {
            return;
        }
        if (i10 > (this.zzc - this.zzk) - this.zzi) {
            throw zzaji.zzh();
        }
        throw zzaji.zzi();
    }

    private final void zzh(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzi = i12 + i10;
        } else if (i10 >= 0) {
            int i13 = this.zzk;
            int i14 = i13 + i12 + i10;
            int i15 = this.zzl;
            if (i14 <= i15) {
                this.zzk = i13 + i12;
                int i16 = i11 - i12;
                this.zzg = 0;
                this.zzi = 0;
                while (i16 < i10) {
                    try {
                        long j10 = (long) (i10 - i16);
                        long zza = zza(this.zze, j10);
                        int i17 = (zza > 0 ? 1 : (zza == 0 ? 0 : -1));
                        if (i17 >= 0 && zza <= j10) {
                            if (i17 == 0) {
                                break;
                            }
                            i16 += (int) zza;
                        } else {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                        }
                    } catch (Throwable th) {
                        this.zzk += i16;
                        zzaa();
                        throw th;
                    }
                }
                this.zzk += i16;
                zzaa();
                if (i16 < i10) {
                    int i18 = this.zzg;
                    int i19 = i18 - this.zzi;
                    this.zzi = i18;
                    zzg(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.zzg;
                        if (i20 > i21) {
                            i19 += i21;
                            this.zzi = i21;
                            zzg(1);
                        } else {
                            this.zzi = i20;
                            return;
                        }
                    }
                }
            } else {
                zzh((i15 - i13) - i12);
                throw zzaji.zzi();
            }
        } else {
            throw zzaji.zzf();
        }
    }

    private final byte[] zzj(int i10) throws IOException {
        if (i10 == 0) {
            return zzajf.zzb;
        }
        if (i10 >= 0) {
            int i11 = this.zzk;
            int i12 = this.zzi;
            int i13 = i11 + i12 + i10;
            if (i13 - this.zzc <= 0) {
                int i14 = this.zzl;
                if (i13 <= i14) {
                    int i15 = this.zzg - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096 && i16 > zza(this.zze)) {
                        return null;
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i15 < i10) {
                        int zza = zza(this.zze, bArr, i15, i10 - i15);
                        if (zza != -1) {
                            this.zzk += zza;
                            i15 += zza;
                        } else {
                            throw zzaji.zzi();
                        }
                    }
                    return bArr;
                }
                zzh((i14 - i11) - i12);
                throw zzaji.zzi();
            }
            throw zzaji.zzh();
        }
        throw zzaji.zzf();
    }

    public final int zzb(int i10) throws zzaji {
        if (i10 >= 0) {
            int i11 = i10 + this.zzk + this.zzi;
            int i12 = this.zzl;
            if (i11 <= i12) {
                this.zzl = i11;
                zzaa();
                return i12;
            }
            throw zzaji.zzi();
        }
        throw zzaji.zzf();
    }

    public final void zzc(int i10) throws zzaji {
        if (this.zzj != i10) {
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
                    byte[] bArr = this.zzf;
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
            zzh(8);
            return true;
        } else if (i11 == 2) {
            zzh(zzx());
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
                zzh(4);
                return true;
            }
            throw zzaji.zza();
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzaji e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final boolean zzi(int i10) throws IOException {
        do {
            int i11 = this.zzi;
            int i12 = i11 + i10;
            int i13 = this.zzg;
            if (i12 > i13) {
                int i14 = this.zzc;
                int i15 = this.zzk;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzl) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.zzk += i11;
                    this.zzg -= i11;
                    this.zzi = 0;
                }
                InputStream inputStream = this.zze;
                byte[] bArr2 = this.zzf;
                int i16 = this.zzg;
                int zza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzc - this.zzk) - i16));
                if (zza == 0 || zza < -1 || zza > this.zzf.length) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                } else if (zza <= 0) {
                    return false;
                } else {
                    this.zzg += zza;
                    zzaa();
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        } while (this.zzg < i10);
        return true;
    }

    private static long zza(InputStream inputStream, long j10) throws IOException {
        try {
            return inputStream.skip(j10);
        } catch (zzaji e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final byte[] zza(int i10, boolean z10) throws IOException {
        byte[] zzj2 = zzj(i10);
        if (zzj2 != null) {
            return zzj2;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf2 = zzf(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] next : zzf2) {
            System.arraycopy(next, 0, bArr, i13, next.length);
            i13 += next.length;
        }
        return bArr;
    }
}
