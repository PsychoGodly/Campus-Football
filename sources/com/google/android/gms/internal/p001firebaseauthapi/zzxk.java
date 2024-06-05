package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxk implements zzrx {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final ThreadLocal<Mac> zzb;
    /* access modifiers changed from: private */
    public final String zzc;
    /* access modifiers changed from: private */
    public final Key zzd;
    private final int zze;

    public zzxk(String str, Key key) throws GeneralSecurityException {
        zzxn zzxn = new zzxn(this);
        this.zzb = zzxn;
        if (zza.zza()) {
            this.zzc = str;
            this.zzd = key;
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.zze = 20;
                        break;
                    case 1:
                        this.zze = 28;
                        break;
                    case 2:
                        this.zze = 32;
                        break;
                    case 3:
                        this.zze = 48;
                        break;
                    case 4:
                        this.zze = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                zzxn.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 <= this.zze) {
            this.zzb.get().update(bArr);
            return Arrays.copyOf(this.zzb.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
