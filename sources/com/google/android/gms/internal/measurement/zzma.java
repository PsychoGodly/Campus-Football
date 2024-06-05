package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
abstract class zzma<T, B> {
    zzma() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(T t10);

    /* access modifiers changed from: package-private */
    public abstract B zza();

    /* access modifiers changed from: package-private */
    public abstract T zza(T t10, T t11);

    /* access modifiers changed from: package-private */
    public abstract void zza(B b10, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void zza(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void zza(B b10, int i10, zzhm zzhm);

    /* access modifiers changed from: package-private */
    public abstract void zza(B b10, int i10, T t10);

    /* access modifiers changed from: package-private */
    public abstract void zza(T t10, zzmw zzmw) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract boolean zza(zzlc zzlc);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(B r7, com.google.android.gms.internal.measurement.zzlc r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.zzd()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.zzf()
            r6.zza(r7, (int) r1, (int) r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.measurement.zzjh r7 = com.google.android.gms.internal.measurement.zzji.zza()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.zza()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.zzc()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.zza(r0, (com.google.android.gms.internal.measurement.zzlc) r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.zzd()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.zze(r0)
            r6.zza(r7, (int) r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.measurement.zzji r7 = com.google.android.gms.internal.measurement.zzji.zzb()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.measurement.zzhm r8 = r8.zzp()
            r6.zza(r7, (int) r1, (com.google.android.gms.internal.measurement.zzhm) r8)
            return r2
        L_0x0059:
            long r3 = r8.zzk()
            r6.zza(r7, (int) r1, (long) r3)
            return r2
        L_0x0061:
            long r3 = r8.zzl()
            r6.zzb(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzma.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlc):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int zzb(T t10);

    /* access modifiers changed from: package-private */
    public abstract void zzb(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void zzb(T t10, zzmw zzmw) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b10);

    /* access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzc(Object obj, T t10);

    /* access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T zze(B b10);

    /* access modifiers changed from: package-private */
    public abstract void zzf(Object obj);
}
