package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazn extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazn zzb;
    private int zzd;
    private zzaze zze;
    private int zzf = 1000;
    private zzazl zzg;
    private zzazc zzh;

    static {
        zzazn zzazn = new zzazn();
        zzb = zzazn;
        zzgqm.zzaT(zzazn.class, zzazn);
    }

    private zzazn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzazn();
        } else {
            if (i11 == 4) {
                return new zzazm((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
