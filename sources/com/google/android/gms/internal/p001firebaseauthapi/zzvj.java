package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvj extends zzajc<zzvj, zzb> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvj zzc;
    private static volatile zzakw<zzvj> zzd;
    private int zze;
    private zzajj<zza> zzf = zzajc.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc<zza, C0261zza> implements zzakp {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzakw<zza> zzd;
        private String zze = MaxReward.DEFAULT_LABEL;
        private int zzf;
        private int zzg;
        private int zzh;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
        public static final class C0261zza extends zzajc.zza<zza, C0261zza> implements zzakp {
            private C0261zza() {
                super(zza.zzc);
            }

            public final C0261zza zza(int i10) {
                zzi();
                ((zza) this.zza).zza(i10);
                return this;
            }

            /* synthetic */ C0261zza(zzvi zzvi) {
                this();
            }

            public final C0261zza zza(zzvs zzvs) {
                zzi();
                ((zza) this.zza).zza(zzvs);
                return this;
            }

            public final C0261zza zza(zzuz zzuz) {
                zzi();
                ((zza) this.zza).zza(zzuz);
                return this;
            }

            public final C0261zza zza(String str) {
                zzi();
                ((zza) this.zza).zza(str);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzajc.zza(zza.class, zza);
        }

        private zza() {
        }

        public static C0261zza zzb() {
            return (C0261zza) zzc.zzm();
        }

        public final int zza() {
            return this.zzg;
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj$zza>] */
        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            zzakw<zza> zzakw;
            switch (zzvi.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0261zza((zzvi) null);
                case 3:
                    return zzajc.zza((zzakn) zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzakw<zza> zzakw2 = zzd;
                    zzakw<zza> zzakw3 = zzakw2;
                    if (zzakw2 == null) {
                        synchronized (zza.class) {
                            zzakw<zza> zzakw4 = zzd;
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
        public final void zza(zzvs zzvs) {
            this.zzh = zzvs.zza();
        }

        /* access modifiers changed from: private */
        public final void zza(zzuz zzuz) {
            this.zzf = zzuz.zza();
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze = str;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb extends zzajc.zza<zzvj, zzb> implements zzakp {
        private zzb() {
            super(zzvj.zzc);
        }

        public final zzb zza(zza zza) {
            zzi();
            ((zzvj) this.zza).zza(zza);
            return this;
        }

        /* synthetic */ zzb(zzvi zzvi) {
            this();
        }

        public final zzb zza(int i10) {
            zzi();
            ((zzvj) this.zza).zzc(i10);
            return this;
        }
    }

    static {
        zzvj zzvj = new zzvj();
        zzc = zzvj;
        zzajc.zza(zzvj.class, zzvj);
    }

    private zzvj() {
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    /* access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zza zza(int i10) {
        return this.zzf.get(0);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvj> zzakw;
        switch (zzvi.zza[i10 - 1]) {
            case 1:
                return new zzvj();
            case 2:
                return new zzb((zzvi) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvj> zzakw2 = zzd;
                zzakw<zzvj> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvj.class) {
                        zzakw<zzvj> zzakw4 = zzd;
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
    public final void zza(zza zza2) {
        zza2.getClass();
        zzajj<zza> zzajj = this.zzf;
        if (!zzajj.zzc()) {
            this.zzf = zzajc.zza(zzajj);
        }
        this.zzf.add(zza2);
    }
}
