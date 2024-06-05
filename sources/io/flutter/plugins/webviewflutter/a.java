package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.w f34175a;

    public /* synthetic */ a(n.w wVar) {
        this.f34175a = wVar;
    }

    public final void onReceiveValue(Object obj) {
        this.f34175a.success((Boolean) obj);
    }
}
