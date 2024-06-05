package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfoz extends zzfos implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfpf zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfoz(zzfpf zzfpf, SortedMap sortedMap) {
        super(zzfpf, sortedMap);
        this.zze = zzfpf;
    }

    public final Comparator comparator() {
        return zzf().comparator();
    }

    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfoz(this.zze, zzf().headMap(obj));
    }

    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfoz(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfoz(this.zze, zzf().tailMap(obj));
    }

    /* access modifiers changed from: package-private */
    public SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfpa(this.zze, zzf());
    }

    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zze();
        this.zzd = zzg;
        return zzg;
    }
}
