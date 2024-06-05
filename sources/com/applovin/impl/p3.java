package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.Arrays;

public final class p3 implements m2 {

    /* renamed from: g  reason: collision with root package name */
    public static final m2.a f10568g = n10.f9887a;

    /* renamed from: a  reason: collision with root package name */
    public final int f10569a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10570b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10571c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10572d;

    /* renamed from: f  reason: collision with root package name */
    private int f10573f;

    public p3(int i10, int i11, int i12, byte[] bArr) {
        this.f10569a = i10;
        this.f10570b = i11;
        this.f10571c = i12;
        this.f10572d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ p3 a(Bundle bundle) {
        return new p3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3.class != obj.getClass()) {
            return false;
        }
        p3 p3Var = (p3) obj;
        if (this.f10569a == p3Var.f10569a && this.f10570b == p3Var.f10570b && this.f10571c == p3Var.f10571c && Arrays.equals(this.f10572d, p3Var.f10572d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f10573f == 0) {
            this.f10573f = ((((((this.f10569a + 527) * 31) + this.f10570b) * 31) + this.f10571c) * 31) + Arrays.hashCode(this.f10572d);
        }
        return this.f10573f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f10569a);
        sb2.append(", ");
        sb2.append(this.f10570b);
        sb2.append(", ");
        sb2.append(this.f10571c);
        sb2.append(", ");
        sb2.append(this.f10572d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
