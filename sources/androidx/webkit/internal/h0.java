package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator */
public class h0 {

    /* compiled from: WebViewGlueCommunicator */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final o0 f5025a = new o0(h0.d().getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final j0 f5026a = h0.a();
    }

    static j0 a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new n();
        }
        try {
            return new k0((WebViewProviderFactoryBoundaryInterface) mf.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        } catch (ClassNotFoundException unused) {
            return new n();
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static o0 c() {
        return a.f5025a;
    }

    public static j0 d() {
        return b.f5026a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.b();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        }
    }
}
