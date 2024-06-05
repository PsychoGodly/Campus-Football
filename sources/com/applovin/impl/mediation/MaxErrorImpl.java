package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;

public class MaxErrorImpl implements MaxError {
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private final int mediatedNetworkErrorCode;
    private final String mediatedNetworkErrorMessage;
    private long requestLatencyMillis;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i10) {
        this(i10, MaxReward.DEFAULT_LABEL);
    }

    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getLoadTag() {
        return this.loadTag;
    }

    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    public String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    public String getMessage() {
        return this.errorMessage;
    }

    public long getRequestLatencyMillis() {
        return this.requestLatencyMillis;
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(String str) {
        this.loadTag = str;
    }

    public void setRequestLatencyMillis(long j10) {
        this.requestLatencyMillis = j10;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    public String toString() {
        return "MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\", mediatedNetworkErrorCode=" + getMediatedNetworkErrorCode() + ", mediatedNetworkErrorMessage=\"" + getMediatedNetworkErrorMessage() + "\"}";
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    public MaxErrorImpl(int i10, String str) {
        this(i10, str, -1, MaxReward.DEFAULT_LABEL);
    }

    public MaxErrorImpl(int i10, String str, int i11, String str2) {
        this.errorCode = i10;
        this.errorMessage = StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i11;
        this.mediatedNetworkErrorMessage = StringUtils.emptyIfNull(str2);
    }
}
