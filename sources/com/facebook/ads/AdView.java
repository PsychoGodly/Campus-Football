package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class AdView extends RelativeLayout implements Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    @Keep
    public interface AdViewLoadConfig extends Ad.LoadAdConfig {
    }

    @Keep
    public interface AdViewLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        /* bridge */ /* synthetic */ Ad.LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        /* bridge */ /* synthetic */ Ad.LoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withBid(String str);
    }

    class a implements AdViewParentApi {
        a() {
        }

        @Benchmark
        public void onConfigurationChanged(Configuration configuration) {
            AdView.super.onConfigurationChanged(configuration);
        }
    }

    @Benchmark
    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        a aVar = new a();
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, (AdViewParentApi) aVar, this);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    public void destroy() {
        this.mAdViewApi.destroy();
    }

    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Benchmark
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    @Benchmark
    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    @Benchmark
    public AdView(Context context, String str, String str2) throws Exception {
        super(context);
        a aVar = new a();
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, (AdViewParentApi) aVar, this);
    }
}
