package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzguv extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzguv zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzguv zzguv = new zzguv();
        zzb = zzguv;
        zzgqm.zzaT(zzguv.class, zzguv);
    }

    private zzguv() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzguu.zza, "zzf", zzgus.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzguv();
        } else {
            if (i11 == 4) {
                return new zzgut((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
