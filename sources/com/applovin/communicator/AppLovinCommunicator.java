package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.il;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: e  reason: collision with root package name */
    private static AppLovinCommunicator f6014e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f6015f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private k f6016a;

    /* renamed from: b  reason: collision with root package name */
    private t f6017b;

    /* renamed from: c  reason: collision with root package name */
    private final il f6018c = new il();

    /* renamed from: d  reason: collision with root package name */
    private final MessagingServiceImpl f6019d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6015f) {
            if (f6014e == null) {
                f6014e = new AppLovinCommunicator();
            }
        }
        return f6014e;
    }

    public void a(k kVar) {
        this.f6016a = kVar;
        this.f6017b = kVar.L();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6019d;
    }

    public boolean hasSubscriber(String str) {
        return this.f6018c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6016a.o().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6016a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (!this.f6018c.a(appLovinCommunicatorSubscriber, next)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            this.f6018c.b(appLovinCommunicatorSubscriber, next);
        }
    }

    private void a(String str) {
        if (this.f6017b != null && t.a()) {
            this.f6017b.a("AppLovinCommunicator", str);
        }
    }
}
