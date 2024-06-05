package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.i;
import java.util.List;
import java.util.Map;

public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private c mClient;
    private e mConnection;
    private ConnectionCallback mConnectionCallback;
    private b mCustomTabsCallback;
    private i mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i10);
    }

    public static void openTrustedWebActivity(Activity activity, p.b bVar, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        openCustomTab(activity, bVar.a(), uri, map, uri2, i10);
    }

    public boolean bindCustomTabsService(Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
        if (packageNameToUse == null) {
            return false;
        }
        ServiceConnection serviceConnection = new ServiceConnection(this);
        this.mConnection = serviceConnection;
        return c.a(activity, packageNameToUse, serviceConnection);
    }

    public i getSession() {
        c cVar = this.mClient;
        if (cVar == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = cVar.e(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        i session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        return session.i(uri, bundle, list);
    }

    public void onServiceConnected(c cVar) {
        this.mClient = cVar;
        cVar.g(0);
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(b bVar) {
        this.mCustomTabsCallback = bVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        e eVar = this.mConnection;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.mClient = null;
            this.mCustomTabsSession = null;
            this.mConnection = null;
        }
    }

    public static void openCustomTab(Activity activity, d dVar, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        openCustomTab(activity, dVar.f1921a, uri, map, uri2, i10);
    }
}
