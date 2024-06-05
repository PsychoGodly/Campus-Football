package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.ee;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.uc;
import com.applovin.impl.zc;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MaxAdPlacer implements zc.a {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinSdkUtils.Size f14058a;

    /* renamed from: b  reason: collision with root package name */
    private MaxNativeAdViewBinder f14059b;

    /* renamed from: c  reason: collision with root package name */
    private final uc f14060c;

    /* renamed from: d  reason: collision with root package name */
    private final zc f14061d;

    /* renamed from: e  reason: collision with root package name */
    private Listener f14062e;
    protected final t logger;
    protected final k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i10, Collection collection) {
        if (t.a()) {
            t tVar = this.logger;
            tVar.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f14060c.a(collection);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f14060c.a();
        this.f14061d.a();
    }

    public void clearAds() {
        a(this.f14060c.b(), (Runnable) new a(this));
    }

    public Collection<Integer> clearTrailingAds(int i10) {
        Collection<Integer> e10 = this.f14060c.e(i10);
        if (!e10.isEmpty()) {
            a((Collection) e10, (Runnable) new c(this, i10, e10));
        }
        return e10;
    }

    public void destroy() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f14061d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return (long) (-System.identityHashCode(this.f14060c.a(i10)));
        }
        return 0;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.f14058a;
            boolean z10 = size != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z10 ? size.getWidth() : 360, i11);
            ee eeVar = (ee) this.f14060c.a(i10);
            if ("small_template_1".equalsIgnoreCase(eeVar.o0())) {
                return new AppLovinSdkUtils.Size(min, z10 ? this.f14058a.getHeight() : 120);
            } else if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(eeVar.o0())) {
                return new AppLovinSdkUtils.Size(min, (int) (((double) min) / (z10 ? ((double) this.f14058a.getWidth()) / ((double) this.f14058a.getHeight()) : 1.2d)));
            } else if (z10) {
                return this.f14058a;
            } else {
                if (eeVar.l0() != null) {
                    View mainView = eeVar.l0().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f14060c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f14060c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f14060c.d(i10);
    }

    public void insertItem(int i10) {
        if (t.a()) {
            t tVar = this.logger;
            tVar.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f14060c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f14060c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f14060c.h(i10);
    }

    public void loadAds() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f14061d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f14060c.b(i10, i11);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f14062e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f14062e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (t.a()) {
            t tVar = this.logger;
            tVar.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    public void onNativeAdLoaded() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i10) {
        List list;
        if (isFilledPosition(i10)) {
            list = Collections.singletonList(Integer.valueOf(i10));
        } else {
            list = Collections.emptyList();
        }
        a((Collection) list, (Runnable) new b(this, i10));
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd a10 = this.f14060c.a(i10);
        if (a10 != null) {
            MaxNativeAdView l02 = ((ee) a10).l0();
            if (l02 != null) {
                if (t.a()) {
                    this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
                }
            } else if (this.f14059b != null) {
                l02 = new MaxNativeAdView(this.f14059b, viewGroup.getContext());
                if (this.f14061d.a(l02, a10)) {
                    if (t.a()) {
                        this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                    }
                } else if (t.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
                }
            } else if (t.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                return;
            } else {
                return;
            }
            for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
                if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                    viewGroup.removeViewAt(childCount);
                }
            }
            if (l02.getParent() != null) {
                ((ViewGroup) l02.getParent()).removeView(l02);
            }
            viewGroup.addView(l02, -1, -1);
        } else if (t.a()) {
            this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
        }
    }

    public void setAdSize(int i10, int i11) {
        this.f14058a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f14062e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f14059b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f14060c.c(i10, i11);
        if (i10 != -1 && i11 != -1) {
            a();
        }
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f14058a = AppLovinSdkUtils.Size.ZERO;
        k a10 = appLovinSdk.a();
        this.sdk = a10;
        t L = a10.L();
        this.logger = L;
        this.f14060c = new uc(maxAdPlacerSettings);
        this.f14061d = new zc(maxAdPlacerSettings, context, this);
        if (t.a()) {
            L.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (t.a()) {
            t tVar = this.logger;
            tVar.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f14060c.i(i10);
    }

    private void a() {
        int c10;
        while (this.f14061d.d() && (c10 = this.f14060c.c()) != -1) {
            if (t.a()) {
                t tVar = this.logger;
                tVar.a("MaxAdPlacer", "Placing ad at position: " + c10);
            }
            this.f14060c.a(this.f14061d.b(), c10);
            Listener listener = this.f14062e;
            if (listener != null) {
                listener.onAdLoaded(c10);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f14061d.a(this.f14060c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (!collection.isEmpty()) {
            if (t.a()) {
                t tVar = this.logger;
                tVar.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
            }
            if (this.f14062e != null) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    this.f14062e.onAdRemoved(((Integer) it2.next()).intValue());
                }
            }
        }
    }
}
