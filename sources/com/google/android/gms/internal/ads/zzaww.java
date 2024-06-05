package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaww extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaww zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaww zzaww = new zzaww();
        zzb = zzaww;
        zzgqm.zzaT(zzaww.class, zzaww);
    }

    private zzaww() {
    }

    public static zzawv zza() {
        return (zzawv) zzb.zzaA();
    }

    public static zzaww zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzaww zzaww, boolean z10) {
        zzaww.zzd |= 1;
        zzaww.zze = z10;
    }

    static /* synthetic */ void zzf(zzaww zzaww, int i10) {
        zzaww.zzd |= 2;
        zzaww.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzaww();
        } else {
            if (i11 == 4) {
                return new zzawv((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
