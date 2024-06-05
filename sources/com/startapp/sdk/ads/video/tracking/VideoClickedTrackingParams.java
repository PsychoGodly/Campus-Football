package com.startapp.sdk.ads.video.tracking;

import com.startapp.p0;

/* compiled from: Sta */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i10, int i11, boolean z10, String str2) {
        super(str, i10, i11, str2);
        this.isVideoFinished = z10;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        StringBuilder a10 = p0.a("&co=");
        a10.append(this.isVideoFinished ? "POSTROLL" : "VIDEO");
        sb2.append(a10.toString());
        sb2.append(h());
        return b(sb2.toString());
    }
}
