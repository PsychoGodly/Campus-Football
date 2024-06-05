package io.grpc.internal;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.network.model.HttpRequest;
import dd.c0;
import dd.f1;
import dd.g1;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.v;

/* compiled from: ProxyDetectorImpl */
class u1 implements g1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f35407d = Logger.getLogger(u1.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final c f35408e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final v<ProxySelector> f35409f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final v<ProxySelector> f35410a;

    /* renamed from: b  reason: collision with root package name */
    private final c f35411b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f35412c;

    /* compiled from: ProxyDetectorImpl */
    class a implements c {
        a() {
        }

        public PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, MaxReward.DEFAULT_LABEL);
            } catch (MalformedURLException unused) {
                u1.f35407d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* compiled from: ProxyDetectorImpl */
    class b implements v<ProxySelector> {
        b() {
        }

        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* compiled from: ProxyDetectorImpl */
    interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public u1() {
        this(f35409f, f35408e, System.getenv("GRPC_PROXY_EXP"));
    }

    private f1 c(InetSocketAddress inetSocketAddress) throws IOException {
        String str = null;
        try {
            try {
                URI uri = new URI(HttpRequest.DEFAULT_SCHEME, (String) null, r0.h(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = this.f35410a.get();
                if (proxySelector == null) {
                    f35407d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f35407d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a10 = this.f35411b.a(r0.h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), HttpRequest.DEFAULT_SCHEME, MaxReward.DEFAULT_LABEL, (String) null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                c0.b c10 = c0.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (a10 == null) {
                    return c10.a();
                }
                c0.b e10 = c10.e(a10.getUserName());
                if (a10.getPassword() != null) {
                    str = new String(a10.getPassword());
                }
                return e10.b(str).a();
            } catch (URISyntaxException e11) {
                f35407d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", e11);
                return null;
            }
        } catch (Throwable th) {
            f35407d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int i10 = 80;
        if (split.length > 1) {
            i10 = Integer.parseInt(split[1]);
        }
        f35407d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], i10);
    }

    public f1 a(SocketAddress socketAddress) throws IOException {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.f35412c != null) {
            return c0.e().c(this.f35412c).d((InetSocketAddress) socketAddress).a();
        }
        return c((InetSocketAddress) socketAddress);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r6.v<java.net.ProxySelector>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    u1(r6.v<java.net.ProxySelector> r1, io.grpc.internal.u1.c r2, java.lang.String r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = r6.o.o(r1)
            r6.v r1 = (r6.v) r1
            r0.f35410a = r1
            java.lang.Object r1 = r6.o.o(r2)
            io.grpc.internal.u1$c r1 = (io.grpc.internal.u1.c) r1
            r0.f35411b = r1
            if (r3 == 0) goto L_0x001c
            java.net.InetSocketAddress r1 = d(r3)
            r0.f35412c = r1
            goto L_0x001f
        L_0x001c:
            r1 = 0
            r0.f35412c = r1
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.u1.<init>(r6.v, io.grpc.internal.u1$c, java.lang.String):void");
    }
}
