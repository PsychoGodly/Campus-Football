package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zzmb extends AbstractList<String> implements zzjp, RandomAccess {
    /* access modifiers changed from: private */
    public final zzjp zza;

    public zzmb(zzjp zzjp) {
        this.zza = zzjp;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.zza.get(i10);
    }

    public final zzjp h_() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new zzmd(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzme(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zza(zzhm zzhm) {
        throw new UnsupportedOperationException();
    }

    public final Object zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final List<?> zzb() {
        return this.zza.zzb();
    }
}
