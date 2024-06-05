package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzh {
    public static void zza(long j10, zzen zzen, zzabb[] zzabbArr) {
        int i10;
        while (true) {
            boolean z10 = true;
            if (zzen.zza() > 1) {
                int zzc = zzc(zzen);
                int zzc2 = zzc(zzen);
                int zzc3 = zzen.zzc() + zzc2;
                if (zzc2 == -1 || zzc2 > zzen.zza()) {
                    zzee.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzen.zzd();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzk = zzen.zzk();
                    int zzo = zzen.zzo();
                    if (zzo == 49) {
                        i10 = zzen.zze();
                        zzo = 49;
                    } else {
                        i10 = 0;
                    }
                    int zzk2 = zzen.zzk();
                    if (zzo == 47) {
                        zzen.zzG(1);
                        zzo = 47;
                    }
                    boolean z11 = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                    if (zzo == 49) {
                        if (i10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        zzb(j10, zzen, zzabbArr);
                    }
                }
                zzen.zzF(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j10, zzen zzen, zzabb[] zzabbArr) {
        int zzk = zzen.zzk();
        if ((zzk & 64) != 0) {
            int i10 = zzk & 31;
            zzen.zzG(1);
            int zzc = zzen.zzc();
            for (zzabb zzabb : zzabbArr) {
                int i11 = i10 * 3;
                zzen.zzF(zzc);
                zzabb.zzq(zzen, i11);
                if (j10 != -9223372036854775807L) {
                    zzabb.zzs(j10, 1, i11, 0, (zzaba) null);
                }
            }
        }
    }

    private static int zzc(zzen zzen) {
        int i10 = 0;
        while (zzen.zza() != 0) {
            int zzk = zzen.zzk();
            i10 += zzk;
            if (zzk != 255) {
                return i10;
            }
        }
        return -1;
    }
}
