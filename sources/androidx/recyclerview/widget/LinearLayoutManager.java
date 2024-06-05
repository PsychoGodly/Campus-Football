package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    int A = -1;
    int B = RecyclerView.UNDEFINED_DURATION;
    private boolean C;
    d D = null;
    final a E = new a();
    private final b F = new b();
    private int G = 2;
    private int[] H = new int[2];

    /* renamed from: s  reason: collision with root package name */
    int f4336s = 1;

    /* renamed from: t  reason: collision with root package name */
    private c f4337t;

    /* renamed from: u  reason: collision with root package name */
    j f4338u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4339v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f4340w = false;

    /* renamed from: x  reason: collision with root package name */
    boolean f4341x = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4342y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f4343z = true;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        j f4344a;

        /* renamed from: b  reason: collision with root package name */
        int f4345b;

        /* renamed from: c  reason: collision with root package name */
        int f4346c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4347d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4348e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10;
            if (this.f4347d) {
                i10 = this.f4344a.i();
            } else {
                i10 = this.f4344a.m();
            }
            this.f4346c = i10;
        }

        public void b(View view, int i10) {
            if (this.f4347d) {
                this.f4346c = this.f4344a.d(view) + this.f4344a.o();
            } else {
                this.f4346c = this.f4344a.g(view);
            }
            this.f4345b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f4344a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f4345b = i10;
            if (this.f4347d) {
                int i11 = (this.f4344a.i() - o10) - this.f4344a.d(view);
                this.f4346c = this.f4344a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f4346c - this.f4344a.e(view);
                    int m10 = this.f4344a.m();
                    int min = e10 - (m10 + Math.min(this.f4344a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f4346c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f4344a.g(view);
            int m11 = g10 - this.f4344a.m();
            this.f4346c = g10;
            if (m11 > 0) {
                int i12 = (this.f4344a.i() - Math.min(0, (this.f4344a.i() - o10) - this.f4344a.d(view))) - (g10 + this.f4344a.e(view));
                if (i12 < 0) {
                    this.f4346c -= Math.min(m11, -i12);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f4345b = -1;
            this.f4346c = RecyclerView.UNDEFINED_DURATION;
            this.f4347d = false;
            this.f4348e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4345b + ", mCoordinate=" + this.f4346c + ", mLayoutFromEnd=" + this.f4347d + ", mValid=" + this.f4348e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4349a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4350b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4351c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4352d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f4349a = 0;
            this.f4350b = false;
            this.f4351c = false;
            this.f4352d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f4353a = true;

        /* renamed from: b  reason: collision with root package name */
        int f4354b;

        /* renamed from: c  reason: collision with root package name */
        int f4355c;

        /* renamed from: d  reason: collision with root package name */
        int f4356d;

        /* renamed from: e  reason: collision with root package name */
        int f4357e;

        /* renamed from: f  reason: collision with root package name */
        int f4358f;

        /* renamed from: g  reason: collision with root package name */
        int f4359g;

        /* renamed from: h  reason: collision with root package name */
        int f4360h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f4361i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f4362j = false;

        /* renamed from: k  reason: collision with root package name */
        int f4363k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.d0> f4364l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f4365m;

        c() {
        }

        private View e() {
            int size = this.f4364l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f4364l.get(i10).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f4356d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f4356d = -1;
            } else {
                this.f4356d = ((RecyclerView.p) f10.getLayoutParams()).a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i10 = this.f4356d;
            return i10 >= 0 && i10 < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.v vVar) {
            if (this.f4364l != null) {
                return e();
            }
            View o10 = vVar.o(this.f4356d);
            this.f4356d += this.f4357e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f4364l.size();
            View view2 = null;
            int i10 = a.e.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f4364l.get(i11).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a10 = (pVar.a() - this.f4356d) * this.f4357e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f4366a;

        /* renamed from: b  reason: collision with root package name */
        int f4367b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4368c;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f4366a >= 0;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f4366a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4366a);
            parcel.writeInt(this.f4367b);
            parcel.writeInt(this.f4368c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f4366a = parcel.readInt();
            this.f4367b = parcel.readInt();
            this.f4368c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f4366a = dVar.f4366a;
            this.f4367b = dVar.f4367b;
            this.f4368c = dVar.f4368c;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        C2(i10);
        D2(z10);
    }

    private void A2() {
        if (this.f4336s == 1 || !q2()) {
            this.f4341x = this.f4340w;
        } else {
            this.f4341x = !this.f4340w;
        }
    }

    private boolean F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View view;
        int i10;
        boolean z10 = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, a0Var)) {
            aVar.c(V, h0(V));
            return true;
        } else if (this.f4339v != this.f4342y) {
            return false;
        } else {
            if (aVar.f4347d) {
                view = i2(vVar, a0Var);
            } else {
                view = j2(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.b(view, h0(view));
            if (!a0Var.e() && L1()) {
                if (this.f4338u.g(view) >= this.f4338u.i() || this.f4338u.d(view) < this.f4338u.m()) {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.f4347d) {
                        i10 = this.f4338u.i();
                    } else {
                        i10 = this.f4338u.m();
                    }
                    aVar.f4346c = i10;
                }
            }
            return true;
        }
    }

    private boolean G2(RecyclerView.a0 a0Var, a aVar) {
        int i10;
        int i11;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.A) != -1) {
            if (i10 < 0 || i10 >= a0Var.b()) {
                this.A = -1;
                this.B = RecyclerView.UNDEFINED_DURATION;
            } else {
                aVar.f4345b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.c()) {
                    boolean z11 = this.D.f4368c;
                    aVar.f4347d = z11;
                    if (z11) {
                        aVar.f4346c = this.f4338u.i() - this.D.f4367b;
                    } else {
                        aVar.f4346c = this.f4338u.m() + this.D.f4367b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View C2 = C(this.A);
                    if (C2 == null) {
                        if (J() > 0) {
                            if ((this.A < h0(I(0))) == this.f4341x) {
                                z10 = true;
                            }
                            aVar.f4347d = z10;
                        }
                        aVar.a();
                    } else if (this.f4338u.e(C2) > this.f4338u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f4338u.g(C2) - this.f4338u.m() < 0) {
                        aVar.f4346c = this.f4338u.m();
                        aVar.f4347d = false;
                        return true;
                    } else if (this.f4338u.i() - this.f4338u.d(C2) < 0) {
                        aVar.f4346c = this.f4338u.i();
                        aVar.f4347d = true;
                        return true;
                    } else {
                        if (aVar.f4347d) {
                            i11 = this.f4338u.d(C2) + this.f4338u.o();
                        } else {
                            i11 = this.f4338u.g(C2);
                        }
                        aVar.f4346c = i11;
                    }
                    return true;
                } else {
                    boolean z12 = this.f4341x;
                    aVar.f4347d = z12;
                    if (z12) {
                        aVar.f4346c = this.f4338u.i() - this.B;
                    } else {
                        aVar.f4346c = this.f4338u.m() + this.B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!G2(a0Var, aVar) && !F2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f4345b = this.f4342y ? a0Var.b() - 1 : 0;
        }
    }

    private void I2(int i10, int i11, boolean z10, RecyclerView.a0 a0Var) {
        int i12;
        this.f4337t.f4365m = z2();
        this.f4337t.f4358f = i10;
        int[] iArr = this.H;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f4337t;
        int i14 = z11 ? max2 : max;
        cVar.f4360h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f4361i = max;
        if (z11) {
            cVar.f4360h = i14 + this.f4338u.j();
            View m22 = m2();
            c cVar2 = this.f4337t;
            if (this.f4341x) {
                i13 = -1;
            }
            cVar2.f4357e = i13;
            int h02 = h0(m22);
            c cVar3 = this.f4337t;
            cVar2.f4356d = h02 + cVar3.f4357e;
            cVar3.f4354b = this.f4338u.d(m22);
            i12 = this.f4338u.d(m22) - this.f4338u.i();
        } else {
            View n22 = n2();
            this.f4337t.f4360h += this.f4338u.m();
            c cVar4 = this.f4337t;
            if (!this.f4341x) {
                i13 = -1;
            }
            cVar4.f4357e = i13;
            int h03 = h0(n22);
            c cVar5 = this.f4337t;
            cVar4.f4356d = h03 + cVar5.f4357e;
            cVar5.f4354b = this.f4338u.g(n22);
            i12 = (-this.f4338u.g(n22)) + this.f4338u.m();
        }
        c cVar6 = this.f4337t;
        cVar6.f4355c = i11;
        if (z10) {
            cVar6.f4355c = i11 - i12;
        }
        cVar6.f4359g = i12;
    }

    private void J2(int i10, int i11) {
        this.f4337t.f4355c = this.f4338u.i() - i11;
        c cVar = this.f4337t;
        cVar.f4357e = this.f4341x ? -1 : 1;
        cVar.f4356d = i10;
        cVar.f4358f = 1;
        cVar.f4354b = i11;
        cVar.f4359g = RecyclerView.UNDEFINED_DURATION;
    }

    private void K2(a aVar) {
        J2(aVar.f4345b, aVar.f4346c);
    }

    private void L2(int i10, int i11) {
        this.f4337t.f4355c = i11 - this.f4338u.m();
        c cVar = this.f4337t;
        cVar.f4356d = i10;
        cVar.f4357e = this.f4341x ? 1 : -1;
        cVar.f4358f = -1;
        cVar.f4354b = i11;
        cVar.f4359g = RecyclerView.UNDEFINED_DURATION;
    }

    private void M2(a aVar) {
        L2(aVar.f4345b, aVar.f4346c);
    }

    private int O1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        j jVar = this.f4338u;
        View Y1 = Y1(!this.f4343z, true);
        return l.a(a0Var, jVar, Y1, X1(!this.f4343z, true), this, this.f4343z);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        j jVar = this.f4338u;
        View Y1 = Y1(!this.f4343z, true);
        return l.b(a0Var, jVar, Y1, X1(!this.f4343z, true), this, this.f4343z, this.f4341x);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        j jVar = this.f4338u;
        View Y1 = Y1(!this.f4343z, true);
        return l.c(a0Var, jVar, Y1, X1(!this.f4343z, true), this, this.f4343z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, 0, J(), a0Var.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, J() - 1, -1, a0Var.b());
    }

    private View f2() {
        if (this.f4341x) {
            return V1();
        }
        return a2();
    }

    private View g2() {
        if (this.f4341x) {
            return a2();
        }
        return V1();
    }

    private View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4341x) {
            return W1(vVar, a0Var);
        }
        return b2(vVar, a0Var);
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4341x) {
            return b2(vVar, a0Var);
        }
        return W1(vVar, a0Var);
    }

    private int k2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12 = this.f4338u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -B2(-i12, vVar, a0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f4338u.i() - i14) <= 0) {
            return i13;
        }
        this.f4338u.r(i11);
        return i11 + i13;
    }

    private int l2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.f4338u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -B2(m11, vVar, a0Var);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f4338u.m()) <= 0) {
            return i11;
        }
        this.f4338u.r(-m10);
        return i11 - m10;
    }

    private View m2() {
        return I(this.f4341x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.f4341x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11) {
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        if (a0Var.g() && J() != 0 && !a0Var.e() && L1()) {
            List<RecyclerView.d0> k10 = vVar.k();
            int size = k10.size();
            int h02 = h0(I(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.d0 d0Var = k10.get(i14);
                if (!d0Var.isRemoved()) {
                    char c10 = 1;
                    if ((d0Var.getLayoutPosition() < h02) != this.f4341x) {
                        c10 = 65535;
                    }
                    if (c10 == 65535) {
                        i12 += this.f4338u.e(d0Var.itemView);
                    } else {
                        i13 += this.f4338u.e(d0Var.itemView);
                    }
                }
            }
            this.f4337t.f4364l = k10;
            if (i12 > 0) {
                L2(h0(n2()), i10);
                c cVar = this.f4337t;
                cVar.f4360h = i12;
                cVar.f4355c = 0;
                cVar.a();
                U1(vVar2, this.f4337t, a0Var2, false);
            }
            if (i13 > 0) {
                J2(h0(m2()), i11);
                c cVar2 = this.f4337t;
                cVar2.f4360h = i13;
                cVar2.f4355c = 0;
                cVar2.a();
                U1(vVar2, this.f4337t, a0Var2, false);
            }
            this.f4337t.f4364l = null;
        }
    }

    private void v2(RecyclerView.v vVar, c cVar) {
        if (cVar.f4353a && !cVar.f4365m) {
            int i10 = cVar.f4359g;
            int i11 = cVar.f4361i;
            if (cVar.f4358f == -1) {
                x2(vVar, i10, i11);
            } else {
                y2(vVar, i10, i11);
            }
        }
    }

    private void w2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    n1(i12, vVar);
                }
                return;
            }
            while (i10 > i11) {
                n1(i10, vVar);
                i10--;
            }
        }
    }

    private void x2(RecyclerView.v vVar, int i10, int i11) {
        int J = J();
        if (i10 >= 0) {
            int h10 = (this.f4338u.h() - i10) + i11;
            if (this.f4341x) {
                for (int i12 = 0; i12 < J; i12++) {
                    View I = I(i12);
                    if (this.f4338u.g(I) < h10 || this.f4338u.q(I) < h10) {
                        w2(vVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = J - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View I2 = I(i14);
                if (this.f4338u.g(I2) < h10 || this.f4338u.q(I2) < h10) {
                    w2(vVar, i13, i14);
                    return;
                }
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int J = J();
            if (this.f4341x) {
                int i13 = J - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View I = I(i14);
                    if (this.f4338u.d(I) > i12 || this.f4338u.p(I) > i12) {
                        w2(vVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < J; i15++) {
                View I2 = I(i15);
                if (this.f4338u.d(I2) > i12 || this.f4338u.p(I2) > i12) {
                    w2(vVar, 0, i15);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int B2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f4337t.f4353a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        I2(i11, abs, true, a0Var);
        c cVar = this.f4337t;
        int U1 = cVar.f4359g + U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i10 = i11 * U1;
        }
        this.f4338u.r(-i10);
        this.f4337t.f4363k = i10;
        return i10;
    }

    public View C(int i10) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h02 = i10 - h0(I(0));
        if (h02 >= 0 && h02 < J) {
            View I = I(h02);
            if (h0(I) == i10) {
                return I;
            }
        }
        return super.C(i10);
    }

    public void C2(int i10) {
        if (i10 == 0 || i10 == 1) {
            g((String) null);
            if (i10 != this.f4336s || this.f4338u == null) {
                j b10 = j.b(this, i10);
                this.f4338u = b10;
                this.E.f4344a = b10;
                this.f4336s = i10;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z10) {
        g((String) null);
        if (z10 != this.f4340w) {
            this.f4340w = z10;
            t1();
        }
    }

    public void E2(boolean z10) {
        g((String) null);
        if (this.f4342y != z10) {
            this.f4342y = z10;
            t1();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int R1;
        View view2;
        View view3;
        A2();
        if (J() == 0 || (R1 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R1, (int) (((float) this.f4338u.n()) * 0.33333334f), false, a0Var);
        c cVar = this.f4337t;
        cVar.f4359g = RecyclerView.UNDEFINED_DURATION;
        cVar.f4353a = false;
        U1(vVar, cVar, a0Var, true);
        if (R1 == -1) {
            view2 = g2();
        } else {
            view2 = f2();
        }
        if (R1 == -1) {
            view3 = n2();
        } else {
            view3 = m2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    public boolean L1() {
        return this.D == null && this.f4339v == this.f4342y;
    }

    /* access modifiers changed from: protected */
    public void M1(RecyclerView.a0 a0Var, int[] iArr) {
        int i10;
        int o22 = o2(a0Var);
        if (this.f4337t.f4358f == -1) {
            i10 = 0;
        } else {
            i10 = o22;
            o22 = 0;
        }
        iArr[0] = o22;
        iArr[1] = i10;
    }

    /* access modifiers changed from: package-private */
    public void N1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f4356d;
        if (i10 >= 0 && i10 < a0Var.b()) {
            cVar2.a(i10, Math.max(0, cVar.f4359g));
        }
    }

    /* access modifiers changed from: package-private */
    public int R1(int i10) {
        if (i10 == 1) {
            return (this.f4336s != 1 && q2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4336s != 1 && q2()) ? -1 : 1;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130 && this.f4336s == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f4336s == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f4336s == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f4336s == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* access modifiers changed from: package-private */
    public c S1() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void T1() {
        if (this.f4337t == null) {
            this.f4337t = S1();
        }
    }

    /* access modifiers changed from: package-private */
    public int U1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10 = cVar.f4355c;
        int i11 = cVar.f4359g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f4359g = i11 + i10;
            }
            v2(vVar, cVar);
        }
        int i12 = cVar.f4355c + cVar.f4360h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f4365m && i12 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f4350b) {
                cVar.f4354b += bVar.f4349a * cVar.f4358f;
                if (!bVar.f4351c || cVar.f4364l != null || !a0Var.e()) {
                    int i13 = cVar.f4355c;
                    int i14 = bVar.f4349a;
                    cVar.f4355c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f4359g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f4349a;
                    cVar.f4359g = i16;
                    int i17 = cVar.f4355c;
                    if (i17 < 0) {
                        cVar.f4359g = i16 + i17;
                    }
                    v2(vVar, cVar);
                }
                if (z10 && bVar.f4352d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f4355c;
    }

    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View C2;
        int i16;
        int i17;
        int i18 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            k1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.c()) {
            this.A = this.D.f4366a;
        }
        T1();
        this.f4337t.f4353a = false;
        A2();
        View V = V();
        a aVar = this.E;
        if (!aVar.f4348e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f4347d = this.f4341x ^ this.f4342y;
            H2(vVar, a0Var, aVar2);
            this.E.f4348e = true;
        } else if (V != null && (this.f4338u.g(V) >= this.f4338u.i() || this.f4338u.d(V) <= this.f4338u.m())) {
            this.E.c(V, h0(V));
        }
        c cVar = this.f4337t;
        cVar.f4358f = cVar.f4363k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f4338u.m();
        int max2 = Math.max(0, this.H[1]) + this.f4338u.j();
        if (!(!a0Var.e() || (i15 = this.A) == -1 || this.B == Integer.MIN_VALUE || (C2 = C(i15)) == null)) {
            if (this.f4341x) {
                i16 = this.f4338u.i() - this.f4338u.d(C2);
                i17 = this.B;
            } else {
                i17 = this.f4338u.g(C2) - this.f4338u.m();
                i16 = this.B;
            }
            int i19 = i16 - i17;
            if (i19 > 0) {
                max += i19;
            } else {
                max2 -= i19;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f4347d ? !this.f4341x : this.f4341x) {
            i18 = 1;
        }
        u2(vVar, a0Var, aVar3, i18);
        w(vVar);
        this.f4337t.f4365m = z2();
        this.f4337t.f4362j = a0Var.e();
        this.f4337t.f4361i = 0;
        a aVar4 = this.E;
        if (aVar4.f4347d) {
            M2(aVar4);
            c cVar2 = this.f4337t;
            cVar2.f4360h = max;
            U1(vVar, cVar2, a0Var, false);
            c cVar3 = this.f4337t;
            i11 = cVar3.f4354b;
            int i20 = cVar3.f4356d;
            int i21 = cVar3.f4355c;
            if (i21 > 0) {
                max2 += i21;
            }
            K2(this.E);
            c cVar4 = this.f4337t;
            cVar4.f4360h = max2;
            cVar4.f4356d += cVar4.f4357e;
            U1(vVar, cVar4, a0Var, false);
            c cVar5 = this.f4337t;
            i10 = cVar5.f4354b;
            int i22 = cVar5.f4355c;
            if (i22 > 0) {
                L2(i20, i11);
                c cVar6 = this.f4337t;
                cVar6.f4360h = i22;
                U1(vVar, cVar6, a0Var, false);
                i11 = this.f4337t.f4354b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f4337t;
            cVar7.f4360h = max2;
            U1(vVar, cVar7, a0Var, false);
            c cVar8 = this.f4337t;
            i10 = cVar8.f4354b;
            int i23 = cVar8.f4356d;
            int i24 = cVar8.f4355c;
            if (i24 > 0) {
                max += i24;
            }
            M2(this.E);
            c cVar9 = this.f4337t;
            cVar9.f4360h = max;
            cVar9.f4356d += cVar9.f4357e;
            U1(vVar, cVar9, a0Var, false);
            c cVar10 = this.f4337t;
            i11 = cVar10.f4354b;
            int i25 = cVar10.f4355c;
            if (i25 > 0) {
                J2(i23, i10);
                c cVar11 = this.f4337t;
                cVar11.f4360h = i25;
                U1(vVar, cVar11, a0Var, false);
                i10 = this.f4337t.f4354b;
            }
        }
        if (J() > 0) {
            if (this.f4341x ^ this.f4342y) {
                int k22 = k2(i10, vVar, a0Var, true);
                i13 = i11 + k22;
                i12 = i10 + k22;
                i14 = l2(i13, vVar, a0Var, false);
            } else {
                int l22 = l2(i11, vVar, a0Var, true);
                i13 = i11 + l22;
                i12 = i10 + l22;
                i14 = k2(i12, vVar, a0Var, false);
            }
            i11 = i13 + i14;
            i10 = i12 + i14;
        }
        t2(vVar, a0Var, i11, i10);
        if (!a0Var.e()) {
            this.f4338u.s();
        } else {
            this.E.e();
        }
        this.f4339v = this.f4342y;
    }

    /* access modifiers changed from: package-private */
    public View X1(boolean z10, boolean z11) {
        if (this.f4341x) {
            return e2(0, J(), z10, z11);
        }
        return e2(J() - 1, -1, z10, z11);
    }

    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    /* access modifiers changed from: package-private */
    public View Y1(boolean z10, boolean z11) {
        if (this.f4341x) {
            return e2(J() - 1, -1, z10, z11);
        }
        return e2(0, J(), z10, z11);
    }

    public int Z1() {
        View e22 = e2(0, J(), false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < h0(I(0))) {
            z10 = true;
        }
        if (z10 != this.f4341x) {
            i11 = -1;
        }
        if (this.f4336s == 0) {
            return new PointF((float) i11, 0.0f);
        }
        return new PointF(0.0f, (float) i11);
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View e22 = e2(J() - 1, -1, false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z10 = this.f4339v ^ this.f4341x;
            dVar.f4368c = z10;
            if (z10) {
                View m22 = m2();
                dVar.f4367b = this.f4338u.i() - this.f4338u.d(m22);
                dVar.f4366a = h0(m22);
            } else {
                View n22 = n2();
                dVar.f4366a = h0(n22);
                dVar.f4367b = this.f4338u.g(n22) - this.f4338u.m();
            }
        } else {
            dVar.d();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public View d2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if ((i11 > i10 ? 1 : i11 < i10 ? (char) 65535 : 0) == 0) {
            return I(i10);
        }
        if (this.f4338u.g(I(i10)) < this.f4338u.m()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        if (this.f4336s == 0) {
            return this.f4413e.a(i10, i11, i13, i12);
        }
        return this.f4414f.a(i10, i11, i13, i12);
    }

    /* access modifiers changed from: package-private */
    public View e2(int i10, int i11, boolean z10, boolean z11) {
        T1();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        if (this.f4336s == 0) {
            return this.f4413e.a(i10, i11, i13, i12);
        }
        return this.f4414f.a(i10, i11, i13, i12);
    }

    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    /* access modifiers changed from: package-private */
    public View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11, int i12) {
        T1();
        int m10 = this.f4338u.m();
        int i13 = this.f4338u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View I = I(i10);
            int h02 = h0(I);
            if (h02 >= 0 && h02 < i12) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f4338u.g(I) < i13 && this.f4338u.d(I) >= m10) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    public boolean k() {
        return this.f4336s == 0;
    }

    public boolean l() {
        return this.f4336s == 1;
    }

    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f4336s != 0) {
            i10 = i11;
        }
        if (J() != 0 && i10 != 0) {
            T1();
            I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a0Var);
            N1(a0Var, this.f4337t, cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int o2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f4338u.n();
        }
        return 0;
    }

    public void p(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        int i12 = -1;
        if (dVar == null || !dVar.c()) {
            A2();
            z10 = this.f4341x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f4368c;
            i11 = dVar2.f4366a;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public int p2() {
        return this.f4336s;
    }

    public int q(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    /* access modifiers changed from: protected */
    public boolean q2() {
        return Z() == 1;
    }

    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public boolean r2() {
        return this.f4343z;
    }

    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public boolean s0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View d10 = cVar.d(vVar);
        if (d10 == null) {
            bVar.f4350b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d10.getLayoutParams();
        if (cVar.f4364l == null) {
            if (this.f4341x == (cVar.f4358f == -1)) {
                d(d10);
            } else {
                e(d10, 0);
            }
        } else {
            if (this.f4341x == (cVar.f4358f == -1)) {
                b(d10);
            } else {
                c(d10, 0);
            }
        }
        A0(d10, 0, 0);
        bVar.f4349a = this.f4338u.e(d10);
        if (this.f4336s == 1) {
            if (q2()) {
                i14 = o0() - f0();
                i13 = i14 - this.f4338u.f(d10);
            } else {
                i13 = e0();
                i14 = this.f4338u.f(d10) + i13;
            }
            if (cVar.f4358f == -1) {
                int i15 = cVar.f4354b;
                i10 = i15;
                i11 = i14;
                i12 = i15 - bVar.f4349a;
            } else {
                int i16 = cVar.f4354b;
                i12 = i16;
                i11 = i14;
                i10 = bVar.f4349a + i16;
            }
        } else {
            int g02 = g0();
            int f10 = this.f4338u.f(d10) + g02;
            if (cVar.f4358f == -1) {
                int i17 = cVar.f4354b;
                i11 = i17;
                i12 = g02;
                i10 = f10;
                i13 = i17 - bVar.f4349a;
            } else {
                int i18 = cVar.f4354b;
                i12 = g02;
                i11 = bVar.f4349a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        z0(d10, i13, i12, i11, i10);
        if (pVar.c() || pVar.b()) {
            bVar.f4351c = true;
        }
        bVar.f4352d = d10.hasFocusable();
    }

    public int t(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i10) {
    }

    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4336s == 1) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    public void x1(int i10) {
        this.A = i10;
        this.B = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.D;
        if (dVar != null) {
            dVar.d();
        }
        t1();
    }

    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4336s == 0) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean z2() {
        return this.f4338u.k() == 0 && this.f4338u.h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        C2(i02.f4429a);
        D2(i02.f4431c);
        E2(i02.f4432d);
    }
}
