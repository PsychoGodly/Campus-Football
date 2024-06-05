package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzapp implements zzaps {
    private static zzapp zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfje zzd;
    private final zzfjl zze;
    private final zzfjn zzf;
    private final zzaqr zzg;
    /* access modifiers changed from: private */
    public final zzfhp zzh;
    private final Executor zzi;
    private final zzfjk zzj;
    private final CountDownLatch zzk;
    private final zzarh zzl;
    private final zzaqy zzm;
    private final zzaqp zzn;
    /* access modifiers changed from: private */
    public final Object zzo = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzp;
    private volatile boolean zzq = false;
    private final int zzr;

    zzapp(Context context, zzfhp zzfhp, zzfje zzfje, zzfjl zzfjl, zzfjn zzfjn, zzaqr zzaqr, Executor executor, zzfhk zzfhk, int i10, zzarh zzarh, zzaqy zzaqy, zzaqp zzaqp) {
        this.zzc = context;
        this.zzh = zzfhp;
        this.zzd = zzfje;
        this.zze = zzfjl;
        this.zzf = zzfjn;
        this.zzg = zzaqr;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzarh;
        this.zzm = zzaqy;
        this.zzn = zzaqp;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzapn(this, zzfhk);
    }

    public static synchronized zzapp zza(String str, Context context, boolean z10, boolean z11) {
        zzapp zzb2;
        synchronized (zzapp.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzapp zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        zzapp zzapp;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzapp.class) {
            if (zzb == null) {
                zzfhq zza2 = zzfhr.zza();
                zza2.zza(str);
                zza2.zzc(z10);
                zzfhr zzd2 = zza2.zzd();
                zzfhp zza3 = zzfhp.zza(context2, executor2, z11);
                zzaqa zzc2 = ((Boolean) a0.c().zzb(zzbar.zzcT)).booleanValue() ? zzaqa.zzc(context) : null;
                zzarh zzd3 = ((Boolean) a0.c().zzb(zzbar.zzcU)).booleanValue() ? zzarh.zzd(context, executor) : null;
                zzaqy zzaqy = ((Boolean) a0.c().zzb(zzbar.zzcl)).booleanValue() ? new zzaqy() : null;
                zzaqp zzaqp = ((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue() ? new zzaqp() : null;
                zzfii zze2 = zzfii.zze(context2, executor2, zza3, zzd2);
                zzaqq zzaqq = new zzaqq(context2);
                zzaqr zzaqr = new zzaqr(zzd2, zze2, new zzarf(context2, zzaqq), zzaqq, zzc2, zzd3, zzaqy, zzaqp);
                int zzb2 = zzfir.zzb(context2, zza3);
                zzfhk zzfhk = new zzfhk();
                zzapp zzapp2 = new zzapp(context, zza3, new zzfje(context2, zzb2), new zzfjl(context2, zzb2, new zzapm(zza3), ((Boolean) a0.c().zzb(zzbar.zzbU)).booleanValue()), new zzfjn(context2, zzaqr, zza3, zzfhk), zzaqr, executor, zzfhk, zzb2, zzd3, zzaqy, zzaqp);
                zzb = zzapp2;
                zzapp2.zzm();
                zzb.zzp();
            }
            zzapp = zzb;
        }
        return zzapp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.zzh.zzd(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.zzk;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzapp r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfjd r3 = r12.zzt(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzasu r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzasu r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgqy -> 0x012a }
            r6 = 1
            int r7 = r12.zzr     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfhp r11 = r12.zzh     // Catch:{ zzgqy -> 0x012a }
            com.google.android.gms.internal.ads.zzfji r3 = com.google.android.gms.internal.ads.zzfhz.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgqy -> 0x012a }
            byte[] r4 = r3.zzb     // Catch:{ zzgqy -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.zzgpe r4 = com.google.android.gms.internal.ads.zzgpe.zzv(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzgpy r5 = com.google.android.gms.internal.ads.zzgpy.zza()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzasr r4 = com.google.android.gms.internal.ads.zzasr.zzc(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzasu r5 = r4.zzd()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgqy -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzasu r5 = r4.zzd()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgqy -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgpe r5 = r4.zze()     // Catch:{ zzgqy -> 0x012a }
            byte[] r5 = r5.zzE()     // Catch:{ zzgqy -> 0x012a }
            int r5 = r5.length     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.zzfjd r5 = r12.zzt(r2)     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.zzasu r5 = r5.zza()     // Catch:{ zzgqy -> 0x012a }
            com.google.android.gms.internal.ads.zzasu r6 = r4.zzd()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgqy -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgqy -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzasu r6 = r4.zzd()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgqy -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgqy -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgqy -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.zzfjk r5 = r12.zzj     // Catch:{ zzgqy -> 0x012a }
            int r3 = r3.zzc     // Catch:{ zzgqy -> 0x012a }
            com.google.android.gms.internal.ads.zzbaj r6 = com.google.android.gms.internal.ads.zzbar.zzbS     // Catch:{ zzgqy -> 0x012a }
            com.google.android.gms.internal.ads.zzbap r7 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ zzgqy -> 0x012a }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzgqy -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgqy -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgqy -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.zzfjl r3 = r12.zze     // Catch:{ zzgqy -> 0x012a }
            boolean r3 = r3.zza(r4)     // Catch:{ zzgqy -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.zzfjl r3 = r12.zze     // Catch:{ zzgqy -> 0x012a }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgqy -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.zzfje r3 = r12.zzd     // Catch:{ zzgqy -> 0x012a }
            boolean r3 = r3.zza(r4, r5)     // Catch:{ zzgqy -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.zzfhp r2 = r12.zzh     // Catch:{ zzgqy -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgqy -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgqy -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.zzfjd r3 = r12.zzt(r2)     // Catch:{ zzgqy -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzfjn r4 = r12.zzf     // Catch:{ zzgqy -> 0x012a }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgqy -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.zzq = r2     // Catch:{ zzgqy -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgqy -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgqy -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.zzfhp r2 = r12.zzh     // Catch:{ zzgqy -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgqy -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgqy -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.zzfhp r2 = r12.zzh     // Catch:{ zzgqy -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgqy -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgqy -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.zzfhp r2 = r12.zzh     // Catch:{ zzgqy -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgqy -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgqy -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfhp r3 = r12.zzh     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapp.zzj(com.google.android.gms.internal.ads.zzapp):void");
    }

    private final void zzs() {
        zzarh zzarh = this.zzl;
        if (zzarh != null) {
            zzarh.zzh();
        }
    }

    private final zzfjd zzt(int i10) {
        if (!zzfir.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzbS)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) a0.c().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfhs zza2 = this.zzf.zza();
        if (zza2 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzg(Context context) {
        zzs();
        if (((Boolean) a0.c().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfhs zza2 = this.zzf.zza();
        if (zza2 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) a0.c().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfhs zza2 = this.zzf.zza();
        if (zza2 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfhs zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzfjm e10) {
                this.zzh.zzc(e10.zza(), -1, e10);
            }
        }
    }

    public final void zzl(int i10, int i11, int i12) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfjd zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqp zzaqp = this.zzn;
        if (zzaqp != null) {
            zzaqp.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp() {
        /*
            r6 = this;
            boolean r0 = r6.zzp
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.zzo
            monitor-enter(r0)
            boolean r1 = r6.zzp     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfjn r1 = r6.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfjd r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.zzr     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzfir.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzapo r2 = new com.google.android.gms.internal.ads.zzapo     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapp.zzp():void");
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
