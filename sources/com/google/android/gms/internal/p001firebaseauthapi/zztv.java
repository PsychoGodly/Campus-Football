package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztv extends zzajc<zztv, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztv zzc;
    private static volatile zzakw<zztv> zzd;
    private int zze;
    private int zzf;
    private zzahp zzg = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztv, zza> implements zzakp {
        private zza() {
            super(zztv.zzc);
        }

        public final zza zza(zzty zzty) {
            zzi();
            ((zztv) this.zza).zza(zzty);
            return this;
        }

        /* synthetic */ zza(zztw zztw) {
            this();
        }

        public final zza zza(zzub zzub) {
            zzi();
            ((zztv) this.zza).zza(zzub);
            return this;
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zztv) this.zza).zza(zzahp);
            return this;
        }
    }

    static {
        zztv zztv = new zztv();
        zzc = zztv;
        zzajc.zza(zztv.class, zztv);
    }

    private zztv() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zztv zzc() {
        return zzc;
    }

    public final zzty zzd() {
        zzty zza2 = zzty.zza(this.zze);
        return zza2 == null ? zzty.UNRECOGNIZED : zza2;
    }

    public final zzub zze() {
        zzub zza2 = zzub.zza(this.zzf);
        return zza2 == null ? zzub.UNRECOGNIZED : zza2;
    }

    public final zzahp zzf() {
        return this.zzg;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztv>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztv> zzakw;
        switch (zztw.zza[i10 - 1]) {
            case 1:
                return new zztv();
            case 2:
                return new zza((zztw) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztv> zzakw2 = zzd;
                zzakw<zztv> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztv.class) {
                        zzakw<zztv> zzakw4 = zzd;
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
    public final void zza(zzty zzty) {
        this.zze = zzty.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(zzub zzub) {
        this.zzf = zzub.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzg = zzahp;
    }
}
