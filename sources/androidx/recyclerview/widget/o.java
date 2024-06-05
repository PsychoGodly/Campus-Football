package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class o {

    /* renamed from: a  reason: collision with root package name */
    final b f4656a;

    /* renamed from: b  reason: collision with root package name */
    a f4657b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4658a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f4659b;

        /* renamed from: c  reason: collision with root package name */
        int f4660c;

        /* renamed from: d  reason: collision with root package name */
        int f4661d;

        /* renamed from: e  reason: collision with root package name */
        int f4662e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f4658a = i10 | this.f4658a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f4658a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f4661d, this.f4659b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f4658a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f4661d, this.f4660c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4658a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f4662e, this.f4659b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4658a;
            if ((i13 & 28672) == 0 || (i13 & (c(this.f4662e, this.f4660c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f4658a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f4659b = i10;
            this.f4660c = i11;
            this.f4661d = i12;
            this.f4662e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    o(b bVar) {
        this.f4656a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f4656a.c();
        int d10 = this.f4656a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f4656a.a(i10);
            this.f4657b.e(c10, d10, this.f4656a.b(a10), this.f4656a.e(a10));
            if (i12 != 0) {
                this.f4657b.d();
                this.f4657b.a(i12);
                if (this.f4657b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f4657b.d();
                this.f4657b.a(i13);
                if (this.f4657b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f4657b.e(this.f4656a.c(), this.f4656a.d(), this.f4656a.b(view), this.f4656a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f4657b.d();
        this.f4657b.a(i10);
        return this.f4657b.b();
    }
}
