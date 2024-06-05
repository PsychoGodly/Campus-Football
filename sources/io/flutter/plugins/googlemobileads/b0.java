package io.flutter.plugins.googlemobileads;

import android.view.View;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;

/* compiled from: FlutterPlatformView */
class b0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private View f33940a;

    b0(View view) {
        this.f33940a = view;
    }

    public void dispose() {
        this.f33940a = null;
    }

    public View getView() {
        return this.f33940a;
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        e.a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        e.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        e.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        e.d(this);
    }
}
