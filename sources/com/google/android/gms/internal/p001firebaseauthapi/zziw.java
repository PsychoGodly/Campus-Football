package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzik;
import com.google.android.gms.internal.p001firebaseauthapi.zzir;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zziw {
    private static final zzxt zza;
    private static final zznz<zzir, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzik, zzos> zzd;
    private static final zzmu<zzos> zze;
    private static final Map<zzir.zzb, zzvs> zzf;
    private static final Map<zzvs, zzir.zzb> zzg;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzix, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zznz.zza(zziv.zza, zzir.class, cls2);
        zzc = zznv.zza(zziy.zza, zzb2, cls2);
        zzd = zzmx.zza(zzix.zza, zzik.class, cls);
        zze = zzmu.zza(zzja.zza, zzb2, cls);
        HashMap hashMap = new HashMap();
        zzir.zzb zzb3 = zzir.zzb.zzc;
        zzvs zzvs = zzvs.RAW;
        hashMap.put(zzb3, zzvs);
        zzir.zzb zzb4 = zzir.zzb.zza;
        zzvs zzvs2 = zzvs.TINK;
        hashMap.put(zzb4, zzvs2);
        zzir.zzb zzb5 = zzir.zzb.zzb;
        zzvs zzvs3 = zzvs.CRUNCHY;
        hashMap.put(zzb5, zzvs3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzvs.class);
        enumMap.put(zzvs, zzb3);
        enumMap.put(zzvs2, zzb4);
        enumMap.put(zzvs3, zzb5);
        enumMap.put(zzvs.LEGACY, zzb5);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zzir.zzb zza(zzvs zzvs) throws GeneralSecurityException {
        Map<zzvs, zzir.zzb> map = zzg;
        if (map.containsKey(zzvs)) {
            return map.get(zzvs);
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzik zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztc zza2 = zztc.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return new zzik.zza().zza(zzir.zzc().zza(zza2.zzd().zzb()).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
    }

    public static /* synthetic */ zzor zza(zzir zzir) {
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztd) ((zzajc) zztd.zzc().zza(zzir.zzb()).zzf())).zzi());
        zzir.zzb zzd2 = zzir.zzd();
        Map<zzir.zzb, zzvs> map = zzf;
        if (map.containsKey(zzd2)) {
            return zzor.zzb((zzvb) ((zzajc) zza2.zza(map.get(zzd2)).zzf()));
        }
        String valueOf = String.valueOf(zzd2);
        throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* access modifiers changed from: private */
    public static zzir zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztd zza2 = zztd.zza(zzor.zza().zze(), zzaio.zza());
                if (zza2.zzb() == 0) {
                    return zzir.zzc().zza(zza2.zza()).zza(zza(zzor.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
            }
        } else {
            String zzf2 = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzf2);
        }
    }
}
