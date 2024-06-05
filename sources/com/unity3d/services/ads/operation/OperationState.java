package com.unity3d.services.ads.operation;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class OperationState implements IWebViewSharedObject {
    private static String _emptyPlacementId = "";
    public Configuration configuration;

    /* renamed from: id  reason: collision with root package name */
    public String f32055id;
    public String placementId;
    public long startTime;
    public BaseTimer timeoutTimer;

    public OperationState(String str, Configuration configuration2) {
        this.placementId = str == null ? _emptyPlacementId : str;
        this.configuration = configuration2;
        this.f32055id = UUID.randomUUID().toString();
    }

    public long duration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startTime);
    }

    public String getId() {
        return this.f32055id;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }
}
