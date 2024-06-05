package zd;

import ie.b;
import ie.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* compiled from: PlatformImplementations.kt */
public class a {

    /* renamed from: zd.a$a  reason: collision with other inner class name */
    /* compiled from: PlatformImplementations.kt */
    private static final class C0471a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0471a f39544a = new C0471a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f39545b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f39546c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                zd.a$a r0 = new zd.a$a
                r0.<init>()
                f39544a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.m.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.m.a(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.m.d(r7, r8)
                java.lang.Object r7 = td.m.K(r7)
                boolean r7 = kotlin.jvm.internal.m.a(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = 0
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f39545b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.m.a(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f39546c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zd.a.C0471a.<clinit>():void");
        }

        private C0471a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        m.e(th, "cause");
        m.e(th2, "exception");
        Method method = C0471a.f39545b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}
