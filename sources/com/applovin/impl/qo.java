package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.Arrays;
import java.util.List;

public final class qo implements m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final qo f11064d = new qo(new po[0]);

    /* renamed from: f  reason: collision with root package name */
    public static final m2.a f11065f = y10.f13483a;

    /* renamed from: a  reason: collision with root package name */
    public final int f11066a;

    /* renamed from: b  reason: collision with root package name */
    private final po[] f11067b;

    /* renamed from: c  reason: collision with root package name */
    private int f11068c;

    public qo(po... poVarArr) {
        this.f11067b = poVarArr;
        this.f11066a = poVarArr.length;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public po a(int i10) {
        return this.f11067b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo.class != obj.getClass()) {
            return false;
        }
        qo qoVar = (qo) obj;
        if (this.f11066a != qoVar.f11066a || !Arrays.equals(this.f11067b, qoVar.f11067b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11068c == 0) {
            this.f11068c = Arrays.hashCode(this.f11067b);
        }
        return this.f11068c;
    }

    public int a(po poVar) {
        for (int i10 = 0; i10 < this.f11066a; i10++) {
            if (this.f11067b[i10] == poVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.f11066a == 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qo a(Bundle bundle) {
        return new qo((po[]) n2.a(po.f10687d, (List) bundle.getParcelableArrayList(b(0)), (List) ab.h()).toArray(new po[0]));
    }
}
