package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvt extends zzajc<zzvt, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvt zzc;
    private static volatile zzakw<zzvt> zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzajj<zzvf> zzf = zzajc.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvt$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvt, zza> implements zzakp {
        private zza() {
            super(zzvt.zzc);
        }

        /* synthetic */ zza(zzvv zzvv) {
            this();
        }
    }

    static {
        zzvt zzvt = new zzvt();
        zzc = zzvt;
        zzajc.zza(zzvt.class, zzvt);
    }

    private zzvt() {
    }

    public static zzvt zzb() {
        return zzc;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvt>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvt> zzakw;
        switch (zzvv.zza[i10 - 1]) {
            case 1:
                return new zzvt();
            case 2:
                return new zza((zzvv) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvf.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvt> zzakw2 = zzd;
                zzakw<zzvt> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvt.class) {
                        zzakw<zzvt> zzakw4 = zzd;
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
