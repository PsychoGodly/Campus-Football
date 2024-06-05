package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import j1.g;
import j1.h;
import j1.s;
import java.io.ByteArrayInputStream;
import java.util.Map;
import lc.k;

public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static h serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    private static final class DummyServiceWorkerClientCompat extends g {
        static final g INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    private g dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && s.a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = h.a();
        }
    }

    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        h hVar = serviceWorkerController;
        if (hVar != null) {
            hVar.c(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new g() {
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt webResourceResponseExt;
                    WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            webResourceResponseExt = serviceWorkerChannelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                        } catch (InterruptedException e10) {
                            Log.e(ServiceWorkerManager.LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
                            return null;
                        }
                    } else {
                        webResourceResponseExt = null;
                    }
                    if (webResourceResponseExt == null) {
                        return null;
                    }
                    String contentType = webResourceResponseExt.getContentType();
                    String contentEncoding = webResourceResponseExt.getContentEncoding();
                    byte[] data = webResourceResponseExt.getData();
                    Map<String, String> headers = webResourceResponseExt.getHeaders();
                    Integer statusCode = webResourceResponseExt.getStatusCode();
                    String reasonPhrase = webResourceResponseExt.getReasonPhrase();
                    if (data != null) {
                        byteArrayInputStream = new ByteArrayInputStream(data);
                    }
                    ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                    if (statusCode == null || reasonPhrase == null) {
                        return new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream2);
                    }
                    return new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream2);
                }
            });
        }
    }
}
