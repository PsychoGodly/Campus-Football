package p002if;

import bf.v;
import cf.c;
import com.applovin.mediation.MaxReward;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: if.d  reason: invalid package */
/* compiled from: Jdk9Platform */
final class d extends g {

    /* renamed from: c  reason: collision with root package name */
    final Method f33349c;

    /* renamed from: d  reason: collision with root package name */
    final Method f33350d;

    d(Method method, Method method2) {
        this.f33349c = method;
        this.f33350d = method2;
    }

    public static d u() {
        try {
            return new d(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b10 = g.b(list);
            this.f33349c.invoke(sSLParameters, new Object[]{b10.toArray(new String[b10.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.b("unable to set ssl parameters", e10);
        }
    }

    public String n(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f33350d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals(MaxReward.DEFAULT_LABEL)) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw c.b("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw c.b("failed to get ALPN selected protocol", e11);
        }
    }
}
