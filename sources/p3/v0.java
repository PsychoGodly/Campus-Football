package p3;

import android.util.SparseArray;
import k4.a;
import k4.h;

/* compiled from: SpannedData */
final class v0<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f21682a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f21683b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final h<V> f21684c;

    public v0(h<V> hVar) {
        this.f21684c = hVar;
        this.f21682a = -1;
    }

    public void a(int i10, V v10) {
        boolean z10 = false;
        if (this.f21682a == -1) {
            a.f(this.f21683b.size() == 0);
            this.f21682a = 0;
        }
        if (this.f21683b.size() > 0) {
            SparseArray<V> sparseArray = this.f21683b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            a.a(z10);
            if (keyAt == i10) {
                h<V> hVar = this.f21684c;
                SparseArray<V> sparseArray2 = this.f21683b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f21683b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f21683b.size(); i10++) {
            this.f21684c.accept(this.f21683b.valueAt(i10));
        }
        this.f21682a = -1;
        this.f21683b.clear();
    }

    public void c(int i10) {
        int size = this.f21683b.size() - 1;
        while (size >= 0 && i10 < this.f21683b.keyAt(size)) {
            this.f21684c.accept(this.f21683b.valueAt(size));
            this.f21683b.removeAt(size);
            size--;
        }
        this.f21682a = this.f21683b.size() > 0 ? Math.min(this.f21682a, this.f21683b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f21683b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f21683b.keyAt(i12)) {
                this.f21684c.accept(this.f21683b.valueAt(i11));
                this.f21683b.removeAt(i11);
                int i13 = this.f21682a;
                if (i13 > 0) {
                    this.f21682a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public V e(int i10) {
        if (this.f21682a == -1) {
            this.f21682a = 0;
        }
        while (true) {
            int i11 = this.f21682a;
            if (i11 > 0 && i10 < this.f21683b.keyAt(i11)) {
                this.f21682a--;
            }
        }
        while (this.f21682a < this.f21683b.size() - 1 && i10 >= this.f21683b.keyAt(this.f21682a + 1)) {
            this.f21682a++;
        }
        return this.f21683b.valueAt(this.f21682a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f21683b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f21683b.size() == 0;
    }
}
