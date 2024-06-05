package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfim extends zzgqm implements zzgrx {
    private static final zzgqs zzb = new zzfij();
    /* access modifiers changed from: private */
    public static final zzfim zzd;
    private int zze;
    private zzgqr zzf = zzgqm.zzaJ();
    private String zzg = MaxReward.DEFAULT_LABEL;
    private String zzh = MaxReward.DEFAULT_LABEL;
    private String zzi = MaxReward.DEFAULT_LABEL;

    static {
        zzfim zzfim = new zzfim();
        zzd = zzfim;
        zzgqm.zzaT(zzfim.class, zzfim);
    }

    private zzfim() {
    }

    public static zzfil zza() {
        return (zzfil) zzd.zzaA();
    }

    static /* synthetic */ void zzd(zzfim zzfim, String str) {
        str.getClass();
        zzfim.zze |= 1;
        zzfim.zzg = str;
    }

    static /* synthetic */ void zze(zzfim zzfim, int i10) {
        zzgqr zzgqr = zzfim.zzf;
        if (!zzgqr.zzc()) {
            zzfim.zzf = zzgqm.zzaK(zzgqr);
        }
        zzfim.zzf.zzh(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfik.zza, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzfim();
        } else {
            if (i11 == 4) {
                return new zzfil((zzfij) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
