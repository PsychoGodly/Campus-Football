package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwk implements zzbr {
    private static final byte[] zza = new byte[0];
    private final zzwm zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzwr zze;
    private final zzwi zzf;

    public zzwk(ECPublicKey eCPublicKey, byte[] bArr, String str, zzwr zzwr, zzwi zzwi) throws GeneralSecurityException {
        zzmg.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzwm(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzwr;
        this.zzf = zzwi;
    }
}
