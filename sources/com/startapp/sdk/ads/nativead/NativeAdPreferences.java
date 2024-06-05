package com.startapp.sdk.ads.nativead;

import com.startapp.p0;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class NativeAdPreferences extends AdPreferences {
    private static final long serialVersionUID = 4908967312868830516L;
    private int adsNumber = 1;
    private boolean autoBitmapDownload = false;
    private NativeAdBitmapSize bitmapSize;
    private boolean isContentAd = false;
    private int moreImage = -1;
    private int primaryImage = -1;
    private boolean useSimpleToken = true;

    /* compiled from: Sta */
    public enum NativeAdBitmapSize {
        SIZE72X72(72, 72),
        SIZE100X100(100, 100),
        SIZE150X150(150, 150),
        SIZE340X340(340, 340);
        
        public int height;
        public int width;

        private NativeAdBitmapSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public NativeAdPreferences() {
    }

    public int getAdsNumber() {
        return this.adsNumber;
    }

    public NativeAdBitmapSize getImageSize() {
        return this.bitmapSize;
    }

    public int getPrimaryImageSize() {
        return this.primaryImage;
    }

    public int getSecondaryImageSize() {
        return this.moreImage;
    }

    public boolean isAutoBitmapDownload() {
        return this.autoBitmapDownload;
    }

    public boolean isContentAd() {
        return this.isContentAd;
    }

    public boolean isSimpleToken() {
        return this.useSimpleToken;
    }

    public NativeAdPreferences setAdsNumber(int i10) {
        if (i10 > 0) {
            this.adsNumber = i10;
            return this;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public NativeAdPreferences setAutoBitmapDownload(boolean z10) {
        this.autoBitmapDownload = z10;
        return this;
    }

    public NativeAdPreferences setContentAd(boolean z10) {
        this.isContentAd = z10;
        return this;
    }

    public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeAdBitmapSize) {
        this.bitmapSize = nativeAdBitmapSize;
        return this;
    }

    public NativeAdPreferences setPrimaryImageSize(int i10) {
        this.primaryImage = i10;
        return this;
    }

    public NativeAdPreferences setSecondaryImageSize(int i10) {
        this.moreImage = i10;
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===== NativeAdConfig =====\n");
        StringBuilder a10 = p0.a("    adsNumber: [");
        a10.append(getAdsNumber());
        a10.append("]\n");
        stringBuffer.append(a10.toString());
        stringBuffer.append("    autoBitmapDownload: [" + isAutoBitmapDownload() + "]\n");
        stringBuffer.append("    useSimpleToken: [" + isSimpleToken() + "]\n");
        stringBuffer.append("===== End NativeAdConfig =====");
        return stringBuffer.toString();
    }

    public NativeAdPreferences useSimpleToken(boolean z10) {
        this.useSimpleToken = z10;
        return this;
    }

    public NativeAdPreferences(NativeAdPreferences nativeAdPreferences) {
        super(nativeAdPreferences);
        this.adsNumber = nativeAdPreferences.adsNumber;
        this.autoBitmapDownload = nativeAdPreferences.autoBitmapDownload;
        this.bitmapSize = nativeAdPreferences.bitmapSize;
        this.primaryImage = nativeAdPreferences.primaryImage;
        this.moreImage = nativeAdPreferences.moreImage;
        this.isContentAd = nativeAdPreferences.isContentAd;
        this.useSimpleToken = nativeAdPreferences.useSimpleToken;
    }
}
