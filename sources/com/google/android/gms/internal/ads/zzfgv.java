package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgv {
    private JSONObject zza;
    private final zzfhe zzb;

    public zzfgv(zzfhe zzfhe) {
        this.zzb = zzfhe;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfhf(this, (byte[]) null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfhg(this, hashSet, jSONObject, j10, (byte[]) null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfhh(this, hashSet, jSONObject, j10, (byte[]) null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
