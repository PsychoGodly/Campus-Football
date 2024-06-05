package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import androidx.browser.customtabs.c;

public interface ServiceConnectionCallback {
    void onServiceConnected(c cVar);

    void onServiceDisconnected();
}
