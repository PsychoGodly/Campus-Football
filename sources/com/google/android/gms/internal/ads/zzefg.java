package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzefg implements zzdee {
    private final Context zza;
    private final zzdmq zzb;
    private final zzeyx zzc;
    private final zzbzg zzd;
    private final zzeyc zze;
    private final zzfut zzf;
    private final zzcei zzg;
    private final zzbhr zzh;
    private final boolean zzi;

    zzefg(Context context, zzdmq zzdmq, zzeyx zzeyx, zzbzg zzbzg, zzeyc zzeyc, zzfut zzfut, zzcei zzcei, zzbhr zzbhr, boolean z10) {
        this.zza = context;
        this.zzb = zzdmq;
        this.zzc = zzeyx;
        this.zzd = zzbzg;
        this.zze = zzeyc;
        this.zzf = zzfut;
        this.zzg = zzcei;
        this.zzh = zzbhr;
        this.zzi = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzcvb r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.zzfut r0 = r1.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfuj.zzp(r0)
            com.google.android.gms.internal.ads.zzdlv r0 = (com.google.android.gms.internal.ads.zzdlv) r0
            com.google.android.gms.internal.ads.zzeyc r2 = r1.zze     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzcei r3 = r1.zzg     // Catch:{ zzcet -> 0x00fc }
            boolean r3 = r3.zzaB()     // Catch:{ zzcet -> 0x00fc }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcei r2 = r1.zzg     // Catch:{ zzcet -> 0x00fc }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzaG     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ zzcet -> 0x00fc }
            java.lang.Object r3 = r5.zzb(r3)     // Catch:{ zzcet -> 0x00fc }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzcet -> 0x00fc }
            boolean r3 = r3.booleanValue()     // Catch:{ zzcet -> 0x00fc }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzcei r2 = r1.zzg     // Catch:{ zzcet -> 0x00fc }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.zzdmq r3 = r1.zzb     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzeyx r5 = r1.zzc     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.ads.internal.client.z4 r5 = r5.zze     // Catch:{ zzcet -> 0x00fc }
            r6 = 0
            com.google.android.gms.internal.ads.zzcei r3 = r3.zza(r5, r6, r6)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzdcl r5 = r0.zzg()     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzbif.zzb(r3, r5)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzdmu r5 = new com.google.android.gms.internal.ads.zzdmu     // Catch:{ zzcet -> 0x00fc }
            r5.<init>()     // Catch:{ zzcet -> 0x00fc }
            android.content.Context r7 = r1.zza     // Catch:{ zzcet -> 0x00fc }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ zzcet -> 0x00fc }
            r5.zza(r7, r8)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzdmp r7 = r0.zzl()     // Catch:{ zzcet -> 0x00fc }
            boolean r8 = r1.zzi     // Catch:{ zzcet -> 0x00fc }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbhr r8 = r1.zzh     // Catch:{ zzcet -> 0x00fc }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.zzi(r3, r4, r8)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzcfv r7 = r3.zzN()     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzefe r8 = new com.google.android.gms.internal.ads.zzefe     // Catch:{ zzcet -> 0x00fc }
            r8.<init>(r5, r3)     // Catch:{ zzcet -> 0x00fc }
            r7.zzA(r8)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzcfv r5 = r3.zzN()     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzeff r7 = new com.google.android.gms.internal.ads.zzeff     // Catch:{ zzcet -> 0x00fc }
            r7.<init>(r3)     // Catch:{ zzcet -> 0x00fc }
            r5.zzG(r7)     // Catch:{ zzcet -> 0x00fc }
            com.google.android.gms.internal.ads.zzeyh r2 = r2.zzt     // Catch:{ zzcet -> 0x00fc }
            java.lang.String r5 = r2.zzb     // Catch:{ zzcet -> 0x00fc }
            java.lang.String r2 = r2.zza     // Catch:{ zzcet -> 0x00fc }
            r3.zzab(r5, r2, r6)     // Catch:{ zzcet -> 0x00fc }
            r11 = r3
        L_0x007e:
            r11.zzan(r4)
            com.google.android.gms.ads.internal.j r2 = new com.google.android.gms.ads.internal.j
            boolean r3 = r1.zzi
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zzbhr r3 = r1.zzh
            boolean r3 = r3.zze(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.t.r()
            android.content.Context r3 = r1.zza
            boolean r14 = com.google.android.gms.ads.internal.util.b2.e(r3)
            boolean r3 = r1.zzi
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzbhr r5 = r1.zzh
            boolean r5 = r5.zzd()
            r15 = r5
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbhr r3 = r1.zzh
            float r3 = r3.zza()
            r16 = r3
            goto L_0x00b5
        L_0x00b2:
            r3 = 0
            r16 = 0
        L_0x00b5:
            com.google.android.gms.internal.ads.zzeyc r3 = r1.zze
            r17 = -1
            boolean r5 = r3.zzP
            boolean r3 = r3.zzQ
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00cc
            r24.zzf()
        L_0x00cc:
            com.google.android.gms.ads.internal.t.k()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r8 = 0
            com.google.android.gms.internal.ads.zzddt r9 = r0.zzh()
            com.google.android.gms.internal.ads.zzeyc r0 = r1.zze
            r10 = 0
            int r12 = r0.zzR
            com.google.android.gms.internal.ads.zzbzg r13 = r1.zzd
            java.lang.String r14 = r0.zzC
            com.google.android.gms.internal.ads.zzeyh r0 = r0.zzt
            java.lang.String r5 = r0.zzb
            java.lang.String r0 = r0.zza
            com.google.android.gms.internal.ads.zzeyx r6 = r1.zzc
            java.lang.String r6 = r6.zzf
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.ads.internal.client.a) r8, (t4.t) r9, (t4.e0) r10, (com.google.android.gms.internal.ads.zzcei) r11, (int) r12, (com.google.android.gms.internal.ads.zzbzg) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.j) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.zzcvb) r19)
            r0 = r23
            t4.s.a(r0, r3, r4)
            return
        L_0x00fc:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.zzbza.zzh(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefg.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcvb):void");
    }
}
