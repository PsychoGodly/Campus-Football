package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import n.a;
import org.json.JSONObject;

public abstract class be extends ke implements MaxAd {

    /* renamed from: l  reason: collision with root package name */
    private final int f6683l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f6684m = new AtomicBoolean();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f6685n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    protected g f6686o;

    /* renamed from: p  reason: collision with root package name */
    private final String f6687p;

    /* renamed from: q  reason: collision with root package name */
    private MaxAdWaterfallInfo f6688q;

    /* renamed from: r  reason: collision with root package name */
    private long f6689r;

    /* renamed from: s  reason: collision with root package name */
    private String f6690s;

    /* renamed from: t  reason: collision with root package name */
    private String f6691t;

    /* renamed from: u  reason: collision with root package name */
    private xc f6692u;

    protected be(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, g gVar, k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
        this.f6683l = i10;
        this.f6686o = gVar;
        this.f6687p = gVar != null ? gVar.b() : null;
    }

    private long K() {
        return a("load_started_time_ms", 0);
    }

    public static be a(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", (String) null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new ce(i10, map, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new ee(i10, map, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new de(i10, map, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle c(ql qlVar) {
        JSONObject jSONObject;
        if (qlVar.a("credentials")) {
            jSONObject = qlVar.a("credentials", new JSONObject());
        } else {
            jSONObject = qlVar.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, "placement_id", S());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xc d(ql qlVar) {
        return new xc(qlVar.a("hybrid_ad_config", (JSONObject) null));
    }

    public String A() {
        return a("bcode", MaxReward.DEFAULT_LABEL);
    }

    public long B() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1, l()));
    }

    public String C() {
        return a("bid_response", (String) null);
    }

    public long D() {
        return a("bwt_ms", ((Long) this.f8971a.a(qe.F7)).longValue());
    }

    public Bundle E() {
        JSONObject jSONObject;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return (Bundle) qlVar.a((a) new fv(this));
        }
        if (c("credentials")) {
            jSONObject = a("credentials", new JSONObject());
        } else {
            jSONObject = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, "placement_id", S());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    public long F() {
        if (K() > 0) {
            return J() - K();
        }
        return -1;
    }

    public xc G() {
        xc xcVar = this.f6692u;
        if (xcVar != null) {
            return xcVar;
        }
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            this.f6692u = (xc) qlVar.a((a) jv.f8810a);
        } else {
            this.f6692u = new xc(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.f6692u;
    }

    public MaxAdFormat H() {
        String a10 = a("haf", (String) null);
        if (StringUtils.isValidString(a10)) {
            return MaxAdFormat.formatFromString(a10);
        }
        return null;
    }

    public int I() {
        return this.f6683l;
    }

    public long J() {
        return a("load_completed_time_ms", 0);
    }

    public String L() {
        return this.f6690s;
    }

    public double M() {
        return a(InAppPurchaseMetaData.KEY_PRICE, -1.0f);
    }

    public JSONObject N() {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a((a) kv.f9099a);
        }
        return a("publisher_extra_info", new JSONObject());
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", MaxReward.DEFAULT_LABEL);
    }

    public JSONObject P() {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a((a) gv.f8151a);
        }
        return a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", MaxReward.DEFAULT_LABEL);
    }

    public long R() {
        return a("twt_ms", ((Long) this.f8971a.a(qe.G7)).longValue());
    }

    public String S() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", MaxReward.DEFAULT_LABEL);
    }

    public String V() {
        return b("waterfall_test_name", MaxReward.DEFAULT_LABEL);
    }

    public boolean W() {
        return StringUtils.isValidString(C());
    }

    public boolean X() {
        return H() != null;
    }

    public boolean Y() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        g gVar = this.f6686o;
        if (gVar == null || !gVar.k() || !this.f6686o.j()) {
            return false;
        }
        return true;
    }

    public abstract be a(g gVar);

    public void a0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void b0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public String getAdReviewCreativeId() {
        return this.f6691t;
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        g gVar = this.f6686o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public String getNetworkName() {
        return a("network_name", MaxReward.DEFAULT_LABEL);
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(S());
    }

    public long getRequestLatencyMillis() {
        return this.f6689r;
    }

    public double getRevenue() {
        if (!((Boolean) this.f8971a.a(qe.C7)).booleanValue() || !getFormat().isFullscreenAd() || t().get()) {
            ql qlVar = this.f8978i;
            if (qlVar != null) {
                return ((Double) qlVar.a((a) lv.f9280a)).doubleValue();
            }
            return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f8971a.L();
        if (!t.a()) {
            return 0.0d;
        }
        this.f8971a.L().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    public String getRevenuePrecision() {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return (String) qlVar.a((a) hv.f8372a);
        }
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", MaxReward.DEFAULT_LABEL);
    }

    public AppLovinSdkUtils.Size getSize() {
        int a10 = a("ad_width", -3);
        int a11 = a("ad_height", -3);
        if (a10 == -3 || a11 == -3) {
            return getFormat().getSize();
        }
        return new AppLovinSdkUtils.Size(a10, a11);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.f6688q;
    }

    public void i(String str) {
        this.f6690s = str;
    }

    public void s() {
        this.f6686o = null;
        this.f6688q = null;
    }

    public AtomicBoolean t() {
        return this.f6684m;
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + S() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public String u() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean v() {
        return this.f6685n;
    }

    public JSONObject w() {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a((a) iv.f8604a);
        }
        return a("ad_values", new JSONObject());
    }

    public View x() {
        g gVar;
        if (!Z() || (gVar = this.f6686o) == null) {
            return null;
        }
        return gVar.d();
    }

    public String y() {
        return this.f6687p;
    }

    public g z() {
        return this.f6686o;
    }

    public String getAdValue(String str, String str2) {
        JSONObject w10 = w();
        if (w10.has(str)) {
            return JsonUtils.getString(w10, str, str2);
        }
        Bundle l10 = l();
        if (l10.containsKey(str)) {
            return l10.getString(str);
        }
        JSONObject N = N();
        if (N.has(str)) {
            return JsonUtils.getString(N, str, str2);
        }
        return a(str, str2);
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject N = N();
            JsonUtils.putAll(N, jSONObject);
            a("publisher_extra_info", (Object) N);
        }
    }

    public void h(String str) {
        this.f6691t = str;
    }

    public void a(long j10) {
        this.f6689r = j10;
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f6688q = maxAdWaterfallInfo;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject w10 = w();
            JsonUtils.putAll(w10, jSONObject);
            a("ad_values", (Object) w10);
        }
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("ad_values")) {
                a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
            }
            if (bundle.containsKey("creative_id") && !c("creative_id")) {
                c("creative_id", BundleUtils.getString("creative_id", bundle));
            }
            if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
                int i10 = BundleUtils.getInt("ad_width", bundle);
                int i11 = BundleUtils.getInt("ad_height", bundle);
                c("ad_width", i10);
                c("ad_height", i11);
            }
            if (bundle.containsKey("publisher_extra_info")) {
                b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
            }
        }
    }
}
