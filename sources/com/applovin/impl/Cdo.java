package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* renamed from: com.applovin.impl.do  reason: invalid class name */
public final class Cdo extends gi {

    /* renamed from: d  reason: collision with root package name */
    public static final m2.a f7289d = fw.f7869a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7290b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7291c;

    public Cdo() {
        this.f7290b = false;
        this.f7291c = false;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static Cdo b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 3);
        if (bundle.getBoolean(a(1), false)) {
            return new Cdo(bundle.getBoolean(a(2), false));
        }
        return new Cdo();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo doVar = (Cdo) obj;
        if (this.f7291c == doVar.f7291c && this.f7290b == doVar.f7290b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f7290b), Boolean.valueOf(this.f7291c));
    }

    public Cdo(boolean z10) {
        this.f7290b = true;
        this.f7291c = z10;
    }
}
