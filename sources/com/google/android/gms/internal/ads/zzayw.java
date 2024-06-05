package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzayw extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzayw zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzayw zzayw = new zzayw();
        zzb = zzayw;
        zzgqm.zzaT(zzayw.class, zzayw);
    }

    private zzayw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzayw();
        } else {
            if (i11 == 4) {
                return new zzayv((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
