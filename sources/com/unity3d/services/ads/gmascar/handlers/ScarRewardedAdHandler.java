package com.unity3d.services.ads.gmascar.handlers;

import bb.c;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;

public class ScarRewardedAdHandler extends ScarAdHandlerBase implements i {
    private boolean _hasEarnedReward = false;

    public ScarRewardedAdHandler(c cVar, EventSubject<com.unity3d.scar.adapter.common.c> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
    }

    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.REWARDED_SHOW_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i10));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_SKIPPED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_EARNED_REWARD, new Object[0]);
    }
}
