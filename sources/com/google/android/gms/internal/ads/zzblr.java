package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.d0;
import com.google.android.gms.ads.internal.util.d1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzblr {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final zzbzg zzd;
    /* access modifiers changed from: private */
    public final zzfep zze;
    private final d0 zzf;
    private final d0 zzg;
    /* access modifiers changed from: private */
    public zzblq zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzblr(Context context, zzbzg zzbzg, String str, d0 d0Var, d0 d0Var2, zzfep zzfep) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzbzg;
        this.zze = zzfep;
        this.zzf = d0Var;
        this.zzg = d0Var2;
    }

    public final zzbll zzb(zzapw zzapw) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzblq zzblq = this.zzh;
                if (zzblq != null && this.zzi == 0) {
                    zzblq.zzi(new zzbkw(this), zzbkx.zza);
                }
            }
            zzblq zzblq2 = this.zzh;
            if (zzblq2 != null) {
                if (zzblq2.zze() != -1) {
                    int i10 = this.zzi;
                    if (i10 == 0) {
                        zzbll zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i10 == 1) {
                        this.zzi = 2;
                        zzd((zzapw) null);
                        zzbll zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zzbll zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            zzblq zzd2 = zzd((zzapw) null);
            this.zzh = zzd2;
            zzbll zza5 = zzd2.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzblq zzd(zzapw zzapw) {
        zzfec zza2 = zzfeb.zza(this.zzb, 6);
        zza2.zzh();
        zzblq zzblq = new zzblq(this.zzg);
        zzbzn.zze.execute(new zzbky(this, (zzapw) null, zzblq));
        zzblq.zzi(new zzblg(this, zzblq, zza2), new zzblh(this, zzblq, zza2));
        return zzblq;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzblq r4, com.google.android.gms.internal.ads.zzbkm r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.zzg()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzfuu r4 = com.google.android.gms.internal.ads.zzbzn.zze     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzblb r1 = new com.google.android.gms.internal.ads.zzblb     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.n1.a(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblr.zzi(com.google.android.gms.internal.ads.zzblq, com.google.android.gms.internal.ads.zzbkm):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzapw zzapw, zzblq zzblq) {
        try {
            zzbku zzbku = new zzbku(this.zzb, this.zzd, (zzapw) null, (a) null);
            zzbku.zzk(new zzbla(this, zzblq, zzbku));
            zzbku.zzq("/jsLoaded", new zzblc(this, zzblq, zzbku));
            d1 d1Var = new d1();
            zzbld zzbld = new zzbld(this, (zzapw) null, zzbku, d1Var);
            d1Var.b(zzbld);
            zzbku.zzq("/requestReload", zzbld);
            if (this.zzc.endsWith(".js")) {
                zzbku.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbku.zzf(this.zzc);
            } else {
                zzbku.zzg(this.zzc);
            }
            b2.f14773i.postDelayed(new zzblf(this, zzblq, zzbku), 60000);
        } catch (Throwable th) {
            zzbza.zzh("Error creating webview.", th);
            t.q().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzblq.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbkm zzbkm) {
        if (zzbkm.zzi()) {
            this.zzi = 1;
        }
    }
}
