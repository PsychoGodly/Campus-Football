package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzmq {
    private static final Logger zza = Logger.getLogger(zzmq.class.getName());
    private final ConcurrentMap<String, zza> zzb;
    private final ConcurrentMap<String, Boolean> zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmq$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    private interface zza {
        zzbs<?> zza();

        <P> zzbs<P> zza(Class<P> cls) throws GeneralSecurityException;

        Class<?> zzb();

        Set<Class<?>> zzc();
    }

    public zzmq() {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
    }

    private final synchronized zza zzc(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (zza) this.zzb.get(str);
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzc2 = zzc(str);
        if (zzc2.zzc().contains(cls)) {
            return zzc2.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzc2.zzb());
        Set<Class<?>> zzc3 = zzc2.zzc();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class next : zzc3) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(next.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb3);
    }

    public final boolean zzb(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public zzmq(zzmq zzmq) {
        this.zzb = new ConcurrentHashMap(zzmq.zzb);
        this.zzc = new ConcurrentHashMap(zzmq.zzc);
    }

    public final zzbs<?> zza(String str) throws GeneralSecurityException {
        return zzc(str).zza();
    }

    private static <KeyProtoT extends zzakn> zza zza(zznb<KeyProtoT> zznb) {
        return new zzmt(zznb);
    }

    public final synchronized <KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> void zza(zzop<KeyProtoT, PublicKeyProtoT> zzop, zznb<PublicKeyProtoT> zznb, boolean z10) throws GeneralSecurityException {
        zzif.zza zzb2 = zzop.zzb();
        zzif.zza zzb3 = zznb.zzb();
        if (!zzb2.zza()) {
            String valueOf = String.valueOf(zzop.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzb3.zza()) {
            zza((zza) new zzms(zzop, zznb), true, true);
            zza(zza(zznb), false, false);
        } else {
            String valueOf2 = String.valueOf(zznb.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized <KeyProtoT extends zzakn> void zza(zznb<KeyProtoT> zznb, boolean z10) throws GeneralSecurityException {
        if (zznb.zzb().zza()) {
            zza(zza(zznb), false, true);
        } else {
            String valueOf = String.valueOf(zznb.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    private final synchronized void zza(zza zza2, boolean z10, boolean z11) throws GeneralSecurityException {
        String zza3 = zza2.zza().zza();
        if (z11 && this.zzc.containsKey(zza3)) {
            if (!((Boolean) this.zzc.get(zza3)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zza3);
            }
        }
        zza zza4 = (zza) this.zzb.get(zza3);
        if (zza4 != null) {
            if (!zza4.zzb().equals(zza2.zzb())) {
                Logger logger = zza;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type " + zza3);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zza3, zza4.zzb().getName(), zza2.zzb().getName()}));
            }
        }
        if (!z10) {
            this.zzb.putIfAbsent(zza3, zza2);
        } else {
            this.zzb.put(zza3, zza2);
        }
        this.zzc.put(zza3, Boolean.valueOf(z11));
    }
}
