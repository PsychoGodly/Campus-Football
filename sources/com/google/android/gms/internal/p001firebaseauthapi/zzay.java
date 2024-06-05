package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzay  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzay extends zzap {
    private final /* synthetic */ zzaz zza;

    zzay(zzaz zzaz) {
        this.zza = zzaz;
    }

    public final /* synthetic */ Object get(int i10) {
        zzy.zza(i10, this.zza.zzd);
        int i11 = i10 * 2;
        Object obj = this.zza.zzb[i11];
        obj.getClass();
        Object obj2 = this.zza.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzd;
    }

    public final boolean zze() {
        return true;
    }
}
