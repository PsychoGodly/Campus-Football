package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzrx implements zzsq, zzsp {
    public final zzsq zza;
    long zzb;
    private zzsp zzc;
    private zzrw[] zzd = new zzrw[0];
    private long zze = 0;

    public zzrx(zzsq zzsq, boolean z10, long j10, long j11) {
        this.zza = zzsq;
        this.zzb = j11;
    }

    public final long zza(long j10, zzkq zzkq) {
        if (j10 == 0) {
            return 0;
        }
        long zzr = zzew.zzr(zzkq.zzf, 0, j10);
        long j11 = zzkq.zzg;
        long j12 = this.zzb;
        long zzr2 = zzew.zzr(j11, 0, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (!(zzr == zzkq.zzf && zzr2 == zzkq.zzg)) {
            zzkq = new zzkq(zzr, zzr2);
        }
        return this.zza.zza(j10, zzkq);
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzb2 < j10) {
                return zzb2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzc2 < j10) {
                return zzc2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzd() {
        if (zzq()) {
            long j10 = this.zze;
            this.zze = -9223372036854775807L;
            long zzd2 = zzd();
            return zzd2 != -9223372036854775807L ? zzd2 : j10;
        }
        long zzd3 = this.zza.zzd();
        if (zzd3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        zzdl.zzf(zzd3 >= 0);
        long j11 = this.zzb;
        if (j11 == Long.MIN_VALUE || zzd3 <= j11) {
            z10 = true;
        }
        zzdl.zzf(z10);
        return zzd3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzrw[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.zzc()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.zzsq r0 = r7.zza
            long r0 = r0.zze(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.zzb
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.android.gms.internal.ads.zzdl.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrx.zze(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r4 > r7) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzwe[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzuj[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzrw[] r3 = new com.google.android.gms.internal.ads.zzrw[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzuj[] r2 = new com.google.android.gms.internal.ads.zzuj[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.zzrw[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzrw r6 = (com.google.android.gms.internal.ads.zzrw) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzuj r11 = r6.zza
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.zzsq r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L_0x003d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            r9 = r7
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x005c
            long r7 = r0.zzb
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzdl.zzf(r6)
        L_0x0060:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0086
            r6 = r2[r3]
            if (r6 != 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzrw[] r6 = r0.zzd
            r6[r3] = r11
            goto L_0x007d
        L_0x006c:
            com.google.android.gms.internal.ads.zzrw[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzuj r8 = r8.zza
            if (r8 == r6) goto L_0x007d
        L_0x0076:
            com.google.android.gms.internal.ads.zzrw r8 = new com.google.android.gms.internal.ads.zzrw
            r8.<init>(r14, r6)
            r7[r3] = r8
        L_0x007d:
            com.google.android.gms.internal.ads.zzrw[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0060
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrx.zzf(com.google.android.gms.internal.ads.zzwe[], boolean[], com.google.android.gms.internal.ads.zzuj[], boolean[], long):long");
    }

    public final /* bridge */ /* synthetic */ void zzg(zzul zzul) {
        zzsq zzsq = (zzsq) zzul;
        zzsp zzsp = this.zzc;
        Objects.requireNonNull(zzsp);
        zzsp.zzg(this);
    }

    public final zzur zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzsq zzsq) {
        zzsp zzsp = this.zzc;
        Objects.requireNonNull(zzsp);
        zzsp.zzi(this);
    }

    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzsp zzsp, long j10) {
        this.zzc = zzsp;
        this.zza.zzl(this, j10);
    }

    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    public final void zzn(long j10, long j11) {
        this.zzb = j11;
    }

    public final boolean zzo(long j10) {
        return this.zza.zzo(j10);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
