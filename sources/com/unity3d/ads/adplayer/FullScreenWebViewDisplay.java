package com.unity3d.ads.adplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import java.util.Map;
import org.json.JSONObject;
import pe.c2;
import pe.r0;
import se.g;
import xd.d;

/* compiled from: FullScreenWebViewDisplay.kt */
public final class FullScreenWebViewDisplay extends ComponentActivity {
    /* access modifiers changed from: private */
    public String opportunityId = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public Map<String, ? extends Object> showOptions;

    private final void listenToAdPlayerEvents() {
        g.u(g.x(new FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), this), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2(this, (d<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2>) null)), q.a(this));
    }

    /* access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        c2 unused = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$loadWebView$1(this, webView, (d<? super FullScreenWebViewDisplay$loadWebView$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            setResult(0);
            finish();
            c2 unused = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$onCreate$1$1(this, (d<? super FullScreenWebViewDisplay$onCreate$1$1>) null), 3, (Object) null);
            return;
        }
        this.opportunityId = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        this.showOptions = stringExtra2 != null ? JSONObjectExtensionsKt.toMap(new JSONObject(stringExtra2)) : null;
        listenToAdPlayerEvents();
        c2 unused2 = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$onCreate$3(this, (d<? super FullScreenWebViewDisplay$onCreate$3>) null), 3, (Object) null);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return i10 == 4;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        c2 unused = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$onPause$1(this, (d<? super FullScreenWebViewDisplay$onPause$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        c2 unused = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$onResume$1(this, (d<? super FullScreenWebViewDisplay$onResume$1>) null), 3, (Object) null);
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c2 unused = k.d(q.a(this), (xd.g) null, (r0) null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, z10, (d<? super FullScreenWebViewDisplay$onWindowFocusChanged$1>) null), 3, (Object) null);
    }
}
