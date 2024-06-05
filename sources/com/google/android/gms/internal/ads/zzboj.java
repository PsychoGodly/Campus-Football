package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.internal.client.m3;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.nativead.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4.b0;
import q4.e;
import v4.u;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzboj implements u {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbdl zzg;
    private final List zzh = new ArrayList();
    private final boolean zzi;
    private final Map zzj = new HashMap();
    private final String zzk;

    public zzboj(Date date, int i10, Set set, Location location, boolean z10, int i11, zzbdl zzbdl, List list, boolean z11, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = zzbdl;
        this.zzi = z11;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return m3.g().b();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final e getNativeAdOptions() {
        zzbdl zzbdl = this.zzg;
        e.a aVar = new e.a();
        if (zzbdl == null) {
            return aVar.a();
        }
        int i10 = zzbdl.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(zzbdl.zzg);
                    aVar.d(zzbdl.zzh);
                }
                aVar.g(zzbdl.zzb);
                aVar.c(zzbdl.zzc);
                aVar.f(zzbdl.zzd);
                return aVar.a();
            }
            n4 n4Var = zzbdl.zzf;
            if (n4Var != null) {
                aVar.h(new b0(n4Var));
            }
        }
        aVar.b(zzbdl.zze);
        aVar.g(zzbdl.zzb);
        aVar.c(zzbdl.zzc);
        aVar.f(zzbdl.zzd);
        return aVar.a();
    }

    public final c getNativeAdRequestOptions() {
        return zzbdl.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return m3.g().x();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final Map zza() {
        return this.zzj;
    }

    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
