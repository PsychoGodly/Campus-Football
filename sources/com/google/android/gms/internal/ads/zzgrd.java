package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgrd extends zzgoo implements RandomAccess, zzgre {
    @Deprecated
    public static final zzgre zza;
    private static final zzgrd zzb;
    private final List zzc;

    static {
        zzgrd zzgrd = new zzgrd(10);
        zzb = zzgrd;
        zzgrd.zzb();
        zza = zzgrd;
    }

    public zzgrd() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpe) {
            return ((zzgpe) obj).zzA(zzgqw.zzb);
        }
        return zzgqw.zzg((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbH();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        zzbH();
        if (collection instanceof zzgre) {
            collection = ((zzgre) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbH();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzgqv zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzgrd(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzgre zze() {
        return zzc() ? new zzgtl(this) : this;
    }

    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpe) {
            zzgpe zzgpe = (zzgpe) obj;
            String zzA = zzgpe.zzA(zzgqw.zzb);
            if (zzgpe.zzp()) {
                this.zzc.set(i10, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzg = zzgqw.zzg(bArr);
        if (zzgqw.zzh(bArr)) {
            this.zzc.set(i10, zzg);
        }
        return zzg;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzgpe zzgpe) {
        zzbH();
        this.zzc.add(zzgpe);
        this.modCount++;
    }

    public zzgrd(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzgrd(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
