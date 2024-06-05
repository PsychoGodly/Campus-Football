package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class wm extends xl {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicBoolean f13100q = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f13101h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final MaxAdFormat f13102i;

    /* renamed from: j  reason: collision with root package name */
    private final JSONObject f13103j;

    /* renamed from: k  reason: collision with root package name */
    private final List f13104k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final a.C0126a f13105l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final WeakReference f13106m;

    /* renamed from: n  reason: collision with root package name */
    private final String f13107n;

    /* renamed from: o  reason: collision with root package name */
    private long f13108o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final List f13109p;

    wm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, k kVar, a.C0126a aVar) {
        super("TaskProcessMediationWaterfall", kVar, str);
        this.f13101h = str;
        this.f13102i = maxAdFormat;
        this.f13103j = jSONObject;
        this.f13105l = aVar;
        this.f13106m = new WeakReference(context);
        this.f13107n = JsonUtils.getString(jSONObject, "mcode", MaxReward.DEFAULT_LABEL);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.f13104k = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f13104k.add(be.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f13109p = new ArrayList(this.f13104k.size());
    }

    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f13108o = SystemClock.elapsedRealtime();
        if (this.f13103j.optBoolean("is_testing", false) && !this.f13421a.n0().c() && f13100q.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new f70(this));
        }
        if (this.f13104k.size() > 0) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Starting waterfall for " + this.f13102i.getLabel() + " ad unit " + this.f13101h + " with " + this.f13104k.size() + " ad(s)...");
            }
            this.f13421a.l0().a((xl) new a(0, this.f13104k));
            return;
        }
        if (t.a()) {
            this.f13423c.k(this.f13422b, "No ads were returned from the server for " + this.f13102i.getLabel() + " ad unit " + this.f13101h);
        }
        zp.a(this.f13101h, this.f13102i, this.f13103j, this.f13421a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f13103j, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0);
        if (ve.a(this.f13103j, this.f13101h, this.f13421a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.f13101h + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (zp.c(this.f13421a) && ((Boolean) this.f13421a.a(oj.f10374o6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j10);
            g70 g70 = new g70(this, maxErrorImpl);
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                w1.a(millis, this.f13421a, g70);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(g70, millis);
            }
        } else {
            b((MaxError) maxErrorImpl);
        }
    }

    /* access modifiers changed from: private */
    public void b(be beVar) {
        this.f13421a.V().b(beVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13108o;
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.d(str, "Waterfall loaded in " + elapsedRealtime + "ms from " + beVar.c() + " for " + this.f13102i.getLabel() + " ad unit " + this.f13101h);
        }
        beVar.a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f13109p, this.f13107n));
        bc.f(this.f13105l, beVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) this.f13421a.p0());
    }

    private class a extends xl {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final long f13110h = SystemClock.elapsedRealtime();
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final int f13111i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public final be f13112j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final List f13113k;

        /* renamed from: com.applovin.impl.wm$a$a  reason: collision with other inner class name */
        class C0144a extends je {
            C0144a(a.C0126a aVar) {
                super(aVar);
            }

            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f13110h;
                t unused = a.this.f13423c;
                if (t.a()) {
                    t f10 = a.this.f13423c;
                    String e10 = a.this.f13422b;
                    f10.a(e10, "Ad failed to load in " + elapsedRealtime + " ms for " + wm.this.f13102i.getLabel() + " ad unit " + wm.this.f13101h + " with error: " + maxError);
                }
                a aVar = a.this;
                aVar.b("failed to load ad: " + maxError.getCode());
                a aVar2 = a.this;
                aVar2.a(aVar2.f13112j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (a.this.f13111i < a.this.f13113k.size() - 1) {
                    a aVar3 = a.this;
                    a.this.f13421a.l0().a((xl) new a(aVar3.f13111i + 1, a.this.f13113k), sm.b.MEDIATION);
                    return;
                }
                wm.this.b((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
            }

            public void onAdLoaded(MaxAd maxAd) {
                a.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f13110h;
                t unused = a.this.f13423c;
                if (t.a()) {
                    t a10 = a.this.f13423c;
                    String k10 = a.this.f13422b;
                    a10.a(k10, "Ad loaded in " + elapsedRealtime + "ms for " + wm.this.f13102i.getLabel() + " ad unit " + wm.this.f13101h);
                }
                be beVar = (be) maxAd;
                a.this.a(beVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                int b10 = a.this.f13111i;
                while (true) {
                    b10++;
                    if (b10 < a.this.f13113k.size()) {
                        a aVar = a.this;
                        aVar.a((be) aVar.f13113k.get(b10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
                    } else {
                        wm.this.b(beVar);
                        return;
                    }
                }
            }
        }

        a(int i10, List list) {
            super(wm.this.f13422b, wm.this.f13421a, wm.this.f13101h);
            this.f13111i = i10;
            this.f13112j = (be) list.get(i10);
            this.f13113k = list;
        }

        /* access modifiers changed from: private */
        public void b(String str) {
        }

        public void run() {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Loading ad " + (this.f13111i + 1) + " of " + this.f13113k.size() + " from " + this.f13112j.c() + " for " + wm.this.f13102i.getLabel() + " ad unit " + wm.this.f13101h);
            }
            b("started to load ad");
            Context context = (Context) wm.this.f13106m.get();
            this.f13421a.S().loadThirdPartyMediatedAd(wm.this.f13101h, this.f13112j, context instanceof Activity ? (Activity) context : this.f13421a.p0(), new C0144a(wm.this.f13105l));
        }

        /* access modifiers changed from: private */
        public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
            wm.this.f13109p.add(new MaxNetworkResponseInfoImpl(adLoadState2, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f13421a)), beVar.E(), beVar.W(), j10, beVar.A(), maxError));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f13421a.F().c(aa.f6359u);
        } else if (maxError.getCode() == -5001) {
            this.f13421a.F().c(aa.f6360v);
        } else {
            this.f13421a.F().c(aa.f6361w);
        }
        ArrayList arrayList = new ArrayList(this.f13109p.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f13109p) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13108o;
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.d(str, "Waterfall failed in " + elapsedRealtime + "ms for " + this.f13102i.getLabel() + " ad unit " + this.f13101h + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((be) null, JsonUtils.getString(this.f13103j, "waterfall_name", MaxReward.DEFAULT_LABEL), JsonUtils.getString(this.f13103j, "waterfall_test_name", MaxReward.DEFAULT_LABEL), elapsedRealtime, this.f13109p, JsonUtils.optList(JsonUtils.getJSONArray(this.f13103j, "mwf_info_urls", (JSONArray) null), Collections.EMPTY_LIST), this.f13107n));
        bc.a((MaxAdListener) this.f13105l, this.f13101h, maxError);
    }
}
