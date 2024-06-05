package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzajq extends zzahj<String> implements zzajt, RandomAccess {
    private static final zzajq zza;
    @Deprecated
    private static final zzajt zzb;
    private final List<Object> zzc;

    static {
        zzajq zzajq = new zzajq(false);
        zza = zzajq;
        zzb = zzajq;
    }

    public zzajq() {
        this(10);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzahp) {
            zzahp zzahp = (zzahp) obj;
            String zzd = zzahp.zzd();
            if (zzahp.zzf()) {
                this.zzc.set(i10, zzd);
            }
            return zzd;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzajf.zzb(bArr);
        if (zzajf.zzc(bArr)) {
            this.zzc.set(i10, zzb2);
        }
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zza(remove);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zza(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* synthetic */ zzajj zza(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzajq((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object zzb(int i10) {
        return this.zzc.get(i10);
    }

    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    public final zzajt zzd() {
        return zzc() ? new zzamf(this) : this;
    }

    public final List<?> zze() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzajq(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzajt) {
            collection = ((zzajt) collection).zze();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    private zzajq(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzajq(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzahp) {
            return ((zzahp) obj).zzd();
        }
        return zzajf.zzb((byte[]) obj);
    }

    public final void zza(zzahp zzahp) {
        zza();
        this.zzc.add(zzahp);
        this.modCount++;
    }
}
