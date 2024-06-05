package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfpc extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfpc zzc;
    final Collection zzd;
    final /* synthetic */ zzfpf zze;

    zzfpc(zzfpf zzfpf, Object obj, Collection collection, zzfpc zzfpc) {
        this.zze = zzfpf;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfpc;
        this.zzd = zzfpc == null ? null : zzfpc.zzb;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (!add) {
            return add;
        }
        zzfpf.zzd(this.zze);
        if (!isEmpty) {
            return add;
        }
        zza();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        zzfpf.zzf(this.zze, this.zzb.size() - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.zzb.clear();
            zzfpf.zzg(this.zze, size);
            zzc();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new zzfpb(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfpf.zze(this.zze);
            zzc();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            zzfpf.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            zzfpf.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.zzb.size();
    }

    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        zzfpc zzfpc = this.zzc;
        if (zzfpc != null) {
            zzfpc.zza();
        } else {
            this.zze.zza.put(this.zza, this.zzb);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        zzfpc zzfpc = this.zzc;
        if (zzfpc != null) {
            zzfpc.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty() && (collection = (Collection) this.zze.zza.get(this.zza)) != null) {
            this.zzb = collection;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzfpc zzfpc = this.zzc;
        if (zzfpc != null) {
            zzfpc.zzc();
        } else if (this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }
}
