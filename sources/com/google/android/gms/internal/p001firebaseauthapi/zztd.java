package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztd extends zzajc<zztd, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztd zzc;
    private static volatile zzakw<zztd> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztd, zza> implements zzakp {
        private zza() {
            super(zztd.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zztd) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzte zzte) {
            this();
        }
    }

    static {
        zztd zztd = new zztd();
        zzc = zztd;
        zzajc.zza(zztd.class, zztd);
    }

    private zztd() {
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

    public static zztd zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztd) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztd>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztd> zzakw;
        switch (zzte.zza[i10 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza((zzte) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztd> zzakw2 = zzd;
                zzakw<zztd> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztd.class) {
                        zzakw<zztd> zzakw4 = zzd;
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
