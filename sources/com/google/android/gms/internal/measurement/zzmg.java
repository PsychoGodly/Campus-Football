package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzmg {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc = zzhj.zza();
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    private static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        public final boolean zzc(Object obj, long j10) {
            if (zzmg.zza) {
                return zzmg.zzf(obj, j10);
            }
            return zzmg.zzg(obj, j10);
        }

        public final void zza(Object obj, long j10, boolean z10) {
            if (zzmg.zza) {
                zzmg.zzc(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                zzmg.zzd(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j10, byte b10) {
            if (zzmg.zza) {
                zzmg.zzc(obj, j10, b10);
            } else {
                zzmg.zzd(obj, j10, b10);
            }
        }

        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    private static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        public final boolean zzc(Object obj, long j10) {
            if (zzmg.zza) {
                return zzmg.zzf(obj, j10);
            }
            return zzmg.zzg(obj, j10);
        }

        public final void zza(Object obj, long j10, boolean z10) {
            if (zzmg.zza) {
                zzmg.zzc(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                zzmg.zzd(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j10, byte b10) {
            if (zzmg.zza) {
                zzmg.zzc(obj, j10, b10);
            } else {
                zzmg.zzd(obj, j10, b10);
            }
        }

        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    private static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j10);

        public abstract void zza(Object obj, long j10, byte b10);

        public abstract void zza(Object obj, long j10, double d10);

        public abstract void zza(Object obj, long j10, float f10);

        public final void zza(Object obj, long j10, int i10) {
            this.zza.putInt(obj, j10, i10);
        }

        public abstract void zza(Object obj, long j10, boolean z10);

        public abstract float zzb(Object obj, long j10);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (zzmg.zze() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                zzmg.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j10);

        public final int zzd(Object obj, long j10) {
            return this.zza.getInt(obj, j10);
        }

        public final long zze(Object obj, long j10) {
            return this.zza.getLong(obj, j10);
        }

        public final void zza(Object obj, long j10, long j11) {
            this.zza.putLong(obj, j10, j11);
        }

        public final boolean zza() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                zzmg.zza(th);
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = zzb()
            zzb = r6
            java.lang.Class r7 = com.google.android.gms.internal.measurement.zzhj.zza()
            zzc = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = zzd(r7)
            zzd = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = zzd(r8)
            zze = r8
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.zzmg$zza r7 = new com.google.android.gms.internal.measurement.zzmg$zza
            r7.<init>(r6)
            goto L_0x003b
        L_0x0032:
            if (r8 == 0) goto L_0x003a
            com.google.android.gms.internal.measurement.zzmg$zzb r7 = new com.google.android.gms.internal.measurement.zzmg$zzb
            r7.<init>(r6)
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            zzf = r7
            r6 = 0
            if (r7 != 0) goto L_0x0042
            r8 = 0
            goto L_0x0046
        L_0x0042:
            boolean r8 = r7.zzb()
        L_0x0046:
            zzg = r8
            if (r7 != 0) goto L_0x004c
            r8 = 0
            goto L_0x0050
        L_0x004c:
            boolean r8 = r7.zza()
        L_0x0050:
            zzh = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = zzb(r8)
            long r8 = (long) r8
            zzi = r8
            int r10 = zzb(r5)
            long r10 = (long) r10
            zzj = r10
            int r5 = zzc(r5)
            long r10 = (long) r5
            zzk = r10
            int r5 = zzb(r4)
            long r10 = (long) r5
            zzl = r10
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzm = r4
            int r4 = zzb(r3)
            long r4 = (long) r4
            zzn = r4
            int r3 = zzc(r3)
            long r3 = (long) r3
            zzo = r3
            int r3 = zzb(r2)
            long r3 = (long) r3
            zzp = r3
            int r2 = zzc(r2)
            long r2 = (long) r2
            zzq = r2
            int r2 = zzb(r1)
            long r2 = (long) r2
            zzr = r2
            int r1 = zzc(r1)
            long r1 = (long) r1
            zzs = r1
            int r1 = zzb(r0)
            long r1 = (long) r1
            zzt = r1
            int r0 = zzc(r0)
            long r0 = (long) r0
            zzu = r0
            java.lang.reflect.Field r0 = zze()
            if (r0 == 0) goto L_0x00bf
            if (r7 != 0) goto L_0x00b8
            goto L_0x00bf
        L_0x00b8:
            sun.misc.Unsafe r1 = r7.zza
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00c1
        L_0x00bf:
            r0 = -1
        L_0x00c1:
            zzv = r0
            r0 = 7
            long r0 = r0 & r8
            int r1 = (int) r0
            zzw = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00d2
            r6 = 1
        L_0x00d2:
            zza = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmg.<clinit>():void");
    }

    private zzmg() {
    }

    static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j10) {
        return zzf.zze(obj, j10);
    }

    static Object zze(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static /* synthetic */ boolean zzf(Object obj, long j10) {
        return ((byte) (zzc(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j10) {
        return ((byte) (zzc(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }

    static <T> T zza(Class<T> cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc(obj, j11) & (~(255 << i10))));
    }

    static int zzc(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    /* access modifiers changed from: private */
    public static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zzc(Object obj, long j10, boolean z10) {
        zzf.zza(obj, j10, z10);
    }

    private static boolean zzd(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class<?> cls3 = zzc;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger logger = Logger.getLogger(zzmg.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int zzc2 = zzc(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc2 & (~(255 << i10))));
    }

    static boolean zzc() {
        return zzh;
    }

    static void zza(byte[] bArr, long j10, byte b10) {
        zzf.zza((Object) bArr, zzi + j10, b10);
    }

    static void zza(Object obj, long j10, double d10) {
        zzf.zza(obj, j10, d10);
    }

    static void zza(Object obj, long j10, float f10) {
        zzf.zza(obj, j10, f10);
    }

    static void zza(Object obj, long j10, int i10) {
        zzf.zza(obj, j10, i10);
    }

    static void zza(Object obj, long j10, long j11) {
        zzf.zza(obj, j10, j11);
    }

    static void zza(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static boolean zzd() {
        return zzg;
    }
}
