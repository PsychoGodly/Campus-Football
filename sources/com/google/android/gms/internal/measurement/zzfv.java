package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import r6.l;
import r6.v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzfv extends zzgu {
    private final Context zza;
    private final v<l<zzgh>> zzb;

    zzfv(Context context, v<l<zzgh>> vVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzgu
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.zzgu r5 = (com.google.android.gms.internal.measurement.zzgu) r5
            android.content.Context r1 = r4.zza
            android.content.Context r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            r6.v<r6.l<com.google.android.gms.internal.measurement.zzgh>> r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            r6.v r5 = r5.zzb()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            r6.v r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        v<l<zzgh>> vVar = this.zzb;
        return hashCode ^ (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final v<l<zzgh>> zzb() {
        return this.zzb;
    }
}
