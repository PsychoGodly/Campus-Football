package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* compiled from: CookieManagerAdapter */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final WebViewCookieManagerBoundaryInterface f5030a;

    public l(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f5030a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> a(String str) {
        return this.f5030a.getCookieInfo(str);
    }
}
