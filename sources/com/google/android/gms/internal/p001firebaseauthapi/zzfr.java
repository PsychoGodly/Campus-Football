package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfv;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzfr extends zzcz {
    private final zzfv zza;
    private final zzxu zzb;
    private final zzxt zzc;
    private final Integer zzd;

    private zzfr(zzfv zzfv, zzxu zzxu, zzxt zzxt, Integer num) {
        this.zza = zzfv;
        this.zzb = zzxu;
        this.zzc = zzxt;
        this.zzd = num;
    }

    public static zzfr zza(zzfv.zza zza2, zzxu zzxu, Integer num) throws GeneralSecurityException {
        zzxt zzxt;
        zzfv.zza zza3 = zzfv.zza.zzc;
        if (zza2 != zza3 && num == null) {
            String valueOf = String.valueOf(zza2);
            throw new GeneralSecurityException("For given Variant " + valueOf + " the value of idRequirement must be non-null");
        } else if (zza2 == zza3 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzxu.zza() == 32) {
            zzfv zza4 = zzfv.zza(zza2);
            if (zza4.zzb() == zza3) {
                zzxt = zzxt.zza(new byte[0]);
            } else if (zza4.zzb() == zzfv.zza.zzb) {
                zzxt = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zza4.zzb() == zzfv.zza.zza) {
                zzxt = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                String valueOf2 = String.valueOf(zza4.zzb());
                throw new IllegalStateException("Unknown Variant: " + valueOf2);
            }
            return new zzfr(zza4, zzxu, zzxt, num);
        } else {
            int zza5 = zzxu.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza5);
        }
    }
}
