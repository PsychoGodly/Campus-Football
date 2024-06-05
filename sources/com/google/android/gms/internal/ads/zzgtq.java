package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgtq {
    static final long zza = ((long) zzC(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd = Memory.class;
    private static final boolean zze;
    private static final zzgtp zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013a  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            sun.misc.Unsafe r0 = zzi()
            zzc = r0
            int r8 = com.google.android.gms.internal.ads.zzgop.zza
            java.lang.Class<libcore.io.Memory> r8 = libcore.io.Memory.class
            zzd = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = zzy(r8)
            zze = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = zzy(r10)
            r11 = 0
            if (r0 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.zzgto r11 = new com.google.android.gms.internal.ads.zzgto
            r11.<init>(r0)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzgtn r11 = new com.google.android.gms.internal.ads.zzgtn
            r11.<init>(r0)
        L_0x003b:
            zzf = r11
            java.lang.String r9 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r0 = r11.zza
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r11 = new java.lang.Class[r13]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r11[r14] = r15     // Catch:{ all -> 0x0069 }
            r0.getMethod(r10, r11)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            r11[r14] = r7     // Catch:{ all -> 0x0069 }
            r11[r13] = r8     // Catch:{ all -> 0x0069 }
            r0.getMethod(r9, r11)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r0 = zzE()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r0 = 1
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgtq.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0046
        L_0x006e:
            zzg = r0
            com.google.android.gms.internal.ads.zzgtp r0 = zzf
            if (r0 != 0) goto L_0x0076
        L_0x0074:
            r0 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r0 = r0.zza
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r11 = java.lang.reflect.Field.class
            r8[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r10, r8)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "arrayBaseOffset"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "arrayIndexScale"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "getInt"
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r10[r14] = r7     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r10[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putInt"
            r10 = 3
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r15[r14] = r7     // Catch:{ all -> 0x00e8 }
            r15[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r15[r12] = r16     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r15)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r8 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r8[r14] = r7     // Catch:{ all -> 0x00e8 }
            r8[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r9, r8)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putLong"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "getObject"
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putObject"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r9[r12] = r7     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            r0 = 1
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgtq.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0074
        L_0x00ed:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzC(r0)
            long r7 = (long) r0
            zza = r7
            zzC(r6)
            zzD(r6)
            zzC(r5)
            zzD(r5)
            zzC(r4)
            zzD(r4)
            zzC(r3)
            zzD(r3)
            zzC(r2)
            zzD(r2)
            zzC(r1)
            zzD(r1)
            java.lang.reflect.Field r0 = zzE()
            r1 = -1
            if (r0 == 0) goto L_0x012f
            com.google.android.gms.internal.ads.zzgtp r3 = zzf
            if (r3 != 0) goto L_0x0129
            goto L_0x012f
        L_0x0129:
            sun.misc.Unsafe r1 = r3.zza
            long r1 = r1.objectFieldOffset(r0)
        L_0x012f:
            zzi = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r13 = 0
        L_0x013b:
            zzb = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtq.<clinit>():void");
    }

    private zzgtq() {
    }

    static boolean zzA() {
        return zzh;
    }

    static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i10 = zzgop.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, "address");
        if (zzF2 == null || zzF2.getType() != Long.TYPE) {
            return null;
        }
        return zzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzG(Object obj, long j10, byte b10) {
        zzgtp zzgtp = zzf;
        long j11 = -4 & j10;
        int i10 = zzgtp.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzgtp.zza.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* access modifiers changed from: private */
    public static void zzH(Object obj, long j10, byte b10) {
        zzgtp zzgtp = zzf;
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzgtp.zza.putInt(obj, j11, ((255 & b10) << i10) | (zzgtp.zza.getInt(obj, j11) & (~(255 << i10))));
    }

    static byte zza(long j10) {
        return zzf.zza(j10);
    }

    static double zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    static float zzc(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }

    static int zzd(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    static long zze(ByteBuffer byteBuffer) {
        zzgtp zzgtp = zzf;
        return zzgtp.zza.getLong(byteBuffer, zzi);
    }

    static long zzf(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object zzh(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgtm());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zzo(long j10, byte[] bArr, long j11, long j12) {
        zzf.zzd(j10, bArr, j11, j12);
    }

    static void zzp(Object obj, long j10, boolean z10) {
        zzf.zze(obj, j10, z10);
    }

    static void zzq(byte[] bArr, long j10, byte b10) {
        zzf.zzf(bArr, zza + j10, b10);
    }

    static void zzr(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    static void zzs(Object obj, long j10, float f10) {
        zzf.zzh(obj, j10, f10);
    }

    static void zzt(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    static void zzu(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    static void zzv(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzy(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = zzgop.zza;
        try {
            Class cls3 = zzd;
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

    static boolean zzz(Object obj, long j10) {
        return zzf.zzi(obj, j10);
    }
}
