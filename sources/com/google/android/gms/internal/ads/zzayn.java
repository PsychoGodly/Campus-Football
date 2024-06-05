package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzayn extends zzgqm implements zzgrx {
    private static final zzgqs zzb = new zzayl();
    /* access modifiers changed from: private */
    public static final zzayn zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgqr zzj = zzgqm.zzaJ();
    private zzayi zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzayn zzayn = new zzayn();
        zzd = zzayn;
        zzgqm.zzaT(zzayn.class, zzayn);
    }

    private zzayn() {
    }

    static /* synthetic */ void zzA(zzayn zzayn, int i10) {
        zzayn.zzm = i10 - 1;
        zzayn.zze |= 64;
    }

    static /* synthetic */ void zzB(zzayn zzayn, int i10) {
        zzayn.zzn = i10 - 1;
        zzayn.zze |= 128;
    }

    static /* synthetic */ void zzC(zzayn zzayn, int i10) {
        zzayn.zzp = i10 - 1;
        zzayn.zze |= 512;
    }

    public static zzaym zzg() {
        return (zzaym) zzd.zzaA();
    }

    public static zzayn zzi(byte[] bArr) throws zzgqy {
        return (zzayn) zzgqm.zzaF(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzayn zzayn, long j10) {
        zzayn.zze |= 1;
        zzayn.zzf = j10;
    }

    static /* synthetic */ void zzm(zzayn zzayn, long j10) {
        zzayn.zze |= 4;
        zzayn.zzh = j10;
    }

    static /* synthetic */ void zzn(zzayn zzayn, long j10) {
        zzayn.zze |= 8;
        zzayn.zzi = j10;
    }

    static /* synthetic */ void zzo(zzayn zzayn, Iterable iterable) {
        zzgqr zzgqr = zzayn.zzj;
        if (!zzgqr.zzc()) {
            zzayn.zzj = zzgqm.zzaK(zzgqr);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzayn.zzj.zzh(((zzaxc) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzayn zzayn, zzayi zzayi) {
        zzayi.getClass();
        zzayn.zzk = zzayi;
        zzayn.zze |= 16;
    }

    static /* synthetic */ void zzq(zzayn zzayn, int i10) {
        zzayn.zze |= 256;
        zzayn.zzo = i10;
    }

    static /* synthetic */ void zzr(zzayn zzayn, zzayr zzayr) {
        zzayn.zzq = zzayr.zza();
        zzayn.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzayn zzayn, long j10) {
        zzayn.zze |= 2048;
        zzayn.zzr = j10;
    }

    static /* synthetic */ void zzy(zzayn zzayn, int i10) {
        zzayn.zzg = i10 - 1;
        zzayn.zze |= 2;
    }

    static /* synthetic */ void zzz(zzayn zzayn, int i10) {
        zzayn.zzl = i10 - 1;
        zzayn.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgqq zzgqq = zzaxr.zza;
            return zzgqm.zzaQ(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgqq, "zzh", "zzi", "zzj", zzaxc.zzc(), "zzk", "zzl", zzgqq, "zzm", zzgqq, "zzn", zzgqq, "zzo", "zzp", zzgqq, "zzq", zzayr.zzc(), "zzr"});
        } else if (i11 == 3) {
            return new zzayn();
        } else {
            if (i11 == 4) {
                return new zzaym((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzayi zzf() {
        zzayi zzayi = this.zzk;
        return zzayi == null ? zzayi.zzd() : zzayi;
    }

    public final zzayr zzj() {
        zzayr zzb2 = zzayr.zzb(this.zzq);
        return zzb2 == null ? zzayr.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgqt(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzaxs.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzaxs.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzaxs.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzaxs.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzaxs.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
