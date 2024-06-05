package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.a;
import j1.g;
import j1.h;
import j1.i;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* compiled from: ServiceWorkerControllerImpl */
public class u extends h {

    /* renamed from: a  reason: collision with root package name */
    private ServiceWorkerController f5057a;

    /* renamed from: b  reason: collision with root package name */
    private ServiceWorkerControllerBoundaryInterface f5058b;

    /* renamed from: c  reason: collision with root package name */
    private final i f5059c;

    public u() {
        a.c cVar = g0.f5008k;
        if (cVar.b()) {
            this.f5057a = d.g();
            this.f5058b = null;
            this.f5059c = d.i(e());
        } else if (cVar.c()) {
            this.f5057a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = h0.d().getServiceWorkerController();
            this.f5058b = serviceWorkerController;
            this.f5059c = new v(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw g0.a();
        }
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.f5058b == null) {
            this.f5058b = h0.d().getServiceWorkerController();
        }
        return this.f5058b;
    }

    private ServiceWorkerController e() {
        if (this.f5057a == null) {
            this.f5057a = d.g();
        }
        return this.f5057a;
    }

    public i b() {
        return this.f5059c;
    }

    public void c(g gVar) {
        a.c cVar = g0.f5008k;
        if (cVar.b()) {
            if (gVar == null) {
                d.p(e(), (ServiceWorkerClient) null);
            } else {
                d.q(e(), gVar);
            }
        } else if (!cVar.c()) {
            throw g0.a();
        } else if (gVar == null) {
            d().setServiceWorkerClient((InvocationHandler) null);
        } else {
            d().setServiceWorkerClient(mf.a.c(new t(gVar)));
        }
    }
}
