package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfpf extends zzfpi implements Serializable {
    /* access modifiers changed from: private */
    public final transient Map zza;
    private transient int zzb;

    protected zzfpf(Map map) {
        zzfnu.zze(map.isEmpty());
        this.zza = map;
    }

    static /* synthetic */ int zzd(zzfpf zzfpf) {
        int i10 = zzfpf.zzb;
        zzfpf.zzb = i10 + 1;
        return i10;
    }

    static /* synthetic */ int zze(zzfpf zzfpf) {
        int i10 = zzfpf.zzb;
        zzfpf.zzb = i10 - 1;
        return i10;
    }

    static /* synthetic */ int zzf(zzfpf zzfpf, int i10) {
        int i11 = zzfpf.zzb + i10;
        zzfpf.zzb = i11;
        return i11;
    }

    static /* synthetic */ int zzg(zzfpf zzfpf, int i10) {
        int i11 = zzfpf.zzb - i10;
        zzfpf.zzb = i11;
        return i11;
    }

    static /* synthetic */ void zzq(zzfpf zzfpf, Object obj) {
        Object obj2;
        try {
            obj2 = zzfpf.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfpf.zzb -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zza();

    /* access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    public final int zzh() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Collection zzi() {
        return new zzfph(this);
    }

    /* access modifiers changed from: package-private */
    public final Iterator zzj() {
        return new zzfop(this);
    }

    /* access modifiers changed from: package-private */
    public final List zzk(Object obj, List list, zzfpc zzfpc) {
        if (list instanceof RandomAccess) {
            return new zzfoy(this, obj, list, zzfpc);
        }
        return new zzfpe(this, obj, list, zzfpc);
    }

    /* access modifiers changed from: package-private */
    public Map zzm() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Map zzn() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfow(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfoz(this, (SortedMap) map);
        }
        return new zzfos(this, map);
    }

    /* access modifiers changed from: package-private */
    public Set zzo() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Set zzp() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfox(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpa(this, (SortedMap) map);
        }
        return new zzfov(this, map);
    }

    public final void zzr() {
        for (Collection clear : this.zza.values()) {
            clear.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza2 = zza();
            if (zza2.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }
}
