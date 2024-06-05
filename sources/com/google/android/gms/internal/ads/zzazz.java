package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazz extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazz zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzazz zzazz = new zzazz();
        zzb = zzazz;
        zzgqm.zzaT(zzazz.class, zzazz);
    }

    private zzazz() {
    }

    public static zzazy zza() {
        return (zzazy) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzazz zzazz, boolean z10) {
        zzazz.zzd |= 1;
        zzazz.zze = z10;
    }

    static /* synthetic */ void zze(zzazz zzazz, int i10) {
        zzazz.zzd |= 2;
        zzazz.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzazz();
        } else {
            if (i11 == 4) {
                return new zzazy((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzf() {
        return this.zze;
    }
}
