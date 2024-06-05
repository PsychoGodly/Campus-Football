package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import x9.a;
import x9.b;
import x9.c;
import x9.d;
import x9.f;
import x9.i;
import x9.k;
import x9.l;

/* compiled from: OmidManager.kt */
public interface OmidManager {
    void activate(Context context);

    a createAdEvents(b bVar);

    b createAdSession(c cVar, d dVar);

    c createAdSessionConfiguration(f fVar, i iVar, k kVar, k kVar2, boolean z10);

    d createHtmlAdSessionContext(l lVar, WebView webView, String str, String str2);

    d createJavaScriptAdSessionContext(l lVar, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
