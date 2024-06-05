package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.core.configuration.IExperiments;

public class BiddingManagerFactory {
    private static BiddingManagerFactory instance;

    /* renamed from: com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType[] r0 = com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType = r0
                com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType r1 = com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.EAGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType r1 = com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory.AnonymousClass1.<clinit>():void");
        }
    }

    private BiddingManagerFactory() {
    }

    private BiddingBaseManager getExperiment(IUnityAdsTokenListener iUnityAdsTokenListener, IExperiments iExperiments) {
        if (iExperiments == null || iExperiments.getScarBiddingManager() == null) {
            return new BiddingDisabledManager(iUnityAdsTokenListener);
        }
        if (AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType[ScarBiddingManagerType.fromName(iExperiments.getScarBiddingManager()).ordinal()] != 1) {
            return new BiddingDisabledManager(iUnityAdsTokenListener);
        }
        return new BiddingEagerManager(iExperiments.isScarBannerHbEnabled(), iUnityAdsTokenListener);
    }

    public static BiddingManagerFactory getInstance() {
        if (instance == null) {
            instance = new BiddingManagerFactory();
        }
        return instance;
    }

    public BiddingBaseManager createManager(IUnityAdsTokenListener iUnityAdsTokenListener, IExperiments iExperiments) {
        if (GMA.getInstance().hasSCARBiddingSupport()) {
            return getExperiment(iUnityAdsTokenListener, iExperiments);
        }
        return new BiddingDisabledManager(iUnityAdsTokenListener);
    }
}
