package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public class zzhe {
    private static final zzfz zzb = zzfz.zza;
    protected volatile zzhy zza;
    private volatile zzez zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhe)) {
            return false;
        }
        zzhe zzhe = (zzhe) obj;
        zzhy zzhy = this.zza;
        zzhy zzhy2 = zzhe.zza;
        if (zzhy == null && zzhy2 == null) {
            return zzb().equals(zzhe.zzb());
        }
        if (zzhy != null && zzhy2 != null) {
            return zzhy.equals(zzhy2);
        }
        if (zzhy != null) {
            zzhe.zzd(zzhy.zzX());
            return zzhy.equals(zzhe.zza);
        }
        zzd(zzhy2.zzX());
        return this.zza.equals(zzhy2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzew) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzez zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzez zzez = this.zzc;
                return zzez;
            }
            if (this.zza == null) {
                this.zzc = zzez.zzb;
            } else {
                this.zzc = this.zza.zzb();
            }
            zzez zzez2 = this.zzc;
            return zzez2;
        }
    }

    public final zzhy zzc(zzhy zzhy) {
        zzhy zzhy2 = this.zza;
        this.zzc = null;
        this.zza = zzhy;
        return zzhy2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.recaptcha.internal.zzhy r2) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzhy r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.recaptcha.internal.zzhy r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzgy -> 0x0011 }
            com.google.android.recaptcha.internal.zzez r0 = com.google.android.recaptcha.internal.zzez.zzb     // Catch:{ zzgy -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzgy -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.recaptcha.internal.zzez r2 = com.google.android.recaptcha.internal.zzez.zzb     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhe.zzd(com.google.android.recaptcha.internal.zzhy):void");
    }
}
