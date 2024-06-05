package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpd extends zzfpb implements ListIterator {
    final /* synthetic */ zzfpe zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfpd(zzfpe zzfpe) {
        super(zzfpe);
        this.zzd = zzfpe;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfpf.zzd(this.zzd.zzf);
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfpd(zzfpe zzfpe, int i10) {
        super(zzfpe, ((List) zzfpe.zzb).listIterator(i10));
        this.zzd = zzfpe;
    }
}
