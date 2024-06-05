package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvb extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvb zzb;
    private int zzd;
    private zzgva zze;
    private zzgqv zzf = zzgqm.zzaM();
    private zzgpe zzg;
    private zzgpe zzh;
    private int zzi;
    private byte zzj = 2;

    static {
        zzgvb zzgvb = new zzgvb();
        zzb = zzgvb;
        zzgqm.zzaT(zzgvb.class, zzgvb);
    }

    private zzgvb() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzg = zzgpe;
        this.zzh = zzgpe;
    }

    public static zzguy zza() {
        return (zzguy) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgvb zzgvb, zzgux zzgux) {
        zzgux.getClass();
        zzgqv zzgqv = zzgvb.zzf;
        if (!zzgqv.zzc()) {
            zzgvb.zzf = zzgqm.zzaN(zzgqv);
        }
        zzgvb.zzf.add(zzgux);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgux.class, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzgvb();
        } else {
            if (i11 == 4) {
                return new zzguy((zzgub) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzj = b10;
            return null;
        }
    }
}
