package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaad {
    public static int zza(zzen zzen, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzen.zzk() + 1;
            case 7:
                return zzen.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzzv zzzv, zzaah zzaah) throws IOException {
        zzzv.zzj();
        zzzk zzzk = (zzzk) zzzv;
        zzzk.zzl(1, false);
        byte[] bArr = new byte[1];
        zzzk.zzm(bArr, 0, 1, false);
        byte b10 = bArr[0] & 1;
        boolean z10 = 1 == b10;
        zzzk.zzl(2, false);
        int i10 = 1 != b10 ? 6 : 7;
        zzen zzen = new zzen(i10);
        zzen.zzE(zzzy.zza(zzzv, zzen.zzH(), 0, i10));
        zzzv.zzj();
        zzaac zzaac = new zzaac();
        if (zzd(zzen, zzaah, z10, zzaac)) {
            return zzaac.zza;
        }
        throw zzbu.zza((String) null, (Throwable) null);
    }

    public static boolean zzc(zzen zzen, zzaah zzaah, int i10, zzaac zzaac) {
        int zza;
        zzen zzen2 = zzen;
        zzaah zzaah2 = zzaah;
        int zzc = zzen.zzc();
        long zzs = zzen.zzs();
        long j10 = zzs >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = zzs >> 12;
        long j12 = zzs >> 8;
        long j13 = zzs >> 4;
        long j14 = zzs >> 1;
        long j15 = zzs & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzaah2.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzaah2.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzaah2.zzi) || j15 == 1 || !zzd(zzen2, zzaah2, z10, zzaac) || (zza = zza(zzen2, (int) (j11 & 15))) == -1 || zza > zzaah2.zzb) {
            return false;
        }
        int i13 = zzaah2.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzaah2.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzen.zzk() * 1000 != i13) {
                    return false;
                }
            } else if (i14 > 14) {
                return false;
            } else {
                int zzo = zzen.zzo();
                if (i14 == 14) {
                    zzo *= 10;
                }
                if (zzo != i13) {
                    return false;
                }
            }
        }
        return zzen.zzk() == zzew.zzh(zzen.zzH(), zzc, zzen.zzc() + -1, 0);
    }

    private static boolean zzd(zzen zzen, zzaah zzaah, boolean z10, zzaac zzaac) {
        try {
            long zzu = zzen.zzu();
            if (!z10) {
                zzu *= (long) zzaah.zzb;
            }
            zzaac.zza = zzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
