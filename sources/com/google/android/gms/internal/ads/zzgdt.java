package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgdt {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    public zzgdt() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgdt zza(zzgdr zzgdr) throws GeneralSecurityException {
        zzgdv zzgdv = new zzgdv(zzgdr.zzc(), zzgdr.zzd(), (zzgdu) null);
        if (this.zza.containsKey(zzgdv)) {
            zzgdr zzgdr2 = (zzgdr) this.zza.get(zzgdv);
            if (!zzgdr2.equals(zzgdr) || !zzgdr.equals(zzgdr2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgdv.toString()));
            }
        } else {
            this.zza.put(zzgdv, zzgdr);
        }
        return this;
    }

    public final zzgdt zzb(zzfxc zzfxc) throws GeneralSecurityException {
        Objects.requireNonNull(zzfxc, "wrapper must be non-null");
        Map map = this.zzb;
        Class zzb2 = zzfxc.zzb();
        if (map.containsKey(zzb2)) {
            zzfxc zzfxc2 = (zzfxc) this.zzb.get(zzb2);
            if (!zzfxc2.equals(zzfxc) || !zzfxc.equals(zzfxc2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb2.toString()));
            }
        } else {
            this.zzb.put(zzb2, zzfxc);
        }
        return this;
    }

    public zzgdt(zzgdx zzgdx) {
        this.zza = new HashMap(zzgdx.zza);
        this.zzb = new HashMap(zzgdx.zzb);
    }
}
