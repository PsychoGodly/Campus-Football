package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

public final class ja extends gi {

    /* renamed from: d  reason: collision with root package name */
    public static final m2.a f8713d = jy.f8813a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8714b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8715c;

    public ja() {
        this.f8714b = false;
        this.f8715c = false;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static ja b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 0);
        if (bundle.getBoolean(a(1), false)) {
            return new ja(bundle.getBoolean(a(2), false));
        }
        return new ja();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        if (this.f8715c == jaVar.f8715c && this.f8714b == jaVar.f8714b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f8714b), Boolean.valueOf(this.f8715c));
    }

    public ja(boolean z10) {
        this.f8714b = true;
        this.f8715c = z10;
    }
}
