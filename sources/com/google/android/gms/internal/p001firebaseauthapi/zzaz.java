package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaz<K, V> extends zzau<Map.Entry<K, V>> {
    private final transient zzat<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    private final transient int zzc = 0;
    /* access modifiers changed from: private */
    public final transient int zzd;

    zzaz(zzat<K, V> zzat, Object[] objArr, int i10, int i11) {
        this.zza = zzat;
        this.zzb = objArr;
        this.zzd = i11;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    public final zzbc<Map.Entry<K, V>> zzd() {
        return (zzbc) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final zzap<Map.Entry<K, V>> zzg() {
        return new zzay(this);
    }
}
