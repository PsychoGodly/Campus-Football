package com.unity3d.ads.gatewayclient;

/* compiled from: RequestPolicy.kt */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i10, int i11, int i12, float f10, int i13, int i14, int i15, boolean z10) {
        this.maxDuration = i10;
        this.retryMaxInterval = i11;
        this.retryWaitBase = i12;
        this.retryJitterPct = f10;
        this.connectTimeout = i13;
        this.readTimeout = i14;
        this.writeTimeout = i15;
        this.shouldStoreLocally = z10;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i10, int i11, int i12, float f10, int i13, int i14, int i15, boolean z10, int i16, Object obj) {
        RequestPolicy requestPolicy2 = requestPolicy;
        int i17 = i16;
        return requestPolicy.copy((i17 & 1) != 0 ? requestPolicy2.maxDuration : i10, (i17 & 2) != 0 ? requestPolicy2.retryMaxInterval : i11, (i17 & 4) != 0 ? requestPolicy2.retryWaitBase : i12, (i17 & 8) != 0 ? requestPolicy2.retryJitterPct : f10, (i17 & 16) != 0 ? requestPolicy2.connectTimeout : i13, (i17 & 32) != 0 ? requestPolicy2.readTimeout : i14, (i17 & 64) != 0 ? requestPolicy2.writeTimeout : i15, (i17 & 128) != 0 ? requestPolicy2.shouldStoreLocally : z10);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final int component5() {
        return this.connectTimeout;
    }

    public final int component6() {
        return this.readTimeout;
    }

    public final int component7() {
        return this.writeTimeout;
    }

    public final boolean component8() {
        return this.shouldStoreLocally;
    }

    public final RequestPolicy copy(int i10, int i11, int i12, float f10, int i13, int i14, int i15, boolean z10) {
        return new RequestPolicy(i10, i11, i12, f10, i13, i14, i15, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((this.maxDuration * 31) + this.retryMaxInterval) * 31) + this.retryWaitBase) * 31) + Float.floatToIntBits(this.retryJitterPct)) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31;
        boolean z10 = this.shouldStoreLocally;
        if (z10) {
            z10 = true;
        }
        return floatToIntBits + (z10 ? 1 : 0);
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}
