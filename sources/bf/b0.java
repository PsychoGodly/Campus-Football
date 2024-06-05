package bf;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* compiled from: Route */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    final a f31654a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f31655b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f31656c;

    public b0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f31654a = aVar;
        this.f31655b = proxy;
        this.f31656c = inetSocketAddress;
    }

    public a a() {
        return this.f31654a;
    }

    public Proxy b() {
        return this.f31655b;
    }

    public boolean c() {
        return this.f31654a.f31647i != null && this.f31655b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f31656c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return b0Var.f31654a.equals(this.f31654a) && b0Var.f31655b.equals(this.f31655b) && b0Var.f31656c.equals(this.f31656c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f31654a.hashCode()) * 31) + this.f31655b.hashCode()) * 31) + this.f31656c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f31656c + "}";
    }
}
