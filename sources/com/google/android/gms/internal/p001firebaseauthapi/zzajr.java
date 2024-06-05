package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzajr {
    private static final zzaio zza = zzaio.zza;
    private zzahp zzb;
    private volatile zzakn zzc;
    private volatile zzahp zzd;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajr)) {
            return false;
        }
        zzajr zzajr = (zzajr) obj;
        zzakn zzakn = this.zzc;
        zzakn zzakn2 = zzajr.zzc;
        if (zzakn == null && zzakn2 == null) {
            return zzc().equals(zzajr.zzc());
        }
        if (zzakn != null && zzakn2 != null) {
            return zzakn.equals(zzakn2);
        }
        if (zzakn != null) {
            return zzakn.equals(zzajr.zzb(zzakn.zzh()));
        }
        return zzb(zzakn2.zzh()).equals(zzakn2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzakn zza(zzakn zzakn) {
        zzakn zzakn2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzakn;
        return zzakn2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzl();
        }
        return 0;
    }

    public final zzahp zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                zzahp zzahp = this.zzd;
                return zzahp;
            }
            if (this.zzc == null) {
                this.zzd = zzahp.zza;
            } else {
                this.zzd = this.zzc.zzi();
            }
            zzahp zzahp2 = this.zzd;
            return zzahp2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.p001firebaseauthapi.zzakn zzb(com.google.android.gms.internal.p001firebaseauthapi.zzakn r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase-auth-api.zzakn r0 = r1.zzc
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.zzakn r0 = r1.zzc     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzc = r2     // Catch:{ zzaji -> 0x0012 }
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza     // Catch:{ zzaji -> 0x0012 }
            r1.zzd = r0     // Catch:{ zzaji -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzc = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.firebase-auth-api.zzahp r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza     // Catch:{ all -> 0x001a }
            r1.zzd = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.firebase-auth-api.zzakn r2 = r1.zzc
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzajr.zzb(com.google.android.gms.internal.firebase-auth-api.zzakn):com.google.android.gms.internal.firebase-auth-api.zzakn");
    }
}
