package j1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.webkit.internal.j;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WebViewAssetLoader */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f19215a;

    /* compiled from: WebViewAssetLoader */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private j f19216a;

        public a(Context context) {
            this.f19216a = new j(context);
        }

        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(j.f(str), (String) null, this.f19216a.h(str));
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }
    }

    /* compiled from: WebViewAssetLoader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f19217a;

        /* renamed from: b  reason: collision with root package name */
        private String f19218b = "appassets.androidplatform.net";

        /* renamed from: c  reason: collision with root package name */
        private final List<androidx.core.util.d<String, d>> f19219c = new ArrayList();

        public b a(String str, d dVar) {
            this.f19219c.add(androidx.core.util.d.a(str, dVar));
            return this;
        }

        public q b() {
            ArrayList arrayList = new ArrayList();
            for (androidx.core.util.d next : this.f19219c) {
                arrayList.add(new e(this.f19218b, (String) next.f3080a, this.f19217a, (d) next.f3081b));
            }
            return new q(arrayList);
        }

        public b c(String str) {
            this.f19218b = str;
            return this;
        }

        public b d(boolean z10) {
            this.f19217a = z10;
            return this;
        }
    }

    /* compiled from: WebViewAssetLoader */
    public static final class c implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f19220b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a  reason: collision with root package name */
        private final File f19221a;

        public c(Context context, File file) {
            try {
                this.f19221a = new File(j.a(file));
                if (!a(context)) {
                    throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
                }
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        private boolean a(Context context) throws IOException {
            String a10 = j.a(this.f19221a);
            String a11 = j.a(context.getCacheDir());
            String a12 = j.a(j.c(context));
            if ((!a10.startsWith(a11) && !a10.startsWith(a12)) || a10.equals(a11) || a10.equals(a12)) {
                return false;
            }
            for (String str : f19220b) {
                if (a10.startsWith(a12 + str)) {
                    return false;
                }
            }
            return true;
        }

        public WebResourceResponse handle(String str) {
            try {
                File b10 = j.b(this.f19221a, str);
                if (b10 != null) {
                    return new WebResourceResponse(j.f(str), (String) null, j.i(b10));
                }
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", new Object[]{str, this.f19221a}));
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
        }
    }

    /* compiled from: WebViewAssetLoader */
    public interface d {
        WebResourceResponse handle(String str);
    }

    /* compiled from: WebViewAssetLoader */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        final boolean f19222a;

        /* renamed from: b  reason: collision with root package name */
        final String f19223b;

        /* renamed from: c  reason: collision with root package name */
        final String f19224c;

        /* renamed from: d  reason: collision with root package name */
        final d f19225d;

        e(String str, String str2, boolean z10, d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                this.f19223b = str;
                this.f19224c = str2;
                this.f19222a = z10;
                this.f19225d = dVar;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        public String a(String str) {
            return str.replaceFirst(this.f19224c, MaxReward.DEFAULT_LABEL);
        }

        public d b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f19222a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(this.f19223b) && uri.getPath().startsWith(this.f19224c)) {
                return this.f19225d;
            }
            return null;
        }
    }

    /* compiled from: WebViewAssetLoader */
    public static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private j f19226a;

        public f(Context context) {
            this.f19226a = new j(context);
        }

        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(j.f(str), (String) null, this.f19226a.j(str));
            } catch (Resources.NotFoundException e10) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e10);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException e11) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e11);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }
    }

    q(List<e> list) {
        this.f19215a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        for (e next : this.f19215a) {
            d b10 = next.b(uri);
            if (b10 != null && (handle = b10.handle(next.a(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }
}
