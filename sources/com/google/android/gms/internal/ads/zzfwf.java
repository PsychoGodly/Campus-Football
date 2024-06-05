package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfwf {
    private static final Logger zza = Logger.getLogger(zzfwf.class.getName());
    private final ConcurrentMap zzb;

    zzfwf() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzfwe zzg(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfwe) this.zzb.get(str);
    }

    private final synchronized void zzh(zzfwe zzfwe, boolean z10) throws GeneralSecurityException {
        String zzf = zzfwe.zzb().zzf();
        zzfwe zzfwe2 = (zzfwe) this.zzb.get(zzf);
        if (zzfwe2 != null) {
            if (!zzfwe2.zzc().equals(zzfwe.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzf, zzfwe2.zzc().getName(), zzfwe.zzc().getName()}));
            }
        }
        if (!z10) {
            this.zzb.putIfAbsent(zzf, zzfwe);
        } else {
            this.zzb.put(zzf, zzfwe);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzfvy zza(String str, Class cls) throws GeneralSecurityException {
        zzfwe zzg = zzg(str);
        if (zzg.zze().contains(cls)) {
            return zzg.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.zzc());
        Set<Class> zze = zzg.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zze) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb3);
    }

    /* access modifiers changed from: package-private */
    public final zzfvy zzb(String str) throws GeneralSecurityException {
        return zzg(str).zzb();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(zzgdy zzgdy, zzgcu zzgcu) throws GeneralSecurityException {
        Class zzd;
        if (!zzgas.zza(1)) {
            String valueOf = String.valueOf(zzgdy.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzgas.zza(zzgcu.zzf())) {
            String zzd2 = zzgdy.zzd();
            String zzd3 = zzgcu.zzd();
            if (!(!this.zzb.containsKey(zzd2) || ((zzfwe) this.zzb.get(zzd2)).zzd() == null || (zzd = ((zzfwe) this.zzb.get(zzd2)).zzd()) == null)) {
                if (!zzd.getName().equals(zzgcu.getClass().getName())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgdy.getClass().getName(), zzd.getName(), zzgcu.getClass().getName()}));
                }
            }
            zzh(new zzfwd(zzgdy, zzgcu), true);
            zzh(new zzfwc(zzgcu), false);
        } else {
            String valueOf2 = String.valueOf(zzgcu.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzfvy zzfvy) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            zzh(new zzfwb(zzfvy), false);
        } else {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(zzgcu zzgcu) throws GeneralSecurityException {
        if (zzgas.zza(zzgcu.zzf())) {
            zzh(new zzfwc(zzgcu), false);
        } else {
            String valueOf = String.valueOf(zzgcu.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    zzfwf(zzfwf zzfwf) {
        this.zzb = new ConcurrentHashMap(zzfwf.zzb);
    }
}
