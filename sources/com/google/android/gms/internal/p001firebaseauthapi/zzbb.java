package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzbb<K> extends zzau<K> {
    private final transient zzat<K, ?> zza;
    private final transient zzap<K> zzb;

    zzbb(zzat<K, ?> zzat, zzap<K> zzap) {
        this.zza = zzat;
        this.zzb = zzap;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    public final zzap<K> zzc() {
        return this.zzb;
    }

    public final zzbc<K> zzd() {
        return (zzbc) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }
}
