package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfqr extends zzfon {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfnv zzb;

    zzfqr(Iterator it, zzfnv zzfnv) {
        this.zza = it;
        this.zzb = zzfnv;
    }

    /* access modifiers changed from: protected */
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
