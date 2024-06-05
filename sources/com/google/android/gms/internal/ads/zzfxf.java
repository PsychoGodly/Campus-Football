package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxf {
    private static final Logger zza = Logger.getLogger(zzfxf.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzfwf());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();

    private zzfxf() {
    }

    @Deprecated
    public static zzfvr zza(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap concurrentMap = zze;
            Locale locale = Locale.US;
            zzfvr zzfvr = (zzfvr) concurrentMap.get(str.toLowerCase(locale));
            if (zzfvr != null) {
                return zzfvr;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzfvy zzb(String str) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zzb(str);
    }

    public static synchronized zzgky zzc(zzgld zzgld) throws GeneralSecurityException {
        zzgky zza2;
        synchronized (zzfxf.class) {
            zzfvy zzb2 = zzb(zzgld.zzg());
            if (((Boolean) zzd.get(zzgld.zzg())).booleanValue()) {
                zza2 = zzb2.zza(zzgld.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgld.zzg())));
            }
        }
        return zza2;
    }

    public static synchronized zzgrw zzd(zzgld zzgld) throws GeneralSecurityException {
        zzgrw zzb2;
        synchronized (zzfxf.class) {
            zzfvy zzb3 = zzb(zzgld.zzg());
            if (((Boolean) zzd.get(zzgld.zzg())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgld.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgld.zzg())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        try {
            return zzgde.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    static Object zzf(zzfvx zzfvx, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzc(zzfvx, cls);
    }

    public static Object zzg(zzgky zzgky, Class cls) throws GeneralSecurityException {
        return zzh(zzgky.zzg(), zzgky.zzf(), cls);
    }

    public static Object zzh(String str, zzgpe zzgpe, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zzd(zzgpe);
    }

    public static Object zzi(String str, zzgrw zzgrw, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zze(zzgrw);
    }

    public static Object zzj(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzh(str, zzgpe.zzv(bArr), cls);
    }

    public static Object zzk(zzfxb zzfxb, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzd(zzfxb, cls);
    }

    static synchronized Map zzl() {
        Map unmodifiableMap;
        synchronized (zzfxf.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzf);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzm(zzgdy zzgdy, zzgcu zzgcu, boolean z10) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            AtomicReference atomicReference = zzb;
            zzfwf zzfwf = new zzfwf((zzfwf) atomicReference.get());
            zzfwf.zzc(zzgdy, zzgcu);
            Map zzc2 = zzgdy.zza().zzc();
            String zzd2 = zzgdy.zzd();
            zzq(zzd2, zzc2, true);
            String zzd3 = zzgcu.zzd();
            zzq(zzd3, Collections.emptyMap(), false);
            if (!((zzfwf) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzfxe(zzgdy));
                zzr(zzgdy.zzd(), zzgdy.zza().zzc());
            }
            ConcurrentMap concurrentMap = zzd;
            concurrentMap.put(zzd2, Boolean.TRUE);
            concurrentMap.put(zzd3, Boolean.FALSE);
            atomicReference.set(zzfwf);
        }
    }

    public static synchronized void zzn(zzfvy zzfvy, boolean z10) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            if (zzfvy != null) {
                try {
                    AtomicReference atomicReference = zzb;
                    zzfwf zzfwf = new zzfwf((zzfwf) atomicReference.get());
                    zzfwf.zzd(zzfvy);
                    if (zzgas.zza(1)) {
                        String zzf2 = zzfvy.zzf();
                        zzq(zzf2, Collections.emptyMap(), z10);
                        zzd.put(zzf2, Boolean.valueOf(z10));
                        atomicReference.set(zzfwf);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized void zzo(zzgcu zzgcu, boolean z10) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            AtomicReference atomicReference = zzb;
            zzfwf zzfwf = new zzfwf((zzfwf) atomicReference.get());
            zzfwf.zze(zzgcu);
            Map zzc2 = zzgcu.zza().zzc();
            String zzd2 = zzgcu.zzd();
            zzq(zzd2, zzc2, true);
            if (!((zzfwf) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzfxe(zzgcu));
                zzr(zzd2, zzgcu.zza().zzc());
            }
            zzd.put(zzd2, Boolean.TRUE);
            atomicReference.set(zzfwf);
        }
    }

    public static synchronized void zzp(zzfxc zzfxc) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            zzgde.zza().zzf(zzfxc);
        }
    }

    private static synchronized void zzq(String str, Map map, boolean z10) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            if (z10) {
                ConcurrentMap concurrentMap = zzd;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((zzfwf) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzf.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzf.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgrw] */
    private static void zzr(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzf.put((String) entry.getKey(), zzfwh.zze(str, ((zzgcs) entry.getValue()).zza.zzax(), ((zzgcs) entry.getValue()).zzb));
        }
    }
}
