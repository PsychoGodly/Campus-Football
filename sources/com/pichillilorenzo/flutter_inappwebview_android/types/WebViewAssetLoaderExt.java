package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import j1.q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.k;

public class WebViewAssetLoaderExt implements Disposable {
    public List<PathHandlerExt> customPathHandlers;
    public q loader;

    public static class PathHandlerExt implements q.d, Disposable {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;

        /* renamed from: id  reason: collision with root package name */
        public String f28502id;

        public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.f28502id = str;
            c cVar = inAppWebViewFlutterPlugin.messenger;
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + str));
        }

        public void dispose() {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                pathHandlerExtChannelDelegate.dispose();
                this.channelDelegate = null;
            }
        }

        public WebResourceResponse handle(String str) {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            ByteArrayInputStream byteArrayInputStream = null;
            if (pathHandlerExtChannelDelegate != null) {
                try {
                    WebResourceResponseExt handle = pathHandlerExtChannelDelegate.handle(str);
                    if (handle != null) {
                        String contentType = handle.getContentType();
                        String contentEncoding = handle.getContentEncoding();
                        byte[] data = handle.getData();
                        Map<String, String> headers = handle.getHeaders();
                        Integer statusCode = handle.getStatusCode();
                        String reasonPhrase = handle.getReasonPhrase();
                        if (data != null) {
                            byteArrayInputStream = new ByteArrayInputStream(data);
                        }
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        if (Build.VERSION.SDK_INT < 21 || statusCode == null || reasonPhrase == null) {
                            return new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream2);
                        }
                        return new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream2);
                    }
                } catch (InterruptedException e10) {
                    Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
                }
            }
            return null;
        }
    }

    public WebViewAssetLoaderExt(q qVar, List<PathHandlerExt> list) {
        this.loader = qVar;
        this.customPathHandlers = list;
    }

    public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
        if (map == null) {
            return null;
        }
        q.b bVar = new q.b();
        String str = (String) map.get("domain");
        Boolean bool = (Boolean) map.get("httpAllowed");
        List<Map> list = (List) map.get("pathHandlers");
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            bVar.c(str);
        }
        if (bool != null) {
            bVar.d(bool.booleanValue());
        }
        if (list != null) {
            for (Map map2 : list) {
                String str2 = (String) map2.get("type");
                String str3 = (String) map2.get("path");
                if (!(str2 == null || str3 == null)) {
                    char c10 = 65535;
                    switch (str2.hashCode()) {
                        case -1506882528:
                            if (str2.equals("ResourcesPathHandler")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -667829310:
                            if (str2.equals("AssetsPathHandler")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1490480039:
                            if (str2.equals("InternalStoragePathHandler")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            bVar.a(str3, new q.f(context));
                            break;
                        case 1:
                            bVar.a(str3, new q.a(context));
                            break;
                        case 2:
                            String str4 = (String) map2.get("directory");
                            if (str4 != null) {
                                bVar.a(str3, new q.c(context, new File(str4)));
                                break;
                            } else {
                                break;
                            }
                        default:
                            String str5 = (String) map2.get("id");
                            if (str5 != null) {
                                PathHandlerExt pathHandlerExt = new PathHandlerExt(str5, inAppWebViewFlutterPlugin);
                                bVar.a(str3, pathHandlerExt);
                                arrayList.add(pathHandlerExt);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        return new WebViewAssetLoaderExt(bVar.b(), arrayList);
    }

    public void dispose() {
        for (PathHandlerExt dispose : this.customPathHandlers) {
            dispose.dispose();
        }
        this.customPathHandlers.clear();
    }

    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
        private PathHandlerExt pathHandler;

        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
            public WebResourceResponseExt decodeResult(Object obj) {
                return WebResourceResponseExt.fromMap((Map) obj);
            }
        }

        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
            public WebResourceResponseExt decodeResult(Object obj) {
                return new HandleCallback().decodeResult(obj);
            }
        }

        public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, k kVar) {
            super(kVar);
            this.pathHandler = pathHandlerExt;
        }

        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }

        public void handle(String str, HandleCallback handleCallback) {
            k channel = getChannel();
            if (channel != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", str);
                channel.d("handle", hashMap, handleCallback);
            }
        }

        public WebResourceResponseExt handle(String str) throws InterruptedException {
            k channel = getChannel();
            if (channel == null) {
                return null;
            }
            SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            HashMap hashMap = new HashMap();
            hashMap.put("path", str);
            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", hashMap, syncHandleCallback);
        }
    }
}
