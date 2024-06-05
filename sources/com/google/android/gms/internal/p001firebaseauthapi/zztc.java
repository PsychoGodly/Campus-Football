package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztc extends zzajc<zztc, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztc zzc;
    private static volatile zzakw<zztc> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztc$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztc, zza> implements zzakp {
        private zza() {
            super(zztc.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zztc) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zztb zztb) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztc) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zztc zztc = new zztc();
        zzc = zztc;
        zzajc.zza(zztc.class, zztc);
    }

    private zztc() {
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

    public static zztc zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztc) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztc>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztc> zzakw;
        switch (zztb.zza[i10 - 1]) {
            case 1:
                return new zztc();
            case 2:
                return new zza((zztb) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztc> zzakw2 = zzd;
                zzakw<zztc> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztc.class) {
                        zzakw<zztc> zzakw4 = zzd;
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
