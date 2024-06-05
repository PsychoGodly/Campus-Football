package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;

public class MyWebStorage extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void getOrigins(final k.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() {
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : map.keySet()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(obj);
                        HashMap hashMap = new HashMap();
                        hashMap.put("origin", origin.getOrigin());
                        hashMap.put("quota", Long.valueOf(origin.getQuota()));
                        hashMap.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(hashMap);
                    }
                    dVar.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final k.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() {
                public void onReceiveValue(Long l10) {
                    dVar.success(l10);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final k.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() {
                public void onReceiveValue(Long l10) {
                    dVar.success(l10);
                }
            });
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        init();
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1308548435:
                if (str.equals("getQuotaForOrigin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1117417280:
                if (str.equals("deleteAllData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -876677967:
                if (str.equals("deleteOrigin")) {
                    c10 = 2;
                    break;
                }
                break;
            case -165580329:
                if (str.equals("getOrigins")) {
                    c10 = 3;
                    break;
                }
                break;
            case 843309476:
                if (str.equals("getUsageForOrigin")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                getQuotaForOrigin((String) jVar.a("origin"), dVar);
                return;
            case 1:
                WebStorage webStorage = webStorageManager;
                if (webStorage != null) {
                    webStorage.deleteAllData();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 2:
                if (webStorageManager != null) {
                    webStorageManager.deleteOrigin((String) jVar.a("origin"));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 3:
                getOrigins(dVar);
                return;
            case 4:
                getUsageForOrigin((String) jVar.a("origin"), dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
