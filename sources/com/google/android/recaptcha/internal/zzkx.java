package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzkx extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzkx zzb;
    private int zzd = 0;
    private Object zze;
    /* access modifiers changed from: private */
    public int zzf;
    private String zzg = MaxReward.DEFAULT_LABEL;
    private String zzh = MaxReward.DEFAULT_LABEL;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private String zzj = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public long zzk;
    private zzfw zzl;
    /* access modifiers changed from: private */
    public int zzm;
    /* access modifiers changed from: private */
    public zzkm zzn;
    private zzlj zzo;
    /* access modifiers changed from: private */
    public String zzp = MaxReward.DEFAULT_LABEL;
    private zzjd zzq;
    private zzgv zzr = zzgo.zzw();
    private zzfw zzs;

    static {
        zzkx zzkx = new zzkx();
        zzb = zzkx;
        zzgo.zzC(zzkx.class, zzkx);
    }

    private zzkx() {
    }

    public static zzkx zzG(byte[] bArr) throws zzgy {
        return (zzkx) zzgo.zzu(zzb, bArr);
    }

    static /* synthetic */ void zzJ(zzkx zzkx, String str) {
        str.getClass();
        zzkx.zzi = str;
    }

    static /* synthetic */ void zzM(zzkx zzkx, zzlj zzlj) {
        zzlj.getClass();
        zzkx.zzo = zzlj;
    }

    static /* synthetic */ void zzP(zzkx zzkx, zzkg zzkg) {
        zzkg.getClass();
        zzkx.zze = zzkg;
        zzkx.zzd = 15;
    }

    static /* synthetic */ void zzQ(zzkx zzkx, String str) {
        str.getClass();
        zzkx.zzg = str;
    }

    static /* synthetic */ void zzR(zzkx zzkx, String str) {
        str.getClass();
        zzkx.zzh = str;
    }

    public static zzku zzi() {
        return (zzku) zzb.zzp();
    }

    public final String zzH() {
        return this.zzh;
    }

    public final String zzI() {
        return this.zzi;
    }

    public final boolean zzS() {
        return this.zzn != null;
    }

    public final int zzT() {
        int i10 = this.zzm;
        int i11 = 2;
        if (i10 != 0) {
            i11 = i10 != 1 ? i10 != 2 ? 0 : 4 : 3;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Deprecated
    public final long zzf() {
        return this.zzk;
    }

    public final zzkm zzg() {
        zzkm zzkm = this.zzn;
        return zzkm == null ? zzkm.zzj() : zzkm;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005\t\u0006\t\u0007Ȉ\bȈ\tȈ\n\t\u000b\t\f\u001b\r\t\u000eȈ\u000f<\u0000\u0010<\u0000", new Object[]{"zze", "zzd", "zzf", "zzh", "zzk", "zzm", "zzn", "zzo", "zzp", "zzi", "zzj", "zzl", "zzq", "zzr", zzlm.class, "zzs", "zzg", zzkg.class, zzkd.class});
        } else if (i11 == 3) {
            return new zzkx();
        } else {
            if (i11 == 4) {
                return new zzku((zzkt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzkw zzj() {
        int i10 = this.zzf;
        zzkw zzkw = zzkw.UNKNOWN;
        switch (i10) {
            case 0:
                break;
            case 1:
                zzkw = zzkw.INIT_NATIVE;
                break;
            case 2:
                zzkw = zzkw.INIT_NETWORK;
                break;
            case 3:
                zzkw = zzkw.INIT_JS;
                break;
            case 4:
                zzkw = zzkw.INIT_TOTAL;
                break;
            case 5:
                zzkw = zzkw.EXECUTE_NATIVE;
                break;
            case 6:
                zzkw = zzkw.EXECUTE_JS;
                break;
            case 7:
                zzkw = zzkw.EXECUTE_TOTAL;
                break;
            case 8:
                zzkw = zzkw.CHALLENGE_ACCOUNT_NATIVE;
                break;
            case 9:
                zzkw = zzkw.CHALLENGE_ACCOUNT_JS;
                break;
            case 10:
                zzkw = zzkw.CHALLENGE_ACCOUNT_TOTAL;
                break;
            case 11:
                zzkw = zzkw.VERIFY_PIN_NATIVE;
                break;
            case 12:
                zzkw = zzkw.VERIFY_PIN_JS;
                break;
            case 13:
                zzkw = zzkw.VERIFY_PIN_TOTAL;
                break;
            case 14:
                zzkw = zzkw.RUN_PROGRAM;
                break;
            case 15:
                zzkw = zzkw.FETCH_ALLOWLIST;
                break;
            case 16:
                zzkw = zzkw.JS_LOAD;
                break;
            default:
                zzkw = null;
                break;
        }
        return zzkw == null ? zzkw.UNRECOGNIZED : zzkw;
    }
}
