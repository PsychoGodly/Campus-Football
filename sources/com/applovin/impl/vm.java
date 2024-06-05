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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class vm extends xl {

    /* renamed from: z  reason: collision with root package name */
    private static final AtomicBoolean f12780z = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f12781h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final MaxAdFormat f12782i;

    /* renamed from: j  reason: collision with root package name */
    private final JSONObject f12783j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final a.C0126a f12784k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final WeakReference f12785l;

    /* renamed from: m  reason: collision with root package name */
    private final String f12786m;

    /* renamed from: n  reason: collision with root package name */
    private final Queue f12787n = new LinkedList();

    /* renamed from: o  reason: collision with root package name */
    private final Object f12788o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private final Queue f12789p = new LinkedList();

    /* renamed from: q  reason: collision with root package name */
    private final Object f12790q = new Object();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final int f12791r;

    /* renamed from: s  reason: collision with root package name */
    private long f12792s;

    /* renamed from: t  reason: collision with root package name */
    private final List f12793t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final AtomicBoolean f12794u = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final AtomicBoolean f12795v = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f12796w = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public be f12797x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public ho f12798y;

    private class b extends xl {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final String f12799h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final long f12800i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public final be f12801j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final c f12802k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final int f12803l;

        class a extends je {
            a(a.C0126a aVar) {
                super(aVar);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a() {
                vm vmVar = vm.this;
                vmVar.b(vmVar.f12797x);
            }

            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f12800i;
                t unused = b.this.f13423c;
                if (t.a()) {
                    t h10 = b.this.f13423c;
                    String b10 = b.this.f12799h;
                    h10.a(b10, "Ad (" + b.this.f12803l + ") failed to load in " + elapsedRealtime + "ms for " + vm.this.f12782i + " ad unit " + str + " with error: " + maxError);
                }
                b bVar = b.this;
                bVar.b("failed to load ad: " + maxError.getCode());
                b bVar2 = b.this;
                vm.this.a(bVar2.f12801j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (!vm.this.f12796w.get()) {
                    if (vm.this.f12797x != null) {
                        b bVar3 = b.this;
                        if (b.this.b(vm.this.c(bVar3.f12802k))) {
                            vm vmVar = vm.this;
                            vmVar.b(vmVar.f12797x);
                            return;
                        }
                    }
                    b bVar4 = b.this;
                    if ((!vm.this.d(bVar4.f12802k)) && vm.this.f12795v.get() && vm.this.f12794u.get()) {
                        vm.this.b((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                    }
                }
            }

            public void onAdLoaded(MaxAd maxAd) {
                long j10;
                boolean z10;
                be beVar;
                int i10;
                b.this.b("loaded ad");
                be beVar2 = (be) maxAd;
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f12800i;
                t unused = b.this.f13423c;
                if (t.a()) {
                    t d10 = b.this.f13423c;
                    String b10 = b.this.f12799h;
                    d10.a(b10, "Ad (" + b.this.f12803l + ") loaded in " + elapsedRealtime + "ms for " + vm.this.f12782i + " ad unit " + vm.this.f12781h);
                }
                vm.this.a(beVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                b bVar = b.this;
                vm.this.b(bVar.f12802k);
                if (c.BIDDING == b.this.f12802k) {
                    z10 = vm.this.f12795v.get();
                    j10 = beVar2.R();
                } else {
                    z10 = vm.this.f12794u.get();
                    j10 = beVar2.D();
                }
                if (z10 || j10 == 0) {
                    if (b.this.b(beVar2)) {
                        beVar = beVar2;
                        beVar2 = vm.this.f12797x;
                    } else {
                        beVar = vm.this.f12797x;
                    }
                    vm.this.a(beVar2, beVar);
                    return;
                }
                be unused2 = vm.this.f12797x = beVar2;
                if (i10 >= 0) {
                    b bVar2 = b.this;
                    ho unused3 = vm.this.f12798y = ho.a(j10, bVar2.f13421a, new p60(this));
                }
            }
        }

        private b(be beVar, c cVar) {
            super(vm.this.f13422b, vm.this.f13421a, vm.this.f12781h);
            this.f12799h = this.f13422b + ":" + cVar;
            this.f12800i = SystemClock.elapsedRealtime();
            this.f12801j = beVar;
            this.f12802k = cVar;
            this.f12803l = beVar.I() + 1;
        }

        /* access modifiers changed from: private */
        public void b(String str) {
        }

        public void run() {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f12799h;
                tVar.a(str, "Loading ad " + this.f12803l + " of " + vm.this.f12791r + " from " + this.f12801j.c() + " for " + vm.this.f12782i + " ad unit " + vm.this.f12781h);
            }
            b("started to load ad");
            Context context = (Context) vm.this.f12785l.get();
            this.f13421a.S().loadThirdPartyMediatedAd(vm.this.f12781h, this.f12801j, context instanceof Activity ? (Activity) context : this.f13421a.p0(), new a(vm.this.f12784k));
        }

        /* access modifiers changed from: private */
        public boolean b(be beVar) {
            if (vm.this.f12797x == null) {
                return false;
            }
            if (beVar == null) {
                return true;
            }
            double M = vm.this.f12797x.M();
            double M2 = beVar.M();
            if (M < 0.0d || M2 < 0.0d) {
                if (vm.this.f12797x.I() < beVar.I()) {
                    return true;
                }
                return false;
            } else if (M > M2) {
                return true;
            } else {
                return false;
            }
        }
    }

    private enum c {
        BIDDING,
        TAG
    }

    public vm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, k kVar, a.C0126a aVar) {
        super("TaskProcessMediationWaterfallV2", kVar, str);
        this.f12781h = str;
        this.f12782i = maxAdFormat;
        this.f12783j = jSONObject;
        this.f12784k = aVar;
        this.f12785l = new WeakReference(context);
        this.f12786m = JsonUtils.getString(jSONObject, "mCode", MaxReward.DEFAULT_LABEL);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            be a10 = be.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar);
            if (a10.W()) {
                this.f12789p.add(a10);
            } else {
                this.f12787n.add(a10);
            }
        }
        int size = this.f12787n.size() + this.f12789p.size();
        this.f12791r = size;
        this.f12793t = new ArrayList(size);
    }

    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f12792s = SystemClock.elapsedRealtime();
        if (this.f12783j.optBoolean("is_testing", false) && !this.f13421a.n0().c() && f12780z.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new n60(this));
        }
        if (this.f12791r == 0) {
            if (t.a()) {
                this.f13423c.k(this.f13422b, "No ads were returned from the server for " + this.f12782i.getLabel() + " ad unit " + this.f12781h);
            }
            zp.a(this.f12781h, this.f12782i, this.f12783j, this.f13421a);
            JSONObject jSONObject = JsonUtils.getJSONObject(this.f12783j, "settings", new JSONObject());
            long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0);
            if (ve.a(this.f12783j, this.f12781h, this.f13421a)) {
                maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.f12781h + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
                if (zp.c(this.f13421a) && ((Boolean) this.f13421a.a(oj.f10374o6)).booleanValue()) {
                    j10 = 0;
                }
            } else {
                maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
            }
            if (j10 > 0) {
                long millis = TimeUnit.SECONDS.toMillis(j10);
                o60 o60 = new o60(this, maxErrorImpl);
                if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                    w1.a(millis, this.f13421a, o60);
                } else {
                    AppLovinSdkUtils.runOnUiThreadDelayed(o60, millis);
                }
            } else {
                b((MaxError) maxErrorImpl);
            }
        } else {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Starting waterfall for " + this.f12782i.getLabel() + " ad unit " + this.f12781h + " with " + this.f12791r + " ad(s)...");
            }
            d(c.TAG);
            d(c.BIDDING);
        }
    }

    /* access modifiers changed from: private */
    public boolean d(c cVar) {
        be a10 = a(cVar);
        if (a10 == null) {
            b(cVar);
            return false;
        }
        this.f13421a.l0().a((xl) new b(a10, cVar), sm.b.MEDIATION);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) this.f13421a.p0());
    }

    private void f() {
        ho hoVar = this.f12798y;
        if (hoVar != null) {
            hoVar.a();
            this.f12798y = null;
        }
    }

    private void g() {
        a(this.f12787n);
        a(this.f12789p);
    }

    /* access modifiers changed from: private */
    public be c(c cVar) {
        return a(cVar, true);
    }

    /* access modifiers changed from: private */
    public void b(be beVar) {
        a(beVar, (be) null);
    }

    /* access modifiers changed from: private */
    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.f12794u.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.f12795v.compareAndSet(false, true);
        }
    }

    private be a(c cVar) {
        return a(cVar, false);
    }

    private be a(c cVar, boolean z10) {
        Object obj;
        be beVar;
        Object obj2;
        be beVar2;
        if (cVar == c.BIDDING) {
            synchronized (this.f12790q) {
                if (z10) {
                    obj2 = this.f12789p.peek();
                } else {
                    obj2 = this.f12789p.poll();
                }
                beVar2 = (be) obj2;
            }
            return beVar2;
        }
        synchronized (this.f12788o) {
            if (z10) {
                obj = this.f12787n.peek();
            } else {
                obj = this.f12787n.poll();
            }
            beVar = (be) obj;
        }
        return beVar;
    }

    /* access modifiers changed from: private */
    public void a(be beVar, be beVar2) {
        if (this.f12796w.compareAndSet(false, true)) {
            f();
            g();
            this.f13421a.V().a(beVar, beVar2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12792s;
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.d(str, "Waterfall loaded in " + elapsedRealtime + "ms from " + beVar.c() + " for " + this.f12782i + " ad unit " + this.f12781h);
            }
            beVar.a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f12793t, this.f12786m));
            bc.f(this.f12784k, beVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(MaxError maxError) {
        int i10 = 0;
        if (this.f12796w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f13421a.F().c(aa.f6359u);
            } else if (maxError.getCode() == -5001) {
                this.f13421a.F().c(aa.f6360v);
            } else {
                this.f13421a.F().c(aa.f6361w);
            }
            ArrayList arrayList = new ArrayList(this.f12793t.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f12793t) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
                sb2.append("\n");
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
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12792s;
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.d(str, "Waterfall failed in " + elapsedRealtime + "ms for " + this.f12782i + " ad unit " + this.f12781h + " with error: " + maxError);
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((be) null, JsonUtils.getString(this.f12783j, "waterfall_name", MaxReward.DEFAULT_LABEL), JsonUtils.getString(this.f12783j, "waterfall_test_name", MaxReward.DEFAULT_LABEL), elapsedRealtime, this.f12793t, JsonUtils.optList(JsonUtils.getJSONArray(this.f12783j, "mwf_info_urls", (JSONArray) null), Collections.EMPTY_LIST), this.f12786m));
            bc.a((MaxAdListener) this.f12784k, this.f12781h, maxError);
        }
    }

    /* access modifiers changed from: private */
    public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
        this.f12793t.add(new MaxNetworkResponseInfoImpl(adLoadState2, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f13421a)), beVar.E(), beVar.W(), j10, beVar.A(), maxError));
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((be) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
        }
    }
}
