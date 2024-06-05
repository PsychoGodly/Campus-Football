package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzawy extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzawy zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzawy zzawy = new zzawy();
        zzb = zzawy;
        zzgqm.zzaT(zzawy.class, zzawy);
    }

    private zzawy() {
    }

    public static zzawx zza() {
        return (zzawx) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzawy zzawy, boolean z10) {
        zzawy.zzd |= 1;
        zzawy.zze = z10;
    }

    static /* synthetic */ void zze(zzawy zzawy, boolean z10) {
        zzawy.zzd |= 2;
        zzawy.zzf = z10;
    }

    static /* synthetic */ void zzf(zzawy zzawy, int i10) {
        zzawy.zzd |= 4;
        zzawy.zzg = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzawy();
        } else {
            if (i11 == 4) {
                return new zzawx((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
