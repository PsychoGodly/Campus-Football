package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds;

public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;

    /* renamed from: com.unity3d.services.banners.BannerErrorInfo$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r0 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = r0
                r1 = 1
                com.unity3d.ads.UnityAds$UnityAdsLoadError r2 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r3 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r4 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r4 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x003e }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r4 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.unity3d.services.banners.BannerErrorCode[] r3 = com.unity3d.services.banners.BannerErrorCode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode = r3
                com.unity3d.services.banners.BannerErrorCode r4 = com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = $SwitchMap$com$unity3d$services$banners$BannerErrorCode     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.unity3d.services.banners.BannerErrorCode r3 = com.unity3d.services.banners.BannerErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$com$unity3d$services$banners$BannerErrorCode     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.<clinit>():void");
        }
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public static BannerErrorInfo fromLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new BannerErrorInfo(str, BannerErrorCode.NATIVE_ERROR);
        }
        if (i10 == 4) {
            return new BannerErrorInfo(str, BannerErrorCode.WEBVIEW_ERROR);
        }
        if (i10 != 5) {
            return new BannerErrorInfo(str, BannerErrorCode.UNKNOWN);
        }
        return new BannerErrorInfo(str, BannerErrorCode.NO_FILL);
    }

    public UnityAds.UnityAdsLoadError toLoadError() {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        if (i10 == 1) {
            return UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
        }
        if (i10 == 2) {
            return UnityAds.UnityAdsLoadError.NO_FILL;
        }
        if (i10 != 3) {
            return UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        }
        return UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
    }
}
