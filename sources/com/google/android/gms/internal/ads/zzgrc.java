package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgrc {
    private static final zzgpy zzb = zzgpy.zza;
    protected volatile zzgrw zza;
    private volatile zzgpe zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgrc)) {
            return false;
        }
        zzgrc zzgrc = (zzgrc) obj;
        zzgrw zzgrw = this.zza;
        zzgrw zzgrw2 = zzgrc.zza;
        if (zzgrw == null && zzgrw2 == null) {
            return zzb().equals(zzgrc.zzb());
        }
        if (zzgrw != null && zzgrw2 != null) {
            return zzgrw.equals(zzgrw2);
        }
        if (zzgrw != null) {
            zzgrc.zzc(zzgrw.zzbf());
            return zzgrw.equals(zzgrc.zza);
        }
        zzc(zzgrw2.zzbf());
        return this.zza.equals(zzgrw2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgpa) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgpe zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgpe zzgpe = this.zzc;
                return zzgpe;
            }
            if (this.zza == null) {
                this.zzc = zzgpe.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            zzgpe zzgpe2 = this.zzc;
            return zzgpe2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.ads.zzgrw r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgrw r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgrw r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzgqy -> 0x0011 }
            com.google.android.gms.internal.ads.zzgpe r0 = com.google.android.gms.internal.ads.zzgpe.zzb     // Catch:{ zzgqy -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzgqy -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgpe r2 = com.google.android.gms.internal.ads.zzgpe.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrc.zzc(com.google.android.gms.internal.ads.zzgrw):void");
    }
}
