package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzdj extends zzdf {
    final transient Object zza;

    zzdj(Object obj) {
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
        return new zzdg(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "[" + obj + "]";
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzdk zzd() {
        return new zzdg(this.zza);
    }
}
