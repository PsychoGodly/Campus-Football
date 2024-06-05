package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class f0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List f14795a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List f14796b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List f14797c = new ArrayList();

    public final f0 a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f14795a.size()) {
            double doubleValue = ((Double) this.f14797c.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.f14796b.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f14795a.add(i10, str);
        this.f14797c.add(i10, Double.valueOf(d10));
        this.f14796b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final h0 b() {
        return new h0(this, (g0) null);
    }
}
