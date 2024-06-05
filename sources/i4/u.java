package i4;

import android.util.Pair;
import java.util.Arrays;
import k4.n0;
import n2.c4;
import n2.q;
import n2.q3;
import n2.r3;
import n2.s3;
import p3.x;
import p3.x0;
import p3.z0;

/* compiled from: MappingTrackSelector */
public abstract class u extends b0 {

    /* renamed from: c  reason: collision with root package name */
    private a f19064c;

    /* compiled from: MappingTrackSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f19065a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f19066b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f19067c;

        /* renamed from: d  reason: collision with root package name */
        private final z0[] f19068d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f19069e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f19070f;

        /* renamed from: g  reason: collision with root package name */
        private final z0 f19071g;

        a(String[] strArr, int[] iArr, z0[] z0VarArr, int[] iArr2, int[][][] iArr3, z0 z0Var) {
            this.f19066b = strArr;
            this.f19067c = iArr;
            this.f19068d = z0VarArr;
            this.f19070f = iArr3;
            this.f19069e = iArr2;
            this.f19071g = z0Var;
            this.f19065a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f19068d[i10].b(i11).f21688a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            int i14 = 16;
            while (i12 < iArr.length) {
                String str2 = this.f19068d[i10].b(i11).b(iArr[i12]).f20654m;
                int i15 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !n0.c(str, str2);
                }
                i14 = Math.min(i14, q3.d(this.f19070f[i10][i11][i12]));
                i12++;
                i13 = i15;
            }
            return z10 ? Math.min(i14, this.f19069e[i10]) : i14;
        }

        public int c(int i10, int i11, int i12) {
            return this.f19070f[i10][i11][i12];
        }

        public int d() {
            return this.f19065a;
        }

        public int e(int i10) {
            return this.f19067c[i10];
        }

        public z0 f(int i10) {
            return this.f19068d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return q3.f(c(i10, i11, i12));
        }

        public z0 h() {
            return this.f19071g;
        }
    }

    private static int i(r3[] r3VarArr, x0 x0Var, int[] iArr, boolean z10) throws q {
        int length = r3VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < r3VarArr.length; i11++) {
            r3 r3Var = r3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < x0Var.f21688a; i13++) {
                i12 = Math.max(i12, q3.f(r3Var.a(x0Var.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(r3 r3Var, x0 x0Var) throws q {
        int[] iArr = new int[x0Var.f21688a];
        for (int i10 = 0; i10 < x0Var.f21688a; i10++) {
            iArr[i10] = r3Var.a(x0Var.b(i10));
        }
        return iArr;
    }

    private static int[] k(r3[] r3VarArr) throws q {
        int length = r3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = r3VarArr[i10].n();
        }
        return iArr;
    }

    public final void e(Object obj) {
        this.f19064c = (a) obj;
    }

    public final c0 g(r3[] r3VarArr, z0 z0Var, x.b bVar, c4 c4Var) throws q {
        int[] iArr;
        r3[] r3VarArr2 = r3VarArr;
        z0 z0Var2 = z0Var;
        int[] iArr2 = new int[(r3VarArr2.length + 1)];
        int length = r3VarArr2.length + 1;
        x0[][] x0VarArr = new x0[length][];
        int[][][] iArr3 = new int[(r3VarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = z0Var2.f21696a;
            x0VarArr[i10] = new x0[i11];
            iArr3[i10] = new int[i11][];
        }
        int[] k10 = k(r3VarArr);
        for (int i12 = 0; i12 < z0Var2.f21696a; i12++) {
            x0 b10 = z0Var2.b(i12);
            int i13 = i(r3VarArr, b10, iArr2, b10.f21690c == 5);
            if (i13 == r3VarArr2.length) {
                iArr = new int[b10.f21688a];
            } else {
                iArr = j(r3VarArr2[i13], b10);
            }
            int i14 = iArr2[i13];
            x0VarArr[i13][i14] = b10;
            iArr3[i13][i14] = iArr;
            iArr2[i13] = iArr2[i13] + 1;
        }
        z0[] z0VarArr = new z0[r3VarArr2.length];
        String[] strArr = new String[r3VarArr2.length];
        int[] iArr4 = new int[r3VarArr2.length];
        for (int i15 = 0; i15 < r3VarArr2.length; i15++) {
            int i16 = iArr2[i15];
            z0VarArr[i15] = new z0((x0[]) n0.H0(x0VarArr[i15], i16));
            iArr3[i15] = (int[][]) n0.H0(iArr3[i15], i16);
            strArr[i15] = r3VarArr2[i15].getName();
            iArr4[i15] = r3VarArr2[i15].f();
        }
        a aVar = new a(strArr, iArr4, z0VarArr, k10, iArr3, new z0((x0[]) n0.H0(x0VarArr[r3VarArr2.length], iArr2[r3VarArr2.length])));
        Pair<s3[], s[]> l10 = l(aVar, iArr3, k10, bVar, c4Var);
        return new c0((s3[]) l10.first, (s[]) l10.second, a0.a(aVar, (v[]) l10.second), aVar);
    }

    /* access modifiers changed from: protected */
    public abstract Pair<s3[], s[]> l(a aVar, int[][][] iArr, int[] iArr2, x.b bVar, c4 c4Var) throws q;
}
