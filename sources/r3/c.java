package r3;

import k4.r;
import p3.p0;
import r3.g;
import s2.e0;
import s2.k;

/* compiled from: BaseMediaChunkOutput */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f22107a;

    /* renamed from: b  reason: collision with root package name */
    private final p0[] f22108b;

    public c(int[] iArr, p0[] p0VarArr) {
        this.f22107a = iArr;
        this.f22108b = p0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f22108b.length];
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f22108b;
            if (i10 >= p0VarArr.length) {
                return iArr;
            }
            iArr[i10] = p0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (p0 a02 : this.f22108b) {
            a02.a0(j10);
        }
    }

    public e0 e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f22107a;
            if (i12 >= iArr.length) {
                r.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new k();
            } else if (i11 == iArr[i12]) {
                return this.f22108b[i12];
            } else {
                i12++;
            }
        }
    }
}
