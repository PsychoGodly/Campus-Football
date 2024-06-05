package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.y6;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public enum x6 {
    STORAGE(y6.a.AD_STORAGE, y6.a.ANALYTICS_STORAGE),
    DMA(y6.a.AD_USER_DATA);
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final y6.a[] f25242a;

    private x6(y6.a... aVarArr) {
        this.f25242a = aVarArr;
    }

    public final y6.a[] a() {
        return this.f25242a;
    }
}
