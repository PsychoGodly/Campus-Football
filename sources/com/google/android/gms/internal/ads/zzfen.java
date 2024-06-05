package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfen implements Runnable {
    private final List zza = new ArrayList();
    private final zzfep zzb;
    private String zzc;
    private String zzd;
    private zzeyn zze;
    private c3 zzf;
    private Future zzg;
    private int zzh = 2;

    zzfen(zzfep zzfep) {
        this.zzb = zzfep;
    }

    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfen zza(zzfec zzfec) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfec.zzi();
            list.add(zzfec);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzbzn.zzd.schedule(this, (long) ((Integer) a0.c().zzb(zzbar.zzhZ)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfen zzb(String str) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue() && zzfem.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfen zzc(c3 c3Var) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzf = c3Var;
        }
        return this;
    }

    public final synchronized zzfen zzd(ArrayList arrayList) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(b.f20900a.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(b.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(b.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(b.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzh = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(b.REWARDED_INTERSTITIAL.name())) {
                                                this.zzh = 6;
                                            }
                                        }
                                    }
                                    this.zzh = 5;
                                }
                            }
                            this.zzh = 8;
                        }
                    }
                    this.zzh = 4;
                }
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfen zze(String str) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfen zzf(zzeyn zzeyn) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zze = zzeyn;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfec zzfec : this.zza) {
                int i10 = this.zzh;
                if (i10 != 2) {
                    zzfec.zzm(i10);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfec.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfec.zzk()) {
                    zzfec.zzd(this.zzd);
                }
                zzeyn zzeyn = this.zze;
                if (zzeyn != null) {
                    zzfec.zzb(zzeyn);
                } else {
                    c3 c3Var = this.zzf;
                    if (c3Var != null) {
                        zzfec.zza(c3Var);
                    }
                }
                this.zzb.zzb(zzfec.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfen zzh(int i10) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzh = i10;
        }
        return this;
    }
}
