package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzanr extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzanr zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzanr zzanr = new zzanr();
        zzb = zzanr;
        zzgqm.zzaT(zzanr.class, zzanr);
    }

    private zzanr() {
    }

    public static zzanq zza() {
        return (zzanq) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzanr zzanr, long j10) {
        zzanr.zzd |= 1;
        zzanr.zze = j10;
    }

    static /* synthetic */ void zze(zzanr zzanr, long j10) {
        zzanr.zzd |= 4;
        zzanr.zzg = j10;
    }

    static /* synthetic */ void zzf(zzanr zzanr, long j10) {
        zzanr.zzd |= 8;
        zzanr.zzh = j10;
    }

    static /* synthetic */ void zzg(zzanr zzanr, long j10) {
        zzanr.zzd |= 16;
        zzanr.zzi = j10;
    }

    static /* synthetic */ void zzh(zzanr zzanr, long j10) {
        zzanr.zzd |= 32;
        zzanr.zzj = j10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new zzanr();
        } else {
            if (i11 == 4) {
                return new zzanq((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
