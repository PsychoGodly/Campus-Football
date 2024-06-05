package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfsv extends zzftz implements Runnable {
    zzfut zza;
    Class zzb;
    Object zzc;

    zzfsv(zzfut zzfut, Class cls, Object obj) {
        Objects.requireNonNull(zzfut);
        this.zza = zzfut;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzfut r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00a7
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00a7
        L_0x0022:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfvm     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.zzfvm r4 = (com.google.android.gms.internal.ads.zzfvm) r4     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            java.lang.Throwable r4 = r4.zzm()     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfuj.zzo(r0)     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x007a
        L_0x0039:
            r4 = move-exception
            goto L_0x003c
        L_0x003b:
            r4 = move-exception
        L_0x003c:
            r5 = r3
            goto L_0x007a
        L_0x003e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0078
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L_0x0078:
            r4 = r5
            goto L_0x003c
        L_0x007a:
            if (r4 != 0) goto L_0x0080
            r9.zzd(r5)
            return
        L_0x0080:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r0 = r9.zzf(r2, r4)     // Catch:{ all -> 0x0092 }
            r9.zzb = r3
            r9.zzc = r3
            r9.zzg(r0)
            return
        L_0x0092:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfvb.zza(r0)     // Catch:{ all -> 0x009e }
            r9.zze(r0)     // Catch:{ all -> 0x009e }
            r9.zzb = r3
            r9.zzc = r3
            return
        L_0x009e:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        L_0x00a4:
            r9.zzt(r0)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsv.run():void");
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String str;
        zzfut zzfut = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza2 = super.zza();
        if (zzfut != null) {
            str = "inputFuture=[" + zzfut.toString() + "], ";
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
        } else if (zza2 != null) {
            return str.concat(zza2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzf(Object obj, Throwable th) throws Exception;

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj);
}
