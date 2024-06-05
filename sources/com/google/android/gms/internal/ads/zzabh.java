package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzabh {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzbq zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] zzai = zzew.zzai(str, "=");
            if (zzai.length != 2) {
                zzee.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzai[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacu.zzb(new zzen(Base64.decode(zzai[1], 0))));
                } catch (RuntimeException e10) {
                    zzee.zzf("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaek(zzai[0], zzai[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq((List) arrayList);
    }

    public static zzabe zzc(zzen zzen, boolean z10, boolean z11) throws zzbu {
        if (z10) {
            zzd(3, zzen, false);
        }
        String zzx = zzen.zzx((int) zzen.zzq(), zzfnh.zzc);
        int length = zzx.length();
        long zzq = zzen.zzq();
        String[] strArr = new String[((int) zzq)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < zzq; i11++) {
            String zzx2 = zzen.zzx((int) zzen.zzq(), zzfnh.zzc);
            strArr[i11] = zzx2;
            i10 = i10 + 4 + zzx2.length();
        }
        if (!z11 || (zzen.zzk() & 1) != 0) {
            return new zzabe(zzx, strArr, i10 + 1);
        }
        throw zzbu.zza("framing bit expected to be set", (Throwable) null);
    }

    public static boolean zzd(int i10, zzen zzen, boolean z10) throws zzbu {
        if (zzen.zza() < 7) {
            if (z10) {
                return false;
            }
            int zza = zzen.zza();
            throw zzbu.zza("too short header: " + zza, (Throwable) null);
        } else if (zzen.zzk() != i10) {
            if (z10) {
                return false;
            }
            throw zzbu.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), (Throwable) null);
        } else if (zzen.zzk() == 118 && zzen.zzk() == 111 && zzen.zzk() == 114 && zzen.zzk() == 98 && zzen.zzk() == 105 && zzen.zzk() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzbu.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
