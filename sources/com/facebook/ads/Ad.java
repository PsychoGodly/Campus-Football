package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
public interface Ad {

    @Keep
    public interface LoadAdConfig {
    }

    @Keep
    public interface LoadConfigBuilder {
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadConfigBuilder withBid(String str);
    }

    @Benchmark
    void destroy();

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    String getPlacementId();

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    boolean isAdInvalidated();

    @Benchmark
    void loadAd();

    @Deprecated
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    void setExtraHints(ExtraHints extraHints);
}
