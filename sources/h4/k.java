package h4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.a;
import k4.n0;
import y3.b;
import y3.h;

/* compiled from: WebvttSubtitle */
final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f18797a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f18798b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f18799c;

    public k(List<e> list) {
        this.f18797a = Collections.unmodifiableList(new ArrayList(list));
        this.f18798b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f18798b;
            jArr[i11] = eVar.f18768b;
            jArr[i11 + 1] = eVar.f18769c;
        }
        long[] jArr2 = this.f18798b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f18799c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int e10 = n0.e(this.f18799c, j10, false, false);
        if (e10 < this.f18799c.length) {
            return e10;
        }
        return -1;
    }

    public long c(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f18799c.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f18799c[i10];
    }

    public List<b> d(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f18797a.size(); i10++) {
            long[] jArr = this.f18798b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f18797a.get(i10);
                b bVar = eVar.f18767a;
                if (bVar.f23832f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, j.f32972a);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f18767a.b().h((float) (-1 - i12), 1).a());
        }
        return arrayList;
    }

    public int e() {
        return this.f18799c.length;
    }
}
