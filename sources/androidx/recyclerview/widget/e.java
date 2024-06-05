package androidx.recyclerview.widget;

import androidx.core.os.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    static final ThreadLocal<e> f4607f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    static Comparator<c> f4608g = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<RecyclerView> f4609a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    long f4610b;

    /* renamed from: c  reason: collision with root package name */
    long f4611c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f4612d = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4620d;
            if ((recyclerView == null) != (cVar2.f4620d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4617a;
            if (z10 == cVar2.f4617a) {
                int i10 = cVar2.f4618b - cVar.f4618b;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = cVar.f4619c - cVar2.f4619c;
                if (i11 != 0) {
                    return i11;
                }
                return 0;
            } else if (z10) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* compiled from: GapWorker */
    static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f4613a;

        /* renamed from: b  reason: collision with root package name */
        int f4614b;

        /* renamed from: c  reason: collision with root package name */
        int[] f4615c;

        /* renamed from: d  reason: collision with root package name */
        int f4616d;

        b() {
        }

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f4616d * 2;
                int[] iArr = this.f4615c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4615c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f4615c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4615c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f4616d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f4615c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4616d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z10) {
            this.f4616d = 0;
            int[] iArr = this.f4615c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.u0()) {
                if (z10) {
                    if (!recyclerView.mAdapterHelper.p()) {
                        oVar.p(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.o(this.f4613a, this.f4614b, recyclerView.mState, this);
                }
                int i10 = this.f4616d;
                if (i10 > oVar.f4421m) {
                    oVar.f4421m = i10;
                    oVar.f4422n = z10;
                    recyclerView.mRecycler.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f4615c != null) {
                int i11 = this.f4616d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4615c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11) {
            this.f4613a = i10;
            this.f4614b = i11;
        }
    }

    /* compiled from: GapWorker */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4617a;

        /* renamed from: b  reason: collision with root package name */
        public int f4618b;

        /* renamed from: c  reason: collision with root package name */
        public int f4619c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f4620d;

        /* renamed from: e  reason: collision with root package name */
        public int f4621e;

        c() {
        }

        public void a() {
            this.f4617a = false;
            this.f4618b = 0;
            this.f4619c = 0;
            this.f4620d = null;
            this.f4621e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f4609a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4609a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f4616d;
            }
        }
        this.f4612d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4609a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4613a) + Math.abs(bVar.f4614b);
                for (int i14 = 0; i14 < bVar.f4616d * 2; i14 += 2) {
                    if (i12 >= this.f4612d.size()) {
                        cVar = new c();
                        this.f4612d.add(cVar);
                    } else {
                        cVar = this.f4612d.get(i12);
                    }
                    int[] iArr = bVar.f4615c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4617a = i15 <= abs;
                    cVar.f4618b = abs;
                    cVar.f4619c = i15;
                    cVar.f4620d = recyclerView2;
                    cVar.f4621e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4612d, f4608g);
    }

    private void c(c cVar, long j10) {
        RecyclerView.d0 i10 = i(cVar.f4620d, cVar.f4621e, cVar.f4617a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.mNestedRecyclerView != null && i10.isBound() && !i10.isInvalid()) {
            h((RecyclerView) i10.mNestedRecyclerView.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f4612d.size()) {
            c cVar = this.f4612d.get(i10);
            if (cVar.f4620d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            b bVar = recyclerView.mPrefetchRegistry;
            bVar.c(recyclerView, true);
            if (bVar.f4616d != 0) {
                try {
                    o.a("RV Nested Prefetch");
                    recyclerView.mState.f(recyclerView.mAdapter);
                    for (int i10 = 0; i10 < bVar.f4616d * 2; i10 += 2) {
                        i(recyclerView, bVar.f4615c[i10], j10);
                    }
                } finally {
                    o.b();
                }
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 I = vVar.I(i10, false, j10);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f4609a.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4610b == 0) {
            this.f4610b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f4609a.remove(recyclerView);
    }

    public void run() {
        try {
            o.a("RV Prefetch");
            if (!this.f4609a.isEmpty()) {
                int size = this.f4609a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4609a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4611c);
                    this.f4610b = 0;
                    o.b();
                }
            }
        } finally {
            this.f4610b = 0;
            o.b();
        }
    }
}
