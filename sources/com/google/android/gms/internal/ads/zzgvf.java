package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvf extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvf zzb;
    private int zzd;
    private zzgve zze;
    private zzgqv zzf = zzgqm.zzaM();
    private zzgpe zzg;
    private zzgpe zzh;
    private int zzi;
    private zzgpe zzj;
    private byte zzk = 2;

    static {
        zzgvf zzgvf = new zzgvf();
        zzb = zzgvf;
        zzgqm.zzaT(zzgvf.class, zzgvf);
    }

    private zzgvf() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzg = zzgpe;
        this.zzh = zzgpe;
        this.zzj = zzgpe;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgux.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzgvf();
        } else {
            if (i11 == 4) {
                return new zzgvc((zzgub) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzk = b10;
            return null;
        }
    }
}
