package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfaq extends a {
    public static final Parcelable.Creator<zzfaq> CREATOR = new zzfar();
    public final Context zza;
    public final zzfan zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfan[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfaq(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        zzfan[] values = zzfan.values();
        this.zzh = values;
        int[] zza2 = zzfao.zza();
        this.zzl = zza2;
        int[] zza3 = zzfap.zza();
        this.zzm = zza3;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza2[i14];
        this.zzk = i15;
        int i16 = zza3[i15];
    }

    public static zzfaq zza(zzfan zzfan, Context context) {
        if (zzfan == zzfan.Rewarded) {
            return new zzfaq(context, zzfan, ((Integer) a0.c().zzb(zzbar.zzfV)).intValue(), ((Integer) a0.c().zzb(zzbar.zzgb)).intValue(), ((Integer) a0.c().zzb(zzbar.zzgd)).intValue(), (String) a0.c().zzb(zzbar.zzgf), (String) a0.c().zzb(zzbar.zzfX), (String) a0.c().zzb(zzbar.zzfZ));
        } else if (zzfan == zzfan.Interstitial) {
            return new zzfaq(context, zzfan, ((Integer) a0.c().zzb(zzbar.zzfW)).intValue(), ((Integer) a0.c().zzb(zzbar.zzgc)).intValue(), ((Integer) a0.c().zzb(zzbar.zzge)).intValue(), (String) a0.c().zzb(zzbar.zzgg), (String) a0.c().zzb(zzbar.zzfY), (String) a0.c().zzb(zzbar.zzga));
        } else if (zzfan != zzfan.AppOpen) {
            return null;
        } else {
            return new zzfaq(context, zzfan, ((Integer) a0.c().zzb(zzbar.zzgj)).intValue(), ((Integer) a0.c().zzb(zzbar.zzgl)).intValue(), ((Integer) a0.c().zzb(zzbar.zzgm)).intValue(), (String) a0.c().zzb(zzbar.zzgh), (String) a0.c().zzb(zzbar.zzgi), (String) a0.c().zzb(zzbar.zzgk));
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zzi);
        c.k(parcel, 2, this.zzc);
        c.k(parcel, 3, this.zzd);
        c.k(parcel, 4, this.zze);
        c.q(parcel, 5, this.zzf, false);
        c.k(parcel, 6, this.zzj);
        c.k(parcel, 7, this.zzk);
        c.b(parcel, a10);
    }

    private zzfaq(Context context, zzfan zzfan, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfan.values();
        this.zzl = zzfao.zza();
        this.zzm = zzfap.zza();
        this.zza = context;
        this.zzi = zzfan.ordinal();
        this.zzb = zzfan;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
