package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjg extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjg zzb;
    private zzgjj zzd;

    static {
        zzgjg zzgjg = new zzgjg();
        zzb = zzgjg;
        zzgqm.zzaT(zzgjg.class, zzgjg);
    }

    private zzgjg() {
    }

    public static zzgjf zza() {
        return (zzgjf) zzb.zzaA();
    }

    public static zzgjg zzd(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgjg) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzf(zzgjg zzgjg, zzgjj zzgjj) {
        zzgjj.getClass();
        zzgjg.zzd = zzgjj;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgjg();
        } else {
            if (i11 == 4) {
                return new zzgjf((zzgje) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjj zze() {
        zzgjj zzgjj = this.zzd;
        return zzgjj == null ? zzgjj.zze() : zzgjj;
    }
}
