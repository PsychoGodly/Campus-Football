package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzfs extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzfs zzb;
    private int zzd;
    private zzgv zze = zzii.zze();
    private String zzf = MaxReward.DEFAULT_LABEL;
    private long zzg;
    private long zzh;
    private double zzi;
    private zzez zzj = zzez.zzb;
    private String zzk = MaxReward.DEFAULT_LABEL;
    private byte zzl = 2;

    static {
        zzfs zzfs = new zzfs();
        zzb = zzfs;
        zzgo.zzC(zzfs.class, zzfs);
    }

    private zzfs() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzij(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzfr.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzfs();
        } else {
            if (i11 == 4) {
                return new zzfp((zzfm) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzl = b10;
            return null;
        }
    }
}
