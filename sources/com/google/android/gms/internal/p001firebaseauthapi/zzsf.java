package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsf extends zzajc<zzsf, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsf zzc;
    private static volatile zzakw<zzsf> zzd;
    private int zze;
    private zzsj zzf;
    private zzug zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsf$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsf, zza> implements zzakp {
        private zza() {
            super(zzsf.zzc);
        }

        public final zza zza(zzsj zzsj) {
            zzi();
            ((zzsf) this.zza).zza(zzsj);
            return this;
        }

        /* synthetic */ zza(zzsg zzsg) {
            this();
        }

        public final zza zza(zzug zzug) {
            zzi();
            ((zzsf) this.zza).zza(zzug);
            return this;
        }
    }

    static {
        zzsf zzsf = new zzsf();
        zzc = zzsf;
        zzajc.zza(zzsf.class, zzsf);
    }

    private zzsf() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzsj zzc() {
        zzsj zzsj = this.zzf;
        return zzsj == null ? zzsj.zzd() : zzsj;
    }

    public final zzug zzd() {
        zzug zzug = this.zzg;
        return zzug == null ? zzug.zze() : zzug;
    }

    public static zzsf zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsf) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsf>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsf> zzakw;
        switch (zzsg.zza[i10 - 1]) {
            case 1:
                return new zzsf();
            case 2:
                return new zza((zzsg) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsf> zzakw2 = zzd;
                zzakw<zzsf> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsf.class) {
                        zzakw<zzsf> zzakw4 = zzd;
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
    public final void zza(zzsj zzsj) {
        zzsj.getClass();
        this.zzf = zzsj;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(zzug zzug) {
        zzug.getClass();
        this.zzg = zzug;
        this.zze |= 2;
    }
}
