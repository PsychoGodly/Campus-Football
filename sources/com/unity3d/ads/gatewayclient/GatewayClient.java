package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.UnityAdsConstants;
import vb.t3;
import vb.w3;
import xd.d;

/* compiled from: GatewayClient.kt */
public interface GatewayClient {

    /* compiled from: GatewayClient.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, t3 t3Var, RequestPolicy requestPolicy, OperationType operationType, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
                }
                String str2 = str;
                if ((i10 & 8) != 0) {
                    operationType = OperationType.UNKNOWN;
                }
                return gatewayClient.request(str2, t3Var, requestPolicy, operationType, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
    }

    Object request(String str, t3 t3Var, RequestPolicy requestPolicy, OperationType operationType, d<? super w3> dVar);
}
