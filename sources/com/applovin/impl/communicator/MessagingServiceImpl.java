package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f7017a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7018b = new Object();

    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ScheduledThreadPoolExecutor a10 = a();
        this.f7017a = a10;
        a10.execute(new a(appLovinCommunicatorMessage));
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f7018b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7017a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, b.f7020a);
            return scheduledThreadPoolExecutor2;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
