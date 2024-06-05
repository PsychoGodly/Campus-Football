package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdg extends zzbdo {
    static final int zza = Color.rgb(204, 204, 204);
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        zzb = rgb;
    }

    public zzbdg(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        this.zzd = str;
        for (int i14 = 0; i14 < list.size(); i14++) {
            zzbdj zzbdj = (zzbdj) list.get(i14);
            this.zze.add(zzbdj);
            this.zzf.add(zzbdj);
        }
        if (num != null) {
            i12 = num.intValue();
        } else {
            i12 = zza;
        }
        this.zzg = i12;
        if (num2 != null) {
            i13 = num2.intValue();
        } else {
            i13 = zzb;
        }
        this.zzh = i13;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i10;
        this.zzk = i11;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
