package org.chromium.net;

import android.content.Context;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    public static class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        public Builder enableNetworkQualityEstimator(boolean z10) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z10);
            return this;
        }

        public Builder enableSdch(boolean z10) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder setThreadPriority(int i10) {
            this.mBuilderDelegate.setThreadPriority(i10);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z10, Date date) {
            super.addPublicKeyPins(str, set, z10, date);
            return this;
        }

        public Builder addQuicHint(String str, int i10, int i11) {
            super.addQuicHint(str, i10, i11);
            return this;
        }

        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableHttp2(boolean z10) {
            super.enableHttp2(z10);
            return this;
        }

        public Builder enableHttpCache(int i10, long j10) {
            super.enableHttpCache(i10, j10);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z10) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z10);
            return this;
        }

        public Builder enableQuic(boolean z10) {
            super.enableQuic(z10);
            return this;
        }

        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z10, boolean z11, boolean z12) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(String str, boolean z10, int i10) {
    }
}
