package pa;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* compiled from: UnityAdsShowListener */
public class e implements IUnityAdsShowListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f29674a;

    /* compiled from: UnityAdsShowListener */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29675a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsShowError[] r0 = com.unity3d.ads.UnityAds.UnityAdsShowError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29675a = r0
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f29675a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pa.e.a.<clinit>():void");
        }
    }

    public e(a aVar) {
        this.f29674a = aVar;
    }

    private String a(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (a.f29675a[unityAdsShowError.ordinal()]) {
            case 1:
                return "notInitialized";
            case 2:
                return "notReady";
            case 3:
                return "videoPlayerError";
            case 4:
                return "invalidArgument";
            case 5:
                return "noConnection";
            case 6:
                return "alreadyShowing";
            case 7:
                return "internalError";
            case 8:
                return "timeout";
            default:
                return MaxReward.DEFAULT_LABEL;
        }
    }

    public void onUnityAdsShowClick(String str) {
        this.f29674a.a("showClick", str);
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.SKIPPED) {
            this.f29674a.a("showSkipped", str);
        } else if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
            this.f29674a.a("showComplete", str);
        }
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f29674a.b("showFailed", str, a(unityAdsShowError), str2);
    }

    public void onUnityAdsShowStart(String str) {
        this.f29674a.a("showStart", str);
    }
}
