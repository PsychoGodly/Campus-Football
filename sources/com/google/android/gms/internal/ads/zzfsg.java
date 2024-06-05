package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfsg extends zzfqp {
    final transient Object zza;

    zzfsg(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzfqs(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    public final zzfqk zzd() {
        return zzfqk.zzp(this.zza);
    }

    public final zzfsj zze() {
        return new zzfqs(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
