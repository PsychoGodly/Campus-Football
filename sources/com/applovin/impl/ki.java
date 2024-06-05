package com.applovin.impl;

final class ki extends eb {

    /* renamed from: i  reason: collision with root package name */
    static final ki f9016i = new ki(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f9017c;

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f9018d;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f9019f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f9020g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f9021h;

    ki(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f9017c = objArr;
        this.f9018d = objArr2;
        this.f9019f = i11;
        this.f9020g = i10;
        this.f9021h = i12;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f9017c, 0, objArr, i10, this.f9021h);
        return i10 + this.f9021h;
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return this.f9017c;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f9021h;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f9018d;
        if (obj == null || objArr == null) {
            return false;
        }
        int a10 = ia.a(obj);
        while (true) {
            int i10 = a10 & this.f9019f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public ab f() {
        return ab.b(this.f9017c, this.f9021h);
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return true;
    }

    public int hashCode() {
        return this.f9020g;
    }

    public qp iterator() {
        return a().iterator();
    }

    public int size() {
        return this.f9021h;
    }
}
