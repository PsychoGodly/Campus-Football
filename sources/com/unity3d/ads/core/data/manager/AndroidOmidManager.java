package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.m;
import w9.a;
import x9.b;
import x9.c;
import x9.d;
import x9.f;
import x9.i;
import x9.k;
import x9.l;

/* compiled from: AndroidOmidManager.kt */
public final class AndroidOmidManager implements OmidManager {
    public void activate(Context context) {
        m.e(context, "context");
        a.a(context);
    }

    public x9.a createAdEvents(b bVar) {
        m.e(bVar, "adSession");
        x9.a a10 = x9.a.a(bVar);
        m.d(a10, "createAdEvents(adSession)");
        return a10;
    }

    public b createAdSession(c cVar, d dVar) {
        m.e(cVar, "adSessionConfiguration");
        m.e(dVar, "context");
        b a10 = b.a(cVar, dVar);
        m.d(a10, "createAdSession(adSessionConfiguration, context)");
        return a10;
    }

    public c createAdSessionConfiguration(f fVar, i iVar, k kVar, k kVar2, boolean z10) {
        m.e(fVar, "creativeType");
        m.e(iVar, "impressionType");
        m.e(kVar, "owner");
        m.e(kVar2, "mediaEventsOwner");
        c a10 = c.a(fVar, iVar, kVar, kVar2, z10);
        m.d(a10, "createAdSessionConfigura…VerificationScripts\n    )");
        return a10;
    }

    public d createHtmlAdSessionContext(l lVar, WebView webView, String str, String str2) {
        d a10 = d.a(lVar, webView, str, str2);
        m.d(a10, "createHtmlAdSessionConte…customReferenceData\n    )");
        return a10;
    }

    public d createJavaScriptAdSessionContext(l lVar, WebView webView, String str, String str2) {
        d b10 = d.b(lVar, webView, str, str2);
        m.d(b10, "createJavascriptAdSessio…customReferenceData\n    )");
        return b10;
    }

    public String getVersion() {
        String b10 = a.b();
        m.d(b10, "getVersion()");
        return b10;
    }

    public boolean isActive() {
        return a.c();
    }
}
