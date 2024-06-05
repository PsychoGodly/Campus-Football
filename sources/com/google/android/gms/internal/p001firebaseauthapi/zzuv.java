package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuv extends zzajc<zzuv, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuv zzc;
    private static volatile zzakw<zzuv> zzd;
    private int zze;
    private int zzf;
    private zzur zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzuv, zza> implements zzakp {
        private zza() {
            super(zzuv.zzc);
        }

        public final zza zza(zzur zzur) {
            zzi();
            ((zzuv) this.zza).zza(zzur);
            return this;
        }

        /* synthetic */ zza(zzuw zzuw) {
            this();
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzuv) this.zza).zza(zzahp);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuv) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzuv zzuv = new zzuv();
        zzc = zzuv;
        zzajc.zza(zzuv.class, zzuv);
    }

    private zzuv() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzuv zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzur zzb() {
        zzur zzur = this.zzg;
        return zzur == null ? zzur.zzf() : zzur;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }

    public static zzuv zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzuv) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuv>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuv> zzakw;
        switch (zzuw.zza[i10 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza((zzuw) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuv> zzakw2 = zzd;
                zzakw<zzuv> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuv.class) {
                        zzakw<zzuv> zzakw4 = zzd;
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
    public final void zza(zzur zzur) {
        zzur.getClass();
        this.zzg = zzur;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzh = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
