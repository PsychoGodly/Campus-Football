package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f27322a = H();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f27323b = d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f27324c = q(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f27325d = q(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f27326e = F();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f27327f = X();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f27328g = W();

    /* renamed from: h  reason: collision with root package name */
    static final long f27329h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f27330i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f27331j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f27332k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f27333l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f27334m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f27335n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f27336o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f27337p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f27338q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f27339r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f27340s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f27341t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f27342u = s(o());

    /* renamed from: v  reason: collision with root package name */
    private static final int f27343v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f27344w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: UnsafeUtil */
    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        public boolean d(Object obj, long j10) {
            if (z1.f27344w) {
                return z1.u(obj, j10);
            }
            return z1.v(obj, j10);
        }

        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        public byte f(Object obj, long j10) {
            if (z1.f27344w) {
                return z1.y(obj, j10);
            }
            return z1.z(obj, j10);
        }

        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        public void n(Object obj, long j10, boolean z10) {
            if (z1.f27344w) {
                z1.M(obj, j10, z10);
            } else {
                z1.N(obj, j10, z10);
            }
        }

        public void o(Object obj, long j10, byte b10) {
            if (z1.f27344w) {
                z1.P(obj, j10, b10);
            } else {
                z1.Q(obj, j10, b10);
            }
        }

        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean v() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        public boolean d(Object obj, long j10) {
            if (z1.f27344w) {
                return z1.u(obj, j10);
            }
            return z1.v(obj, j10);
        }

        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        public byte f(Object obj, long j10) {
            if (z1.f27344w) {
                return z1.y(obj, j10);
            }
            return z1.z(obj, j10);
        }

        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        public void n(Object obj, long j10, boolean z10) {
            if (z1.f27344w) {
                z1.M(obj, j10, z10);
            } else {
                z1.N(obj, j10, z10);
            }
        }

        public void o(Object obj, long j10, byte b10) {
            if (z1.f27344w) {
                z1.P(obj, j10, b10);
            } else {
                z1.Q(obj, j10, b10);
            }
        }

        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean v() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f27345a.copyMemory((Object) null, j10, bArr, z1.f27329h + j11, j12);
        }

        public boolean d(Object obj, long j10) {
            return this.f27345a.getBoolean(obj, j10);
        }

        public byte e(long j10) {
            return this.f27345a.getByte(j10);
        }

        public byte f(Object obj, long j10) {
            return this.f27345a.getByte(obj, j10);
        }

        public double g(Object obj, long j10) {
            return this.f27345a.getDouble(obj, j10);
        }

        public float h(Object obj, long j10) {
            return this.f27345a.getFloat(obj, j10);
        }

        public long j(long j10) {
            return this.f27345a.getLong(j10);
        }

        public void n(Object obj, long j10, boolean z10) {
            this.f27345a.putBoolean(obj, j10, z10);
        }

        public void o(Object obj, long j10, byte b10) {
            this.f27345a.putByte(obj, j10, b10);
        }

        public void p(Object obj, long j10, double d10) {
            this.f27345a.putDouble(obj, j10, d10);
        }

        public void q(Object obj, long j10, float f10) {
            this.f27345a.putFloat(obj, j10, f10);
        }

        public boolean u() {
            Class<Object> cls = Object.class;
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f27345a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }

        public boolean v() {
            Class<Object> cls = Object.class;
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f27345a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }
    }

    /* compiled from: UnsafeUtil */
    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f27345a;

        e(Unsafe unsafe) {
            this.f27345a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f27345a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f27345a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f27345a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f27345a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f27345a.getObject(obj, j10);
        }

        public final long m(Field field) {
            return this.f27345a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j10, boolean z10);

        public abstract void o(Object obj, long j10, byte b10);

        public abstract void p(Object obj, long j10, double d10);

        public abstract void q(Object obj, long j10, float f10);

        public final void r(Object obj, long j10, int i10) {
            this.f27345a.putInt(obj, j10, i10);
        }

        public final void s(Object obj, long j10, long j11) {
            this.f27345a.putLong(obj, j10, j11);
        }

        public final void t(Object obj, long j10, Object obj2) {
            this.f27345a.putObject(obj, j10, obj2);
        }

        public boolean u() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f27345a;
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
                z1.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f27345a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (z1.o() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long m10 = (long) m(byte[].class);
        f27329h = m10;
        f27330i = (long) m(cls6);
        f27331j = (long) n(cls6);
        f27332k = (long) m(cls5);
        f27333l = (long) n(cls5);
        f27334m = (long) m(cls4);
        f27335n = (long) n(cls4);
        f27336o = (long) m(cls3);
        f27337p = (long) n(cls3);
        f27338q = (long) m(cls2);
        f27339r = (long) n(cls2);
        f27340s = (long) m(cls);
        f27341t = (long) n(cls);
        f27343v = (int) (7 & m10);
    }

    private z1() {
    }

    static double A(Object obj, long j10) {
        return f27326e.g(obj, j10);
    }

    static float B(Object obj, long j10) {
        return f27326e.h(obj, j10);
    }

    static int C(Object obj, long j10) {
        return f27326e.i(obj, j10);
    }

    static long D(long j10) {
        return f27326e.j(j10);
    }

    static long E(Object obj, long j10) {
        return f27326e.k(obj, j10);
    }

    private static e F() {
        Unsafe unsafe = f27322a;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f27324c) {
            return new c(unsafe);
        }
        if (f27325d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j10) {
        return f27326e.l(obj, j10);
    }

    static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean I() {
        return f27328g;
    }

    static boolean J() {
        return f27327f;
    }

    /* access modifiers changed from: private */
    public static void K(Throwable th) {
        Logger logger = Logger.getLogger(z1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void L(Object obj, long j10, boolean z10) {
        f27326e.n(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void M(Object obj, long j10, boolean z10) {
        P(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void N(Object obj, long j10, boolean z10) {
        Q(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void O(byte[] bArr, long j10, byte b10) {
        f27326e.o(bArr, f27329h + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void P(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int C = C(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (C & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void Q(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (C(obj, j11) & (~(255 << i10))));
    }

    static void R(Object obj, long j10, double d10) {
        f27326e.p(obj, j10, d10);
    }

    static void S(Object obj, long j10, float f10) {
        f27326e.q(obj, j10, f10);
    }

    static void T(Object obj, long j10, int i10) {
        f27326e.r(obj, j10, i10);
    }

    static void U(Object obj, long j10, long j11) {
        f27326e.s(obj, j10, j11);
    }

    static void V(Object obj, long j10, Object obj2) {
        f27326e.t(obj, j10, obj2);
    }

    private static boolean W() {
        e eVar = f27326e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    private static boolean X() {
        e eVar = f27326e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    static long k(ByteBuffer byteBuffer) {
        return f27326e.k(byteBuffer, f27342u);
    }

    static <T> T l(Class<T> cls) {
        try {
            return f27322a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class<?> cls) {
        if (f27328g) {
            return f27326e.a(cls);
        }
        return -1;
    }

    private static int n(Class<?> cls) {
        if (f27328g) {
            return f27326e.b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static Field o() {
        Field r10;
        if (d.c() && (r10 = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r10;
        }
        Field r11 = r(Buffer.class, "address");
        if (r11 == null || r11.getType() != Long.TYPE) {
            return null;
        }
        return r11;
    }

    static void p(long j10, byte[] bArr, long j11, long j12) {
        f27326e.c(j10, bArr, j11, j12);
    }

    static boolean q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = f27323b;
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

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f27326e) == null) {
            return -1;
        }
        return eVar.m(field);
    }

    static boolean t(Object obj, long j10) {
        return f27326e.d(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean u(Object obj, long j10) {
        return y(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    static byte w(long j10) {
        return f27326e.e(j10);
    }

    static byte x(byte[] bArr, long j10) {
        return f27326e.f(bArr, f27329h + j10);
    }

    /* access modifiers changed from: private */
    public static byte y(Object obj, long j10) {
        return (byte) ((C(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((C(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }
}
