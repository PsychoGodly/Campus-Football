package io.grpc.internal;

import dd.c;
import dd.f1;
import dd.g1;
import dd.j0;
import dd.j1;
import dd.k;
import dd.m0;
import dd.r0;
import dd.y0;
import dd.z0;
import io.grpc.internal.f2;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;
import r6.s;
import r6.t;
import r6.v;

/* compiled from: GrpcUtil */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f35300a = Logger.getLogger(r0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Set<j1.b> f35301b = Collections.unmodifiableSet(EnumSet.of(j1.b.OK, new j1.b[]{j1.b.INVALID_ARGUMENT, j1.b.NOT_FOUND, j1.b.ALREADY_EXISTS, j1.b.FAILED_PRECONDITION, j1.b.ABORTED, j1.b.OUT_OF_RANGE, j1.b.DATA_LOSS}));

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f35302c = Charset.forName("US-ASCII");

    /* renamed from: d  reason: collision with root package name */
    public static final y0.g<Long> f35303d = y0.g.e("grpc-timeout", new i());

    /* renamed from: e  reason: collision with root package name */
    public static final y0.g<String> f35304e;

    /* renamed from: f  reason: collision with root package name */
    public static final y0.g<byte[]> f35305f = m0.b("grpc-accept-encoding", new g((a) null));

    /* renamed from: g  reason: collision with root package name */
    public static final y0.g<String> f35306g;

    /* renamed from: h  reason: collision with root package name */
    public static final y0.g<byte[]> f35307h = m0.b("accept-encoding", new g((a) null));

    /* renamed from: i  reason: collision with root package name */
    static final y0.g<String> f35308i;

    /* renamed from: j  reason: collision with root package name */
    public static final y0.g<String> f35309j;

    /* renamed from: k  reason: collision with root package name */
    public static final y0.g<String> f35310k;

    /* renamed from: l  reason: collision with root package name */
    public static final y0.g<String> f35311l;

    /* renamed from: m  reason: collision with root package name */
    public static final s f35312m = s.d(',').h();

    /* renamed from: n  reason: collision with root package name */
    public static final long f35313n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f35314o = TimeUnit.HOURS.toNanos(2);

    /* renamed from: p  reason: collision with root package name */
    public static final long f35315p;

    /* renamed from: q  reason: collision with root package name */
    public static final g1 f35316q = new u1();

    /* renamed from: r  reason: collision with root package name */
    public static final g1 f35317r = new a();

    /* renamed from: s  reason: collision with root package name */
    public static final c.C0363c<Boolean> f35318s = c.C0363c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final k f35319t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final f2.d<Executor> f35320u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final f2.d<ScheduledExecutorService> f35321v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final v<t> f35322w = new e();

    /* compiled from: GrpcUtil */
    class a implements g1 {
        a() {
        }

        public f1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* compiled from: GrpcUtil */
    class b extends k {
        b() {
        }
    }

    /* compiled from: GrpcUtil */
    class c implements f2.d<Executor> {
        c() {
        }

        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(r0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* compiled from: GrpcUtil */
    class d implements f2.d<ScheduledExecutorService> {
        d() {
        }

        /* renamed from: c */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        /* renamed from: d */
        public ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, r0.i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* compiled from: GrpcUtil */
    class e implements v<t> {
        e() {
        }

        /* renamed from: a */
        public t get() {
            return t.c();
        }
    }

    /* compiled from: GrpcUtil */
    class f implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.a f35323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f35324b;

        f(k.a aVar, s sVar) {
            this.f35323a = aVar;
            this.f35324b = sVar;
        }

        public q c(z0<?, ?> z0Var, y0 y0Var, dd.c cVar, k[] kVarArr) {
            k a10 = this.f35323a.a(k.b.a().b(cVar).a(), y0Var);
            o.v(kVarArr[kVarArr.length - 1] == r0.f35319t, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a10;
            return this.f35324b.c(z0Var, y0Var, cVar, kVarArr);
        }

        public j0 g() {
            return this.f35324b.g();
        }
    }

    /* compiled from: GrpcUtil */
    private static final class g implements m0.a<byte[]> {
        private g() {
        }

        /* renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        /* renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* compiled from: GrpcUtil */
    public enum h {
        NO_ERROR(0, r1),
        PROTOCOL_ERROR(1, r4),
        INTERNAL_ERROR(2, r4),
        FLOW_CONTROL_ERROR(3, r4),
        SETTINGS_TIMEOUT(4, r4),
        STREAM_CLOSED(5, r4),
        FRAME_SIZE_ERROR(6, r4),
        REFUSED_STREAM(7, r1),
        CANCEL(8, j1.f32234g),
        COMPRESSION_ERROR(9, r4),
        CONNECT_ERROR(10, r4),
        ENHANCE_YOUR_CALM(11, j1.f32242o.q("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, j1.f32240m.q("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, j1.f32235h);
        

        /* renamed from: r  reason: collision with root package name */
        private static final h[] f35339r = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f35341a;

        /* renamed from: b  reason: collision with root package name */
        private final j1 f35342b;

        static {
            f35339r = a();
        }

        private h(int i10, j1 j1Var) {
            this.f35341a = i10;
            String str = "HTTP/2 error code: " + name();
            if (j1Var.n() != null) {
                str = str + " (" + j1Var.n() + ")";
            }
            this.f35342b = j1Var.q(str);
        }

        private static h[] a() {
            h[] values = values();
            h[] hVarArr = new h[(((int) values[values.length - 1].c()) + 1)];
            for (h hVar : values) {
                hVarArr[(int) hVar.c()] = hVar;
            }
            return hVarArr;
        }

        public static h d(long j10) {
            h[] hVarArr = f35339r;
            if (j10 >= ((long) hVarArr.length) || j10 < 0) {
                return null;
            }
            return hVarArr[(int) j10];
        }

        public static j1 f(long j10) {
            h d10 = d(j10);
            if (d10 != null) {
                return d10.e();
            }
            j1 h10 = j1.h(INTERNAL_ERROR.e().m().d());
            return h10.q("Unrecognized HTTP/2 error code: " + j10);
        }

        public long c() {
            return (long) this.f35341a;
        }

        public j1 e() {
            return this.f35342b;
        }
    }

    /* compiled from: GrpcUtil */
    static class i implements y0.d<Long> {
        i() {
        }

        /* renamed from: c */
        public Long b(String str) {
            o.e(str.length() > 0, "empty timeout");
            o.e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
        }

        /* renamed from: d */
        public String a(Long l10) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            } else if (l10.longValue() < 100000000) {
                return l10 + "n";
            } else if (l10.longValue() < 100000000000L) {
                return timeUnit.toMicros(l10.longValue()) + "u";
            } else if (l10.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l10.longValue()) + "m";
            } else if (l10.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l10.longValue()) + "S";
            } else if (l10.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l10.longValue()) + "M";
            } else {
                return timeUnit.toHours(l10.longValue()) + "H";
            }
        }
    }

    static {
        y0.d<String> dVar = y0.f32388e;
        f35304e = y0.g.e("grpc-encoding", dVar);
        f35306g = y0.g.e("content-encoding", dVar);
        f35308i = y0.g.e("content-length", dVar);
        f35309j = y0.g.e("content-type", dVar);
        f35310k = y0.g.e("te", dVar);
        f35311l = y0.g.e("user-agent", dVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f35313n = timeUnit.toNanos(20);
        f35315p = timeUnit.toNanos(20);
    }

    private r0() {
    }

    public static URI b(String str) {
        o.p(str, "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: " + str, e10);
        }
    }

    public static String c(String str) {
        URI b10 = b(str);
        boolean z10 = true;
        o.k(b10.getHost() != null, "No host in authority '%s'", str);
        if (b10.getUserInfo() != null) {
            z10 = false;
        }
        o.k(z10, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    static void d(k2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                e(next);
            } else {
                return;
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                f35300a.log(Level.WARNING, "exception caught in closeQuietly", e10);
            }
        }
    }

    public static k[] f(dd.c cVar, y0 y0Var, int i10, boolean z10) {
        List<k.a> i11 = cVar.i();
        int size = i11.size() + 1;
        k[] kVarArr = new k[size];
        k.b a10 = k.b.a().b(cVar).d(i10).c(z10).a();
        for (int i12 = 0; i12 < i11.size(); i12++) {
            kVarArr[i12] = i11.get(i12).a(a10, y0Var);
        }
        kVarArr[size - 1] = f35319t;
        return kVarArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append(str);
        sb2.append('/');
        sb2.append("1.52.1");
        return sb2.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z10) {
        return new w6.i().e(z10).f(str).b();
    }

    static s j(r0.e eVar, boolean z10) {
        r0.h c10 = eVar.c();
        s a10 = c10 != null ? ((n2) c10.d()).a() : null;
        if (a10 != null) {
            k.a b10 = eVar.b();
            if (b10 == null) {
                return a10;
            }
            return new f(b10, a10);
        }
        if (!eVar.a().o()) {
            if (eVar.d()) {
                return new g0(n(eVar.a()), r.a.DROPPED);
            }
            if (!z10) {
                return new g0(n(eVar.a()), r.a.PROCESSED);
            }
        }
        return null;
    }

    private static j1.b k(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return j1.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 == 401) {
                return j1.b.UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return j1.b.PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return j1.b.UNIMPLEMENTED;
            }
            if (i10 != 429) {
                if (i10 != 431) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return j1.b.UNKNOWN;
                    }
                }
            }
            return j1.b.UNAVAILABLE;
        }
        return j1.b.INTERNAL;
    }

    public static j1 l(int i10) {
        j1 c10 = k(i10).c();
        return c10.q("HTTP status code " + i10);
    }

    public static boolean m(String str) {
        char charAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    public static j1 n(j1 j1Var) {
        o.d(j1Var != null);
        if (!f35301b.contains(j1Var.m())) {
            return j1Var;
        }
        j1 j1Var2 = j1.f32247t;
        return j1Var2.q("Inappropriate status code from control plane: " + j1Var.m() + " " + j1Var.n()).p(j1Var.l());
    }

    public static boolean o(dd.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f35318s));
    }
}
