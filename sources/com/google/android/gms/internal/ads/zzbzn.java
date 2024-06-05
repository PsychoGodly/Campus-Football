package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbzn {
    public static final zzfuu zza;
    public static final zzfuu zzb;
    public static final zzfuu zzc;
    public static final ScheduledExecutorService zzd = new zzbzi(3, new zzbzj("Schedule"));
    public static final zzfuu zze = new zzbzm(new zzbzk(), (zzbzl) null);
    public static final zzfuu zzf = new zzbzm(zzfva.zzb(), (zzbzl) null);

    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = m5.d.a()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzfkq.zza()
            com.google.android.gms.internal.ads.zzbzj r0 = new com.google.android.gms.internal.ads.zzbzj
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto L_0x0031
        L_0x0019:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r2 = 2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.google.android.gms.internal.ads.zzbzj r8 = new com.google.android.gms.internal.ads.zzbzj
            r8.<init>(r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x0031:
            com.google.android.gms.internal.ads.zzbzm r1 = new com.google.android.gms.internal.ads.zzbzm
            r2 = 0
            r1.<init>(r0, r2)
            zza = r1
            boolean r0 = m5.d.a()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzfkn r0 = com.google.android.gms.internal.ads.zzfkq.zza()
            r4 = 5
            com.google.android.gms.internal.ads.zzbzj r5 = new com.google.android.gms.internal.ads.zzbzj
            r5.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzc(r4, r5, r3)
            goto L_0x006a
        L_0x0051:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 5
            r6 = 5
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbzj r11 = new com.google.android.gms.internal.ads.zzbzj
            r11.<init>(r1)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x006a:
            com.google.android.gms.internal.ads.zzbzm r1 = new com.google.android.gms.internal.ads.zzbzm
            r1.<init>(r0, r2)
            zzb = r1
            boolean r0 = m5.d.a()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzfkn r0 = com.google.android.gms.internal.ads.zzfkq.zza()
            com.google.android.gms.internal.ads.zzbzj r4 = new com.google.android.gms.internal.ads.zzbzj
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzb(r4, r3)
            goto L_0x00a0
        L_0x0087:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 1
            r6 = 1
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbzj r11 = new com.google.android.gms.internal.ads.zzbzj
            r11.<init>(r1)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x00a0:
            com.google.android.gms.internal.ads.zzbzm r1 = new com.google.android.gms.internal.ads.zzbzm
            r1.<init>(r0, r2)
            zzc = r1
            com.google.android.gms.internal.ads.zzbzi r0 = new com.google.android.gms.internal.ads.zzbzi
            r1 = 3
            com.google.android.gms.internal.ads.zzbzj r3 = new com.google.android.gms.internal.ads.zzbzj
            java.lang.String r4 = "Schedule"
            r3.<init>(r4)
            r0.<init>(r1, r3)
            zzd = r0
            com.google.android.gms.internal.ads.zzbzk r0 = new com.google.android.gms.internal.ads.zzbzk
            r0.<init>()
            com.google.android.gms.internal.ads.zzbzm r1 = new com.google.android.gms.internal.ads.zzbzm
            r1.<init>(r0, r2)
            zze = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzfva.zzb()
            com.google.android.gms.internal.ads.zzbzm r1 = new com.google.android.gms.internal.ads.zzbzm
            r1.<init>(r0, r2)
            zzf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzn.<clinit>():void");
    }
}
