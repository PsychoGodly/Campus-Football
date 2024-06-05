package com.pichillilorenzo.flutter_inappwebview_android.types;

import lc.j;
import lc.k;

public class ChannelDelegateImpl implements IChannelDelegate {
    private k channel;

    public ChannelDelegateImpl(k kVar) {
        this.channel = kVar;
        kVar.e(this);
    }

    public void dispose() {
        k kVar = this.channel;
        if (kVar != null) {
            kVar.e((k.c) null);
            this.channel = null;
        }
    }

    public k getChannel() {
        return this.channel;
    }

    public void onMethodCall(j jVar, k.d dVar) {
    }
}
