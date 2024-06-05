package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestDeduplicator */
class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f26890a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Task<String>> f26891b = new androidx.collection.a();

    /* compiled from: RequestDeduplicator */
    interface a {
        Task<String> start();
    }

    s0(Executor executor) {
        this.f26890a = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f26891b.remove(str);
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.tasks.Task<java.lang.String> b(java.lang.String r4, com.google.firebase.messaging.s0.a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>> r0 = r3.f26891b     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ all -> 0x0060 }
            r1 = 3
            if (r0 == 0) goto L_0x002c
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Joining ongoing request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x0060 }
        L_0x002a:
            monitor-exit(r3)
            return r0
        L_0x002c:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Making new request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x004a:
            com.google.android.gms.tasks.Task r5 = r5.start()     // Catch:{ all -> 0x0060 }
            java.util.concurrent.Executor r0 = r3.f26890a     // Catch:{ all -> 0x0060 }
            com.google.firebase.messaging.r0 r1 = new com.google.firebase.messaging.r0     // Catch:{ all -> 0x0060 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.tasks.Task r5 = r5.continueWithTask(r0, r1)     // Catch:{ all -> 0x0060 }
            java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>> r0 = r3.f26891b     // Catch:{ all -> 0x0060 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r5
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s0.b(java.lang.String, com.google.firebase.messaging.s0$a):com.google.android.gms.tasks.Task");
    }
}
