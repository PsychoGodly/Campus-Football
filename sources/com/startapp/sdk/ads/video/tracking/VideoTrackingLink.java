package com.startapp.sdk.ads.video.tracking;

import com.startapp.d9;
import com.startapp.p0;
import java.io.Serializable;

/* compiled from: Sta */
public abstract class VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean appendReplayParameter;
    private String replayParameter;
    @d9(type = TrackingSource.class)
    private TrackingSource trackingSource;
    private String trackingUrl;

    /* compiled from: Sta */
    public enum TrackingSource {
        STARTAPP,
        EXTERNAL
    }

    public void a(boolean z10) {
        this.appendReplayParameter = z10;
    }

    public void b(String str) {
        this.trackingUrl = str;
    }

    public String c() {
        return this.trackingUrl;
    }

    public boolean d() {
        return this.appendReplayParameter;
    }

    public String toString() {
        StringBuilder a10 = p0.a("trackingSource=");
        a10.append(this.trackingSource);
        a10.append(", trackingUrl=");
        a10.append(this.trackingUrl);
        a10.append(", replayParameter=");
        a10.append(this.replayParameter);
        a10.append(", appendReplayParameter=");
        a10.append(this.appendReplayParameter);
        return a10.toString();
    }

    public String a() {
        return this.replayParameter;
    }

    public TrackingSource b() {
        return this.trackingSource;
    }

    public void a(String str) {
        this.replayParameter = str;
    }
}
