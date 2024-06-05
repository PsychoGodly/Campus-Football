package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import dc.a;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.w;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;
import lc.s;
import n4.h;
import n4.r;
import n4.x;
import vc.d;

/* compiled from: GoogleMobileAdsPlugin */
public class h0 implements dc.a, ec.a, k.c {

    /* renamed from: a  reason: collision with root package name */
    private a.b f33993a;

    /* renamed from: b  reason: collision with root package name */
    private a f33994b;

    /* renamed from: c  reason: collision with root package name */
    private b f33995c;

    /* renamed from: d  reason: collision with root package name */
    private AppStateNotifier f33996d;

    /* renamed from: f  reason: collision with root package name */
    private d f33997f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, c> f33998g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private j0 f33999h;

    /* renamed from: i  reason: collision with root package name */
    private final v f34000i = new v();

    /* compiled from: GoogleMobileAdsPlugin */
    class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f34001a;

        a(k.d dVar) {
            this.f34001a = dVar;
        }

        public void a(n4.c cVar) {
            if (cVar != null) {
                this.f34001a.error(Integer.toString(cVar.a()), cVar.c(), cVar.b());
                return;
            }
            this.f34001a.success((Object) null);
        }
    }

    /* compiled from: GoogleMobileAdsPlugin */
    private static final class b implements OnInitializationCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        private final k.d f34003a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34004b;

        /* synthetic */ b(k.d dVar, a aVar) {
            this(dVar);
        }

        public void onInitializationComplete(InitializationStatus initializationStatus) {
            if (!this.f34004b) {
                try {
                    Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", new Class[]{String.class});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke((Object) null, new Object[]{"Flutter-GMA-3.1.0"});
                } catch (Exception unused) {
                }
                this.f34003a.success(new t(initializationStatus));
                this.f34004b = true;
            }
        }

        private b(k.d dVar) {
            this.f34003a = dVar;
            this.f34004b = false;
        }
    }

    /* compiled from: GoogleMobileAdsPlugin */
    public interface c {
        NativeAdView a(com.google.android.gms.ads.nativead.b bVar, Map<String, Object> map);
    }

    private boolean a(String str, c cVar) {
        if (this.f33998g.containsKey(str)) {
            Log.e(h0.class.getSimpleName(), String.format("A NativeAdFactory with the following factoryId already exists: %s", new Object[]{str}));
            return false;
        }
        this.f33998g.put(str, cVar);
        return true;
    }

    public static boolean c(io.flutter.embedding.engine.a aVar, String str, c cVar) {
        return d((h0) aVar.q().a(h0.class), str, cVar);
    }

    private static boolean d(h0 h0Var, String str, c cVar) {
        if (h0Var != null) {
            return h0Var.a(str, cVar);
        }
        throw new IllegalStateException(String.format("Could not find a %s instance. The plugin may have not been registered.", new Object[]{h0.class.getSimpleName()}));
    }

    private c e(String str) {
        return this.f33998g.remove(str);
    }

    private static <T> T f(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException();
    }

    public static c g(io.flutter.embedding.engine.a aVar, String str) {
        dc.a a10 = aVar.q().a(h0.class);
        if (a10 != null) {
            return ((h0) a10).e(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c b(Context context) {
        return new c(context);
    }

    public void onAttachedToActivity(ec.c cVar) {
        a aVar = this.f33994b;
        if (aVar != null) {
            aVar.v(cVar.getActivity());
        }
        b bVar = this.f33995c;
        if (bVar != null) {
            bVar.r(cVar.getActivity());
        }
        d dVar = this.f33997f;
        if (dVar != null) {
            dVar.c(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f33993a = bVar;
        b bVar2 = new b(bVar.a(), new c0(bVar.a()));
        this.f33995c = bVar2;
        j0 j0Var = this.f33999h;
        if (j0Var != null) {
            bVar2.s(j0Var);
        }
        k kVar = new k(bVar.b(), "plugins.flutter.io/google_mobile_ads", new s(this.f33995c));
        kVar.e(this);
        this.f33994b = new a(kVar);
        bVar.e().a("plugins.flutter.io/google_mobile_ads/ad_widget", new i0(this.f33994b));
        this.f33996d = new AppStateNotifier(bVar.b());
        this.f33997f = new d(bVar.b(), bVar.a());
    }

    public void onDetachedFromActivity() {
        a.b bVar;
        b bVar2 = this.f33995c;
        if (!(bVar2 == null || (bVar = this.f33993a) == null)) {
            bVar2.r(bVar.a());
        }
        a aVar = this.f33994b;
        if (aVar != null) {
            aVar.v((Activity) null);
        }
        d dVar = this.f33997f;
        if (dVar != null) {
            dVar.c((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        a.b bVar;
        b bVar2 = this.f33995c;
        if (!(bVar2 == null || (bVar = this.f33993a) == null)) {
            bVar2.r(bVar.a());
        }
        a aVar = this.f33994b;
        if (aVar != null) {
            aVar.v((Activity) null);
        }
        d dVar = this.f33997f;
        if (dVar != null) {
            dVar.c((Activity) null);
        }
    }

    public void onDetachedFromEngine(a.b bVar) {
        AppStateNotifier appStateNotifier = this.f33996d;
        if (appStateNotifier != null) {
            appStateNotifier.j();
            this.f33996d = null;
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Context context;
        d0 d0Var;
        e0 e0Var;
        j jVar2 = jVar;
        k.d dVar2 = dVar;
        a aVar = this.f33994b;
        if (aVar == null || this.f33993a == null) {
            Log.e("GoogleMobileAdsPlugin", "method call received before instanceManager initialized: " + jVar2.f36116a);
            return;
        }
        if (aVar.f() != null) {
            context = this.f33994b.f();
        } else {
            context = this.f33993a.a();
        }
        String str = jVar2.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1959534605:
                if (str.equals("MobileAds#openDebugMenu")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1826439721:
                if (str.equals("MobileAds#setAppMuted")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1771320504:
                if (str.equals("loadAppOpenAd")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1557947903:
                if (str.equals("MobileAds#registerWebView")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1395015128:
                if (str.equals("MobileAds#getRequestConfiguration")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1273455673:
                if (str.equals("loadFluidAd")) {
                    c10 = 7;
                    break;
                }
                break;
            case -965504608:
                if (str.equals("loadNativeAd")) {
                    c10 = 8;
                    break;
                }
                break;
            case -918684377:
                if (str.equals("setServerSideVerificationOptions")) {
                    c10 = 9;
                    break;
                }
                break;
            case -768079951:
                if (str.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c10 = 10;
                    break;
                }
                break;
            case -676596397:
                if (str.equals("loadAdManagerInterstitialAd")) {
                    c10 = 11;
                    break;
                }
                break;
            case -572043403:
                if (str.equals("loadBannerAd")) {
                    c10 = 12;
                    break;
                }
                break;
            case -533157842:
                if (str.equals("MobileAds#setAppVolume")) {
                    c10 = 13;
                    break;
                }
                break;
            case -436783448:
                if (str.equals("MobileAds#getVersionString")) {
                    c10 = 14;
                    break;
                }
                break;
            case -172783533:
                if (str.equals("loadAdManagerBannerAd")) {
                    c10 = 15;
                    break;
                }
                break;
            case 90971631:
                if (str.equals("_init")) {
                    c10 = 16;
                    break;
                }
                break;
            case 250880674:
                if (str.equals("disposeAd")) {
                    c10 = 17;
                    break;
                }
                break;
            case 273004986:
                if (str.equals("getAdSize")) {
                    c10 = 18;
                    break;
                }
                break;
            case 288452133:
                if (str.equals("MobileAds#updateRequestConfiguration")) {
                    c10 = 19;
                    break;
                }
                break;
            case 316173893:
                if (str.equals("MobileAds#disableMediationInitialization")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1064076149:
                if (str.equals("MobileAds#openAdInspector")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1355848557:
                if (str.equals("showAdWithoutView")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1403601573:
                if (str.equals("MobileAds#initialize")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1661969852:
                if (str.equals("setImmersiveMode")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1882741923:
                if (str.equals("loadRewardedInterstitialAd")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f34000i.f(context, (String) jVar2.a("adUnitId"));
                dVar2.success((Object) null);
                return;
            case 1:
                u uVar = new u(((Integer) jVar2.a("adId")).intValue(), this.f33994b, (String) jVar2.a("adUnitId"), (l) jVar2.a("request"), new h(context));
                this.f33994b.x(uVar, ((Integer) jVar2.a("adId")).intValue());
                uVar.e();
                dVar2.success((Object) null);
                return;
            case 2:
                this.f34000i.h(((Boolean) jVar2.a("muted")).booleanValue());
                dVar2.success((Object) null);
                return;
            case 3:
                p pVar = new p(((Integer) jVar2.a("adId")).intValue(), ((Integer) jVar2.a(AdUnitActivity.EXTRA_ORIENTATION)).intValue(), (a) f(this.f33994b), (String) f((String) jVar2.a("adUnitId")), (l) jVar2.a("request"), (i) jVar2.a("adManagerRequest"), new h(context));
                this.f33994b.x(pVar, ((Integer) jVar2.a("adId")).intValue());
                pVar.h();
                dVar2.success((Object) null);
                return;
            case 4:
                this.f34000i.g(((Integer) jVar2.a("webViewId")).intValue(), this.f33993a.d());
                dVar2.success((Object) null);
                return;
            case 5:
                String str2 = (String) f((String) jVar2.a("adUnitId"));
                l lVar = (l) jVar2.a("request");
                i iVar = (i) jVar2.a("adManagerRequest");
                if (lVar != null) {
                    d0Var = new d0(((Integer) jVar2.a("adId")).intValue(), (a) f(this.f33994b), str2, lVar, new h(context));
                } else if (iVar != null) {
                    d0Var = new d0(((Integer) jVar2.a("adId")).intValue(), (a) f(this.f33994b), str2, iVar, new h(context));
                } else {
                    dVar2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.f33994b.x(d0Var, ((Integer) f((Integer) jVar2.a("adId"))).intValue());
                d0Var.e();
                dVar2.success((Object) null);
                return;
            case 6:
                dVar2.success(this.f34000i.b());
                return;
            case 7:
                d dVar3 = new d(((Integer) jVar2.a("adId")).intValue(), this.f33994b, (String) jVar2.a("adUnitId"), (i) jVar2.a("request"), b(context));
                this.f33994b.x(dVar3, ((Integer) jVar2.a("adId")).intValue());
                dVar3.d();
                dVar2.success((Object) null);
                return;
            case 8:
                String str3 = (String) jVar2.a("factoryId");
                c cVar = this.f33998g.get(str3);
                uc.b bVar = (uc.b) jVar2.a("nativeTemplateStyle");
                if (cVar == null && bVar == null) {
                    dVar2.error("NativeAdError", String.format("No NativeAdFactory with id: %s or nativeTemplateStyle", new Object[]{str3}), (Object) null);
                    return;
                }
                w a10 = new w.a(context).h(this.f33994b).d((String) jVar2.a("adUnitId")).b(cVar).k((l) jVar2.a("request")).c((i) jVar2.a("adManagerRequest")).e((Map) jVar2.a("customOptions")).g(((Integer) jVar2.a("adId")).intValue()).i((z) jVar2.a("nativeAdOptions")).f(new h(context)).j((uc.b) jVar2.a("nativeTemplateStyle")).a();
                this.f33994b.x(a10, ((Integer) jVar2.a("adId")).intValue());
                a10.c();
                dVar2.success((Object) null);
                return;
            case 9:
                e b10 = this.f33994b.b(((Integer) jVar2.a("adId")).intValue());
                f0 f0Var = (f0) jVar2.a("serverSideVerificationOptions");
                if (b10 == null) {
                    Log.w("GoogleMobileAdsPlugin", "Error - null ad in setServerSideVerificationOptions");
                } else if (b10 instanceof d0) {
                    ((d0) b10).j(f0Var);
                } else if (b10 instanceof e0) {
                    ((e0) b10).j(f0Var);
                } else {
                    Log.w("GoogleMobileAdsPlugin", "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                dVar2.success((Object) null);
                return;
            case 10:
                m.b bVar2 = new m.b(context, new m.a(), (String) jVar2.a(AdUnitActivity.EXTRA_ORIENTATION), ((Integer) jVar2.a("width")).intValue());
                if (h.f20935q.equals(bVar2.f34045a)) {
                    dVar2.success((Object) null);
                    return;
                } else {
                    dVar2.success(Integer.valueOf(bVar2.f34047c));
                    return;
                }
            case 11:
                k kVar = new k(((Integer) jVar2.a("adId")).intValue(), (a) f(this.f33994b), (String) f((String) jVar2.a("adUnitId")), (i) jVar2.a("request"), new h(context));
                this.f33994b.x(kVar, ((Integer) f((Integer) jVar2.a("adId"))).intValue());
                kVar.e();
                dVar2.success((Object) null);
                return;
            case 12:
                q qVar = new q(((Integer) jVar2.a("adId")).intValue(), this.f33994b, (String) jVar2.a("adUnitId"), (l) jVar2.a("request"), (m) jVar2.a("size"), b(context));
                this.f33994b.x(qVar, ((Integer) jVar2.a("adId")).intValue());
                qVar.d();
                dVar2.success((Object) null);
                return;
            case 13:
                this.f34000i.i(((Double) jVar2.a("volume")).doubleValue());
                dVar2.success((Object) null);
                return;
            case 14:
                dVar2.success(this.f34000i.c());
                return;
            case 15:
                j jVar3 = new j(((Integer) jVar2.a("adId")).intValue(), this.f33994b, (String) jVar2.a("adUnitId"), (List) jVar2.a("sizes"), (i) jVar2.a("request"), b(context));
                this.f33994b.x(jVar3, ((Integer) jVar2.a("adId")).intValue());
                jVar3.d();
                dVar2.success((Object) null);
                return;
            case 16:
                this.f33994b.e();
                dVar2.success((Object) null);
                return;
            case 17:
                this.f33994b.d(((Integer) jVar2.a("adId")).intValue());
                dVar2.success((Object) null);
                return;
            case 18:
                e b11 = this.f33994b.b(((Integer) jVar2.a("adId")).intValue());
                if (b11 == null) {
                    dVar2.success((Object) null);
                    return;
                } else if (b11 instanceof q) {
                    dVar2.success(((q) b11).c());
                    return;
                } else if (b11 instanceof j) {
                    dVar2.success(((j) b11).c());
                    return;
                } else {
                    dVar2.error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + b11, (Object) null);
                    return;
                }
            case 19:
                x.a e10 = MobileAds.getRequestConfiguration().e();
                String str4 = (String) jVar2.a("maxAdContentRating");
                Integer num = (Integer) jVar2.a("tagForChildDirectedTreatment");
                Integer num2 = (Integer) jVar2.a("tagForUnderAgeOfConsent");
                List list = (List) jVar2.a("testDeviceIds");
                if (str4 != null) {
                    e10.b(str4);
                }
                if (num != null) {
                    e10.c(num.intValue());
                }
                if (num2 != null) {
                    e10.d(num2.intValue());
                }
                if (list != null) {
                    e10.e(list);
                }
                MobileAds.setRequestConfiguration(e10.a());
                dVar2.success((Object) null);
                return;
            case 20:
                this.f34000i.a(context);
                dVar2.success((Object) null);
                return;
            case 21:
                this.f34000i.e(context, new a(dVar2));
                return;
            case 22:
                if (!this.f33994b.w(((Integer) jVar2.a("adId")).intValue())) {
                    dVar2.error("AdShowError", "Ad failed to show.", (Object) null);
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 23:
                this.f34000i.d(context, new b(dVar2, (a) null));
                return;
            case 24:
                ((e.d) this.f33994b.b(((Integer) jVar2.a("adId")).intValue())).c(((Boolean) jVar2.a("immersiveModeEnabled")).booleanValue());
                dVar2.success((Object) null);
                return;
            case 25:
                String str5 = (String) f((String) jVar2.a("adUnitId"));
                l lVar2 = (l) jVar2.a("request");
                i iVar2 = (i) jVar2.a("adManagerRequest");
                if (lVar2 != null) {
                    e0Var = new e0(((Integer) jVar2.a("adId")).intValue(), (a) f(this.f33994b), str5, lVar2, new h(context));
                } else if (iVar2 != null) {
                    e0Var = new e0(((Integer) jVar2.a("adId")).intValue(), (a) f(this.f33994b), str5, iVar2, new h(context));
                } else {
                    dVar2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.f33994b.x(e0Var, ((Integer) f((Integer) jVar2.a("adId"))).intValue());
                e0Var.e();
                dVar2.success((Object) null);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        a aVar = this.f33994b;
        if (aVar != null) {
            aVar.v(cVar.getActivity());
        }
        b bVar = this.f33995c;
        if (bVar != null) {
            bVar.r(cVar.getActivity());
        }
        d dVar = this.f33997f;
        if (dVar != null) {
            dVar.c(cVar.getActivity());
        }
    }
}
