package j1;

import android.webkit.CookieManager;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.h0;
import androidx.webkit.internal.l;
import java.util.List;

/* compiled from: CookieManagerCompat */
public class a {
    private static l a(CookieManager cookieManager) {
        return h0.c().a(cookieManager);
    }

    public static List<String> b(CookieManager cookieManager, String str) {
        if (g0.f4997a0.c()) {
            return a(cookieManager).a(str);
        }
        throw g0.a();
    }
}
