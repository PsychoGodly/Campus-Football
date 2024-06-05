package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfrv extends zzfqp {
    private final transient zzfqn zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    zzfrv(zzfqn zzfqn, Object[] objArr, int i10, int i11) {
        this.zza = zzfqn;
        this.zzb = objArr;
        this.zzc = i11;
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
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, i10);
    }

    public final zzfsj zze() {
        return zzd().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final zzfqk zzi() {
        return new zzfru(this);
    }
}
