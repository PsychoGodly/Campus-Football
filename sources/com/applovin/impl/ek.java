package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

final class ek extends eb {

    /* renamed from: c  reason: collision with root package name */
    final transient Object f7453c;

    /* renamed from: d  reason: collision with root package name */
    private transient int f7454d;

    ek(Object obj) {
        this.f7453c = Preconditions.checkNotNull(obj);
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i10) {
        objArr[i10] = this.f7453c;
        return i10 + 1;
    }

    public boolean contains(Object obj) {
        return this.f7453c.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public ab f() {
        return ab.a(this.f7453c);
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f7454d != 0;
    }

    public final int hashCode() {
        int i10 = this.f7454d;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.f7453c.hashCode();
        this.f7454d = hashCode;
        return hashCode;
    }

    public qp iterator() {
        return sb.a(this.f7453c);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f7453c.toString() + ']';
    }

    ek(Object obj, int i10) {
        this.f7453c = obj;
        this.f7454d = i10;
    }
}
