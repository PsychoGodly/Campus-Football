package com.startapp.sdk.ads.banner;

/* compiled from: Sta */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, 250),
    COVER(2, 1200, 628);
    
    public final int heightDp;
    public final int type;
    public final int widthDp;

    private BannerFormat(int i10, int i11, int i12) {
        this.type = i10;
        this.widthDp = i11;
        this.heightDp = i12;
    }
}
