package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.a0;

/* compiled from: ViewOffsetHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f25387a;

    /* renamed from: b  reason: collision with root package name */
    private int f25388b;

    /* renamed from: c  reason: collision with root package name */
    private int f25389c;

    /* renamed from: d  reason: collision with root package name */
    private int f25390d;

    /* renamed from: e  reason: collision with root package name */
    private int f25391e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25392f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25393g = true;

    public d(View view) {
        this.f25387a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f25387a;
        a0.Y(view, this.f25390d - (view.getTop() - this.f25388b));
        View view2 = this.f25387a;
        a0.X(view2, this.f25391e - (view2.getLeft() - this.f25389c));
    }

    public int b() {
        return this.f25390d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f25388b = this.f25387a.getTop();
        this.f25389c = this.f25387a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f25393g || this.f25391e == i10) {
            return false;
        }
        this.f25391e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f25392f || this.f25390d == i10) {
            return false;
        }
        this.f25390d = i10;
        a();
        return true;
    }
}
