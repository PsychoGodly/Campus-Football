package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfoe implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfoh zzb;

    zzfoe(zzfoh zzfoh, CharSequence charSequence) {
        this.zzb = zzfoh;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfnk.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
