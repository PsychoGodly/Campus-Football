package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
class DynamicLoaderFallback {
    /* access modifiers changed from: private */
    public static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f14140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f14141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f14142c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f14143d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f14144e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f14145f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f14146g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Method f14147h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Method f14148i;

        a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f14140a = list;
            this.f14141b = map;
            this.f14142c = list2;
            this.f14143d = list3;
            this.f14144e = map2;
            this.f14145f = list4;
            this.f14146g = list5;
            this.f14147h = method;
            this.f14148i = method2;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f14140a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f14141b))) {
                }
                for (Method access$100 : this.f14142c) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$100) && DynamicLoaderFallback.reportError(obj, this.f14141b)) {
                        return null;
                    }
                }
                return null;
            } else if (method.getReturnType().equals(String.class)) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    obj2 = obj;
                } else {
                    obj2 = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.f14143d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f14144e.get(obj), objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method access$1002 : this.f14145f) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1002)) {
                        this.f14144e.put(obj2, obj);
                    }
                }
                for (Method access$1003 : this.f14146g) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1003)) {
                        for (Ad ad2 : objArr) {
                            if (ad2 instanceof Ad) {
                                this.f14141b.put(obj2, ad2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f14147h)) {
                    this.f14141b.put(objArr[1], objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f14148i)) {
                    this.f14141b.put(objArr[1], objArr[0]);
                }
                return obj2;
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdListener f14149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ad f14150b;

        b(AdListener adListener, Ad ad2) {
            this.f14149a = adListener;
            this.f14150b = ad2;
        }

        public void run() {
            this.f14149a.onError(this.f14150b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    static DynamicLoader makeFallbackLoader() {
        Class cls = DynamicLoader.class;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c((a) null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(cls);
        dynamicLoader.createInterstitialAd((Context) null, (String) null, (InterstitialAd) null);
        arrayList5.add(cVar.b());
        dynamicLoader.createRewardedVideoAd((Context) null, (String) null, (RewardedVideoAd) null);
        arrayList5.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.b());
        dynamicLoader.createNativeAdApi((NativeAd) null, (NativeAdBaseApi) null);
        Method b10 = cVar.b();
        dynamicLoader.createNativeBannerAdApi((NativeBannerAd) null, (NativeAdBaseApi) null);
        Method b11 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig((NativeAdBase) null);
        arrayList4.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd((AdView.AdViewLoadConfig) null);
        arrayList2.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener((AdListener) null);
        arrayList3.add(cVar.b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener((NativeAdListener) null);
        arrayList3.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener((InterstitialAdListener) null);
        arrayList3.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener((RewardedVideoAdListener) null);
        arrayList3.add(cVar.b());
        a aVar = new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, b10, b11);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, aVar);
    }

    /* access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad2), 500);
        return true;
    }

    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Method f14151a;

        /* renamed from: b  reason: collision with root package name */
        private final InvocationHandler f14152b;

        class a implements InvocationHandler {
            a() {
            }

            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                Method unused = c.this.f14151a = method;
                return null;
            }
        }

        private c() {
            this.f14152b = new a();
        }

        /* access modifiers changed from: package-private */
        public Method b() {
            return this.f14151a;
        }

        public <T> T c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f14152b));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
