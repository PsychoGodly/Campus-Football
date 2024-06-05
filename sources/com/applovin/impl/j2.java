package com.applovin.impl;

import androidx.recyclerview.widget.RecyclerView;

public abstract class j2 {

    /* renamed from: a  reason: collision with root package name */
    private int f8662a;

    public final void b(int i10) {
        this.f8662a = i10 | this.f8662a;
    }

    public final void c(int i10) {
        this.f8662a = (~i10) & this.f8662a;
    }

    /* access modifiers changed from: protected */
    public final boolean d(int i10) {
        return (this.f8662a & i10) == i10;
    }

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }

    public void b() {
        this.f8662a = 0;
    }

    public final boolean c() {
        return d(268435456);
    }

    public final boolean d() {
        return d(RecyclerView.UNDEFINED_DURATION);
    }

    public final void e(int i10) {
        this.f8662a = i10;
    }
}
