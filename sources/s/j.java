package s;

import java.util.Arrays;
import s.b;

/* compiled from: SolverVariableValues */
public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f22270n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f22271a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f22272b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f22273c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f22274d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f22275e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f22276f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f22277g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f22278h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f22279i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f22280j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f22281k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f22282l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f22283m;

    j(b bVar, c cVar) {
        this.f22282l = bVar;
        this.f22283m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f22249c % this.f22273c;
        int[] iArr2 = this.f22274d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f22275e;
                if (iArr[i12] == -1) {
                    break;
                }
                i12 = iArr[i12];
            }
            iArr[i12] = i10;
        }
        this.f22275e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f22276f[i10] = iVar.f22249c;
        this.f22277g[i10] = f10;
        this.f22278h[i10] = -1;
        this.f22279i[i10] = -1;
        iVar.a(this.f22282l);
        iVar.f22259n++;
        this.f22280j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f22272b; i10++) {
            if (this.f22276f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f22272b * 2;
        this.f22276f = Arrays.copyOf(this.f22276f, i10);
        this.f22277g = Arrays.copyOf(this.f22277g, i10);
        this.f22278h = Arrays.copyOf(this.f22278h, i10);
        this.f22279i = Arrays.copyOf(this.f22279i, i10);
        this.f22275e = Arrays.copyOf(this.f22275e, i10);
        for (int i11 = this.f22272b; i11 < i10; i11++) {
            this.f22276f[i11] = -1;
            this.f22275e[i11] = -1;
        }
        this.f22272b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f22278h[n10] = i10;
            int[] iArr = this.f22279i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f22278h[n10] = -1;
            if (this.f22280j > 0) {
                this.f22279i[n10] = this.f22281k;
                this.f22281k = n10;
            } else {
                this.f22279i[n10] = -1;
            }
        }
        int[] iArr2 = this.f22279i;
        if (iArr2[n10] != -1) {
            this.f22278h[iArr2[n10]] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f22249c;
        int i11 = i10 % this.f22273c;
        int[] iArr2 = this.f22274d;
        int i12 = iArr2[i11];
        if (i12 != -1) {
            if (this.f22276f[i12] == i10) {
                int[] iArr3 = this.f22275e;
                iArr2[i11] = iArr3[i12];
                iArr3[i12] = -1;
                return;
            }
            while (true) {
                iArr = this.f22275e;
                if (iArr[i12] == -1 || this.f22276f[iArr[i12]] == i10) {
                    int i13 = iArr[i12];
                } else {
                    i12 = iArr[i12];
                }
            }
            int i132 = iArr[i12];
            if (i132 != -1 && this.f22276f[i132] == i10) {
                iArr[i12] = iArr[i132];
                iArr[i132] = -1;
            }
        }
    }

    public void a(i iVar, float f10) {
        float f11 = f22270n;
        if (f10 <= (-f11) || f10 >= f11) {
            if (this.f22280j == 0) {
                m(0, iVar, f10);
                l(iVar, 0);
                this.f22281k = 0;
                return;
            }
            int p10 = p(iVar);
            if (p10 != -1) {
                this.f22277g[p10] = f10;
                return;
            }
            if (this.f22280j + 1 >= this.f22272b) {
                o();
            }
            int i10 = this.f22280j;
            int i11 = this.f22281k;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int[] iArr = this.f22276f;
                int i14 = iArr[i11];
                int i15 = iVar.f22249c;
                if (i14 == i15) {
                    this.f22277g[i11] = f10;
                    return;
                }
                if (iArr[i11] < i15) {
                    i12 = i11;
                }
                i11 = this.f22279i[i11];
                if (i11 == -1) {
                    break;
                }
            }
            q(i12, iVar, f10);
            return;
        }
        d(iVar, true);
    }

    public int b() {
        return this.f22280j;
    }

    public float c(b bVar, boolean z10) {
        float f10 = f(bVar.f22197a);
        d(bVar.f22197a, z10);
        j jVar = (j) bVar.f22201e;
        int b10 = jVar.b();
        int i10 = 0;
        int i11 = 0;
        while (i10 < b10) {
            int[] iArr = jVar.f22276f;
            if (iArr[i11] != -1) {
                k(this.f22283m.f22206d[iArr[i11]], jVar.f22277g[i11] * f10, z10);
                i10++;
            }
            i11++;
        }
        return f10;
    }

    public void clear() {
        int i10 = this.f22280j;
        for (int i11 = 0; i11 < i10; i11++) {
            i e10 = e(i11);
            if (e10 != null) {
                e10.e(this.f22282l);
            }
        }
        for (int i12 = 0; i12 < this.f22272b; i12++) {
            this.f22276f[i12] = -1;
            this.f22275e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f22273c; i13++) {
            this.f22274d[i13] = -1;
        }
        this.f22280j = 0;
        this.f22281k = -1;
    }

    public float d(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f22277g[p10];
        if (this.f22281k == p10) {
            this.f22281k = this.f22279i[p10];
        }
        this.f22276f[p10] = -1;
        int[] iArr = this.f22278h;
        if (iArr[p10] != -1) {
            int[] iArr2 = this.f22279i;
            iArr2[iArr[p10]] = iArr2[p10];
        }
        int[] iArr3 = this.f22279i;
        if (iArr3[p10] != -1) {
            iArr[iArr3[p10]] = iArr[p10];
        }
        this.f22280j--;
        iVar.f22259n--;
        if (z10) {
            iVar.e(this.f22282l);
        }
        return f10;
    }

    public i e(int i10) {
        int i11 = this.f22280j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f22281k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f22283m.f22206d[this.f22276f[i12]];
            }
            i12 = this.f22279i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    public float f(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f22277g[p10];
        }
        return 0.0f;
    }

    public void g() {
        int i10 = this.f22280j;
        int i11 = this.f22281k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f22277g;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f22279i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public float h(int i10) {
        int i11 = this.f22280j;
        int i12 = this.f22281k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f22277g[i12];
            }
            i12 = this.f22279i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    public void j(float f10) {
        int i10 = this.f22280j;
        int i11 = this.f22281k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f22277g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f22279i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public void k(i iVar, float f10, boolean z10) {
        float f11 = f22270n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                a(iVar, f10);
                return;
            }
            float[] fArr = this.f22277g;
            fArr[p10] = fArr[p10] + f10;
            float f12 = fArr[p10];
            float f13 = f22270n;
            if (f12 > (-f13) && fArr[p10] < f13) {
                fArr[p10] = 0.0f;
                d(iVar, z10);
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (!(this.f22280j == 0 || iVar == null)) {
            int i10 = iVar.f22249c;
            int i11 = this.f22274d[i10 % this.f22273c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f22276f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f22275e;
                if (iArr[i11] != -1 && this.f22276f[iArr[i11]] != i10) {
                    i11 = iArr[i11];
                }
            }
            if (iArr[i11] != -1 && this.f22276f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i10 = this.f22280j;
        for (int i11 = 0; i11 < i10; i11++) {
            i e10 = e(i11);
            if (e10 != null) {
                String str4 = str3 + e10 + " = " + h(i11) + " ";
                int p10 = p(e10);
                String str5 = str4 + "[p: ";
                if (this.f22278h[p10] != -1) {
                    str = str5 + this.f22283m.f22206d[this.f22276f[this.f22278h[p10]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f22279i[p10] != -1) {
                    str2 = str6 + this.f22283m.f22206d[this.f22276f[this.f22279i[p10]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
