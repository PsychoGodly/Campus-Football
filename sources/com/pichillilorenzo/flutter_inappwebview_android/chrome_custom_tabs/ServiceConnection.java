package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

public class ServiceConnection extends e {
    private WeakReference<ServiceConnectionCallback> mConnectionCallback;

    public ServiceConnection(ServiceConnectionCallback serviceConnectionCallback) {
        this.mConnectionCallback = new WeakReference<>(serviceConnectionCallback);
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        ServiceConnectionCallback serviceConnectionCallback = (ServiceConnectionCallback) this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceConnected(cVar);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnectionCallback serviceConnectionCallback = (ServiceConnectionCallback) this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceDisconnected();
        }
    }
}
