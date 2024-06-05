package com.applovin.impl.sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x3;
import java.util.HashMap;
import java.util.Map;

public class x extends WebViewClient {
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        if (x3.i()) {
            hashMap.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            hashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        k.A0.B().a(o.b.WEB_VIEW_ERROR, (Map) hashMap, ((Long) k.A0.a(oj.f10459z3)).longValue());
        t.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
