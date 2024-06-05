package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* compiled from: ApiHelperForLollipop */
public class b {
    public static Uri a(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
