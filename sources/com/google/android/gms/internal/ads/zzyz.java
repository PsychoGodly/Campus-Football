package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzyz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzyz(List list, int i10, int i11, int i12, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = f10;
        this.zzf = str;
    }

    public static zzyz zza(zzen zzen) throws zzbu {
        String str;
        float f10;
        int i10;
        int i11;
        try {
            zzen.zzG(4);
            int zzk = (zzen.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzen.zzk() & 31;
                for (int i12 = 0; i12 < zzk2; i12++) {
                    arrayList.add(zzb(zzen));
                }
                int zzk3 = zzen.zzk();
                for (int i13 = 0; i13 < zzk3; i13++) {
                    arrayList.add(zzb(zzen));
                }
                if (zzk2 > 0) {
                    zzaaq zzd2 = zzaar.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i14 = zzd2.zze;
                    int i15 = zzd2.zzf;
                    float f11 = zzd2.zzg;
                    str = zzdn.zza(zzd2.zza, zzd2.zzb, zzd2.zzc);
                    i11 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i11 = -1;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new zzyz(arrayList, zzk, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbu.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzen zzen) {
        int zzo = zzen.zzo();
        int zzc2 = zzen.zzc();
        zzen.zzG(zzo);
        return zzdn.zzc(zzen.zzH(), zzc2, zzo);
    }
}
