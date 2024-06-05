package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazt extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazt zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzazt zzazt = new zzazt();
        zzb = zzazt;
        zzgqm.zzaT(zzazt.class, zzazt);
    }

    private zzazt() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzaxr.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzazt();
        } else {
            if (i11 == 4) {
                return new zzazs((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
