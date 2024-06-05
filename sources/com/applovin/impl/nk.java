package com.applovin.impl;

import android.util.SparseArray;

final class nk {

    /* renamed from: a  reason: collision with root package name */
    private int f10001a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f10002b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final p4 f10003c;

    public nk(p4 p4Var) {
        this.f10003c = p4Var;
        this.f10001a = -1;
    }

    public void a(int i10, Object obj) {
        boolean z10 = false;
        if (this.f10001a == -1) {
            a1.b(this.f10002b.size() == 0);
            this.f10001a = 0;
        }
        if (this.f10002b.size() > 0) {
            SparseArray sparseArray = this.f10002b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            a1.a(z10);
            if (keyAt == i10) {
                p4 p4Var = this.f10003c;
                SparseArray sparseArray2 = this.f10002b;
                p4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f10002b.append(i10, obj);
    }

    public void b(int i10) {
        int i11 = 0;
        while (i11 < this.f10002b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f10002b.keyAt(i12)) {
                this.f10003c.accept(this.f10002b.valueAt(i11));
                this.f10002b.removeAt(i11);
                int i13 = this.f10001a;
                if (i13 > 0) {
                    this.f10001a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public Object c(int i10) {
        if (this.f10001a == -1) {
            this.f10001a = 0;
        }
        while (true) {
            int i11 = this.f10001a;
            if (i11 > 0 && i10 < this.f10002b.keyAt(i11)) {
                this.f10001a--;
            }
        }
        while (this.f10001a < this.f10002b.size() - 1 && i10 >= this.f10002b.keyAt(this.f10001a + 1)) {
            this.f10001a++;
        }
        return this.f10002b.valueAt(this.f10001a);
    }

    public Object b() {
        SparseArray sparseArray = this.f10002b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean c() {
        return this.f10002b.size() == 0;
    }

    public void a() {
        for (int i10 = 0; i10 < this.f10002b.size(); i10++) {
            this.f10003c.accept(this.f10002b.valueAt(i10));
        }
        this.f10001a = -1;
        this.f10002b.clear();
    }

    public void a(int i10) {
        int size = this.f10002b.size() - 1;
        while (size >= 0 && i10 < this.f10002b.keyAt(size)) {
            this.f10003c.accept(this.f10002b.valueAt(size));
            this.f10002b.removeAt(size);
            size--;
        }
        this.f10001a = this.f10002b.size() > 0 ? Math.min(this.f10001a, this.f10002b.size() - 1) : -1;
    }
}
