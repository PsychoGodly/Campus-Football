package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvr extends zzajc<zzvr, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvr zzc;
    private static volatile zzakw<zzvr> zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private zzvb zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvr$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvr, zza> implements zzakp {
        private zza() {
            super(zzvr.zzc);
        }

        public final zza zza(zzvb zzvb) {
            zzi();
            ((zzvr) this.zza).zza(zzvb);
            return this;
        }

        /* synthetic */ zza(zzvq zzvq) {
            this();
        }

        public final zza zza(String str) {
            zzi();
            ((zzvr) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvr zzvr = new zzvr();
        zzc = zzvr;
        zzajc.zza(zzvr.class, zzvr);
    }

    private zzvr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzvr zzd() {
        return zzc;
    }

    public final zzvb zza() {
        zzvb zzvb = this.zzg;
        return zzvb == null ? zzvb.zzc() : zzvb;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public static zzvr zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvr) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvr>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvr> zzakw;
        switch (zzvq.zza[i10 - 1]) {
            case 1:
                return new zzvr();
            case 2:
                return new zza((zzvq) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvr> zzakw2 = zzd;
                zzakw<zzvr> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvr.class) {
                        zzakw<zzvr> zzakw4 = zzd;
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
    public final void zza(zzvb zzvb) {
        zzvb.getClass();
        this.zzg = zzvb;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zzf = str;
    }
}
