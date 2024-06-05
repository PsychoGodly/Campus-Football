package n2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.c;
import k4.n0;
import n2.h;
import p3.x0;
import s6.u;

/* compiled from: Tracks */
public final class h4 implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final h4 f20422b = new h4(u.y());

    /* renamed from: c  reason: collision with root package name */
    private static final String f20423c = n0.r0(0);

    /* renamed from: d  reason: collision with root package name */
    public static final h.a<h4> f20424d = f4.f36389a;

    /* renamed from: a  reason: collision with root package name */
    private final u<a> f20425a;

    /* compiled from: Tracks */
    public static final class a implements h {

        /* renamed from: g  reason: collision with root package name */
        private static final String f20426g = n0.r0(0);

        /* renamed from: h  reason: collision with root package name */
        private static final String f20427h = n0.r0(1);

        /* renamed from: i  reason: collision with root package name */
        private static final String f20428i = n0.r0(3);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20429j = n0.r0(4);

        /* renamed from: k  reason: collision with root package name */
        public static final h.a<a> f20430k = g4.f36392a;

        /* renamed from: a  reason: collision with root package name */
        public final int f20431a;

        /* renamed from: b  reason: collision with root package name */
        private final x0 f20432b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f20433c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f20434d;

        /* renamed from: f  reason: collision with root package name */
        private final boolean[] f20435f;

        public a(x0 x0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = x0Var.f21688a;
            this.f20431a = i10;
            boolean z11 = false;
            k4.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f20432b = x0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f20433c = z11;
            this.f20434d = (int[]) iArr.clone();
            this.f20435f = (boolean[]) zArr.clone();
        }

        public x0 b() {
            return this.f20432b;
        }

        public r1 c(int i10) {
            return this.f20432b.b(i10);
        }

        public int d() {
            return this.f20432b.f21690c;
        }

        public boolean e() {
            return v6.a.b(this.f20435f, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20433c != aVar.f20433c || !this.f20432b.equals(aVar.f20432b) || !Arrays.equals(this.f20434d, aVar.f20434d) || !Arrays.equals(this.f20435f, aVar.f20435f)) {
                return false;
            }
            return true;
        }

        public boolean f(int i10) {
            return this.f20435f[i10];
        }

        public int hashCode() {
            return (((((this.f20432b.hashCode() * 31) + (this.f20433c ? 1 : 0)) * 31) + Arrays.hashCode(this.f20434d)) * 31) + Arrays.hashCode(this.f20435f);
        }
    }

    public h4(List<a> list) {
        this.f20425a = u.u(list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h4 d(Bundle bundle) {
        u<a> uVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f20423c);
        if (parcelableArrayList == null) {
            uVar = u.y();
        } else {
            uVar = c.b(a.f20430k, parcelableArrayList);
        }
        return new h4(uVar);
    }

    public u<a> b() {
        return this.f20425a;
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f20425a.size(); i11++) {
            a aVar = this.f20425a.get(i11);
            if (aVar.e() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h4.class != obj.getClass()) {
            return false;
        }
        return this.f20425a.equals(((h4) obj).f20425a);
    }

    public int hashCode() {
        return this.f20425a.hashCode();
    }
}
