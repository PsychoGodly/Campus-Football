package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgde {
    private static final zzgde zza = new zzgde();
    private final AtomicReference zzb = new AtomicReference(new zzgdx(new zzgdt(), (zzgdw) null));

    zzgde() {
    }

    public static zzgde zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzfvx zzfvx, Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zzb(zzfvx, cls);
    }

    public final Object zzd(zzfxb zzfxb, Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zzc(zzfxb, cls);
    }

    public final synchronized void zze(zzgdr zzgdr) throws GeneralSecurityException {
        zzgdt zzgdt = new zzgdt((zzgdx) this.zzb.get());
        zzgdt.zza(zzgdr);
        this.zzb.set(new zzgdx(zzgdt, (zzgdw) null));
    }

    public final synchronized void zzf(zzfxc zzfxc) throws GeneralSecurityException {
        zzgdt zzgdt = new zzgdt((zzgdx) this.zzb.get());
        zzgdt.zzb(zzfxc);
        this.zzb.set(new zzgdx(zzgdt, (zzgdw) null));
    }
}
