package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private int f3245a;

    /* renamed from: b  reason: collision with root package name */
    private int f3246b;

    public t(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f3245a | this.f3246b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f3246b = i10;
        } else {
            this.f3245a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f3246b = 0;
        } else {
            this.f3245a = 0;
        }
    }
}
