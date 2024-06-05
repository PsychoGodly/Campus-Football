package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    final Map f14930a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f14931b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f14930a.get(num);
    }
}
