package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import v4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbnx implements e {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;
    private final String zzh;

    public zzbnx(Date date, int i10, Set set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = z11;
        this.zzh = str;
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

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
