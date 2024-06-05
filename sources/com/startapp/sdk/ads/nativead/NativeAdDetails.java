package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.startapp.b1;
import com.startapp.b6;
import com.startapp.d2;
import com.startapp.k7;
import com.startapp.p0;
import com.startapp.ra;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.t5;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a  reason: collision with root package name */
    public final AdDetails f16530a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f16531b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f16532c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16533d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16534e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f16535f;

    /* renamed from: g  reason: collision with root package name */
    public ra f16536g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f16537h = new WeakReference<>((Object) null);

    /* renamed from: i  reason: collision with root package name */
    public View.OnAttachStateChangeListener f16538i;

    /* renamed from: j  reason: collision with root package name */
    public NativeAdDisplayListener f16539j;

    /* renamed from: k  reason: collision with root package name */
    public b6 f16540k;

    /* renamed from: l  reason: collision with root package name */
    public final k7.a f16541l = new a();

    /* compiled from: Sta */
    public class a implements k7.a {
        public a() {
        }

        public void onSent(String str) {
            NativeAdDetails nativeAdDetails = NativeAdDetails.this;
            boolean z10 = true;
            nativeAdDetails.f16533d = true;
            if (nativeAdDetails.f16539j == null) {
                z10 = false;
            }
            d2.a("onShow", z10, str, (String) null);
            NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f16539j;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adDisplayed(nativeAdDetails);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b1.b {

        /* renamed from: a  reason: collision with root package name */
        public int f16543a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f16544b;

        public b(Runnable runnable) {
            this.f16544b = runnable;
        }

        public void a(Bitmap bitmap, int i10) {
            if (i10 == 0) {
                NativeAdDetails.this.f16531b = bitmap;
            } else {
                NativeAdDetails.this.f16532c = bitmap;
            }
            int i11 = this.f16543a + 1;
            this.f16543a = i11;
            if (i11 == 2) {
                this.f16544b.run();
            }
        }
    }

    /* compiled from: Sta */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    public class e implements ra.a {
        public e() {
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16549a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction[] r0 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16549a = r0
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.OPEN_MARKET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16549a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.LAUNCH_APP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.nativead.NativeAdDetails.f.<clinit>():void");
        }
    }

    public NativeAdDetails(AdDetails adDetails) {
        this.f16530a = adDetails;
    }

    public static void a(NativeAdDetails nativeAdDetails, View view) {
        nativeAdDetails.getClass();
        Context context = view.getContext();
        int i10 = f.f16549a[nativeAdDetails.getCampaignAction().ordinal()];
        if (i10 == 1) {
            boolean a10 = com.startapp.sdk.adsbase.a.a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (!nativeAdDetails.f16530a.A() || a10) {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f16530a.g(), nativeAdDetails.f16530a.u(), new TrackingParams(nativeAdDetails.f16535f), nativeAdDetails.f16530a.B() && !a10, false);
            } else {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f16530a.g(), nativeAdDetails.f16530a.u(), nativeAdDetails.f16530a.p(), new TrackingParams(nativeAdDetails.f16535f), AdsCommonMetaData.f16770h.z(), AdsCommonMetaData.f16770h.y(), nativeAdDetails.f16530a.B(), nativeAdDetails.f16530a.C(), false, (Runnable) null);
            }
        } else if (i10 == 2) {
            com.startapp.sdk.adsbase.a.a(nativeAdDetails.getPackageName(), nativeAdDetails.f16530a.l(), nativeAdDetails.f16530a.g(), context, new TrackingParams(nativeAdDetails.f16535f));
        }
        NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f16539j;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(nativeAdDetails);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public String getCallToAction() {
        String e10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (e10 = adDetails.e()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return e10;
    }

    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.f16530a;
        return (adDetails == null || !adDetails.z()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    public String getCategory() {
        String f10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (f10 = adDetails.f()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return f10;
    }

    public String getDescription() {
        String i10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (i10 = adDetails.i()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return i10;
    }

    public Bitmap getImageBitmap() {
        return this.f16531b;
    }

    public String getImageUrl() {
        AdDetails adDetails = this.f16530a;
        if (adDetails != null) {
            return adDetails.j();
        }
        return null;
    }

    public String getInstalls() {
        String k10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (k10 = adDetails.k()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return k10;
    }

    public String getPackageName() {
        String p10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (p10 = adDetails.p()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return p10;
    }

    public float getRating() {
        AdDetails adDetails = this.f16530a;
        if (adDetails != null) {
            return adDetails.q();
        }
        return 5.0f;
    }

    public Bitmap getSecondaryImageBitmap() {
        return this.f16532c;
    }

    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.f16530a;
        if (adDetails != null) {
            return adDetails.r();
        }
        return null;
    }

    public String getTitle() {
        String t10;
        AdDetails adDetails = this.f16530a;
        if (adDetails == null || (t10 = adDetails.t()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return t10;
    }

    public boolean isApp() {
        AdDetails adDetails = this.f16530a;
        if (adDetails != null) {
            return adDetails.y();
        }
        return true;
    }

    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.f16530a;
        return adDetails != null && adDetails.n();
    }

    public void loadImages(Context context, Runnable runnable) {
        b bVar = new b(runnable);
        new b1(context, getImageUrl(), bVar, 0).a();
        new b1(context, getSecondaryImageUrl(), bVar, 1).a();
    }

    public void registerViewForInteraction(View view) {
        a(view);
        ((View) this.f16537h.get()).setOnClickListener(new c());
    }

    public String toString() {
        String description = getDescription();
        if (description != null) {
            description = description.substring(0, Math.min(30, description.length()));
        }
        StringBuilder a10 = p0.a("         Title: [");
        a10.append(getTitle());
        a10.append("]\n         Description: [");
        a10.append(description);
        a10.append("]...\n         Rating: [");
        a10.append(getRating());
        a10.append("]\n         Installs: [");
        a10.append(getInstalls());
        a10.append("]\n         Category: [");
        a10.append(getCategory());
        a10.append("]\n         PackageName: [");
        a10.append(getPackageName());
        a10.append("]\n         CampaginAction: [");
        a10.append(getCampaignAction());
        a10.append("]\n");
        return a10.toString();
    }

    public void unregisterView() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        ra raVar = this.f16536g;
        if (raVar != null) {
            raVar.a();
            this.f16536g = null;
        }
        View view = (View) this.f16537h.get();
        this.f16537h.clear();
        if (view != null && Build.VERSION.SDK_INT >= 12 && (onAttachStateChangeListener = this.f16538i) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, (NativeAdDisplayListener) null);
    }

    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list == null || list.isEmpty() || this.f16537h.get() != null) {
            registerViewForInteraction(view);
        } else {
            d dVar = new d();
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(dVar);
            }
            a(view);
        }
        this.f16539j = nativeAdDisplayListener;
    }

    public final void a(View view) {
        this.f16537h = new WeakReference<>(view);
        if (view.hasWindowFocus() || Build.VERSION.SDK_INT < 12) {
            a();
            return;
        }
        if (this.f16538i == null) {
            this.f16538i = new t5(this);
        }
        view.addOnAttachStateChangeListener(this.f16538i);
    }

    public final void a() {
        long j10;
        if (this.f16536g == null && !this.f16533d) {
            View view = (View) this.f16537h.get();
            if (view == null) {
                NativeAdDisplayListener nativeAdDisplayListener = this.f16539j;
                if (nativeAdDisplayListener != null) {
                    nativeAdDisplayListener.adNotDisplayed(this);
                    return;
                }
                return;
            }
            Context context = view.getContext();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_NATIVE;
            AdDetails adDetails = this.f16530a;
            String[] w10 = adDetails != null ? adDetails.w() : null;
            TrackingParams trackingParams = new TrackingParams(this.f16535f, true);
            if (this.f16530a.h() != null) {
                j10 = TimeUnit.SECONDS.toMillis(this.f16530a.h().longValue());
            } else {
                j10 = TimeUnit.SECONDS.toMillis(MetaData.f17070k.s());
            }
            k7 k7Var = new k7(context, placement, w10, trackingParams, j10);
            Context context2 = view.getContext();
            AdDetails adDetails2 = this.f16530a;
            k7 k7Var2 = new k7(context2, placement, adDetails2 != null ? adDetails2.w() : null, new TrackingParams(this.f16535f), 0);
            k7Var.a(this.f16541l);
            BannerOptions a10 = BannerMetaData.f16423b.a();
            k7Var2.c();
            ra raVar = new ra(this.f16537h, k7Var, a10);
            this.f16536g = raVar;
            raVar.f16360c = new e();
            if (raVar.b()) {
                raVar.run();
            }
        }
    }
}
