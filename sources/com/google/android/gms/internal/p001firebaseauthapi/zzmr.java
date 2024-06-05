package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzmr<KeyFormatProtoT extends zzakn, KeyProtoT extends zzakn> {
    private final zzne<KeyFormatProtoT, KeyProtoT> zza;

    zzmr(zzne<KeyFormatProtoT, KeyProtoT> zzne) {
        this.zza = zzne;
    }

    /* access modifiers changed from: package-private */
    public final KeyProtoT zza(zzahp zzahp) throws GeneralSecurityException, zzaji {
        KeyFormatProtoT zza2 = this.zza.zza(zzahp);
        this.zza.zzb(zza2);
        return this.zza.zza(zza2);
    }
}
