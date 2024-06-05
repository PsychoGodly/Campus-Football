package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzanw extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzanw zzb;
    private int zzd;
    private zzgpe zze;
    private zzgpe zzf;
    private zzgpe zzg;
    private zzgpe zzh;

    static {
        zzanw zzanw = new zzanw();
        zzb = zzanw;
        zzgqm.zzaT(zzanw.class, zzanw);
    }

    private zzanw() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zze = zzgpe;
        this.zzf = zzgpe;
        this.zzg = zzgpe;
        this.zzh = zzgpe;
    }

    public static zzanv zza() {
        return (zzanv) zzb.zzaA();
    }

    public static zzanw zzd(byte[] bArr, zzgpy zzgpy) throws zzgqy {
        return (zzanw) zzgqm.zzaI(zzb, bArr, zzgpy);
    }

    static /* synthetic */ void zzi(zzanw zzanw, zzgpe zzgpe) {
        zzanw.zzd |= 1;
        zzanw.zze = zzgpe;
    }

    static /* synthetic */ void zzj(zzanw zzanw, zzgpe zzgpe) {
        zzanw.zzd |= 2;
        zzanw.zzf = zzgpe;
    }

    static /* synthetic */ void zzk(zzanw zzanw, zzgpe zzgpe) {
        zzanw.zzd |= 4;
        zzanw.zzg = zzgpe;
    }

    static /* synthetic */ void zzl(zzanw zzanw, zzgpe zzgpe) {
        zzanw.zzd |= 8;
        zzanw.zzh = zzgpe;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzanw();
        } else {
            if (i11 == 4) {
                return new zzanv((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpe zze() {
        return this.zze;
    }

    public final zzgpe zzf() {
        return this.zzf;
    }

    public final zzgpe zzg() {
        return this.zzh;
    }

    public final zzgpe zzh() {
        return this.zzg;
    }
}
