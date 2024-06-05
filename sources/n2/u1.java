package n2;

import android.os.Bundle;
import k4.a;
import k4.n0;
import n2.h;
import r6.k;

/* compiled from: HeartRating */
public final class u1 extends n3 {

    /* renamed from: f  reason: collision with root package name */
    private static final String f20724f = n0.r0(1);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20725g = n0.r0(2);

    /* renamed from: h  reason: collision with root package name */
    public static final h.a<u1> f20726h = t1.f36446a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20727c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20728d;

    public u1() {
        this.f20727c = false;
        this.f20728d = false;
    }

    /* access modifiers changed from: private */
    public static u1 d(Bundle bundle) {
        a.a(bundle.getInt(n3.f20599a, -1) == 0);
        if (bundle.getBoolean(f20724f, false)) {
            return new u1(bundle.getBoolean(f20725g, false));
        }
        return new u1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.f20728d == u1Var.f20728d && this.f20727c == u1Var.f20727c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Boolean.valueOf(this.f20727c), Boolean.valueOf(this.f20728d));
    }

    public u1(boolean z10) {
        this.f20727c = true;
        this.f20728d = z10;
    }
}
