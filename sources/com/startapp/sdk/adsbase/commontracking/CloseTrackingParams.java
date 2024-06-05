package com.startapp.sdk.adsbase.commontracking;

/* compiled from: Sta */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private final long duration;

    public CloseTrackingParams(long j10, String str) {
        super(str);
        this.duration = j10;
    }

    public String e() {
        return super.e() + "&displayDuration=" + Math.max(0, this.duration);
    }
}
