package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzj implements Iterator {
    private Object zza;
    private int zzb = 2;

    protected zzj() {
    }

    public final boolean hasNext() {
        int i10 = this.zzb;
        if (i10 != 4) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            } else if (i11 == 0) {
                return true;
            } else {
                if (i11 != 2) {
                    this.zzb = 4;
                    this.zza = zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract Object zza();

    /* access modifiers changed from: protected */
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
