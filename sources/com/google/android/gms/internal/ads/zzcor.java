package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzcor {
    private final zzcqk zza;
    private final View zzb;
    private final zzeyd zzc;
    private final zzcei zzd;

    public zzcor(View view, zzcei zzcei, zzcqk zzcqk, zzeyd zzeyd) {
        this.zzb = view;
        this.zzd = zzcei;
        this.zza = zzcqk;
        this.zzc = zzeyd;
    }

    public static final zzdbu zzf(Context context, zzbzg zzbzg, zzeyc zzeyc, zzeyx zzeyx) {
        return new zzdbu(new zzcop(context, zzbzg, zzeyc, zzeyx), zzbzn.zzf);
    }

    public static final Set zzg(zzcqb zzcqb) {
        return Collections.singleton(new zzdbu(zzcqb, zzbzn.zzf));
    }

    public static final zzdbu zzh(zzcpz zzcpz) {
        return new zzdbu(zzcpz, zzbzn.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcei zzb() {
        return this.zzd;
    }

    public final zzcqk zzc() {
        return this.zza;
    }

    public zzcwa zzd(Set set) {
        return new zzcwa(set);
    }

    public final zzeyd zze() {
        return this.zzc;
    }
}
