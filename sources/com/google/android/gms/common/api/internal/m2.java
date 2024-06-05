package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m2 {

    /* renamed from: c  reason: collision with root package name */
    public static final Status f15209c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a  reason: collision with root package name */
    final Set<BasePendingResult<?>> f15210a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    private final l2 f15211b = new l2(this);

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends i> basePendingResult) {
        this.f15210a.add(basePendingResult);
        basePendingResult.n(this.f15211b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f15210a.toArray(new BasePendingResult[0])) {
            basePendingResult.n((l2) null);
            if (basePendingResult.m()) {
                this.f15210a.remove(basePendingResult);
            }
        }
    }
}
