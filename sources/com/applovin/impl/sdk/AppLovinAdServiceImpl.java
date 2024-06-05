package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.h0;
import com.applovin.impl.h8;
import com.applovin.impl.mb;
import com.applovin.impl.n9;
import com.applovin.impl.nm;
import com.applovin.impl.oj;
import com.applovin.impl.pm;
import com.applovin.impl.qj;
import com.applovin.impl.s;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.tm;
import com.applovin.impl.up;
import com.applovin.impl.w;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinAdServiceImpl implements AppLovinAdService, a.C0136a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f11375a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f11376b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f11377c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11378d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map f11379e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference f11380f = new AtomicReference();

    class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f11381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f11382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n9 f11383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f11384d;

        a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
            this.f11381a = bVar;
            this.f11382b = uri;
            this.f11383c = n9Var;
            this.f11384d = context;
        }

        public void onAppDetailsDismissed() {
            AppLovinAdServiceImpl.this.f11375a.f0().resumeForClick();
        }

        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f11375a.f0().pauseForClick();
        }

        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.f11376b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.f11376b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f11381a, this.f11382b, this.f11383c, this.f11384d);
        }
    }

    class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f11386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f11387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppLovinAdView f11388c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f11389d;

        b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f11386a = aVar;
            this.f11387b = bVar;
            this.f11388c = appLovinAdView;
            this.f11389d = uri;
        }

        public void onAppDetailsDismissed() {
            if (this.f11386a != null) {
                AppLovinAdServiceImpl.this.f11375a.f0().resumeForClick();
                bc.a(this.f11386a.e(), (AppLovinAd) this.f11387b, this.f11388c);
            }
        }

        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f11375a.f0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.f11386a;
            if (aVar != null) {
                aVar.x();
                bc.c(this.f11386a.e(), (AppLovinAd) this.f11387b, this.f11388c);
            }
        }

        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.f11376b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.f11376b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f11387b, this.f11388c, this.f11386a, this.f11389d);
        }
    }

    private class c implements mb {

        /* renamed from: a  reason: collision with root package name */
        private AppLovinAdLoadListener f11391a;

        public c(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f11391a = appLovinAdLoadListener;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f11375a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f11375a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f11375a);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f11391a;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(appLovinAd);
            } else if (((Boolean) AppLovinAdServiceImpl.this.f11375a.a(oj.D)).booleanValue()) {
                throw new IllegalStateException("Unable to notify listener about ad load");
            }
        }

        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
        }

        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            AppLovinAdServiceImpl.this.b(appLovinError, this.f11391a);
            this.f11391a = null;
        }
    }

    private class d implements mb {

        /* renamed from: a  reason: collision with root package name */
        private final h0 f11393a;

        /* renamed from: b  reason: collision with root package name */
        private final e f11394b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11395c;

        private d(h0 h0Var, e eVar) {
            this.f11393a = h0Var;
            this.f11394b = eVar;
            if (Boolean.parseBoolean(AppLovinAdServiceImpl.this.f11375a.g0().getExtraParameters().get("disable_auto_retries"))) {
                this.f11395c = -1;
            } else {
                this.f11395c = ((Integer) AppLovinAdServiceImpl.this.f11375a.a(oj.G)).intValue();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinAdServiceImpl.this.a(this.f11393a, this);
        }

        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f11375a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f11375a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f11375a);
            }
            Collection<AppLovinAdLoadListener> emptySet = Collections.emptySet();
            synchronized (this.f11394b.f11397a) {
                if (!this.f11394b.f11400d) {
                    emptySet = new HashSet<>(this.f11394b.f11401e);
                    this.f11394b.f11401e.clear();
                }
                e eVar = this.f11394b;
                eVar.f11399c = 0;
                eVar.f11398b = false;
                eVar.f11400d = false;
            }
            for (AppLovinAdLoadListener a10 : emptySet) {
                AppLovinAdServiceImpl.this.a(appLovinAd, a10);
            }
        }

        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
            r2 = r6.f11394b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError r7) {
            /*
                r6 = this;
                java.util.Collections.emptySet()
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r0 = r6.f11394b
                java.lang.Object r0 = r0.f11397a
                monitor-enter(r0)
                com.applovin.impl.h0 r1 = r6.f11393a     // Catch:{ all -> 0x00c1 }
                com.applovin.sdk.AppLovinAdSize r1 = r1.f()     // Catch:{ all -> 0x00c1 }
                boolean r2 = r6.a((com.applovin.sdk.AppLovinAdSize) r1)     // Catch:{ all -> 0x00c1 }
                if (r2 == 0) goto L_0x0090
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r2 = r6.f11394b     // Catch:{ all -> 0x00c1 }
                int r3 = r2.f11399c     // Catch:{ all -> 0x00c1 }
                int r4 = r6.f11395c     // Catch:{ all -> 0x00c1 }
                if (r3 >= r4) goto L_0x0090
                int r3 = r3 + 1
                r2.f11399c = r3     // Catch:{ all -> 0x00c1 }
                r4 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = (double) r3     // Catch:{ all -> 0x00c1 }
                double r2 = java.lang.Math.pow(r4, r2)     // Catch:{ all -> 0x00c1 }
                int r7 = (int) r2     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl r2 = com.applovin.impl.sdk.AppLovinAdServiceImpl.this     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.t unused = r2.f11376b     // Catch:{ all -> 0x00c1 }
                boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00c1 }
                if (r2 == 0) goto L_0x0080
                com.applovin.impl.sdk.AppLovinAdServiceImpl r2 = com.applovin.impl.sdk.AppLovinAdServiceImpl.this     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.t r2 = r2.f11376b     // Catch:{ all -> 0x00c1 }
                java.lang.String r3 = "AppLovinAdService"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
                r4.<init>()     // Catch:{ all -> 0x00c1 }
                java.lang.String r5 = "Failed to load ad of zone {"
                r4.append(r5)     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.h0 r5 = r6.f11393a     // Catch:{ all -> 0x00c1 }
                java.lang.String r5 = r5.e()     // Catch:{ all -> 0x00c1 }
                r4.append(r5)     // Catch:{ all -> 0x00c1 }
                java.lang.String r5 = "} with size "
                r4.append(r5)     // Catch:{ all -> 0x00c1 }
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                java.lang.String r1 = ". Current retry attempt: "
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r1 = r6.f11394b     // Catch:{ all -> 0x00c1 }
                int r1 = r1.f11399c     // Catch:{ all -> 0x00c1 }
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                java.lang.String r1 = " of "
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                int r1 = r6.f11395c     // Catch:{ all -> 0x00c1 }
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                java.lang.String r1 = ". Retrying again in "
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                r4.append(r7)     // Catch:{ all -> 0x00c1 }
                java.lang.String r1 = " seconds..."
                r4.append(r1)     // Catch:{ all -> 0x00c1 }
                java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c1 }
                r2.a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x00c1 }
            L_0x0080:
                com.applovin.impl.sdk.b0 r1 = new com.applovin.impl.sdk.b0     // Catch:{ all -> 0x00c1 }
                r1.<init>(r6)     // Catch:{ all -> 0x00c1 }
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00c1 }
                long r3 = (long) r7     // Catch:{ all -> 0x00c1 }
                long r2 = r2.toMillis(r3)     // Catch:{ all -> 0x00c1 }
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)     // Catch:{ all -> 0x00c1 }
                goto L_0x00bf
            L_0x0090:
                java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r2 = r6.f11394b     // Catch:{ all -> 0x00c1 }
                java.util.Collection r2 = r2.f11401e     // Catch:{ all -> 0x00c1 }
                r1.<init>(r2)     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r2 = r6.f11394b     // Catch:{ all -> 0x00c1 }
                java.util.Collection r2 = r2.f11401e     // Catch:{ all -> 0x00c1 }
                r2.clear()     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl$e r2 = r6.f11394b     // Catch:{ all -> 0x00c1 }
                r3 = 0
                r2.f11399c = r3     // Catch:{ all -> 0x00c1 }
                r2.f11398b = r3     // Catch:{ all -> 0x00c1 }
                r2.f11400d = r3     // Catch:{ all -> 0x00c1 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c1 }
            L_0x00ad:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c1 }
                if (r2 == 0) goto L_0x00bf
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c1 }
                com.applovin.sdk.AppLovinAdLoadListener r2 = (com.applovin.sdk.AppLovinAdLoadListener) r2     // Catch:{ all -> 0x00c1 }
                com.applovin.impl.sdk.AppLovinAdServiceImpl r3 = com.applovin.impl.sdk.AppLovinAdServiceImpl.this     // Catch:{ all -> 0x00c1 }
                r3.b((com.applovin.impl.sdk.AppLovinError) r7, (com.applovin.sdk.AppLovinAdLoadListener) r2)     // Catch:{ all -> 0x00c1 }
                goto L_0x00ad
            L_0x00bf:
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x00c1:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinAdServiceImpl.d.failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError):void");
        }

        private boolean a(AppLovinAdSize appLovinAdSize) {
            if (appLovinAdSize == null) {
                return ((Boolean) AppLovinAdServiceImpl.this.f11375a.a(oj.I)).booleanValue();
            }
            return AppLovinAdServiceImpl.this.f11375a.c(oj.H).contains(appLovinAdSize.getLabel());
        }

        /* synthetic */ d(AppLovinAdServiceImpl appLovinAdServiceImpl, h0 h0Var, e eVar, a aVar) {
            this(h0Var, eVar);
        }
    }

    AppLovinAdServiceImpl(k kVar) {
        this.f11375a = kVar;
        this.f11376b = kVar.L();
        HashMap hashMap = new HashMap(6);
        this.f11377c = hashMap;
        hashMap.put(h0.c(), new e((a) null));
        hashMap.put(h0.k(), new e((a) null));
        hashMap.put(h0.j(), new e((a) null));
        hashMap.put(h0.m(), new e((a) null));
        hashMap.put(h0.b(), new e((a) null));
        hashMap.put(h0.h(), new e((a) null));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f11379e.putAll(map);
    }

    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        if (this.f11375a.y() != null) {
            this.f11375a.y().a(appLovinBidTokenCollectionListener);
        } else {
            this.f11375a.x().a(appLovinBidTokenCollectionListener);
        }
    }

    public AppLovinAd dequeueAd(h0 h0Var) {
        AppLovinAdImpl a10 = this.f11375a.g().a(h0Var);
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "Dequeued ad: " + a10 + " for zone: " + h0Var + "...");
        }
        return a10;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f11380f.getAndSet((Object) null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f11379e) {
            map = CollectionUtils.map(this.f11379e);
            this.f11379e.clear();
        }
        return map;
    }

    public String getBidToken() {
        String str;
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (this.f11375a.y() != null) {
            str = this.f11375a.y().h();
        } else {
            str = this.f11375a.x().C();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(str) && t.a()) {
            this.f11376b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return str;
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            t.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        w wVar = new w(trim, this.f11375a);
        AppLovinAdLoadListener cVar = ((Boolean) this.f11375a.a(oj.C)).booleanValue() ? new c(appLovinAdLoadListener) : appLovinAdLoadListener;
        if (wVar.c() == w.a.REGULAR) {
            if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Loading next ad for token: " + wVar);
            }
            a((xl) new pm(wVar, cVar, this.f11375a));
        } else if (wVar.c() == w.a.AD_RESPONSE_JSON) {
            JSONObject a10 = wVar.a();
            if (a10 != null) {
                c4.c(a10, this.f11375a);
                c4.b(a10, this.f11375a);
                c4.a(a10, this.f11375a);
                e.b(this.f11375a);
                if (JsonUtils.getJSONArray(a10, "ads", new JSONArray()).length() > 0) {
                    if (t.a()) {
                        this.f11376b.a("AppLovinAdService", "Rendering ad for token: " + wVar);
                    }
                    a((xl) new tm(a10, zp.a(a10, this.f11375a), cVar, this.f11375a));
                    return;
                }
                if (t.a()) {
                    this.f11376b.b("AppLovinAdService", "No ad returned from the server for token: " + wVar);
                }
                c(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError = new AppLovinError(-8, str2);
            t.h("AppLovinAdService", str2);
            c(appLovinError, appLovinAdLoadListener);
        } else {
            AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
            t.h("AppLovinAdService", "Invalid token type");
            c(appLovinError2, appLovinAdLoadListener);
        }
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (t.a()) {
                t tVar = this.f11376b;
                tVar.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            a(h0.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (((Boolean) this.f11375a.a(oj.f10402s2)).booleanValue() && (l10 = (Long) this.f11375a.b(qj.M)) != null && System.currentTimeMillis() - l10.longValue() <= ((Long) this.f11375a.a(oj.f10410t2)).longValue() && b()) {
            a();
        }
    }

    public void maybeSubmitPersistentPostbacks(List<s> list) {
        if (list != null && !list.isEmpty()) {
            for (s a10 : list) {
                a(a10);
            }
        }
    }

    public void onAdExpired(h8 h8Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) h8Var;
        h0 adZone = appLovinAdImpl.getAdZone();
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f11375a.g().b(appLovinAdImpl);
        if (!this.f11375a.D0() && ((Boolean) this.f11375a.a(oj.f10385q1)).booleanValue()) {
            e a10 = a(adZone);
            synchronized (a10.f11397a) {
                if (!a10.f11398b) {
                    this.f11375a.L();
                    if (t.a()) {
                        t L = this.f11375a.L();
                        L.a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    a10.f11398b = true;
                    a10.f11400d = true;
                    a(adZone, new d(this, adZone, a10, (a) null));
                } else if (t.a()) {
                    this.f11376b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f11380f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f11377c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent, boolean z10, Bundle bundle) {
        if (bVar != null) {
            if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
                if (t.a()) {
                    this.f11376b.a("AppLovinAdService", "Tracking click on an ad...");
                }
                boolean z11 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
                maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z10, z11));
                if (this.f11375a.b0() != null) {
                    this.f11375a.b0().b(bVar.d(motionEvent, false, z11), (InputEvent) motionEvent);
                }
            } else if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
            }
            if (appLovinAdView == null || uri == null) {
                if (t.a()) {
                    this.f11376b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
                }
            } else if (bVar.isDirectDownloadEnabled()) {
                this.f11375a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
            } else {
                a(bVar, appLovinAdView, aVar, uri);
            }
        } else if (t.a()) {
            this.f11376b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, Bundle bundle, n9 n9Var, Context context) {
        if (bVar != null) {
            if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
                if (t.a()) {
                    this.f11376b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
                }
                boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
                maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z10));
                if (this.f11375a.b0() != null) {
                    this.f11375a.b0().b(bVar.d(motionEvent, true, z10), (InputEvent) motionEvent);
                }
            } else if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
            if (bVar.isDirectDownloadEnabled()) {
                this.f11375a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new a(bVar, uri, n9Var, context));
            } else {
                a(bVar, uri, n9Var, context);
            }
        } else if (t.a()) {
            this.f11376b.b("AppLovinAdService", "Unable to track video click. No ad specified");
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar != null) {
            if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Tracking ad closed...");
            }
            List<s> c10 = bVar.c();
            if (c10 != null && !c10.isEmpty()) {
                for (s sVar : c10) {
                    long j12 = j10;
                    long j13 = j11;
                    List<Long> list2 = list;
                    boolean z11 = z10;
                    int i11 = i10;
                    String a10 = a(sVar.c(), j12, j13, (List) list2, z11, i11);
                    String a11 = a(sVar.a(), j12, j13, (List) list2, z11, i11);
                    if (StringUtils.isValidString(a10)) {
                        a(new s(a10, a11));
                    } else if (t.a()) {
                        t tVar = this.f11376b;
                        tVar.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                    }
                }
            } else if (t.a()) {
                t tVar2 = this.f11376b;
                tVar2.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
            }
        } else if (t.a()) {
            this.f11376b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.F());
            if (this.f11375a.b0() != null) {
                this.f11375a.b0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        } else if (t.a()) {
            this.f11376b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar != null) {
            if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Tracking video end on ad...");
            }
            List<s> n02 = bVar.n0();
            if (n02 != null && !n02.isEmpty()) {
                String l10 = Long.toString(System.currentTimeMillis());
                for (s sVar : n02) {
                    if (StringUtils.isValidString(sVar.c())) {
                        long j11 = j10;
                        int i11 = i10;
                        String str = l10;
                        boolean z11 = z10;
                        String a10 = a(sVar.c(), j11, i11, str, z11);
                        String a11 = a(sVar.a(), j11, i11, str, z11);
                        if (a10 != null) {
                            a(new s(a10, a11));
                        } else if (t.a()) {
                            t tVar = this.f11376b;
                            tVar.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                        }
                    } else if (t.a()) {
                        this.f11376b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                    }
                }
            } else if (t.a()) {
                t tVar2 = this.f11376b;
                tVar2.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
            }
        } else if (t.a()) {
            this.f11376b.b("AppLovinAdService", "Unable to track video end. No ad specified");
        }
    }

    /* access modifiers changed from: private */
    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new z(this, appLovinError, appLovinAdLoadListener));
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        final Object f11397a;

        /* renamed from: b  reason: collision with root package name */
        boolean f11398b;

        /* renamed from: c  reason: collision with root package name */
        int f11399c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11400d;

        /* renamed from: e  reason: collision with root package name */
        final Collection f11401e;

        private e() {
            this.f11397a = new Object();
            this.f11401e = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f11398b + ", isReloadingExpiredAd=" + this.f11400d + ", pendingAdListeners=" + this.f11401e + '}';
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public void a(h0 h0Var, d dVar) {
        AppLovinAdImpl e10 = this.f11375a.g().e(h0Var);
        if (e10 == null || e10.isExpired()) {
            a((xl) new nm(h0Var, dVar, this.f11375a));
            return;
        }
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "Using pre-loaded ad: " + e10 + " for " + h0Var);
        }
        dVar.adReceived(e10);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f11375a.L();
            if (t.a()) {
                t L = this.f11375a.L();
                L.k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f11375a.B().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private boolean b() {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        Context k10 = k.k();
        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) ((ActivityManager) k10.getSystemService("activity")).getHistoricalProcessExitReasons(k10.getPackageName(), 0, 1).get(0);
        if (applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(n9 n9Var) {
        if (n9Var != null) {
            if (t.a()) {
                this.f11376b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            n9Var.f();
        }
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, n9Var);
        } else if (up.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f11375a);
        } else {
            up.a(uri, context, this.f11375a);
        }
    }

    private void a(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (h0Var == null) {
            throw new IllegalArgumentException("No zone specified");
        } else if (appLovinAdLoadListener != null) {
            this.f11375a.L();
            if (t.a()) {
                t L = this.f11375a.L();
                L.a("AppLovinAdService", "Loading next ad of zone {" + h0Var + "}...");
            }
            e a10 = a(h0Var);
            synchronized (a10.f11397a) {
                a10.f11401e.add(appLovinAdLoadListener);
                if (!a10.f11398b) {
                    a10.f11398b = true;
                    a(h0Var, new d(this, h0Var, a10, (a) null));
                } else if (t.a()) {
                    this.f11376b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    private void a(xl xlVar) {
        if (!this.f11375a.y0()) {
            t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f11375a.c();
        this.f11375a.l0().a(xlVar, sm.b.CORE);
    }

    private void a(s sVar) {
        if (StringUtils.isValidString(sVar.c())) {
            this.f11375a.Z().e(com.applovin.impl.sdk.network.d.b().d(sVar.c()).a(StringUtils.isValidString(sVar.a()) ? sVar.a() : null).a(sVar.b()).a(false).b(sVar.d()).a());
        } else if (t.a()) {
            this.f11376b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private e a(h0 h0Var) {
        e eVar;
        synchronized (this.f11378d) {
            eVar = (e) this.f11377c.get(h0Var);
            if (eVar == null) {
                eVar = new e((a) null);
                this.f11377c.put(h0Var, eVar);
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new a0(this, appLovinAdLoadListener, appLovinAd));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f11375a.B().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("notifyAdLoadFailedCallback");
            sb2.append(appLovinAdLoadListener instanceof mb ? "V2" : MaxReward.DEFAULT_LABEL);
            this.f11375a.B().a("AppLovinAdService", sb2.toString(), th);
        }
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.f11375a.a(oj.N)).booleanValue()) {
            context = ar.a((View) appLovinAdView, this.f11375a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (n9) null);
        } else if (up.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f11375a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th) {
            if (t.a()) {
                t tVar = this.f11376b;
                tVar.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f11375a.B().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (up.a(uri, context, this.f11375a)) {
            bc.b(aVar.e(), (AppLovinAd) bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(String str) {
        String str2 = this.f11375a.g0().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, n9 n9Var) {
        if (t.a()) {
            t tVar = this.f11376b;
            tVar.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f11375a.g0().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (n9Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new y(this, n9Var));
            } else if (aVar != null && !zp.a(bVar.getSize())) {
                if (t.a()) {
                    this.f11376b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.y();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri b10 = b(uri, "primaryUrl");
        List a10 = a(uri, "primaryTrackingUrl");
        Uri b11 = b(uri, "fallbackUrl");
        List a11 = a(uri, "fallbackTrackingUrl");
        if (b10 == null && b11 == null) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!a(b10, "primary", a10, bVar, appLovinAdView, aVar, context, kVar)) {
            a(b11, "backup", a11, bVar, appLovinAdView, aVar, context, kVar);
        }
        if (aVar != null) {
            aVar.x();
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean a10 = up.a(uri, context, kVar);
        if (a10) {
            kVar.L();
            if (t.a()) {
                t L2 = kVar.L();
                L2.a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.a0().dispatchPostbackAsync(((Uri) it.next()).toString(), (AppLovinPostbackListener) null);
            }
            if (aVar != null) {
                bc.b(aVar.e(), (AppLovinAd) bVar, appLovinAdView);
            }
        } else {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinAdService", "URL failed to open");
            }
        }
        return a10;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String parse : queryParameters) {
            try {
                arrayList.add(Uri.parse(parse));
            } catch (Throwable th) {
                this.f11375a.L();
                if (t.a()) {
                    t L = this.f11375a.L();
                    L.k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f11375a.B().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i10 != f.f11593i) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(f.a(i10)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        if (t.a()) {
            this.f11376b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f11375a.b(qj.N);
        if (str != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, (JSONObject) null);
            a(new s(JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", (String) null), JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", (String) null)));
        } else if (t.a()) {
            this.f11376b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}
