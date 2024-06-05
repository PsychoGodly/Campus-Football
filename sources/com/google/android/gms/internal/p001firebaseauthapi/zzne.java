package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzne  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzne<KeyFormatProtoT extends zzakn, KeyProtoT extends zzakn> {
    private final Class<KeyFormatProtoT> zza;

    public zzne(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzahp zzahp) throws zzaji;

    public abstract KeyProtoT zza(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract void zzb(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
