package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzamo extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzamo zzb;
    private int zzd;
    private zzamq zze;
    private zzamt zzf;

    static {
        zzamo zzamo = new zzamo();
        zzb = zzamo;
        zzgqm.zzaT(zzamo.class, zzamo);
    }

    private zzamo() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzamo();
        } else {
            if (i11 == 4) {
                return new zzamn((zzamm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}