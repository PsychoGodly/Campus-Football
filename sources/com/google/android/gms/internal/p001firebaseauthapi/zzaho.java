package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaho extends zzahq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzahp zzc;

    zzaho(zzahp zzahp) {
        this.zzc = zzahp;
        this.zzb = zzahp.zzb();
    }

    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    public final byte zza() {
        int i10 = this.zza;
        if (i10 < this.zzb) {
            this.zza = i10 + 1;
            return this.zzc.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
