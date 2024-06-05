package io.flutter.plugin.platform;

import android.view.View;

/* compiled from: PlatformView */
public interface f {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
