package p3;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import k4.a;
import k4.c;
import k4.n0;
import k4.r;
import k4.v;
import n2.h;
import n2.r1;
import s6.u;

/* compiled from: TrackGroup */
public final class x0 implements h {

    /* renamed from: g  reason: collision with root package name */
    private static final String f21685g = n0.r0(0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f21686h = n0.r0(1);

    /* renamed from: i  reason: collision with root package name */
    public static final h.a<x0> f21687i = w0.f36871a;

    /* renamed from: a  reason: collision with root package name */
    public final int f21688a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21689b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21690c;

    /* renamed from: d  reason: collision with root package name */
    private final r1[] f21691d;

    /* renamed from: f  reason: collision with root package name */
    private int f21692f;

    public x0(r1... r1VarArr) {
        this(MaxReward.DEFAULT_LABEL, r1VarArr);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ x0 d(Bundle bundle) {
        u<r1> uVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f21685g);
        if (parcelableArrayList == null) {
            uVar = u.y();
        } else {
            uVar = c.b(r1.f20642q0, parcelableArrayList);
        }
        return new x0(bundle.getString(f21686h, MaxReward.DEFAULT_LABEL), (r1[]) uVar.toArray(new r1[0]));
    }

    private static void e(String str, String str2, String str3, int i10) {
        r.d("TrackGroup", MaxReward.DEFAULT_LABEL, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? MaxReward.DEFAULT_LABEL : str;
    }

    private static int g(int i10) {
        return i10 | 16384;
    }

    private void h() {
        String f10 = f(this.f21691d[0].f20645c);
        int g10 = g(this.f21691d[0].f20647f);
        int i10 = 1;
        while (true) {
            r1[] r1VarArr = this.f21691d;
            if (i10 >= r1VarArr.length) {
                return;
            }
            if (!f10.equals(f(r1VarArr[i10].f20645c))) {
                r1[] r1VarArr2 = this.f21691d;
                e("languages", r1VarArr2[0].f20645c, r1VarArr2[i10].f20645c, i10);
                return;
            } else if (g10 != g(this.f21691d[i10].f20647f)) {
                e("role flags", Integer.toBinaryString(this.f21691d[0].f20647f), Integer.toBinaryString(this.f21691d[i10].f20647f), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public r1 b(int i10) {
        return this.f21691d[i10];
    }

    public int c(r1 r1Var) {
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.f21691d;
            if (i10 >= r1VarArr.length) {
                return -1;
            }
            if (r1Var == r1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (!this.f21689b.equals(x0Var.f21689b) || !Arrays.equals(this.f21691d, x0Var.f21691d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f21692f == 0) {
            this.f21692f = ((527 + this.f21689b.hashCode()) * 31) + Arrays.hashCode(this.f21691d);
        }
        return this.f21692f;
    }

    public x0(String str, r1... r1VarArr) {
        a.a(r1VarArr.length > 0);
        this.f21689b = str;
        this.f21691d = r1VarArr;
        this.f21688a = r1VarArr.length;
        int k10 = v.k(r1VarArr[0].f20654m);
        this.f21690c = k10 == -1 ? v.k(r1VarArr[0].f20653l) : k10;
        h();
    }
}
