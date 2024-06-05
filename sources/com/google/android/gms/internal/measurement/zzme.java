package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzme implements ListIterator<String> {
    private ListIterator<String> zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ zzmb zzc;

    zzme(zzmb zzmb, int i10) {
        this.zzc = zzmb;
        this.zzb = i10;
        this.zza = zzmb.zza.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.zza.previous();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
