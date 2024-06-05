package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsu extends zzajc<zzsu, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsu zzc;
    private static volatile zzakw<zzsu> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsu, zza> implements zzakp {
        private zza() {
            super(zzsu.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzsu) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzst zzst) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsu) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsu zzsu = new zzsu();
        zzc = zzsu;
        zzajc.zza(zzsu.class, zzsu);
    }

    private zzsu() {
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

    public static zzsu zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsu) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsu>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsu> zzakw;
        switch (zzst.zza[i10 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza((zzst) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsu> zzakw2 = zzd;
                zzakw<zzsu> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsu.class) {
                        zzakw<zzsu> zzakw4 = zzd;
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
