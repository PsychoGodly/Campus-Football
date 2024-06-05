package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzq {
    public final String zza;

    private zzzq(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzzq zza(zzen zzen) {
        String str;
        zzen.zzG(2);
        int zzk = zzen.zzk();
        int i10 = zzk >> 1;
        int i11 = zzk & 1;
        int zzk2 = zzen.zzk() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i12 = zzk2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (i12 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(i12);
        return new zzzq(i10, i12, sb2.toString());
    }
}
