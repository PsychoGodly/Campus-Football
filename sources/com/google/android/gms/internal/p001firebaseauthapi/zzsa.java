package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsa extends zzajc<zzsa, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsa zzc;
    private static volatile zzakw<zzsa> zzd;
    private int zze;
    private int zzf;
    private zzsb zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsa$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsa, zza> implements zzakp {
        private zza() {
            super(zzsa.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsa) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzrz zzrz) {
            this();
        }

        public final zza zza(zzsb zzsb) {
            zzi();
            ((zzsa) this.zza).zza(zzsb);
            return this;
        }
    }

    static {
        zzsa zzsa = new zzsa();
        zzc = zzsa;
        zzajc.zza(zzsa.class, zzsa);
    }

    private zzsa() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsb zzd() {
        zzsb zzsb = this.zzg;
        return zzsb == null ? zzsb.zzd() : zzsb;
    }

    public static zzsa zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsa) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsa>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsa> zzakw;
        switch (zzrz.zza[i10 - 1]) {
            case 1:
                return new zzsa();
            case 2:
                return new zza((zzrz) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsa> zzakw2 = zzd;
                zzakw<zzsa> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsa.class) {
                        zzakw<zzsa> zzakw4 = zzd;
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
        this.zzf = i10;
    }

    /* access modifiers changed from: private */
    public final void zza(zzsb zzsb) {
        zzsb.getClass();
        this.zzg = zzsb;
        this.zze |= 1;
    }
}
