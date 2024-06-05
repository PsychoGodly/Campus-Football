package com.startapp.sdk.ads.video.tracking;

import com.startapp.c9;

@c9(extendsClass = true)
/* compiled from: Sta */
public class FractionTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 1;
    private int fraction;

    public void a(int i10) {
        this.fraction = i10;
    }

    public int e() {
        return this.fraction;
    }

    public String toString() {
        return super.toString() + ", fraction=" + this.fraction;
    }
}
