package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzop  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzop<KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> extends zznb<KeyProtoT> {
    private final Class<PublicKeyProtoT> zza;

    @SafeVarargs
    protected zzop(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzoh<?, KeyProtoT>... zzohArr) {
        super(cls, zzohArr);
        this.zza = cls2;
    }

    public abstract PublicKeyProtoT zzb(KeyProtoT keyprotot) throws GeneralSecurityException;
}
