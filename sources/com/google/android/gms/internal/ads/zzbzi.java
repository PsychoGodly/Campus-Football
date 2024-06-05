package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbzi extends ScheduledThreadPoolExecutor {
    zzbzi(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
