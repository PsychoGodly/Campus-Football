package s;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* compiled from: PriorityGoalRow */
public class h extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f22236g = 128;

    /* renamed from: h  reason: collision with root package name */
    private i[] f22237h = new i[128];

    /* renamed from: i  reason: collision with root package name */
    private i[] f22238i = new i[128];

    /* renamed from: j  reason: collision with root package name */
    private int f22239j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f22240k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    c f22241l;

    /* compiled from: PriorityGoalRow */
    class a implements Comparator<i> {
        a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f22249c - iVar2.f22249c;
        }
    }

    /* compiled from: PriorityGoalRow */
    class b {

        /* renamed from: a  reason: collision with root package name */
        i f22243a;

        /* renamed from: b  reason: collision with root package name */
        h f22244b;

        public b(h hVar) {
            this.f22244b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (this.f22243a.f22247a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.f22243a.f22255j;
                    fArr[i10] = fArr[i10] + (iVar.f22255j[i10] * f10);
                    if (Math.abs(fArr[i10]) < 1.0E-4f) {
                        this.f22243a.f22255j[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    h.this.G(this.f22243a);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f11 = iVar.f22255j[i11];
                if (f11 != 0.0f) {
                    float f12 = f11 * f10;
                    if (Math.abs(f12) < 1.0E-4f) {
                        f12 = 0.0f;
                    }
                    this.f22243a.f22255j[i11] = f12;
                } else {
                    this.f22243a.f22255j[i11] = 0.0f;
                }
            }
            return true;
        }

        public void b(i iVar) {
            this.f22243a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f22243a.f22255j[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f22255j[i10];
                float f11 = this.f22243a.f22255j[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f22243a.f22255j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f22243a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f22243a.f22255j[i10] + " ";
                }
            }
            return str + "] " + this.f22243a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f22241l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f22239j + 1;
        i[] iVarArr = this.f22237h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f22237h = iVarArr2;
            this.f22238i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f22237h;
        int i12 = this.f22239j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f22239j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f22249c > iVar.f22249c) {
            int i14 = 0;
            while (true) {
                i10 = this.f22239j;
                if (i14 >= i10) {
                    break;
                }
                this.f22238i[i14] = this.f22237h[i14];
                i14++;
            }
            Arrays.sort(this.f22238i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f22239j; i15++) {
                this.f22237h[i15] = this.f22238i[i15];
            }
        }
        iVar.f22247a = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f22239j) {
            if (this.f22237h[i10] == iVar) {
                while (true) {
                    int i11 = this.f22239j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f22237h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f22239j = i11 - 1;
                        iVar.f22247a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        i iVar = bVar.f22197a;
        if (iVar != null) {
            b.a aVar = bVar.f22201e;
            int b10 = aVar.b();
            for (int i10 = 0; i10 < b10; i10++) {
                i e10 = aVar.e(i10);
                float h10 = aVar.h(i10);
                this.f22240k.b(e10);
                if (this.f22240k.a(iVar, h10)) {
                    F(e10);
                }
                this.f22198b += bVar.f22198b * h10;
            }
            G(iVar);
        }
    }

    public void a(i iVar) {
        this.f22240k.b(iVar);
        this.f22240k.e();
        iVar.f22255j[iVar.f22251f] = 1.0f;
        F(iVar);
    }

    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f22239j; i11++) {
            i iVar = this.f22237h[i11];
            if (!zArr[iVar.f22249c]) {
                this.f22240k.b(iVar);
                if (i10 == -1) {
                    if (!this.f22240k.c()) {
                    }
                } else if (!this.f22240k.d(this.f22237h[i10])) {
                }
                i10 = i11;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f22237h[i10];
    }

    public void clear() {
        this.f22239j = 0;
        this.f22198b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f22239j == 0;
    }

    public String toString() {
        String str = MaxReward.DEFAULT_LABEL + " goal -> (" + this.f22198b + ") : ";
        for (int i10 = 0; i10 < this.f22239j; i10++) {
            this.f22240k.b(this.f22237h[i10]);
            str = str + this.f22240k + " ";
        }
        return str;
    }
}
