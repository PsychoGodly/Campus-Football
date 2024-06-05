package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgwe extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgwe zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private int zzg = 4;
    private zzgqv zzh = zzgqm.zzaM();
    private String zzi = MaxReward.DEFAULT_LABEL;
    private String zzj = MaxReward.DEFAULT_LABEL;
    private boolean zzk;
    private double zzl;
    private zzgqv zzm = zzgqm.zzaM();
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        zzgwe zzgwe = new zzgwe();
        zzb = zzgwe;
        zzgqm.zzaT(zzgwe.class, zzgwe);
    }

    private zzgwe() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\nဌ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", zzgwd.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgwc.class, "zzf", "zzn", zzgwa.zza, "zzo", "zzp", "zzq", "zzr"});
        } else if (i11 == 3) {
            return new zzgwe();
        } else {
            if (i11 == 4) {
                return new zzgvz((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
