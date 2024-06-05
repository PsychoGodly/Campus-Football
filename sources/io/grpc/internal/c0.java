package io.grpc.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import dd.a1;
import dd.f1;
import dd.g1;
import dd.j1;
import dd.n1;
import dd.x;
import io.grpc.internal.f2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.a0;
import r6.o;
import r6.t;
import r6.z;

/* compiled from: DnsNameResolver */
public class c0 extends a1 {
    private static final g A;
    private static String B;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Logger f34788s;

    /* renamed from: t  reason: collision with root package name */
    private static final Set<String> f34789t = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    /* renamed from: u  reason: collision with root package name */
    private static final String f34790u;

    /* renamed from: v  reason: collision with root package name */
    private static final String f34791v;

    /* renamed from: w  reason: collision with root package name */
    private static final String f34792w;

    /* renamed from: x  reason: collision with root package name */
    static boolean f34793x;

    /* renamed from: y  reason: collision with root package name */
    static boolean f34794y;

    /* renamed from: z  reason: collision with root package name */
    protected static boolean f34795z;

    /* renamed from: a  reason: collision with root package name */
    final g1 f34796a;

    /* renamed from: b  reason: collision with root package name */
    private final Random f34797b = new Random();

    /* renamed from: c  reason: collision with root package name */
    protected volatile b f34798c = d.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<f> f34799d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final String f34800e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f34801f;

    /* renamed from: g  reason: collision with root package name */
    private final int f34802g;

    /* renamed from: h  reason: collision with root package name */
    private final f2.d<Executor> f34803h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final long f34804i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final n1 f34805j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final t f34806k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f34807l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f34808m;

    /* renamed from: n  reason: collision with root package name */
    private Executor f34809n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f34810o;

    /* renamed from: p  reason: collision with root package name */
    private final a1.h f34811p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f34812q;

    /* renamed from: r  reason: collision with root package name */
    private a1.e f34813r;

    /* compiled from: DnsNameResolver */
    public interface b {
        List<InetAddress> a(String str) throws Exception;
    }

    /* compiled from: DnsNameResolver */
    protected static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public j1 f34814a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public List<x> f34815b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public a1.c f34816c;

        /* renamed from: d  reason: collision with root package name */
        public dd.a f34817d;

        private c() {
        }
    }

    /* compiled from: DnsNameResolver */
    private enum d implements b {
        INSTANCE;

        public List<InetAddress> a(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* compiled from: DnsNameResolver */
    private final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final a1.e f34820a;

        /* compiled from: DnsNameResolver */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f34822a;

            a(boolean z10) {
                this.f34822a = z10;
            }

            public void run() {
                if (this.f34822a) {
                    c0 c0Var = c0.this;
                    c0Var.f34807l = true;
                    if (c0Var.f34804i > 0) {
                        c0.this.f34806k.f().g();
                    }
                }
                boolean unused = c0.this.f34812q = false;
            }
        }

        e(a1.e eVar) {
            this.f34820a = (a1.e) o.p(eVar, "savedListener");
        }

        public void run() {
            n1 f10;
            a aVar;
            Logger g10 = c0.f34788s;
            Level level = Level.FINER;
            if (g10.isLoggable(level)) {
                Logger g11 = c0.f34788s;
                g11.finer("Attempting DNS resolution of " + c0.this.f34801f);
            }
            c cVar = null;
            boolean z10 = true;
            try {
                x i10 = c0.this.n();
                a1.g.a d10 = a1.g.d();
                if (i10 != null) {
                    if (c0.f34788s.isLoggable(level)) {
                        Logger g12 = c0.f34788s;
                        g12.finer("Using proxy address " + i10);
                    }
                    d10.b(Collections.singletonList(i10));
                } else {
                    cVar = c0.this.o(false);
                    if (cVar.f34814a != null) {
                        this.f34820a.b(cVar.f34814a);
                        if (cVar == null || cVar.f34814a != null) {
                            z10 = false;
                        }
                        c0.this.f34805j.execute(new a(z10));
                        return;
                    }
                    if (cVar.f34815b != null) {
                        d10.b(cVar.f34815b);
                    }
                    if (cVar.f34816c != null) {
                        d10.d(cVar.f34816c);
                    }
                    dd.a aVar2 = cVar.f34817d;
                    if (aVar2 != null) {
                        d10.c(aVar2);
                    }
                }
                this.f34820a.c(d10.a());
                if (cVar == null || cVar.f34814a != null) {
                    z10 = false;
                }
                f10 = c0.this.f34805j;
                aVar = new a(z10);
            } catch (IOException e10) {
                a1.e eVar = this.f34820a;
                j1 j1Var = j1.f32248u;
                eVar.b(j1Var.q("Unable to resolve host " + c0.this.f34801f).p(e10));
                if (cVar == null || cVar.f34814a != null) {
                    z10 = false;
                }
                f10 = c0.this.f34805j;
                aVar = new a(z10);
            } catch (Throwable th) {
                if (cVar == null || cVar.f34814a != null) {
                    z10 = false;
                }
                c0.this.f34805j.execute(new a(z10));
                throw th;
            }
            f10.execute(aVar);
        }
    }

    /* compiled from: DnsNameResolver */
    public interface f {
        List<String> a(String str) throws Exception;
    }

    /* compiled from: DnsNameResolver */
    interface g {
        f a();

        Throwable b();
    }

    static {
        Class<c0> cls = c0.class;
        f34788s = Logger.getLogger(cls.getName());
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f34790u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f34791v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f34792w = property3;
        f34793x = Boolean.parseBoolean(property);
        f34794y = Boolean.parseBoolean(property2);
        f34795z = Boolean.parseBoolean(property3);
        A = v(cls.getClassLoader());
    }

    protected c0(String str, String str2, a1.b bVar, f2.d<Executor> dVar, t tVar, boolean z10) {
        o.p(bVar, "args");
        this.f34803h = dVar;
        URI create = URI.create("//" + ((String) o.p(str2, MediationMetaData.KEY_NAME)));
        boolean z11 = true;
        o.k(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f34800e = (String) o.q(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f34801f = create.getHost();
        if (create.getPort() == -1) {
            this.f34802g = bVar.a();
        } else {
            this.f34802g = create.getPort();
        }
        this.f34796a = (g1) o.p(bVar.c(), "proxyDetector");
        this.f34804i = s(z10);
        this.f34806k = (t) o.p(tVar, "stopwatch");
        this.f34805j = (n1) o.p(bVar.e(), "syncContext");
        Executor b10 = bVar.b();
        this.f34809n = b10;
        this.f34810o = b10 != null ? false : z11;
        this.f34811p = (a1.h) o.p(bVar.d(), "serviceConfigParser");
    }

    private List<x> A() {
        try {
            List<InetAddress> a10 = this.f34798c.a(this.f34801f);
            ArrayList arrayList = new ArrayList(a10.size());
            for (InetAddress inetSocketAddress : a10) {
                arrayList.add(new x((SocketAddress) new InetSocketAddress(inetSocketAddress, this.f34802g)));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception e10) {
            r6.x.f(e10);
            throw new RuntimeException(e10);
        } catch (Throwable th) {
            if (e10 != null) {
                f34788s.log(Level.FINE, "Address resolution failure", e10);
            }
            throw th;
        }
    }

    private a1.c B() {
        List<String> emptyList = Collections.emptyList();
        f u10 = u();
        if (u10 != null) {
            try {
                emptyList = u10.a("_grpc_config." + this.f34801f);
            } catch (Exception e10) {
                f34788s.log(Level.FINE, "ServiceConfig resolution failure", e10);
            }
        }
        if (!emptyList.isEmpty()) {
            a1.c x10 = x(emptyList, this.f34797b, r());
            if (x10 == null) {
                return null;
            }
            if (x10.d() != null) {
                return a1.c.b(x10.d());
            }
            return this.f34811p.a((Map) x10.c());
        }
        f34788s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f34801f});
        return null;
    }

    protected static boolean C(boolean z10, boolean z11, String str) {
        if (!z10) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z11;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z12 = true;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '.') {
                z12 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z12;
    }

    private boolean m() {
        if (this.f34807l) {
            long j10 = this.f34804i;
            return j10 == 0 || (j10 > 0 && this.f34806k.d(TimeUnit.NANOSECONDS) > this.f34804i);
        }
    }

    /* access modifiers changed from: private */
    public x n() throws IOException {
        f1 a10 = this.f34796a.a(InetSocketAddress.createUnresolved(this.f34801f, this.f34802g));
        if (a10 != null) {
            return new x((SocketAddress) a10);
        }
        return null;
    }

    private static final List<String> p(Map<String, ?> map) {
        return b1.g(map, "clientLanguage");
    }

    private static final List<String> q(Map<String, ?> map) {
        return b1.g(map, "clientHostname");
    }

    private static String r() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return B;
    }

    private static long s(boolean z10) {
        if (z10) {
            return 0;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j10 = 30;
        if (property != null) {
            try {
                j10 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f34788s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
    }

    private static final Double t(Map<String, ?> map) {
        return b1.h(map, "percentage");
    }

    static g v(ClassLoader classLoader) {
        try {
            try {
                try {
                    g gVar = (g) Class.forName("io.grpc.internal.z0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gVar.b() == null) {
                        return gVar;
                    }
                    f34788s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.b());
                    return null;
                } catch (Exception e10) {
                    f34788s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", e10);
                    return null;
                }
            } catch (Exception e11) {
                f34788s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", e11);
                return null;
            }
        } catch (ClassNotFoundException e12) {
            f34788s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", e12);
            return null;
        } catch (ClassCastException e13) {
            f34788s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", e13);
            return null;
        }
    }

    static Map<String, ?> w(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        for (Map.Entry next : map.entrySet()) {
            z.a(f34789t.contains(next.getKey()), "Bad key: %s", next);
        }
        List<String> p10 = p(map);
        if (p10 != null && !p10.isEmpty()) {
            Iterator<String> it = p10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
        }
        Double t10 = t(map);
        if (t10 != null) {
            int intValue = t10.intValue();
            z.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t10);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q10 = q(map);
        if (q10 != null && !q10.isEmpty()) {
            Iterator<String> it2 = q10.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
        }
        Map<String, ?> j10 = b1.j(map, "serviceConfig");
        if (j10 != null) {
            return j10;
        }
        throw new a0(String.format("key '%s' missing in '%s'", new Object[]{map, "serviceConfig"}));
    }

    static a1.c x(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map w10 : y(list)) {
                try {
                    map = w(w10, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    return a1.c.b(j1.f32235h.q("failed to pick service config choice").p(e10));
                }
            }
            if (map == null) {
                return null;
            }
            return a1.c.a(map);
        } catch (IOException | RuntimeException e11) {
            return a1.c.b(j1.f32235h.q("failed to parse TXT records").p(e11));
        }
    }

    static List<Map<String, ?>> y(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!next.startsWith("grpc_config=")) {
                f34788s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{next});
            } else {
                Object a10 = a1.a(next.substring(12));
                if (a10 instanceof List) {
                    arrayList.addAll(b1.a((List) a10));
                } else {
                    throw new ClassCastException("wrong type " + a10);
                }
            }
        }
        return arrayList;
    }

    private void z() {
        if (!this.f34812q && !this.f34808m && m()) {
            this.f34812q = true;
            this.f34809n.execute(new e(this.f34813r));
        }
    }

    public String a() {
        return this.f34800e;
    }

    public void b() {
        o.v(this.f34813r != null, "not started");
        z();
    }

    public void c() {
        if (!this.f34808m) {
            this.f34808m = true;
            Executor executor = this.f34809n;
            if (executor != null && this.f34810o) {
                this.f34809n = (Executor) f2.f(this.f34803h, executor);
            }
        }
    }

    public void d(a1.e eVar) {
        o.v(this.f34813r == null, "already started");
        if (this.f34810o) {
            this.f34809n = (Executor) f2.d(this.f34803h);
        }
        this.f34813r = (a1.e) o.p(eVar, "listener");
        z();
    }

    /* access modifiers changed from: protected */
    public c o(boolean z10) {
        c cVar = new c();
        try {
            List unused = cVar.f34815b = A();
        } catch (Exception e10) {
            if (!z10) {
                j1 j1Var = j1.f32248u;
                j1 unused2 = cVar.f34814a = j1Var.q("Unable to resolve host " + this.f34801f).p(e10);
                return cVar;
            }
        }
        if (f34795z) {
            a1.c unused3 = cVar.f34816c = B();
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r1 = A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.grpc.internal.c0.f u() {
        /*
            r3 = this;
            boolean r0 = f34793x
            boolean r1 = f34794y
            java.lang.String r2 = r3.f34801f
            boolean r0 = C(r0, r1, r2)
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference<io.grpc.internal.c0$f> r0 = r3.f34799d
            java.lang.Object r0 = r0.get()
            io.grpc.internal.c0$f r0 = (io.grpc.internal.c0.f) r0
            if (r0 != 0) goto L_0x0020
            io.grpc.internal.c0$g r1 = A
            if (r1 == 0) goto L_0x0020
            io.grpc.internal.c0$f r0 = r1.a()
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c0.u():io.grpc.internal.c0$f");
    }
}
