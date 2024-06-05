package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import java.util.HashMap;
import lc.k;

public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(k kVar) {
        super(kVar);
    }

    public void onBrowserCreated() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onBrowserCreated", new HashMap());
        }
    }

    public void onExit() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onExit", new HashMap());
        }
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
            channel.c("onMenuItemClicked", hashMap);
        }
    }
}
