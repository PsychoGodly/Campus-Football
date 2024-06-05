package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import w5.a;

/* compiled from: WakeLockHolder */
final class f1 {

    /* renamed from: a  reason: collision with root package name */
    static final long f26801a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f26802b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f26803c;

    private static void b(Context context) {
        if (f26803c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f26803c = aVar;
            aVar.d(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f26802b) {
            if (f26803c != null && d(intent)) {
                g(intent, false);
                f26803c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, k1 k1Var, Intent intent) {
        synchronized (f26802b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            if (!d10) {
                f26803c.a(f26801a);
            }
            k1Var.c(intent).addOnCompleteListener(new e1(intent));
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName h(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f26802b
            monitor-enter(r0)
            b(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = d(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            g(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            w5.a r4 = f26803c     // Catch:{ all -> 0x0022 }
            long r1 = f26801a     // Catch:{ all -> 0x0022 }
            r4.a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.f1.h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
