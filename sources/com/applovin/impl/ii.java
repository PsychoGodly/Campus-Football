package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

class ii extends ab {

    /* renamed from: f  reason: collision with root package name */
    static final ab f8550f = new ii(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f8551c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f8552d;

    ii(Object[] objArr, int i10) {
        this.f8551c = objArr;
        this.f8552d = i10;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f8551c, 0, objArr, i10, this.f8552d);
        return i10 + this.f8552d;
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return this.f8551c;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f8552d;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    public Object get(int i10) {
        Preconditions.checkElementIndex(i10, this.f8552d);
        return this.f8551c[i10];
    }

    public int size() {
        return this.f8552d;
    }
}
