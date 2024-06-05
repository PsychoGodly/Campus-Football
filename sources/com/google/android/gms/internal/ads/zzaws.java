package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaws extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaws zzb;
    private int zzd;
    private int zze;
    private zzaww zzf;
    private zzawy zzg;

    static {
        zzaws zzaws = new zzaws();
        zzb = zzaws;
        zzgqm.zzaT(zzaws.class, zzaws);
    }

    private zzaws() {
    }

    public static zzawr zza() {
        return (zzawr) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaws zzaws, zzaww zzaww) {
        zzaww.getClass();
        zzaws.zzf = zzaww;
        zzaws.zzd |= 2;
    }

    static /* synthetic */ void zze(zzaws zzaws, zzawy zzawy) {
        zzawy.getClass();
        zzaws.zzg = zzawy;
        zzaws.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzaws zzaws, int i10) {
        zzaws.zze = 1;
        zzaws.zzd = 1 | zzaws.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzawu.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaws();
        } else {
            if (i11 == 4) {
                return new zzawr((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
