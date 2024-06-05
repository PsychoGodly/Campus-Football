package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class a extends w implements n.o {

    /* renamed from: t  reason: collision with root package name */
    final n f3479t;

    /* renamed from: u  reason: collision with root package name */
    boolean f3480u;

    /* renamed from: v  reason: collision with root package name */
    int f3481v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(n nVar) {
        super(nVar.q0(), nVar.t0() != null ? nVar.t0().f().getClassLoader() : null);
        this.f3481v = -1;
        this.f3479t = nVar;
    }

    private static boolean z(w.a aVar) {
        Fragment fragment = aVar.f3743b;
        return fragment != null && fragment.f3430m && fragment.I != null && !fragment.B && !fragment.A && fragment.a0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        for (int i10 = 0; i10 < this.f3725c.size(); i10++) {
            if (z(this.f3725c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        if (this.f3741s != null) {
            for (int i10 = 0; i10 < this.f3741s.size(); i10++) {
                this.f3741s.get(i10).run();
            }
            this.f3741s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void C(Fragment.h hVar) {
        for (int i10 = 0; i10 < this.f3725c.size(); i10++) {
            w.a aVar = this.f3725c.get(i10);
            if (z(aVar)) {
                aVar.f3743b.y1(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3725c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f3725c.get(size);
            int i10 = aVar.f3742a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3743b;
                            break;
                        case 10:
                            aVar.f3749h = aVar.f3748g;
                            break;
                    }
                }
                arrayList.add(aVar.f3743b);
            }
            arrayList.remove(aVar.f3743b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3731i) {
            return true;
        }
        this.f3479t.e(this);
        return true;
    }

    public int f() {
        return q(false);
    }

    public int g() {
        return q(true);
    }

    public void h() {
        j();
        this.f3479t.b0(this, false);
    }

    public void i() {
        j();
        this.f3479t.b0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, Fragment fragment, String str, int i11) {
        super.k(i10, fragment, str, i11);
        fragment.f3437t = this.f3479t;
    }

    public w l(Fragment fragment) {
        n nVar = fragment.f3437t;
        if (nVar == null || nVar == this.f3479t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        if (this.f3731i) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3725c.size();
            for (int i11 = 0; i11 < size; i11++) {
                w.a aVar = this.f3725c.get(i11);
                Fragment fragment = aVar.f3743b;
                if (fragment != null) {
                    fragment.f3436s += i10;
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3743b + " to " + aVar.f3743b.f3436s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int q(boolean z10) {
        if (!this.f3480u) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                r("  ", printWriter);
                printWriter.close();
            }
            this.f3480u = true;
            if (this.f3731i) {
                this.f3481v = this.f3479t.i();
            } else {
                this.f3481v = -1;
            }
            this.f3479t.Y(this, z10);
            return this.f3481v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3733k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3481v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3480u);
            if (this.f3730h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3730h));
            }
            if (!(this.f3726d == 0 && this.f3727e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3726d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3727e));
            }
            if (!(this.f3728f == 0 && this.f3729g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3728f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3729g));
            }
            if (!(this.f3734l == 0 && this.f3735m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3734l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3735m);
            }
            if (!(this.f3736n == 0 && this.f3737o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3736n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3737o);
            }
        }
        if (!this.f3725c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3725c.size();
            for (int i10 = 0; i10 < size; i10++) {
                w.a aVar = this.f3725c.get(i10);
                switch (aVar.f3742a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3742a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3743b);
                if (z10) {
                    if (!(aVar.f3744c == 0 && aVar.f3745d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3744c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3745d));
                    }
                    if (aVar.f3746e != 0 || aVar.f3747f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3746e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3747f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int size = this.f3725c.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = this.f3725c.get(i10);
            Fragment fragment = aVar.f3743b;
            if (fragment != null) {
                fragment.z1(false);
                fragment.x1(this.f3730h);
                fragment.B1(this.f3738p, this.f3739q);
            }
            switch (aVar.f3742a) {
                case 1:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, false);
                    this.f3479t.g(fragment);
                    break;
                case 3:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.c1(fragment);
                    break;
                case 4:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.C0(fragment);
                    break;
                case 5:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, false);
                    this.f3479t.n1(fragment);
                    break;
                case 6:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.x(fragment);
                    break;
                case 7:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, false);
                    this.f3479t.k(fragment);
                    break;
                case 8:
                    this.f3479t.l1(fragment);
                    break;
                case 9:
                    this.f3479t.l1((Fragment) null);
                    break;
                case 10:
                    this.f3479t.k1(fragment, aVar.f3749h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3742a);
            }
            if (!this.f3740r && aVar.f3742a != 1 && fragment != null && !n.P) {
                this.f3479t.O0(fragment);
            }
        }
        if (!this.f3740r && !n.P) {
            n nVar = this.f3479t;
            nVar.P0(nVar.f3650q, true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3481v >= 0) {
            sb2.append(" #");
            sb2.append(this.f3481v);
        }
        if (this.f3733k != null) {
            sb2.append(" ");
            sb2.append(this.f3733k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        for (int size = this.f3725c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f3725c.get(size);
            Fragment fragment = aVar.f3743b;
            if (fragment != null) {
                fragment.z1(true);
                fragment.x1(n.g1(this.f3730h));
                fragment.B1(this.f3739q, this.f3738p);
            }
            switch (aVar.f3742a) {
                case 1:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, true);
                    this.f3479t.c1(fragment);
                    break;
                case 3:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.g(fragment);
                    break;
                case 4:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.n1(fragment);
                    break;
                case 5:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, true);
                    this.f3479t.C0(fragment);
                    break;
                case 6:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.k(fragment);
                    break;
                case 7:
                    fragment.s1(aVar.f3744c, aVar.f3745d, aVar.f3746e, aVar.f3747f);
                    this.f3479t.j1(fragment, true);
                    this.f3479t.x(fragment);
                    break;
                case 8:
                    this.f3479t.l1((Fragment) null);
                    break;
                case 9:
                    this.f3479t.l1(fragment);
                    break;
                case 10:
                    this.f3479t.k1(fragment, aVar.f3748g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3742a);
            }
            if (!this.f3740r && aVar.f3742a != 3 && fragment != null && !n.P) {
                this.f3479t.O0(fragment);
            }
        }
        if (!this.f3740r && z10 && !n.P) {
            n nVar = this.f3479t;
            nVar.P0(nVar.f3650q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f3725c.size()) {
            w.a aVar = this.f3725c.get(i10);
            int i11 = aVar.f3742a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f3743b;
                    int i12 = fragment3.f3442y;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f3442y == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3725c.add(i10, new w.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.f3744c = aVar.f3744c;
                                aVar2.f3746e = aVar.f3746e;
                                aVar2.f3745d = aVar.f3745d;
                                aVar2.f3747f = aVar.f3747f;
                                this.f3725c.add(i10, aVar2);
                                arrayList2.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3725c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3742a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f3743b);
                    Fragment fragment5 = aVar.f3743b;
                    if (fragment5 == fragment2) {
                        this.f3725c.add(i10, new w.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f3725c.add(i10, new w.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f3743b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f3743b);
            i10++;
        }
        return fragment2;
    }

    public String w() {
        return this.f3733k;
    }

    /* access modifiers changed from: package-private */
    public boolean x(int i10) {
        int size = this.f3725c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f3725c.get(i11).f3743b;
            int i12 = fragment != null ? fragment.f3442y : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean y(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f3725c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f3725c.get(i13).f3743b;
            int i14 = fragment != null ? fragment.f3442y : 0;
            if (!(i14 == 0 || i14 == i12)) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f3725c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f3725c.get(i16).f3743b;
                        if ((fragment2 != null ? fragment2.f3442y : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }
}
