package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzamh implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamf zzb;

    zzamh(zzamf zzamf) {
        this.zzb = zzamf;
        this.zza = zzamf.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
