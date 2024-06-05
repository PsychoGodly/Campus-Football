package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzjp {
    static final long zza = ((long) zzz(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd = Memory.class;
    private static final boolean zze;
    private static final zzjo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0134  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            sun.misc.Unsafe r0 = zzg()
            zzc = r0
            int r8 = com.google.android.recaptcha.internal.zzel.zza
            java.lang.Class<libcore.io.Memory> r8 = libcore.io.Memory.class
            zzd = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = zzv(r8)
            zze = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = zzv(r10)
            r11 = 0
            if (r0 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.recaptcha.internal.zzjn r11 = new com.google.android.recaptcha.internal.zzjn
            r11.<init>(r0)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.recaptcha.internal.zzjm r11 = new com.google.android.recaptcha.internal.zzjm
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
            java.lang.reflect.Field r0 = zzB()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r0 = 1
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzjp.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0046
        L_0x006e:
            zzg = r0
            com.google.android.recaptcha.internal.zzjo r0 = zzf
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
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzjp.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0074
        L_0x00ed:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r7 = (long) r0
            zza = r7
            zzz(r6)
            zzA(r6)
            zzz(r5)
            zzA(r5)
            zzz(r4)
            zzA(r4)
            zzz(r3)
            zzA(r3)
            zzz(r2)
            zzA(r2)
            zzz(r1)
            zzA(r1)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L_0x012b
            com.google.android.recaptcha.internal.zzjo r1 = zzf
            if (r1 == 0) goto L_0x012b
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r0)
        L_0x012b:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r13 = 0
        L_0x0135:
            zzb = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjp.<clinit>():void");
    }

    private zzjp() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzel.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        zzjo zzjo = zzf;
        long j11 = -4 & j10;
        int i10 = zzjo.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzjo.zza.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        zzjo zzjo = zzf;
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzjo.zza.putInt(obj, j11, ((255 & b10) << i10) | (zzjo.zza.getInt(obj, j11) & (~(255 << i10))));
    }

    static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    static int zzc(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    static long zzd(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object zzf(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzjl());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zzm(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    static void zzn(byte[] bArr, long j10, byte b10) {
        zzf.zzd(bArr, zza + j10, b10);
    }

    static void zzo(Object obj, long j10, double d10) {
        zzf.zze(obj, j10, d10);
    }

    static void zzp(Object obj, long j10, float f10) {
        zzf.zzf(obj, j10, f10);
    }

    static void zzq(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    static void zzr(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    static void zzs(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = zzel.zza;
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

    static boolean zzw(Object obj, long j10) {
        return zzf.zzg(obj, j10);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
