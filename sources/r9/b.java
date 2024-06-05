package r9;

import java.util.ArrayList;
import java.util.List;
import v8.j;
import v8.q;

/* compiled from: AlignmentPatternFinder */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final z8.b f30092a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f30093b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    private final int f30094c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30095d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30096e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30097f;

    /* renamed from: g  reason: collision with root package name */
    private final float f30098g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f30099h;

    /* renamed from: i  reason: collision with root package name */
    private final q f30100i;

    b(z8.b bVar, int i10, int i11, int i12, int i13, float f10, q qVar) {
        this.f30092a = bVar;
        this.f30094c = i10;
        this.f30095d = i11;
        this.f30096e = i12;
        this.f30097f = i13;
        this.f30098g = f10;
        this.f30099h = new int[3];
        this.f30100i = qVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((float) (i10 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    private float b(int i10, int i11, int i12, int i13) {
        z8.b bVar = this.f30092a;
        int g10 = bVar.g();
        int[] iArr = this.f30099h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.d(i11, i14) && iArr[1] <= i12) {
            iArr[1] = iArr[1] + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i12) {
            while (i14 >= 0 && !bVar.d(i11, i14) && iArr[0] <= i12) {
                iArr[0] = iArr[0] + 1;
                i14--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < g10 && bVar.d(i11, i15) && iArr[1] <= i12) {
                iArr[1] = iArr[1] + 1;
                i15++;
            }
            if (i15 != g10 && iArr[1] <= i12) {
                while (i15 < g10 && !bVar.d(i11, i15) && iArr[2] <= i12) {
                    iArr[2] = iArr[2] + 1;
                    i15++;
                }
                if (iArr[2] <= i12 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i15);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f10 = this.f30098g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - ((float) iArr[i10])) >= f11) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[1] * 2, i12);
        if (Float.isNaN(b10)) {
            return null;
        }
        float f10 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (a next : this.f30093b) {
            if (next.f(f10, b10, a10)) {
                return next.g(b10, a10, f10);
            }
        }
        a aVar = new a(a10, b10, f10);
        this.f30093b.add(aVar);
        q qVar = this.f30100i;
        if (qVar == null) {
            return null;
        }
        qVar.a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public a c() throws j {
        a e10;
        a e11;
        int i10 = this.f30094c;
        int i11 = this.f30097f;
        int i12 = this.f30096e + i10;
        int i13 = this.f30095d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f30092a.d(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f30092a.d(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else if (d(iArr) && (e11 = e(iArr, i15, i16)) != null) {
                    return e11;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (e10 = e(iArr, i15, i12)) != null) {
                return e10;
            }
        }
        if (!this.f30093b.isEmpty()) {
            return this.f30093b.get(0);
        }
        throw j.a();
    }
}
