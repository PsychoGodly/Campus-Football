package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuu extends zzajc<zzuu, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuu zzc;
    private static volatile zzakw<zzuu> zzd;
    private int zze;
    private int zzf;
    private zzuv zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuu$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzuu, zza> implements zzakp {
        private zza() {
            super(zzuu.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzuu) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzut zzut) {
            this();
        }

        public final zza zza(zzuv zzuv) {
            zzi();
            ((zzuu) this.zza).zza(zzuv);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuu) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzuu zzuu = new zzuu();
        zzc = zzuu;
        zzajc.zza(zzuu.class, zzuu);
    }

    private zzuu() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuv zzd() {
        zzuv zzuv = this.zzg;
        return zzuv == null ? zzuv.zze() : zzuv;
    }

    public final zzahp zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public static zzuu zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzuu) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuu>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuu> zzakw;
        switch (zzut.zza[i10 - 1]) {
            case 1:
                return new zzuu();
            case 2:
                return new zza((zzut) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuu> zzakw2 = zzd;
                zzakw<zzuu> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuu.class) {
                        zzakw<zzuu> zzakw4 = zzd;
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
    public final void zza(zzuv zzuv) {
        zzuv.getClass();
        this.zzg = zzuv;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
