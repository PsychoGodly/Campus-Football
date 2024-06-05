package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.measurement.zzix;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzfp {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zza extends zzix<zza, C0268zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private zzjf<zzb> zze = zzix.zzcc();

        /* renamed from: com.google.android.gms.internal.measurement.zzfp$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class C0268zza extends zzix.zzb<zza, C0268zza> implements zzkl {
            private C0268zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0268zza(zzfo zzfo) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzix.zza(zza.class, zza);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfo.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0268zza((zzfo) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zza> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zza.class) {
                            zzkw = zzd;
                            if (zzkw == null) {
                                zzkw = new zzix.zza<>(zzc);
                                zzd = zzkw;
                            }
                        }
                    }
                    return zzkw;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzb extends zzix<zzb, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzkw<zzb> zzd;
        private int zze;
        private String zzf = MaxReward.DEFAULT_LABEL;
        private zzjf<zzd> zzg = zzix.zzcc();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzfo zzfo) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzix.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfo.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzfo) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzb> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzb.class) {
                            zzkw = zzd;
                            if (zzkw == null) {
                                zzkw = new zzix.zza<>(zzc);
                                zzd = zzkw;
                            }
                        }
                    }
                    return zzkw;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private zzjf<zzd> zzf = zzix.zzcc();
        private zza zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzfo zzfo) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzc = zzc2;
            zzix.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        public final zza zza() {
            zza zza2 = this.zzg;
            return zza2 == null ? zza.zzc() : zza2;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfo.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzfo) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzc> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzc.class) {
                            zzkw = zzd;
                            if (zzkw == null) {
                                zzkw = new zzix.zza<>(zzc);
                                zzd = zzkw;
                            }
                        }
                    }
                    return zzkw;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzd extends zzix<zzd, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzd zzc;
        private static volatile zzkw<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjf<zzd> zzg = zzix.zzcc();
        private String zzh = MaxReward.DEFAULT_LABEL;
        private String zzi = MaxReward.DEFAULT_LABEL;
        private boolean zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            /* synthetic */ zza(zzfo zzfo) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public enum zzb implements zzjc {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);
            
            private static final zzjb<zzb> zzf = null;
            private final int zzh;

            static {
                zzf = new zzfq();
            }

            private zzb(int i10) {
                this.zzh = i10;
            }

            public static zzje zzb() {
                return zzfs.zza;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzh;
            }

            public static zzb zza(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return STRING;
                }
                if (i10 == 2) {
                    return NUMBER;
                }
                if (i10 == 3) {
                    return BOOLEAN;
                }
                if (i10 != 4) {
                    return null;
                }
                return STATEMENT;
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzix.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public final double zza() {
            return this.zzk;
        }

        public final zzb zzb() {
            zzb zza2 = zzb.zza(this.zzf);
            return zza2 == null ? zzb.UNKNOWN : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            Class<zzd> cls = zzd.class;
            switch (zzfo.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzfo) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", cls, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzd> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (cls) {
                            zzkw = zzd;
                            if (zzkw == null) {
                                zzkw = new zzix.zza<>(zzc);
                                zzd = zzkw;
                            }
                        }
                    }
                    return zzkw;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
