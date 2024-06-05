package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t6 implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.w f34437a;

    public /* synthetic */ t6(n.w wVar) {
        this.f34437a = wVar;
    }

    public final void onReceiveValue(Object obj) {
        this.f34437a.success((String) obj);
    }
}
