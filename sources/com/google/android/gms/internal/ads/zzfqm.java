package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfqm {
    Object[] zza;
    int zzb;
    zzfql zzc;

    public zzfqm() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfqe.zze(length, i11));
        }
    }

    public final zzfqm zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfpj.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfqm zzb(java.lang.Iterable r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.zzb
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.zzd(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.zza(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqm.zzb(java.lang.Iterable):com.google.android.gms.internal.ads.zzfqm");
    }

    public final zzfqn zzc() {
        zzfql zzfql = this.zzc;
        if (zzfql == null) {
            zzfry zzi = zzfry.zzi(this.zzb, this.zza, this);
            zzfql zzfql2 = this.zzc;
            if (zzfql2 == null) {
                return zzi;
            }
            throw zzfql2.zza();
        }
        throw zzfql.zza();
    }

    zzfqm(int i10) {
        this.zza = new Object[(i10 + i10)];
        this.zzb = 0;
    }
}
