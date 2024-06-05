package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvg extends zzajc<zzvg, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvg zzc;
    private static volatile zzakw<zzvg> zzd;
    private int zze;
    private zzajj<zzb> zzf = zzajc.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvg, zza> implements zzakp {
        private zza() {
            super(zzvg.zzc);
        }

        public final int zza() {
            return ((zzvg) this.zza).zza();
        }

        public final zzb zzb(int i10) {
            return ((zzvg) this.zza).zza(i10);
        }

        /* synthetic */ zza(zzvh zzvh) {
            this();
        }

        public final zza zza(zzb zzb) {
            zzi();
            ((zzvg) this.zza).zza(zzb);
            return this;
        }

        public final List<zzb> zzb() {
            return Collections.unmodifiableList(((zzvg) this.zza).zze());
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvg) this.zza).zzc(i10);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb extends zzajc<zzb, zza> implements zzakp {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzakw<zzb> zzd;
        private int zze;
        private zzuy zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg$zzb$zza */
        /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
        public static final class zza extends zzajc.zza<zzb, zza> implements zzakp {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(zzuy zzuy) {
                zzi();
                ((zzb) this.zza).zza(zzuy);
                return this;
            }

            /* synthetic */ zza(zzvh zzvh) {
                this();
            }

            public final zza zza(int i10) {
                zzi();
                ((zzb) this.zza).zza(i10);
                return this;
            }

            public final zza zza(zzvs zzvs) {
                zzi();
                ((zzb) this.zza).zza(zzvs);
                return this;
            }

            public final zza zza(zzuz zzuz) {
                zzi();
                ((zzb) this.zza).zza(zzuz);
                return this;
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzajc.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public static zza zzd() {
            return (zza) zzc.zzm();
        }

        public final int zza() {
            return this.zzh;
        }

        public final zzuy zzb() {
            zzuy zzuy = this.zzf;
            return zzuy == null ? zzuy.zzd() : zzuy;
        }

        public final zzuz zzc() {
            zzuz zza2 = zzuz.zza(this.zzg);
            return zza2 == null ? zzuz.UNRECOGNIZED : zza2;
        }

        public final zzvs zzf() {
            zzvs zza2 = zzvs.zza(this.zzi);
            return zza2 == null ? zzvs.UNRECOGNIZED : zza2;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvg$zzb>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            zzakw<zzb> zzakw;
            switch (zzvh.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzvh) null);
                case 3:
                    return zzajc.zza((zzakn) zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzakw<zzb> zzakw2 = zzd;
                    zzakw<zzb> zzakw3 = zzakw2;
                    if (zzakw2 == null) {
                        synchronized (zzb.class) {
                            zzakw<zzb> zzakw4 = zzd;
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
        public final void zza(zzuy zzuy) {
            zzuy.getClass();
            this.zzf = zzuy;
            this.zze |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10) {
            this.zzh = i10;
        }

        /* access modifiers changed from: private */
        public final void zza(zzvs zzvs) {
            this.zzi = zzvs.zza();
        }

        /* access modifiers changed from: private */
        public final void zza(zzuz zzuz) {
            this.zzg = zzuz.zza();
        }
    }

    static {
        zzvg zzvg = new zzvg();
        zzc = zzvg;
        zzajc.zza(zzvg.class, zzvg);
    }

    private zzvg() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zzb> zze() {
        return this.zzf;
    }

    /* access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zzb zza(int i10) {
        return this.zzf.get(i10);
    }

    public static zzvg zza(InputStream inputStream, zzaio zzaio) throws IOException {
        return (zzvg) zzajc.zza(zzc, inputStream, zzaio);
    }

    public static zzvg zza(byte[] bArr, zzaio zzaio) throws zzaji {
        return (zzvg) zzajc.zza(zzc, bArr, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvg>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvg> zzakw;
        switch (zzvh.zza[i10 - 1]) {
            case 1:
                return new zzvg();
            case 2:
                return new zza((zzvh) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvg> zzakw2 = zzd;
                zzakw<zzvg> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvg.class) {
                        zzakw<zzvg> zzakw4 = zzd;
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
    public final void zza(zzb zzb2) {
        zzb2.getClass();
        zzajj<zzb> zzajj = this.zzf;
        if (!zzajj.zzc()) {
            this.zzf = zzajc.zza(zzajj);
        }
        this.zzf.add(zzb2);
    }
}
