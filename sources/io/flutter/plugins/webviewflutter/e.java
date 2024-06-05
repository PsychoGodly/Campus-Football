package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;
import lc.c;

/* compiled from: CustomViewCallbackHostApiImpl */
public class e implements n.e {

    /* renamed from: a  reason: collision with root package name */
    private final c f34229a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34230b;

    public e(c cVar, d4 d4Var) {
        this.f34229a = cVar;
        this.f34230b = d4Var;
    }

    private WebChromeClient.CustomViewCallback b(Long l10) {
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.f34230b.i(l10.longValue());
        Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    public void a(Long l10) {
        b(l10).onCustomViewHidden();
    }
}
