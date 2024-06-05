package com.onesignal;

import android.content.pm.PackageInfo;
import kotlin.jvm.internal.m;

/* compiled from: PackageInfoHelper.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28441a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfo f28442b;

    public y(boolean z10, PackageInfo packageInfo) {
        this.f28441a = z10;
        this.f28442b = packageInfo;
    }

    public final PackageInfo a() {
        return this.f28442b;
    }

    public final boolean b() {
        return this.f28441a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f28441a == yVar.f28441a && m.a(this.f28442b, yVar.f28442b);
    }

    public int hashCode() {
        boolean z10 = this.f28441a;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        PackageInfo packageInfo = this.f28442b;
        return i10 + (packageInfo == null ? 0 : packageInfo.hashCode());
    }

    public String toString() {
        return "GetPackageInfoResult(successful=" + this.f28441a + ", packageInfo=" + this.f28442b + ')';
    }
}
