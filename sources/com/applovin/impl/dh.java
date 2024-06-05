package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

public final class dh extends gi {

    /* renamed from: c  reason: collision with root package name */
    public static final m2.a f7240c = ew.f7519a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7241b;

    public dh() {
        this.f7241b = -1.0f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static dh b(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(a(0), -1) == 1) {
            z10 = true;
        }
        a1.a(z10);
        float f10 = bundle.getFloat(a(1), -1.0f);
        return f10 == -1.0f ? new dh() : new dh(f10);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof dh) && this.f7241b == ((dh) obj).f7241b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f7241b));
    }

    public dh(float f10) {
        a1.a(f10 >= 0.0f && f10 <= 100.0f, (Object) "percent must be in the range of [0, 100]");
        this.f7241b = f10;
    }
}
