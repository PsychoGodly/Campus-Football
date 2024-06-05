package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class NetworkQualityThroughputListener {
    private final Executor mExecutor;

    public NetworkQualityThroughputListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onThroughputObservation(int i10, long j10, int i11);
}
