package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzkm extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzkm zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private String zze = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public int zzf;
    private String zzg = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzh = MaxReward.DEFAULT_LABEL;
    private int zzi;

    static {
        zzkm zzkm = new zzkm();
        zzb = zzkm;
        zzgo.zzC(zzkm.class, zzkm);
    }

    private zzkm() {
    }

    static /* synthetic */ void zzG(zzkm zzkm, String str) {
        str.getClass();
        zzkm.zzd = str;
    }

    public static zzkl zzg() {
        return (zzkl) zzb.zzp();
    }

    public static zzkm zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg"});
        } else if (i11 == 3) {
            return new zzkm();
        } else {
            if (i11 == 4) {
                return new zzkl((zzkk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzk() {
        return this.zzd;
    }
}
