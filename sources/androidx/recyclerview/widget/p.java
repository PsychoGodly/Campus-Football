package androidx.recyclerview.widget;

import androidx.collection.d;
import androidx.collection.g;
import androidx.core.util.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore */
class p {

    /* renamed from: a  reason: collision with root package name */
    final g<RecyclerView.d0, a> f4663a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final d<RecyclerView.d0> f4664b = new d<>();

    /* compiled from: ViewInfoStore */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        static e<a> f4665d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        int f4666a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f4667b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f4668c;

        private a() {
        }

        static void a() {
            do {
            } while (f4665d.b() != null);
        }

        static a b() {
            a b10 = f4665d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f4666a = 0;
            aVar.f4667b = null;
            aVar.f4668c = null;
            f4665d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    p() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i10) {
        a n10;
        RecyclerView.l.c cVar;
        int g10 = this.f4663a.g(d0Var);
        if (g10 >= 0 && (n10 = this.f4663a.n(g10)) != null) {
            int i11 = n10.f4666a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                n10.f4666a = i12;
                if (i10 == 4) {
                    cVar = n10.f4667b;
                } else if (i10 == 8) {
                    cVar = n10.f4668c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f4663a.l(g10);
                    a.c(n10);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4663a.put(d0Var, aVar);
        }
        aVar.f4666a |= 2;
        aVar.f4667b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4663a.put(d0Var, aVar);
        }
        aVar.f4666a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.d0 d0Var) {
        this.f4664b.j(j10, d0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4663a.put(d0Var, aVar);
        }
        aVar.f4668c = cVar;
        aVar.f4666a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4663a.put(d0Var, aVar);
        }
        aVar.f4667b = cVar;
        aVar.f4666a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f4663a.clear();
        this.f4664b.b();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j10) {
        return this.f4664b.e(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar == null || (aVar.f4666a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f4663a.get(d0Var);
        return (aVar == null || (aVar.f4666a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f4663a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 j10 = this.f4663a.j(size);
            a l10 = this.f4663a.l(size);
            int i10 = l10.f4666a;
            if ((i10 & 3) == 3) {
                bVar.a(j10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.l.c cVar = l10.f4667b;
                if (cVar == null) {
                    bVar.a(j10);
                } else {
                    bVar.c(j10, cVar, l10.f4668c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(j10, l10.f4667b, l10.f4668c);
            } else if ((i10 & 12) == 12) {
                bVar.d(j10, l10.f4667b, l10.f4668c);
            } else if ((i10 & 4) != 0) {
                bVar.c(j10, l10.f4667b, (RecyclerView.l.c) null);
            } else if ((i10 & 8) != 0) {
                bVar.b(j10, l10.f4667b, l10.f4668c);
            }
            a.c(l10);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f4663a.get(d0Var);
        if (aVar != null) {
            aVar.f4666a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int m10 = this.f4664b.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (d0Var == this.f4664b.o(m10)) {
                this.f4664b.l(m10);
                break;
            } else {
                m10--;
            }
        }
        a remove = this.f4663a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
