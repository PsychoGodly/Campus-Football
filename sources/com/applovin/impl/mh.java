package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

public final class mh implements m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final mh f9802d = new mh(1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final m2.a f9803f = gz.f8156a;

    /* renamed from: a  reason: collision with root package name */
    public final float f9804a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9805b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9806c;

    public mh(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f9806c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mh.class != obj.getClass()) {
            return false;
        }
        mh mhVar = (mh) obj;
        if (this.f9804a == mhVar.f9804a && this.f9805b == mhVar.f9805b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f9804a) + 527) * 31) + Float.floatToRawIntBits(this.f9805b);
    }

    public String toString() {
        return yp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9804a), Float.valueOf(this.f9805b));
    }

    public mh(float f10, float f11) {
        boolean z10 = true;
        a1.a(f10 > 0.0f);
        a1.a(f11 <= 0.0f ? false : z10);
        this.f9804a = f10;
        this.f9805b = f11;
        this.f9806c = Math.round(f10 * 1000.0f);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mh a(Bundle bundle) {
        return new mh(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public mh a(float f10) {
        return new mh(f10, this.f9805b);
    }
}
