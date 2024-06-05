package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.measurement.zzix;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzew {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zza extends zzix<zza, C0262zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private int zzf;
        private zzjf<zze> zzg = zzix.zzcc();
        private zzjf<zzb> zzh = zzix.zzcc();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzew$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class C0262zza extends zzix.zzb<zza, C0262zza> implements zzkl {
            private C0262zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            /* synthetic */ C0262zza(zzev zzev) {
                this();
            }

            public final C0262zza zza(int i10, zzb.zza zza) {
                zzad();
                ((zza) this.zza).zza(i10, (zzb) ((zzix) zza.zzab()));
                return this;
            }

            public final zze zzb(int i10) {
                return ((zza) this.zza).zzb(i10);
            }

            public final C0262zza zza(int i10, zze.zza zza) {
                zzad();
                ((zza) this.zza).zza(i10, (zze) ((zzix) zza.zzab()));
                return this;
            }

            public final zzb zza(int i10) {
                return ((zza) this.zza).zza(i10);
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzix.zza(zza.class, zza);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final zzb zza(int i10) {
            return this.zzh.get(i10);
        }

        public final zze zzb(int i10) {
            return this.zzg.get(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0262zza((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        /* access modifiers changed from: private */
        public final void zza(int i10, zzb zzb) {
            zzb.getClass();
            zzjf<zzb> zzjf = this.zzh;
            if (!zzjf.zzc()) {
                this.zzh = zzix.zza(zzjf);
            }
            this.zzh.set(i10, zzb);
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zze zze2) {
            zze2.getClass();
            zzjf<zze> zzjf = this.zzg;
            if (!zzjf.zzc()) {
                this.zzg = zzix.zza(zzjf);
            }
            this.zzg.set(i10, zze2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzb extends zzix<zzb, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzkw<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private zzjf<zzc> zzh = zzix.zzcc();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            /* synthetic */ zza(zzev zzev) {
                this();
            }

            public final zza zza(String str) {
                zzad();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i10, zzc zzc) {
                zzad();
                ((zzb) this.zza).zza(i10, zzc);
                return this;
            }

            public final zzc zza(int i10) {
                return ((zzb) this.zza).zza(i10);
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzix.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public static zza zzc() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzd2 = this.zzj;
            return zzd2 == null ? zzd.zzc() : zzd2;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 64) != 0;
        }

        public final zzc zza(int i10) {
            return this.zzh.get(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zzc zzc2) {
            zzc2.getClass();
            zzjf<zzc> zzjf = this.zzh;
            if (!zzjf.zzc()) {
                this.zzh = zzix.zza(zzjf);
            }
            this.zzh.set(i10, zzc2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = MaxReward.DEFAULT_LABEL;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzad();
                ((zzc) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzev zzev) {
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

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzd2 = this.zzg;
            return zzd2 == null ? zzd.zzc() : zzd2;
        }

        public final zzf zzd() {
            zzf zzf2 = this.zzf;
            return zzf2 == null ? zzf.zzd() : zzf2;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zze extends zzix<zze, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zze zzc;
        private static volatile zzkw<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                zzad();
                ((zze) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzev zzev) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzc = zze2;
            zzix.zza(zze.class, zze2);
        }

        private zze() {
        }

        public static zza zzc() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzc2 = this.zzh;
            return zzc2 == null ? zzc.zzb() : zzc2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 32) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zze> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zze.class) {
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzf extends zzix<zzf, zzb> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private int zzf;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private boolean zzh;
        private zzjf<String> zzi = zzix.zzcc();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public enum zza implements zzjc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzjb<zza> zzh = null;
            private final int zzj;

            static {
                zzh = new zzfa();
            }

            private zza(int i10) {
                this.zzj = i10;
            }

            public static zzje zzb() {
                return zzez.zza;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzj;
            }

            public static zza zza(int i10) {
                switch (i10) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zzb extends zzix.zzb<zzf, zzb> implements zzkl {
            private zzb() {
                super(zzf.zzc);
            }

            /* synthetic */ zzb(zzev zzev) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzix.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.UNKNOWN_MATCH_TYPE : zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzf> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzf.class) {
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
        private boolean zzg;
        private String zzh = MaxReward.DEFAULT_LABEL;
        private String zzi = MaxReward.DEFAULT_LABEL;
        private String zzj = MaxReward.DEFAULT_LABEL;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            /* synthetic */ zza(zzev zzev) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public enum zzb implements zzjc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzjb<zzb> zzf = null;
            private final int zzh;

            static {
                zzf = new zzex();
            }

            private zzb(int i10) {
                this.zzh = i10;
            }

            public static zzje zzb() {
                return zzey.zza;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzh;
            }

            public static zzb zza(int i10) {
                if (i10 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i10 == 1) {
                    return LESS_THAN;
                }
                if (i10 == 2) {
                    return GREATER_THAN;
                }
                if (i10 == 3) {
                    return EQUAL;
                }
                if (i10 != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzix.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zzb zza() {
            zzb zza2 = zzb.zza(this.zzf);
            return zza2 == null ? zzb.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzev.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzev) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzd> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzd.class) {
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
