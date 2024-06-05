package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgtl extends AbstractList implements RandomAccess, zzgre {
    /* access modifiers changed from: private */
    public final zzgre zza;

    public zzgtl(zzgre zzgre) {
        this.zza = zzgre;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzgrd) this.zza).get(i10);
    }

    public final Iterator iterator() {
        return new zzgtk(this);
    }

    public final ListIterator listIterator(int i10) {
        return new zzgtj(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzgre zze() {
        return this;
    }

    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzgpe zzgpe) {
        throw new UnsupportedOperationException();
    }
}
