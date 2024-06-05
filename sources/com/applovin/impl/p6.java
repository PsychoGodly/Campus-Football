package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

public final class p6 implements m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final p6 f10586d = new p6(0, 0, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final m2.a f10587f = o10.f10050a;

    /* renamed from: a  reason: collision with root package name */
    public final int f10588a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10589b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10590c;

    public p6(int i10, int i11, int i12) {
        this.f10588a = i10;
        this.f10589b = i11;
        this.f10590c = i12;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        if (this.f10588a == p6Var.f10588a && this.f10589b == p6Var.f10589b && this.f10590c == p6Var.f10590c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f10588a + 527) * 31) + this.f10589b) * 31) + this.f10590c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ p6 a(Bundle bundle) {
        return new p6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
