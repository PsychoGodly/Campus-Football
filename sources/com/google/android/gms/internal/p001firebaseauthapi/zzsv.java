package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsv extends zzajc<zzsv, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsv zzc;
    private static volatile zzakw<zzsv> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsv$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsv, zza> implements zzakp {
        private zza() {
            super(zzsv.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsv) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsw zzsw) {
            this();
        }
    }

    static {
        zzsv zzsv = new zzsv();
        zzc = zzsv;
        zzajc.zza(zzsv.class, zzsv);
    }

    private zzsv() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzsv zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsv) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsv>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsv> zzakw;
        switch (zzsw.zza[i10 - 1]) {
            case 1:
                return new zzsv();
            case 2:
                return new zza((zzsw) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsv> zzakw2 = zzd;
                zzakw<zzsv> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsv.class) {
                        zzakw<zzsv> zzakw4 = zzd;
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
    public final void zza(int i10) {
        this.zze = i10;
    }
}
