package com.unity3d.services.ads.gmascar.handlers;

import cb.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;

public class SignalsHandler implements b {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(c.SIGNALS, str);
    }

    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(c.SIGNALS_ERROR, str);
    }
}
