package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.internal.a;
import j1.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import mf.a;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* compiled from: ServiceWorkerWebSettingsImpl */
public class v extends i {

    /* renamed from: a  reason: collision with root package name */
    private ServiceWorkerWebSettings f5060a;

    /* renamed from: b  reason: collision with root package name */
    private ServiceWorkerWebSettingsBoundaryInterface f5061b;

    public v(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f5060a = serviceWorkerWebSettings;
    }

    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.f5061b == null) {
            this.f5061b = (ServiceWorkerWebSettingsBoundaryInterface) a.a(ServiceWorkerWebSettingsBoundaryInterface.class, h0.c().e(this.f5060a));
        }
        return this.f5061b;
    }

    private ServiceWorkerWebSettings j() {
        if (this.f5060a == null) {
            this.f5060a = h0.c().d(Proxy.getInvocationHandler(this.f5061b));
        }
        return this.f5060a;
    }

    public boolean a() {
        a.c cVar = g0.f5010m;
        if (cVar.b()) {
            return d.a(j());
        }
        if (cVar.c()) {
            return i().getAllowContentAccess();
        }
        throw g0.a();
    }

    public boolean b() {
        a.c cVar = g0.f5011n;
        if (cVar.b()) {
            return d.b(j());
        }
        if (cVar.c()) {
            return i().getAllowFileAccess();
        }
        throw g0.a();
    }

    public boolean c() {
        a.c cVar = g0.f5012o;
        if (cVar.b()) {
            return d.c(j());
        }
        if (cVar.c()) {
            return i().getBlockNetworkLoads();
        }
        throw g0.a();
    }

    public int d() {
        a.c cVar = g0.f5009l;
        if (cVar.b()) {
            return d.d(j());
        }
        if (cVar.c()) {
            return i().getCacheMode();
        }
        throw g0.a();
    }

    public void e(boolean z10) {
        a.c cVar = g0.f5010m;
        if (cVar.b()) {
            d.k(j(), z10);
        } else if (cVar.c()) {
            i().setAllowContentAccess(z10);
        } else {
            throw g0.a();
        }
    }

    public void f(boolean z10) {
        a.c cVar = g0.f5011n;
        if (cVar.b()) {
            d.l(j(), z10);
        } else if (cVar.c()) {
            i().setAllowFileAccess(z10);
        } else {
            throw g0.a();
        }
    }

    public void g(boolean z10) {
        a.c cVar = g0.f5012o;
        if (cVar.b()) {
            d.m(j(), z10);
        } else if (cVar.c()) {
            i().setBlockNetworkLoads(z10);
        } else {
            throw g0.a();
        }
    }

    public void h(int i10) {
        a.c cVar = g0.f5009l;
        if (cVar.b()) {
            d.n(j(), i10);
        } else if (cVar.c()) {
            i().setCacheMode(i10);
        } else {
            throw g0.a();
        }
    }

    public v(InvocationHandler invocationHandler) {
        this.f5061b = (ServiceWorkerWebSettingsBoundaryInterface) mf.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
