package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztu extends zzajc<zztu, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztu zzc;
    private static volatile zzakw<zztu> zzd;
    private int zze;
    private int zzf;
    private zztq zzg;
    private zzahp zzh;
    private zzahp zzi;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztu, zza> implements zzakp {
        private zza() {
            super(zztu.zzc);
        }

        public final zza zza(zztq zztq) {
            zzi();
            ((zztu) this.zza).zza(zztq);
            return this;
        }

        public final zza zzb(zzahp zzahp) {
            zzi();
            ((zztu) this.zza).zzb(zzahp);
            return this;
        }

        /* synthetic */ zza(zztt zztt) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztu) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zztu) this.zza).zza(zzahp);
            return this;
        }
    }

    static {
        zztu zztu = new zztu();
        zzc = zztu;
        zzajc.zza(zztu.class, zztu);
    }

    private zztu() {
        zzahp zzahp = zzahp.zza;
        this.zzh = zzahp;
        this.zzi = zzahp;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zztu zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztq zzb() {
        zztq zztq = this.zzg;
        return zztq == null ? zztq.zze() : zztq;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final zzahp zzg() {
        return this.zzi;
    }

    public static zztu zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztu) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* access modifiers changed from: private */
    public final void zzb(zzahp zzahp) {
        zzahp.getClass();
        this.zzi = zzahp;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztu>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztu> zzakw;
        switch (zztt.zza[i10 - 1]) {
            case 1:
                return new zztu();
            case 2:
                return new zza((zztt) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztu> zzakw2 = zzd;
                zzakw<zztu> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztu.class) {
                        zzakw<zztu> zzakw4 = zzd;
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
    public final void zza(zztq zztq) {
        zztq.getClass();
        this.zzg = zztq;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* access modifiers changed from: private */
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzh = zzahp;
    }
}
