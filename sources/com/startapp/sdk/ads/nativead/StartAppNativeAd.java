package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.e;
import com.startapp.f;
import com.startapp.k;
import com.startapp.p0;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class StartAppNativeAd extends Ad {
    private static final long serialVersionUID = -5904557568580515558L;
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds = Collections.emptyList();
    /* access modifiers changed from: private */
    public final AtomicBoolean loading = new AtomicBoolean();
    private NativeAdPreferences preferences;

    /* compiled from: Sta */
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f16550a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16551b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f16552c;

        public a(int i10, AdEventListener adEventListener) {
            this.f16551b = i10;
            this.f16552c = adEventListener;
        }

        public void run() {
            int i10 = this.f16550a + 1;
            this.f16550a = i10;
            if (i10 == this.f16551b) {
                StartAppNativeAd.this.a(this.f16552c);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeAd f16554a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NativeAdPreferences f16555b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f16556c;

        public b(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
            this.f16554a = nativeAd;
            this.f16555b = nativeAdPreferences;
            this.f16556c = adEventListener;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            if (ad2 != null) {
                StartAppNativeAd.this.setErrorMessage(ad2.getErrorMessage());
            }
            StartAppNativeAd startAppNativeAd = StartAppNativeAd.this;
            k.a(startAppNativeAd.f16757a, this.f16556c, startAppNativeAd, false);
            StartAppNativeAd.this.loading.set(false);
        }

        public void onReceiveAd(Ad ad2) {
            StartAppNativeAd.this.a(this.f16554a, this.f16555b, this.f16556c);
        }
    }

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.f16857a.d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.f16857a.b() == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        String b10 = AdInformationMetaData.f16857a.b();
        if (b10.contains("http://") || b10.contains("https://")) {
            return AdInformationMetaData.f16857a.b();
        }
        StringBuilder a10 = p0.a("https://");
        a10.append(AdInformationMetaData.f16857a.b());
        return a10.toString();
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public final AdDetails g() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.f16530a;
    }

    public String getAdId() {
        AdDetails g10 = g();
        if (g10 != null) {
            return g10.a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails g10 = g();
        if (g10 != null) {
            return g10.d();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds((String) null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    public void a(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = nativeAd.isBelowMinCPM();
        List<AdDetails> g10 = nativeAd.g();
        if (g10 == null || (size = g10.size()) <= 0) {
            a(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new NativeAdDetails(g10.get(i10)));
        }
        this.listNativeAds = Collections.unmodifiableList(arrayList);
        if (nativeAdPreferences.isAutoBitmapDownload()) {
            a aVar = new a(size, adEventListener);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((NativeAdDetails) it.next()).loadImages(this.f16757a, aVar);
            }
            return;
        }
        a(adEventListener);
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a10 = AdaptMetaData.f16908a.a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a10.b()) {
            for (NativeAdDetails next : this.listNativeAds) {
                next.f16535f = str;
                arrayList.add(next);
            }
            f.f15802d.a(new e(AdPreferences.Placement.INAPP_NATIVE, str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                arrayList2.add(nativeAdDetails.f16530a);
            }
            com.startapp.sdk.adsbase.a.a(com.startapp.sdk.adsbase.a.a((List<AdDetails>) arrayList2), str, 0, a10.a());
        }
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.belowMinCpm = false;
        this.listNativeAds = Collections.emptyList();
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences == null) {
            nativeAdPreferences = new NativeAdPreferences();
            this.preferences = nativeAdPreferences;
        }
        if (nativeAdPreferences.getPlacementId() == null) {
            nativeAdPreferences.setPlacementId(com.startapp.sdk.adsbase.a.a(this.f16757a, (Object) this));
        }
        NativeAd nativeAd = new NativeAd(this.f16757a, nativeAdPreferences);
        return nativeAd.load(nativeAdPreferences, new b(nativeAd, nativeAdPreferences, adEventListener), true);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    public final void a(AdEventListener adEventListener) {
        setErrorMessage((String) null);
        k.b(this.f16757a, adEventListener, this, false);
        this.loading.set(false);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }
}
