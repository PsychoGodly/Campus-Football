package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final t logger;
    private final k sdk;

    public ArrayDataCollector(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.L();
    }

    public long collectAppHubVersionCode(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (!t.a()) {
                return -1;
            }
            this.logger.a(TAG, "Failed to collect version code", th);
            return -1;
        }
    }

    public Boolean collectDirectDownloadEnabled(IAppHubService iAppHubService) {
        try {
            return Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (Throwable th) {
            if (!t.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect enabled features", th);
            return null;
        }
    }

    public String collectRandomUserToken(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (!t.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect random user token", th);
            return null;
        }
    }
}
