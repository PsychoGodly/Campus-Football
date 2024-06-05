package dd;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import r6.i;
import r6.k;
import r6.o;

/* compiled from: HttpConnectProxiedSocketAddress */
public final class c0 extends f1 {

    /* renamed from: a  reason: collision with root package name */
    private final SocketAddress f32167a;

    /* renamed from: b  reason: collision with root package name */
    private final InetSocketAddress f32168b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32169c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32170d;

    /* compiled from: HttpConnectProxiedSocketAddress */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private SocketAddress f32171a;

        /* renamed from: b  reason: collision with root package name */
        private InetSocketAddress f32172b;

        /* renamed from: c  reason: collision with root package name */
        private String f32173c;

        /* renamed from: d  reason: collision with root package name */
        private String f32174d;

        public c0 a() {
            return new c0(this.f32171a, this.f32172b, this.f32173c, this.f32174d);
        }

        public b b(String str) {
            this.f32174d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f32171a = (SocketAddress) o.p(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f32172b = (InetSocketAddress) o.p(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f32173c = str;
            return this;
        }

        private b() {
        }
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f32170d;
    }

    public SocketAddress b() {
        return this.f32167a;
    }

    public InetSocketAddress c() {
        return this.f32168b;
    }

    public String d() {
        return this.f32169c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!k.a(this.f32167a, c0Var.f32167a) || !k.a(this.f32168b, c0Var.f32168b) || !k.a(this.f32169c, c0Var.f32169c) || !k.a(this.f32170d, c0Var.f32170d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f32167a, this.f32168b, this.f32169c, this.f32170d);
    }

    public String toString() {
        return i.c(this).d("proxyAddr", this.f32167a).d("targetAddr", this.f32168b).d("username", this.f32169c).e("hasPassword", this.f32170d != null).toString();
    }

    private c0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        o.p(socketAddress, "proxyAddress");
        o.p(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            o.x(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f32167a = socketAddress;
        this.f32168b = inetSocketAddress;
        this.f32169c = str;
        this.f32170d = str2;
    }
}
