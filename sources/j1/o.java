package j1;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.a;
import androidx.webkit.internal.d;
import androidx.webkit.internal.e0;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.h0;

/* compiled from: WebResourceRequestCompat */
public class o {
    private static e0 a(WebResourceRequest webResourceRequest) {
        return h0.c().k(webResourceRequest);
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        a.c cVar = g0.f5018u;
        if (cVar.b()) {
            return d.j(webResourceRequest);
        }
        if (cVar.c()) {
            return a(webResourceRequest).a();
        }
        throw g0.a();
    }
}
