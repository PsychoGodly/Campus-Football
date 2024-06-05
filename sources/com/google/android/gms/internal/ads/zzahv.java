package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzahv {
    private final zzabb zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzaat zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzahu zzi = new zzahu((zzaht) null);
    private final zzahu zzj = new zzahu((zzaht) null);
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;

    public zzahv(zzabb zzabb, boolean z10, boolean z11) {
        this.zza = zzabb;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzaat(bArr, 0, 0);
        this.zzk = false;
    }

    public final void zza(zzaap zzaap) {
        this.zzc.append(zzaap.zza, zzaap);
    }

    public final void zzb(zzaaq zzaaq) {
        this.zzb.append(zzaaq.zzd, zzaaq);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j10, int i10, long j11) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
    }

    public final boolean zze(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                long j11 = this.zzg;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.zzm;
                if (j12 != -9223372036854775807L) {
                    this.zza.zzs(j12, this.zzn ? 1 : 0, (int) (j11 - this.zzl), i11, (zzaba) null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z13 = this.zzn;
        int i12 = this.zzf;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.zzn = z14;
        return z14;
    }
}
