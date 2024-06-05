package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfew extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzfew zzb;
    private zzfes zzd;

    static {
        zzfew zzfew = new zzfew();
        zzb = zzfew;
        zzgqm.zzaT(zzfew.class, zzfew);
    }

    private zzfew() {
    }

    public static zzfev zza() {
        return (zzfev) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfew zzfew, zzfes zzfes) {
        zzfes.getClass();
        zzfew.zzd = zzfes;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzfew();
        } else {
            if (i11 == 4) {
                return new zzfev((zzfet) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
