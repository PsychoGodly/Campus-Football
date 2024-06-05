package com.applovin.impl;

import android.util.SparseBooleanArray;

public final class z8 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f13809a;

    private z8(SparseBooleanArray sparseBooleanArray) {
        this.f13809a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f13809a.get(i10);
    }

    public int b(int i10) {
        a1.a(i10, 0, a());
        return this.f13809a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (yp.f13662a >= 24) {
            return this.f13809a.equals(z8Var.f13809a);
        }
        if (a() != z8Var.a()) {
            return false;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            if (b(i10) != z8Var.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (yp.f13662a >= 24) {
            return this.f13809a.hashCode();
        }
        int a10 = a();
        for (int i10 = 0; i10 < a(); i10++) {
            a10 = (a10 * 31) + b(i10);
        }
        return a10;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f13810a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f13811b;

        public b a(int i10) {
            a1.b(!this.f13811b);
            this.f13810a.append(i10, true);
            return this;
        }

        public b a(z8 z8Var) {
            for (int i10 = 0; i10 < z8Var.a(); i10++) {
                a(z8Var.b(i10));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b a(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public z8 a() {
            a1.b(!this.f13811b);
            this.f13811b = true;
            return new z8(this.f13810a);
        }
    }

    public boolean a(int... iArr) {
        for (int a10 : iArr) {
            if (a(a10)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f13809a.size();
    }
}
