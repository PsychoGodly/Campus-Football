package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzbt;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzod  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzod<KeyT extends zzbt, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    private zzod(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbt, PrimitiveT> zzod<KeyT, PrimitiveT> zza(zzof<KeyT, PrimitiveT> zzof, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzog(cls, cls2, zzof);
    }

    public abstract PrimitiveT zza(KeyT keyt) throws GeneralSecurityException;

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
