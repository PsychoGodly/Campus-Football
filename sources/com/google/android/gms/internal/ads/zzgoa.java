package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgoa extends ThreadLocal {
    final /* synthetic */ zzgob zza;

    zzgoa(zzgob zzgob) {
        this.zza = zzgob;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzgnn.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
