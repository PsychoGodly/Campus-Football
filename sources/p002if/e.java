package p002if;

import bf.v;
import cf.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: if.e  reason: invalid package */
/* compiled from: JdkWithJettyBootPlatform */
class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final Method f33351c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f33352d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f33353e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f33354f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f33355g;

    /* renamed from: if.e$a */
    /* compiled from: JdkWithJettyBootPlatform */
    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f33356a;

        /* renamed from: b  reason: collision with root package name */
        boolean f33357b;

        /* renamed from: c  reason: collision with root package name */
        String f33358c;

        a(List<String> list) {
            this.f33356a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c.f31984b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f33357b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f33356a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f33356a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f33358c = str;
                            return str;
                        }
                    }
                    String str2 = this.f33356a.get(0);
                    this.f33358c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f33358c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f33351c = method;
        this.f33352d = method2;
        this.f33353e = method3;
        this.f33354f = cls;
        this.f33355g = cls2;
    }

    public static g u() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new e(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f33353e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.b("unable to remove alpn", e10);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) {
        List<String> b10 = g.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f33354f, this.f33355g}, new a(b10));
            this.f33351c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.b("unable to set alpn", e10);
        }
    }

    public String n(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f33352d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z10 = aVar.f33357b;
            if (!z10 && aVar.f33358c == null) {
                g.l().s(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z10) {
                return null;
            } else {
                return aVar.f33358c;
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.b("unable to get selected protocol", e10);
        }
    }
}
