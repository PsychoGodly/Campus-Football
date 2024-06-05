package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzhx extends zzia {
    public zzhx(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final zzhy zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhv(bArr, i10);
    }

    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2, bArr3);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zza(byteBuffer, bArr, bArr2);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return super.zza(bArr, bArr2, bArr3);
    }
}
