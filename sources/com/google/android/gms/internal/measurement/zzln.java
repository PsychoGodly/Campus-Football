package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzln implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzlg zzc;

    zzln(zzlg zzlg, Map.Entry entry) {
        this(zzlg, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzln) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        Comparable comparable = this.zza;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzb;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return valueOf + "=" + valueOf2;
    }

    zzln(zzlg zzlg, Comparable comparable, Object obj) {
        this.zzc = zzlg;
        this.zza = comparable;
        this.zzb = obj;
    }
}
