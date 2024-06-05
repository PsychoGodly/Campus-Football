package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.internal.a;
import j1.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import mf.a;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* compiled from: SafeBrowsingResponseImpl */
public class r extends e {

    /* renamed from: a  reason: collision with root package name */
    private SafeBrowsingResponse f5053a;

    /* renamed from: b  reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f5054b;

    public r(InvocationHandler invocationHandler) {
        this.f5054b = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface d() {
        if (this.f5054b == null) {
            this.f5054b = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, h0.c().c(this.f5053a));
        }
        return this.f5054b;
    }

    private SafeBrowsingResponse e() {
        if (this.f5053a == null) {
            this.f5053a = h0.c().b(Proxy.getInvocationHandler(this.f5054b));
        }
        return this.f5053a;
    }

    public void a(boolean z10) {
        a.f fVar = g0.f5021x;
        if (fVar.b()) {
            f.a(e(), z10);
        } else if (fVar.c()) {
            d().backToSafety(z10);
        } else {
            throw g0.a();
        }
    }

    public void b(boolean z10) {
        a.f fVar = g0.f5022y;
        if (fVar.b()) {
            f.c(e(), z10);
        } else if (fVar.c()) {
            d().proceed(z10);
        } else {
            throw g0.a();
        }
    }

    public void c(boolean z10) {
        a.f fVar = g0.f5023z;
        if (fVar.b()) {
            f.e(e(), z10);
        } else if (fVar.c()) {
            d().showInterstitial(z10);
        } else {
            throw g0.a();
        }
    }

    public r(SafeBrowsingResponse safeBrowsingResponse) {
        this.f5053a = safeBrowsingResponse;
    }
}
