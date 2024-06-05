package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.view.View;
import io.flutter.plugin.platform.f;
import java.util.HashMap;

public interface PlatformWebView extends f {
    /* synthetic */ void dispose();

    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> hashMap);

    /* bridge */ /* synthetic */ void onFlutterViewAttached(View view);

    /* bridge */ /* synthetic */ void onFlutterViewDetached();

    /* bridge */ /* synthetic */ void onInputConnectionLocked();

    /* bridge */ /* synthetic */ void onInputConnectionUnlocked();
}
