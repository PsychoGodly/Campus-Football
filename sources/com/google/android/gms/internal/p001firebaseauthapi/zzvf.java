package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvf extends zzajc<zzvf, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvf zzc;
    private static volatile zzakw<zzvf> zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private int zzg;
    private boolean zzh;
    private String zzi = MaxReward.DEFAULT_LABEL;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvf$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvf, zza> implements zzakp {
        private zza() {
            super(zzvf.zzc);
        }

        /* synthetic */ zza(zzve zzve) {
            this();
        }
    }

    static {
        zzvf zzvf = new zzvf();
        zzc = zzvf;
        zzajc.zza(zzvf.class, zzvf);
    }

    private zzvf() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvf>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvf> zzakw;
        switch (zzve.zza[i10 - 1]) {
            case 1:
                return new zzvf();
            case 2:
                return new zza((zzve) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvf> zzakw2 = zzd;
                zzakw<zzvf> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvf.class) {
                        zzakw<zzvf> zzakw4 = zzd;
                        zzakw = zzakw4;
                        if (zzakw4 == null) {
                            ? zzc2 = new zzajc.zzc(zzc);
                            zzd = zzc2;
                            zzakw = zzc2;
                        }
                    }
                    zzakw3 = zzakw;
                }
                return zzakw3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
