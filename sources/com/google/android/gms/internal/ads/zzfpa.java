package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfpa extends zzfov implements SortedSet {
    final /* synthetic */ zzfpf zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfpa(zzfpf zzfpf, SortedMap sortedMap) {
        super(zzfpf, sortedMap);
        this.zzc = zzfpf;
    }

    public final Comparator comparator() {
        return zza().comparator();
    }

    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfpa(this.zzc, zza().headMap(obj));
    }

    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfpa(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfpa(this.zzc, zza().tailMap(obj));
    }

    /* access modifiers changed from: package-private */
    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
