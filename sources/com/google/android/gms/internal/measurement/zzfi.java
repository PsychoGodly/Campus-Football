package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzfi {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zza extends zzix<zza, C0267zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private String zzf = MaxReward.DEFAULT_LABEL;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private String zzh = MaxReward.DEFAULT_LABEL;
        private String zzi = MaxReward.DEFAULT_LABEL;
        private String zzj = MaxReward.DEFAULT_LABEL;
        private String zzk = MaxReward.DEFAULT_LABEL;
        private String zzl = MaxReward.DEFAULT_LABEL;

        /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class C0267zza extends zzix.zzb<zza, C0267zza> implements zzkl {
            private C0267zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0267zza(zzfh zzfh) {
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

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0267zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(boolean z10) {
                zzad();
                ((zzb) this.zza).zza(z10);
                return this;
            }

            public final zza zzb(boolean z10) {
                zzad();
                ((zzb) this.zza).zzb(z10);
                return this;
            }

            public final zza zzc(boolean z10) {
                zzad();
                ((zzb) this.zza).zzc(z10);
                return this;
            }

            public final zza zzd(boolean z10) {
                zzad();
                ((zzb) this.zza).zzd(z10);
                return this;
            }

            public final zza zze(boolean z10) {
                zzad();
                ((zzb) this.zza).zze(z10);
                return this;
            }

            public final zza zzf(boolean z10) {
                zzad();
                ((zzb) this.zza).zzf(z10);
                return this;
            }

            public final zza zzg(boolean z10) {
                zzad();
                ((zzb) this.zza).zzg(z10);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
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

        public static zza zza() {
            return (zza) zzc.zzbx();
        }

        public static zzb zzc() {
            return zzc;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        public final void zzd(boolean z10) {
            this.zze |= 64;
            this.zzl = z10;
        }

        /* access modifiers changed from: private */
        public final void zze(boolean z10) {
            this.zze |= 2;
            this.zzg = z10;
        }

        /* access modifiers changed from: private */
        public final void zzf(boolean z10) {
            this.zze |= 4;
            this.zzh = z10;
        }

        /* access modifiers changed from: private */
        public final void zzg(boolean z10) {
            this.zze |= 8;
            this.zzi = z10;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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
        public final void zzb(boolean z10) {
            this.zze |= 16;
            this.zzj = z10;
        }

        /* access modifiers changed from: private */
        public final void zzc(boolean z10) {
            this.zze |= 1;
            this.zzf = z10;
        }

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z10) {
            this.zze |= 32;
            this.zzk = z10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private int zzf;
        private zzl zzg;
        private zzl zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(int i10) {
                zzad();
                ((zzc) this.zza).zza(i10);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(zzl.zza zza) {
                zzad();
                ((zzc) this.zza).zza((zzl) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zza(boolean z10) {
                zzad();
                ((zzc) this.zza).zza(z10);
                return this;
            }

            public final zza zza(zzl zzl) {
                zzad();
                ((zzc) this.zza).zzb(zzl);
                return this;
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzc = zzc2;
            zzix.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        public static zza zzb() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzl zzd() {
            zzl zzl = this.zzg;
            return zzl == null ? zzl.zzg() : zzl;
        }

        public final zzl zze() {
            zzl zzl = this.zzh;
            return zzl == null ? zzl.zzg() : zzl;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        public final void zzb(zzl zzl) {
            zzl.getClass();
            this.zzh = zzl;
            this.zze |= 4;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        /* access modifiers changed from: private */
        public final void zza(zzl zzl) {
            zzl.getClass();
            this.zzg = zzl;
            this.zze |= 2;
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z10) {
            this.zze |= 8;
            this.zzi = z10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzd extends zzix<zzd, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzd zzc;
        private static volatile zzkw<zzd> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public final zza zza(long j10) {
                zzad();
                ((zzd) this.zza).zza(j10);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(int i10) {
                zzad();
                ((zzd) this.zza).zza(i10);
                return this;
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzix.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public static zza zzc() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzf;
        }

        public final long zzb() {
            return this.zzg;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zze |= 2;
            this.zzg = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zze extends zzix<zze, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zze zzc;
        private static volatile zzkw<zze> zzd;
        private int zze;
        private zzjf<zzg> zzf = zzix.zzcc();
        private String zzg = MaxReward.DEFAULT_LABEL;
        private long zzh;
        private long zzi;
        private int zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public final int zza() {
                return ((zze) this.zza).zzb();
            }

            public final long zzb() {
                return ((zze) this.zza).zzc();
            }

            public final long zzc() {
                return ((zze) this.zza).zzd();
            }

            public final zza zzd() {
                zzad();
                ((zze) this.zza).zzl();
                return this;
            }

            public final String zze() {
                return ((zze) this.zza).zzg();
            }

            public final List<zzg> zzf() {
                return Collections.unmodifiableList(((zze) this.zza).zzh());
            }

            public final boolean zzg() {
                return ((zze) this.zza).zzk();
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                zzad();
                ((zze) this.zza).zza(iterable);
                return this;
            }

            public final zza zzb(long j10) {
                zzad();
                ((zze) this.zza).zzb(j10);
                return this;
            }

            public final zza zza(zzg.zza zza) {
                zzad();
                ((zze) this.zza).zza((zzg) ((zzix) zza.zzab()));
                return this;
            }

            public final zzg zzb(int i10) {
                return ((zze) this.zza).zza(i10);
            }

            public final zza zza(zzg zzg) {
                zzad();
                ((zze) this.zza).zza(zzg);
                return this;
            }

            public final zza zza(int i10) {
                zzad();
                ((zze) this.zza).zzb(i10);
                return this;
            }

            public final zza zza(String str) {
                zzad();
                ((zze) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i10, zzg.zza zza) {
                zzad();
                ((zze) this.zza).zza(i10, (zzg) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zza(int i10, zzg zzg) {
                zzad();
                ((zze) this.zza).zza(i10, zzg);
                return this;
            }

            public final zza zza(long j10) {
                zzad();
                ((zze) this.zza).zza(j10);
                return this;
            }
        }

        static {
            zze zze2 = new zze();
            zzc = zze2;
            zzix.zza(zze.class, zze2);
        }

        private zze() {
        }

        public static zza zze() {
            return (zza) zzc.zzbx();
        }

        /* access modifiers changed from: private */
        public final void zzl() {
            this.zzf = zzix.zzcc();
        }

        private final void zzm() {
            zzjf<zzg> zzjf = this.zzf;
            if (!zzjf.zzc()) {
                this.zzf = zzix.zza(zzjf);
            }
        }

        public final int zza() {
            return this.zzj;
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzg> zzh() {
            return this.zzf;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }

        public final zzg zza(int i10) {
            return this.zzf.get(i10);
        }

        /* access modifiers changed from: private */
        public final void zzb(int i10) {
            zzm();
            this.zzf.remove(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzg.class, "zzg", "zzh", "zzi", "zzj"});
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
        public final void zzb(long j10) {
            this.zze |= 2;
            this.zzh = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzg> iterable) {
            zzm();
            zzhd.zza(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        public final void zza(zzg zzg2) {
            zzg2.getClass();
            zzm();
            this.zzf.add(zzg2);
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzg = str;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zzg zzg2) {
            zzg2.getClass();
            zzm();
            this.zzf.set(i10, zzg2);
        }

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zze |= 4;
            this.zzi = j10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzf extends zzix<zzf, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private String zzf = MaxReward.DEFAULT_LABEL;
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzf, zza> implements zzkl {
            private zza() {
                super(zzf.zzc);
            }

            public final zza zza(long j10) {
                zzad();
                ((zzf) this.zza).zza(j10);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(String str) {
                zzad();
                ((zzf) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzix.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zza zza() {
            return (zza) zzc.zzbx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zze |= 2;
            this.zzg = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzg extends zzix<zzg, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzg zzc;
        private static volatile zzkw<zzg> zzd;
        private int zze;
        private String zzf = MaxReward.DEFAULT_LABEL;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private long zzh;
        private float zzi;
        private double zzj;
        private zzjf<zzg> zzk = zzix.zzcc();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzg, zza> implements zzkl {
            private zza() {
                super(zzg.zzc);
            }

            public final int zza() {
                return ((zzg) this.zza).zzc();
            }

            public final zza zzb() {
                zzad();
                ((zzg) this.zza).zzo();
                return this;
            }

            public final zza zzc() {
                zzad();
                ((zzg) this.zza).zzp();
                return this;
            }

            public final zza zzd() {
                zzad();
                ((zzg) this.zza).zzq();
                return this;
            }

            public final zza zze() {
                zzad();
                ((zzg) this.zza).zzr();
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                zzad();
                ((zzg) this.zza).zza(iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzad();
                ((zzg) this.zza).zzb(str);
                return this;
            }

            public final zza zza(zza zza) {
                zzad();
                ((zzg) this.zza).zze((zzg) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zza(double d10) {
                zzad();
                ((zzg) this.zza).zza(d10);
                return this;
            }

            public final zza zza(long j10) {
                zzad();
                ((zzg) this.zza).zza(j10);
                return this;
            }

            public final zza zza(String str) {
                zzad();
                ((zzg) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzc = zzg2;
            zzix.zza(zzg.class, zzg2);
        }

        private zzg() {
        }

        public static zza zze() {
            return (zza) zzc.zzbx();
        }

        /* access modifiers changed from: private */
        public final void zzo() {
            this.zze &= -17;
            this.zzj = 0.0d;
        }

        /* access modifiers changed from: private */
        public final void zzp() {
            this.zze &= -5;
            this.zzh = 0;
        }

        /* access modifiers changed from: private */
        public final void zzq() {
            this.zzk = zzix.zzcc();
        }

        /* access modifiers changed from: private */
        public final void zzr() {
            this.zze &= -3;
            this.zzg = zzc.zzg;
        }

        private final void zzs() {
            zzjf<zzg> zzjf = this.zzk;
            if (!zzjf.zzc()) {
                this.zzk = zzix.zza(zzjf);
            }
        }

        public final double zza() {
            return this.zzj;
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzg> zzi() {
            return this.zzk;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }

        /* access modifiers changed from: private */
        public final void zze(zzg zzg2) {
            zzg2.getClass();
            zzs();
            this.zzk.add(zzg2);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            Class<zzg> cls = zzg.class;
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", cls});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzg> zzkw = zzd;
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

        /* access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzg> iterable) {
            zzs();
            zzhd.zza(iterable, this.zzk);
        }

        /* access modifiers changed from: private */
        public final void zza(double d10) {
            this.zze |= 16;
            this.zzj = d10;
        }

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zze |= 4;
            this.zzh = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzh extends zzix<zzh, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzh zzc;
        private static volatile zzkw<zzh> zzd;
        private int zze;
        private String zzf = MaxReward.DEFAULT_LABEL;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private zza zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzh, zza> implements zzkl {
            private zza() {
                super(zzh.zzc);
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }
        }

        static {
            zzh zzh2 = new zzh();
            zzc = zzh2;
            zzix.zza(zzh.class, zzh2);
        }

        private zzh() {
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzh> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzh.class) {
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
    public static final class zzi extends zzix<zzi, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzi zzc;
        private static volatile zzkw<zzi> zzd;
        private int zze;
        private zzjf<zzj> zzf = zzix.zzcc();
        private String zzg = MaxReward.DEFAULT_LABEL;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzi, zza> implements zzkl {
            private zza() {
                super(zzi.zzc);
            }

            public final int zza() {
                return ((zzi) this.zza).zza();
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(zzj.zza zza) {
                zzad();
                ((zzi) this.zza).zza((zzj) ((zzix) zza.zzab()));
                return this;
            }

            public final zzj zza(int i10) {
                return ((zzi) this.zza).zza(0);
            }
        }

        static {
            zzi zzi = new zzi();
            zzc = zzi;
            zzix.zza(zzi.class, zzi);
        }

        private zzi() {
        }

        public static zza zzb() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzf.size();
        }

        public final List<zzj> zzd() {
            return this.zzf;
        }

        public final zzj zza(int i10) {
            return this.zzf.get(0);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", zzj.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzi> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzi.class) {
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
        public final void zza(zzj zzj) {
            zzj.getClass();
            zzjf<zzj> zzjf = this.zzf;
            if (!zzjf.zzc()) {
                this.zzf = zzix.zza(zzjf);
            }
            this.zzf.add(zzj);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzj extends zzix<zzj, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzj zzc;
        private static volatile zzkw<zzj> zzd;
        private String zzaa = MaxReward.DEFAULT_LABEL;
        private long zzab;
        private int zzac;
        private String zzad = MaxReward.DEFAULT_LABEL;
        private String zzae = MaxReward.DEFAULT_LABEL;
        private boolean zzaf;
        private zzjf<zzc> zzag = zzix.zzcc();
        private String zzah = MaxReward.DEFAULT_LABEL;
        private int zzai;
        private int zzaj;
        private int zzak;
        private String zzal = MaxReward.DEFAULT_LABEL;
        private long zzam;
        private long zzan;
        private String zzao = MaxReward.DEFAULT_LABEL;
        private String zzap = MaxReward.DEFAULT_LABEL;
        private int zzaq;
        private String zzar = MaxReward.DEFAULT_LABEL;
        private zzk zzas;
        private zzjd zzat = zzix.zzca();
        private long zzau;
        private long zzav;
        private String zzaw = MaxReward.DEFAULT_LABEL;
        private String zzax = MaxReward.DEFAULT_LABEL;
        private int zzay;
        private boolean zzaz;
        private String zzba = MaxReward.DEFAULT_LABEL;
        private boolean zzbb;
        private zzh zzbc;
        private String zzbd = MaxReward.DEFAULT_LABEL;
        private zzjf<String> zzbe = zzix.zzcc();
        private String zzbf = MaxReward.DEFAULT_LABEL;
        private long zzbg;
        private boolean zzbh;
        private String zzbi = MaxReward.DEFAULT_LABEL;
        private boolean zzbj;
        private String zzbk = MaxReward.DEFAULT_LABEL;
        private int zzbl;
        private String zzbm = MaxReward.DEFAULT_LABEL;
        private zzb zzbn;
        private int zze;
        private int zzf;
        private int zzg;
        private zzjf<zze> zzh = zzix.zzcc();
        private zzjf<zzn> zzi = zzix.zzcc();
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private String zzo = MaxReward.DEFAULT_LABEL;
        private String zzp = MaxReward.DEFAULT_LABEL;
        private String zzq = MaxReward.DEFAULT_LABEL;
        private String zzr = MaxReward.DEFAULT_LABEL;
        private int zzs;
        private String zzt = MaxReward.DEFAULT_LABEL;
        private String zzu = MaxReward.DEFAULT_LABEL;
        private String zzv = MaxReward.DEFAULT_LABEL;
        private long zzw;
        private long zzx;
        private String zzy = MaxReward.DEFAULT_LABEL;
        private boolean zzz;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzj, zza> implements zzkl {
            private zza() {
                super(zzj.zzc);
            }

            public final int zza() {
                return ((zzj) this.zza).zzd();
            }

            public final int zzb() {
                return ((zzj) this.zza).zzh();
            }

            public final long zzc() {
                return ((zzj) this.zza).zzl();
            }

            public final long zzd() {
                return ((zzj) this.zza).zzp();
            }

            public final zza zze(Iterable<? extends zzn> iterable) {
                zzad();
                ((zzj) this.zza).zze(iterable);
                return this;
            }

            public final zza zzf() {
                zzad();
                ((zzj) this.zza).zzcl();
                return this;
            }

            public final zza zzg() {
                zzad();
                ((zzj) this.zza).zzcm();
                return this;
            }

            public final zza zzh() {
                zzad();
                ((zzj) this.zza).zzcn();
                return this;
            }

            public final zza zzi() {
                zzad();
                ((zzj) this.zza).zzco();
                return this;
            }

            public final zza zzj() {
                zzad();
                ((zzj) this.zza).zzcp();
                return this;
            }

            public final zza zzk() {
                zzad();
                ((zzj) this.zza).zzcq();
                return this;
            }

            public final zza zzl() {
                zzad();
                ((zzj) this.zza).zzcr();
                return this;
            }

            public final zza zzm() {
                zzad();
                ((zzj) this.zza).zzcs();
                return this;
            }

            public final zza zzn() {
                zzad();
                ((zzj) this.zza).zzct();
                return this;
            }

            public final zza zzo() {
                zzad();
                ((zzj) this.zza).zzcu();
                return this;
            }

            public final zza zzp() {
                zzad();
                ((zzj) this.zza).zzcv();
                return this;
            }

            public final zza zzq() {
                zzad();
                ((zzj) this.zza).zzcw();
                return this;
            }

            public final zza zzr(String str) {
                zzad();
                ((zzj) this.zza).zzr(str);
                return this;
            }

            public final zza zzs(String str) {
                zzad();
                ((zzj) this.zza).zzs(str);
                return this;
            }

            public final String zzt() {
                return ((zzj) this.zza).zzah();
            }

            public final String zzu() {
                return ((zzj) this.zza).zzaj();
            }

            public final String zzv() {
                return ((zzj) this.zza).zzal();
            }

            public final List<zze> zzw() {
                return Collections.unmodifiableList(((zzj) this.zza).zzap());
            }

            public final List<zzn> zzx() {
                return Collections.unmodifiableList(((zzj) this.zza).zzaq());
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zze zza(int i10) {
                return ((zzj) this.zza).zza(i10);
            }

            public final zza zzb(Iterable<? extends zze> iterable) {
                zzad();
                ((zzj) this.zza).zzb(iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                zzad();
                ((zzj) this.zza).zzc(iterable);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzad();
                ((zzj) this.zza).zzd(iterable);
                return this;
            }

            public final zza zza(Iterable<? extends zzc> iterable) {
                zzad();
                ((zzj) this.zza).zza(iterable);
                return this;
            }

            public final zza zze() {
                zzad();
                ((zzj) this.zza).zzck();
                return this;
            }

            public final zza zzf(int i10) {
                zzad();
                ((zzj) this.zza).zzh(i10);
                return this;
            }

            public final zza zzg(String str) {
                zzad();
                ((zzj) this.zza).zzg(str);
                return this;
            }

            public final zza zzh(String str) {
                zzad();
                ((zzj) this.zza).zzh(str);
                return this;
            }

            public final zza zzi(String str) {
                zzad();
                ((zzj) this.zza).zzi(str);
                return this;
            }

            public final zza zzj(String str) {
                zzad();
                ((zzj) this.zza).zzj((String) null);
                return this;
            }

            public final zza zzk(String str) {
                zzad();
                ((zzj) this.zza).zzk(str);
                return this;
            }

            public final zza zzl(String str) {
                zzad();
                ((zzj) this.zza).zzl(str);
                return this;
            }

            public final zza zzm(String str) {
                zzad();
                ((zzj) this.zza).zzm(str);
                return this;
            }

            public final zza zzn(String str) {
                zzad();
                ((zzj) this.zza).zzn(str);
                return this;
            }

            public final zza zzo(String str) {
                zzad();
                ((zzj) this.zza).zzo(str);
                return this;
            }

            public final zza zzp(String str) {
                zzad();
                ((zzj) this.zza).zzp(str);
                return this;
            }

            public final zza zzq(String str) {
                zzad();
                ((zzj) this.zza).zzq(str);
                return this;
            }

            public final String zzr() {
                return ((zzj) this.zza).zzx();
            }

            public final String zzs() {
                return ((zzj) this.zza).zzab();
            }

            public final zza zzb(int i10) {
                zzad();
                ((zzj) this.zza).zzd(i10);
                return this;
            }

            public final zza zzc(int i10) {
                zzad();
                ((zzj) this.zza).zze(i10);
                return this;
            }

            public final zza zzd(int i10) {
                zzad();
                ((zzj) this.zza).zzf(i10);
                return this;
            }

            public final zza zza(zze.zza zza) {
                zzad();
                ((zzj) this.zza).zza((zze) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zze(String str) {
                zzad();
                ((zzj) this.zza).zze(str);
                return this;
            }

            public final zza zzf(String str) {
                zzad();
                ((zzj) this.zza).zzf(str);
                return this;
            }

            public final zza zzg(long j10) {
                zzad();
                ((zzj) this.zza).zzg(j10);
                return this;
            }

            public final zza zzh(long j10) {
                zzad();
                ((zzj) this.zza).zzh(j10);
                return this;
            }

            public final zza zzi(long j10) {
                zzad();
                ((zzj) this.zza).zzi(j10);
                return this;
            }

            public final zza zzj(long j10) {
                zzad();
                ((zzj) this.zza).zzj(j10);
                return this;
            }

            public final zza zzk(long j10) {
                zzad();
                ((zzj) this.zza).zzk(j10);
                return this;
            }

            public final zza zzl(long j10) {
                zzad();
                ((zzj) this.zza).zzl(j10);
                return this;
            }

            public final zza zzb(String str) {
                zzad();
                ((zzj) this.zza).zzb(str);
                return this;
            }

            public final zza zzc(String str) {
                zzad();
                ((zzj) this.zza).zzc(str);
                return this;
            }

            public final zza zzd(String str) {
                zzad();
                ((zzj) this.zza).zzd(str);
                return this;
            }

            public final zza zza(zzn.zza zza) {
                zzad();
                ((zzj) this.zza).zza((zzn) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zze(int i10) {
                zzad();
                ((zzj) this.zza).zzg(i10);
                return this;
            }

            public final zza zzf(long j10) {
                zzad();
                ((zzj) this.zza).zzf(j10);
                return this;
            }

            public final zza zzg(int i10) {
                zzad();
                ((zzj) this.zza).zzi(1);
                return this;
            }

            public final zza zzh(int i10) {
                zzad();
                ((zzj) this.zza).zzj(i10);
                return this;
            }

            public final zza zzi(int i10) {
                zzad();
                ((zzj) this.zza).zzk(i10);
                return this;
            }

            public final zzn zzj(int i10) {
                return ((zzj) this.zza).zzb(i10);
            }

            public final zza zzb(long j10) {
                zzad();
                ((zzj) this.zza).zzb(j10);
                return this;
            }

            public final zza zzc(long j10) {
                zzad();
                ((zzj) this.zza).zzc(j10);
                return this;
            }

            public final zza zzd(long j10) {
                zzad();
                ((zzj) this.zza).zzd(j10);
                return this;
            }

            public final zza zza(zzn zzn) {
                zzad();
                ((zzj) this.zza).zza(zzn);
                return this;
            }

            public final zza zze(long j10) {
                zzad();
                ((zzj) this.zza).zze(j10);
                return this;
            }

            public final zza zzb(boolean z10) {
                zzad();
                ((zzj) this.zza).zzb(z10);
                return this;
            }

            public final zza zzc(boolean z10) {
                zzad();
                ((zzj) this.zza).zzc(z10);
                return this;
            }

            public final zza zzd(boolean z10) {
                zzad();
                ((zzj) this.zza).zzd(z10);
                return this;
            }

            public final zza zza(String str) {
                zzad();
                ((zzj) this.zza).zza(str);
                return this;
            }

            public final zza zza(zzb zzb) {
                zzad();
                ((zzj) this.zza).zza(zzb);
                return this;
            }

            public final zza zza(long j10) {
                zzad();
                ((zzj) this.zza).zza(j10);
                return this;
            }

            public final zza zza(boolean z10) {
                zzad();
                ((zzj) this.zza).zza(z10);
                return this;
            }

            public final zza zza(int i10, zze.zza zza) {
                zzad();
                ((zzj) this.zza).zza(i10, (zze) ((zzix) zza.zzab()));
                return this;
            }

            public final zza zza(int i10, zze zze) {
                zzad();
                ((zzj) this.zza).zza(i10, zze);
                return this;
            }

            public final zza zza(zzk.zzb zzb) {
                zzad();
                ((zzj) this.zza).zza((zzk) ((zzix) zzb.zzab()));
                return this;
            }

            public final zza zza(int i10, zzn zzn) {
                zzad();
                ((zzj) this.zza).zza(i10, zzn);
                return this;
            }
        }

        static {
            zzj zzj2 = new zzj();
            zzc = zzj2;
            zzix.zza(zzj.class, zzj2);
        }

        private zzj() {
        }

        /* access modifiers changed from: private */
        public final void zzck() {
            this.zze &= -262145;
            this.zzaa = zzc.zzaa;
        }

        /* access modifiers changed from: private */
        public final void zzcl() {
            this.zzag = zzix.zzcc();
        }

        /* access modifiers changed from: private */
        public final void zzcm() {
            this.zze &= -257;
            this.zzq = zzc.zzq;
        }

        /* access modifiers changed from: private */
        public final void zzcn() {
            this.zze &= a.e.API_PRIORITY_OTHER;
            this.zzao = zzc.zzao;
        }

        /* access modifiers changed from: private */
        public final void zzco() {
            this.zzh = zzix.zzcc();
        }

        /* access modifiers changed from: private */
        public final void zzcp() {
            this.zze &= -2097153;
            this.zzad = zzc.zzad;
        }

        /* access modifiers changed from: private */
        public final void zzcq() {
            this.zze &= -131073;
            this.zzz = false;
        }

        /* access modifiers changed from: private */
        public final void zzcr() {
            this.zze &= -129;
            this.zzp = zzc.zzp;
        }

        /* access modifiers changed from: private */
        public final void zzcs() {
            this.zze &= -33;
            this.zzn = 0;
        }

        /* access modifiers changed from: private */
        public final void zzct() {
            this.zze &= -17;
            this.zzm = 0;
        }

        /* access modifiers changed from: private */
        public final void zzcu() {
            this.zze &= -65537;
            this.zzy = zzc.zzy;
        }

        /* access modifiers changed from: private */
        public final void zzcv() {
            this.zzf &= -8193;
            this.zzbd = zzc.zzbd;
        }

        /* access modifiers changed from: private */
        public final void zzcw() {
            this.zze &= -268435457;
            this.zzal = zzc.zzal;
        }

        private final void zzcx() {
            zzjf<zze> zzjf = this.zzh;
            if (!zzjf.zzc()) {
                this.zzh = zzix.zza(zzjf);
            }
        }

        private final void zzcy() {
            zzjf<zzn> zzjf = this.zzi;
            if (!zzjf.zzc()) {
                this.zzi = zzix.zza(zzjf);
            }
        }

        public static zza zzu() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzbl;
        }

        public final String zzaa() {
            return this.zzv;
        }

        public final String zzab() {
            return this.zzbi;
        }

        public final String zzac() {
            return this.zzax;
        }

        public final String zzad() {
            return this.zzbk;
        }

        public final String zzae() {
            return this.zzq;
        }

        public final String zzaf() {
            return this.zzao;
        }

        public final String zzag() {
            return this.zzah;
        }

        public final String zzah() {
            return this.zzae;
        }

        public final String zzai() {
            return this.zzad;
        }

        public final String zzaj() {
            return this.zzp;
        }

        public final String zzak() {
            return this.zzo;
        }

        public final String zzal() {
            return this.zzy;
        }

        public final String zzam() {
            return this.zzbd;
        }

        public final String zzan() {
            return this.zzr;
        }

        public final List<zzc> zzao() {
            return this.zzag;
        }

        public final List<zze> zzap() {
            return this.zzh;
        }

        public final List<zzn> zzaq() {
            return this.zzi;
        }

        public final boolean zzar() {
            return this.zzbh;
        }

        public final boolean zzas() {
            return this.zzbj;
        }

        public final boolean zzat() {
            return this.zzz;
        }

        public final boolean zzau() {
            return this.zzaf;
        }

        public final boolean zzav() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzaw() {
            return (this.zzf & 4194304) != 0;
        }

        public final boolean zzax() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzay() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzaz() {
            return (this.zzf & 131072) != 0;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final boolean zzba() {
            return (this.zzf & 128) != 0;
        }

        public final boolean zzbb() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbc() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbd() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbe() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbf() {
            return (this.zze & 16384) != 0;
        }

        public final boolean zzbg() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbh() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbl() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbn() {
            return (this.zzf & 8192) != 0;
        }

        public final boolean zzbo() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzbp() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbq() {
            return (this.zze & 1024) != 0;
        }

        public final boolean zzbr() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzbs() {
            return (this.zze & 32768) != 0;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final int zzd() {
            return this.zzh.size();
        }

        public final int zze() {
            return this.zzg;
        }

        public final int zzf() {
            return this.zzaq;
        }

        public final int zzg() {
            return this.zzs;
        }

        public final int zzh() {
            return this.zzi.size();
        }

        public final long zzi() {
            return this.zzam;
        }

        public final long zzj() {
            return this.zzab;
        }

        public final long zzk() {
            return this.zzau;
        }

        public final long zzl() {
            return this.zzl;
        }

        public final long zzm() {
            return this.zzw;
        }

        public final long zzn() {
            return this.zzn;
        }

        public final long zzo() {
            return this.zzm;
        }

        public final long zzp() {
            return this.zzk;
        }

        public final long zzq() {
            return this.zzbg;
        }

        public final long zzr() {
            return this.zzj;
        }

        public final long zzs() {
            return this.zzx;
        }

        public final zzb zzt() {
            zzb zzb = this.zzbn;
            return zzb == null ? zzb.zzc() : zzb;
        }

        public final String zzw() {
            return this.zzar;
        }

        public final String zzx() {
            return this.zzu;
        }

        public final String zzy() {
            return this.zzaa;
        }

        public final String zzz() {
            return this.zzt;
        }

        public final zze zza(int i10) {
            return this.zzh.get(i10);
        }

        public final zzn zzb(int i10) {
            return this.zzi.get(i10);
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zze |= 2097152;
            this.zzad = str;
        }

        /* access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zze |= 128;
            this.zzp = str;
        }

        /* access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zze |= 64;
            this.zzo = str;
        }

        /* access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zze |= 65536;
            this.zzy = str;
        }

        /* access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzf |= 8192;
            this.zzbd = str;
        }

        /* access modifiers changed from: private */
        public final void zzs(String str) {
            str.getClass();
            this.zze |= 512;
            this.zzr = str;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001<\u0000\u0002\u0001L<\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6", new Object[]{"zze", "zzf", "zzg", "zzh", zze.class, "zzi", zzn.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzc.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzfk.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzj> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzj.class) {
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
        public final void zzm(String str) {
            str.getClass();
            this.zze |= 4194304;
            this.zzae = str;
        }

        /* access modifiers changed from: private */
        public final void zzi(String str) {
            str.getClass();
            this.zze |= 256;
            this.zzq = str;
        }

        /* access modifiers changed from: private */
        public final void zzj(String str) {
            str.getClass();
            this.zze |= RecyclerView.UNDEFINED_DURATION;
            this.zzao = str;
        }

        /* access modifiers changed from: private */
        public final void zzk(String str) {
            str.getClass();
            this.zzf |= 16384;
            this.zzbf = str;
        }

        /* access modifiers changed from: private */
        public final void zzl(String str) {
            str.getClass();
            this.zze |= 16777216;
            this.zzah = str;
        }

        /* access modifiers changed from: private */
        public final void zzf(int i10) {
            this.zzf |= 1048576;
            this.zzbl = i10;
        }

        /* access modifiers changed from: private */
        public final void zzg(int i10) {
            this.zze |= 33554432;
            this.zzai = i10;
        }

        /* access modifiers changed from: private */
        public final void zzh(int i10) {
            this.zze |= 1048576;
            this.zzac = i10;
        }

        /* access modifiers changed from: private */
        public final void zze(Iterable<? extends zzn> iterable) {
            zzcy();
            zzhd.zza(iterable, this.zzi);
        }

        /* access modifiers changed from: private */
        public final void zzc(Iterable<? extends Integer> iterable) {
            zzjd zzjd = this.zzat;
            if (!zzjd.zzc()) {
                int size = zzjd.size();
                this.zzat = zzjd.zzc(size == 0 ? 10 : size << 1);
            }
            zzhd.zza(iterable, this.zzat);
        }

        /* access modifiers changed from: private */
        public final void zzd(Iterable<String> iterable) {
            zzjf<String> zzjf = this.zzbe;
            if (!zzjf.zzc()) {
                this.zzbe = zzix.zza(zzjf);
            }
            zzhd.zza(iterable, this.zzbe);
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            str.getClass();
            this.zzf |= 131072;
            this.zzbi = str;
        }

        /* access modifiers changed from: private */
        public final void zzg(String str) {
            str.getClass();
            this.zzf |= 128;
            this.zzax = str;
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            str.getClass();
            this.zzf |= 524288;
            this.zzbk = str;
        }

        /* access modifiers changed from: private */
        public final void zzi(int i10) {
            this.zze |= 1;
            this.zzg = 1;
        }

        /* access modifiers changed from: private */
        public final void zzj(int i10) {
            this.zzf |= 2;
            this.zzaq = i10;
        }

        /* access modifiers changed from: private */
        public final void zzk(int i10) {
            this.zze |= 1024;
            this.zzs = i10;
        }

        /* access modifiers changed from: private */
        public final void zzl(long j10) {
            this.zze |= 32768;
            this.zzx = j10;
        }

        /* access modifiers changed from: private */
        public final void zzb(Iterable<? extends zze> iterable) {
            zzcx();
            zzhd.zza(iterable, this.zzh);
        }

        /* access modifiers changed from: private */
        public final void zze(int i10) {
            zzcy();
            this.zzi.remove(i10);
        }

        /* access modifiers changed from: private */
        public final void zzi(long j10) {
            this.zze |= 4;
            this.zzk = j10;
        }

        /* access modifiers changed from: private */
        public final void zzj(long j10) {
            this.zzf |= 32768;
            this.zzbg = j10;
        }

        /* access modifiers changed from: private */
        public final void zzk(long j10) {
            this.zze |= 2;
            this.zzj = j10;
        }

        /* access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 4096;
            this.zzu = str;
        }

        /* access modifiers changed from: private */
        public final void zze(String str) {
            str.getClass();
            this.zze |= 8192;
            this.zzv = str;
        }

        /* access modifiers changed from: private */
        public final void zzf(long j10) {
            this.zze |= 16384;
            this.zzw = j10;
        }

        /* access modifiers changed from: private */
        public final void zzg(long j10) {
            this.zze |= 32;
            this.zzn = j10;
        }

        /* access modifiers changed from: private */
        public final void zzh(long j10) {
            this.zze |= 16;
            this.zzm = j10;
        }

        /* access modifiers changed from: private */
        public final void zzd(int i10) {
            zzcx();
            this.zzh.remove(i10);
        }

        /* access modifiers changed from: private */
        public final void zzb(long j10) {
            this.zze |= 536870912;
            this.zzam = j10;
        }

        /* access modifiers changed from: private */
        public final void zzc(String str) {
            str.getClass();
            this.zze |= 262144;
            this.zzaa = str;
        }

        /* access modifiers changed from: private */
        public final void zzd(String str) {
            str.getClass();
            this.zze |= 2048;
            this.zzt = str;
        }

        /* access modifiers changed from: private */
        public final void zze(long j10) {
            this.zze |= 8;
            this.zzl = j10;
        }

        /* access modifiers changed from: private */
        public final void zzb(boolean z10) {
            this.zzf |= 262144;
            this.zzbj = z10;
        }

        /* access modifiers changed from: private */
        public final void zzc(long j10) {
            this.zze |= 524288;
            this.zzab = j10;
        }

        /* access modifiers changed from: private */
        public final void zzd(long j10) {
            this.zzf |= 16;
            this.zzau = j10;
        }

        /* access modifiers changed from: private */
        public final void zzc(boolean z10) {
            this.zze |= 131072;
            this.zzz = z10;
        }

        /* access modifiers changed from: private */
        public final void zzd(boolean z10) {
            this.zze |= 8388608;
            this.zzaf = z10;
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzc> iterable) {
            zzjf<zzc> zzjf = this.zzag;
            if (!zzjf.zzc()) {
                this.zzag = zzix.zza(zzjf);
            }
            zzhd.zza(iterable, this.zzag);
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze2) {
            zze2.getClass();
            zzcx();
            this.zzh.add(zze2);
        }

        /* access modifiers changed from: private */
        public final void zza(zzn zzn2) {
            zzn2.getClass();
            zzcy();
            this.zzi.add(zzn2);
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzf |= 4;
            this.zzar = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb) {
            zzb.getClass();
            this.zzbn = zzb;
            this.zzf |= 4194304;
        }

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zzf |= 32;
            this.zzav = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z10) {
            this.zzf |= 65536;
            this.zzbh = z10;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zze zze2) {
            zze2.getClass();
            zzcx();
            this.zzh.set(i10, zze2);
        }

        /* access modifiers changed from: private */
        public final void zza(zzk zzk2) {
            zzk2.getClass();
            this.zzas = zzk2;
            this.zzf |= 8;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zzn zzn2) {
            zzn2.getClass();
            zzcy();
            this.zzi.set(i10, zzn2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzk extends zzix<zzk, zzb> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzk zzc;
        private static volatile zzkw<zzk> zzd;
        private int zze;
        private int zzf = 1;
        private zzjf<zzf> zzg = zzix.zzcc();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public enum zza implements zzjc {
            RADS(1),
            PROVISIONING(2);
            
            private static final zzjb<zza> zzc = null;
            private final int zze;

            static {
                zzc = new zzfn();
            }

            private zza(int i10) {
                this.zze = i10;
            }

            public static zzje zzb() {
                return zzfm.zza;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zze;
            }

            public static zza zza(int i10) {
                if (i10 == 1) {
                    return RADS;
                }
                if (i10 != 2) {
                    return null;
                }
                return PROVISIONING;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zzb extends zzix.zzb<zzk, zzb> implements zzkl {
            private zzb() {
                super(zzk.zzc);
            }

            public final zzb zza(zzf.zza zza) {
                zzad();
                ((zzk) this.zza).zza((zzf) ((zzix) zza.zzab()));
                return this;
            }

            /* synthetic */ zzb(zzfh zzfh) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzc = zzk;
            zzix.zza(zzk.class, zzk);
        }

        private zzk() {
        }

        public static zzb zza() {
            return (zzb) zzc.zzbx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zzb((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzf.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzk> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzk.class) {
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
        public final void zza(zzf zzf2) {
            zzf2.getClass();
            zzjf<zzf> zzjf = this.zzg;
            if (!zzjf.zzc()) {
                this.zzg = zzix.zza(zzjf);
            }
            this.zzg.add(zzf2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzl extends zzix<zzl, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzl zzc;
        private static volatile zzkw<zzl> zzd;
        private zzjg zze = zzix.zzcb();
        private zzjg zzf = zzix.zzcb();
        private zzjf<zzd> zzg = zzix.zzcc();
        private zzjf<zzm> zzh = zzix.zzcc();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzl, zza> implements zzkl {
            private zza() {
                super(zzl.zzc);
            }

            public final zza zza(Iterable<? extends zzd> iterable) {
                zzad();
                ((zzl) this.zza).zza(iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                zzad();
                ((zzl) this.zza).zzb(iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends zzm> iterable) {
                zzad();
                ((zzl) this.zza).zzc(iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                zzad();
                ((zzl) this.zza).zzd(iterable);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza() {
                zzad();
                ((zzl) this.zza).zzl();
                return this;
            }

            public final zza zzb() {
                zzad();
                ((zzl) this.zza).zzm();
                return this;
            }

            public final zza zzc() {
                zzad();
                ((zzl) this.zza).zzn();
                return this;
            }

            public final zza zzd() {
                zzad();
                ((zzl) this.zza).zzo();
                return this;
            }
        }

        static {
            zzl zzl = new zzl();
            zzc = zzl;
            zzix.zza(zzl.class, zzl);
        }

        private zzl() {
        }

        public static zza zze() {
            return (zza) zzc.zzbx();
        }

        public static zzl zzg() {
            return zzc;
        }

        /* access modifiers changed from: private */
        public final void zzl() {
            this.zzg = zzix.zzcc();
        }

        /* access modifiers changed from: private */
        public final void zzm() {
            this.zzf = zzix.zzcb();
        }

        /* access modifiers changed from: private */
        public final void zzn() {
            this.zzh = zzix.zzcc();
        }

        /* access modifiers changed from: private */
        public final void zzo() {
            this.zze = zzix.zzcb();
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zzd> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzm> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class, "zzh", zzm.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzl> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzl.class) {
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
        public final void zzb(Iterable<? extends Long> iterable) {
            zzjg zzjg = this.zzf;
            if (!zzjg.zzc()) {
                this.zzf = zzix.zza(zzjg);
            }
            zzhd.zza(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        public final void zzc(Iterable<? extends zzm> iterable) {
            zzjf<zzm> zzjf = this.zzh;
            if (!zzjf.zzc()) {
                this.zzh = zzix.zza(zzjf);
            }
            zzhd.zza(iterable, this.zzh);
        }

        /* access modifiers changed from: private */
        public final void zzd(Iterable<? extends Long> iterable) {
            zzjg zzjg = this.zze;
            if (!zzjg.zzc()) {
                this.zze = zzix.zza(zzjg);
            }
            zzhd.zza(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzd> iterable) {
            zzjf<zzd> zzjf = this.zzg;
            if (!zzjf.zzc()) {
                this.zzg = zzix.zza(zzjf);
            }
            zzhd.zza(iterable, this.zzg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzm extends zzix<zzm, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzm zzc;
        private static volatile zzkw<zzm> zzd;
        private int zze;
        private int zzf;
        private zzjg zzg = zzix.zzcb();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzm, zza> implements zzkl {
            private zza() {
                super(zzm.zzc);
            }

            public final zza zza(Iterable<? extends Long> iterable) {
                zzad();
                ((zzm) this.zza).zza(iterable);
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(int i10) {
                zzad();
                ((zzm) this.zza).zzb(i10);
                return this;
            }
        }

        static {
            zzm zzm = new zzm();
            zzc = zzm;
            zzix.zza(zzm.class, zzm);
        }

        private zzm() {
        }

        public static zza zzc() {
            return (zza) zzc.zzbx();
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        /* access modifiers changed from: private */
        public final void zzb(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        public final long zza(int i10) {
            return this.zzg.zzb(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzm> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzm.class) {
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
        public final void zza(Iterable<? extends Long> iterable) {
            zzjg zzjg = this.zzg;
            if (!zzjg.zzc()) {
                this.zzg = zzix.zza(zzjg);
            }
            zzhd.zza(iterable, this.zzg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public static final class zzn extends zzix<zzn, zza> implements zzkl {
        /* access modifiers changed from: private */
        public static final zzn zzc;
        private static volatile zzkw<zzn> zzd;
        private int zze;
        private long zzf;
        private String zzg = MaxReward.DEFAULT_LABEL;
        private String zzh = MaxReward.DEFAULT_LABEL;
        private long zzi;
        private float zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
        public static final class zza extends zzix.zzb<zzn, zza> implements zzkl {
            private zza() {
                super(zzn.zzc);
            }

            public final zza zza() {
                zzad();
                ((zzn) this.zza).zzn();
                return this;
            }

            public final zza zzb() {
                zzad();
                ((zzn) this.zza).zzo();
                return this;
            }

            public final zza zzc() {
                zzad();
                ((zzn) this.zza).zzp();
                return this;
            }

            /* synthetic */ zza(zzfh zzfh) {
                this();
            }

            public final zza zza(double d10) {
                zzad();
                ((zzn) this.zza).zza(d10);
                return this;
            }

            public final zza zzb(long j10) {
                zzad();
                ((zzn) this.zza).zzb(j10);
                return this;
            }

            public final zza zza(long j10) {
                zzad();
                ((zzn) this.zza).zza(j10);
                return this;
            }

            public final zza zzb(String str) {
                zzad();
                ((zzn) this.zza).zzb(str);
                return this;
            }

            public final zza zza(String str) {
                zzad();
                ((zzn) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzn zzn = new zzn();
            zzc = zzn;
            zzix.zza(zzn.class, zzn);
        }

        private zzn() {
        }

        public static zza zze() {
            return (zza) zzc.zzbx();
        }

        /* access modifiers changed from: private */
        public final void zzn() {
            this.zze &= -33;
            this.zzk = 0.0d;
        }

        /* access modifiers changed from: private */
        public final void zzo() {
            this.zze &= -9;
            this.zzi = 0;
        }

        /* access modifiers changed from: private */
        public final void zzp() {
            this.zze &= -5;
            this.zzh = zzc.zzh;
        }

        public final double zza() {
            return this.zzk;
        }

        public final float zzb() {
            return this.zzj;
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfh.zza[i10 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((zzfh) null);
                case 3:
                    return zzix.zza((zzkj) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzn> zzkw = zzd;
                    if (zzkw == null) {
                        synchronized (zzn.class) {
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
        public final void zzb(long j10) {
            this.zze |= 1;
            this.zzf = j10;
        }

        /* access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        /* access modifiers changed from: private */
        public final void zza(double d10) {
            this.zze |= 32;
            this.zzk = d10;
        }

        /* access modifiers changed from: private */
        public final void zza(long j10) {
            this.zze |= 8;
            this.zzi = j10;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }
}
