package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f4468s = -1;

    /* renamed from: t  reason: collision with root package name */
    f[] f4469t;

    /* renamed from: u  reason: collision with root package name */
    j f4470u;

    /* renamed from: v  reason: collision with root package name */
    j f4471v;

    /* renamed from: w  reason: collision with root package name */
    private int f4472w;

    /* renamed from: x  reason: collision with root package name */
    private int f4473x;

    /* renamed from: y  reason: collision with root package name */
    private final f f4474y;

    /* renamed from: z  reason: collision with root package name */
    boolean f4475z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f4477a;

        /* renamed from: b  reason: collision with root package name */
        int f4478b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4479c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4480d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4481e;

        /* renamed from: f  reason: collision with root package name */
        int[] f4482f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10;
            if (this.f4479c) {
                i10 = StaggeredGridLayoutManager.this.f4470u.i();
            } else {
                i10 = StaggeredGridLayoutManager.this.f4470u.m();
            }
            this.f4478b = i10;
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (this.f4479c) {
                this.f4478b = StaggeredGridLayoutManager.this.f4470u.i() - i10;
            } else {
                this.f4478b = StaggeredGridLayoutManager.this.f4470u.m() + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f4477a = -1;
            this.f4478b = RecyclerView.UNDEFINED_DURATION;
            this.f4479c = false;
            this.f4480d = false;
            this.f4481e = false;
            int[] iArr = this.f4482f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4482f;
            if (iArr == null || iArr.length < length) {
                this.f4482f = new int[StaggeredGridLayoutManager.this.f4469t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f4482f[i10] = fVarArr[i10].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        f f4484e;

        /* renamed from: f  reason: collision with root package name */
        boolean f4485f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f4484e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f4506e;
        }

        public boolean f() {
            return this.f4485f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f4492a;

        /* renamed from: b  reason: collision with root package name */
        int f4493b;

        /* renamed from: c  reason: collision with root package name */
        int f4494c;

        /* renamed from: d  reason: collision with root package name */
        int[] f4495d;

        /* renamed from: f  reason: collision with root package name */
        int f4496f;

        /* renamed from: g  reason: collision with root package name */
        int[] f4497g;

        /* renamed from: h  reason: collision with root package name */
        List<d.a> f4498h;

        /* renamed from: i  reason: collision with root package name */
        boolean f4499i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4500j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4501k;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f4495d = null;
            this.f4494c = 0;
            this.f4492a = -1;
            this.f4493b = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f4495d = null;
            this.f4494c = 0;
            this.f4496f = 0;
            this.f4497g = null;
            this.f4498h = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4492a);
            parcel.writeInt(this.f4493b);
            parcel.writeInt(this.f4494c);
            if (this.f4494c > 0) {
                parcel.writeIntArray(this.f4495d);
            }
            parcel.writeInt(this.f4496f);
            if (this.f4496f > 0) {
                parcel.writeIntArray(this.f4497g);
            }
            parcel.writeInt(this.f4499i ? 1 : 0);
            parcel.writeInt(this.f4500j ? 1 : 0);
            parcel.writeInt(this.f4501k ? 1 : 0);
            parcel.writeList(this.f4498h);
        }

        e(Parcel parcel) {
            this.f4492a = parcel.readInt();
            this.f4493b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4494c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4495d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4496f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4497g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f4499i = parcel.readInt() == 1;
            this.f4500j = parcel.readInt() == 1;
            this.f4501k = parcel.readInt() == 1 ? true : z10;
            this.f4498h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4494c = eVar.f4494c;
            this.f4492a = eVar.f4492a;
            this.f4493b = eVar.f4493b;
            this.f4495d = eVar.f4495d;
            this.f4496f = eVar.f4496f;
            this.f4497g = eVar.f4497g;
            this.f4499i = eVar.f4499i;
            this.f4500j = eVar.f4500j;
            this.f4501k = eVar.f4501k;
            this.f4498h = eVar.f4498h;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f4502a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f4503b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c  reason: collision with root package name */
        int f4504c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f4505d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f4506e;

        f(int i10) {
            this.f4506e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n10 = n(view);
            n10.f4484e = this;
            this.f4502a.add(view);
            this.f4504c = RecyclerView.UNDEFINED_DURATION;
            if (this.f4502a.size() == 1) {
                this.f4503b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f4505d += StaggeredGridLayoutManager.this.f4470u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10, int i10) {
            int i11;
            if (z10) {
                i11 = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                i11 = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (i11 != Integer.MIN_VALUE) {
                if (z10 && i11 < StaggeredGridLayoutManager.this.f4470u.i()) {
                    return;
                }
                if (z10 || i11 <= StaggeredGridLayoutManager.this.f4470u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        i11 += i10;
                    }
                    this.f4504c = i11;
                    this.f4503b = i11;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f10;
            ArrayList<View> arrayList = this.f4502a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f4504c = StaggeredGridLayoutManager.this.f4470u.d(view);
            if (n10.f4485f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f4489b == 1) {
                this.f4504c += f10.a(this.f4506e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f10;
            View view = this.f4502a.get(0);
            c n10 = n(view);
            this.f4503b = StaggeredGridLayoutManager.this.f4470u.g(view);
            if (n10.f4485f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f4489b == -1) {
                this.f4503b -= f10.a(this.f4506e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f4502a.clear();
            q();
            this.f4505d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f4475z) {
                return i(this.f4502a.size() - 1, -1, true);
            }
            return i(0, this.f4502a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f4475z) {
                return i(0, this.f4502a.size(), true);
            }
            return i(this.f4502a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f4470u.m();
            int i12 = StaggeredGridLayoutManager.this.f4470u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f4502a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f4470u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f4470u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 < i12 : g10 <= i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (g10 >= m10 && d10 <= i12) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f4505d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i10 = this.f4504c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f4504c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int i11 = this.f4504c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4502a.size() == 0) {
                return i10;
            }
            c();
            return this.f4504c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f4502a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4502a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4475z && staggeredGridLayoutManager.h0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4475z && staggeredGridLayoutManager2.h0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4502a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f4502a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4475z && staggeredGridLayoutManager3.h0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4475z && staggeredGridLayoutManager4.h0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i10 = this.f4503b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f4503b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i10) {
            int i11 = this.f4503b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4502a.size() == 0) {
                return i10;
            }
            d();
            return this.f4503b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f4503b = RecyclerView.UNDEFINED_DURATION;
            this.f4504c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            int i11 = this.f4503b;
            if (i11 != Integer.MIN_VALUE) {
                this.f4503b = i11 + i10;
            }
            int i12 = this.f4504c;
            if (i12 != Integer.MIN_VALUE) {
                this.f4504c = i12 + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f4502a.size();
            View remove = this.f4502a.remove(size - 1);
            c n10 = n(remove);
            n10.f4484e = null;
            if (n10.c() || n10.b()) {
                this.f4505d -= StaggeredGridLayoutManager.this.f4470u.e(remove);
            }
            if (size == 1) {
                this.f4503b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f4504c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.f4502a.remove(0);
            c n10 = n(remove);
            n10.f4484e = null;
            if (this.f4502a.size() == 0) {
                this.f4504c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f4505d -= StaggeredGridLayoutManager.this.f4470u.e(remove);
            }
            this.f4503b = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n10 = n(view);
            n10.f4484e = this;
            this.f4502a.add(0, view);
            this.f4503b = RecyclerView.UNDEFINED_DURATION;
            if (this.f4502a.size() == 1) {
                this.f4504c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f4505d += StaggeredGridLayoutManager.this.f4470u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
            this.f4503b = i10;
            this.f4504c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        I2(i02.f4429a);
        K2(i02.f4430b);
        J2(i02.f4431c);
        this.f4474y = new f();
        a2();
    }

    private void A2(View view) {
        for (int i10 = this.f4468s - 1; i10 >= 0; i10--) {
            this.f4469t[i10].u(view);
        }
    }

    private void B2(RecyclerView.v vVar, f fVar) {
        int i10;
        int i11;
        if (fVar.f4622a && !fVar.f4630i) {
            if (fVar.f4623b == 0) {
                if (fVar.f4626e == -1) {
                    C2(vVar, fVar.f4628g);
                } else {
                    D2(vVar, fVar.f4627f);
                }
            } else if (fVar.f4626e == -1) {
                int i12 = fVar.f4627f;
                int m22 = i12 - m2(i12);
                if (m22 < 0) {
                    i11 = fVar.f4628g;
                } else {
                    i11 = fVar.f4628g - Math.min(m22, fVar.f4623b);
                }
                C2(vVar, i11);
            } else {
                int n22 = n2(fVar.f4628g) - fVar.f4628g;
                if (n22 < 0) {
                    i10 = fVar.f4627f;
                } else {
                    i10 = Math.min(n22, fVar.f4623b) + fVar.f4627f;
                }
                D2(vVar, i10);
            }
        }
    }

    private void C2(RecyclerView.v vVar, int i10) {
        int J2 = J() - 1;
        while (J2 >= 0) {
            View I2 = I(J2);
            if (this.f4470u.g(I2) >= i10 && this.f4470u.q(I2) >= i10) {
                c cVar = (c) I2.getLayoutParams();
                if (cVar.f4485f) {
                    int i11 = 0;
                    while (i11 < this.f4468s) {
                        if (this.f4469t[i11].f4502a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f4468s; i12++) {
                        this.f4469t[i12].s();
                    }
                } else if (cVar.f4484e.f4502a.size() != 1) {
                    cVar.f4484e.s();
                } else {
                    return;
                }
                m1(I2, vVar);
                J2--;
            } else {
                return;
            }
        }
    }

    private void D2(RecyclerView.v vVar, int i10) {
        while (J() > 0) {
            View I2 = I(0);
            if (this.f4470u.d(I2) <= i10 && this.f4470u.p(I2) <= i10) {
                c cVar = (c) I2.getLayoutParams();
                if (cVar.f4485f) {
                    int i11 = 0;
                    while (i11 < this.f4468s) {
                        if (this.f4469t[i11].f4502a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f4468s; i12++) {
                        this.f4469t[i12].t();
                    }
                } else if (cVar.f4484e.f4502a.size() != 1) {
                    cVar.f4484e.t();
                } else {
                    return;
                }
                m1(I2, vVar);
            } else {
                return;
            }
        }
    }

    private void E2() {
        if (this.f4471v.k() != 1073741824) {
            float f10 = 0.0f;
            int J2 = J();
            for (int i10 = 0; i10 < J2; i10++) {
                View I2 = I(i10);
                float e10 = (float) this.f4471v.e(I2);
                if (e10 >= f10) {
                    if (((c) I2.getLayoutParams()).f()) {
                        e10 = (e10 * 1.0f) / ((float) this.f4468s);
                    }
                    f10 = Math.max(f10, e10);
                }
            }
            int i11 = this.f4473x;
            int round = Math.round(f10 * ((float) this.f4468s));
            if (this.f4471v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4471v.n());
            }
            Q2(round);
            if (this.f4473x != i11) {
                for (int i12 = 0; i12 < J2; i12++) {
                    View I3 = I(i12);
                    c cVar = (c) I3.getLayoutParams();
                    if (!cVar.f4485f) {
                        if (!u2() || this.f4472w != 1) {
                            int i13 = cVar.f4484e.f4506e;
                            int i14 = this.f4473x * i13;
                            int i15 = i13 * i11;
                            if (this.f4472w == 1) {
                                I3.offsetLeftAndRight(i14 - i15);
                            } else {
                                I3.offsetTopAndBottom(i14 - i15);
                            }
                        } else {
                            int i16 = this.f4468s;
                            int i17 = cVar.f4484e.f4506e;
                            I3.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f4473x) - ((-((i16 - 1) - i17)) * i11));
                        }
                    }
                }
            }
        }
    }

    private void F2() {
        if (this.f4472w == 1 || !u2()) {
            this.A = this.f4475z;
        } else {
            this.A = !this.f4475z;
        }
    }

    private void H2(int i10) {
        f fVar = this.f4474y;
        fVar.f4626e = i10;
        int i11 = 1;
        if (this.A != (i10 == -1)) {
            i11 = -1;
        }
        fVar.f4625d = i11;
    }

    private void L2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f4468s; i12++) {
            if (!this.f4469t[i12].f4502a.isEmpty()) {
                R2(this.f4469t[i12], i10, i11);
            }
        }
    }

    private void M1(View view) {
        for (int i10 = this.f4468s - 1; i10 >= 0; i10--) {
            this.f4469t[i10].a(view);
        }
    }

    private boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        if (this.G) {
            i10 = g2(a0Var.b());
        } else {
            i10 = c2(a0Var.b());
        }
        bVar.f4477a = i10;
        bVar.f4478b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void N1(b bVar) {
        int i10;
        e eVar = this.I;
        int i11 = eVar.f4494c;
        if (i11 > 0) {
            if (i11 == this.f4468s) {
                for (int i12 = 0; i12 < this.f4468s; i12++) {
                    this.f4469t[i12].e();
                    e eVar2 = this.I;
                    int i13 = eVar2.f4495d[i12];
                    if (i13 != Integer.MIN_VALUE) {
                        if (eVar2.f4500j) {
                            i10 = this.f4470u.i();
                        } else {
                            i10 = this.f4470u.m();
                        }
                        i13 += i10;
                    }
                    this.f4469t[i12].v(i13);
                }
            } else {
                eVar.d();
                e eVar3 = this.I;
                eVar3.f4492a = eVar3.f4493b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f4501k;
        J2(eVar4.f4499i);
        F2();
        e eVar5 = this.I;
        int i14 = eVar5.f4492a;
        if (i14 != -1) {
            this.C = i14;
            bVar.f4479c = eVar5.f4500j;
        } else {
            bVar.f4479c = this.A;
        }
        if (eVar5.f4496f > 1) {
            d dVar = this.E;
            dVar.f4486a = eVar5.f4497g;
            dVar.f4487b = eVar5.f4498h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f4474y
            r1 = 0
            r0.f4623b = r1
            r0.f4624c = r5
            boolean r0 = r4.x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.j r5 = r4.f4470u
            int r5 = r5.n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.j r5 = r4.f4470u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.f4474y
            androidx.recyclerview.widget.j r3 = r4.f4470u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f4627f = r3
            androidx.recyclerview.widget.f r6 = r4.f4474y
            androidx.recyclerview.widget.j r0 = r4.f4470u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f4628g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.f4474y
            androidx.recyclerview.widget.j r3 = r4.f4470u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f4628g = r3
            androidx.recyclerview.widget.f r5 = r4.f4474y
            int r6 = -r6
            r5.f4627f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.f4474y
            r5.f4629h = r1
            r5.f4622a = r2
            androidx.recyclerview.widget.j r6 = r4.f4470u
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.j r6 = r4.f4470u
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4630i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void Q1(View view, c cVar, f fVar) {
        if (fVar.f4626e == 1) {
            if (cVar.f4485f) {
                M1(view);
            } else {
                cVar.f4484e.a(view);
            }
        } else if (cVar.f4485f) {
            A2(view);
        } else {
            cVar.f4484e.u(view);
        }
    }

    private int R1(int i10) {
        if (J() != 0) {
            if ((i10 < j2()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    private void R2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 <= i11) {
                this.B.set(fVar.f4506e, false);
            }
        } else if (fVar.k() - j10 >= i11) {
            this.B.set(fVar.f4506e, false);
        }
    }

    private int S2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        return i10;
    }

    private boolean T1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f4470u.i()) {
                ArrayList<View> arrayList = fVar.f4502a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f4485f;
            }
        } else if (fVar.o() > this.f4470u.m()) {
            return !fVar.n(fVar.f4502a.get(0)).f4485f;
        }
        return false;
    }

    private int U1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.a(a0Var, this.f4470u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.b(a0Var, this.f4470u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.c(a0Var, this.f4470u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i10) {
        if (i10 == 1) {
            return (this.f4472w != 1 && u2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4472w != 1 && u2()) ? -1 : 1;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130 && this.f4472w == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f4472w == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f4472w == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f4472w == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f4490c = new int[this.f4468s];
        for (int i11 = 0; i11 < this.f4468s; i11++) {
            aVar.f4490c[i11] = i10 - this.f4469t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f4490c = new int[this.f4468s];
        for (int i11 = 0; i11 < this.f4468s; i11++) {
            aVar.f4490c[i11] = this.f4469t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void a2() {
        this.f4470u = j.b(this, this.f4472w);
        this.f4471v = j.b(this, 1 - this.f4472w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int b2(RecyclerView.v vVar, f fVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        f fVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        int i21;
        RecyclerView.v vVar2 = vVar;
        f fVar3 = fVar;
        ? r92 = 0;
        this.B.set(0, this.f4468s, true);
        if (this.f4474y.f4630i) {
            i10 = fVar3.f4626e == 1 ? a.e.API_PRIORITY_OTHER : RecyclerView.UNDEFINED_DURATION;
        } else {
            if (fVar3.f4626e == 1) {
                i21 = fVar3.f4628g + fVar3.f4623b;
            } else {
                i21 = fVar3.f4627f - fVar3.f4623b;
            }
            i10 = i21;
        }
        L2(fVar3.f4626e, i10);
        if (this.A) {
            i11 = this.f4470u.i();
        } else {
            i11 = this.f4470u.m();
        }
        int i22 = i11;
        boolean z11 = false;
        while (fVar.a(a0Var) && (this.f4474y.f4630i || !this.B.isEmpty())) {
            View b10 = fVar3.b(vVar2);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.E.g(a10);
            boolean z12 = g10 == -1;
            if (z12) {
                fVar2 = cVar.f4485f ? this.f4469t[r92] : p2(fVar3);
                this.E.n(a10, fVar2);
            } else {
                fVar2 = this.f4469t[g10];
            }
            f fVar4 = fVar2;
            cVar.f4484e = fVar4;
            if (fVar3.f4626e == 1) {
                d(b10);
            } else {
                e(b10, r92);
            }
            w2(b10, cVar, r92);
            if (fVar3.f4626e == 1) {
                if (cVar.f4485f) {
                    i20 = l2(i22);
                } else {
                    i20 = fVar4.l(i22);
                }
                int e10 = this.f4470u.e(b10) + i20;
                if (z12 && cVar.f4485f) {
                    d.a Y1 = Y1(i20);
                    Y1.f4489b = -1;
                    Y1.f4488a = a10;
                    this.E.a(Y1);
                }
                i13 = e10;
                i14 = i20;
            } else {
                if (cVar.f4485f) {
                    i19 = o2(i22);
                } else {
                    i19 = fVar4.p(i22);
                }
                i14 = i19 - this.f4470u.e(b10);
                if (z12 && cVar.f4485f) {
                    d.a Z1 = Z1(i19);
                    Z1.f4489b = 1;
                    Z1.f4488a = a10;
                    this.E.a(Z1);
                }
                i13 = i19;
            }
            if (cVar.f4485f && fVar3.f4625d == -1) {
                if (z12) {
                    this.M = true;
                } else {
                    if (fVar3.f4626e == 1) {
                        z10 = O1();
                    } else {
                        z10 = P1();
                    }
                    if (!z10) {
                        d.a f10 = this.E.f(a10);
                        if (f10 != null) {
                            f10.f4491d = true;
                        }
                        this.M = true;
                    }
                }
            }
            Q1(b10, cVar, fVar3);
            if (!u2() || this.f4472w != 1) {
                if (cVar.f4485f) {
                    i17 = this.f4471v.m();
                } else {
                    i17 = (fVar4.f4506e * this.f4473x) + this.f4471v.m();
                }
                i16 = i17;
                i15 = this.f4471v.e(b10) + i17;
            } else {
                if (cVar.f4485f) {
                    i18 = this.f4471v.i();
                } else {
                    i18 = this.f4471v.i() - (((this.f4468s - 1) - fVar4.f4506e) * this.f4473x);
                }
                i15 = i18;
                i16 = i18 - this.f4471v.e(b10);
            }
            if (this.f4472w == 1) {
                z0(b10, i16, i14, i15, i13);
            } else {
                z0(b10, i14, i16, i13, i15);
            }
            if (cVar.f4485f) {
                L2(this.f4474y.f4626e, i10);
            } else {
                R2(fVar4, this.f4474y.f4626e, i10);
            }
            B2(vVar2, this.f4474y);
            if (this.f4474y.f4629h && b10.hasFocusable()) {
                if (cVar.f4485f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar4.f4506e, false);
                    z11 = true;
                    r92 = 0;
                }
            }
            z11 = true;
            r92 = 0;
        }
        if (!z11) {
            B2(vVar2, this.f4474y);
        }
        if (this.f4474y.f4626e == -1) {
            i12 = this.f4470u.m() - o2(this.f4470u.m());
        } else {
            i12 = l2(this.f4470u.i()) - this.f4470u.i();
        }
        if (i12 > 0) {
            return Math.min(fVar3.f4623b, i12);
        }
        return 0;
    }

    private int c2(int i10) {
        int J2 = J();
        for (int i11 = 0; i11 < J2; i11++) {
            int h02 = h0(I(i11));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int J2 = J() - 1; J2 >= 0; J2--) {
            int h02 = h0(I(J2));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10;
        int l22 = l2(RecyclerView.UNDEFINED_DURATION);
        if (l22 != Integer.MIN_VALUE && (i10 = this.f4470u.i() - l22) > 0) {
            int i11 = i10 - (-G2(-i10, vVar, a0Var));
            if (z10 && i11 > 0) {
                this.f4470u.r(i11);
            }
        }
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int o22 = o2(a.e.API_PRIORITY_OTHER);
        if (o22 != Integer.MAX_VALUE && (m10 = o22 - this.f4470u.m()) > 0) {
            int G2 = m10 - G2(m10, vVar, a0Var);
            if (z10 && G2 > 0) {
                this.f4470u.r(-G2);
            }
        }
    }

    private int l2(int i10) {
        int l10 = this.f4469t[0].l(i10);
        for (int i11 = 1; i11 < this.f4468s; i11++) {
            int l11 = this.f4469t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int m2(int i10) {
        int p10 = this.f4469t[0].p(i10);
        for (int i11 = 1; i11 < this.f4468s; i11++) {
            int p11 = this.f4469t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int n2(int i10) {
        int l10 = this.f4469t[0].l(i10);
        for (int i11 = 1; i11 < this.f4468s; i11++) {
            int l11 = this.f4469t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int o2(int i10) {
        int p10 = this.f4469t[0].p(i10);
        for (int i11 = 1; i11 < this.f4468s; i11++) {
            int p11 = this.f4469t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f p2(f fVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (y2(fVar.f4626e)) {
            i11 = this.f4468s - 1;
            i10 = -1;
        } else {
            i11 = 0;
            i12 = this.f4468s;
            i10 = 1;
        }
        f fVar2 = null;
        if (fVar.f4626e == 1) {
            int i13 = a.e.API_PRIORITY_OTHER;
            int m10 = this.f4470u.m();
            while (i11 != i12) {
                f fVar3 = this.f4469t[i11];
                int l10 = fVar3.l(m10);
                if (l10 < i13) {
                    fVar2 = fVar3;
                    i13 = l10;
                }
                i11 += i10;
            }
            return fVar2;
        }
        int i14 = RecyclerView.UNDEFINED_DURATION;
        int i15 = this.f4470u.i();
        while (i11 != i12) {
            f fVar4 = this.f4469t[i11];
            int p10 = fVar4.p(i15);
            if (p10 > i14) {
                fVar2 = fVar4;
                i14 = p10;
            }
            i11 += i10;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.j2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.k2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    private void v2(View view, int i10, int i11, boolean z10) {
        boolean z11;
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.K;
        int S2 = S2(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.K;
        int S22 = S2(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10) {
            z11 = H1(view, S2, S22, cVar);
        } else {
            z11 = F1(view, S2, S22, cVar);
        }
        if (z11) {
            view.measure(S2, S22);
        }
    }

    private void w2(View view, c cVar, boolean z10) {
        if (cVar.f4485f) {
            if (this.f4472w == 1) {
                v2(view, this.J, RecyclerView.o.K(W(), X(), g0() + d0(), cVar.height, true), z10);
            } else {
                v2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), cVar.width, true), this.J, z10);
            }
        } else if (this.f4472w == 1) {
            v2(view, RecyclerView.o.K(this.f4473x, p0(), 0, cVar.width, false), RecyclerView.o.K(W(), X(), g0() + d0(), cVar.height, true), z10);
        } else {
            v2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), cVar.width, true), RecyclerView.o.K(this.f4473x, X(), 0, cVar.height, false), z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (S1() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.k1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f4481e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.F2()
            boolean r5 = r8.A
            r0.f4479c = r5
        L_0x003e:
            r8.O2(r10, r0)
            r0.f4481e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f4479c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.u2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.E
            r5.b()
            r0.f4480d = r4
        L_0x0060:
            int r5 = r8.J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f4494c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f4480d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f4468s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4469t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f4478b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f4469t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            int[] r1 = r1.f4482f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f4468s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4469t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.L
            int[] r6 = r6.f4482f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f4468s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4469t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f4478b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4469t
            r1.d(r5)
        L_0x00c9:
            r8.w(r9)
            androidx.recyclerview.widget.f r1 = r8.f4474y
            r1.f4622a = r3
            r8.M = r3
            androidx.recyclerview.widget.j r1 = r8.f4471v
            int r1 = r1.n()
            r8.Q2(r1)
            int r1 = r0.f4477a
            r8.P2(r1, r10)
            boolean r1 = r0.f4479c
            if (r1 == 0) goto L_0x00fc
            r8.H2(r2)
            androidx.recyclerview.widget.f r1 = r8.f4474y
            r8.b2(r9, r1, r10)
            r8.H2(r4)
            androidx.recyclerview.widget.f r1 = r8.f4474y
            int r2 = r0.f4477a
            int r5 = r1.f4625d
            int r2 = r2 + r5
            r1.f4624c = r2
            r8.b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.H2(r4)
            androidx.recyclerview.widget.f r1 = r8.f4474y
            r8.b2(r9, r1, r10)
            r8.H2(r2)
            androidx.recyclerview.widget.f r1 = r8.f4474y
            int r2 = r0.f4477a
            int r5 = r1.f4625d
            int r2 = r2 + r5
            r1.f4624c = r2
            r8.b2(r9, r1, r10)
        L_0x0113:
            r8.E2()
            int r1 = r8.J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x0127
            r8.h2(r9, r10, r4)
            r8.i2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.i2(r9, r10, r4)
            r8.h2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.J()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.s2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.P
            r8.o1(r11)
            boolean r11 = r8.S1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
        L_0x0166:
            boolean r11 = r0.f4479c
            r8.G = r11
            boolean r11 = r8.u2()
            r8.H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
            r8.x2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean y2(int i10) {
        if (this.f4472w == 0) {
            if ((i10 == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i10 == -1) == this.A) == u2()) {
            return true;
        }
        return false;
    }

    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f4468s; i11++) {
            this.f4469t[i11].r(i10);
        }
    }

    public void C1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f4472w == 1) {
            i13 = RecyclerView.o.n(i11, rect.height() + g02, b0());
            i12 = RecyclerView.o.n(i10, (this.f4473x * this.f4468s) + e02, c0());
        } else {
            i12 = RecyclerView.o.n(i10, rect.width() + e02, c0());
            i13 = RecyclerView.o.n(i11, (this.f4473x * this.f4468s) + g02, b0());
        }
        B1(i12, i13);
    }

    public RecyclerView.p D() {
        if (this.f4472w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f4468s; i11++) {
            this.f4469t[i11].r(i10);
        }
    }

    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int G2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        z2(i10, a0Var);
        int b22 = b2(vVar, this.f4474y, a0Var);
        if (this.f4474y.f4623b >= b22) {
            i10 = i10 < 0 ? -b22 : b22;
        }
        this.f4470u.r(-i10);
        this.G = this.A;
        f fVar = this.f4474y;
        fVar.f4623b = 0;
        B2(vVar, fVar);
        return i10;
    }

    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i10 = 0; i10 < this.f4468s; i10++) {
            this.f4469t[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public void I2(int i10) {
        if (i10 == 0 || i10 == 1) {
            g((String) null);
            if (i10 != this.f4472w) {
                this.f4472w = i10;
                j jVar = this.f4470u;
                this.f4470u = this.f4471v;
                this.f4471v = jVar;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View B2;
        int i11;
        int i12;
        int i13;
        int i14;
        View m10;
        if (J() == 0 || (B2 = B(view)) == null) {
            return null;
        }
        F2();
        int X1 = X1(i10);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B2.getLayoutParams();
        boolean z10 = cVar.f4485f;
        f fVar = cVar.f4484e;
        if (X1 == 1) {
            i11 = k2();
        } else {
            i11 = j2();
        }
        P2(i11, a0Var);
        H2(X1);
        f fVar2 = this.f4474y;
        fVar2.f4624c = fVar2.f4625d + i11;
        fVar2.f4623b = (int) (((float) this.f4470u.n()) * 0.33333334f);
        f fVar3 = this.f4474y;
        fVar3.f4629h = true;
        fVar3.f4622a = false;
        b2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z10 && (m10 = fVar.m(i11, X1)) != null && m10 != B2) {
            return m10;
        }
        if (y2(X1)) {
            for (int i15 = this.f4468s - 1; i15 >= 0; i15--) {
                View m11 = this.f4469t[i15].m(i11, X1);
                if (m11 != null && m11 != B2) {
                    return m11;
                }
            }
        } else {
            for (int i16 = 0; i16 < this.f4468s; i16++) {
                View m12 = this.f4469t[i16].m(i11, X1);
                if (m12 != null && m12 != B2) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f4475z ^ true) == (X1 == -1);
        if (!z10) {
            if (z11) {
                i14 = fVar.f();
            } else {
                i14 = fVar.g();
            }
            View C2 = C(i14);
            if (!(C2 == null || C2 == B2)) {
                return C2;
            }
        }
        if (y2(X1)) {
            for (int i17 = this.f4468s - 1; i17 >= 0; i17--) {
                if (i17 != fVar.f4506e) {
                    if (z11) {
                        i13 = this.f4469t[i17].f();
                    } else {
                        i13 = this.f4469t[i17].g();
                    }
                    View C3 = C(i13);
                    if (!(C3 == null || C3 == B2)) {
                        return C3;
                    }
                }
            }
        } else {
            for (int i18 = 0; i18 < this.f4468s; i18++) {
                if (z11) {
                    i12 = this.f4469t[i18].f();
                } else {
                    i12 = this.f4469t[i18].g();
                }
                View C4 = C(i12);
                if (C4 != null && C4 != B2) {
                    return C4;
                }
            }
        }
        return null;
    }

    public void J2(boolean z10) {
        g((String) null);
        e eVar = this.I;
        if (!(eVar == null || eVar.f4499i == z10)) {
            eVar.f4499i = z10;
        }
        this.f4475z = z10;
        t1();
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 != null && d22 != null) {
                int h02 = h0(e22);
                int h03 = h0(d22);
                if (h02 < h03) {
                    accessibilityEvent.setFromIndex(h02);
                    accessibilityEvent.setToIndex(h03);
                    return;
                }
                accessibilityEvent.setFromIndex(h03);
                accessibilityEvent.setToIndex(h02);
            }
        }
    }

    public void K2(int i10) {
        g((String) null);
        if (i10 != this.f4468s) {
            t2();
            this.f4468s = i10;
            this.B = new BitSet(this.f4468s);
            this.f4469t = new f[this.f4468s];
            for (int i11 = 0; i11 < this.f4468s; i11++) {
                this.f4469t[i11] = new f(i11);
            }
            t1();
        }
    }

    public boolean L1() {
        return this.I == null;
    }

    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4472w == 1) {
            return this.f4468s;
        }
        return super.N(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean N2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.C) != -1) {
            if (i10 < 0 || i10 >= a0Var.b()) {
                this.C = -1;
                this.D = RecyclerView.UNDEFINED_DURATION;
            } else {
                e eVar = this.I;
                if (eVar == null || eVar.f4492a == -1 || eVar.f4494c < 1) {
                    View C2 = C(this.C);
                    if (C2 != null) {
                        if (this.A) {
                            i11 = k2();
                        } else {
                            i11 = j2();
                        }
                        bVar.f4477a = i11;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f4479c) {
                                bVar.f4478b = (this.f4470u.i() - this.D) - this.f4470u.d(C2);
                            } else {
                                bVar.f4478b = (this.f4470u.m() + this.D) - this.f4470u.g(C2);
                            }
                            return true;
                        } else if (this.f4470u.e(C2) > this.f4470u.n()) {
                            if (bVar.f4479c) {
                                i12 = this.f4470u.i();
                            } else {
                                i12 = this.f4470u.m();
                            }
                            bVar.f4478b = i12;
                            return true;
                        } else {
                            int g10 = this.f4470u.g(C2) - this.f4470u.m();
                            if (g10 < 0) {
                                bVar.f4478b = -g10;
                                return true;
                            }
                            int i13 = this.f4470u.i() - this.f4470u.d(C2);
                            if (i13 < 0) {
                                bVar.f4478b = i13;
                                return true;
                            }
                            bVar.f4478b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i14 = this.C;
                        bVar.f4477a = i14;
                        int i15 = this.D;
                        if (i15 == Integer.MIN_VALUE) {
                            if (R1(i14) == 1) {
                                z10 = true;
                            }
                            bVar.f4479c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i15);
                        }
                        bVar.f4480d = true;
                    }
                } else {
                    bVar.f4478b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f4477a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean O1() {
        int l10 = this.f4469t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f4468s; i10++) {
            if (this.f4469t[i10].l(RecyclerView.UNDEFINED_DURATION) != l10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void O2(RecyclerView.a0 a0Var, b bVar) {
        if (!N2(a0Var, bVar) && !M2(a0Var, bVar)) {
            bVar.a();
            bVar.f4477a = 0;
        }
    }

    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.f4472w == 0) {
            cVar.a0(c.d.a(cVar2.e(), cVar2.f4485f ? this.f4468s : 1, -1, -1, false, false));
        } else {
            cVar.a0(c.d.a(-1, -1, cVar2.e(), cVar2.f4485f ? this.f4468s : 1, false, false));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P1() {
        int p10 = this.f4469t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f4468s; i10++) {
            if (this.f4469t[i10].p(RecyclerView.UNDEFINED_DURATION) != p10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Q2(int i10) {
        this.f4473x = i10 / this.f4468s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f4471v.k());
    }

    public void R0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 1);
    }

    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    /* access modifiers changed from: package-private */
    public boolean S1() {
        int i10;
        int i11;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            i11 = k2();
            i10 = j2();
        } else {
            i11 = j2();
            i10 = k2();
        }
        if (i11 == 0 && s2() != null) {
            this.E.b();
            u1();
            t1();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i12 = this.A ? -1 : 1;
            int i13 = i10 + 1;
            d.a e10 = this.E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.M = false;
                this.E.d(i13);
                return false;
            }
            d.a e11 = this.E.e(i11, e10.f4488a, i12 * -1, true);
            if (e11 == null) {
                this.E.d(e10.f4488a);
            } else {
                this.E.d(e11.f4488a + 1);
            }
            u1();
            t1();
            return true;
        }
    }

    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        r2(i10, i11, 8);
    }

    public void U0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 2);
    }

    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        r2(i10, i11, 4);
    }

    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        x2(vVar, a0Var, true);
    }

    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    public PointF a(int i10) {
        int R1 = R1(i10);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f4472w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            t1();
        }
    }

    public Parcelable d1() {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f4499i = this.f4475z;
        eVar.f4500j = this.G;
        eVar.f4501k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f4486a) == null) {
            eVar.f4496f = 0;
        } else {
            eVar.f4497g = iArr;
            eVar.f4496f = iArr.length;
            eVar.f4498h = dVar.f4487b;
        }
        if (J() > 0) {
            if (this.G) {
                i10 = k2();
            } else {
                i10 = j2();
            }
            eVar.f4492a = i10;
            eVar.f4493b = f2();
            int i13 = this.f4468s;
            eVar.f4494c = i13;
            eVar.f4495d = new int[i13];
            for (int i14 = 0; i14 < this.f4468s; i14++) {
                if (this.G) {
                    i11 = this.f4469t[i14].l(RecyclerView.UNDEFINED_DURATION);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f4470u.i();
                    } else {
                        eVar.f4495d[i14] = i11;
                    }
                } else {
                    i11 = this.f4469t[i14].p(RecyclerView.UNDEFINED_DURATION);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f4470u.m();
                    } else {
                        eVar.f4495d[i14] = i11;
                    }
                }
                i11 -= i12;
                eVar.f4495d[i14] = i11;
            }
        } else {
            eVar.f4492a = -1;
            eVar.f4493b = -1;
            eVar.f4494c = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public View d2(boolean z10) {
        int m10 = this.f4470u.m();
        int i10 = this.f4470u.i();
        View view = null;
        for (int J2 = J() - 1; J2 >= 0; J2--) {
            View I2 = I(J2);
            int g10 = this.f4470u.g(I2);
            int d10 = this.f4470u.d(I2);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return I2;
                }
                if (view == null) {
                    view = I2;
                }
            }
        }
        return view;
    }

    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    /* access modifiers changed from: package-private */
    public View e2(boolean z10) {
        int m10 = this.f4470u.m();
        int i10 = this.f4470u.i();
        int J2 = J();
        View view = null;
        for (int i11 = 0; i11 < J2; i11++) {
            View I2 = I(i11);
            int g10 = this.f4470u.g(I2);
            if (this.f4470u.d(I2) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return I2;
                }
                if (view == null) {
                    view = I2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int f2() {
        View view;
        if (this.A) {
            view = d2(true);
        } else {
            view = e2(true);
        }
        if (view == null) {
            return -1;
        }
        return h0(view);
    }

    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    public boolean k() {
        return this.f4472w == 0;
    }

    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4472w == 0) {
            return this.f4468s;
        }
        return super.k0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public int k2() {
        int J2 = J();
        if (J2 == 0) {
            return 0;
        }
        return h0(I(J2 - 1));
    }

    public boolean l() {
        return this.f4472w == 1;
    }

    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i12;
        int i13;
        if (this.f4472w != 0) {
            i10 = i11;
        }
        if (J() != 0 && i10 != 0) {
            z2(i10, a0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.f4468s) {
                this.O = new int[this.f4468s];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f4468s; i15++) {
                f fVar = this.f4474y;
                if (fVar.f4625d == -1) {
                    i13 = fVar.f4627f;
                    i12 = this.f4469t[i15].p(i13);
                } else {
                    i13 = this.f4469t[i15].l(fVar.f4628g);
                    i12 = this.f4474y.f4628g;
                }
                int i16 = i13 - i12;
                if (i16 >= 0) {
                    this.O[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.O, 0, i14);
            for (int i17 = 0; i17 < i14 && this.f4474y.a(a0Var); i17++) {
                cVar.a(this.f4474y.f4624c, this.O[i17]);
                f fVar2 = this.f4474y;
                fVar2.f4624c += fVar2.f4625d;
            }
        }
    }

    public int q(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public int q2() {
        return this.f4468s;
    }

    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public boolean s0() {
        return this.F != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4468s
            r2.<init>(r3)
            int r3 = r12.f4468s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4472w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.u2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4484e
            int r9 = r9.f4506e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4484e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4484e
            int r9 = r9.f4506e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4485f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.j r10 = r12.f4470u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.j r11 = r12.f4470u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.j r10 = r12.f4470u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.j r11 = r12.f4470u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4484e
            int r8 = r8.f4506e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4484e
            int r9 = r9.f4506e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    public int t(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public void t2() {
        this.E.b();
        t1();
    }

    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean u2() {
        return Z() == 1;
    }

    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i10, vVar, a0Var);
    }

    public void x1(int i10) {
        e eVar = this.I;
        if (!(eVar == null || eVar.f4492a == i10)) {
            eVar.c();
        }
        this.C = i10;
        this.D = RecyclerView.UNDEFINED_DURATION;
        t1();
    }

    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i10, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void z2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = k2();
            i11 = 1;
        } else {
            i12 = j2();
            i11 = -1;
        }
        this.f4474y.f4622a = true;
        P2(i12, a0Var);
        H2(i11);
        f fVar = this.f4474y;
        fVar.f4624c = i12 + fVar.f4625d;
        fVar.f4623b = Math.abs(i10);
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f4486a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f4487b;

        d() {
        }

        private int i(int i10) {
            if (this.f4487b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f4487b.remove(f10);
            }
            int size = this.f4487b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f4487b.get(i11).f4488a >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f4487b.remove(i11);
            return this.f4487b.get(i11).f4488a;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f4487b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f4487b.get(size);
                    int i12 = aVar.f4488a;
                    if (i12 >= i10) {
                        aVar.f4488a = i12 + i11;
                    }
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f4487b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f4487b.get(size);
                    int i13 = aVar.f4488a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f4487b.remove(size);
                        } else {
                            aVar.f4488a = i13 - i11;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f4487b == null) {
                this.f4487b = new ArrayList();
            }
            int size = this.f4487b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f4487b.get(i10);
                if (aVar2.f4488a == aVar.f4488a) {
                    this.f4487b.remove(i10);
                }
                if (aVar2.f4488a >= aVar.f4488a) {
                    this.f4487b.add(i10, aVar);
                    return;
                }
            }
            this.f4487b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f4486a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4487b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            int[] iArr = this.f4486a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f4486a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f4486a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4486a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i10) {
            List<a> list = this.f4487b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4487b.get(size).f4488a >= i10) {
                        this.f4487b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f4487b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f4487b.get(i13);
                int i14 = aVar.f4488a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f4489b == i12 || (z10 && aVar.f4491d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f4487b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4487b.get(size);
                if (aVar.f4488a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i10) {
            int[] iArr = this.f4486a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int[] iArr = this.f4486a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f4486a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4486a.length;
            }
            int i12 = i11 + 1;
            Arrays.fill(this.f4486a, i10, i12, -1);
            return i12;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            int[] iArr = this.f4486a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f4486a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f4486a, i10, i12, -1);
                l(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i10, int i11) {
            int[] iArr = this.f4486a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f4486a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f4486a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, f fVar) {
            c(i10);
            this.f4486a[i10] = fVar.f4506e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i10) {
            int length = this.f4486a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0072a();

            /* renamed from: a  reason: collision with root package name */
            int f4488a;

            /* renamed from: b  reason: collision with root package name */
            int f4489b;

            /* renamed from: c  reason: collision with root package name */
            int[] f4490c;

            /* renamed from: d  reason: collision with root package name */
            boolean f4491d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C0072a implements Parcelable.Creator<a> {
                C0072a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f4488a = parcel.readInt();
                this.f4489b = parcel.readInt();
                this.f4491d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4490c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i10) {
                int[] iArr = this.f4490c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4488a + ", mGapDir=" + this.f4489b + ", mHasUnwantedGapAfter=" + this.f4491d + ", mGapPerSpan=" + Arrays.toString(this.f4490c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4488a);
                parcel.writeInt(this.f4489b);
                parcel.writeInt(this.f4491d ? 1 : 0);
                int[] iArr = this.f4490c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4490c);
            }

            a() {
            }
        }
    }
}
