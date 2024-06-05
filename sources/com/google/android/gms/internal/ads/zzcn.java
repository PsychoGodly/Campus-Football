package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzcn {
    public static final zzcn zza = new zzci();
    public static final zzn zzb = zzch.zza;
    private static final String zzc = zzew.zzP(0);
    private static final String zzd = zzew.zzP(1);
    private static final String zze = zzew.zzP(2);

    protected zzcn() {
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcn)) {
            return false;
        }
        zzcn zzcn = (zzcn) obj;
        if (zzcn.zzc() == zzc() && zzcn.zzb() == zzb()) {
            zzcm zzcm = new zzcm();
            zzck zzck = new zzck();
            zzcm zzcm2 = new zzcm();
            zzck zzck2 = new zzck();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzcm, 0).equals(zzcn.zze(i10, zzcm2, 0))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzck, true).equals(zzcn.zzd(i11, zzck2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzcn.zzg(true) && (zzh = zzh(true)) == zzcn.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzcn.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzcm zzcm = new zzcm();
        zzck zzck = new zzck();
        int zzc2 = zzc() + 217;
        for (int i10 = 0; i10 < zzc(); i10++) {
            zzc2 = (zzc2 * 31) + zze(i10, zzcm, 0).hashCode();
        }
        int zzb2 = (zzc2 * 31) + zzb();
        for (int i11 = 0; i11 < zzb(); i11++) {
            zzb2 = (zzb2 * 31) + zzd(i11, zzck, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzck zzd(int i10, zzck zzck, boolean z10);

    public abstract zzcm zze(int i10, zzcm zzcm, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzck zzck, zzcm zzcm, int i11, boolean z10) {
        int i12 = zzd(i10, zzck, false).zzd;
        if (zze(i12, zzcm, 0).zzp != i10) {
            return i10 + 1;
        }
        int zzj = zzj(i12, i11, z10);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzcm, 0).zzo;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == zzh(z10) ? zzg(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == zzh(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzcm zzcm, zzck zzck, int i10, long j10) {
        Pair zzm = zzm(zzcm, zzck, i10, j10, 0);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    public final Pair zzm(zzcm zzcm, zzck zzck, int i10, long j10, long j11) {
        zzdl.zza(i10, 0, zzc());
        zze(i10, zzcm, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzcm.zzm;
            j10 = 0;
        }
        int i11 = zzcm.zzo;
        zzd(i11, zzck, false);
        while (i11 < zzcm.zzp) {
            long j13 = zzck.zzf;
            int i12 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = zzd(i13, zzck, false).zzf;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        zzd(i11, zzck, true);
        long j15 = zzck.zzf;
        long j16 = zzck.zze;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0, j10);
        Object obj = zzck.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzck zzn(Object obj, zzck zzck) {
        return zzd(zza(obj), zzck, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
