package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgh implements zzbg {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final zzvb zzc;
    private final zzbg zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzgh(zzvb zzvb, zzbg zzbg) {
        if (zza(zzvb.zzf())) {
            this.zzc = zzvb;
            this.zzd = zzbg;
            return;
        }
        String zzf = zzvb.zzf();
        throw new IllegalArgumentException("Unsupported DEK key type: " + zzf + ". Only Tink AEAD key types are supported.");
    }

    public static boolean zza(String str) {
        return zzb.contains(str);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzg = zzct.zza(this.zzc).zze().zzg();
        byte[] zzb2 = this.zzd.zzb(zzg, zza);
        byte[] zzb3 = ((zzbg) zzct.zza(this.zzc.zzf(), zzg, zzbg.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzbg) zzct.zza(this.zzc.zzf(), this.zzd.zza(bArr3, zza), zzbg.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
