package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzanp extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzanp zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt;
    private long zzu;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzanp zzanp = new zzanp();
        zzb = zzanp;
        zzgqm.zzaT(zzanp.class, zzanp);
    }

    private zzanp() {
    }

    public static zzano zza() {
        return (zzano) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzanp zzanp, long j10) {
        zzanp.zzd |= 1;
        zzanp.zze = j10;
    }

    static /* synthetic */ void zze(zzanp zzanp, long j10) {
        zzanp.zzd |= 2;
        zzanp.zzf = j10;
    }

    static /* synthetic */ void zzf(zzanp zzanp, long j10) {
        zzanp.zzd |= 4;
        zzanp.zzg = j10;
    }

    static /* synthetic */ void zzg(zzanp zzanp, long j10) {
        zzanp.zzd |= 8;
        zzanp.zzh = j10;
    }

    static /* synthetic */ void zzh(zzanp zzanp) {
        zzanp.zzd &= -9;
        zzanp.zzh = -1;
    }

    static /* synthetic */ void zzi(zzanp zzanp, long j10) {
        zzanp.zzd |= 16;
        zzanp.zzi = j10;
    }

    static /* synthetic */ void zzj(zzanp zzanp, long j10) {
        zzanp.zzd |= 32;
        zzanp.zzj = j10;
    }

    static /* synthetic */ void zzk(zzanp zzanp, long j10) {
        zzanp.zzd |= 128;
        zzanp.zzl = j10;
    }

    static /* synthetic */ void zzl(zzanp zzanp, long j10) {
        zzanp.zzd |= 256;
        zzanp.zzm = j10;
    }

    static /* synthetic */ void zzm(zzanp zzanp, long j10) {
        zzanp.zzd |= 512;
        zzanp.zzn = j10;
    }

    static /* synthetic */ void zzn(zzanp zzanp, long j10) {
        zzanp.zzd |= 2048;
        zzanp.zzp = j10;
    }

    static /* synthetic */ void zzo(zzanp zzanp, long j10) {
        zzanp.zzd |= 4096;
        zzanp.zzq = j10;
    }

    static /* synthetic */ void zzp(zzanp zzanp, long j10) {
        zzanp.zzd |= 8192;
        zzanp.zzr = j10;
    }

    static /* synthetic */ void zzq(zzanp zzanp, long j10) {
        zzanp.zzd |= 16384;
        zzanp.zzs = j10;
    }

    static /* synthetic */ void zzr(zzanp zzanp, long j10) {
        zzanp.zzd |= 32768;
        zzanp.zzt = j10;
    }

    static /* synthetic */ void zzs(zzanp zzanp, long j10) {
        zzanp.zzd |= 65536;
        zzanp.zzu = j10;
    }

    static /* synthetic */ void zzt(zzanp zzanp, long j10) {
        zzanp.zzd |= 131072;
        zzanp.zzv = j10;
    }

    static /* synthetic */ void zzu(zzanp zzanp, long j10) {
        zzanp.zzd |= 262144;
        zzanp.zzw = j10;
    }

    static /* synthetic */ void zzv(zzanp zzanp, int i10) {
        zzanp.zzk = i10 - 1;
        zzanp.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzanp zzanp, int i10) {
        zzanp.zzo = i10 - 1;
        zzanp.zzd |= 1024;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgqq zzgqq = zzany.zza;
            return zzgqm.zzaQ(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgqq, "zzl", "zzm", "zzn", "zzo", zzgqq, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        } else if (i11 == 3) {
            return new zzanp();
        } else {
            if (i11 == 4) {
                return new zzano((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
