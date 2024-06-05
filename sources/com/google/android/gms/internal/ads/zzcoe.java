package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcoe extends zzcqm {
    private final zzcei zzc;
    private final int zzd;
    private final Context zze;
    private final zzcnt zzf;
    private final zzdee zzg;
    private final zzdbk zzh;
    private final zzcvb zzi;
    private final boolean zzj;
    private boolean zzk = false;

    zzcoe(zzcql zzcql, Context context, zzcei zzcei, int i10, zzcnt zzcnt, zzdee zzdee, zzdbk zzdbk, zzcvb zzcvb) {
        super(zzcql);
        this.zzc = zzcei;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcnt;
        this.zzg = zzdee;
        this.zzh = zzdbk;
        this.zzi = zzcvb;
        this.zzj = ((Boolean) a0.c().zzb(zzbar.zzeQ)).booleanValue();
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzb() {
        super.zzb();
        zzcei zzcei = this.zzc;
        if (zzcei != null) {
            zzcei.destroy();
        }
    }

    public final void zzc(zzaus zzaus) {
        zzcei zzcei = this.zzc;
        if (zzcei != null) {
            zzcei.zzah(zzaus);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzavf r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            android.content.Context r3 = r2.zze
        L_0x0004:
            boolean r4 = r2.zzj
            if (r4 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.zzdbk r4 = r2.zzh
            r4.zzb()
        L_0x000d:
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzay
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0061
            com.google.android.gms.ads.internal.t.r()
            boolean r4 = com.google.android.gms.ads.internal.util.b2.c(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzbza.zzj(r4)
            com.google.android.gms.internal.ads.zzcvb r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzaz
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzfia r4 = new com.google.android.gms.internal.ads.zzfia
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.x0 r5 = com.google.android.gms.ads.internal.t.v()
            android.os.Looper r5 = r5.b()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzeyo r3 = r2.zza
            com.google.android.gms.internal.ads.zzeyn r3 = r3.zzb
            com.google.android.gms.internal.ads.zzeyf r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L_0x0061:
            boolean r4 = r2.zzk
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzbza.zzj(r4)
            com.google.android.gms.internal.ads.zzcvb r4 = r2.zzi
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzezx.zzd(r0, r1, r1)
            r4.zza(r0)
        L_0x0076:
            boolean r4 = r2.zzk
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzdee r4 = r2.zzg     // Catch:{ zzded -> 0x008e }
            com.google.android.gms.internal.ads.zzcvb r0 = r2.zzi     // Catch:{ zzded -> 0x008e }
            r4.zza(r5, r3, r0)     // Catch:{ zzded -> 0x008e }
            boolean r3 = r2.zzj     // Catch:{ zzded -> 0x008e }
            if (r3 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzdbk r3 = r2.zzh     // Catch:{ zzded -> 0x008e }
            r3.zza()     // Catch:{ zzded -> 0x008e }
        L_0x008a:
            r3 = 1
            r2.zzk = r3
            return
        L_0x008e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcvb r4 = r2.zzi
            r4.zzc(r3)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcoe.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzavf, boolean):void");
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
