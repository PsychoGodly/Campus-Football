package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper */
class r0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1775a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1776b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1777c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f1778d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f1779e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1780f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1781g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1782h = false;

    r0() {
    }

    public int a() {
        return this.f1781g ? this.f1775a : this.f1776b;
    }

    public int b() {
        return this.f1775a;
    }

    public int c() {
        return this.f1776b;
    }

    public int d() {
        return this.f1781g ? this.f1776b : this.f1775a;
    }

    public void e(int i10, int i11) {
        this.f1782h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1779e = i10;
            this.f1775a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1780f = i11;
            this.f1776b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 != this.f1781g) {
            this.f1781g = z10;
            if (!this.f1782h) {
                this.f1775a = this.f1779e;
                this.f1776b = this.f1780f;
            } else if (z10) {
                int i10 = this.f1778d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f1779e;
                }
                this.f1775a = i10;
                int i11 = this.f1777c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1780f;
                }
                this.f1776b = i11;
            } else {
                int i12 = this.f1777c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f1779e;
                }
                this.f1775a = i12;
                int i13 = this.f1778d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = this.f1780f;
                }
                this.f1776b = i13;
            }
        }
    }

    public void g(int i10, int i11) {
        this.f1777c = i10;
        this.f1778d = i11;
        this.f1782h = true;
        if (this.f1781g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1775a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1776b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1775a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1776b = i11;
        }
    }
}
