package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsz extends zzajc<zzsz, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsz zzc;
    private static volatile zzakw<zzsz> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsz, zza> implements zzakp {
        private zza() {
            super(zzsz.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsz) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzta zzta) {
            this();
        }
    }

    static {
        zzsz zzsz = new zzsz();
        zzc = zzsz;
        zzajc.zza(zzsz.class, zzsz);
    }

    private zzsz() {
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

    public static zzsz zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsz) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsz>] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsz> zzakw;
        switch (zzta.zza[i10 - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza((zzta) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsz> zzakw2 = zzd;
                zzakw<zzsz> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsz.class) {
                        zzakw<zzsz> zzakw4 = zzd;
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
