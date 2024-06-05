package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.em;
import com.applovin.impl.km;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f9553a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f9554b = new HashMap(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f9555c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map f9556d = new HashMap(4);

    /* renamed from: e  reason: collision with root package name */
    private final Object f9557e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map f9558f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Object f9559g = new Object();

    class a implements em.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f9560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f9561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f9563d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f9564e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f9565f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f9566g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.C0126a f9567h;

        a(long j10, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.C0126a aVar) {
            this.f9560a = j10;
            this.f9561b = map;
            this.f9562c = str;
            this.f9563d = maxAdFormat;
            this.f9564e = map2;
            this.f9565f = map3;
            this.f9566g = context;
            this.f9567h = aVar;
        }

        public void a(JSONArray jSONArray) {
            this.f9561b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9560a));
            this.f9561b.put("calfc", Integer.valueOf(d.this.b(this.f9562c)));
            km kmVar = new km(this.f9562c, this.f9563d, this.f9564e, this.f9565f, this.f9561b, jSONArray, this.f9566g, d.this.f9553a, this.f9567h);
            if (((Boolean) d.this.f9553a.a(qe.J7)).booleanValue()) {
                d.this.f9553a.l0().a((xl) kmVar, sm.b.MEDIATION);
            } else {
                d.this.f9553a.l0().a((xl) kmVar);
            }
        }
    }

    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f9576a;

        private b(String str) {
            this.f9576a = str;
        }

        public String b() {
            return this.f9576a;
        }
    }

    private static class c implements a.C0126a {

        /* renamed from: a  reason: collision with root package name */
        private final k f9577a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f9578b;

        /* renamed from: c  reason: collision with root package name */
        private final d f9579c;

        /* renamed from: d  reason: collision with root package name */
        private final C0127d f9580d;

        /* renamed from: f  reason: collision with root package name */
        private final MaxAdFormat f9581f;

        /* renamed from: g  reason: collision with root package name */
        private final Map f9582g;

        /* renamed from: h  reason: collision with root package name */
        private final Map f9583h;

        /* renamed from: i  reason: collision with root package name */
        private final Map f9584i;

        /* renamed from: j  reason: collision with root package name */
        private final int f9585j;

        /* renamed from: k  reason: collision with root package name */
        private long f9586k;

        /* renamed from: l  reason: collision with root package name */
        private long f9587l;

        /* synthetic */ c(Map map, Map map2, Map map3, C0127d dVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar2, k kVar, Context context, a aVar) {
            this(map, map2, map3, dVar, maxAdFormat, j10, j11, dVar2, kVar, context);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f9583h.put("retry_delay_sec", Integer.valueOf(i10));
            this.f9583h.put("retry_attempt", Integer.valueOf(this.f9580d.f9591d));
            Context context = (Context) this.f9578b.get();
            if (context == null) {
                context = k.k();
            }
            this.f9584i.put("art", b.EXPONENTIAL_RETRY.b());
            this.f9584i.put("era", Integer.valueOf(this.f9580d.f9591d));
            this.f9587l = System.currentTimeMillis();
            String str2 = str;
            this.f9579c.a(str2, this.f9581f, this.f9582g, this.f9583h, this.f9584i, context, this);
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f9579c.c(str);
            if (!((Boolean) this.f9577a.a(qe.f10988z7)).booleanValue() || !this.f9580d.f9590c.get()) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9586k;
                MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
                if (maxAdWaterfallInfoImpl != null) {
                    this.f9577a.S().processWaterfallInfoPostback(str, this.f9581f, maxAdWaterfallInfoImpl, this.f9587l, elapsedRealtime);
                }
                boolean z10 = maxError.getCode() == -5603 && zp.c(this.f9577a) && ((Boolean) this.f9577a.a(oj.f10374o6)).booleanValue();
                if (!this.f9577a.a(qe.f10987y7, this.f9581f) || this.f9580d.f9591d >= this.f9585j || z10) {
                    int unused = this.f9580d.f9591d = 0;
                    this.f9580d.f9589b.set(false);
                    if (this.f9580d.f9592e != null) {
                        MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                        maxErrorImpl.setLoadTag(this.f9580d.f9588a);
                        maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                        bc.a((MaxAdListener) this.f9580d.f9592e, str, maxError);
                        a.C0126a unused2 = this.f9580d.f9592e = null;
                        return;
                    }
                    return;
                }
                C0127d.f(this.f9580d);
                int pow = (int) Math.pow(2.0d, (double) this.f9580d.f9591d);
                AppLovinSdkUtils.runOnUiThreadDelayed(new n(this, pow, str), TimeUnit.SECONDS.toMillis((long) pow));
                return;
            }
            this.f9577a.L();
            if (t.a()) {
                this.f9577a.L().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
            }
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (!((Boolean) this.f9577a.a(qe.f10988z7)).booleanValue() || !this.f9580d.f9590c.get()) {
                be beVar = (be) maxAd;
                beVar.i(this.f9580d.f9588a);
                beVar.a(SystemClock.elapsedRealtime() - this.f9586k);
                MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) beVar.getWaterfall();
                if (maxAdWaterfallInfoImpl != null) {
                    this.f9577a.S().processWaterfallInfoPostback(beVar.getAdUnitId(), this.f9581f, maxAdWaterfallInfoImpl, this.f9587l, beVar.getRequestLatencyMillis());
                }
                this.f9579c.a(maxAd.getAdUnitId());
                int unused = this.f9580d.f9591d = 0;
                if (this.f9580d.f9592e != null) {
                    beVar.z().c().a(this.f9580d.f9592e);
                    this.f9580d.f9592e.onAdLoaded(beVar);
                    if (beVar.O().endsWith("load")) {
                        this.f9580d.f9592e.onAdRevenuePaid(beVar);
                    }
                    a.C0126a unused2 = this.f9580d.f9592e = null;
                    if ((this.f9577a.c(qe.f10985w7).contains(maxAd.getAdUnitId()) || this.f9577a.a(qe.f10984v7, maxAd.getFormat())) && !this.f9577a.n0().c() && !this.f9577a.n0().d()) {
                        Context context = (Context) this.f9578b.get();
                        if (context == null) {
                            context = k.k();
                        }
                        this.f9586k = SystemClock.elapsedRealtime();
                        this.f9587l = System.currentTimeMillis();
                        this.f9584i.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
                        this.f9579c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9582g, this.f9583h, this.f9584i, context, this);
                        return;
                    }
                    this.f9580d.f9589b.set(false);
                    return;
                }
                this.f9579c.a(beVar);
                this.f9580d.f9589b.set(false);
                return;
            }
            this.f9577a.L();
            if (t.a()) {
                this.f9577a.L().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
            }
            this.f9577a.S().destroyAd(maxAd);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0127d dVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar2, k kVar, Context context) {
            this.f9577a = kVar;
            this.f9578b = new WeakReference(context);
            this.f9579c = dVar2;
            this.f9580d = dVar;
            this.f9581f = maxAdFormat;
            this.f9583h = map2;
            this.f9582g = map;
            this.f9584i = map3;
            this.f9586k = j10;
            this.f9587l = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9585j = -1;
            } else if (!maxAdFormat.isAdViewAd() || !CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9585j = ((Integer) kVar.a(qe.f10986x7)).intValue();
            } else {
                this.f9585j = Math.min(2, ((Integer) kVar.a(qe.f10986x7)).intValue());
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$d  reason: collision with other inner class name */
    private static class C0127d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f9588a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AtomicBoolean f9589b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final AtomicBoolean f9590c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f9591d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public volatile a.C0126a f9592e;

        /* synthetic */ C0127d(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int f(C0127d dVar) {
            int i10 = dVar.f9591d;
            dVar.f9591d = i10 + 1;
            return i10;
        }

        private C0127d(String str) {
            this.f9589b = new AtomicBoolean();
            this.f9590c = new AtomicBoolean();
            this.f9588a = str;
        }
    }

    public d(k kVar) {
        this.f9553a = kVar;
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = MaxReward.DEFAULT_LABEL;
        }
        sb2.append(str3);
        return sb2.toString();
    }

    private be e(String str) {
        be beVar;
        synchronized (this.f9557e) {
            beVar = (be) this.f9556d.get(str);
            this.f9556d.remove(str);
        }
        return beVar;
    }

    public void c(String str, String str2) {
        synchronized (this.f9555c) {
            String b10 = b(str, str2);
            a(str, str2).f9590c.set(true);
            this.f9554b.remove(b10);
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f9557e) {
            z10 = this.f9556d.get(str) != null;
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public void a(be beVar) {
        synchronized (this.f9557e) {
            if (this.f9556d.containsKey(beVar.getAdUnitId())) {
                t.h("AppLovinSdk", "Ad in cache already: " + beVar.getAdUnitId());
            }
            this.f9556d.put(beVar.getAdUnitId(), beVar);
        }
    }

    public int b(String str) {
        int intValue;
        synchronized (this.f9559g) {
            Integer num = (Integer) this.f9558f.get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public void c(String str) {
        synchronized (this.f9559g) {
            this.f9553a.L();
            if (t.a()) {
                t L = this.f9553a.L();
                L.a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f9558f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f9558f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.C0126a aVar) {
        String str3 = str2;
        a.C0126a aVar2 = aVar;
        be e10 = (this.f9553a.n0().d() || zp.f(k.k())) ? null : e(str);
        if (e10 != null) {
            e10.i(str3);
            e10.z().c().a(aVar2);
            aVar2.onAdLoaded(e10);
            if (e10.O().endsWith("load")) {
                aVar2.onAdRevenuePaid(e10);
            }
        }
        C0127d a10 = a(str, str2);
        if (a10.f9589b.compareAndSet(false, true)) {
            if (e10 == null) {
                a.C0126a unused = a10.f9592e = aVar2;
            }
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            synchronizedMap.put("art", bVar.b());
            if (StringUtils.isValidString(str2)) {
                synchronizedMap.put("alt", str3);
            }
            a(str, maxAdFormat, map, map2, synchronizedMap, context, new c(map, map2, synchronizedMap, a10, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9553a, context, (a) null));
            return;
        }
        if (!(a10.f9592e == null || a10.f9592e == aVar2)) {
            t.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a.C0126a unused2 = a10.f9592e = aVar2;
    }

    /* access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.C0126a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = str;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        Map map4 = map;
        this.f9553a.l0().a((xl) new em(str2, maxAdFormat2, map4, context, this.f9553a, new a(elapsedRealtime, map3, str2, maxAdFormat2, map4, map2, context, aVar)), sm.b.MEDIATION);
    }

    private C0127d a(String str, String str2) {
        C0127d dVar;
        synchronized (this.f9555c) {
            String b10 = b(str, str2);
            dVar = (C0127d) this.f9554b.get(b10);
            if (dVar == null) {
                dVar = new C0127d(str2, (a) null);
                this.f9554b.put(b10, dVar);
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9559g) {
            this.f9553a.L();
            if (t.a()) {
                t L = this.f9553a.L();
                L.a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f9558f.remove(str);
        }
    }
}
