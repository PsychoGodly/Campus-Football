package com.applovin.impl;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;

public class il {

    /* renamed from: a  reason: collision with root package name */
    private final Set f8562a = new HashSet(32);

    /* renamed from: b  reason: collision with root package name */
    private final Object f8563b = new Object();

    public boolean a(String str) {
        synchronized (this.f8563b) {
            for (jl b10 : this.f8562a) {
                if (str.equals(b10.b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        jl a10;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f8563b) {
                a10 = a(str, appLovinCommunicatorSubscriber);
            }
            if (a10 != null) {
                a10.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a10);
            }
        }
    }

    private jl a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (jl jlVar : this.f8562a) {
            if (str.equals(jlVar.b()) && appLovinCommunicatorSubscriber.equals(jlVar.a())) {
                return jlVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.communicator.AppLovinCommunicatorSubscriber r7, java.lang.String r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0060
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r8)
            if (r0 != 0) goto L_0x0009
            goto L_0x0060
        L_0x0009:
            java.lang.Object r0 = r6.f8563b
            monitor-enter(r0)
            com.applovin.impl.jl r1 = r6.a((java.lang.String) r8, (com.applovin.communicator.AppLovinCommunicatorSubscriber) r7)     // Catch:{ all -> 0x005d }
            r2 = 1
            if (r1 == 0) goto L_0x0049
            java.lang.String r3 = "AppLovinCommunicator"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r4.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "Attempting to re-subscribe subscriber ("
            r4.append(r5)     // Catch:{ all -> 0x005d }
            r4.append(r7)     // Catch:{ all -> 0x005d }
            java.lang.String r7 = ") to topic ("
            r4.append(r7)     // Catch:{ all -> 0x005d }
            r4.append(r8)     // Catch:{ all -> 0x005d }
            java.lang.String r7 = ")"
            r4.append(r7)     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x005d }
            com.applovin.impl.sdk.t.h(r3, r7)     // Catch:{ all -> 0x005d }
            boolean r7 = r1.c()     // Catch:{ all -> 0x005d }
            if (r7 != 0) goto L_0x0047
            r1.a(r2)     // Catch:{ all -> 0x005d }
            android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch:{ all -> 0x005d }
            r7.<init>(r8)     // Catch:{ all -> 0x005d }
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(r1, r7)     // Catch:{ all -> 0x005d }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r2
        L_0x0049:
            com.applovin.impl.jl r1 = new com.applovin.impl.jl     // Catch:{ all -> 0x005d }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x005d }
            java.util.Set r7 = r6.f8562a     // Catch:{ all -> 0x005d }
            r7.add(r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>(r8)
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(r1, r7)
            return r2
        L_0x005d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r7
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to subscribe - invalid subscriber ("
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ") or topic ("
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "AppLovinCommunicator"
            com.applovin.impl.sdk.t.h(r8, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.il.a(com.applovin.communicator.AppLovinCommunicatorSubscriber, java.lang.String):boolean");
    }
}
