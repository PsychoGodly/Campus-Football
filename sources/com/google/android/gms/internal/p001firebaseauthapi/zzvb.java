package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvb extends zzajc<zzvb, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvb zzc;
    private static volatile zzakw<zzvb> zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzahp zzf = zzahp.zza;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvb, zza> implements zzakp {
        private zza() {
            super(zzvb.zzc);
        }

        public final zza zza(zzvs zzvs) {
            zzi();
            ((zzvb) this.zza).zza(zzvs);
            return this;
        }

        /* synthetic */ zza(zzvd zzvd) {
            this();
        }

        public final zza zza(String str) {
            zzi();
            ((zzvb) this.zza).zza(str);
            return this;
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzvb) this.zza).zza(zzahp);
            return this;
        }
    }

    static {
        zzvb zzvb = new zzvb();
        zzc = zzvb;
        zzajc.zza(zzvb.class, zzvb);
    }

    private zzvb() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvb zzc() {
        return zzc;
    }

    public final zzvs zzd() {
        zzvs zza2 = zzvs.zza(this.zzg);
        return zza2 == null ? zzvs.UNRECOGNIZED : zza2;
    }

    public final zzahp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public static zzvb zza(byte[] bArr, zzaio zzaio) throws zzaji {
        return (zzvb) zzajc.zza(zzc, bArr, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvb>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvb> zzakw;
        switch (zzvd.zza[i10 - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza((zzvd) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvb> zzakw2 = zzd;
                zzakw<zzvb> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvb.class) {
                        zzakw<zzvb> zzakw4 = zzd;
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
    public final void zza(zzvs zzvs) {
        this.zzg = zzvs.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzf = zzahp;
    }
}
