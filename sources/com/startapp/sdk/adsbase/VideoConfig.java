package com.startapp.sdk.adsbase;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoConfig implements Serializable {
    private static final long serialVersionUID = -7167816130382369376L;
    @d9(type = BackMode.class)
    private BackMode backMode = BackMode.DISABLED;
    private int maxCachedVideos = 3;
    private int maxTimeForCachingIndicator = 10;
    private int maxVastCampaignExclude = 10;
    private int maxVastLevels = 7;
    private long minAvailableStorageRequired = 20;
    private int minTimeForCachingIndicator = 1;
    private int nativePlayerProbability = 100;
    private boolean progressive = false;
    private int progressiveBufferInPercentage = 20;
    private int progressiveInitialBufferInPercentage = 5;
    private int progressiveMinBufferToPlayFromCache = 30;
    private int rewardGrantPercentage = 100;
    private String soundMode = "default";
    private long vastDefaultSkipIntervalMilli = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
    private int vastMediaPicker = 0;
    private int vastPreferredBitrate = 0;
    private int vastRetryTimeout = 60000;
    private int vastTimeout = 30000;
    private int videoErrorsThreshold = 2;
    private boolean videoFallback = false;

    /* compiled from: Sta */
    public enum BackMode {
        DISABLED,
        SKIP,
        CLOSE,
        BOTH
    }

    public BackMode a() {
        return this.backMode;
    }

    public int b() {
        return this.maxCachedVideos;
    }

    public long c() {
        return TimeUnit.SECONDS.toMillis((long) this.maxTimeForCachingIndicator);
    }

    public int d() {
        return this.maxVastCampaignExclude;
    }

    public int e() {
        return this.maxVastLevels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoConfig videoConfig = (VideoConfig) obj;
        if (this.maxCachedVideos == videoConfig.maxCachedVideos && this.minAvailableStorageRequired == videoConfig.minAvailableStorageRequired && this.rewardGrantPercentage == videoConfig.rewardGrantPercentage && this.videoErrorsThreshold == videoConfig.videoErrorsThreshold && this.nativePlayerProbability == videoConfig.nativePlayerProbability && this.minTimeForCachingIndicator == videoConfig.minTimeForCachingIndicator && this.maxTimeForCachingIndicator == videoConfig.maxTimeForCachingIndicator && this.videoFallback == videoConfig.videoFallback && this.progressive == videoConfig.progressive && this.progressiveBufferInPercentage == videoConfig.progressiveBufferInPercentage && this.progressiveInitialBufferInPercentage == videoConfig.progressiveInitialBufferInPercentage && this.progressiveMinBufferToPlayFromCache == videoConfig.progressiveMinBufferToPlayFromCache && this.maxVastLevels == videoConfig.maxVastLevels && this.vastTimeout == videoConfig.vastTimeout && this.vastRetryTimeout == videoConfig.vastRetryTimeout && this.maxVastCampaignExclude == videoConfig.maxVastCampaignExclude && this.vastMediaPicker == videoConfig.vastMediaPicker && this.vastPreferredBitrate == videoConfig.vastPreferredBitrate && this.vastDefaultSkipIntervalMilli == videoConfig.vastDefaultSkipIntervalMilli && this.backMode == videoConfig.backMode && j9.a(this.soundMode, videoConfig.soundMode)) {
            return true;
        }
        return false;
    }

    public long f() {
        return this.minAvailableStorageRequired;
    }

    public long g() {
        return TimeUnit.SECONDS.toMillis((long) this.minTimeForCachingIndicator);
    }

    public int h() {
        return this.progressiveBufferInPercentage;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.maxCachedVideos), Long.valueOf(this.minAvailableStorageRequired), Integer.valueOf(this.rewardGrantPercentage), Integer.valueOf(this.videoErrorsThreshold), this.backMode, Integer.valueOf(this.nativePlayerProbability), Integer.valueOf(this.minTimeForCachingIndicator), Integer.valueOf(this.maxTimeForCachingIndicator), Boolean.valueOf(this.videoFallback), Boolean.valueOf(this.progressive), Integer.valueOf(this.progressiveBufferInPercentage), Integer.valueOf(this.progressiveInitialBufferInPercentage), Integer.valueOf(this.progressiveMinBufferToPlayFromCache), this.soundMode, Integer.valueOf(this.maxVastLevels), Integer.valueOf(this.vastTimeout), Integer.valueOf(this.vastRetryTimeout), Integer.valueOf(this.maxVastCampaignExclude), Integer.valueOf(this.vastMediaPicker), Integer.valueOf(this.vastPreferredBitrate), Long.valueOf(this.vastDefaultSkipIntervalMilli)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public int i() {
        return this.progressiveInitialBufferInPercentage;
    }

    public int j() {
        return this.progressiveMinBufferToPlayFromCache;
    }

    public int k() {
        return this.rewardGrantPercentage;
    }

    public String l() {
        return this.soundMode;
    }

    public long m() {
        return this.vastDefaultSkipIntervalMilli;
    }

    public int n() {
        return this.vastRetryTimeout;
    }

    public int o() {
        return this.videoErrorsThreshold;
    }

    public boolean p() {
        return this.progressive;
    }

    public boolean q() {
        return this.videoFallback;
    }
}
