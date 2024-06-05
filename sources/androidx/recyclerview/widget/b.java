package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
class b {

    /* renamed from: a  reason: collision with root package name */
    final C0074b f4520a;

    /* renamed from: b  reason: collision with root package name */
    final a f4521b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f4522c = new ArrayList();

    /* compiled from: ChildHelper */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f4523a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f4524b;

        a() {
        }

        private void c() {
            if (this.f4524b == null) {
                this.f4524b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f4524b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f4523a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f4524b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f4523a);
                }
                return Long.bitCount(this.f4523a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f4523a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f4523a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f4523a & (1 << i10)) != 0;
            }
            c();
            return this.f4524b.d(i10 - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f4524b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4523a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f4523a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f4524b != null) {
                c();
                this.f4524b.e(0, z11);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f4524b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4523a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4523a = j12;
            long j13 = j10 - 1;
            this.f4523a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4524b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f4524b.f(0);
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f4523a = 0;
            a aVar = this.f4524b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f4524b.h(i10 - 64);
                return;
            }
            this.f4523a |= 1 << i10;
        }

        public String toString() {
            if (this.f4524b == null) {
                return Long.toBinaryString(this.f4523a);
            }
            return this.f4524b.toString() + "xx" + Long.toBinaryString(this.f4523a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    interface C0074b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.d0 f(View view);

        void g(int i10);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(C0074b bVar) {
        this.f4520a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f4520a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f4521b.b(i11));
            if (b10 == 0) {
                while (this.f4521b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f4522c.add(view);
        this.f4520a.b(view);
    }

    private boolean t(View view) {
        if (!this.f4522c.remove(view)) {
            return false;
        }
        this.f4520a.h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = this.f4520a.c();
        } else {
            i11 = h(i10);
        }
        this.f4521b.e(i11, z10);
        if (z10) {
            l(view);
        }
        this.f4520a.addView(view, i11);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = this.f4520a.c();
        } else {
            i11 = h(i10);
        }
        this.f4521b.e(i11, z10);
        if (z10) {
            l(view);
        }
        this.f4520a.j(view, i11, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f4521b.f(h10);
        this.f4520a.g(h10);
    }

    /* access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f4522c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4522c.get(i11);
            RecyclerView.d0 f10 = this.f4520a.f(view);
            if (f10.getLayoutPosition() == i10 && !f10.isInvalid() && !f10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f4520a.a(h(i10));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f4520a.c() - this.f4522c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f4520a.a(i10);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f4520a.c();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int e10 = this.f4520a.e(view);
        if (e10 >= 0) {
            this.f4521b.h(e10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int e10 = this.f4520a.e(view);
        if (e10 != -1 && !this.f4521b.d(e10)) {
            return e10 - this.f4521b.b(e10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f4522c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f4521b.g();
        for (int size = this.f4522c.size() - 1; size >= 0; size--) {
            this.f4520a.h(this.f4522c.get(size));
            this.f4522c.remove(size);
        }
        this.f4520a.d();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int e10 = this.f4520a.e(view);
        if (e10 >= 0) {
            if (this.f4521b.f(e10)) {
                t(view);
            }
            this.f4520a.i(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f4520a.a(h10);
        if (a10 != null) {
            if (this.f4521b.f(h10)) {
                t(a10);
            }
            this.f4520a.i(h10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int e10 = this.f4520a.e(view);
        if (e10 == -1) {
            t(view);
            return true;
        } else if (!this.f4521b.d(e10)) {
            return false;
        } else {
            this.f4521b.f(e10);
            t(view);
            this.f4520a.i(e10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int e10 = this.f4520a.e(view);
        if (e10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4521b.d(e10)) {
            this.f4521b.a(e10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4521b.toString() + ", hidden list:" + this.f4522c.size();
    }
}
