package com.startapp.sdk.ads.video.tracking;

import com.startapp.c9;

@c9(extendsClass = true)
/* compiled from: Sta */
public class AbsoluteTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 1;
    private int videoOffsetMillis;

    public void a(int i10) {
        this.videoOffsetMillis = i10;
    }

    public int e() {
        return this.videoOffsetMillis;
    }

    public String toString() {
        return super.toString() + ", videoOffsetMillis=" + this.videoOffsetMillis;
    }
}
