package com.google.android.gms.internal.ads;

import androidx.collection.g;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgt {
    public static final zzdgt zza = new zzdgt(new zzdgr());
    private final zzbey zzb;
    private final zzbev zzc;
    private final zzbfl zzd;
    private final zzbfi zze;
    private final zzbkg zzf;
    private final g zzg;
    private final g zzh;

    private zzdgt(zzdgr zzdgr) {
        this.zzb = zzdgr.zza;
        this.zzc = zzdgr.zzb;
        this.zzd = zzdgr.zzc;
        this.zzg = new g(zzdgr.zzf);
        this.zzh = new g(zzdgr.zzg);
        this.zze = zzdgr.zzd;
        this.zzf = zzdgr.zze;
    }

    public final zzbev zza() {
        return this.zzc;
    }

    public final zzbey zzb() {
        return this.zzb;
    }

    public final zzbfb zzc(String str) {
        return (zzbfb) this.zzh.get(str);
    }

    public final zzbfe zzd(String str) {
        return (zzbfe) this.zzg.get(str);
    }

    public final zzbfi zze() {
        return this.zze;
    }

    public final zzbfl zzf() {
        return this.zzd;
    }

    public final zzbkg zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            arrayList.add((String) this.zzg.j(i10));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
