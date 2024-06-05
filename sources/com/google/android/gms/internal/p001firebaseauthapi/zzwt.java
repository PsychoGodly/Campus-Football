package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzxb;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwt<T_WRAPPER extends zzxb<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzwt<zzxa, Cipher> zza = new zzwt<>(new zzxa());
    public static final zzwt<zzxe, Mac> zzb = new zzwt<>(new zzxe());
    public static final zzwt<zzxd, KeyAgreement> zzc = new zzwt<>(new zzxd());
    public static final zzwt<zzxf, KeyPairGenerator> zzd = new zzwt<>(new zzxf());
    public static final zzwt<zzxc, KeyFactory> zze = new zzwt<>(new zzxc());
    private static final zzwt<zzxg, Signature> zzf = new zzwt<>(new zzxg());
    private static final zzwt<zzxh, MessageDigest> zzg = new zzwt<>(new zzxh());
    private final zzwy<JcePrimitiveT> zzh;

    private zzwt(T_WRAPPER t_wrapper) {
        if (zzif.zzb()) {
            this.zzh = new zzww(t_wrapper);
        } else if (zzxp.zza()) {
            this.zzh = new zzws(t_wrapper);
        } else {
            this.zzh = new zzwu(t_wrapper);
        }
    }

    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }

    public static List<Provider> zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }
}
