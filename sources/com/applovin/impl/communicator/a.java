package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinCommunicatorMessage f7019a;

    public /* synthetic */ a(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f7019a = appLovinCommunicatorMessage;
    }

    public final void run() {
        AppLovinBroadcastManager.sendBroadcastSync(this.f7019a, (Map<String, Object>) null);
    }
}
