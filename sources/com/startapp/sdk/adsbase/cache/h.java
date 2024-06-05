package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.h0;
import com.startapp.i1;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.k;
import com.startapp.k1;
import com.startapp.p0;
import com.startapp.sdk.ads.interstitials.OverlayAd;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final AdPreferences.Placement f16951a;

    /* renamed from: b  reason: collision with root package name */
    public Context f16952b;

    /* renamed from: c  reason: collision with root package name */
    public ActivityExtra f16953c;

    /* renamed from: d  reason: collision with root package name */
    public AdPreferences f16954d;

    /* renamed from: e  reason: collision with root package name */
    public d f16955e = null;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f16956f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public long f16957g;

    /* renamed from: h  reason: collision with root package name */
    public String f16958h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16959i = false;

    /* renamed from: j  reason: collision with root package name */
    public k1 f16960j = null;

    /* renamed from: k  reason: collision with root package name */
    public i1 f16961k = null;

    /* renamed from: l  reason: collision with root package name */
    public final Map<AdEventListener, List<StartAppAd>> f16962l = new ConcurrentHashMap();

    /* renamed from: m  reason: collision with root package name */
    public int f16963m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16964n = true;

    /* renamed from: o  reason: collision with root package name */
    public Long f16965o;

    /* renamed from: p  reason: collision with root package name */
    public b f16966p;

    /* compiled from: Sta */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16967a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16968b = false;

        public a() {
        }

        public void onFailedToReceiveAd(Ad ad2) {
            List<StartAppAd> a10;
            ConcurrentHashMap concurrentHashMap;
            ConcurrentHashMap concurrentHashMap2 = null;
            if (!this.f16968b) {
                synchronized (h.this.f16962l) {
                    concurrentHashMap = new ConcurrentHashMap(h.this.f16962l);
                    h hVar = h.this;
                    hVar.f16955e = null;
                    hVar.f16962l.clear();
                }
                concurrentHashMap2 = concurrentHashMap;
            }
            if (concurrentHashMap2 != null) {
                for (AdEventListener adEventListener : concurrentHashMap2.keySet()) {
                    if (!(adEventListener == null || (a10 = h.this.a(concurrentHashMap2, adEventListener)) == null)) {
                        for (StartAppAd next : a10) {
                            if (ad2 != null) {
                                next.setErrorMessage(ad2.getErrorMessage());
                            }
                            k.a(h.this.f16952b, adEventListener, next, true);
                        }
                    }
                }
            }
            this.f16968b = true;
            h.this.f16961k.d();
            h.this.f16960j.e();
            h.this.f16956f.set(false);
        }

        public void onReceiveAd(Ad ad2) {
            d dVar = h.this.f16955e;
            boolean z10 = dVar != null && dVar.a();
            if (!this.f16967a && !z10) {
                this.f16967a = true;
                synchronized (h.this.f16962l) {
                    for (AdEventListener next : h.this.f16962l.keySet()) {
                        if (next != null) {
                            h hVar = h.this;
                            List<StartAppAd> a10 = hVar.a(hVar.f16962l, next);
                            if (a10 != null) {
                                for (StartAppAd errorMessage : a10) {
                                    errorMessage.setErrorMessage(ad2.getErrorMessage());
                                    k.b(h.this.f16952b, next, ad2, true);
                                }
                            }
                        }
                    }
                    h.this.f16962l.clear();
                }
            }
            h.this.f16960j.d();
            h.this.f16961k.f();
            h.this.f16956f.set(false);
        }
    }

    /* compiled from: Sta */
    public interface b {
    }

    public h(Context context, AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.f16951a = placement;
        this.f16954d = adPreferences;
        a(context);
        a();
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            Context a10 = h0.a(context);
            if (a10 == null) {
                a10 = context;
            }
            this.f16952b = a10;
            this.f16953c = new ActivityExtra((Activity) context);
            return;
        }
        this.f16952b = context;
        this.f16953c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r6 = this;
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x006c
            android.content.Context r0 = r6.f16952b
            com.startapp.sdk.adsbase.d r1 = r6.f16955e
            com.startapp.sdk.adsbase.Ad r1 = (com.startapp.sdk.adsbase.Ad) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0049
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.HtmlAd
            if (r5 == 0) goto L_0x0031
            com.startapp.sdk.adsbase.HtmlAd r1 = (com.startapp.sdk.adsbase.HtmlAd) r1
            java.lang.String r1 = r1.k()
            java.util.List r1 = com.startapp.d0.a(r1, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Boolean r0 = com.startapp.d0.a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r5)
            boolean r0 = r0.booleanValue()
            goto L_0x004a
        L_0x0031:
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.JsonAd
            if (r5 == 0) goto L_0x0049
            com.startapp.sdk.adsbase.JsonAd r1 = (com.startapp.sdk.adsbase.JsonAd) r1
            java.util.List r1 = r1.g()
            java.util.List r0 = com.startapp.d0.a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.model.AdDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (boolean) r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0067
            com.startapp.sdk.adsbase.d r0 = r6.f16955e
            if (r0 != 0) goto L_0x0052
            r0 = 0
            goto L_0x0056
        L_0x0052:
            boolean r0 = r0.d()
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x0067
        L_0x0059:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f16956f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.k1 r0 = r6.f16960j
            r0.d()
            goto L_0x0079
        L_0x0067:
            r0 = 0
            r6.a(r0, r0, r2, r3)
            goto L_0x0079
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f16956f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.i1 r0 = r6.f16961k
            r0.d()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.h.b():void");
    }

    public boolean c() {
        d dVar = this.f16955e;
        return dVar != null && dVar.isReady();
    }

    public final void a(boolean z10) {
        d dVar;
        boolean z11;
        boolean z12 = false;
        if (z10) {
            Long h10 = AdsCommonMetaData.f16770h.h();
            if (h10 == null || this.f16965o == null || SystemClock.elapsedRealtime() - this.f16965o.longValue() >= h10.longValue()) {
                this.f16965o = Long.valueOf(SystemClock.elapsedRealtime());
                z11 = false;
            } else {
                k.a(this.f16952b, new a(), new CachedAd$3(this, this.f16952b, this.f16951a), true);
                Context context = this.f16952b;
                StringBuilder a10 = p0.a("Failed to load ");
                a10.append(this.f16951a.name());
                a10.append(" ad: NO FILL");
                j9.a(context, 6, a10.toString(), true);
                z11 = true;
            }
            if (z11) {
                return;
            }
        }
        int ordinal = this.f16951a.ordinal();
        if (ordinal == 0) {
            dVar = new OverlayAd(this.f16952b);
        } else if (ordinal == 7) {
            dVar = new ReturnAd(this.f16952b);
        } else if (ordinal == 2) {
            if (new Random().nextInt(100) < AdsCommonMetaData.f16770h.w()) {
                z12 = true;
            }
            boolean isForceOfferWall3D = this.f16954d.isForceOfferWall3D();
            boolean isForceOfferWall2D = true ^ this.f16954d.isForceOfferWall2D();
            Map<Activity, Integer> map = j9.f15982a;
            if ((z12 || isForceOfferWall3D) && isForceOfferWall2D) {
                dVar = new OfferWall3DAd(this.f16952b);
            } else {
                dVar = new OfferWallAd(this.f16952b);
            }
        } else if (ordinal == 3) {
            dVar = new SplashAd(this.f16952b);
        } else if (ordinal != 4) {
            dVar = new OverlayAd(this.f16952b);
        } else {
            Map<Activity, Integer> map2 = j9.f15982a;
            dVar = new VideoEnabledAd(this.f16952b, AdPreferences.Placement.INAPP_OVERLAY);
        }
        this.f16955e = dVar;
        dVar.setActivityExtra(this.f16953c);
        this.f16954d.setAutoLoadAmount(this.f16963m);
        this.f16955e.load(this.f16954d, new a());
        this.f16957g = System.currentTimeMillis();
    }

    public final void b(boolean z10) {
        d dVar = this.f16955e;
        if (dVar != null) {
            dVar.a(false);
        }
        if (this.f16959i && this.f16958h != null) {
            this.f16959i = false;
            f fVar = new f(this, new a(), z10);
            Context context = this.f16952b;
            ComponentLocator.a(context).j().execute(new k(context, this.f16958h, fVar, new g(this)));
            return;
        }
        a(z10);
    }

    public final void a() {
        this.f16960j = new k1(this);
        this.f16961k = new i1(this);
    }

    public List<StartAppAd> a(Map<AdEventListener, List<StartAppAd>> map, AdEventListener adEventListener) {
        try {
            return map.get(adEventListener);
        } catch (Throwable th) {
            i3.a(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.startapp.sdk.adsbase.StartAppAd r5, com.startapp.sdk.adsbase.adlisteners.AdEventListener r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r0 = r4.f16962l
            monitor-enter(r0)
            boolean r1 = r4.c()     // Catch:{ all -> 0x005e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            com.startapp.sdk.adsbase.d r1 = r4.f16955e     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0015
        L_0x0011:
            boolean r1 = r1.d()     // Catch:{ all -> 0x005e }
        L_0x0015:
            if (r1 != 0) goto L_0x001c
            if (r7 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r7 = 0
            goto L_0x001d
        L_0x001c:
            r7 = 1
        L_0x001d:
            if (r7 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x003d
            if (r6 == 0) goto L_0x003d
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r7 = r4.f16962l     // Catch:{ all -> 0x005e }
            java.util.List r7 = r4.a(r7, r6)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x003a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x005e }
            r7.<init>()     // Catch:{ all -> 0x005e }
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r1 = r4.f16962l     // Catch:{ all -> 0x005e }
            r1.put(r6, r7)     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x005e }
        L_0x003a:
            r7.add(r5)     // Catch:{ all -> 0x005e }
        L_0x003d:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f16956f     // Catch:{ all -> 0x005e }
            boolean r5 = r5.compareAndSet(r2, r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005c
            com.startapp.k1 r5 = r4.f16960j     // Catch:{ all -> 0x005e }
            r5.e()     // Catch:{ all -> 0x005e }
            com.startapp.i1 r5 = r4.f16961k     // Catch:{ all -> 0x005e }
            r5.e()     // Catch:{ all -> 0x005e }
            r4.b(r8)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0053:
            if (r5 == 0) goto L_0x005c
            if (r6 == 0) goto L_0x005c
            android.content.Context r7 = r4.f16952b     // Catch:{ all -> 0x005e }
            com.startapp.k.b(r7, r6, r5, r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.h.a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.adlisteners.AdEventListener, boolean, boolean):void");
    }
}
