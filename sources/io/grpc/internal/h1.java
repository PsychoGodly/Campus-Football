package io.grpc.internal;

import dd.a1;
import dd.c1;
import dd.d0;
import dd.e;
import dd.g1;
import dd.h;
import dd.o;
import dd.u0;
import dd.v;
import dd.v0;
import io.grpc.internal.e0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: ManagedChannelImplBuilder */
public final class h1 extends v0<h1> {
    private static final Logger H = Logger.getLogger(h1.class.getName());
    static final long I = TimeUnit.MINUTES.toMillis(30);
    static final long J = TimeUnit.SECONDS.toMillis(1);
    private static final p1<? extends Executor> K = g2.c(r0.f35320u);
    private static final v L = v.c();
    private static final o M = o.a();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final c F;
    private final b G;

    /* renamed from: a  reason: collision with root package name */
    p1<? extends Executor> f35063a;

    /* renamed from: b  reason: collision with root package name */
    p1<? extends Executor> f35064b;

    /* renamed from: c  reason: collision with root package name */
    private final List<h> f35065c;

    /* renamed from: d  reason: collision with root package name */
    final c1 f35066d;

    /* renamed from: e  reason: collision with root package name */
    a1.d f35067e;

    /* renamed from: f  reason: collision with root package name */
    final String f35068f;

    /* renamed from: g  reason: collision with root package name */
    final dd.b f35069g;

    /* renamed from: h  reason: collision with root package name */
    private final SocketAddress f35070h;

    /* renamed from: i  reason: collision with root package name */
    String f35071i;

    /* renamed from: j  reason: collision with root package name */
    String f35072j;

    /* renamed from: k  reason: collision with root package name */
    String f35073k;

    /* renamed from: l  reason: collision with root package name */
    boolean f35074l;

    /* renamed from: m  reason: collision with root package name */
    v f35075m;

    /* renamed from: n  reason: collision with root package name */
    o f35076n;

    /* renamed from: o  reason: collision with root package name */
    long f35077o;

    /* renamed from: p  reason: collision with root package name */
    int f35078p;

    /* renamed from: q  reason: collision with root package name */
    int f35079q;

    /* renamed from: r  reason: collision with root package name */
    long f35080r;

    /* renamed from: s  reason: collision with root package name */
    long f35081s;

    /* renamed from: t  reason: collision with root package name */
    boolean f35082t;

    /* renamed from: u  reason: collision with root package name */
    d0 f35083u;

    /* renamed from: v  reason: collision with root package name */
    int f35084v;

    /* renamed from: w  reason: collision with root package name */
    Map<String, ?> f35085w;

    /* renamed from: x  reason: collision with root package name */
    boolean f35086x;

    /* renamed from: y  reason: collision with root package name */
    g1 f35087y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f35088z;

    /* compiled from: ManagedChannelImplBuilder */
    public interface b {
        int a();
    }

    /* compiled from: ManagedChannelImplBuilder */
    public interface c {
        t a();
    }

    /* compiled from: ManagedChannelImplBuilder */
    private static final class d implements b {
        private d() {
        }

        public int a() {
            return 443;
        }
    }

    public h1(String str, c cVar, b bVar) {
        this(str, (e) null, (dd.b) null, cVar, bVar);
    }

    public u0 a() {
        return new i1(new g1(this, this.F.a(), new e0.a(), g2.c(r0.f35320u), r0.f35322w, f(), l2.f35171a));
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.G.a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<dd.h> f() {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<dd.h> r1 = r13.f35065c
            r0.<init>(r1)
            java.util.List r1 = dd.h0.a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            r0.addAll(r1)
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            java.lang.String r4 = "getClientInterceptor"
            r5 = 0
            java.lang.String r6 = "Unable to apply census stats"
            if (r1 != 0) goto L_0x008b
            boolean r7 = r13.f35088z
            if (r7 == 0) goto L_0x008b
            java.lang.String r7 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8 = 4
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r9[r3] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r9[r2] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r11 = 2
            r9[r11] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r12 = 3
            r9[r12] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r4, r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r9 = r13.A     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r9 = r13.B     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r2 = r13.C     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r11] = r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r2 = r13.D     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r12] = r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Object r2 = r7.invoke(r5, r8)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            dd.h r2 = (dd.h) r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            goto L_0x0086
        L_0x0062:
            r2 = move-exception
            java.util.logging.Logger r7 = H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x006b:
            r2 = move-exception
            java.util.logging.Logger r7 = H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x0074:
            r2 = move-exception
            java.util.logging.Logger r7 = H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x007d:
            r2 = move-exception
            java.util.logging.Logger r7 = H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
        L_0x0085:
            r2 = r5
        L_0x0086:
            if (r2 == 0) goto L_0x008b
            r0.add(r3, r2)
        L_0x008b:
            if (r1 != 0) goto L_0x00cf
            boolean r1 = r13.E
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r2)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            dd.h r1 = (dd.h) r1     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            r5 = r1
            goto L_0x00ca
        L_0x00a7:
            r1 = move-exception
            java.util.logging.Logger r2 = H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00b0:
            r1 = move-exception
            java.util.logging.Logger r2 = H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00b9:
            r1 = move-exception
            java.util.logging.Logger r2 = H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00c2:
            r1 = move-exception
            java.util.logging.Logger r2 = H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
        L_0x00ca:
            if (r5 == 0) goto L_0x00cf
            r0.add(r3, r5)
        L_0x00cf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.h1.f():java.util.List");
    }

    public h1(String str, e eVar, dd.b bVar, c cVar, b bVar2) {
        p1<? extends Executor> p1Var = K;
        this.f35063a = p1Var;
        this.f35064b = p1Var;
        this.f35065c = new ArrayList();
        c1 d10 = c1.d();
        this.f35066d = d10;
        this.f35067e = d10.c();
        this.f35073k = "pick_first";
        this.f35075m = L;
        this.f35076n = M;
        this.f35077o = I;
        this.f35078p = 5;
        this.f35079q = 5;
        this.f35080r = 16777216;
        this.f35081s = 1048576;
        this.f35082t = true;
        this.f35083u = d0.g();
        this.f35086x = true;
        this.f35088z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.f35068f = (String) r6.o.p(str, "target");
        this.f35069g = bVar;
        this.F = (c) r6.o.p(cVar, "clientTransportFactoryBuilder");
        this.f35070h = null;
        if (bVar2 != null) {
            this.G = bVar2;
        } else {
            this.G = new d();
        }
    }
}
