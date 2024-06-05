package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import j1.h;
import j1.i;
import j1.s;
import java.util.Map;
import lc.j;
import lc.k;

public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager2, k kVar) {
        super(kVar);
        this.serviceWorkerManager = serviceWorkerManager2;
    }

    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        ServiceWorkerManager.init();
        h hVar = ServiceWorkerManager.serviceWorkerController;
        i b10 = hVar != null ? hVar.b() : null;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1165005700:
                if (str.equals("setServiceWorkerClient")) {
                    c10 = 1;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c10 = 2;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c10 = 3;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (b10 == null || !s.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b10.a()));
                    return;
                }
            case 1:
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) jVar.a("isNull"));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 2:
                if (b10 == null || !s.a("SERVICE_WORKER_CACHE_MODE")) {
                    dVar.success((Object) null);
                    return;
                } else {
                    dVar.success(Integer.valueOf(b10.d()));
                    return;
                }
            case 3:
                if (b10 == null || !s.a("SERVICE_WORKER_FILE_ACCESS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b10.b()));
                    return;
                }
            case 4:
                if (b10 != null && s.a("SERVICE_WORKER_CACHE_MODE")) {
                    b10.h(((Integer) jVar.a("mode")).intValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 5:
                if (b10 != null && s.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    b10.g(((Boolean) jVar.a("flag")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 6:
                if (b10 != null && s.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    b10.e(((Boolean) jVar.a("allow")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 7:
                if (b10 != null && s.a("SERVICE_WORKER_FILE_ACCESS")) {
                    b10.f(((Boolean) jVar.a("allow")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 8:
                if (b10 == null || !s.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b10.c()));
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        k channel = getChannel();
        if (channel != null) {
            channel.d("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) throws InterruptedException {
        k channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }
}
