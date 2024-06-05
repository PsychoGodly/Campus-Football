package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcpz implements zzcwc, zzcvi {
    private final Context zza;
    private final zzcei zzb;
    private final zzeyc zzc;
    private final zzbzg zzd;
    private a zze;
    private boolean zzf;

    public zzcpz(Context context, zzcei zzcei, zzeyc zzeyc, zzbzg zzbzg) {
        this.zza = context;
        this.zzb = zzcei;
        this.zzc = zzeyc;
        this.zzd = zzbzg;
    }

    private final synchronized void zza() {
        zzear zzear;
        zzeas zzeas;
        if (this.zzc.zzU) {
            if (this.zzb != null) {
                if (t.a().zze(this.zza)) {
                    zzbzg zzbzg = this.zzd;
                    String str = zzbzg.zzb + "." + zzbzg.zzc;
                    String zza2 = this.zzc.zzW.zza();
                    if (this.zzc.zzW.zzb() == 1) {
                        zzear = zzear.VIDEO;
                        zzeas = zzeas.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzear = zzear.HTML_DISPLAY;
                        if (this.zzc.zzf == 1) {
                            zzeas = zzeas.ONE_PIXEL;
                        } else {
                            zzeas = zzeas.BEGIN_TO_RENDER;
                        }
                    }
                    a zza3 = t.a().zza(str, this.zzb.zzG(), MaxReward.DEFAULT_LABEL, "javascript", zza2, zzeas, zzear, this.zzc.zzam);
                    this.zze = zza3;
                    zzcei zzcei = this.zzb;
                    if (zza3 != null) {
                        t.a().zzc(this.zze, (View) zzcei);
                        this.zzb.zzap(this.zze);
                        t.a().zzd(this.zze);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new androidx.collection.a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.zza()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.zzeyc r0 = r3.zzc     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.zzU     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.dynamic.a r0 = r3.zze     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzcei r0 = r3.zzb     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            androidx.collection.a r1 = new androidx.collection.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpz.zzl():void");
    }

    public final synchronized void zzn() {
        if (!this.zzf) {
            zza();
        }
    }
}
