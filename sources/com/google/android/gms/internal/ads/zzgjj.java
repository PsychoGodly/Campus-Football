package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjj extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjj zzb;
    private zzgjs zzd;
    private zzgjd zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgjj zzgjj = new zzgjj();
        zzb = zzgjj;
        zzgqm.zzaT(zzgjj.class, zzgjj);
    }

    private zzgjj() {
    }

    public static zzgji zzc() {
        return (zzgji) zzb.zzaA();
    }

    public static zzgjj zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgjj zzgjj, zzgjs zzgjs) {
        zzgjs.getClass();
        zzgjj.zzd = zzgjs;
    }

    static /* synthetic */ void zzh(zzgjj zzgjj, zzgjd zzgjd) {
        zzgjd.getClass();
        zzgjj.zze = zzgjd;
    }

    public final zzgjd zza() {
        zzgjd zzgjd = this.zze;
        return zzgjd == null ? zzgjd.zzd() : zzgjd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgjj();
        } else {
            if (i11 == 4) {
                return new zzgji((zzgjh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjs zzf() {
        zzgjs zzgjs = this.zzd;
        return zzgjs == null ? zzgjs.zzd() : zzgjs;
    }

    public final int zzi() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
