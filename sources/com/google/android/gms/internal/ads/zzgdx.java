package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgdx {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    /* synthetic */ zzgdx(zzgdt zzgdt, zzgdw zzgdw) {
        this.zza = new HashMap(zzgdt.zza);
        this.zzb = new HashMap(zzgdt.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzfxc) this.zzb.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object zzb(zzfvx zzfvx, Class cls) throws GeneralSecurityException {
        zzgdv zzgdv = new zzgdv(zzfvx.getClass(), cls, (zzgdu) null);
        if (this.zza.containsKey(zzgdv)) {
            return ((zzgdr) this.zza.get(zzgdv)).zza(zzfvx);
        }
        String obj = zzgdv.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object zzc(zzfxb zzfxb, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzfxc zzfxc = (zzfxc) this.zzb.get(cls);
            if (zzfxb.zzc().equals(zzfxc.zza()) && zzfxc.zza().equals(zzfxb.zzc())) {
                return zzfxc.zzc(zzfxb);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
