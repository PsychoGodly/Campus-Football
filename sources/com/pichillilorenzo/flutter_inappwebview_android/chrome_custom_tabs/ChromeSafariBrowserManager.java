package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lc.j;
import lc.k;

public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers = new HashMap();

    /* renamed from: id  reason: collision with root package name */
    public String f28489id;
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        String uuid = UUID.randomUUID().toString();
        this.f28489id = uuid;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(uuid, this);
    }

    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity next : this.browsers.values()) {
            if (next != null) {
                next.close();
                next.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.f28489id);
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Activity activity;
        String str = (String) jVar.a("id");
        String str2 = jVar.f36116a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1382009261:
                if (str2.equals("getMaxToolbarItems")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3417674:
                if (str2.equals("open")) {
                    c10 = 1;
                    break;
                }
                break;
            case 268490427:
                if (str2.equals("getPackageName")) {
                    c10 = 2;
                    break;
                }
                break;
            case 444517567:
                if (str2.equals("isAvailable")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.success(Integer.valueOf(d.a()));
                return;
            case 1:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                open(this.plugin.activity, str, (String) jVar.a("url"), (HashMap) jVar.a("headers"), (String) jVar.a("referrer"), (ArrayList) jVar.a("otherLikelyURLs"), (HashMap) jVar.a("settings"), (HashMap) jVar.a("actionButton"), (HashMap) jVar.a("secondaryToolbar"), (List) jVar.a("menuItemList"), dVar);
                return;
            case 2:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 == null || inAppWebViewFlutterPlugin2.activity == null) {
                    dVar.success((Object) null);
                    return;
                }
                dVar.success(c.d(this.plugin.activity, (ArrayList) jVar.a("packages"), ((Boolean) jVar.a("ignoreDefault")).booleanValue()));
                return;
            case 3:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 == null || (activity = inAppWebViewFlutterPlugin3.activity) == null) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, String str3, ArrayList<String> arrayList, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, List<HashMap<String, Object>> list, k.d dVar) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f28489id);
        bundle.putSerializable("headers", hashMap);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", hashMap2);
        bundle.putSerializable("actionButton", hashMap3);
        bundle.putSerializable("secondaryToolbar", hashMap4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap2, "isTrustedWebActivity", bool);
        if (CustomTabActivityHelper.isAvailable(activity)) {
            if (!bool2.booleanValue()) {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class;
            } else {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class;
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtras(bundle);
            if (((Boolean) Util.getOrDefault(hashMap2, "noHistory", bool)).booleanValue()) {
                intent.addFlags(1073741824);
            }
            activity.startActivity(intent);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error(LOG_TAG, "ChromeCustomTabs is not available!", (Object) null);
    }
}
