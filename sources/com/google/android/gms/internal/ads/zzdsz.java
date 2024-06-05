package com.google.android.gms.internal.ads;

import a5.c;
import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.k2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.nativead.b;
import java.util.HashMap;
import java.util.Map;
import n4.g;
import n4.j;
import n4.n;
import n4.y;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdsz extends k2 {
    final Map zza = new HashMap();
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzdsn zzc;
    private final zzfuu zzd;
    private final zzdta zze;
    private zzdsf zzf;

    zzdsz(Context context, zzdsn zzdsn, zzdta zzdta, zzfuu zzfuu) {
        this.zzb = context;
        this.zzc = zzdsn;
        this.zzd = zzfuu;
        this.zze = zzdta;
    }

    private static g zzj() {
        return new g.a().c();
    }

    /* access modifiers changed from: private */
    public static String zzk(Object obj) {
        y yVar;
        p2 h10;
        if (obj instanceof n) {
            yVar = ((n) obj).f();
        } else if (obj instanceof a) {
            yVar = ((a) obj).getResponseInfo();
        } else if (obj instanceof u4.a) {
            yVar = ((u4.a) obj).getResponseInfo();
        } else if (obj instanceof c) {
            yVar = ((c) obj).getResponseInfo();
        } else if (obj instanceof b5.a) {
            yVar = ((b5.a) obj).getResponseInfo();
        } else if (obj instanceof j) {
            yVar = ((j) obj).getResponseInfo();
        } else {
            if (obj instanceof b) {
                yVar = ((b) obj).getResponseInfo();
            }
            return MaxReward.DEFAULT_LABEL;
        }
        if (yVar == null || (h10 = yVar.h()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            return h10.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzl(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsx(this, str2), this.zzd);
        } catch (NullPointerException e10) {
            t.q().zzu(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzc.zzk(str2);
        }
    }

    private final synchronized void zzm(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsy(this, str2), this.zzd);
        } catch (NullPointerException e10) {
            t.q().zzu(e10, "OutOfContextTester.setAdAsShown");
            this.zzc.zzk(str2);
        }
    }

    public final void zze(String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Context context = (Context) com.google.android.gms.dynamic.b.A1(aVar);
        ViewGroup viewGroup = (ViewGroup) com.google.android.gms.dynamic.b.A1(aVar2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof j) {
                zzdta.zza(context, viewGroup, (j) obj);
            } else if (obj instanceof b) {
                zzdta.zzb(context, viewGroup, (b) obj);
            }
        }
    }

    public final void zzf(zzdsf zzdsf) {
        this.zzf = zzdsf;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzl(zzk(obj), str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.hashCode()     // Catch:{ all -> 0x00dd }
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1999289321: goto L_0x0040;
                case -1372958932: goto L_0x0036;
                case -428325382: goto L_0x002c;
                case 543046670: goto L_0x0022;
                case 1854800829: goto L_0x0018;
                case 1951953708: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x00dd }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "BANNER"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "REWARDED"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 4
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "APP_OPEN_AD"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "NATIVE"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 3
            goto L_0x004b
        L_0x004a:
            r8 = -1
        L_0x004b:
            if (r8 == 0) goto L_0x00cd
            if (r8 == r5) goto L_0x00ad
            if (r8 == r4) goto L_0x009d
            if (r8 == r3) goto L_0x0079
            if (r8 == r2) goto L_0x0069
            if (r8 == r1) goto L_0x0059
            monitor-exit(r6)
            return
        L_0x0059:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            n4.g r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdsv r1 = new com.google.android.gms.internal.ads.zzdsv     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            b5.a.load((android.content.Context) r8, (java.lang.String) r7, (n4.g) r0, (b5.b) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0069:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            n4.g r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdsu r1 = new com.google.android.gms.internal.ads.zzdsu     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            a5.c.load((android.content.Context) r8, (java.lang.String) r7, (n4.g) r0, (a5.d) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0079:
            n4.f$a r8 = new n4.f$a     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.zzb     // Catch:{ all -> 0x00dd }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdsq r0 = new com.google.android.gms.internal.ads.zzdsq     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            r8.c(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdsw r7 = new com.google.android.gms.internal.ads.zzdsw     // Catch:{ all -> 0x00dd }
            r7.<init>(r6, r9)     // Catch:{ all -> 0x00dd }
            r8.e(r7)     // Catch:{ all -> 0x00dd }
            n4.f r7 = r8.a()     // Catch:{ all -> 0x00dd }
            n4.g r8 = zzj()     // Catch:{ all -> 0x00dd }
            r7.a(r8)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x009d:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            n4.g r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdst r1 = new com.google.android.gms.internal.ads.zzdst     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            u4.a.load(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00ad:
            n4.j r8 = new n4.j     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.zzb     // Catch:{ all -> 0x00dd }
            r8.<init>(r0)     // Catch:{ all -> 0x00dd }
            n4.h r0 = n4.h.f20927i     // Catch:{ all -> 0x00dd }
            r8.setAdSize(r0)     // Catch:{ all -> 0x00dd }
            r8.setAdUnitId(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdss r0 = new com.google.android.gms.internal.ads.zzdss     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            r8.setAdListener(r0)     // Catch:{ all -> 0x00dd }
            n4.g r7 = zzj()     // Catch:{ all -> 0x00dd }
            r8.b(r7)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00cd:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            n4.g r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzdsr r1 = new com.google.android.gms.internal.ads.zzdsr     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            p4.a.load((android.content.Context) r8, (java.lang.String) r7, (n4.g) r0, (int) r5, (p4.a.C0225a) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00dd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsz.zzh(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdsn r0 = r4.zzc     // Catch:{ all -> 0x00a8 }
            android.app.Activity r0 = r0.zzg()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r4)
            return
        L_0x000b:
            java.util.Map r1 = r4.zza     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r4)
            return
        L_0x0015:
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zziC     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r3 = r3.zzb(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00a8 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0037
            boolean r3 = r1 instanceof p4.a     // Catch:{ all -> 0x00a8 }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r1 instanceof u4.a     // Catch:{ all -> 0x00a8 }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r1 instanceof a5.c     // Catch:{ all -> 0x00a8 }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r1 instanceof b5.a     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x003c
        L_0x0037:
            java.util.Map r3 = r4.zza     // Catch:{ all -> 0x00a8 }
            r3.remove(r5)     // Catch:{ all -> 0x00a8 }
        L_0x003c:
            java.lang.String r3 = zzk(r1)     // Catch:{ all -> 0x00a8 }
            r4.zzm(r3, r6)     // Catch:{ all -> 0x00a8 }
            boolean r6 = r1 instanceof p4.a     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x004e
            p4.a r1 = (p4.a) r1     // Catch:{ all -> 0x00a8 }
            r1.show(r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x004e:
            boolean r6 = r1 instanceof u4.a     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x0059
            u4.a r1 = (u4.a) r1     // Catch:{ all -> 0x00a8 }
            r1.show(r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x0059:
            boolean r6 = r1 instanceof a5.c     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x0066
            a5.c r1 = (a5.c) r1     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.internal.ads.zzdso r5 = com.google.android.gms.internal.ads.zzdso.zza     // Catch:{ all -> 0x00a8 }
            r1.show(r0, r5)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x0066:
            boolean r6 = r1 instanceof b5.a     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x0073
            b5.a r1 = (b5.a) r1     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.internal.ads.zzdsp r5 = com.google.android.gms.internal.ads.zzdsp.zza     // Catch:{ all -> 0x00a8 }
            r1.show(r0, r5)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x0073:
            com.google.android.gms.internal.ads.zzbap r6 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = r6.zzb(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x00a8 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x00a6
            boolean r6 = r1 instanceof n4.j     // Catch:{ all -> 0x00a8 }
            if (r6 != 0) goto L_0x008b
            boolean r6 = r1 instanceof com.google.android.gms.ads.nativead.b     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x00a6
        L_0x008b:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00a8 }
            r6.<init>()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r4.zzb     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r6.setClassName(r0, r1)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "adUnit"
            r6.putExtra(r0, r5)     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.ads.internal.t.r()     // Catch:{ all -> 0x00a8 }
            android.content.Context r5 = r4.zzb     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.ads.internal.util.b2.q(r5, r6)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x00a6:
            monitor-exit(r4)
            return
        L_0x00a8:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsz.zzi(java.lang.String, java.lang.String):void");
    }
}
