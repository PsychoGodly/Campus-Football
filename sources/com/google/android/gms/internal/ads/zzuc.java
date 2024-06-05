package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzuc {
    private final zzen zza = new zzen(32);
    private zzub zzb;
    private zzub zzc;
    private zzub zzd;
    private long zze;
    private final zzwt zzf;

    public zzuc(zzwt zzwt, byte[] bArr) {
        this.zzf = zzwt;
        zzub zzub = new zzub(0, 65536);
        this.zzb = zzub;
        this.zzc = zzub;
        this.zzd = zzub;
    }

    private final int zzi(int i10) {
        zzub zzub = this.zzd;
        if (zzub.zzc == null) {
            zzwm zzb2 = this.zzf.zzb();
            zzub zzub2 = new zzub(this.zzd.zzb, 65536);
            zzub.zzc = zzb2;
            zzub.zzd = zzub2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzub zzj(zzub zzub, long j10) {
        while (j10 >= zzub.zzb) {
            zzub = zzub.zzd;
        }
        return zzub;
    }

    private static zzub zzk(zzub zzub, long j10, ByteBuffer byteBuffer, int i10) {
        zzub zzj = zzj(zzub, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzub zzl(zzub zzub, long j10, byte[] bArr, int i10) {
        zzub zzj = zzj(zzub, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzub zzm(zzub zzub, zzgr zzgr, zzue zzue, zzen zzen) {
        zzub zzub2;
        int i10;
        zzgr zzgr2 = zzgr;
        zzue zzue2 = zzue;
        zzen zzen2 = zzen;
        if (zzgr.zzk()) {
            long j10 = zzue2.zzb;
            zzen2.zzC(1);
            zzub zzl = zzl(zzub, j10, zzen.zzH(), 1);
            long j11 = j10 + 1;
            byte b10 = zzen.zzH()[0];
            byte b11 = b10 & 128;
            byte b12 = b10 & Ascii.DEL;
            zzgo zzgo = zzgr2.zza;
            byte[] bArr = zzgo.zza;
            if (bArr == null) {
                zzgo.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = b11 != 0;
            zzub2 = zzl(zzl, j11, zzgo.zza, b12);
            long j12 = j11 + ((long) b12);
            if (z10) {
                zzen2.zzC(2);
                zzub2 = zzl(zzub2, j12, zzen.zzH(), 2);
                j12 += 2;
                i10 = zzen.zzo();
            } else {
                i10 = 1;
            }
            int[] iArr = zzgo.zzd;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgo.zze;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i11 = i10 * 6;
                zzen2.zzC(i11);
                zzub2 = zzl(zzub2, j12, zzen.zzH(), i11);
                j12 += (long) i11;
                zzen2.zzF(0);
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr2[i12] = zzen.zzo();
                    iArr4[i12] = zzen.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzue2.zza - ((int) (j12 - zzue2.zzb));
            }
            zzaba zzaba = zzue2.zzc;
            int i13 = zzew.zza;
            zzgo.zzc(i10, iArr2, iArr4, zzaba.zzb, zzgo.zza, zzaba.zza, zzaba.zzc, zzaba.zzd);
            long j13 = zzue2.zzb;
            int i14 = (int) (j12 - j13);
            zzue2.zzb = j13 + ((long) i14);
            zzue2.zza -= i14;
        } else {
            zzub2 = zzub;
        }
        if (zzgr.zze()) {
            zzen2.zzC(4);
            zzub zzl2 = zzl(zzub2, zzue2.zzb, zzen.zzH(), 4);
            int zzn = zzen.zzn();
            zzue2.zzb += 4;
            zzue2.zza -= 4;
            zzgr2.zzi(zzn);
            zzub zzk = zzk(zzl2, zzue2.zzb, zzgr2.zzb, zzn);
            zzue2.zzb += (long) zzn;
            int i15 = zzue2.zza - zzn;
            zzue2.zza = i15;
            ByteBuffer byteBuffer = zzgr2.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                zzgr2.zze = ByteBuffer.allocate(i15);
            } else {
                zzgr2.zze.clear();
            }
            return zzk(zzk, zzue2.zzb, zzgr2.zze, zzue2.zza);
        }
        zzgr2.zzi(zzue2.zza);
        return zzk(zzub2, zzue2.zzb, zzgr2.zzb, zzue2.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + ((long) i10);
        this.zze = j10;
        zzub zzub = this.zzd;
        if (j10 == zzub.zzb) {
            this.zzd = zzub.zzd;
        }
    }

    public final int zza(zzr zzr, int i10, boolean z10) throws IOException {
        int zzi = zzi(i10);
        zzub zzub = this.zzd;
        int zza2 = zzr.zza(zzub.zzc.zza, zzub.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzub zzub;
        if (j10 != -1) {
            while (true) {
                zzub = this.zzb;
                if (j10 < zzub.zzb) {
                    break;
                }
                this.zzf.zzc(zzub.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzub.zza) {
                this.zzc = zzub;
            }
        }
    }

    public final void zzd(zzgr zzgr, zzue zzue) {
        zzm(this.zzc, zzgr, zzue, this.zza);
    }

    public final void zze(zzgr zzgr, zzue zzue) {
        this.zzc = zzm(this.zzc, zzgr, zzue, this.zza);
    }

    public final void zzf() {
        zzub zzub = this.zzb;
        if (zzub.zzc != null) {
            this.zzf.zzd(zzub);
            zzub.zzb();
        }
        this.zzb.zze(0, 65536);
        zzub zzub2 = this.zzb;
        this.zzc = zzub2;
        this.zzd = zzub2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzen, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzub zzub = this.zzd;
            zzen.zzB(zzub.zzc.zza, zzub.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
