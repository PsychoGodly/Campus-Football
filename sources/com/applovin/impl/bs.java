package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class bs implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final List f6791a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f6792b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f6793c;

    public bs(List list) {
        this.f6791a = Collections.unmodifiableList(new ArrayList(list));
        this.f6792b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            xr xrVar = (xr) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f6792b;
            jArr[i11] = xrVar.f13443b;
            jArr[i11 + 1] = xrVar.f13444c;
        }
        long[] jArr2 = this.f6792b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f6793c = copyOf;
        Arrays.sort(copyOf);
    }

    public long a(int i10) {
        boolean z10 = true;
        a1.a(i10 >= 0);
        if (i10 >= this.f6793c.length) {
            z10 = false;
        }
        a1.a(z10);
        return this.f6793c[i10];
    }

    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f6791a.size(); i10++) {
            long[] jArr = this.f6792b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                xr xrVar = (xr) this.f6791a.get(i10);
                z4 z4Var = xrVar.f13442a;
                if (z4Var.f13756f == -3.4028235E38f) {
                    arrayList2.add(xrVar);
                } else {
                    arrayList.add(z4Var);
                }
            }
        }
        Collections.sort(arrayList2, ov.f10546a);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((xr) arrayList2.get(i12)).f13442a.a().a((float) (-1 - i12), 1).a());
        }
        return arrayList;
    }

    public int a() {
        return this.f6793c.length;
    }

    public int a(long j10) {
        int a10 = yp.a(this.f6793c, j10, false, false);
        if (a10 < this.f6793c.length) {
            return a10;
        }
        return -1;
    }
}
