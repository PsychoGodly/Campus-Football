package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* compiled from: WebResourceRequestAdapter */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final WebResourceRequestBoundaryInterface f4994a;

    public e0(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f4994a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f4994a.isRedirect();
    }
}
