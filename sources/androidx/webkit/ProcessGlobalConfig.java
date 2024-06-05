package androidx.webkit;

import android.content.Context;
import androidx.webkit.internal.g;
import androidx.webkit.internal.g0;
import com.applovin.mediation.MaxReward;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

public class ProcessGlobalConfig {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f4974d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f4975e = false;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    String f4976a;

    /* renamed from: b  reason: collision with root package name */
    String f4977b;

    /* renamed from: c  reason: collision with root package name */
    String f4978c;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (f4974d) {
            if (!f4975e) {
                f4975e = true;
            } else {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
        }
        HashMap hashMap = new HashMap();
        if (!d()) {
            if (processGlobalConfig.f4976a != null) {
                if (g0.M.e()) {
                    g.e(processGlobalConfig.f4976a);
                } else {
                    hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.f4976a);
                }
            }
            String str = processGlobalConfig.f4977b;
            if (str != null) {
                hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
            }
            String str2 = processGlobalConfig.f4978c;
            if (str2 != null) {
                hashMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
            }
            if (!sProcessGlobalConfig.compareAndSet((Object) null, hashMap)) {
                throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
            }
            return;
        }
        throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
    }

    private static boolean d() {
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            if (declaredField.get((Object) null) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public ProcessGlobalConfig b(Context context, String str) {
        if (!g0.M.d(context)) {
            throw g0.a();
        } else if (str.equals(MaxReward.DEFAULT_LABEL)) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        } else if (str.indexOf(File.separatorChar) < 0) {
            this.f4976a = str;
            return this;
        } else {
            throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
        }
    }

    public ProcessGlobalConfig c(Context context, File file, File file2) {
        if (!g0.N.d(context)) {
            throw g0.a();
        } else if (!file.isAbsolute()) {
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        } else if (file2.isAbsolute()) {
            this.f4977b = file.getAbsolutePath();
            this.f4978c = file2.getAbsolutePath();
            return this;
        } else {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
    }
}
