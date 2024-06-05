package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.aa;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gn;
import com.applovin.impl.ie;
import com.applovin.impl.ke;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.g;
import com.applovin.impl.mn;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.qm;
import com.applovin.impl.re;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.sm;
import com.applovin.impl.uj;
import com.applovin.impl.vj;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f9397a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f9398b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final uj f9399c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f9400d = new AtomicReference();

    class a implements g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f9401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f9403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ wj f9404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f9405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ vj.a f9406f;

        a(g gVar, String str, long j10, wj wjVar, MaxAdFormat maxAdFormat, vj.a aVar) {
            this.f9401a = gVar;
            this.f9402b = str;
            this.f9403c = j10;
            this.f9404d = wjVar;
            this.f9405e = maxAdFormat;
            this.f9406f = aVar;
        }

        public void a(MaxError maxError) {
            t unused = MediationServiceImpl.this.f9398b;
            if (t.a()) {
                t a10 = MediationServiceImpl.this.f9398b;
                a10.b("MediationService", "Signal collection failed from: " + this.f9401a.g() + " for Ad Unit ID: " + this.f9402b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.f9403c;
            vj a11 = vj.a(this.f9404d, this.f9401a, maxError, j10, elapsedRealtime - j10);
            MediationServiceImpl.this.a(a11, this.f9404d, this.f9401a);
            this.f9406f.a(a11);
            this.f9401a.a();
        }

        public void onSignalCollected(String str) {
            t unused = MediationServiceImpl.this.f9398b;
            if (t.a()) {
                t a10 = MediationServiceImpl.this.f9398b;
                a10.a("MediationService", "Signal collection successful from: " + this.f9401a.g() + " for Ad Unit ID: " + this.f9402b + " with signal: \"" + str + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.f9403c;
            vj a11 = vj.a(this.f9404d, this.f9401a, str, j10, elapsedRealtime - j10);
            MediationServiceImpl.this.f9399c.a(a11, this.f9404d, this.f9402b, this.f9405e);
            this.f9406f.a(a11);
            this.f9401a.a();
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.C0126a {

        /* renamed from: a  reason: collision with root package name */
        private final be f9408a;

        /* renamed from: b  reason: collision with root package name */
        private a.C0126a f9409b;

        public b(be beVar, a.C0126a aVar) {
            this.f9408a = beVar;
            this.f9409b = aVar;
        }

        public void a(a.C0126a aVar) {
            this.f9409b = aVar;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            bc.b((MaxAdListener) this.f9409b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            t unused = MediationServiceImpl.this.f9398b;
            if (t.a()) {
                MediationServiceImpl.this.f9398b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f9408a, this.f9409b);
            MediationServiceImpl.this.f9397a.F().c(aa.f6344f);
            MediationServiceImpl.this.f9397a.F().c(aa.f6347i);
            if (maxAd.getFormat().isFullscreenAd()) {
                de deVar = (de) maxAd;
                if (deVar.n0()) {
                    MediationServiceImpl.this.f9397a.o().b(this.f9408a, "DID_DISPLAY");
                    MediationServiceImpl.this.f9397a.E().a((Object) this.f9408a);
                    bc.c((MaxAdListener) this.f9409b, maxAd);
                    return;
                }
                t unused2 = MediationServiceImpl.this.f9398b;
                if (t.a()) {
                    t a10 = MediationServiceImpl.this.f9398b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received ad display callback before attempting show");
                    sb2.append(deVar.X() ? " for hybrid ad" : MaxReward.DEFAULT_LABEL);
                    a10.k("MediationService", sb2.toString());
                    return;
                }
                return;
            }
            MediationServiceImpl.this.f9397a.o().b(this.f9408a, "DID_DISPLAY");
            bc.c((MaxAdListener) this.f9409b, maxAd);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            bc.d((MaxAdListener) this.f9409b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            MediationServiceImpl.this.f9397a.o().b((be) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new k(this, maxAd), maxAd instanceof de ? ((de) maxAd).e0() : 0);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            this.f9408a.a0();
            MediationServiceImpl.this.a(this.f9408a);
            bc.f(this.f9409b, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, (Bundle) null);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, (Bundle) null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, (Bundle) null);
        }

        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, (Bundle) null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f9408a.a0();
            MediationServiceImpl.this.b(this.f9408a, maxError, this.f9409b);
        }

        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, (Bundle) null);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            bc.g(this.f9409b, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            bc.h(this.f9409b, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f9397a.E().b((Object) maxAd);
            }
            bc.e(this.f9409b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f9408a.a(bundle);
            MediationServiceImpl.this.a(this.f9408a, this.f9409b);
            bc.a((MaxAdListener) this.f9409b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f9408a.a(bundle);
            MediationServiceImpl.this.a(this.f9408a, maxError, (MaxAdListener) this.f9409b);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof de)) {
                ((de) maxAd).c0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f9408a.a(bundle);
            bc.a((MaxAdListener) this.f9409b, maxAd, maxReward);
            MediationServiceImpl.this.f9397a.l0().a((xl) new gn((de) maxAd, MediationServiceImpl.this.f9397a), sm.b.OTHER);
        }
    }

    public MediationServiceImpl(k kVar) {
        this.f9397a = kVar;
        this.f9398b = kVar.L();
        this.f9399c = new uj(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, wj wjVar, Context context, vj.a aVar) {
        String str2 = str;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        wj wjVar2 = wjVar;
        Context context2 = context;
        vj.a aVar2 = aVar;
        if (wjVar2 == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (context2 == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar2 != null) {
            vj b10 = this.f9399c.b(wjVar2, str2, maxAdFormat2);
            if (b10 != null) {
                aVar2.a(vj.a(b10));
                return;
            }
            g a10 = this.f9397a.O().a(wjVar2, wjVar.w());
            if (a10 != null) {
                Activity p02 = context2 instanceof Activity ? (Activity) context2 : this.f9397a.p0();
                MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(wjVar2, str2, maxAdFormat2);
                if (wjVar.u()) {
                    this.f9397a.N().a((ke) wjVar2, p02);
                }
                a aVar3 = new a(a10, str, SystemClock.elapsedRealtime(), wjVar, maxAdFormat, aVar);
                if (!wjVar.v()) {
                    if (t.a()) {
                        t tVar = this.f9398b;
                        tVar.a("MediationService", "Collecting signal for adapter: " + a10.g());
                    }
                    a10.a((MaxAdapterSignalCollectionParameters) a11, wjVar2, p02, (g.b) aVar3);
                } else if (this.f9397a.N().a((ke) wjVar2)) {
                    if (t.a()) {
                        t tVar2 = this.f9398b;
                        tVar2.a("MediationService", "Collecting signal for now-initialized adapter: " + a10.g());
                    }
                    a10.a((MaxAdapterSignalCollectionParameters) a11, wjVar2, p02, (g.b) aVar3);
                } else {
                    if (t.a()) {
                        t tVar3 = this.f9398b;
                        tVar3.b("MediationService", "Skip collecting signal for not-initialized adapter: " + a10.g());
                    }
                    aVar2.a(vj.a(wjVar2, new MaxErrorImpl("Adapter not initialized yet")));
                }
            } else {
                aVar2.a(vj.a(wjVar2, new MaxErrorImpl("Could not load adapter")));
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof be) {
            if (t.a()) {
                t tVar = this.f9398b;
                tVar.d("MediationService", "Destroying " + maxAd);
            }
            be beVar = (be) maxAd;
            g z10 = beVar.z();
            if (z10 != null) {
                z10.a();
                beVar.s();
            }
            this.f9397a.h().c(beVar.Q());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f9400d.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.C0126a aVar) {
        String str3 = str;
        a.C0126a aVar2 = aVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar2 != null) {
            if (TextUtils.isEmpty(this.f9397a.Q())) {
                t.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (!this.f9397a.y0()) {
                t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            List<String> list = null;
            if (this.f9397a.C0().get()) {
                list = this.f9397a.g0().getInitializationAdUnitIds();
            } else if (this.f9397a.I() != null) {
                list = this.f9397a.I().getAdUnitIds();
            }
            boolean startsWith = str.startsWith("test_mode");
            if (list != null && list.size() > 0 && !list.contains(str) && !startsWith) {
                if (zp.c(this.f9397a)) {
                    String str4 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow";
                    if (((Boolean) this.f9397a.a(oj.f10382p6)).booleanValue()) {
                        throw new RuntimeException(str4);
                    } else if (t.a()) {
                        this.f9398b.b("MediationService", str4);
                    }
                }
                this.f9397a.B().a(o.b.INTEGRATION_ERROR, "uninitialized_ad_unit_id", (Map) CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
            }
            this.f9397a.c();
            if (str.length() != 16 && !startsWith && !this.f9397a.d0().startsWith("05TMD")) {
                t.h("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable(MaxReward.DEFAULT_LABEL)));
            }
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            if (this.f9397a.a(maxAdFormat)) {
                t.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                bc.a((MaxAdListener) aVar2, str, (MaxError) new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            this.f9397a.V0();
            bc.a((MaxAdRequestListener) aVar2, str, true);
            this.f9397a.M().a(str, str2, maxAdFormat, bVar, (Map) map, (Map) map2, context, aVar);
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, be beVar, Activity activity, a.C0126a aVar) {
        if (beVar != null) {
            if (t.a()) {
                this.f9398b.a("MediationService", "Loading " + beVar + "...");
            }
            this.f9397a.o().b(beVar, "WILL_LOAD");
            g a10 = this.f9397a.O().a((ke) beVar);
            if (a10 != null) {
                MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(beVar);
                this.f9397a.N().a((ke) beVar, activity);
                be a12 = beVar.a(a10);
                a10.a(str, a12);
                a12.b0();
                a10.a(str, (MaxAdapterResponseParameters) a11, a12, activity, new b(a12, aVar));
                return;
            }
            String str2 = "Failed to load " + beVar + ": adapter not loaded";
            t.h("MediationService", str2);
            b(beVar, new MaxErrorImpl(-5001, str2), aVar);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a10 = this.f9397a.E().a();
            if (a10 instanceof be) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (be) a10, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, be beVar) {
        a(maxError, beVar, false);
    }

    public void processAdapterInitializationPostback(ke keVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", (Map) hashMap, (MaxError) new MaxErrorImpl(str), keVar);
    }

    public void processCallbackAdImpressionPostback(be beVar, a.C0126a aVar) {
        if (beVar.O().endsWith("cimp")) {
            this.f9397a.o().b(beVar);
            bc.a((MaxAdRevenueListener) aVar, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f9397a.t0().c());
        if (!((Boolean) this.f9397a.a(oj.R3)).booleanValue()) {
            emptyIfNull = MaxReward.DEFAULT_LABEL;
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", (Map) hashMap, (ke) beVar);
    }

    public void processRawAdImpression(be beVar, a.C0126a aVar) {
        this.f9397a.o().b(beVar, "WILL_DISPLAY");
        if (beVar.O().endsWith("mimp")) {
            this.f9397a.o().b(beVar);
            bc.a((MaxAdRevenueListener) aVar, (MaxAd) beVar);
        }
        if (((Boolean) this.f9397a.a(oj.M4)).booleanValue()) {
            this.f9397a.T().a(re.f11179d, se.a(beVar), Long.valueOf(System.currentTimeMillis() - this.f9397a.J()));
        }
        HashMap hashMap = new HashMap(2);
        if (beVar instanceof de) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((de) beVar).i0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f9397a.t0().c());
        if (!((Boolean) this.f9397a.a(oj.R3)).booleanValue()) {
            emptyIfNull = MaxReward.DEFAULT_LABEL;
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", (Map) hashMap, (ke) beVar);
    }

    public void processViewabilityAdImpressionPostback(ie ieVar, long j10, a.C0126a aVar) {
        if (ieVar.O().endsWith("vimp")) {
            this.f9397a.o().b((be) ieVar);
            bc.a((MaxAdRevenueListener) aVar, (MaxAd) ieVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(ieVar.j0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f9397a.t0().c());
        if (!((Boolean) this.f9397a.a(oj.R3)).booleanValue()) {
            emptyIfNull = MaxReward.DEFAULT_LABEL;
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", (Map) hashMap, (ke) ieVar);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, long j10, long j11) {
        if (!CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            HashMap hashMap = new HashMap(8);
            CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap);
            String str2 = str;
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
            CollectionUtils.putStringIfValid(MediationMetaData.KEY_NAME, maxAdWaterfallInfoImpl.getName(), hashMap);
            CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j11), hashMap);
            CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j10), hashMap);
            CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap);
            List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
            ArrayList arrayList = new ArrayList(networkResponses.size());
            for (MaxNetworkResponseInfo next : networkResponses) {
                MaxMediatedNetworkInfo mediatedNetwork = next.getMediatedNetwork();
                HashMap hashMap2 = new HashMap(5);
                CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) next).getBCode(), hashMap2);
                hashMap2.put(MediationMetaData.KEY_NAME, mediatedNetwork.getName());
                CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(next.getLatencyMillis()), hashMap2);
                hashMap2.put("load_state", Integer.valueOf(next.getAdLoadState().ordinal()));
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) next.getError();
                if (maxErrorImpl != null) {
                    HashMap hashMap3 = new HashMap(4);
                    hashMap3.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                    hashMap3.put("error_message", maxErrorImpl.getMessage());
                    hashMap3.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                    hashMap3.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                    hashMap2.put("error_info", hashMap3);
                }
                arrayList.add(hashMap2);
            }
            hashMap.put("ads_info", arrayList);
            a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap, (MaxError) null, (ke) null, false);
        }
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f9400d.set(jSONObject);
    }

    public void showFullscreenAd(de deVar, Activity activity, a.C0126a aVar) {
        if (deVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null || MaxAdFormat.APP_OPEN == deVar.getFormat()) {
            this.f9397a.E().a(true);
            g b10 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                t tVar = this.f9398b;
                tVar.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new h(this, deVar, b10, activity, aVar), k02);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* access modifiers changed from: private */
    public void b(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, beVar);
        destroyAd(beVar);
        bc.a(maxAdListener, beVar.getAdUnitId(), maxError);
    }

    private void a(de deVar, a.C0126a aVar) {
        this.f9397a.E().a(false);
        a(deVar, (MaxAdListener) aVar);
        if (t.a()) {
            this.f9398b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(deVar, aVar);
    }

    private g b(de deVar) {
        g z10 = deVar.z();
        if (z10 != null) {
            return z10;
        }
        this.f9397a.E().a(false);
        if (t.a()) {
            t tVar = this.f9398b;
            tVar.k("MediationService", "Failed to show " + deVar + ": adapter not found");
        }
        t.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + deVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    public void showFullscreenAd(de deVar, ViewGroup viewGroup, i iVar, Activity activity, a.C0126a aVar) {
        if (deVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f9397a.E().a(true);
            g b10 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                t tVar = this.f9398b;
                tVar.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new i(this, deVar, b10, viewGroup, iVar, activity, aVar), k02);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, Long l10, MaxAdListener maxAdListener) {
        if (!deVar.t().get()) {
            String str = "Ad (" + deVar.k() + ") has not been displayed after " + l10 + "ms. Failing ad display...";
            t.h("MediationService", str);
            a((be) deVar, (MaxError) new MaxErrorImpl(-1, str), maxAdListener);
            this.f9397a.E().b((Object) deVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, Activity activity, a.C0126a aVar) {
        deVar.a(true);
        a(deVar);
        gVar.c((be) deVar, activity);
        a(deVar, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, ViewGroup viewGroup, i iVar, Activity activity, a.C0126a aVar) {
        deVar.a(true);
        a(deVar);
        gVar.a((be) deVar, viewGroup, iVar, activity);
        a(deVar, aVar);
    }

    private void a(de deVar, MaxAdListener maxAdListener) {
        Long l10 = (Long) this.f9397a.a(qe.f10976n7);
        if (l10.longValue() > 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new j(this, deVar, l10, maxAdListener), l10.longValue());
        }
    }

    private void a(de deVar) {
        if (deVar.getFormat() == MaxAdFormat.REWARDED || deVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f9397a.l0().a((xl) new mn(deVar, this.f9397a), sm.b.OTHER);
        }
    }

    /* access modifiers changed from: private */
    public void a(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f9397a.o().b(beVar, "DID_FAIL_DISPLAY");
        a(maxError, beVar, true);
        if (beVar.t().compareAndSet(false, true)) {
            bc.a(maxAdListener, (MaxAd) beVar, maxError);
        }
    }

    /* access modifiers changed from: private */
    public void a(be beVar, a.C0126a aVar) {
        this.f9397a.o().b(beVar, "DID_CLICKED");
        this.f9397a.o().b(beVar, "DID_CLICK");
        if (beVar.O().endsWith("click")) {
            this.f9397a.o().b(beVar);
            bc.a((MaxAdRevenueListener) aVar, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f9397a.t0().c());
        if (!((Boolean) this.f9397a.a(oj.R3)).booleanValue()) {
            emptyIfNull = MaxReward.DEFAULT_LABEL;
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", (Map) hashMap, (ke) beVar);
    }

    private void a(MaxError maxError, be beVar, boolean z10) {
        a("mierr", Collections.EMPTY_MAP, maxError, (ke) beVar, z10);
    }

    private void a(MaxError maxError, be beVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b10 = this.f9397a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.b()));
        }
        a("mlerr", (Map) hashMap, maxError, (ke) beVar);
    }

    /* access modifiers changed from: private */
    public void a(be beVar) {
        this.f9397a.o().b(beVar, "DID_LOAD");
        if (beVar.O().endsWith("load")) {
            this.f9397a.o().b(beVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b10 = this.f9397a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.b()));
        }
        a("load", (Map) hashMap, (ke) beVar);
    }

    /* access modifiers changed from: private */
    public void a(vj vjVar, wj wjVar, g gVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(vjVar.b()));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), hashMap);
        a("serr", (Map) hashMap, vjVar.c(), (ke) wjVar);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, boolean z10) {
        this.f9397a.l0().a((xl) new qm(str, list, map, map2, maxError, keVar, this.f9397a, z10), sm.b.OTHER);
    }

    private void a(String str, Map map, ke keVar) {
        a(str, map, (MaxError) null, keVar);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar) {
        a(str, map, maxError, keVar, true);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar, boolean z10) {
        Map map2 = CollectionUtils.map(map);
        String str2 = MaxReward.DEFAULT_LABEL;
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(keVar.getPlacement()) : str2);
        map2.put("{CUSTOM_DATA}", z10 ? StringUtils.emptyIfNull(keVar.e()) : str2);
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            if (z10) {
                str2 = StringUtils.emptyIfNull(beVar.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", str2);
        }
        a(str, (List) null, map2, (Map) null, maxError, keVar, z10);
    }
}
