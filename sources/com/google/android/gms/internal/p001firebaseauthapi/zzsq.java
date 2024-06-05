package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsq extends zzajc<zzsq, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsq zzc;
    private static volatile zzakw<zzsq> zzd;
    private int zze;
    private zzsr zzf;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsq$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsq, zza> implements zzakp {
        private zza() {
            super(zzsq.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsq) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsp zzsp) {
            this();
        }

        public final zza zza(zzsr zzsr) {
            zzi();
            ((zzsq) this.zza).zza(zzsr);
            return this;
        }
    }

    static {
        zzsq zzsq = new zzsq();
        zzc = zzsq;
        zzajc.zza(zzsq.class, zzsq);
    }

    private zzsq() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsr zzd() {
        zzsr zzsr = this.zzf;
        return zzsr == null ? zzsr.zzd() : zzsr;
    }

    public static zzsq zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsq) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsq> zzakw;
        switch (zzsp.zza[i10 - 1]) {
            case 1:
                return new zzsq();
            case 2:
                return new zza((zzsp) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsq> zzakw2 = zzd;
                zzakw<zzsq> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsq.class) {
                        zzakw<zzsq> zzakw4 = zzd;
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
        this.zzg = i10;
    }

    /* access modifiers changed from: private */
    public final void zza(zzsr zzsr) {
        zzsr.getClass();
        this.zzf = zzsr;
        this.zze |= 1;
    }
}
