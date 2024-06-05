package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzct  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzct {
    private static final Logger zza = Logger.getLogger(zzct.class.getName());
    private static final AtomicReference<zzmq> zzb = new AtomicReference<>(new zzmq());
    private static final ConcurrentMap<String, Object> zzc = new ConcurrentHashMap();
    private static final Set<Class<?>> zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzbg.class);
        hashSet.add(zzbp.class);
        hashSet.add(zzcv.class);
        hashSet.add(zzbr.class);
        hashSet.add(zzbo.class);
        hashSet.add(zzce.class);
        hashSet.add(zzrx.class);
        hashSet.add(zzcr.class);
        hashSet.add(zzcq.class);
        zzd = Collections.unmodifiableSet(hashSet);
    }

    private zzct() {
    }

    @Deprecated
    private static <P> zzbs<P> zza(String str) throws GeneralSecurityException {
        return zzb.get().zza(str);
    }

    public static zzuy zza(String str, zzahp zzahp) throws GeneralSecurityException {
        zzbs zza2 = zza(str);
        if (zza2 instanceof zzco) {
            return ((zzco) zza2).zzc(zzahp);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    public static synchronized zzuy zza(zzvb zzvb) throws GeneralSecurityException {
        zzuy zza2;
        synchronized (zzct.class) {
            AtomicReference<zzmq> atomicReference = zzb;
            zzbs<?> zza3 = atomicReference.get().zza(zzvb.zzf());
            if (atomicReference.get().zzb(zzvb.zzf())) {
                zza2 = zza3.zza(zzvb.zze());
            } else {
                String zzf = zzvb.zzf();
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + zzf);
            }
        }
        return zza2;
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zznr.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Deprecated
    static <P> P zza(zzuy zzuy) throws GeneralSecurityException {
        String zzf = zzuy.zzf();
        return zza(zzf).zzb(zzuy.zze());
    }

    public static <P> P zza(zzuy zzuy, Class<P> cls) throws GeneralSecurityException {
        return zza(zzuy.zzf(), zzuy.zze(), cls);
    }

    public static <P> P zza(String str, zzahp zzahp, Class<P> cls) throws GeneralSecurityException {
        return zzb.get().zza(str, cls).zzb(zzahp);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return zza(str, zzahp.zza(bArr), cls);
    }

    public static <B, P> P zza(zzcg<B> zzcg, Class<P> cls) throws GeneralSecurityException {
        return zznr.zza().zza(zzcg, cls);
    }

    public static synchronized <KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> void zza(zzop<KeyProtoT, PublicKeyProtoT> zzop, zznb<PublicKeyProtoT> zznb, boolean z10) throws GeneralSecurityException {
        synchronized (zzct.class) {
            AtomicReference<zzmq> atomicReference = zzb;
            zzmq zzmq = new zzmq(atomicReference.get());
            zzmq.zza(zzop, zznb, true);
            atomicReference.set(zzmq);
        }
    }

    public static synchronized <KeyProtoT extends zzakn> void zza(zznb<KeyProtoT> zznb, boolean z10) throws GeneralSecurityException {
        synchronized (zzct.class) {
            AtomicReference<zzmq> atomicReference = zzb;
            zzmq zzmq = new zzmq(atomicReference.get());
            zzmq.zza(zznb, true);
            atomicReference.set(zzmq);
        }
    }

    public static synchronized <B, P> void zza(zzcp<B, P> zzcp) throws GeneralSecurityException {
        synchronized (zzct.class) {
            zznr.zza().zza(zzcp);
        }
    }
}
