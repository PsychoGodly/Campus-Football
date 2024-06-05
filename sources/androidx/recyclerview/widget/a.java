package androidx.recyclerview.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
class a implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private e<b> f4508a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f4509b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f4510c;

    /* renamed from: d  reason: collision with root package name */
    final C0073a f4511d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f4512e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4513f;

    /* renamed from: g  reason: collision with root package name */
    final i f4514g;

    /* renamed from: h  reason: collision with root package name */
    private int f4515h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0073a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.d0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* compiled from: AdapterHelper */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f4516a;

        /* renamed from: b  reason: collision with root package name */
        int f4517b;

        /* renamed from: c  reason: collision with root package name */
        Object f4518c;

        /* renamed from: d  reason: collision with root package name */
        int f4519d;

        b(int i10, int i11, int i12, Object obj) {
            this.f4516a = i10;
            this.f4517b = i11;
            this.f4519d = i12;
            this.f4518c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f4516a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4516a;
            if (i10 != bVar.f4516a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4519d - this.f4517b) == 1 && this.f4519d == bVar.f4517b && this.f4517b == bVar.f4519d) {
                return true;
            }
            if (this.f4519d != bVar.f4519d || this.f4517b != bVar.f4517b) {
                return false;
            }
            Object obj2 = this.f4518c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4518c)) {
                    return false;
                }
            } else if (bVar.f4518c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4516a * 31) + this.f4517b) * 31) + this.f4519d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f4517b + "c:" + this.f4519d + ",p:" + this.f4518c + "]";
        }
    }

    a(C0073a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f4517b;
        int i11 = bVar.f4519d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4511d.e(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(b(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f4519d) {
            a(bVar);
            bVar = b(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f4517b;
        int i11 = bVar.f4519d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f4511d.e(i10) != null || h(i10)) {
                if (c10 == 0) {
                    k(b(4, i12, i13, bVar.f4518c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    v(b(4, i12, i13, bVar.f4518c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f4519d) {
            Object obj = bVar.f4518c;
            a(bVar);
            bVar = b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f4510c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4510c.get(i11);
            int i12 = bVar.f4516a;
            if (i12 == 8) {
                if (n(bVar.f4519d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4517b;
                int i14 = bVar.f4519d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f4516a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z10 = z(bVar.f4517b, i11);
        int i12 = bVar.f4517b;
        int i13 = bVar.f4516a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4519d; i15++) {
            int z11 = z(bVar.f4517b + (i10 * i15), bVar.f4516a);
            int i16 = bVar.f4516a;
            if (i16 == 2 ? z11 == z10 : i16 == 4 && z11 == z10 + 1) {
                i14++;
            } else {
                b b10 = b(i16, z10, i14, bVar.f4518c);
                l(b10, i12);
                a(b10);
                if (bVar.f4516a == 4) {
                    i12 += i14;
                }
                z10 = z11;
                i14 = 1;
            }
        }
        Object obj = bVar.f4518c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f4516a, z10, i14, obj);
            l(b11, i12);
            a(b11);
        }
    }

    private void v(b bVar) {
        this.f4510c.add(bVar);
        int i10 = bVar.f4516a;
        if (i10 == 1) {
            this.f4511d.g(bVar.f4517b, bVar.f4519d);
        } else if (i10 == 2) {
            this.f4511d.f(bVar.f4517b, bVar.f4519d);
        } else if (i10 == 4) {
            this.f4511d.c(bVar.f4517b, bVar.f4519d, bVar.f4518c);
        } else if (i10 == 8) {
            this.f4511d.a(bVar.f4517b, bVar.f4519d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f4510c.size() - 1; size >= 0; size--) {
            b bVar = this.f4510c.get(size);
            int i14 = bVar.f4516a;
            if (i14 == 8) {
                int i15 = bVar.f4517b;
                int i16 = bVar.f4519d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f4517b = i15 + 1;
                            bVar.f4519d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f4517b = i15 - 1;
                            bVar.f4519d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f4519d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f4519d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f4517b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f4517b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f4517b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f4519d;
                    } else if (i14 == 2) {
                        i10 += bVar.f4519d;
                    }
                } else if (i11 == 1) {
                    bVar.f4517b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f4517b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f4510c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4510c.get(size2);
            if (bVar2.f4516a == 8) {
                int i18 = bVar2.f4519d;
                if (i18 == bVar2.f4517b || i18 < 0) {
                    this.f4510c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f4519d <= 0) {
                this.f4510c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    public void a(b bVar) {
        if (!this.f4513f) {
            bVar.f4518c = null;
            this.f4508a.a(bVar);
        }
    }

    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f4508a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f4516a = i10;
        b10.f4517b = i11;
        b10.f4519d = i12;
        b10.f4518c = obj;
        return b10;
    }

    public int e(int i10) {
        int size = this.f4509b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4509b.get(i11);
            int i12 = bVar.f4516a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4517b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4519d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4517b;
                    if (i15 == i10) {
                        i10 = bVar.f4519d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4519d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4517b <= i10) {
                i10 += bVar.f4519d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f4510c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4511d.d(this.f4510c.get(i10));
        }
        x(this.f4510c);
        this.f4515h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f4509b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4509b.get(i10);
            int i11 = bVar.f4516a;
            if (i11 == 1) {
                this.f4511d.d(bVar);
                this.f4511d.g(bVar.f4517b, bVar.f4519d);
            } else if (i11 == 2) {
                this.f4511d.d(bVar);
                this.f4511d.h(bVar.f4517b, bVar.f4519d);
            } else if (i11 == 4) {
                this.f4511d.d(bVar);
                this.f4511d.c(bVar.f4517b, bVar.f4519d, bVar.f4518c);
            } else if (i11 == 8) {
                this.f4511d.d(bVar);
                this.f4511d.a(bVar.f4517b, bVar.f4519d);
            }
            Runnable runnable = this.f4512e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f4509b);
        this.f4515h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f4511d.b(bVar);
        int i11 = bVar.f4516a;
        if (i11 == 2) {
            this.f4511d.h(i10, bVar.f4519d);
        } else if (i11 == 4) {
            this.f4511d.c(i10, bVar.f4519d, bVar.f4518c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f4510c.size();
        while (i11 < size) {
            b bVar = this.f4510c.get(i11);
            int i12 = bVar.f4516a;
            if (i12 == 8) {
                int i13 = bVar.f4517b;
                if (i13 == i10) {
                    i10 = bVar.f4519d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4519d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4517b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4519d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4519d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f4515h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f4509b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f4510c.isEmpty() && !this.f4509b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f4509b.add(b(4, i10, i11, obj));
        this.f4515h |= 4;
        if (this.f4509b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f4509b.add(b(1, i10, i11, (Object) null));
        this.f4515h |= 1;
        if (this.f4509b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f4509b.add(b(8, i10, i11, (Object) null));
            this.f4515h |= 8;
            if (this.f4509b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f4509b.add(b(2, i10, i11, (Object) null));
        this.f4515h |= 2;
        if (this.f4509b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f4514g.b(this.f4509b);
        int size = this.f4509b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4509b.get(i10);
            int i11 = bVar.f4516a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f4512e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4509b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.f4509b);
        x(this.f4510c);
        this.f4515h = 0;
    }

    a(C0073a aVar, boolean z10) {
        this.f4508a = new f(30);
        this.f4509b = new ArrayList<>();
        this.f4510c = new ArrayList<>();
        this.f4515h = 0;
        this.f4511d = aVar;
        this.f4513f = z10;
        this.f4514g = new i(this);
    }
}
