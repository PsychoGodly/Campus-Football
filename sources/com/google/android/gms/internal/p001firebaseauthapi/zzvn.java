package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvn extends zzajc<zzvn, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvn zzc;
    private static volatile zzakw<zzvn> zzd;
    private String zze = MaxReward.DEFAULT_LABEL;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvn, zza> implements zzakp {
        private zza() {
            super(zzvn.zzc);
        }

        public final zza zza(String str) {
            zzi();
            ((zzvn) this.zza).zza(str);
            return this;
        }

        /* synthetic */ zza(zzvm zzvm) {
            this();
        }
    }

    static {
        zzvn zzvn = new zzvn();
        zzc = zzvn;
        zzajc.zza(zzvn.class, zzvn);
    }

    private zzvn() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvn zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzvn zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvn) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvn>] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvn> zzakw;
        switch (zzvm.zza[i10 - 1]) {
            case 1:
                return new zzvn();
            case 2:
                return new zza((zzvm) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvn> zzakw2 = zzd;
                zzakw<zzvn> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvn.class) {
                        zzakw<zzvn> zzakw4 = zzd;
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

    /* access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }
}
