package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzajo<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzajo(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        return next.getValue() instanceof zzajn ? new zzajm(next) : next;
    }

    public final void remove() {
        this.zza.remove();
    }
}
