package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    @Keep
    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i10);

        void destroyView(NativeAd nativeAd, View view);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        super(context);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i10, type, nativeAdViewAttributes, i11);
    }

    public void setInset(int i10) {
        this.mNativeAdScrollViewApi.setInset(i10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, (NativeAdView.Type) null, (NativeAdViewAttributes) null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i10) {
        this(context, nativeAdsManager, adViewProvider, 0, (NativeAdView.Type) null, (NativeAdViewAttributes) null, i10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10) {
        this(context, nativeAdsManager, (AdViewProvider) null, i10, (NativeAdView.Type) null, (NativeAdViewAttributes) null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, (AdViewProvider) null, i10, (NativeAdView.Type) null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        this(context, nativeAdsManager, (AdViewProvider) null, i10, (NativeAdView.Type) null, nativeAdViewAttributes, i11);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, (AdViewProvider) null, 0, type, (NativeAdViewAttributes) null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, (AdViewProvider) null, 0, type, nativeAdViewAttributes, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        this(context, nativeAdsManager, (AdViewProvider) null, 0, type, nativeAdViewAttributes, i10);
    }
}
