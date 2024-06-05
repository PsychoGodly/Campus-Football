package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.t;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class jl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8783a = true;

    /* renamed from: b  reason: collision with root package name */
    private final String f8784b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f8785c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f8786d = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f8787f = new Object();

    jl(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f8784b = str;
        this.f8785c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f8785c.get();
    }

    public String b() {
        return this.f8784b;
    }

    public boolean c() {
        return this.f8783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8785c.get();
        jl jlVar = (jl) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) jlVar.f8785c.get();
        if (b().equals(jlVar.b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f8784b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8785c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void onReceive(Intent intent, Map map) {
        if (a() == null) {
            t.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z10 = false;
        synchronized (this.f8787f) {
            if (!this.f8786d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f8786d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f8783a = z10;
    }
}
