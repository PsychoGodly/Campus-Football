package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* compiled from: ApiHelperForOMR1 */
public class f {
    public static void a(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.backToSafety(z10);
    }

    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void c(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.proceed(z10);
    }

    public static void d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.showInterstitial(z10);
    }

    public static void f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
