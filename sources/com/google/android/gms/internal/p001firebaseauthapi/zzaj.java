package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzaj<E> extends zzbf<E> {
    private final int zza;
    private int zzb;

    protected zzaj(int i10, int i11) {
        zzy.zzb(i11, i10);
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.zzb - 1;
            this.zzb = i10;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    /* access modifiers changed from: protected */
    public abstract E zza(int i10);
}
