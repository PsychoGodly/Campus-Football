package com.google.android.recaptcha.internal;

import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzis implements Map.Entry, Comparable {
    final /* synthetic */ zziy zza;
    private final Comparable zzb;
    private Object zzc;

    zzis(zziy zziy, Comparable comparable, Object obj) {
        this.zza = zziy;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzis) obj).zzb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        Comparable comparable = this.zzb;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return valueOf + "=" + valueOf2;
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
