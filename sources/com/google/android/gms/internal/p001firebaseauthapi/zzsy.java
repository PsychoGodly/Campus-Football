package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsy extends zzajc<zzsy, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsy zzc;
    private static volatile zzakw<zzsy> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsy, zza> implements zzakp {
        private zza() {
            super(zzsy.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzsy) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzsx zzsx) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsy) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsy zzsy = new zzsy();
        zzc = zzsy;
        zzajc.zza(zzsy.class, zzsy);
    }

    private zzsy() {
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

    public static zzsy zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsy) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsy>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsy> zzakw;
        switch (zzsx.zza[i10 - 1]) {
            case 1:
                return new zzsy();
            case 2:
                return new zza((zzsx) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsy> zzakw2 = zzd;
                zzakw<zzsy> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsy.class) {
                        zzakw<zzsy> zzakw4 = zzd;
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
