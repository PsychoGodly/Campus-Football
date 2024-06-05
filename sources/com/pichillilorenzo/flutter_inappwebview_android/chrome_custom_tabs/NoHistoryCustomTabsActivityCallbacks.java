package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.HashMap;
import java.util.Map;

public class NoHistoryCustomTabsActivityCallbacks implements Disposable {
    public Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r4 = r3.this$0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResumed(android.app.Activity r4) {
            /*
                r3 = this;
                boolean r4 = r4 instanceof io.flutter.embedding.android.d
                if (r4 == 0) goto L_0x0045
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks r4 = com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.this
                com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin r0 = r4.plugin
                if (r0 == 0) goto L_0x0045
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager r0 = r0.chromeSafariBrowserManager
                if (r0 == 0) goto L_0x0045
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.noHistoryBrowserIDs
                java.util.Collection r4 = r4.values()
                java.util.Iterator r4 = r4.iterator()
            L_0x0018:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0045
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0018
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks r1 = com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.this
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.noHistoryBrowserIDs
                r2 = 0
                r1.put(r0, r2)
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks r1 = com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.this
                com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin r1 = r1.plugin
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager r1 = r1.chromeSafariBrowserManager
                java.util.Map<java.lang.String, com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity> r1 = r1.browsers
                java.lang.Object r0 = r1.get(r0)
                com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity r0 = (com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity) r0
                if (r0 == 0) goto L_0x0018
                r0.close()
                r0.dispose()
                goto L_0x0018
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.AnonymousClass1.onActivityResumed(android.app.Activity):void");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    };
    public final Map<String, String> noHistoryBrowserIDs = new HashMap();
    public InAppWebViewFlutterPlugin plugin;

    public NoHistoryCustomTabsActivityCallbacks(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void dispose() {
        this.noHistoryBrowserIDs.clear();
        this.plugin = null;
    }
}
