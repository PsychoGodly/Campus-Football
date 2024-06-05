package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

public final class yq implements m2 {

    /* renamed from: f  reason: collision with root package name */
    public static final yq f13677f = new yq(0, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final m2.a f13678g = u80.f12544a;

    /* renamed from: a  reason: collision with root package name */
    public final int f13679a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13680b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13681c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13682d;

    public yq(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        if (this.f13679a == yqVar.f13679a && this.f13680b == yqVar.f13680b && this.f13681c == yqVar.f13681c && this.f13682d == yqVar.f13682d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f13679a + 217) * 31) + this.f13680b) * 31) + this.f13681c) * 31) + Float.floatToRawIntBits(this.f13682d);
    }

    public yq(int i10, int i11, int i12, float f10) {
        this.f13679a = i10;
        this.f13680b = i11;
        this.f13681c = i12;
        this.f13682d = f10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ yq a(Bundle bundle) {
        return new yq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
