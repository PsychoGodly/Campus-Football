package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzjj implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzjk zzb;

    zzjj(zzjk zzjk) {
        this.zzb = zzjk;
        this.zza = zzjk.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
