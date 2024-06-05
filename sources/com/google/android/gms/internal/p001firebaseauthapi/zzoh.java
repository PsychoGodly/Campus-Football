package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzoh<PrimitiveT, KeyProtoT extends zzakn> {
    private final Class<PrimitiveT> zza;

    public zzoh(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zza(KeyProtoT keyprotot) throws GeneralSecurityException;
}
