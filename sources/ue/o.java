package ue;

import fe.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.i0;
import sd.o;
import sd.p;

/* compiled from: ExceptionsConstructor.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int f38822a = e(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final j f38823b;

    /* compiled from: ExceptionsConstructor.kt */
    static final class a extends n implements l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f38824a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Constructor<?> constructor) {
            super(1);
            this.f38824a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f38824a.newInstance(new Object[]{th.getMessage(), th});
            m.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    static final class b extends n implements l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f38825a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Constructor<?> constructor) {
            super(1);
            this.f38825a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f38825a.newInstance(new Object[]{th.getMessage()});
            m.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    static final class c extends n implements l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f38826a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Constructor<?> constructor) {
            super(1);
            this.f38826a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f38826a.newInstance(new Object[]{th});
            m.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    static final class d extends n implements l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f38827a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Constructor<?> constructor) {
            super(1);
            this.f38827a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f38827a.newInstance(new Object[0]);
            m.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    static final class e extends n implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f38828a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    static final class f extends n implements l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<Throwable, Throwable> f38829a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.f38829a = lVar;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            l<Throwable, Throwable> lVar = this.f38829a;
            Throwable th2 = null;
            try {
                o.a aVar = sd.o.f38128b;
                Throwable invoke = lVar.invoke(th);
                if (!m.a(th.getMessage(), invoke.getMessage()) && !m.a(invoke.getMessage(), th.toString())) {
                    invoke = null;
                }
                obj = sd.o.b(invoke);
            } catch (Throwable th3) {
                o.a aVar2 = sd.o.f38128b;
                obj = sd.o.b(p.a(th3));
            }
            if (!sd.o.f(obj)) {
                th2 = obj;
            }
            return th2;
        }
    }

    static {
        j jVar;
        try {
            if (q.a()) {
                jVar = v0.f38854a;
            } else {
                jVar = c.f38792a;
            }
        } catch (Throwable unused) {
            jVar = v0.f38854a;
        }
        f38823b = jVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r13 = (fe.l) r6.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E extends java.lang.Throwable> fe.l<java.lang.Throwable, java.lang.Throwable> b(java.lang.Class<E> r13) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            ue.o$e r1 = ue.o.e.f38828a
            int r2 = f38822a
            r3 = 0
            int r4 = e(r13, r3)
            if (r2 == r4) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.reflect.Constructor[] r13 = r13.getConstructors()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r13.length
            r2.<init>(r4)
            int r4 = r13.length
            r5 = 0
        L_0x001a:
            r6 = 0
            if (r5 >= r4) goto L_0x00ba
            r7 = r13[r5]
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            if (r9 == 0) goto L_0x00a2
            r10 = 2
            r11 = -1
            r12 = 1
            if (r9 == r12) goto L_0x0065
            if (r9 == r10) goto L_0x0037
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x0037:
            r9 = r8[r3]
            boolean r9 = kotlin.jvm.internal.m.a(r9, r0)
            if (r9 == 0) goto L_0x005c
            r8 = r8[r12]
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            boolean r8 = kotlin.jvm.internal.m.a(r8, r9)
            if (r8 == 0) goto L_0x005c
            ue.o$a r6 = new ue.o$a
            r6.<init>(r7)
            fe.l r6 = f(r6)
            r7 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x005c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x0065:
            r8 = r8[r3]
            boolean r9 = kotlin.jvm.internal.m.a(r8, r0)
            if (r9 == 0) goto L_0x007f
            ue.o$b r6 = new ue.o$b
            r6.<init>(r7)
            fe.l r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x007f:
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            boolean r8 = kotlin.jvm.internal.m.a(r8, r9)
            if (r8 == 0) goto L_0x0099
            ue.o$c r6 = new ue.o$c
            r6.<init>(r7)
            fe.l r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x0099:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            sd.n r6 = sd.s.a(r6, r7)
            goto L_0x00b3
        L_0x00a2:
            ue.o$d r6 = new ue.o$d
            r6.<init>(r7)
            fe.l r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            sd.n r6 = sd.s.a(r6, r7)
        L_0x00b3:
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x001a
        L_0x00ba:
            java.util.Iterator r13 = r2.iterator()
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L_0x00c5
            goto L_0x00f8
        L_0x00c5:
            java.lang.Object r6 = r13.next()
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L_0x00d0
            goto L_0x00f8
        L_0x00d0:
            r0 = r6
            sd.n r0 = (sd.n) r0
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x00dd:
            java.lang.Object r2 = r13.next()
            r3 = r2
            sd.n r3 = (sd.n) r3
            java.lang.Object r3 = r3.d()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r0 >= r3) goto L_0x00f2
            r6 = r2
            r0 = r3
        L_0x00f2:
            boolean r2 = r13.hasNext()
            if (r2 != 0) goto L_0x00dd
        L_0x00f8:
            sd.n r6 = (sd.n) r6
            if (r6 == 0) goto L_0x0106
            java.lang.Object r13 = r6.c()
            fe.l r13 = (fe.l) r13
            if (r13 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r1 = r13
        L_0x0106:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.o.b(java.lang.Class):fe.l");
    }

    private static final int c(Class<?> cls, int i10) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            Class<? super Object> cls2 = cls;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(declaredFields[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i10;
    }

    static /* synthetic */ int d(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c(cls, i10);
    }

    private static final int e(Class<?> cls, int i10) {
        Integer num;
        ee.a.c(cls);
        try {
            o.a aVar = sd.o.f38128b;
            num = sd.o.b(Integer.valueOf(d(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            o.a aVar2 = sd.o.f38128b;
            num = sd.o.b(p.a(th));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (sd.o.f(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    private static final l<Throwable, Throwable> f(l<? super Throwable, ? extends Throwable> lVar) {
        return new f(lVar);
    }

    public static final <E extends Throwable> E g(E e10) {
        E e11;
        if (!(e10 instanceof i0)) {
            return (Throwable) f38823b.a(e10.getClass()).invoke(e10);
        }
        try {
            o.a aVar = sd.o.f38128b;
            e11 = sd.o.b(((i0) e10).a());
        } catch (Throwable th) {
            o.a aVar2 = sd.o.f38128b;
            e11 = sd.o.b(p.a(th));
        }
        if (sd.o.f(e11)) {
            e11 = null;
        }
        return (Throwable) e11;
    }
}
