package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfr extends zzfqa {
    private final Map zza;

    public zzfr(Map map) {
        this.zza = map;
    }

    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    public final Set entrySet() {
        return zzfsf.zzb(this.zza.entrySet(), zzfp.zza);
    }

    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    public final int hashCode() {
        return super.zzc();
    }

    public final boolean isEmpty() {
        if (this.zza.isEmpty() || (super.size() == 1 && super.containsKey((Object) null))) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        return zzfsf.zzb(this.zza.keySet(), zzfq.zza);
    }

    public final int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Map zzb() {
        return this.zza;
    }
}
