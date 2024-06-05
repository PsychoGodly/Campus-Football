package com.startapp;

import android.app.Application;
import android.content.Context;

/* compiled from: Sta */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f15882a;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context a(android.content.Context r10) {
        /*
            android.app.Application r0 = f15882a
            if (r0 != 0) goto L_0x00b0
            boolean r1 = r10 instanceof android.app.Application     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000f
            r0 = r10
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x000d }
            f15882a = r0     // Catch:{ all -> 0x000d }
        L_0x000d:
            r0 = r10
            goto L_0x0029
        L_0x000f:
            boolean r1 = r10 instanceof android.content.ContextWrapper     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0021
            r1 = r10
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch:{ all -> 0x0028 }
            android.content.Context r1 = r1.getBaseContext()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0029
            android.content.Context r0 = a(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0021:
            if (r10 == 0) goto L_0x0029
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            if (r0 != 0) goto L_0x00b0
            android.app.Application r0 = f15882a
            if (r0 != 0) goto L_0x00ad
            java.lang.Class<com.startapp.h0> r1 = com.startapp.h0.class
            monitor-enter(r1)
            android.app.Application r0 = f15882a     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x00a8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r2.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00a6 }
            r2.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x00a6 }
            r2.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a6 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00a6 }
            r5 = 7
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00a6 }
            r6 = 99
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x00a6 }
            r6 = 117(0x75, float:1.64E-43)
            r8 = 1
            r5[r8] = r6     // Catch:{ all -> 0x00a6 }
            r6 = 2
            r9 = 114(0x72, float:1.6E-43)
            r5[r6] = r9     // Catch:{ all -> 0x00a6 }
            r6 = 3
            r5[r6] = r9     // Catch:{ all -> 0x00a6 }
            r6 = 4
            r9 = 101(0x65, float:1.42E-43)
            r5[r6] = r9     // Catch:{ all -> 0x00a6 }
            r6 = 5
            r9 = 110(0x6e, float:1.54E-43)
            r5[r6] = r9     // Catch:{ all -> 0x00a6 }
            r6 = 6
            r9 = 116(0x74, float:1.63E-43)
            r5[r6] = r9     // Catch:{ all -> 0x00a6 }
            r4.<init>(r5)     // Catch:{ all -> 0x00a6 }
            r3.append(r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.app.Application> r4 = android.app.Application.class
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x00a6 }
            r3.append(r4)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a6 }
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ all -> 0x00a6 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x00a6 }
            r2.setAccessible(r8)     // Catch:{ all -> 0x00a6 }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x00a6 }
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch:{ all -> 0x00a6 }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x00a6 }
            r0 = r2
        L_0x00a6:
            f15882a = r0     // Catch:{ all -> 0x00aa }
        L_0x00a8:
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            goto L_0x00ad
        L_0x00aa:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            throw r10
        L_0x00ad:
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r10 = r0
        L_0x00b1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h0.a(android.content.Context):android.content.Context");
    }

    public static Context b(Context context) {
        Context a10 = a(context);
        return a10 != null ? a10 : context;
    }
}
