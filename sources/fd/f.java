package fd;

import com.google.android.gms.common.api.a;
import dd.v0;
import gd.b;
import gd.k;
import io.grpc.internal.c1;
import io.grpc.internal.f2;
import io.grpc.internal.g2;
import io.grpc.internal.h;
import io.grpc.internal.h0;
import io.grpc.internal.h1;
import io.grpc.internal.o2;
import io.grpc.internal.p1;
import io.grpc.internal.r0;
import io.grpc.internal.t;
import io.grpc.internal.v;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import r6.o;

/* compiled from: OkHttpChannelBuilder */
public final class f extends io.grpc.internal.b<f> {

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f32624r = Logger.getLogger(f.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final gd.b f32625s = new b.C0373b(gd.b.f32871f).f(gd.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, gd.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, gd.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, gd.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, gd.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, gd.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(k.TLS_1_2).h(true).e();

    /* renamed from: t  reason: collision with root package name */
    private static final long f32626t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u  reason: collision with root package name */
    private static final f2.d<Executor> f32627u;

    /* renamed from: v  reason: collision with root package name */
    static final p1<Executor> f32628v;

    /* renamed from: w  reason: collision with root package name */
    private static final EnumSet<dd.p1> f32629w = EnumSet.of(dd.p1.MTLS, dd.p1.CUSTOM_MANAGERS);

    /* renamed from: b  reason: collision with root package name */
    private final h1 f32630b;

    /* renamed from: c  reason: collision with root package name */
    private o2.b f32631c = o2.a();

    /* renamed from: d  reason: collision with root package name */
    private p1<Executor> f32632d = f32628v;

    /* renamed from: e  reason: collision with root package name */
    private p1<ScheduledExecutorService> f32633e = g2.c(r0.f35321v);

    /* renamed from: f  reason: collision with root package name */
    private SocketFactory f32634f;

    /* renamed from: g  reason: collision with root package name */
    private SSLSocketFactory f32635g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f32636h;

    /* renamed from: i  reason: collision with root package name */
    private HostnameVerifier f32637i;

    /* renamed from: j  reason: collision with root package name */
    private gd.b f32638j = f32625s;

    /* renamed from: k  reason: collision with root package name */
    private c f32639k = c.TLS;

    /* renamed from: l  reason: collision with root package name */
    private long f32640l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private long f32641m = r0.f35313n;

    /* renamed from: n  reason: collision with root package name */
    private int f32642n = 65535;

    /* renamed from: o  reason: collision with root package name */
    private boolean f32643o;

    /* renamed from: p  reason: collision with root package name */
    private int f32644p = a.e.API_PRIORITY_OTHER;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f32645q = false;

    /* compiled from: OkHttpChannelBuilder */
    class a implements f2.d<Executor> {
        a() {
        }

        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(r0.i("grpc-okhttp-%d", true));
        }
    }

    /* compiled from: OkHttpChannelBuilder */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32646a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f32647b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                fd.f$c[] r0 = fd.f.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32647b = r0
                r1 = 1
                fd.f$c r2 = fd.f.c.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32647b     // Catch:{ NoSuchFieldError -> 0x001d }
                fd.f$c r3 = fd.f.c.TLS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                fd.e[] r2 = fd.e.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32646a = r2
                fd.e r3 = fd.e.TLS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f32646a     // Catch:{ NoSuchFieldError -> 0x0038 }
                fd.e r2 = fd.e.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.f.b.<clinit>():void");
        }
    }

    /* compiled from: OkHttpChannelBuilder */
    private enum c {
        TLS,
        PLAINTEXT
    }

    /* compiled from: OkHttpChannelBuilder */
    private final class d implements h1.b {
        private d() {
        }

        public int a() {
            return f.this.h();
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: OkHttpChannelBuilder */
    private final class e implements h1.c {
        private e() {
        }

        public t a() {
            return f.this.f();
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }
    }

    /* renamed from: fd.f$f  reason: collision with other inner class name */
    /* compiled from: OkHttpChannelBuilder */
    static final class C0369f implements t {

        /* renamed from: a  reason: collision with root package name */
        private final p1<Executor> f32653a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f32654b;

        /* renamed from: c  reason: collision with root package name */
        private final p1<ScheduledExecutorService> f32655c;

        /* renamed from: d  reason: collision with root package name */
        final ScheduledExecutorService f32656d;

        /* renamed from: f  reason: collision with root package name */
        final o2.b f32657f;

        /* renamed from: g  reason: collision with root package name */
        final SocketFactory f32658g;

        /* renamed from: h  reason: collision with root package name */
        final SSLSocketFactory f32659h;

        /* renamed from: i  reason: collision with root package name */
        final HostnameVerifier f32660i;

        /* renamed from: j  reason: collision with root package name */
        final gd.b f32661j;

        /* renamed from: k  reason: collision with root package name */
        final int f32662k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f32663l;

        /* renamed from: m  reason: collision with root package name */
        private final long f32664m;

        /* renamed from: n  reason: collision with root package name */
        private final h f32665n;

        /* renamed from: o  reason: collision with root package name */
        private final long f32666o;

        /* renamed from: p  reason: collision with root package name */
        final int f32667p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f32668q;

        /* renamed from: r  reason: collision with root package name */
        final int f32669r;

        /* renamed from: s  reason: collision with root package name */
        final boolean f32670s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f32671t;

        /* renamed from: fd.f$f$a */
        /* compiled from: OkHttpChannelBuilder */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.b f32672a;

            a(h.b bVar) {
                this.f32672a = bVar;
            }

            public void run() {
                this.f32672a.a();
            }
        }

        /* synthetic */ C0369f(p1 p1Var, p1 p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gd.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, o2.b bVar2, boolean z12, a aVar) {
            this(p1Var, p1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i10, z10, j10, j11, i11, z11, i12, bVar2, z12);
        }

        public ScheduledExecutorService D0() {
            return this.f32656d;
        }

        public v F0(SocketAddress socketAddress, t.a aVar, dd.f fVar) {
            if (!this.f32671t) {
                h.b d10 = this.f32665n.d();
                i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(d10));
                if (this.f32663l) {
                    iVar.T(true, d10.b(), this.f32666o, this.f32668q);
                }
                return iVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        public void close() {
            if (!this.f32671t) {
                this.f32671t = true;
                this.f32653a.b(this.f32654b);
                this.f32655c.b(this.f32656d);
            }
        }

        private C0369f(p1<Executor> p1Var, p1<ScheduledExecutorService> p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gd.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, o2.b bVar2, boolean z12) {
            this.f32653a = p1Var;
            this.f32654b = p1Var.a();
            this.f32655c = p1Var2;
            this.f32656d = p1Var2.a();
            this.f32658g = socketFactory;
            this.f32659h = sSLSocketFactory;
            this.f32660i = hostnameVerifier;
            this.f32661j = bVar;
            this.f32662k = i10;
            this.f32663l = z10;
            this.f32664m = j10;
            this.f32665n = new h("keepalive time nanos", j10);
            this.f32666o = j11;
            this.f32667p = i11;
            this.f32668q = z11;
            this.f32669r = i12;
            this.f32670s = z12;
            this.f32657f = (o2.b) o.p(bVar2, "transportTracerFactory");
        }
    }

    static {
        a aVar = new a();
        f32627u = aVar;
        f32628v = g2.c(aVar);
    }

    private f(String str) {
        this.f32630b = new h1(str, new e(this, (a) null), new d(this, (a) null));
        this.f32636h = false;
    }

    public static f forTarget(String str) {
        return new f(str);
    }

    /* access modifiers changed from: protected */
    public v0<?> e() {
        return this.f32630b;
    }

    /* access modifiers changed from: package-private */
    public C0369f f() {
        C0369f fVar = r2;
        C0369f fVar2 = new C0369f(this.f32632d, this.f32633e, this.f32634f, g(), this.f32637i, this.f32638j, this.f34737a, this.f32640l != Long.MAX_VALUE, this.f32640l, this.f32641m, this.f32642n, this.f32643o, this.f32644p, this.f32631c, false, (a) null);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public SSLSocketFactory g() {
        int i10 = b.f32647b[this.f32639k.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            try {
                if (this.f32635g == null) {
                    this.f32635g = SSLContext.getInstance("Default", gd.h.e().g()).getSocketFactory();
                }
                return this.f32635g;
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException("TLS Provider failure", e10);
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: " + this.f32639k);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        int i10 = b.f32647b[this.f32639k.ordinal()];
        if (i10 == 1) {
            return 80;
        }
        if (i10 == 2) {
            return 443;
        }
        throw new AssertionError(this.f32639k + " not handled");
    }

    /* renamed from: i */
    public f c(long j10, TimeUnit timeUnit) {
        o.e(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f32640l = nanos;
        long l10 = c1.l(nanos);
        this.f32640l = l10;
        if (l10 >= f32626t) {
            this.f32640l = Long.MAX_VALUE;
        }
        return this;
    }

    /* renamed from: j */
    public f d() {
        o.v(!this.f32636h, "Cannot change security when using ChannelCredentials");
        this.f32639k = c.PLAINTEXT;
        return this;
    }

    public f scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f32633e = new h0((ScheduledExecutorService) o.p(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public f sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        o.v(!this.f32636h, "Cannot change security when using ChannelCredentials");
        this.f32635g = sSLSocketFactory;
        this.f32639k = c.TLS;
        return this;
    }

    public f transportExecutor(Executor executor) {
        if (executor == null) {
            this.f32632d = f32628v;
        } else {
            this.f32632d = new h0(executor);
        }
        return this;
    }
}
