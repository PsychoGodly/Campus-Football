package com.startapp.sdk.ads.video.vast;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Sta */
public enum VASTErrorCodes {
    ErrorNone(0),
    XMLParsingError(100),
    WrapperTimeout(301),
    WrapperNoReponse(303),
    GeneralLinearError(CommonGatewayClient.CODE_400),
    FileNotFound(401),
    TimeoutMediaFileURI(402),
    MediaFileDisplayError(405),
    UndefinedError(900),
    SAProcessSuccess(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
    
    private int value;

    /* access modifiers changed from: public */
    VASTErrorCodes(int i10) {
        this.value = i10;
    }

    public int a() {
        return this.value;
    }
}
