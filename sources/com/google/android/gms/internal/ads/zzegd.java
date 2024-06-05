package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegd implements zzeat {
    private final Context zza;
    private final zzcph zzb;
    private final zzbbp zzc;
    private final zzfuu zzd;
    private final zzfda zze;

    public zzegd(Context context, zzcph zzcph, zzfda zzfda, zzfuu zzfuu, zzbbp zzbbp) {
        this.zza = context;
        this.zzb = zzcph;
        this.zze = zzfda;
        this.zzd = zzfuu;
        this.zzc = zzbbp;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzcol zza2 = this.zzb.zza(new zzcrb(zzeyo, zzeyc, (String) null), new zzegb(this, new View(this.zza), (zzcei) null, zzefz.zza, (zzeyd) zzeyc.zzv.get(0)));
        zzegc zzk = zza2.zzk();
        zzeyh zzeyh = zzeyc.zzt;
        zzbbk zzbbk = new zzbbk(zzk, zzeyh.zzb, zzeyh.zza);
        zzfda zzfda = this.zze;
        return zzfck.zzd(new zzega(this, zzbbk), this.zzd, zzfcu.CUSTOM_RENDER_SYN, zzfda).zzb(zzfcu.CUSTOM_RENDER_ACK).zzd(zzfuj.zzh(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzeyo r1, com.google.android.gms.internal.ads.zzeyc r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbbp r1 = r0.zzc
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzeyh r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegd.zzb(com.google.android.gms.internal.ads.zzeyo, com.google.android.gms.internal.ads.zzeyc):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbbk zzbbk) throws Exception {
        this.zzc.zze(zzbbk);
    }
}
