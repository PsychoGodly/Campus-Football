package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public abstract class zzdq extends zzdr implements Collection {
    protected zzdq() {
    }

    public boolean add(Object obj) {
        return zzc().add(obj);
    }

    public boolean addAll(Collection collection) {
        return zzc().addAll(collection);
    }

    public final void clear() {
        zzc().clear();
    }

    public final boolean contains(Object obj) {
        return zzc().contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return zzc().containsAll(collection);
    }

    public final boolean isEmpty() {
        return zzc().isEmpty();
    }

    public final Iterator iterator() {
        return zzc().iterator();
    }

    public final boolean remove(Object obj) {
        return zzc().remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return zzc().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return zzc().retainAll(collection);
    }

    public final int size() {
        return zzc().size();
    }

    public final Object[] toArray() {
        return zzc().toArray();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Collection zzc();

    public final Object[] toArray(Object[] objArr) {
        return zzc().toArray(objArr);
    }
}
