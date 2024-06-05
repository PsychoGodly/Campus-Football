package gd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: Platform */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f32896b = Logger.getLogger(h.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f32897c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    private static final h f32898d = d();

    /* renamed from: a  reason: collision with root package name */
    private final Provider f32899a;

    /* compiled from: Platform */
    class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* compiled from: Platform */
    class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
        }
    }

    /* compiled from: Platform */
    class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* compiled from: Platform */
    private static class d extends h {

        /* renamed from: e  reason: collision with root package name */
        private final g<Socket> f32900e;

        /* renamed from: f  reason: collision with root package name */
        private final g<Socket> f32901f;

        /* renamed from: g  reason: collision with root package name */
        private final Method f32902g;

        /* renamed from: h  reason: collision with root package name */
        private final Method f32903h;

        /* renamed from: i  reason: collision with root package name */
        private final g<Socket> f32904i;

        /* renamed from: j  reason: collision with root package name */
        private final g<Socket> f32905j;

        /* renamed from: k  reason: collision with root package name */
        private final C0374h f32906k;

        public d(g<Socket> gVar, g<Socket> gVar2, Method method, Method method2, g<Socket> gVar3, g<Socket> gVar4, Provider provider, C0374h hVar) {
            super(provider);
            this.f32900e = gVar;
            this.f32901f = gVar2;
            this.f32902g = method;
            this.f32903h = method2;
            this.f32904i = gVar3;
            this.f32905j = gVar4;
            this.f32906k = hVar;
        }

        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f32900e.e(sSLSocket, Boolean.TRUE);
                this.f32901f.e(sSLSocket, str);
            }
            if (this.f32905j.g(sSLSocket)) {
                this.f32905j.f(sSLSocket, h.b(list));
            }
        }

        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f32904i.g(sSLSocket) && (bArr = (byte[]) this.f32904i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f32938b);
            }
            return null;
        }

        public C0374h i() {
            return this.f32906k;
        }
    }

    /* compiled from: Platform */
    private static class e extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f32907e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f32908f;

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i next : list) {
                if (next != i.HTTP_1_0) {
                    arrayList.add(next.toString());
                }
            }
            try {
                this.f32907e.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f32908f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        public C0374h i() {
            return C0374h.ALPN_AND_NPN;
        }

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f32907e = method;
            this.f32908f = method2;
        }
    }

    /* compiled from: Platform */
    private static class f extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f32909e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f32910f;

        /* renamed from: g  reason: collision with root package name */
        private final Method f32911g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<?> f32912h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<?> f32913i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f32909e = method;
            this.f32910f = method2;
            this.f32911g = method3;
            this.f32912h = cls;
            this.f32913i = cls2;
        }

        public void a(SSLSocket sSLSocket) {
            try {
                this.f32911g.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                h.f32896b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", e10);
            }
        }

        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = list.get(i10);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f32912h, this.f32913i}, new g(arrayList));
                this.f32909e.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f32910f.invoke((Object) null, new Object[]{sSLSocket}));
                if (!gVar.f32915b && gVar.f32916c == null) {
                    h.f32896b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (gVar.f32915b) {
                    return null;
                } else {
                    return gVar.f32916c;
                }
            } catch (InvocationTargetException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }

        public C0374h i() {
            return C0374h.ALPN_AND_NPN;
        }
    }

    /* compiled from: Platform */
    private static class g implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f32914a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f32915b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f32916c;

        public g(List<String> list) {
            this.f32914a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f32937a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f32915b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f32914a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f32914a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f32916c = str;
                            return str;
                        }
                    }
                    String str2 = this.f32914a.get(0);
                    this.f32916c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f32916c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: gd.h$h  reason: collision with other inner class name */
    /* compiled from: Platform */
    public enum C0374h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f32899a = provider;
    }

    public static byte[] b(List<i> list) {
        lf.c cVar = new lf.c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            if (iVar != i.HTTP_1_0) {
                cVar.G(iVar.toString().length());
                cVar.T(iVar.toString());
            }
        }
        return cVar.D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static gd.h d() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.security.Provider r8 = f()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L_0x00a3
            gd.g r4 = new gd.g
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r5[r3] = r6
            java.lang.String r6 = "setUseSessionTickets"
            r4.<init>(r2, r6, r5)
            gd.g r5 = new gd.g
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7
            java.lang.String r7 = "setHostname"
            r5.<init>(r2, r7, r6)
            gd.g r6 = new gd.g
            java.lang.Class[] r7 = new java.lang.Class[r3]
            java.lang.String r9 = "getAlpnSelectedProtocol"
            r6.<init>(r0, r9, r7)
            gd.g r7 = new gd.g
            java.lang.Class[] r9 = new java.lang.Class[r1]
            r9[r3] = r0
            java.lang.String r0 = "setAlpnProtocols"
            r7.<init>(r2, r0, r9)
            java.lang.String r0 = "android.net.TrafficStats"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r9 = "tagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.reflect.Method r9 = r0.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r10 = "untagSocket"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r1[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            goto L_0x005a
        L_0x0058:
            r9 = r2
        L_0x0059:
            r0 = r2
        L_0x005a:
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "GmsCore_OpenSSL"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Conscrypt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Ssl_Guard"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007f
            goto L_0x0094
        L_0x007f:
            boolean r1 = k()
            if (r1 == 0) goto L_0x0088
            gd.h$h r1 = gd.h.C0374h.ALPN_AND_NPN
            goto L_0x0096
        L_0x0088:
            boolean r1 = j()
            if (r1 == 0) goto L_0x0091
            gd.h$h r1 = gd.h.C0374h.NPN
            goto L_0x0096
        L_0x0091:
            gd.h$h r1 = gd.h.C0374h.NONE
            goto L_0x0096
        L_0x0094:
            gd.h$h r1 = gd.h.C0374h.ALPN_AND_NPN
        L_0x0096:
            r10 = r1
            gd.h$d r11 = new gd.h$d
            r1 = r11
            r2 = r4
            r3 = r5
            r4 = r9
            r5 = r0
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L_0x00a3:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getDefault()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.security.Provider r0 = r0.getProvider()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.init(r2, r2, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            javax.net.ssl.SSLEngine r4 = r4.createSSLEngine()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            gd.h$a r5 = new gd.h$a     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.invoke(r4, r6)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            gd.h$b r4 = new gd.h$b     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            gd.h$c r5 = new gd.h$c     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            gd.h$e r6 = new gd.h$e     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r6.<init>(r0, r4, r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            return r6
        L_0x00e4:
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = "$Provider"
            r5.append(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r7 = "$ClientProvider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r8 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "$ServerProvider"
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r9 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6[r1] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r5 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r6 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r7 = r4.getMethod(r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            gd.h$f r1 = new gd.h$f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r4 = r1
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            return r1
        L_0x015a:
            gd.h r1 = new gd.h
            r1.<init>(r0)
            return r1
        L_0x0160:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.h.d():gd.h");
    }

    public static h e() {
        return f32898d;
    }

    private static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f32897c) {
                if (str.equals(provider.getClass().getName())) {
                    f32896b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f32896b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f32896b.log(Level.FINE, "Can't find class", e10);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f32896b.log(Level.FINE, "Can't find class", e10);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<i> list) {
    }

    public Provider g() {
        return this.f32899a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public C0374h i() {
        return C0374h.NONE;
    }
}
