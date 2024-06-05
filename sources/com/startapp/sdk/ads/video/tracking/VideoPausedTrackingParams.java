package com.startapp.sdk.ads.video.tracking;

import com.startapp.p0;

/* compiled from: Sta */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 1;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i10, int i11, int i12, PauseOrigin pauseOrigin2, String str2) {
        super(str, i10, i11, str2);
        this.pauseNum = i12;
        this.pauseOrigin = pauseOrigin2;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        StringBuilder a10 = p0.a("&po=");
        a10.append(this.pauseOrigin.toString());
        sb2.append(a10.toString());
        StringBuilder a11 = p0.a("&pn=");
        a11.append(this.pauseNum);
        sb2.append(a11.toString());
        sb2.append(h());
        return b(sb2.toString());
    }
}
