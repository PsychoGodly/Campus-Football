package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztg extends zzajc<zztg, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztg zzc;
    private static volatile zzakw<zztg> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztg, zza> implements zzakp {
        private zza() {
            super(zztg.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zztg) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zztf zztf) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztg) this.zza).zza(0);
            return this;
        }
    }

    static {
        zztg zztg = new zztg();
        zzc = zztg;
        zzajc.zza(zztg.class, zztg);
    }

    private zztg() {
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

    public static zztg zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztg) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztg>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztg> zzakw;
        switch (zztf.zza[i10 - 1]) {
            case 1:
                return new zztg();
            case 2:
                return new zza((zztf) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztg> zzakw2 = zzd;
                zzakw<zztg> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztg.class) {
                        zzakw<zztg> zzakw4 = zzd;
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
