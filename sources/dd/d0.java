package dd;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import r6.o;

/* compiled from: InternalChannelz */
public final class d0 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f32182f = Logger.getLogger(d0.class.getName());

    /* renamed from: g  reason: collision with root package name */
    private static final d0 f32183g = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, i0<Object>> f32184a = new ConcurrentSkipListMap();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, i0<Object>> f32185b = new ConcurrentSkipListMap();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Long, i0<Object>> f32186c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentMap<Long, i0<Object>> f32187d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentMap<Long, Object> f32188e = new ConcurrentHashMap();

    /* compiled from: InternalChannelz */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f32189a;

        public b(c cVar) {
            this.f32189a = (c) o.o(cVar);
        }
    }

    /* compiled from: InternalChannelz */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f32190a;

        /* renamed from: b  reason: collision with root package name */
        public final Certificate f32191b;

        /* renamed from: c  reason: collision with root package name */
        public final Certificate f32192c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                d0.f32182f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[]{sSLSession.getPeerHost()}), e10);
            }
            this.f32190a = cipherSuite;
            this.f32191b = certificate2;
            this.f32192c = certificate;
        }
    }

    private static <T extends i0<?>> void b(Map<Long, T> map, T t10) {
        i0 i0Var = (i0) map.put(Long.valueOf(t10.g().d()), t10);
    }

    public static long f(p0 p0Var) {
        return p0Var.g().d();
    }

    public static d0 g() {
        return f32183g;
    }

    private static <T extends i0<?>> void h(Map<Long, T> map, T t10) {
        i0 i0Var = (i0) map.remove(Long.valueOf(f(t10)));
    }

    public void c(i0<Object> i0Var) {
        b(this.f32187d, i0Var);
    }

    public void d(i0<Object> i0Var) {
        b(this.f32185b, i0Var);
    }

    public void e(i0<Object> i0Var) {
        b(this.f32186c, i0Var);
    }

    public void i(i0<Object> i0Var) {
        h(this.f32187d, i0Var);
    }

    public void j(i0<Object> i0Var) {
        h(this.f32185b, i0Var);
    }

    public void k(i0<Object> i0Var) {
        h(this.f32186c, i0Var);
    }
}
