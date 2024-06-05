package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwt {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzwm[] zzd = new zzwm[100];

    public zzwt(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzwm zzb() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            int r0 = r0 + 1
            r4.zzb = r0     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzc     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzwm[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r0 = r0 + -1
            r4.zzc = r0     // Catch:{ all -> 0x0038 }
            r2 = r1[r0]     // Catch:{ all -> 0x0038 }
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            r1[r0] = r3     // Catch:{ all -> 0x0038 }
            goto L_0x002b
        L_0x001a:
            com.google.android.gms.internal.ads.zzwm r2 = new com.google.android.gms.internal.ads.zzwm     // Catch:{ all -> 0x0038 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzwm[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r3 = r1.length     // Catch:{ all -> 0x0038 }
            if (r0 > r3) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzwm[] r0 = (com.google.android.gms.internal.ads.zzwm[]) r0     // Catch:{ all -> 0x0038 }
            r4.zzd = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwt.zzb():com.google.android.gms.internal.ads.zzwm");
    }

    public final synchronized void zzc(zzwm zzwm) {
        zzwm[] zzwmArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzwmArr[i10] = zzwm;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzwn zzwn) {
        while (zzwn != null) {
            zzwm[] zzwmArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzwmArr[i10] = zzwn.zzc();
            this.zzb--;
            zzwn = zzwn.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzew.zze(this.zza, 65536) - this.zzb);
        int i10 = this.zzc;
        if (max < i10) {
            Arrays.fill(this.zzd, max, i10, (Object) null);
            this.zzc = max;
        }
    }
}
