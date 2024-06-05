package p002if;

import android.os.Build;
import android.util.Log;
import bf.v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kf.e;

/* renamed from: if.b  reason: invalid package */
/* compiled from: AndroidPlatform */
class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f33336c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Socket> f33337d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Socket> f33338e;

    /* renamed from: f  reason: collision with root package name */
    private final f<Socket> f33339f;

    /* renamed from: g  reason: collision with root package name */
    private final f<Socket> f33340g;

    /* renamed from: h  reason: collision with root package name */
    private final c f33341h = c.b();

    /* renamed from: if.b$a */
    /* compiled from: AndroidPlatform */
    static final class a extends kf.c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f33342a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f33343b;

        a(Object obj, Method method) {
            this.f33342a = obj;
            this.f33343b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f33343b.invoke(this.f33342a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: if.b$b  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform */
    static final class C0379b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f33344a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f33345b;

        C0379b(X509TrustManager x509TrustManager, Method method) {
            this.f33345b = method;
            this.f33344a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f33345b.invoke(this.f33344a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw cf.c.b("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0379b)) {
                return false;
            }
            C0379b bVar = (C0379b) obj;
            if (!this.f33344a.equals(bVar.f33344a) || !this.f33345b.equals(bVar.f33345b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f33344a.hashCode() + (this.f33345b.hashCode() * 31);
        }
    }

    /* renamed from: if.b$c */
    /* compiled from: AndroidPlatform */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Method f33346a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f33347b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f33348c;

        c(Method method, Method method2, Method method3) {
            this.f33346a = method;
            this.f33347b = method2;
            this.f33348c = method3;
        }

        static c b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public Object a(String str) {
            Method method = this.f33346a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f33347b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f33348c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        this.f33336c = cls;
        this.f33337d = fVar;
        this.f33338e = fVar2;
        this.f33339f = fVar3;
        this.f33340g = fVar4;
    }

    private boolean u(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.q(str);
        }
    }

    private boolean v(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return u(str, cls, obj);
        }
    }

    public static g w() {
        Class<?> cls;
        f fVar;
        f fVar2;
        Class<byte[]> cls2 = byte[].class;
        if (!g.p()) {
            return null;
        }
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        f fVar3 = new f((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        f fVar4 = new f((Class<?>) null, "setHostname", String.class);
        if (y()) {
            f fVar5 = new f(cls2, "getAlpnSelectedProtocol", new Class[0]);
            fVar = new f((Class<?>) null, "setAlpnProtocols", cls2);
            fVar2 = fVar5;
        } else {
            fVar2 = null;
            fVar = null;
        }
        return new b(cls3, fVar3, fVar4, fVar2, fVar);
    }

    static int x() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean y() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public kf.c c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    public e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C0379b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) throws IOException {
        if (str != null) {
            this.f33337d.e(sSLSocket, Boolean.TRUE);
            this.f33338e.e(sSLSocket, str);
        }
        f<Socket> fVar = this.f33340g;
        if (fVar != null && fVar.g(sSLSocket)) {
            this.f33340g.f(sSLSocket, g.e(list));
        }
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (cf.c.A(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        } catch (SecurityException e11) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e11);
            throw iOException;
        } catch (ClassCastException e12) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e12);
                throw iOException2;
            }
            throw e12;
        }
    }

    public SSLContext m() {
        boolean z10 = true;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 16 || i10 >= 22) {
                z10 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z10) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    public String n(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f33339f;
        if (fVar == null || !fVar.g(sSLSocket) || (bArr = (byte[]) this.f33339f.f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, cf.c.f31992j);
    }

    public Object o(String str) {
        return this.f33341h.a(str);
    }

    public boolean q(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.q(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return v(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.q(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            throw cf.c.b("unable to determine cleartext support", e10);
        }
    }

    public void s(int i10, String str, Throwable th) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    public void t(String str, Object obj) {
        if (!this.f33341h.c(obj)) {
            s(5, str, (Throwable) null);
        }
    }
}
