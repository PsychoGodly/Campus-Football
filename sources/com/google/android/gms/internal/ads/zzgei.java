package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgei {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    /* synthetic */ zzgei(zzgec zzgec, zzgeh zzgeh) {
        this.zza = new HashMap(zzgec.zza);
        this.zzb = new HashMap(zzgec.zzb);
        this.zzc = new HashMap(zzgec.zzc);
        this.zzd = new HashMap(zzgec.zzd);
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) throws GeneralSecurityException {
        zzgee zzgee = new zzgee(zzgeb.getClass(), zzgeb.zzd(), (zzged) null);
        if (this.zzb.containsKey(zzgee)) {
            return ((zzgcn) this.zzb.get(zzgee)).zza(zzgeb, zzfxg);
        }
        String obj = zzgee.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final boolean zzf(zzgeb zzgeb) {
        return this.zzb.containsKey(new zzgee(zzgeb.getClass(), zzgeb.zzd(), (zzged) null));
    }
}
