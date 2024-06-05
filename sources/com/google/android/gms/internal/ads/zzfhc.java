package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfhc extends zzfhd {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfhc(zzfgv zzfgv, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfgv, (byte[]) null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
