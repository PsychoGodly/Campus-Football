package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzhf implements zzjp {
    private final zzwt zza;
    private final long zzb = zzew.zzv(50000);
    private final long zzc = zzew.zzv(50000);
    private final long zzd = zzew.zzv(2500);
    private final long zze = zzew.zzv(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
    private final long zzf = zzew.zzv(0);
    private int zzg = 13107200;
    private boolean zzh;

    public zzhf() {
        zzwt zzwt = new zzwt(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzwt;
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        zzdl.zze(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z10) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z10) {
            this.zza.zze();
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final void zzb() {
        zzk(false);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final void zze(zzkn[] zzknArr, zzur zzur, zzwe[] zzweArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzknArr.length;
            int i12 = 13107200;
            if (i10 < 2) {
                if (zzweArr[i10] != null) {
                    if (zzknArr[i10].zzb() != 1) {
                        i12 = 131072000;
                    }
                    i11 += i12;
                }
                i10++;
            } else {
                int max = Math.max(13107200, i11);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j10, long j11, float f10) {
        int zza2 = this.zza.zza();
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i11 = this.zzg;
        long j12 = this.zzb;
        if (i10 > 0) {
            j12 = Math.min(zzew.zzs(j12, f10), this.zzc);
        }
        boolean z10 = false;
        if (j11 < Math.max(j12, 500000)) {
            if (zza2 < i11) {
                z10 = true;
            }
            this.zzh = z10;
            if (!z10 && j11 < 500000) {
                zzee.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzc || zza2 >= i11) {
            this.zzh = false;
        }
        return this.zzh;
    }

    public final boolean zzh(long j10, float f10, boolean z10, long j11) {
        long j12;
        long zzu = zzew.zzu(j10, f10);
        if (z10) {
            j12 = this.zze;
        } else {
            j12 = this.zzd;
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || zzu >= j12 || this.zza.zza() >= this.zzg;
    }

    public final zzwt zzi() {
        return this.zza;
    }
}
