package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzatb {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzatb(String str, zzbzg zzbzg, String str2, JSONObject jSONObject, boolean z10, boolean z11) {
        this.zzd = zzbzg.zza;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z11;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}
