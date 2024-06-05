package com.unity3d.services.ads.gmascar.handlers;

import bb.c;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;

public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements h {
    public ScarInterstitialAdHandler(c cVar, EventSubject<com.unity3d.scar.adapter.common.c> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
    }

    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i10));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_LEFT_APPLICATION, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_SKIPPED, new Object[0]);
    }
}
