package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.e;
import com.applovin.impl.jg;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.device.MimeTypes;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: l  reason: collision with root package name */
    private final String f11485l = e1();

    /* renamed from: m  reason: collision with root package name */
    private final String f11486m = j1();

    /* renamed from: n  reason: collision with root package name */
    private final String f11487n = i1();

    /* renamed from: o  reason: collision with root package name */
    private final jg f11488o = new jg(this);

    public a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    private String i1() {
        return getStringFromAdObject("stream_url", MaxReward.DEFAULT_LABEL);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(ql qlVar) {
        qlVar.b("html", this.f11485l);
        qlVar.b("stream_url", this.f11487n);
    }

    public boolean G0() {
        return containsKeyForAdObject("stream_url");
    }

    public void J0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a((androidx.core.util.a) new e(this));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f11485l);
            JsonUtils.putString(this.adObject, "stream_url", this.f11487n);
        }
    }

    public String P() {
        return this.f11486m;
    }

    public void b(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public void d(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b(MimeTypes.BASE_TYPE_VIDEO, uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, MimeTypes.BASE_TYPE_VIDEO, uri.toString());
        }
    }

    public e.a d1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    public String e1() {
        return getStringFromAdObject("html", MaxReward.DEFAULT_LABEL);
    }

    public String f1() {
        return getStringFromAdObject("html_url", MaxReward.DEFAULT_LABEL);
    }

    public float g1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObject;
        JSONObject deepCopy;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            jSONObject = qlVar.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, "html", this.f11485l);
            JsonUtils.putString(jSONObject2, MimeTypes.BASE_TYPE_VIDEO, this.f11486m);
            JsonUtils.putString(jSONObject2, "stream_url", this.f11487n);
        }
        return jSONObject;
    }

    public String h1() {
        return this.f11487n;
    }

    public boolean hasVideoUrl() {
        return s0() != null;
    }

    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.Y().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", MaxReward.DEFAULT_LABEL);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri j0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", MaxReward.DEFAULT_LABEL);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return j();
    }

    public String j1() {
        return getStringFromAdObject(MimeTypes.BASE_TYPE_VIDEO, MaxReward.DEFAULT_LABEL);
    }

    public boolean k1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void l1() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public boolean m1() {
        return getBooleanFromAdObject("should_cache_html_url_contents", Boolean.FALSE);
    }

    public boolean n1() {
        return getBooleanFromAdObject("should_respect_whitelist_when_retrieving_html_from_url", Boolean.FALSE);
    }

    public Uri s0() {
        String i12 = i1();
        if (StringUtils.isValidString(i12)) {
            return Uri.parse(i12);
        }
        String j12 = j1();
        if (StringUtils.isValidString(j12)) {
            return Uri.parse(j12);
        }
        return null;
    }

    public jg getAdEventTracker() {
        return this.f11488o;
    }
}
