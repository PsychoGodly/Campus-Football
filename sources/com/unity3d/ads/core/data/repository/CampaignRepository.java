package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import vb.a0;
import vb.b0;

/* compiled from: CampaignRepository.kt */
public interface CampaignRepository {
    a0 getCampaign(i iVar);

    b0 getCampaignState();

    void removeState(i iVar);

    void setCampaign(i iVar, a0 a0Var);

    void setLoadTimestamp(i iVar);

    void setShowTimestamp(i iVar);
}
