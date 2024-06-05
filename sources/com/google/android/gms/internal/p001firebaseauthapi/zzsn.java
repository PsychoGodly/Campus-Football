package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsn extends zzajc<zzsn, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsn zzc;
    private static volatile zzakw<zzsn> zzd;
    private int zze;
    private int zzf;
    private zzsr zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsn$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsn, zza> implements zzakp {
        private zza() {
            super(zzsn.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzsn) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzso zzso) {
            this();
        }

        public final zza zza(zzsr zzsr) {
            zzi();
            ((zzsn) this.zza).zza(zzsr);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsn) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzsn zzsn = new zzsn();
        zzc = zzsn;
        zzajc.zza(zzsn.class, zzsn);
    }

    private zzsn() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsr zzd() {
        zzsr zzsr = this.zzg;
        return zzsr == null ? zzsr.zzd() : zzsr;
    }

    public final zzahp zze() {
        return this.zzh;
    }

    public static zzsn zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsn) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsn>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsn> zzakw;
        switch (zzso.zza[i10 - 1]) {
            case 1:
                return new zzsn();
            case 2:
                return new zza((zzso) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsn> zzakw2 = zzd;
                zzakw<zzsn> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsn.class) {
                        zzakw<zzsn> zzakw4 = zzd;
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
        this.zzh = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(zzsr zzsr) {
        zzsr.getClass();
        this.zzg = zzsr;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
