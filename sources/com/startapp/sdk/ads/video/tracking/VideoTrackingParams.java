package com.startapp.sdk.ads.video.tracking;

import com.applovin.mediation.MaxReward;
import com.startapp.p0;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private int completed;
    public boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(String str, int i10, int i11, String str2) {
        super(str);
        a(i11);
        this.completed = i10;
        this.videoPlayingMode = str2;
    }

    public VideoTrackingParams a(boolean z10) {
        this.shouldAppendOffset = z10;
        return this;
    }

    public String b(String str) {
        if (!this.internalParamsIndicator) {
            return c();
        }
        return super.e() + str;
    }

    public VideoTrackingParams c(String str) {
        this.replayParameter = str;
        return this;
    }

    public String e() {
        return b(g() + h());
    }

    public String g() {
        StringBuilder a10 = p0.a("&cp=");
        a10.append(this.completed);
        return a10.toString();
    }

    public String h() {
        StringBuilder a10 = p0.a("&vpm=");
        a10.append(this.videoPlayingMode);
        return a10.toString();
    }

    public String c() {
        if (!this.shouldAppendOffset) {
            return MaxReward.DEFAULT_LABEL;
        }
        String str = this.replayParameter;
        if (str != null) {
            return str.replace("%startapp_replay_count%", new Integer(b()).toString());
        }
        return super.c();
    }
}
