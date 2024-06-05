package pa;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.HashMap;
import lc.k;

/* compiled from: UnityAdsInitializationListener */
public class b implements IUnityAdsInitializationListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f29663a;

    /* compiled from: UnityAdsInitializationListener */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsInitializationError[] r0 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29664a = r0
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29664a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29664a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pa.b.a.<clinit>():void");
        }
    }

    public b(k kVar) {
        this.f29663a = kVar;
    }

    private String a(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i10 = a.f29664a[unityAdsInitializationError.ordinal()];
        if (i10 == 1) {
            return "internalError";
        }
        if (i10 != 2) {
            return i10 != 3 ? MaxReward.DEFAULT_LABEL : "adBlockerDetected";
        }
        return "invalidArgument";
    }

    public void onInitializationComplete() {
        this.f29663a.c("initComplete", new HashMap());
    }

    public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", a(unityAdsInitializationError));
        hashMap.put("errorMessage", str);
        this.f29663a.c("initFailed", hashMap);
    }
}
