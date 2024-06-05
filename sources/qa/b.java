package qa;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;
import lc.k;

/* compiled from: BannerAdListener */
class b implements BannerView.IListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f29762a;

    /* compiled from: BannerAdListener */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29763a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.unity3d.services.banners.BannerErrorCode[] r0 = com.unity3d.services.banners.BannerErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29763a = r0
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29763a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29763a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qa.b.a.<clinit>():void");
        }
    }

    public b(k kVar) {
        this.f29762a = kVar;
    }

    private String a(BannerErrorInfo bannerErrorInfo) {
        int i10 = a.f29763a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 == 1) {
            return "unknown";
        }
        if (i10 == 2) {
            return "native";
        }
        if (i10 != 3) {
            return i10 != 4 ? MaxReward.DEFAULT_LABEL : "noFill";
        }
        return "webView";
    }

    public void onBannerClick(BannerView bannerView) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        this.f29762a.c("banner_clicked", hashMap);
    }

    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        hashMap.put("errorCode", a(bannerErrorInfo));
        hashMap.put("errorMessage", bannerErrorInfo.errorMessage);
        this.f29762a.c("banner_error", hashMap);
    }

    public void onBannerLeftApplication(BannerView bannerView) {
    }

    public void onBannerLoaded(BannerView bannerView) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        this.f29762a.c("banner_loaded", hashMap);
    }

    public void onBannerShown(BannerView bannerView) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        this.f29762a.c("banner_shown", hashMap);
    }
}
