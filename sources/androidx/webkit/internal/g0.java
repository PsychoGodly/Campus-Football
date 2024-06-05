package androidx.webkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.internal.a;
import androidx.webkit.internal.w;
import j1.r;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebViewFeatureInternal */
public class g0 {
    public static final a.b A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final a.b B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final a.d C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final a.b D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final a.b E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final a.b F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final a.b G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final a.e H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final a.e I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final a.h J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final a.h K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final a.g L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final w.b M = new w.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final w.a N = new w.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final a.h O = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final a.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final a.d Q = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final a.d R = new a.d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");
    public static final a.d S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final a.h T = new a.h("FORCE_DARK", "FORCE_DARK");
    public static final a.d U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final a.d V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final a.d W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final a.d X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final a.d Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final a.d Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f4996a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: a0  reason: collision with root package name */
    public static final a.d f4997a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f4998b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: b0  reason: collision with root package name */
    public static final a.d f4999b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: c  reason: collision with root package name */
    public static final a.e f5000c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d  reason: collision with root package name */
    public static final a.c f5001d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e  reason: collision with root package name */
    public static final a.f f5002e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final a.f f5003f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final a.f f5004g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h  reason: collision with root package name */
    public static final a.f f5005h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i  reason: collision with root package name */
    public static final a.f f5006i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j  reason: collision with root package name */
    public static final a.f f5007j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k  reason: collision with root package name */
    public static final a.c f5008k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l  reason: collision with root package name */
    public static final a.c f5009l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m  reason: collision with root package name */
    public static final a.c f5010m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n  reason: collision with root package name */
    public static final a.c f5011n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o  reason: collision with root package name */
    public static final a.c f5012o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p  reason: collision with root package name */
    public static final a.c f5013p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q  reason: collision with root package name */
    public static final a.b f5014q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r  reason: collision with root package name */
    public static final a.b f5015r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s  reason: collision with root package name */
    public static final a.c f5016s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t  reason: collision with root package name */
    public static final a.f f5017t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u  reason: collision with root package name */
    public static final a.c f5018u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v  reason: collision with root package name */
    public static final a.b f5019v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w  reason: collision with root package name */
    public static final a.b f5020w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x  reason: collision with root package name */
    public static final a.f f5021x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y  reason: collision with root package name */
    public static final a.f f5022y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z  reason: collision with root package name */
    public static final a.f f5023z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* compiled from: WebViewFeatureInternal */
    class a extends a.i {

        /* renamed from: d  reason: collision with root package name */
        private final Pattern f5024d = Pattern.compile("\\A\\d+");

        a(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            boolean c10 = super.c();
            if (!c10 || Build.VERSION.SDK_INT >= 29) {
                return c10;
            }
            PackageInfo e10 = r.e();
            if (e10 == null) {
                return false;
            }
            Matcher matcher = this.f5024d.matcher(e10.versionName);
            if (!matcher.find() || Integer.parseInt(e10.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str, Context context) {
        return c(str, w.g(), context);
    }

    public static boolean c(String str, Collection<w> collection, Context context) {
        HashSet<w> hashSet = new HashSet<>();
        for (w next : collection) {
            if (next.b().equals(str)) {
                hashSet.add(next);
            }
        }
        if (!hashSet.isEmpty()) {
            for (w d10 : hashSet) {
                if (d10.d(context)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    public static boolean d(String str) {
        return e(str, a.d());
    }

    public static <T extends k> boolean e(String str, Collection<T> collection) {
        HashSet<k> hashSet = new HashSet<>();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (!hashSet.isEmpty()) {
            for (k isSupported : hashSet) {
                if (isSupported.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
