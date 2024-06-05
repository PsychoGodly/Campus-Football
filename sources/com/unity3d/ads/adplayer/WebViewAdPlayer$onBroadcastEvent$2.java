package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import fe.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$onBroadcastEvent$2 extends n implements a<WebViewEvent> {
    final /* synthetic */ String $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$onBroadcastEvent$2(String str) {
        super(0);
        this.$event = str;
    }

    public final WebViewEvent invoke() {
        JSONObject jSONObject = new JSONObject(this.$event);
        String string = jSONObject.getString("eventType");
        String optString = jSONObject.optString(JsonStorageKeyNames.DATA_KEY);
        m.d(string, "eventType");
        return new OnBroadcastEvent(string, optString);
    }
}
