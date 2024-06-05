package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaya extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaya zzb;
    private int zzd;
    private zzaxw zze;
    private zzgqv zzf = zzgqm.zzaM();
    private int zzg;
    private zzazc zzh;

    static {
        zzaya zzaya = new zzaya();
        zzb = zzaya;
        zzgqm.zzaT(zzaya.class, zzaya);
    }

    private zzaya() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaza.class, "zzg", zzaxr.zza, "zzh"});
        } else if (i11 == 3) {
            return new zzaya();
        } else {
            if (i11 == 4) {
                return new zzaxz((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
