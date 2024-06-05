package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezj {
    public zzezj() {
        try {
            zzfxi.zza();
        } catch (GeneralSecurityException e10) {
            n1.a("Failed to Configure Aead. ".concat(e10.toString()));
            t.q().zzu(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgpb zzt = zzgpe.zzt();
        try {
            zzfvs.zzb(zzfwp.zzb(zzfwi.zza("AES128_GCM")), zzfvq.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            n1.a("Failed to generate key".concat(e10.toString()));
            t.q().zzu(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpd zzdpd) {
        zzfwp zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfvo) zzc.zzd(zzfvo.class)).zza(bArr, bArr2);
            zzdpd.zza().put("ds", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            n1.a("Failed to decrypt ".concat(e10.toString()));
            t.q().zzu(e10, "CryptoUtils.decrypt");
            zzdpd.zza().put("dsf", e10.toString());
            return null;
        }
    }

    private static final zzfwp zzc(String str) {
        try {
            return zzfvs.zza(zzfvp.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            n1.a("Failed to get keysethandle".concat(e10.toString()));
            t.q().zzu(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
