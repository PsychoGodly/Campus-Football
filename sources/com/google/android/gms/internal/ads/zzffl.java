package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffl {
    private final zzffs zza;
    private final zzffs zzb;
    private final zzffp zzc;
    private final zzffr zzd;

    private zzffl(zzffp zzffp, zzffr zzffr, zzffs zzffs, zzffs zzffs2, boolean z10) {
        this.zzc = zzffp;
        this.zzd = zzffr;
        this.zza = zzffs;
        if (zzffs2 == null) {
            this.zzb = zzffs.NONE;
        } else {
            this.zzb = zzffs2;
        }
    }

    public static zzffl zza(zzffp zzffp, zzffr zzffr, zzffs zzffs, zzffs zzffs2, boolean z10) {
        zzfgr.zzb(zzffr, "ImpressionType is null");
        zzfgr.zzb(zzffs, "Impression owner is null");
        if (zzffs == zzffs.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzffp == zzffp.DEFINED_BY_JAVASCRIPT && zzffs == zzffs.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzffr != zzffr.DEFINED_BY_JAVASCRIPT || zzffs != zzffs.NATIVE) {
            return new zzffl(zzffp, zzffr, zzffs, zzffs2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfgp.zzh(jSONObject, "impressionOwner", this.zza);
        zzfgp.zzh(jSONObject, "mediaEventsOwner", this.zzb);
        zzfgp.zzh(jSONObject, "creativeType", this.zzc);
        zzfgp.zzh(jSONObject, "impressionType", this.zzd);
        zzfgp.zzh(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
