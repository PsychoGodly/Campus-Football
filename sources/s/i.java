package s;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable */
public class i implements Comparable<i> {

    /* renamed from: s  reason: collision with root package name */
    private static int f22246s = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22247a;

    /* renamed from: b  reason: collision with root package name */
    private String f22248b;

    /* renamed from: c  reason: collision with root package name */
    public int f22249c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f22250d = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f22251f = 0;

    /* renamed from: g  reason: collision with root package name */
    public float f22252g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22253h = false;

    /* renamed from: i  reason: collision with root package name */
    float[] f22254i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    float[] f22255j = new float[9];

    /* renamed from: k  reason: collision with root package name */
    a f22256k;

    /* renamed from: l  reason: collision with root package name */
    b[] f22257l = new b[16];

    /* renamed from: m  reason: collision with root package name */
    int f22258m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f22259n = 0;

    /* renamed from: o  reason: collision with root package name */
    boolean f22260o = false;

    /* renamed from: p  reason: collision with root package name */
    int f22261p = -1;

    /* renamed from: q  reason: collision with root package name */
    float f22262q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    HashSet<b> f22263r = null;

    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f22256k = aVar;
    }

    static void d() {
        f22246s++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f22258m;
            if (i10 >= i11) {
                b[] bVarArr = this.f22257l;
                if (i11 >= bVarArr.length) {
                    this.f22257l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f22257l;
                int i12 = this.f22258m;
                bVarArr2[i12] = bVar;
                this.f22258m = i12 + 1;
                return;
            } else if (this.f22257l[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public int compareTo(i iVar) {
        return this.f22249c - iVar.f22249c;
    }

    public final void e(b bVar) {
        int i10 = this.f22258m;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f22257l[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f22257l;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f22258m--;
                return;
            }
            i11++;
        }
    }

    public void f() {
        this.f22248b = null;
        this.f22256k = a.UNKNOWN;
        this.f22251f = 0;
        this.f22249c = -1;
        this.f22250d = -1;
        this.f22252g = 0.0f;
        this.f22253h = false;
        this.f22260o = false;
        this.f22261p = -1;
        this.f22262q = 0.0f;
        int i10 = this.f22258m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22257l[i11] = null;
        }
        this.f22258m = 0;
        this.f22259n = 0;
        this.f22247a = false;
        Arrays.fill(this.f22255j, 0.0f);
    }

    public void g(d dVar, float f10) {
        this.f22252g = f10;
        this.f22253h = true;
        this.f22260o = false;
        this.f22261p = -1;
        this.f22262q = 0.0f;
        int i10 = this.f22258m;
        this.f22250d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22257l[i11].A(dVar, this, false);
        }
        this.f22258m = 0;
    }

    public void h(a aVar, String str) {
        this.f22256k = aVar;
    }

    public final void i(d dVar, b bVar) {
        int i10 = this.f22258m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22257l[i11].B(dVar, bVar, false);
        }
        this.f22258m = 0;
    }

    public String toString() {
        if (this.f22248b != null) {
            return MaxReward.DEFAULT_LABEL + this.f22248b;
        }
        return MaxReward.DEFAULT_LABEL + this.f22249c;
    }
}
