package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzami  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzami implements ListIterator<String> {
    private ListIterator<String> zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ zzamf zzc;

    zzami(zzamf zzamf, int i10) {
        this.zzc = zzamf;
        this.zzb = i10;
        this.zza = zzamf.zza.listIterator(i10);
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
