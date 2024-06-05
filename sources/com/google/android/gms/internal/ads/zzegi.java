package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegi implements zzeat {
    private final zzbbp zza;
    private final zzfuu zzb;
    private final zzfda zzc;
    /* access modifiers changed from: private */
    public final zzegr zzd;

    public zzegi(zzfda zzfda, zzfuu zzfuu, zzbbp zzbbp, zzegr zzegr, byte[] bArr) {
        this.zzc = zzfda;
        this.zzb = zzfuu;
        this.zza = zzbbp;
        this.zzd = zzegr;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzbzs zzbzs = new zzbzs();
        zzegn zzegn = new zzegn();
        zzegn.zzd(new zzegh(this, zzbzs, zzeyo, zzeyc, zzegn));
        zzeyh zzeyh = zzeyc.zzt;
        zzbbk zzbbk = new zzbbk(zzegn, zzeyh.zzb, zzeyh.zza);
        zzfda zzfda = this.zzc;
        return zzfck.zzd(new zzegg(this, zzbbk), this.zzb, zzfcu.CUSTOM_RENDER_SYN, zzfda).zzb(zzfcu.CUSTOM_RENDER_ACK).zzd(zzbzs).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzeyo r1, com.google.android.gms.internal.ads.zzeyc r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbbp r1 = r0.zza
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegi.zzb(com.google.android.gms.internal.ads.zzeyo, com.google.android.gms.internal.ads.zzeyc):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbbk zzbbk) throws Exception {
        this.zza.zze(zzbbk);
    }
}
