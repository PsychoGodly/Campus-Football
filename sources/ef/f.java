package ef;

import bf.b0;
import bf.d;
import bf.o;
import bf.r;
import cf.c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RouteSelector */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final bf.a f32552a;

    /* renamed from: b  reason: collision with root package name */
    private final d f32553b;

    /* renamed from: c  reason: collision with root package name */
    private final d f32554c;

    /* renamed from: d  reason: collision with root package name */
    private final o f32555d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f32556e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f32557f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f32558g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final List<b0> f32559h = new ArrayList();

    /* compiled from: RouteSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b0> f32560a;

        /* renamed from: b  reason: collision with root package name */
        private int f32561b = 0;

        a(List<b0> list) {
            this.f32560a = list;
        }

        public List<b0> a() {
            return new ArrayList(this.f32560a);
        }

        public boolean b() {
            return this.f32561b < this.f32560a.size();
        }

        public b0 c() {
            if (b()) {
                List<b0> list = this.f32560a;
                int i10 = this.f32561b;
                this.f32561b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public f(bf.a aVar, d dVar, d dVar2, o oVar) {
        this.f32552a = aVar;
        this.f32553b = dVar;
        this.f32554c = dVar2;
        this.f32555d = oVar;
        h(aVar.l(), aVar.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        return this.f32557f < this.f32556e.size();
    }

    private Proxy f() throws IOException {
        if (d()) {
            List<Proxy> list = this.f32556e;
            int i10 = this.f32557f;
            this.f32557f = i10 + 1;
            Proxy proxy = list.get(i10);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f32552a.l().l() + "; exhausted proxy configurations: " + this.f32556e);
    }

    private void g(Proxy proxy) throws IOException {
        String str;
        int i10;
        this.f32558g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f32552a.l().l();
            i10 = this.f32552a.l().w();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = b(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i10 < 1 || i10 > 65535) {
            throw new SocketException("No route to " + str + ":" + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f32558g.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            this.f32555d.j(this.f32554c, str);
            List<InetAddress> a10 = this.f32552a.c().a(str);
            if (!a10.isEmpty()) {
                this.f32555d.i(this.f32554c, str, a10);
                int size = a10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f32558g.add(new InetSocketAddress(a10.get(i11), i10));
                }
                return;
            }
            throw new UnknownHostException(this.f32552a.c() + " returned no addresses for " + str);
        }
    }

    private void h(r rVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f32556e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f32552a.i().select(rVar.C());
            if (select == null || select.isEmpty()) {
                list = c.u(Proxy.NO_PROXY);
            } else {
                list = c.t(select);
            }
            this.f32556e = list;
        }
        this.f32557f = 0;
    }

    public void a(b0 b0Var, IOException iOException) {
        if (!(b0Var.b().type() == Proxy.Type.DIRECT || this.f32552a.i() == null)) {
            this.f32552a.i().connectFailed(this.f32552a.l().C(), b0Var.b().address(), iOException);
        }
        this.f32553b.b(b0Var);
    }

    public boolean c() {
        return d() || !this.f32559h.isEmpty();
    }

    public a e() throws IOException {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f10 = f();
                int size = this.f32558g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b0 b0Var = new b0(this.f32552a, f10, this.f32558g.get(i10));
                    if (this.f32553b.c(b0Var)) {
                        this.f32559h.add(b0Var);
                    } else {
                        arrayList.add(b0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f32559h);
                this.f32559h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
