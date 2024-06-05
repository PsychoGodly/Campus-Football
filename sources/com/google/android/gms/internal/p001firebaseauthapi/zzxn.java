package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzxn extends ThreadLocal<Mac> {
    private final /* synthetic */ zzxk zza;

    zzxn(zzxk zzxk) {
        this.zza = zzxk;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac zza2 = zzwt.zzb.zza(this.zza.zzc);
            zza2.init(this.zza.zzd);
            return zza2;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
