package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

public final class zk extends gi {

    /* renamed from: d  reason: collision with root package name */
    public static final m2.a f13939d = g90.f7935a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13940b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13941c;

    public zk(int i10) {
        a1.a(i10 > 0, (Object) "maxStars must be a positive integer");
        this.f13940b = i10;
        this.f13941c = -1.0f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static zk b(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(a(0), -1) == 2) {
            z10 = true;
        }
        a1.a(z10);
        int i10 = bundle.getInt(a(1), 5);
        float f10 = bundle.getFloat(a(2), -1.0f);
        if (f10 == -1.0f) {
            return new zk(i10);
        }
        return new zk(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        if (this.f13940b == zkVar.f13940b && this.f13941c == zkVar.f13941c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f13940b), Float.valueOf(this.f13941c));
    }

    public zk(int i10, float f10) {
        boolean z10 = true;
        a1.a(i10 > 0, (Object) "maxStars must be a positive integer");
        a1.a((f10 < 0.0f || f10 > ((float) i10)) ? false : z10, (Object) "starRating is out of range [0, maxStars]");
        this.f13940b = i10;
        this.f13941c = f10;
    }
}
