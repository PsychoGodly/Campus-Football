package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzhc implements Iterator {
    private final Iterator zza;

    public zzhc(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzhd ? new zzhb(entry, (zzha) null) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
