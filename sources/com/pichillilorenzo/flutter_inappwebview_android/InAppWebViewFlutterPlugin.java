package com.pichillilorenzo.flutter_inappwebview_android;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager;
import com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager;
import com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager;
import com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import dc.a;
import ec.c;
import io.flutter.plugin.platform.h;
import io.flutter.view.e;
import lc.o;

public class InAppWebViewFlutterPlugin implements a, ec.a {
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public Activity activity;
    public c activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public a.C0360a flutterAssets;
    public e flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewManager inAppWebViewManager;
    public lc.c messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
    public PlatformUtil platformUtil;
    public PrintJobManager printJobManager;
    public ProcessGlobalConfigManager processGlobalConfigManager;
    public ProxyManager proxyManager;
    public o registrar;
    public ServiceWorkerManager serviceWorkerManager;
    public TracingControllerManager tracingControllerManager;
    public WebViewFeatureManager webViewFeatureManager;

    public static void registerWith(o oVar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = new InAppWebViewFlutterPlugin();
        inAppWebViewFlutterPlugin.registrar = oVar;
        inAppWebViewFlutterPlugin.onAttachedToEngine(oVar.d(), oVar.g(), oVar.e(), oVar.h(), oVar.c());
    }

    public void onAttachedToActivity(c cVar) {
        this.activityPluginBinding = cVar;
        Activity activity2 = cVar.getActivity();
        this.activity = activity2;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            activity2.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.flutterAssets = bVar.c();
        onAttachedToEngine(bVar.a(), bVar.b(), this.activity, bVar.e(), (e) null);
    }

    public void onDetachedFromActivity() {
        Activity activity2 = this.activity;
        if (!(activity2 == null || this.noHistoryCustomTabsActivityCallbacks == null)) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        Activity activity2 = this.activity;
        if (!(activity2 == null || this.noHistoryCustomTabsActivityCallbacks == null)) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        PlatformUtil platformUtil2 = this.platformUtil;
        if (platformUtil2 != null) {
            platformUtil2.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager2 = this.inAppBrowserManager;
        if (inAppBrowserManager2 != null) {
            inAppBrowserManager2.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager2 = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager2 != null) {
            headlessInAppWebViewManager2.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager2 = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager2 != null) {
            chromeSafariBrowserManager2.dispose();
            this.chromeSafariBrowserManager = null;
        }
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks2 = this.noHistoryCustomTabsActivityCallbacks;
        if (noHistoryCustomTabsActivityCallbacks2 != null) {
            noHistoryCustomTabsActivityCallbacks2.dispose();
            this.noHistoryCustomTabsActivityCallbacks = null;
        }
        MyCookieManager myCookieManager2 = this.myCookieManager;
        if (myCookieManager2 != null) {
            myCookieManager2.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage2 = this.myWebStorage;
        if (myWebStorage2 != null) {
            myWebStorage2.dispose();
            this.myWebStorage = null;
        }
        CredentialDatabaseHandler credentialDatabaseHandler2 = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler2 != null && Build.VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler2.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewManager inAppWebViewManager2 = this.inAppWebViewManager;
        if (inAppWebViewManager2 != null) {
            inAppWebViewManager2.dispose();
            this.inAppWebViewManager = null;
        }
        ServiceWorkerManager serviceWorkerManager2 = this.serviceWorkerManager;
        if (serviceWorkerManager2 != null && Build.VERSION.SDK_INT >= 24) {
            serviceWorkerManager2.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager2 = this.webViewFeatureManager;
        if (webViewFeatureManager2 != null) {
            webViewFeatureManager2.dispose();
            this.webViewFeatureManager = null;
        }
        ProxyManager proxyManager2 = this.proxyManager;
        if (proxyManager2 != null) {
            proxyManager2.dispose();
            this.proxyManager = null;
        }
        PrintJobManager printJobManager2 = this.printJobManager;
        if (printJobManager2 != null && Build.VERSION.SDK_INT >= 19) {
            printJobManager2.dispose();
            this.printJobManager = null;
        }
        TracingControllerManager tracingControllerManager2 = this.tracingControllerManager;
        if (tracingControllerManager2 != null) {
            tracingControllerManager2.dispose();
            this.tracingControllerManager = null;
        }
        ProcessGlobalConfigManager processGlobalConfigManager2 = this.processGlobalConfigManager;
        if (processGlobalConfigManager2 != null) {
            processGlobalConfigManager2.dispose();
            this.processGlobalConfigManager = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.activityPluginBinding = cVar;
        Activity activity2 = cVar.getActivity();
        this.activity = activity2;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            activity2.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }

    private void onAttachedToEngine(Context context, lc.c cVar, Activity activity2, h hVar, e eVar) {
        this.applicationContext = context;
        this.activity = activity2;
        this.messenger = cVar;
        this.flutterView = eVar;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        this.noHistoryCustomTabsActivityCallbacks = new NoHistoryCustomTabsActivityCallbacks(this);
        FlutterWebViewFactory flutterWebViewFactory2 = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory2;
        hVar.a(FlutterWebViewFactory.VIEW_TYPE_ID, flutterWebViewFactory2);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewManager = new InAppWebViewManager(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            this.serviceWorkerManager = new ServiceWorkerManager(this);
        }
        if (i10 >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
        this.proxyManager = new ProxyManager(this);
        if (i10 >= 19) {
            this.printJobManager = new PrintJobManager(this);
        }
        this.tracingControllerManager = new TracingControllerManager(this);
        this.processGlobalConfigManager = new ProcessGlobalConfigManager(this);
    }
}
