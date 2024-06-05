package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class s {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f26644a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Pair<String, String>, Task<l>> f26645b = new androidx.collection.a();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    interface a {
        Task<l> start();
    }

    s(Executor executor) {
        this.f26644a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.tasks.Task<com.google.firebase.iid.l> a(java.lang.String r3, java.lang.String r4, com.google.firebase.iid.s.a r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0079 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<com.google.firebase.iid.l>> r3 = r2.f26645b     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.tasks.Task r3 = (com.google.android.gms.tasks.Task) r3     // Catch:{ all -> 0x0079 }
            r4 = 3
            if (r3 == 0) goto L_0x003b
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r5 = r4.length()     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            int r5 = r5 + 29
            r0.<init>(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x0079 }
            r0.append(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0079 }
        L_0x0039:
            monitor-exit(r2)
            return r3
        L_0x003b:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x0063
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r4 = r3.length()     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            int r4 = r4 + 24
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x0079 }
            r1.append(r3)     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "FirebaseInstanceId"
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r3, r4)     // Catch:{ all -> 0x0079 }
        L_0x0063:
            com.google.android.gms.tasks.Task r3 = r5.start()     // Catch:{ all -> 0x0079 }
            java.util.concurrent.Executor r4 = r2.f26644a     // Catch:{ all -> 0x0079 }
            com.google.firebase.iid.r r5 = new com.google.firebase.iid.r     // Catch:{ all -> 0x0079 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.tasks.Task r3 = r3.continueWithTask(r4, r5)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<com.google.firebase.iid.l>> r4 = r2.f26645b     // Catch:{ all -> 0x0079 }
            r4.put(r0, r3)     // Catch:{ all -> 0x0079 }
            monitor-exit(r2)
            return r3
        L_0x0079:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.s.a(java.lang.String, java.lang.String, com.google.firebase.iid.s$a):com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task b(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.f26645b.remove(pair);
        }
        return task;
    }
}
