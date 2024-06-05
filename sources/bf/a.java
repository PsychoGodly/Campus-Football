package bf;

import bf.r;
import cf.c;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final r f31639a;

    /* renamed from: b  reason: collision with root package name */
    final n f31640b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f31641c;

    /* renamed from: d  reason: collision with root package name */
    final b f31642d;

    /* renamed from: e  reason: collision with root package name */
    final List<v> f31643e;

    /* renamed from: f  reason: collision with root package name */
    final List<j> f31644f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f31645g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f31646h;

    /* renamed from: i  reason: collision with root package name */
    final SSLSocketFactory f31647i;

    /* renamed from: j  reason: collision with root package name */
    final HostnameVerifier f31648j;

    /* renamed from: k  reason: collision with root package name */
    final f f31649k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<v> list, List<j> list2, ProxySelector proxySelector) {
        this.f31639a = new r.a().q(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").e(str).l(i10).a();
        Objects.requireNonNull(nVar, "dns == null");
        this.f31640b = nVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f31641c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f31642d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f31643e = c.t(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f31644f = c.t(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f31645g = proxySelector;
        this.f31646h = proxy;
        this.f31647i = sSLSocketFactory;
        this.f31648j = hostnameVerifier;
        this.f31649k = fVar;
    }

    public f a() {
        return this.f31649k;
    }

    public List<j> b() {
        return this.f31644f;
    }

    public n c() {
        return this.f31640b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(a aVar) {
        return this.f31640b.equals(aVar.f31640b) && this.f31642d.equals(aVar.f31642d) && this.f31643e.equals(aVar.f31643e) && this.f31644f.equals(aVar.f31644f) && this.f31645g.equals(aVar.f31645g) && c.q(this.f31646h, aVar.f31646h) && c.q(this.f31647i, aVar.f31647i) && c.q(this.f31648j, aVar.f31648j) && c.q(this.f31649k, aVar.f31649k) && l().w() == aVar.l().w();
    }

    public HostnameVerifier e() {
        return this.f31648j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f31639a.equals(aVar.f31639a) && d(aVar);
        }
    }

    public List<v> f() {
        return this.f31643e;
    }

    public Proxy g() {
        return this.f31646h;
    }

    public b h() {
        return this.f31642d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f31639a.hashCode()) * 31) + this.f31640b.hashCode()) * 31) + this.f31642d.hashCode()) * 31) + this.f31643e.hashCode()) * 31) + this.f31644f.hashCode()) * 31) + this.f31645g.hashCode()) * 31;
        Proxy proxy = this.f31646h;
        int i10 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f31647i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f31648j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f31649k;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return hashCode4 + i10;
    }

    public ProxySelector i() {
        return this.f31645g;
    }

    public SocketFactory j() {
        return this.f31641c;
    }

    public SSLSocketFactory k() {
        return this.f31647i;
    }

    public r l() {
        return this.f31639a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f31639a.l());
        sb2.append(":");
        sb2.append(this.f31639a.w());
        if (this.f31646h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f31646h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f31645g);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
