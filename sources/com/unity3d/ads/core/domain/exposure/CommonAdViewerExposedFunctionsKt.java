package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import kotlin.jvm.internal.m;

/* compiled from: CommonAdViewerExposedFunctions.kt */
public final class CommonAdViewerExposedFunctionsKt {
    public static final ExposedFunction clearStorage() {
        return CommonAdViewerExposedFunctionsKt$clearStorage$1.INSTANCE;
    }

    public static final ExposedFunction deleteStorage() {
        return CommonAdViewerExposedFunctionsKt$deleteStorage$1.INSTANCE;
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        m.e(cacheFile, "cacheFile");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$download$1(cacheFile, adObject);
    }

    /* renamed from: getAdContext-yLuu4LI  reason: not valid java name */
    public static final ExposedFunction m33getAdContextyLuu4LI(GetAndroidAdPlayerContext getAndroidAdPlayerContext, String str, String str2, String str3, IsOMActivated isOMActivated, AdObject adObject) {
        m.e(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        m.e(str, HandleInvocationsFromAdViewer.KEY_AD_DATA);
        m.e(str2, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG);
        m.e(str3, HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
        m.e(isOMActivated, "isOMActivated");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(str, str2, str3, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getAllowedPii$1(deviceInfoRepository);
    }

    public static final ExposedFunction getConnectionType(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getConnectionType$1(deviceInfoRepository);
    }

    public static final ExposedFunction getDeviceMaxVolume(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1(deviceInfoRepository);
    }

    public static final ExposedFunction getDeviceVolume(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getDeviceVolume$1(deviceInfoRepository);
    }

    public static final ExposedFunction getKeysStorage() {
        return CommonAdViewerExposedFunctionsKt$getKeysStorage$1.INSTANCE;
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getScreenHeight$1(deviceInfoRepository);
    }

    public static final ExposedFunction getScreenWidth(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$getScreenWidth$1(deviceInfoRepository);
    }

    public static final ExposedFunction getSessionToken(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getSessionToken$1(sessionRepository);
    }

    public static final ExposedFunction getStorage() {
        return CommonAdViewerExposedFunctionsKt$getStorage$1.INSTANCE;
    }

    public static final ExposedFunction incrementBannerImpressionCount(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1(sessionRepository);
    }

    public static final ExposedFunction isFileCached(GetIsFileCache getIsFileCache) {
        m.e(getIsFileCache, "getIfFileCache");
        return new CommonAdViewerExposedFunctionsKt$isFileCached$1(getIsFileCache);
    }

    public static final ExposedFunction markCampaignStateShown(CampaignRepository campaignRepository, AdObject adObject) {
        m.e(campaignRepository, "campaignRepository");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1(campaignRepository, adObject);
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        m.e(omFinishSession, "omFinishSession");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        m.e(getOmData, "getOmData");
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        m.e(omImpressionOccurred, "omImpressionOccurred");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
        m.e(androidOmStartSession, "omStartSession");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(androidOmStartSession, adObject);
    }

    public static final ExposedFunction openUrl(HandleOpenUrl handleOpenUrl) {
        m.e(handleOpenUrl, "handleOpenUrl");
        return new CommonAdViewerExposedFunctionsKt$openUrl$1(handleOpenUrl);
    }

    public static final ExposedFunction readStorage() {
        return CommonAdViewerExposedFunctionsKt$readStorage$1.INSTANCE;
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        m.e(refresh, "refresh");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction sendDiagnosticEvent(SendDiagnosticEvent sendDiagnosticEvent, AdObject adObject) {
        m.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1(sendDiagnosticEvent, adObject);
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        m.e(getOperativeEventApi, "getOperativeEventApi");
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        m.e(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(DeviceInfoRepository deviceInfoRepository) {
        m.e(deviceInfoRepository, "deviceInfoRepository");
        return new CommonAdViewerExposedFunctionsKt$setAllowedPii$1(deviceInfoRepository);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        m.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return CommonAdViewerExposedFunctionsKt$setStorage$1.INSTANCE;
    }

    public static final ExposedFunction updateTrackingToken(AdObject adObject) {
        m.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$updateTrackingToken$1(adObject);
    }

    public static final ExposedFunction writeStorage() {
        return CommonAdViewerExposedFunctionsKt$writeStorage$1.INSTANCE;
    }
}
