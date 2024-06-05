package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfbl {
    private final zzfbe zza;
    private final zzfut zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfbl(zzfaj zzfaj, zzfbd zzfbd, zzfbe zzfbe) {
        this.zza = zzfbe;
        this.zzb = zzfuj.zzf(zzfuj.zzm(zzfbd.zza(zzfbe), new zzfbj(this, zzfbd, zzfaj, zzfbe), zzfbe.zzb()), Exception.class, new zzfbk(this, zzfbd), zzfbe.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfut zza(com.google.android.gms.internal.ads.zzfbe r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzfbe r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfat r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfat r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfbe r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfat r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfat r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfut r3 = r2.zzb     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbl.zza(com.google.android.gms.internal.ads.zzfbe):com.google.android.gms.internal.ads.zzfut");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(zzfbd zzfbd, zzfaj zzfaj, zzfbe zzfbe, zzfas zzfas) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfbd.zzb(zzfas);
            if (!this.zzc) {
                zzfaj.zzd(zzfbe.zza(), zzfas);
                zzfut zzh = zzfuj.zzh((Object) null);
                return zzh;
            }
            zzfut zzh2 = zzfuj.zzh(new zzfbc(zzfas, zzfbe));
            return zzh2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(zzfbd zzfbd, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuf zzfuf) {
        zzfuj.zzq(zzfuj.zzm(this.zzb, zzfbi.zza, this.zza.zzb()), zzfuf, this.zza.zzb());
    }
}
