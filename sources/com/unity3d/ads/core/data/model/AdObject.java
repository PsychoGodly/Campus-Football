package com.unity3d.ads.core.data.model;

import com.google.protobuf.i;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.r0;

/* compiled from: AdObject.kt */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final r0 adType;
    private final Boolean isHeaderBidding;
    private final UnityAdsLoadOptions loadOptions;
    private final i opportunityId;
    private final String placementId;
    private String playerServerId;
    private i trackingToken;

    public AdObject(i iVar, String str, i iVar2, AdPlayer adPlayer2, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, r0 r0Var) {
        m.e(iVar, "opportunityId");
        m.e(str, "placementId");
        m.e(iVar2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        m.e(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        m.e(r0Var, "adType");
        this.opportunityId = iVar;
        this.placementId = str;
        this.trackingToken = iVar2;
        this.adPlayer = adPlayer2;
        this.playerServerId = str2;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = bool;
        this.adType = r0Var;
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, i iVar, String str, i iVar2, AdPlayer adPlayer2, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, r0 r0Var, int i10, Object obj) {
        AdObject adObject2 = adObject;
        int i11 = i10;
        return adObject.copy((i11 & 1) != 0 ? adObject2.opportunityId : iVar, (i11 & 2) != 0 ? adObject2.placementId : str, (i11 & 4) != 0 ? adObject2.trackingToken : iVar2, (i11 & 8) != 0 ? adObject2.adPlayer : adPlayer2, (i11 & 16) != 0 ? adObject2.playerServerId : str2, (i11 & 32) != 0 ? adObject2.loadOptions : unityAdsLoadOptions, (i11 & 64) != 0 ? adObject2.isHeaderBidding : bool, (i11 & 128) != 0 ? adObject2.adType : r0Var);
    }

    public final i component1() {
        return this.opportunityId;
    }

    public final String component2() {
        return this.placementId;
    }

    public final i component3() {
        return this.trackingToken;
    }

    public final AdPlayer component4() {
        return this.adPlayer;
    }

    public final String component5() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component6() {
        return this.loadOptions;
    }

    public final Boolean component7() {
        return this.isHeaderBidding;
    }

    public final r0 component8() {
        return this.adType;
    }

    public final AdObject copy(i iVar, String str, i iVar2, AdPlayer adPlayer2, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, r0 r0Var) {
        m.e(iVar, "opportunityId");
        m.e(str, "placementId");
        m.e(iVar2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        m.e(unityAdsLoadOptions2, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        r0 r0Var2 = r0Var;
        m.e(r0Var2, "adType");
        return new AdObject(iVar, str, iVar2, adPlayer2, str2, unityAdsLoadOptions2, bool, r0Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return m.a(this.opportunityId, adObject.opportunityId) && m.a(this.placementId, adObject.placementId) && m.a(this.trackingToken, adObject.trackingToken) && m.a(this.adPlayer, adObject.adPlayer) && m.a(this.playerServerId, adObject.playerServerId) && m.a(this.loadOptions, adObject.loadOptions) && m.a(this.isHeaderBidding, adObject.isHeaderBidding) && this.adType == adObject.adType;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final r0 getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final i getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final i getTrackingToken() {
        return this.trackingToken;
    }

    public int hashCode() {
        int hashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        AdPlayer adPlayer2 = this.adPlayer;
        int i10 = 0;
        int hashCode2 = (hashCode + (adPlayer2 == null ? 0 : adPlayer2.hashCode())) * 31;
        String str = this.playerServerId;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.loadOptions.hashCode()) * 31;
        Boolean bool = this.isHeaderBidding;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.adType.hashCode();
    }

    public final Boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setTrackingToken(i iVar) {
        m.e(iVar, "<set-?>");
        this.trackingToken = iVar;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdObject(i iVar, String str, i iVar2, AdPlayer adPlayer2, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, r0 r0Var, int i10, h hVar) {
        this(iVar, str, iVar2, (i10 & 8) != 0 ? null : adPlayer2, (i10 & 16) != 0 ? null : str2, unityAdsLoadOptions, (i10 & 64) != 0 ? null : bool, r0Var);
    }
}
