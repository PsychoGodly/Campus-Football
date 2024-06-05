package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzi<T> implements Iterator<T> {
    private int zza = zzh.zzb;
    private T zzb;

    protected zzi() {
    }

    public final boolean hasNext() {
        int i10 = this.zza;
        int i11 = zzh.zzd;
        if (i10 != i11) {
            int i12 = i10 - 1;
            if (i12 == 0) {
                return true;
            }
            if (i12 != 2) {
                this.zza = i11;
                this.zzb = zza();
                if (this.zza != zzh.zzc) {
                    this.zza = zzh.zza;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.zza = zzh.zzb;
            T t10 = this.zzb;
            this.zzb = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract T zza();

    /* access modifiers changed from: protected */
    public final T zzb() {
        this.zza = zzh.zzc;
        return null;
    }
}
