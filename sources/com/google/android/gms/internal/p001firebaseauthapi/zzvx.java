package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvx extends zzajc<zzvx, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvx zzc;
    private static volatile zzakw<zzvx> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvx$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvx, zza> implements zzakp {
        private zza() {
            super(zzvx.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzvx) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzvw zzvw) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvx) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzvx zzvx = new zzvx();
        zzc = zzvx;
        zzajc.zza(zzvx.class, zzvx);
    }

    private zzvx() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final zzahp zzd() {
        return this.zzf;
    }

    public static zzvx zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvx) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvx>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvx> zzakw;
        switch (zzvw.zza[i10 - 1]) {
            case 1:
                return new zzvx();
            case 2:
                return new zza((zzvw) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvx> zzakw2 = zzd;
                zzakw<zzvx> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvx.class) {
                        zzakw<zzvx> zzakw4 = zzd;
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
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzf = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }
}
