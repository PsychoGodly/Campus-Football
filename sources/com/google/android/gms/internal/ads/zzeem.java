package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeem implements zzftq {
    private final zzfda zza;
    private final zzcuq zzb;
    private final zzffb zzc;
    private final zzfff zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqp zzg;
    private final zzeeh zzh;
    private final zzeay zzi;
    private final Context zzj;
    private final zzfen zzk;

    zzeem(Context context, zzfda zzfda, zzeeh zzeeh, zzcuq zzcuq, zzffb zzffb, zzfff zzfff, zzcqp zzcqp, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeay zzeay, zzfen zzfen) {
        this.zzj = context;
        this.zza = zzfda;
        this.zzh = zzeeh;
        this.zzb = zzcuq;
        this.zzc = zzffb;
        this.zzd = zzfff;
        this.zzg = zzcqp;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeay;
        this.zzk = zzfen;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzeZ)).booleanValue() == false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfut zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzeyo r9 = (com.google.android.gms.internal.ads.zzeyo) r9
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzfa
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L_0x001a
            java.lang.String r0 = "No ad config."
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            com.google.android.gms.internal.ads.zzeyn r3 = r9.zzb
            com.google.android.gms.internal.ads.zzeyf r3 = r3.zzb
            int r3 = r3.zze
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 == 0) goto L_0x0059
            if (r3 < r4) goto L_0x003e
            if (r3 >= r5) goto L_0x003e
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzeZ
            com.google.android.gms.internal.ads.zzbap r6 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r6.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0059
            goto L_0x005a
        L_0x003e:
            if (r3 < r5) goto L_0x0047
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L_0x0047
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L_0x005a
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            com.google.android.gms.internal.ads.zzeyn r0 = r9.zzb
            com.google.android.gms.internal.ads.zzeyf r0 = r0.zzb
            com.google.android.gms.internal.ads.zzeye r3 = r0.zzi
            if (r3 == 0) goto L_0x0066
            java.lang.String r1 = r3.zza()
        L_0x0066:
            com.google.android.gms.internal.ads.zzeay r3 = r8.zzi
            r3.zzg(r0)
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzhG
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzeyn r0 = r9.zzb
            com.google.android.gms.internal.ads.zzeyf r0 = r0.zzb
            int r0 = r0.zze
            if (r0 == 0) goto L_0x0095
            if (r0 < r4) goto L_0x008a
            if (r0 < r5) goto L_0x0095
        L_0x008a:
            com.google.android.gms.internal.ads.zzeek r9 = new com.google.android.gms.internal.ads.zzeek
            r9.<init>(r3, r1)
            com.google.android.gms.internal.ads.zzfut r9 = com.google.android.gms.internal.ads.zzfuj.zzg(r9)
            goto L_0x0172
        L_0x0095:
            com.google.android.gms.internal.ads.zzfda r0 = r8.zza
            com.google.android.gms.internal.ads.zzfcu r4 = com.google.android.gms.internal.ads.zzfcu.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.zzeek r5 = new com.google.android.gms.internal.ads.zzeek
            r5.<init>(r3, r1)
            com.google.android.gms.internal.ads.zzfut r1 = com.google.android.gms.internal.ads.zzfuj.zzg(r5)
            com.google.android.gms.internal.ads.zzfcr r0 = com.google.android.gms.internal.ads.zzfck.zzc(r1, r4, r0)
            com.google.android.gms.internal.ads.zzfcf r0 = r0.zza()
            com.google.android.gms.internal.ads.zzeyn r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L_0x00b2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00f3
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzeyc r3 = (com.google.android.gms.internal.ads.zzeyc) r3
            com.google.android.gms.internal.ads.zzeay r4 = r8.zzi
            r4.zzd(r3)
            java.util.List r4 = r3.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x00c9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e6
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcqp r6 = r8.zzg
            int r7 = r3.zzb
            com.google.android.gms.internal.ads.zzeat r5 = r6.zza(r7, r5)
            if (r5 == 0) goto L_0x00c9
            boolean r5 = r5.zzb(r9, r3)
            if (r5 == 0) goto L_0x00c9
            goto L_0x00b2
        L_0x00e6:
            com.google.android.gms.internal.ads.zzeay r4 = r8.zzi
            r5 = 0
            r7 = 0
            com.google.android.gms.ads.internal.client.c3 r7 = com.google.android.gms.internal.ads.zzezx.zzd(r2, r7, r7)
            r4.zze(r3, r5, r7)
            goto L_0x00b2
        L_0x00f3:
            com.google.android.gms.internal.ads.zzcuq r1 = r8.zzb
            com.google.android.gms.internal.ads.zzcmn r2 = new com.google.android.gms.internal.ads.zzcmn
            com.google.android.gms.internal.ads.zzfff r3 = r8.zzd
            com.google.android.gms.internal.ads.zzffb r4 = r8.zzc
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.zze
            r1.zzm(r2, r3)
            com.google.android.gms.internal.ads.zzeyn r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x010c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0171
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzeyc r3 = (com.google.android.gms.internal.ads.zzeyc) r3
            java.util.List r4 = r3.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x016e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcqp r6 = r8.zzg
            int r7 = r3.zzb
            com.google.android.gms.internal.ads.zzeat r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L_0x011e
            boolean r7 = r6.zzb(r9, r3)
            if (r7 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzfda r4 = r8.zza
            com.google.android.gms.internal.ads.zzfcu r7 = com.google.android.gms.internal.ads.zzfcu.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzfcr r0 = r4.zzb(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "render-config-"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzfcr r0 = r0.zzh(r4)
            com.google.android.gms.internal.ads.zzeel r4 = new com.google.android.gms.internal.ads.zzeel
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzfcr r0 = r0.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzfcf r0 = r0.zza()
        L_0x016e:
            int r2 = r2 + 1
            goto L_0x010c
        L_0x0171:
            r9 = r0
        L_0x0172:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfut");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(zzeyc zzeyc, zzeyo zzeyo, zzeat zzeat, Throwable th) throws Exception {
        zzfec zza2 = zzfeb.zza(this.zzj, 12);
        zza2.zzd(zzeyc.zzF);
        zza2.zzh();
        zzeeh zzeeh = this.zzh;
        zzfut zzn = zzfuj.zzn(zzeat.zza(zzeyo, zzeyc), (long) zzeyc.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeeh.zze(zzeyo, zzeyc, zzn, this.zzc);
        zzfem.zza(zzn, this.zzk, zza2);
        return zzn;
    }
}
