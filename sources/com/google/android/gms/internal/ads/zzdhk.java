package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdhk implements GestureDetector.OnGestureListener {
    private final zzdgd zza;
    private final zzdhe zzb;

    zzdhk(zzdgd zzdgd, zzdhe zzdhe) {
        this.zza = zzdgd;
        this.zzb = zzdhe;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[SYNTHETIC, Splitter:B:27:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdgd r0 = r6.zza     // Catch:{ all -> 0x007d }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            float r0 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x007d }
            float r2 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x007d }
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x002b
            float r8 = r8.getX()     // Catch:{ all -> 0x007d }
            float r7 = r7.getX()     // Catch:{ all -> 0x007d }
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x007d }
            r3 = 1
            goto L_0x0066
        L_0x002b:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0065
            float r8 = r8.getX()     // Catch:{ all -> 0x007d }
            float r7 = r7.getX()     // Catch:{ all -> 0x007d }
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x007d }
            r3 = 2
            goto L_0x0066
        L_0x003e:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0052
            float r8 = r8.getY()     // Catch:{ all -> 0x007d }
            float r7 = r7.getY()     // Catch:{ all -> 0x007d }
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x007d }
            r3 = 8
            goto L_0x0066
        L_0x0052:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0065
            float r8 = r8.getY()     // Catch:{ all -> 0x007d }
            float r7 = r7.getY()     // Catch:{ all -> 0x007d }
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch:{ all -> 0x007d }
            r3 = 4
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            com.google.android.gms.internal.ads.zzdgd r8 = r6.zza     // Catch:{ all -> 0x007d }
            int r8 = r8.zza()     // Catch:{ all -> 0x007d }
            if (r3 == r8) goto L_0x0070
            monitor-exit(r6)
            return r1
        L_0x0070:
            com.google.android.gms.internal.ads.zzdgd r8 = r6.zza     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdhe r9 = r6.zzb     // Catch:{ all -> 0x007d }
            android.widget.FrameLayout r9 = r9.zzr()     // Catch:{ all -> 0x007d }
            r8.zzD(r9, r7)     // Catch:{ all -> 0x007d }
            monitor-exit(r6)
            return r1
        L_0x007d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhk.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
