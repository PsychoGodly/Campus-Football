package com.unity3d.services.core.extensions;

import fe.p;
import xd.d;

/* compiled from: TaskExtensions.kt */
public final class TaskExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[SYNTHETIC, Splitter:B:19:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object withRetry(long r20, int r22, double r23, java.lang.Exception r25, fe.p<? super java.lang.Integer, ? super xd.d<? super T>, ? extends java.lang.Object> r26, xd.d<? super T> r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1 r1 = (com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1 r1 = new com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = yd.d.c()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0068
            if (r3 == r5) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            int r3 = r1.I$1
            double r6 = r1.D$0
            int r8 = r1.I$0
            long r9 = r1.J$0
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.internal.y r11 = (kotlin.jvm.internal.y) r11
            java.lang.Object r12 = r1.L$1
            fe.p r12 = (fe.p) r12
            java.lang.Object r13 = r1.L$0
            java.lang.Exception r13 = (java.lang.Exception) r13
            sd.p.b(r0)
            goto L_0x0132
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            int r3 = r1.I$2
            int r6 = r1.I$1
            double r7 = r1.D$0
            int r9 = r1.I$0
            long r10 = r1.J$0
            java.lang.Object r12 = r1.L$2
            kotlin.jvm.internal.y r12 = (kotlin.jvm.internal.y) r12
            java.lang.Object r13 = r1.L$1
            fe.p r13 = (fe.p) r13
            java.lang.Object r14 = r1.L$0
            java.lang.Exception r14 = (java.lang.Exception) r14
            sd.p.b(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x00b5
        L_0x0065:
            r0 = move-exception
            goto L_0x00ce
        L_0x0068:
            sd.p.b(r0)
            kotlin.jvm.internal.y r0 = new kotlin.jvm.internal.y
            r0.<init>()
            r6 = r20
            r0.f36054a = r6
            r3 = 0
            r8 = r25
            r9 = r26
            r13 = r0
            r10 = r1
            r11 = r2
            r12 = 0
            r1 = r22
            r2 = r23
        L_0x0081:
            if (r12 >= r1) goto L_0x0158
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x00ba }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.c(r12)     // Catch:{ all -> 0x00ba }
            r10.L$0 = r8     // Catch:{ all -> 0x00ba }
            r10.L$1 = r9     // Catch:{ all -> 0x00ba }
            r10.L$2 = r13     // Catch:{ all -> 0x00ba }
            r10.J$0 = r6     // Catch:{ all -> 0x00ba }
            r10.I$0 = r1     // Catch:{ all -> 0x00ba }
            r10.D$0 = r2     // Catch:{ all -> 0x00ba }
            r10.I$1 = r12     // Catch:{ all -> 0x00ba }
            r10.I$2 = r12     // Catch:{ all -> 0x00ba }
            r10.label = r5     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = r9.invoke(r0, r10)     // Catch:{ all -> 0x00ba }
            if (r0 != r11) goto L_0x00a2
            return r11
        L_0x00a2:
            r14 = r8
            r16 = r9
            r9 = r1
            r1 = r10
            r17 = r13
            r13 = r16
            r18 = r2
            r2 = r11
            r10 = r6
            r3 = r12
            r6 = r3
            r12 = r17
            r7 = r18
        L_0x00b5:
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x00d8
        L_0x00ba:
            r0 = move-exception
            r14 = r8
            r16 = r9
            r9 = r1
            r1 = r10
            r17 = r13
            r13 = r16
            r18 = r2
            r2 = r11
            r10 = r6
            r3 = r12
            r6 = r3
            r12 = r17
            r7 = r18
        L_0x00ce:
            sd.o$a r15 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r0)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x00d8:
            r16 = r6
            r6 = r3
            r3 = r16
            boolean r15 = sd.o.g(r0)
            if (r15 == 0) goto L_0x00e7
            sd.p.b(r0)
            return r0
        L_0x00e7:
            boolean r15 = sd.o.f(r0)
            if (r15 == 0) goto L_0x0148
            java.lang.Throwable r0 = sd.o.d(r0)
            boolean r15 = r0 instanceof com.unity3d.services.core.extensions.AbortRetryException
            if (r15 != 0) goto L_0x0147
            int r6 = r6 + r5
            if (r6 == r9) goto L_0x0146
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unity Ads init: retrying in "
            r0.append(r6)
            long r5 = r12.f36054a
            r0.append(r5)
            java.lang.String r5 = " milliseconds"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            long r5 = r12.f36054a
            r1.L$0 = r14
            r1.L$1 = r13
            r1.L$2 = r12
            r1.J$0 = r10
            r1.I$0 = r9
            r1.D$0 = r7
            r1.I$1 = r3
            r1.label = r4
            java.lang.Object r0 = pe.a1.a(r5, r1)
            if (r0 != r2) goto L_0x012c
            return r2
        L_0x012c:
            r6 = r7
            r8 = r9
            r9 = r10
            r11 = r12
            r12 = r13
            r13 = r14
        L_0x0132:
            double r14 = (double) r9
            double r14 = r14 * r6
            long r14 = (long) r14
            r11.f36054a = r14
            r0 = r3
            r5 = 1
            r16 = r9
            r10 = r1
            r1 = r8
            r9 = r12
            r8 = r13
            r13 = r11
            r11 = r2
            r2 = r6
            r6 = r16
            goto L_0x0154
        L_0x0146:
            throw r14
        L_0x0147:
            throw r0
        L_0x0148:
            r0 = r3
            r16 = r10
            r10 = r1
            r11 = r2
            r2 = r7
            r1 = r9
            r6 = r16
            r9 = r13
            r8 = r14
            r13 = r12
        L_0x0154:
            int r12 = r0 + 1
            goto L_0x0081
        L_0x0158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown exception from withRetry"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, fe.p, xd.d):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j10, int i10, double d10, Exception exc, p pVar, d dVar, int i11, Object obj) {
        return withRetry((i11 & 1) != 0 ? 5000 : j10, (i11 & 2) != 0 ? 6 : i10, (i11 & 4) != 0 ? 2.0d : d10, exc, pVar, dVar);
    }
}
