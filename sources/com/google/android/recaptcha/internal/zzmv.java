package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzmv extends zzgo implements zzhz {
    public static final zzgm zzb;
    public static final zzgm zzd;
    /* access modifiers changed from: private */
    public static final zzmv zze;
    private int zzf;
    private int zzg;
    private zzgv zzh = zzgo.zzw();

    static {
        zzmv zzmv = new zzmv();
        zze = zzmv;
        zzgo.zzC(zzmv.class, zzmv);
        zzfo zzg2 = zzfo.zzg();
        zzjv zzjv = zzjv.STRING;
        zzb = zzgo.zzq(zzg2, MaxReward.DEFAULT_LABEL, (zzhy) null, (zzgr) null, 490775251, zzjv, String.class);
        zzd = zzgo.zzq(zzfo.zzg(), MaxReward.DEFAULT_LABEL, (zzhy) null, (zzgr) null, 490775252, zzjv, String.class);
    }

    private zzmv() {
    }

    public final int zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zze, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zzf", "zzg", "zzh", zzmu.class});
        } else if (i11 == 3) {
            return new zzmv();
        } else {
            if (i11 == 4) {
                return new zzmq((zzlv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final List zzj() {
        return this.zzh;
    }

    public final int zzk() {
        int i10;
        switch (this.zzf) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            case 13:
                i10 = 15;
                break;
            case 14:
                i10 = 16;
                break;
            case 15:
                i10 = 17;
                break;
            case 16:
                i10 = 18;
                break;
            case 17:
                i10 = 19;
                break;
            case 18:
                i10 = 20;
                break;
            case 19:
                i10 = 21;
                break;
            case 20:
                i10 = 22;
                break;
            case 21:
                i10 = 23;
                break;
            case 22:
                i10 = 24;
                break;
            case 23:
                i10 = 25;
                break;
            case 24:
                i10 = 26;
                break;
            case 25:
                i10 = 27;
                break;
            case 26:
                i10 = 28;
                break;
            case 27:
                i10 = 29;
                break;
            case 28:
                i10 = 30;
                break;
            case 29:
                i10 = 31;
                break;
            case 30:
                i10 = 32;
                break;
            case 31:
                i10 = 33;
                break;
            case 32:
                i10 = 34;
                break;
            case 33:
                i10 = 35;
                break;
            case 34:
                i10 = 36;
                break;
            case 35:
                i10 = 37;
                break;
            case 36:
                i10 = 38;
                break;
            case 37:
                i10 = 39;
                break;
            case 38:
                i10 = 40;
                break;
            case 39:
                i10 = 41;
                break;
            case 40:
                i10 = 42;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
