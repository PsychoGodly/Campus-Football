package i4;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.u10;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import com.unity3d.services.core.device.MimeTypes;
import i4.a;
import i4.s;
import i4.u;
import i4.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k4.n0;
import k4.r;
import n2.c4;
import n2.h;
import n2.q;
import n2.q3;
import n2.r1;
import n2.s3;
import p3.x;
import p3.x0;
import p3.z0;
import r6.p;
import s6.n;
import s6.p0;
import s6.u;

/* compiled from: DefaultTrackSelector */
public class m extends u {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final p0<Integer> f18968k = p0.a(h.f33281a);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final p0<Integer> f18969l = p0.a(g.f33280a);

    /* renamed from: d  reason: collision with root package name */
    private final Object f18970d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f18971e;

    /* renamed from: f  reason: collision with root package name */
    private final s.b f18972f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18973g;

    /* renamed from: h  reason: collision with root package name */
    private d f18974h;

    /* renamed from: i  reason: collision with root package name */
    private f f18975i;

    /* renamed from: j  reason: collision with root package name */
    private p2.e f18976j;

    /* compiled from: DefaultTrackSelector */
    private static final class b extends h<b> implements Comparable<b> {

        /* renamed from: f  reason: collision with root package name */
        private final int f18977f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f18978g;

        /* renamed from: h  reason: collision with root package name */
        private final String f18979h = m.Q(this.f19044d.f20645c);

        /* renamed from: i  reason: collision with root package name */
        private final d f18980i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f18981j;

        /* renamed from: k  reason: collision with root package name */
        private final int f18982k;

        /* renamed from: l  reason: collision with root package name */
        private final int f18983l;

        /* renamed from: m  reason: collision with root package name */
        private final int f18984m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f18985n;

        /* renamed from: o  reason: collision with root package name */
        private final int f18986o;

        /* renamed from: p  reason: collision with root package name */
        private final int f18987p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f18988q;

        /* renamed from: r  reason: collision with root package name */
        private final int f18989r;

        /* renamed from: s  reason: collision with root package name */
        private final int f18990s;

        /* renamed from: t  reason: collision with root package name */
        private final int f18991t;

        /* renamed from: u  reason: collision with root package name */
        private final int f18992u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f18993v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f18994w;

        public b(int i10, x0 x0Var, int i11, d dVar, int i12, boolean z10, p<r1> pVar) {
            super(i10, x0Var, i11);
            int i13;
            int i14;
            int i15;
            this.f18980i = dVar;
            boolean z11 = false;
            this.f18981j = m.I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f19094o.size();
                i13 = a.e.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i16 = a.e.API_PRIORITY_OTHER;
                    i14 = 0;
                    break;
                }
                i14 = m.B(this.f19044d, dVar.f19094o.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f18983l = i16;
            this.f18982k = i14;
            this.f18984m = m.E(this.f19044d.f20647f, dVar.f19095p);
            r1 r1Var = this.f19044d;
            int i17 = r1Var.f20647f;
            this.f18985n = i17 == 0 || (i17 & 1) != 0;
            this.f18988q = (r1Var.f20646d & 1) != 0;
            int i18 = r1Var.f20667z;
            this.f18989r = i18;
            this.f18990s = r1Var.A;
            int i19 = r1Var.f20650i;
            this.f18991t = i19;
            this.f18978g = (i19 == -1 || i19 <= dVar.f19097r) && (i18 == -1 || i18 <= dVar.f19096q) && pVar.apply(r1Var);
            String[] g02 = n0.g0();
            int i20 = 0;
            while (true) {
                if (i20 >= g02.length) {
                    i20 = a.e.API_PRIORITY_OTHER;
                    i15 = 0;
                    break;
                }
                i15 = m.B(this.f19044d, g02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.f18986o = i20;
            this.f18987p = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f19098s.size()) {
                    String str = this.f19044d.f20654m;
                    if (str != null && str.equals(dVar.f19098s.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f18992u = i13;
            this.f18993v = q3.e(i12) == 128;
            this.f18994w = q3.g(i12) == 64 ? true : z11;
            this.f18977f = g(i12, z10);
        }

        public static int d(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static u<b> f(int i10, x0 x0Var, d dVar, int[] iArr, boolean z10, p<r1> pVar) {
            u.a p10 = u.p();
            x0 x0Var2 = x0Var;
            for (int i11 = 0; i11 < x0Var2.f21688a; i11++) {
                p10.a(new b(i10, x0Var, i11, dVar, iArr[i11], z10, pVar));
            }
            return p10.k();
        }

        private int g(int i10, boolean z10) {
            if (!m.I(i10, this.f18980i.f19014o0)) {
                return 0;
            }
            if (!this.f18978g && !this.f18980i.f19008i0) {
                return 0;
            }
            if (m.I(i10, false) && this.f18978g && this.f19044d.f20650i != -1) {
                d dVar = this.f18980i;
                return (dVar.f19104y || dVar.f19103x || (!dVar.f19016q0 && z10)) ? 1 : 2;
            }
        }

        public int a() {
            return this.f18977f;
        }

        /* renamed from: e */
        public int compareTo(b bVar) {
            p0 p0Var;
            if (!this.f18978g || !this.f18981j) {
                p0Var = m.f18968k.f();
            } else {
                p0Var = m.f18968k;
            }
            n f10 = n.j().g(this.f18981j, bVar.f18981j).f(Integer.valueOf(this.f18983l), Integer.valueOf(bVar.f18983l), p0.c().f()).d(this.f18982k, bVar.f18982k).d(this.f18984m, bVar.f18984m).g(this.f18988q, bVar.f18988q).g(this.f18985n, bVar.f18985n).f(Integer.valueOf(this.f18986o), Integer.valueOf(bVar.f18986o), p0.c().f()).d(this.f18987p, bVar.f18987p).g(this.f18978g, bVar.f18978g).f(Integer.valueOf(this.f18992u), Integer.valueOf(bVar.f18992u), p0.c().f()).f(Integer.valueOf(this.f18991t), Integer.valueOf(bVar.f18991t), this.f18980i.f19103x ? m.f18968k.f() : m.f18969l).g(this.f18993v, bVar.f18993v).g(this.f18994w, bVar.f18994w).f(Integer.valueOf(this.f18989r), Integer.valueOf(bVar.f18989r), p0Var).f(Integer.valueOf(this.f18990s), Integer.valueOf(bVar.f18990s), p0Var);
            Integer valueOf = Integer.valueOf(this.f18991t);
            Integer valueOf2 = Integer.valueOf(bVar.f18991t);
            if (!n0.c(this.f18979h, bVar.f18979h)) {
                p0Var = m.f18969l;
            }
            return f10.f(valueOf, valueOf2, p0Var).i();
        }

        /* renamed from: h */
        public boolean c(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f18980i;
            if ((dVar.f19011l0 || ((i11 = this.f19044d.f20667z) != -1 && i11 == bVar.f19044d.f20667z)) && (dVar.f19009j0 || ((str = this.f19044d.f20654m) != null && TextUtils.equals(str, bVar.f19044d.f20654m)))) {
                d dVar2 = this.f18980i;
                if ((dVar2.f19010k0 || ((i10 = this.f19044d.A) != -1 && i10 == bVar.f19044d.A)) && (dVar2.f19012m0 || (this.f18993v == bVar.f18993v && this.f18994w == bVar.f18994w))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultTrackSelector */
    private static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f18995a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f18996b;

        public c(r1 r1Var, int i10) {
            this.f18995a = (r1Var.f20646d & 1) == 0 ? false : true;
            this.f18996b = m.I(i10, false);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return n.j().g(this.f18996b, cVar.f18996b).g(this.f18995a, cVar.f18995a).i();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class d extends z {
        /* access modifiers changed from: private */
        public static final String A0 = n0.r0(1005);
        /* access modifiers changed from: private */
        public static final String B0 = n0.r0(1006);
        /* access modifiers changed from: private */
        public static final String C0 = n0.r0(1007);
        /* access modifiers changed from: private */
        public static final String D0 = n0.r0(1008);
        /* access modifiers changed from: private */
        public static final String E0 = n0.r0(1009);
        /* access modifiers changed from: private */
        public static final String F0 = n0.r0(1010);
        /* access modifiers changed from: private */
        public static final String G0 = n0.r0(1011);
        /* access modifiers changed from: private */
        public static final String H0 = n0.r0(1012);
        /* access modifiers changed from: private */
        public static final String I0 = n0.r0(1013);
        /* access modifiers changed from: private */
        public static final String J0 = n0.r0(1014);
        /* access modifiers changed from: private */
        public static final String K0 = n0.r0(1015);
        /* access modifiers changed from: private */
        public static final String L0 = n0.r0(1016);
        public static final h.a<d> M0 = n.f33286a;

        /* renamed from: t0  reason: collision with root package name */
        public static final d f18997t0;
        @Deprecated

        /* renamed from: u0  reason: collision with root package name */
        public static final d f18998u0;
        /* access modifiers changed from: private */

        /* renamed from: v0  reason: collision with root package name */
        public static final String f18999v0 = n0.r0(1000);
        /* access modifiers changed from: private */

        /* renamed from: w0  reason: collision with root package name */
        public static final String f19000w0 = n0.r0(AdError.NO_FILL_ERROR_CODE);
        /* access modifiers changed from: private */

        /* renamed from: x0  reason: collision with root package name */
        public static final String f19001x0 = n0.r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        /* access modifiers changed from: private */

        /* renamed from: y0  reason: collision with root package name */
        public static final String f19002y0 = n0.r0(1003);
        /* access modifiers changed from: private */

        /* renamed from: z0  reason: collision with root package name */
        public static final String f19003z0 = n0.r0(1004);

        /* renamed from: e0  reason: collision with root package name */
        public final boolean f19004e0;

        /* renamed from: f0  reason: collision with root package name */
        public final boolean f19005f0;

        /* renamed from: g0  reason: collision with root package name */
        public final boolean f19006g0;

        /* renamed from: h0  reason: collision with root package name */
        public final boolean f19007h0;

        /* renamed from: i0  reason: collision with root package name */
        public final boolean f19008i0;

        /* renamed from: j0  reason: collision with root package name */
        public final boolean f19009j0;

        /* renamed from: k0  reason: collision with root package name */
        public final boolean f19010k0;

        /* renamed from: l0  reason: collision with root package name */
        public final boolean f19011l0;

        /* renamed from: m0  reason: collision with root package name */
        public final boolean f19012m0;

        /* renamed from: n0  reason: collision with root package name */
        public final boolean f19013n0;

        /* renamed from: o0  reason: collision with root package name */
        public final boolean f19014o0;

        /* renamed from: p0  reason: collision with root package name */
        public final boolean f19015p0;

        /* renamed from: q0  reason: collision with root package name */
        public final boolean f19016q0;
        /* access modifiers changed from: private */

        /* renamed from: r0  reason: collision with root package name */
        public final SparseArray<Map<z0, e>> f19017r0;
        /* access modifiers changed from: private */

        /* renamed from: s0  reason: collision with root package name */
        public final SparseBooleanArray f19018s0;

        static {
            d X = new a().A();
            f18997t0 = X;
            f18998u0 = X;
        }

        private static boolean E(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean F(SparseArray<Map<z0, e>> sparseArray, SparseArray<Map<z0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !G(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean G(java.util.Map<p3.z0, i4.m.e> r4, java.util.Map<p3.z0, i4.m.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                p3.z0 r1 = (p3.z0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = k4.n0.c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.m.d.G(java.util.Map, java.util.Map):boolean");
        }

        public static d I(Context context) {
            return new a(context).A();
        }

        public a H() {
            return new a();
        }

        public boolean J(int i10) {
            return this.f19018s0.get(i10);
        }

        @Deprecated
        public e K(int i10, z0 z0Var) {
            Map map = this.f19017r0.get(i10);
            if (map != null) {
                return (e) map.get(z0Var);
            }
            return null;
        }

        @Deprecated
        public boolean L(int i10, z0 z0Var) {
            Map map = this.f19017r0.get(i10);
            return map != null && map.containsKey(z0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.f19004e0 == dVar.f19004e0 && this.f19005f0 == dVar.f19005f0 && this.f19006g0 == dVar.f19006g0 && this.f19007h0 == dVar.f19007h0 && this.f19008i0 == dVar.f19008i0 && this.f19009j0 == dVar.f19009j0 && this.f19010k0 == dVar.f19010k0 && this.f19011l0 == dVar.f19011l0 && this.f19012m0 == dVar.f19012m0 && this.f19013n0 == dVar.f19013n0 && this.f19014o0 == dVar.f19014o0 && this.f19015p0 == dVar.f19015p0 && this.f19016q0 == dVar.f19016q0 && E(this.f19018s0, dVar.f19018s0) && F(this.f19017r0, dVar.f19017r0)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f19004e0 ? 1 : 0)) * 31) + (this.f19005f0 ? 1 : 0)) * 31) + (this.f19006g0 ? 1 : 0)) * 31) + (this.f19007h0 ? 1 : 0)) * 31) + (this.f19008i0 ? 1 : 0)) * 31) + (this.f19009j0 ? 1 : 0)) * 31) + (this.f19010k0 ? 1 : 0)) * 31) + (this.f19011l0 ? 1 : 0)) * 31) + (this.f19012m0 ? 1 : 0)) * 31) + (this.f19013n0 ? 1 : 0)) * 31) + (this.f19014o0 ? 1 : 0)) * 31) + (this.f19015p0 ? 1 : 0)) * 31) + (this.f19016q0 ? 1 : 0);
        }

        /* compiled from: DefaultTrackSelector */
        public static final class a extends z.a {
            /* access modifiers changed from: private */
            public boolean A;
            /* access modifiers changed from: private */
            public boolean B;
            /* access modifiers changed from: private */
            public boolean C;
            /* access modifiers changed from: private */
            public boolean D;
            /* access modifiers changed from: private */
            public boolean E;
            /* access modifiers changed from: private */
            public boolean F;
            /* access modifiers changed from: private */
            public boolean G;
            /* access modifiers changed from: private */
            public boolean H;
            /* access modifiers changed from: private */
            public boolean I;
            /* access modifiers changed from: private */
            public boolean J;
            /* access modifiers changed from: private */
            public boolean K;
            /* access modifiers changed from: private */
            public boolean L;
            /* access modifiers changed from: private */
            public boolean M;
            /* access modifiers changed from: private */
            public final SparseArray<Map<z0, e>> N;
            /* access modifiers changed from: private */
            public final SparseBooleanArray O;

            private static SparseArray<Map<z0, e>> Y(SparseArray<Map<z0, e>> sparseArray) {
                SparseArray<Map<z0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int append : iArr) {
                    sparseBooleanArray.append(append, true);
                }
                return sparseBooleanArray;
            }

            private void q0(Bundle bundle) {
                u<z0> uVar;
                SparseArray<e> sparseArray;
                int[] intArray = bundle.getIntArray(d.F0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.G0);
                if (parcelableArrayList == null) {
                    uVar = u.y();
                } else {
                    uVar = k4.c.b(z0.f21695g, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.H0);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray<>();
                } else {
                    sparseArray = k4.c.c(e.f19022i, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == uVar.size()) {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        p0(intArray[i10], uVar.get(i10), sparseArray.get(i10));
                    }
                }
            }

            /* renamed from: X */
            public d A() {
                return new d(this);
            }

            /* access modifiers changed from: protected */
            public a b0(z zVar) {
                super.D(zVar);
                return this;
            }

            public a c0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a d0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a e0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.A = z10;
                return this;
            }

            /* renamed from: o0 */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            @Deprecated
            public a p0(int i10, z0 z0Var, e eVar) {
                Map map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap();
                    this.N.put(i10, map);
                }
                if (map.containsKey(z0Var) && n0.c(map.get(z0Var), eVar)) {
                    return this;
                }
                map.put(z0Var, eVar);
                return this;
            }

            public a r0(boolean z10) {
                this.L = z10;
                return this;
            }

            /* renamed from: s0 */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            /* renamed from: t0 */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            private a(d dVar) {
                super((z) dVar);
                this.A = dVar.f19004e0;
                this.B = dVar.f19005f0;
                this.C = dVar.f19006g0;
                this.D = dVar.f19007h0;
                this.E = dVar.f19008i0;
                this.F = dVar.f19009j0;
                this.G = dVar.f19010k0;
                this.H = dVar.f19011l0;
                this.I = dVar.f19012m0;
                this.J = dVar.f19013n0;
                this.K = dVar.f19014o0;
                this.L = dVar.f19015p0;
                this.M = dVar.f19016q0;
                this.N = Y(dVar.f19017r0);
                this.O = dVar.f19018s0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.f18997t0;
                n0(bundle.getBoolean(d.f18999v0, dVar.f19004e0));
                i0(bundle.getBoolean(d.f19000w0, dVar.f19005f0));
                j0(bundle.getBoolean(d.f19001x0, dVar.f19006g0));
                h0(bundle.getBoolean(d.J0, dVar.f19007h0));
                l0(bundle.getBoolean(d.f19002y0, dVar.f19008i0));
                e0(bundle.getBoolean(d.f19003z0, dVar.f19009j0));
                f0(bundle.getBoolean(d.A0, dVar.f19010k0));
                c0(bundle.getBoolean(d.B0, dVar.f19011l0));
                d0(bundle.getBoolean(d.K0, dVar.f19012m0));
                k0(bundle.getBoolean(d.L0, dVar.f19013n0));
                m0(bundle.getBoolean(d.C0, dVar.f19014o0));
                r0(bundle.getBoolean(d.D0, dVar.f19015p0));
                g0(bundle.getBoolean(d.E0, dVar.f19016q0));
                this.N = new SparseArray<>();
                q0(bundle);
                this.O = a0(bundle.getIntArray(d.I0));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.f19004e0 = aVar.A;
            this.f19005f0 = aVar.B;
            this.f19006g0 = aVar.C;
            this.f19007h0 = aVar.D;
            this.f19008i0 = aVar.E;
            this.f19009j0 = aVar.F;
            this.f19010k0 = aVar.G;
            this.f19011l0 = aVar.H;
            this.f19012m0 = aVar.I;
            this.f19013n0 = aVar.J;
            this.f19014o0 = aVar.K;
            this.f19015p0 = aVar.L;
            this.f19016q0 = aVar.M;
            this.f19017r0 = aVar.N;
            this.f19018s0 = aVar.O;
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class e implements n2.h {

        /* renamed from: f  reason: collision with root package name */
        private static final String f19019f = n0.r0(0);

        /* renamed from: g  reason: collision with root package name */
        private static final String f19020g = n0.r0(1);

        /* renamed from: h  reason: collision with root package name */
        private static final String f19021h = n0.r0(2);

        /* renamed from: i  reason: collision with root package name */
        public static final h.a<e> f19022i = o.f33287a;

        /* renamed from: a  reason: collision with root package name */
        public final int f19023a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f19024b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19025c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19026d;

        public e(int i10, int[] iArr, int i11) {
            this.f19023a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f19024b = copyOf;
            this.f19025c = iArr.length;
            this.f19026d = i11;
            Arrays.sort(copyOf);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ e b(Bundle bundle) {
            int i10 = bundle.getInt(f19019f, -1);
            int[] intArray = bundle.getIntArray(f19020g);
            int i11 = bundle.getInt(f19021h, -1);
            k4.a.a(i10 >= 0 && i11 >= 0);
            k4.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f19023a == eVar.f19023a && Arrays.equals(this.f19024b, eVar.f19024b) && this.f19026d == eVar.f19026d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f19023a * 31) + Arrays.hashCode(this.f19024b)) * 31) + this.f19026d;
        }
    }

    /* compiled from: DefaultTrackSelector */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f19027a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f19028b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f19029c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f19030d;

        /* compiled from: DefaultTrackSelector */
        class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f19031a;

            a(f fVar, m mVar) {
                this.f19031a = mVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f19031a.P();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f19031a.P();
            }
        }

        private f(Spatializer spatializer) {
            this.f19027a = spatializer;
            this.f19028b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(p2.e eVar, r1 r1Var) {
            int i10;
            if (!"audio/eac3-joc".equals(r1Var.f20654m) || r1Var.f20667z != 16) {
                i10 = r1Var.f20667z;
            } else {
                i10 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(n0.G(i10));
            int i11 = r1Var.A;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f19027a.canBeSpatialized(eVar.b().f21247a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f19030d == null && this.f19029c == null) {
                this.f19030d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f19029c = handler;
                Spatializer spatializer = this.f19027a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new u10(handler), this.f19030d);
            }
        }

        public boolean c() {
            return this.f19027a.isAvailable();
        }

        public boolean d() {
            return this.f19027a.isEnabled();
        }

        public boolean e() {
            return this.f19028b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f19030d;
            if (onSpatializerStateChangedListener != null && this.f19029c != null) {
                this.f19027a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
                ((Handler) n0.j(this.f19029c)).removeCallbacksAndMessages((Object) null);
                this.f19029c = null;
                this.f19030d = null;
            }
        }
    }

    /* compiled from: DefaultTrackSelector */
    private static final class g extends h<g> implements Comparable<g> {

        /* renamed from: f  reason: collision with root package name */
        private final int f19032f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f19033g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f19034h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f19035i;

        /* renamed from: j  reason: collision with root package name */
        private final int f19036j;

        /* renamed from: k  reason: collision with root package name */
        private final int f19037k;

        /* renamed from: l  reason: collision with root package name */
        private final int f19038l;

        /* renamed from: m  reason: collision with root package name */
        private final int f19039m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f19040n;

        public g(int i10, x0 x0Var, int i11, d dVar, int i12, String str) {
            super(i10, x0Var, i11);
            u<String> uVar;
            int i13;
            int i14 = 0;
            this.f19033g = m.I(i12, false);
            int i15 = this.f19044d.f20646d & (~dVar.f19101v);
            this.f19034h = (i15 & 1) != 0;
            this.f19035i = (i15 & 2) != 0;
            int i16 = a.e.API_PRIORITY_OTHER;
            if (dVar.f19099t.isEmpty()) {
                uVar = u.z(MaxReward.DEFAULT_LABEL);
            } else {
                uVar = dVar.f19099t;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= uVar.size()) {
                    i13 = 0;
                    break;
                }
                i13 = m.B(this.f19044d, uVar.get(i17), dVar.f19102w);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f19036j = i16;
            this.f19037k = i13;
            int t10 = m.E(this.f19044d.f20647f, dVar.f19100u);
            this.f19038l = t10;
            this.f19040n = (this.f19044d.f20647f & 1088) != 0;
            int B = m.B(this.f19044d, str, m.Q(str) == null);
            this.f19039m = B;
            boolean z10 = i13 > 0 || (dVar.f19099t.isEmpty() && t10 > 0) || this.f19034h || (this.f19035i && B > 0);
            if (m.I(i12, dVar.f19014o0) && z10) {
                i14 = 1;
            }
            this.f19032f = i14;
        }

        public static int d(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static u<g> f(int i10, x0 x0Var, d dVar, int[] iArr, String str) {
            u.a p10 = u.p();
            for (int i11 = 0; i11 < x0Var.f21688a; i11++) {
                p10.a(new g(i10, x0Var, i11, dVar, iArr[i11], str));
            }
            return p10.k();
        }

        public int a() {
            return this.f19032f;
        }

        /* renamed from: e */
        public int compareTo(g gVar) {
            n d10 = n.j().g(this.f19033g, gVar.f19033g).f(Integer.valueOf(this.f19036j), Integer.valueOf(gVar.f19036j), p0.c().f()).d(this.f19037k, gVar.f19037k).d(this.f19038l, gVar.f19038l).g(this.f19034h, gVar.f19034h).f(Boolean.valueOf(this.f19035i), Boolean.valueOf(gVar.f19035i), this.f19037k == 0 ? p0.c() : p0.c().f()).d(this.f19039m, gVar.f19039m);
            if (this.f19038l == 0) {
                d10 = d10.h(this.f19040n, gVar.f19040n);
            }
            return d10.i();
        }

        /* renamed from: g */
        public boolean c(g gVar) {
            return false;
        }
    }

    /* compiled from: DefaultTrackSelector */
    private static abstract class h<T extends h<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final int f19041a;

        /* renamed from: b  reason: collision with root package name */
        public final x0 f19042b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19043c;

        /* renamed from: d  reason: collision with root package name */
        public final r1 f19044d;

        /* compiled from: DefaultTrackSelector */
        public interface a<T extends h<T>> {
            List<T> a(int i10, x0 x0Var, int[] iArr);
        }

        public h(int i10, x0 x0Var, int i11) {
            this.f19041a = i10;
            this.f19042b = x0Var;
            this.f19043c = i11;
            this.f19044d = x0Var.b(i11);
        }

        public abstract int a();

        public abstract boolean c(T t10);
    }

    /* compiled from: DefaultTrackSelector */
    private static final class i extends h<i> {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f19045f;

        /* renamed from: g  reason: collision with root package name */
        private final d f19046g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f19047h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f19048i;

        /* renamed from: j  reason: collision with root package name */
        private final int f19049j;

        /* renamed from: k  reason: collision with root package name */
        private final int f19050k;

        /* renamed from: l  reason: collision with root package name */
        private final int f19051l;

        /* renamed from: m  reason: collision with root package name */
        private final int f19052m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f19053n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f19054o;

        /* renamed from: p  reason: collision with root package name */
        private final int f19055p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f19056q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f19057r;

        /* renamed from: s  reason: collision with root package name */
        private final int f19058s;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:65:0x00cc ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i(int r5, p3.x0 r6, int r7, i4.m.d r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f19046g = r8
                boolean r5 = r8.f19006g0
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f19005f0
                r7 = 1
                r0 = 0
                if (r6 == 0) goto L_0x001a
                r6 = r10 & r5
                if (r6 == 0) goto L_0x001a
                r6 = 1
                goto L_0x001b
            L_0x001a:
                r6 = 0
            L_0x001b:
                r4.f19054o = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                n2.r1 r1 = r4.f19044d
                int r2 = r1.f20659r
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f19081a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f20660s
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f19082b
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f20661t
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f19083c
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f20650i
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f19084d
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = 1
                goto L_0x004c
            L_0x004b:
                r1 = 0
            L_0x004c:
                r4.f19045f = r1
                if (r11 == 0) goto L_0x0079
                n2.r1 r11 = r4.f19044d
                int r1 = r11.f20659r
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f19085f
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f20660s
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f19086g
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f20661t
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x006f
                int r6 = r8.f19087h
                float r6 = (float) r6
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0079
            L_0x006f:
                int r6 = r11.f20650i
                if (r6 == r10) goto L_0x0077
                int r10 = r8.f19088i
                if (r6 < r10) goto L_0x0079
            L_0x0077:
                r6 = 1
                goto L_0x007a
            L_0x0079:
                r6 = 0
            L_0x007a:
                r4.f19047h = r6
                boolean r6 = i4.m.I(r9, r0)
                r4.f19048i = r6
                n2.r1 r6 = r4.f19044d
                int r10 = r6.f20650i
                r4.f19049j = r10
                int r6 = r6.f()
                r4.f19050k = r6
                n2.r1 r6 = r4.f19044d
                int r6 = r6.f20647f
                int r10 = r8.f19093n
                int r6 = i4.m.E(r6, r10)
                r4.f19052m = r6
                n2.r1 r6 = r4.f19044d
                int r6 = r6.f20647f
                if (r6 == 0) goto L_0x00a6
                r6 = r6 & r7
                if (r6 == 0) goto L_0x00a4
                goto L_0x00a6
            L_0x00a4:
                r6 = 0
                goto L_0x00a7
            L_0x00a6:
                r6 = 1
            L_0x00a7:
                r4.f19053n = r6
                r6 = 2147483647(0x7fffffff, float:NaN)
                r10 = 0
            L_0x00ad:
                s6.u<java.lang.String> r11 = r8.f19092m
                int r11 = r11.size()
                if (r10 >= r11) goto L_0x00cc
                n2.r1 r11 = r4.f19044d
                java.lang.String r11 = r11.f20654m
                if (r11 == 0) goto L_0x00c9
                s6.u<java.lang.String> r1 = r8.f19092m
                java.lang.Object r1 = r1.get(r10)
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto L_0x00c9
                r6 = r10
                goto L_0x00cc
            L_0x00c9:
                int r10 = r10 + 1
                goto L_0x00ad
            L_0x00cc:
                r4.f19051l = r6
                int r6 = n2.q3.e(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00d8
                r6 = 1
                goto L_0x00d9
            L_0x00d8:
                r6 = 0
            L_0x00d9:
                r4.f19056q = r6
                int r6 = n2.q3.g(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00e4
                goto L_0x00e5
            L_0x00e4:
                r7 = 0
            L_0x00e5:
                r4.f19057r = r7
                n2.r1 r6 = r4.f19044d
                java.lang.String r6 = r6.f20654m
                int r6 = i4.m.F(r6)
                r4.f19058s = r6
                int r5 = r4.j(r9, r5)
                r4.f19055p = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.m.i.<init>(int, p3.x0, int, i4.m$d, int, int, boolean):void");
        }

        /* access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            n g10 = n.j().g(iVar.f19048i, iVar2.f19048i).d(iVar.f19052m, iVar2.f19052m).g(iVar.f19053n, iVar2.f19053n).g(iVar.f19045f, iVar2.f19045f).g(iVar.f19047h, iVar2.f19047h).f(Integer.valueOf(iVar.f19051l), Integer.valueOf(iVar2.f19051l), p0.c().f()).g(iVar.f19056q, iVar2.f19056q).g(iVar.f19057r, iVar2.f19057r);
            if (iVar.f19056q && iVar.f19057r) {
                g10 = g10.d(iVar.f19058s, iVar2.f19058s);
            }
            return g10.i();
        }

        /* access modifiers changed from: private */
        public static int g(i iVar, i iVar2) {
            p0 p0Var;
            if (!iVar.f19045f || !iVar.f19048i) {
                p0Var = m.f18968k.f();
            } else {
                p0Var = m.f18968k;
            }
            return n.j().f(Integer.valueOf(iVar.f19049j), Integer.valueOf(iVar2.f19049j), iVar.f19046g.f19103x ? m.f18968k.f() : m.f18969l).f(Integer.valueOf(iVar.f19050k), Integer.valueOf(iVar2.f19050k), p0Var).f(Integer.valueOf(iVar.f19049j), Integer.valueOf(iVar2.f19049j), p0Var).i();
        }

        public static int h(List<i> list, List<i> list2) {
            return n.j().f((i) Collections.max(list, p.f33288a), (i) Collections.max(list2, p.f33288a), p.f33288a).d(list.size(), list2.size()).f((i) Collections.max(list, q.f33289a), (i) Collections.max(list2, q.f33289a), q.f33289a).i();
        }

        public static u<i> i(int i10, x0 x0Var, d dVar, int[] iArr, int i11) {
            x0 x0Var2 = x0Var;
            d dVar2 = dVar;
            int s10 = m.C(x0Var2, dVar2.f19089j, dVar2.f19090k, dVar2.f19091l);
            u.a p10 = u.p();
            for (int i12 = 0; i12 < x0Var2.f21688a; i12++) {
                int f10 = x0Var2.b(i12).f();
                p10.a(new i(i10, x0Var, i12, dVar, iArr[i12], i11, s10 == Integer.MAX_VALUE || (f10 != -1 && f10 <= s10)));
            }
            return p10.k();
        }

        private int j(int i10, int i11) {
            if ((this.f19044d.f20647f & 16384) != 0 || !m.I(i10, this.f19046g.f19014o0)) {
                return 0;
            }
            if (!this.f19045f && !this.f19046g.f19004e0) {
                return 0;
            }
            if (m.I(i10, false) && this.f19047h && this.f19045f && this.f19044d.f20650i != -1) {
                d dVar = this.f19046g;
                return (dVar.f19104y || dVar.f19103x || (i10 & i11) == 0) ? 1 : 2;
            }
        }

        public int a() {
            return this.f19055p;
        }

        /* renamed from: k */
        public boolean c(i iVar) {
            return (this.f19054o || n0.c(this.f19044d.f20654m, iVar.f19044d.f20654m)) && (this.f19046g.f19007h0 || (this.f19056q == iVar.f19056q && this.f19057r == iVar.f19057r));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    private static void A(z0 z0Var, z zVar, Map<Integer, x> map) {
        x xVar;
        for (int i10 = 0; i10 < z0Var.f21696a; i10++) {
            x xVar2 = zVar.f19105z.get(z0Var.b(i10));
            if (xVar2 != null && ((xVar = map.get(Integer.valueOf(xVar2.b()))) == null || (xVar.f19076b.isEmpty() && !xVar2.f19076b.isEmpty()))) {
                map.put(Integer.valueOf(xVar2.b()), xVar2);
            }
        }
    }

    protected static int B(r1 r1Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(r1Var.f20645c)) {
            return 4;
        }
        String Q = Q(str);
        String Q2 = Q(r1Var.f20645c);
        if (Q2 == null || Q == null) {
            if (!z10 || Q2 != null) {
                return 0;
            }
            return 1;
        } else if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
            return 3;
        } else {
            if (n0.S0(Q2, "-")[0].equals(n0.S0(Q, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static int C(x0 x0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = a.e.API_PRIORITY_OTHER;
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            for (int i14 = 0; i14 < x0Var.f21688a; i14++) {
                r1 b10 = x0Var.b(i14);
                int i15 = b10.f20659r;
                if (i15 > 0 && (i12 = b10.f20660s) > 0) {
                    Point D = D(z10, i10, i11, i15, i12);
                    int i16 = b10.f20659r;
                    int i17 = b10.f20660s;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (((float) D.x) * 0.98f)) && i17 >= ((int) (((float) D.y) * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = k4.n0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = k4.n0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* access modifiers changed from: private */
    public static int E(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    public boolean G(r1 r1Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f18970d) {
            if (this.f18974h.f19013n0 && !this.f18973g && r1Var.f20667z > 2 && (!H(r1Var) || (n0.f19738a >= 32 && (fVar2 = this.f18975i) != null && fVar2.e()))) {
                if (n0.f19738a < 32 || (fVar = this.f18975i) == null || !fVar.e() || !this.f18975i.c() || !this.f18975i.d() || !this.f18975i.a(this.f18976j, r1Var)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    private static boolean H(r1 r1Var) {
        String str = r1Var.f20654m;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean I(int i10, boolean z10) {
        int f10 = q3.f(i10);
        return f10 == 4 || (z10 && f10 == 3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z10, int i10, x0 x0Var, int[] iArr) {
        return b.f(i10, x0Var, dVar, iArr, z10, new l(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(u.a aVar, int[][][] iArr, s3[] s3VarArr, s[] sVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= aVar.d()) {
                z10 = true;
                break;
            }
            int e10 = aVar.e(i10);
            s sVar = sVarArr[i10];
            if ((e10 == 1 || e10 == 2) && sVar != null && R(iArr[i10], aVar.f(i10), sVar)) {
                if (e10 == 1) {
                    if (i12 != -1) {
                        break;
                    }
                    i12 = i10;
                } else if (i11 != -1) {
                    break;
                } else {
                    i11 = i10;
                }
            }
            i10++;
        }
        z10 = false;
        if (!(i12 == -1 || i11 == -1)) {
            z11 = true;
        }
        if (z10 && z11) {
            s3 s3Var = new s3(true);
            s3VarArr[i12] = s3Var;
            s3VarArr[i11] = s3Var;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.f18975i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18970d
            monitor-enter(r0)
            i4.m$d r1 = r3.f18974h     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.f19013n0     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r3.f18973g     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x001f
            int r1 = k4.n0.f19738a     // Catch:{ all -> 0x0027 }
            r2 = 32
            if (r1 < r2) goto L_0x001f
            i4.m$f r1 = r3.f18975i     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.e()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0026
            r3.c()
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.m.P():void");
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, z0 z0Var, s sVar) {
        if (sVar == null) {
            return false;
        }
        int c10 = z0Var.c(sVar.a());
        for (int i10 = 0; i10 < sVar.length(); i10++) {
            if (q3.h(iArr[c10][sVar.l(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<s.a, Integer> W(int i10, u.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        Object obj;
        u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                z0 f10 = aVar3.f(i12);
                int i13 = 0;
                while (i13 < f10.f21696a) {
                    x0 b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f21688a];
                    int i14 = 0;
                    while (i14 < b10.f21688a) {
                        h hVar = (h) a10.get(i14);
                        int a11 = hVar.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                obj = s6.u.z(hVar);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i15 = i14 + 1;
                                while (i15 < b10.f21688a) {
                                    h hVar2 = (h) a10.get(i15);
                                    int i16 = d10;
                                    if (hVar2.a() == 2 && hVar.c(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    u.a aVar4 = aVar;
                                    d10 = i16;
                                }
                                i11 = d10;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i14++;
                        u.a aVar5 = aVar;
                        d10 = i11;
                    }
                    int i17 = d10;
                    i13++;
                    u.a aVar6 = aVar;
                }
            }
            h.a<T> aVar7 = aVar2;
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((h) list.get(i18)).f19043c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new s.a(hVar3.f19042b, iArr2), Integer.valueOf(hVar3.f19041a));
    }

    private static void y(u.a aVar, d dVar, s.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            z0 f10 = aVar.f(i10);
            if (dVar.L(i10, f10)) {
                e K = dVar.K(i10, f10);
                aVarArr[i10] = (K == null || K.f19024b.length == 0) ? null : new s.a(f10.b(K.f19023a), K.f19024b, K.f19026d);
            }
        }
    }

    private static void z(u.a aVar, z zVar, s.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), zVar, hashMap);
        }
        A(aVar.h(), zVar, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            x xVar = (x) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (xVar != null) {
                aVarArr[i11] = (xVar.f19076b.isEmpty() || aVar.f(i11).c(xVar.f19075a) == -1) ? null : new s.a(xVar.f19075a, v6.e.l(xVar.f19076b));
            }
        }
    }

    /* access modifiers changed from: protected */
    public s.a[] S(u.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws q {
        String str;
        int d10 = aVar.d();
        s.a[] aVarArr = new s.a[d10];
        Pair<s.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (s.a) X.first;
        }
        Pair<s.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (s.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((s.a) obj).f19059a.b(((s.a) obj).f19060b[0]).f20645c;
        }
        Pair<s.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (s.a) V.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (!(e10 == 2 || e10 == 1 || e10 == 3)) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    public Pair<s.a, Integer> T(u.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws q {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f21696a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new f(this, dVar, z10), i.f33282a);
    }

    /* access modifiers changed from: protected */
    public s.a U(int i10, z0 z0Var, int[][] iArr, d dVar) throws q {
        x0 x0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < z0Var.f21696a; i12++) {
            x0 b10 = z0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f21688a; i13++) {
                if (I(iArr2[i13], dVar.f19014o0)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        x0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (x0Var == null) {
            return null;
        }
        return new s.a(x0Var, i11);
    }

    /* access modifiers changed from: protected */
    public Pair<s.a, Integer> V(u.a aVar, int[][][] iArr, d dVar, String str) throws q {
        return W(3, aVar, iArr, new d(dVar, str), j.f33283a);
    }

    /* access modifiers changed from: protected */
    public Pair<s.a, Integer> X(u.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws q {
        return W(2, aVar, iArr, new e(dVar, iArr2), k.f33284a);
    }

    public boolean d() {
        return true;
    }

    public void f() {
        f fVar;
        synchronized (this.f18970d) {
            if (n0.f19738a >= 32 && (fVar = this.f18975i) != null) {
                fVar.f();
            }
        }
        super.f();
    }

    public void h(p2.e eVar) {
        boolean z10;
        synchronized (this.f18970d) {
            z10 = !this.f18976j.equals(eVar);
            this.f18976j = eVar;
        }
        if (z10) {
            P();
        }
    }

    /* access modifiers changed from: protected */
    public final Pair<s3[], s[]> l(u.a aVar, int[][][] iArr, int[] iArr2, x.b bVar, c4 c4Var) throws q {
        d dVar;
        f fVar;
        synchronized (this.f18970d) {
            dVar = this.f18974h;
            if (dVar.f19013n0 && n0.f19738a >= 32 && (fVar = this.f18975i) != null) {
                fVar.b(this, (Looper) k4.a.h(Looper.myLooper()));
            }
        }
        int d10 = aVar.d();
        s.a[] S = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S);
        y(aVar, dVar, S);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (dVar.J(i10) || dVar.A.contains(Integer.valueOf(e10))) {
                S[i10] = null;
            }
        }
        s[] a10 = this.f18972f.a(S, a(), bVar, c4Var);
        s3[] s3VarArr = new s3[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            boolean z10 = true;
            if ((dVar.J(i11) || dVar.A.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                z10 = false;
            }
            s3VarArr[i11] = z10 ? s3.f20722b : null;
        }
        if (dVar.f19015p0) {
            O(aVar, iArr, s3VarArr, a10);
        }
        return Pair.create(s3VarArr, a10);
    }

    public m(Context context, s.b bVar) {
        this(context, (z) d.I(context), bVar);
    }

    public m(Context context, z zVar, s.b bVar) {
        this(zVar, bVar, context);
    }

    private m(z zVar, s.b bVar, Context context) {
        this.f18970d = new Object();
        this.f18971e = context != null ? context.getApplicationContext() : null;
        this.f18972f = bVar;
        if (zVar instanceof d) {
            this.f18974h = (d) zVar;
        } else {
            this.f18974h = (context == null ? d.f18997t0 : d.I(context)).H().b0(zVar).A();
        }
        this.f18976j = p2.e.f21234h;
        boolean z10 = context != null && n0.x0(context);
        this.f18973g = z10;
        if (!z10 && context != null && n0.f19738a >= 32) {
            this.f18975i = f.g(context);
        }
        if (this.f18974h.f19013n0 && context == null) {
            r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
