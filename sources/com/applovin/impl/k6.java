package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.f8;
import com.applovin.impl.i0;
import com.applovin.impl.m2;
import com.applovin.impl.oc;
import com.applovin.impl.vo;
import com.applovin.impl.wd;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class k6 extends oc {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f8873f = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final tg f8874g = tg.a((Comparator) ny.f10034a);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final tg f8875h = tg.a((Comparator) oy.f10549a);

    /* renamed from: d  reason: collision with root package name */
    private final f8.b f8876d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference f8877e;

    protected static final class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f8878a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8879b;

        /* renamed from: c  reason: collision with root package name */
        private final d f8880c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8881d;

        /* renamed from: f  reason: collision with root package name */
        private final int f8882f;

        /* renamed from: g  reason: collision with root package name */
        private final int f8883g;

        /* renamed from: h  reason: collision with root package name */
        private final int f8884h;

        /* renamed from: i  reason: collision with root package name */
        private final int f8885i;

        /* renamed from: j  reason: collision with root package name */
        private final int f8886j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f8887k;

        /* renamed from: l  reason: collision with root package name */
        private final int f8888l;

        /* renamed from: m  reason: collision with root package name */
        private final int f8889m;

        /* renamed from: n  reason: collision with root package name */
        private final int f8890n;

        /* renamed from: o  reason: collision with root package name */
        private final int f8891o;

        public b(d9 d9Var, d dVar, int i10) {
            int i11;
            int i12;
            int i13;
            this.f8880c = dVar;
            this.f8879b = k6.a(d9Var.f7144c);
            int i14 = 0;
            this.f8881d = k6.a(i10, false);
            int i15 = 0;
            while (true) {
                int size = dVar.f12837n.size();
                i11 = a.e.API_PRIORITY_OTHER;
                if (i15 >= size) {
                    i15 = a.e.API_PRIORITY_OTHER;
                    i12 = 0;
                    break;
                }
                i12 = k6.a(d9Var, (String) dVar.f12837n.get(i15), false);
                if (i12 > 0) {
                    break;
                }
                i15++;
            }
            this.f8883g = i15;
            this.f8882f = i12;
            this.f8884h = Integer.bitCount(d9Var.f7146f & dVar.f12838o);
            boolean z10 = true;
            this.f8887k = (d9Var.f7145d & 1) != 0;
            int i16 = d9Var.f7166z;
            this.f8888l = i16;
            this.f8889m = d9Var.A;
            int i17 = d9Var.f7149i;
            this.f8890n = i17;
            if ((i17 != -1 && i17 > dVar.f12840q) || (i16 != -1 && i16 > dVar.f12839p)) {
                z10 = false;
            }
            this.f8878a = z10;
            String[] e10 = yp.e();
            int i18 = 0;
            while (true) {
                if (i18 >= e10.length) {
                    i18 = a.e.API_PRIORITY_OTHER;
                    i13 = 0;
                    break;
                }
                i13 = k6.a(d9Var, e10[i18], false);
                if (i13 > 0) {
                    break;
                }
                i18++;
            }
            this.f8885i = i18;
            this.f8886j = i13;
            while (true) {
                if (i14 < dVar.f12841r.size()) {
                    String str = d9Var.f7153m;
                    if (str != null && str.equals(dVar.f12841r.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.f8891o = i11;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            tg tgVar;
            if (!this.f8878a || !this.f8881d) {
                tgVar = k6.f8874g.c();
            } else {
                tgVar = k6.f8874g;
            }
            w3 a10 = w3.e().a(this.f8881d, bVar.f8881d).a(Integer.valueOf(this.f8883g), Integer.valueOf(bVar.f8883g), tg.a().c()).a(this.f8882f, bVar.f8882f).a(this.f8884h, bVar.f8884h).a(this.f8878a, bVar.f8878a).a(Integer.valueOf(this.f8891o), Integer.valueOf(bVar.f8891o), tg.a().c()).a(Integer.valueOf(this.f8890n), Integer.valueOf(bVar.f8890n), this.f8880c.f12845v ? k6.f8874g.c() : k6.f8875h).a(this.f8887k, bVar.f8887k).a(Integer.valueOf(this.f8885i), Integer.valueOf(bVar.f8885i), tg.a().c()).a(this.f8886j, bVar.f8886j).a(Integer.valueOf(this.f8888l), Integer.valueOf(bVar.f8888l), tgVar).a(Integer.valueOf(this.f8889m), Integer.valueOf(bVar.f8889m), tgVar);
            Integer valueOf = Integer.valueOf(this.f8890n);
            Integer valueOf2 = Integer.valueOf(bVar.f8890n);
            if (!yp.a((Object) this.f8879b, (Object) bVar.f8879b)) {
                tgVar = k6.f8875h;
            }
            return a10.a(valueOf, valueOf2, tgVar).d();
        }
    }

    protected static final class c implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f8892a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8893b;

        public c(d9 d9Var, int i10) {
            this.f8892a = (d9Var.f7145d & 1) == 0 ? false : true;
            this.f8893b = k6.a(i10, false);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return w3.e().a(this.f8893b, cVar.f8893b).a(this.f8892a, cVar.f8892a).d();
        }
    }

    public static final class e extends vo.a {
        /* access modifiers changed from: private */
        public boolean A;
        /* access modifiers changed from: private */
        public boolean B;
        /* access modifiers changed from: private */
        public boolean C;
        /* access modifiers changed from: private */
        public boolean D;
        /* access modifiers changed from: private */
        public int E;
        /* access modifiers changed from: private */
        public boolean F;
        /* access modifiers changed from: private */
        public boolean G;
        /* access modifiers changed from: private */
        public boolean H;
        /* access modifiers changed from: private */
        public final SparseArray I;
        /* access modifiers changed from: private */
        public final SparseBooleanArray J;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f8894x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f8895y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public boolean f8896z;

        public e() {
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        private void c() {
            this.f8894x = true;
            this.f8895y = false;
            this.f8896z = true;
            this.A = true;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = 0;
            this.F = true;
            this.G = false;
            this.H = true;
        }

        public e b(boolean z10) {
            this.B = z10;
            return this;
        }

        public e d(boolean z10) {
            this.H = z10;
            return this;
        }

        public e e(boolean z10) {
            this.f8895y = z10;
            return this;
        }

        public e f(boolean z10) {
            this.f8896z = z10;
            return this;
        }

        public e g(boolean z10) {
            this.A = z10;
            return this;
        }

        public e h(boolean z10) {
            this.F = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f8894x = z10;
            return this;
        }

        public e j(boolean z10) {
            this.G = z10;
            return this;
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int append : iArr) {
                sparseBooleanArray.append(append, true);
            }
            return sparseBooleanArray;
        }

        /* renamed from: b */
        public e a(int i10, int i11, boolean z10) {
            super.a(i10, i11, z10);
            return this;
        }

        /* renamed from: b */
        public e a(Context context, boolean z10) {
            super.a(context, z10);
            return this;
        }

        public e(Context context) {
            super(context);
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        /* renamed from: b */
        public d a() {
            return new d(this);
        }

        public e a(boolean z10) {
            this.D = z10;
            return this;
        }

        public e a(int i10) {
            this.E = i10;
            return this;
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            i(bundle.getBoolean(d.b(1000), dVar.C));
            e(bundle.getBoolean(d.b((int) AdError.NO_FILL_ERROR_CODE), dVar.D));
            f(bundle.getBoolean(d.b((int) AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE), dVar.E));
            g(bundle.getBoolean(d.b(1003), dVar.F));
            b(bundle.getBoolean(d.b(1004), dVar.G));
            c(bundle.getBoolean(d.b(1005), dVar.H));
            a(bundle.getBoolean(d.b(1006), dVar.I));
            a(bundle.getInt(d.b(1007), dVar.B));
            h(bundle.getBoolean(d.b(1008), dVar.J));
            j(bundle.getBoolean(d.b(1009), dVar.K));
            d(bundle.getBoolean(d.b(1010), dVar.L));
            this.I = new SparseArray();
            a(bundle);
            this.J = a(bundle.getIntArray(d.b(1014)));
        }

        public final e a(int i10, qo qoVar, f fVar) {
            Map map = (Map) this.I.get(i10);
            if (map == null) {
                map = new HashMap();
                this.I.put(i10, map);
            }
            if (map.containsKey(qoVar) && yp.a(map.get(qoVar), (Object) fVar)) {
                return this;
            }
            map.put(qoVar, fVar);
            return this;
        }

        public e c(boolean z10) {
            this.C = z10;
            return this;
        }

        /* renamed from: c */
        public e a(Context context) {
            super.a(context);
            return this;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.b(1011));
            List a10 = n2.a(qo.f11065f, (List) bundle.getParcelableArrayList(d.b(1012)), (List) ab.h());
            SparseArray a11 = n2.a(f.f8897f, bundle.getSparseParcelableArray(d.b(1013)), new SparseArray());
            if (intArray != null && intArray.length == a10.size()) {
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    a(intArray[i10], (qo) a10.get(i10), (f) a11.get(i10));
                }
            }
        }
    }

    public static final class f implements m2 {

        /* renamed from: f  reason: collision with root package name */
        public static final m2.a f8897f = qy.f11087a;

        /* renamed from: a  reason: collision with root package name */
        public final int f8898a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f8899b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8900c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8901d;

        public f(int i10, int[] iArr, int i11) {
            this.f8898a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8899b = copyOf;
            this.f8900c = iArr.length;
            this.f8901d = i11;
            Arrays.sort(copyOf);
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f8898a == fVar.f8898a && Arrays.equals(this.f8899b, fVar.f8899b) && this.f8901d == fVar.f8901d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f8898a * 31) + Arrays.hashCode(this.f8899b)) * 31) + this.f8901d;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ f a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i11 = bundle.getInt(a(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            a1.a(z10);
            a1.a((Object) intArray);
            return new f(i10, intArray, i11);
        }
    }

    protected static final class g implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f8902a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8903b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8904c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8905d;

        /* renamed from: f  reason: collision with root package name */
        private final int f8906f;

        /* renamed from: g  reason: collision with root package name */
        private final int f8907g;

        /* renamed from: h  reason: collision with root package name */
        private final int f8908h;

        /* renamed from: i  reason: collision with root package name */
        private final int f8909i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f8910j;

        public g(d9 d9Var, d dVar, int i10, String str) {
            ab abVar;
            int i11;
            boolean z10 = false;
            this.f8903b = k6.a(i10, false);
            int i12 = d9Var.f7145d & (~dVar.B);
            this.f8904c = (i12 & 1) != 0;
            this.f8905d = (i12 & 2) != 0;
            int i13 = a.e.API_PRIORITY_OTHER;
            if (dVar.f12842s.isEmpty()) {
                abVar = ab.a((Object) MaxReward.DEFAULT_LABEL);
            } else {
                abVar = dVar.f12842s;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= abVar.size()) {
                    i11 = 0;
                    break;
                }
                i11 = k6.a(d9Var, (String) abVar.get(i14), dVar.f12844u);
                if (i11 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.f8906f = i13;
            this.f8907g = i11;
            int bitCount = Integer.bitCount(d9Var.f7146f & dVar.f12843t);
            this.f8908h = bitCount;
            this.f8910j = (d9Var.f7146f & 1088) != 0;
            int a10 = k6.a(d9Var, str, k6.a(str) == null);
            this.f8909i = a10;
            if (i11 > 0 || ((dVar.f12842s.isEmpty() && bitCount > 0) || this.f8904c || (this.f8905d && a10 > 0))) {
                z10 = true;
            }
            this.f8902a = z10;
        }

        /* renamed from: a */
        public int compareTo(g gVar) {
            w3 a10 = w3.e().a(this.f8903b, gVar.f8903b).a(Integer.valueOf(this.f8906f), Integer.valueOf(gVar.f8906f), tg.a().c()).a(this.f8907g, gVar.f8907g).a(this.f8908h, gVar.f8908h).a(this.f8904c, gVar.f8904c).a(Boolean.valueOf(this.f8905d), Boolean.valueOf(gVar.f8905d), this.f8907g == 0 ? tg.a() : tg.a().c()).a(this.f8909i, gVar.f8909i);
            if (this.f8908h == 0) {
                a10 = a10.b(this.f8910j, gVar.f8910j);
            }
            return a10.d();
        }
    }

    protected static final class h implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f8911a;

        /* renamed from: b  reason: collision with root package name */
        private final d f8912b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8913c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8914d;

        /* renamed from: f  reason: collision with root package name */
        private final int f8915f;

        /* renamed from: g  reason: collision with root package name */
        private final int f8916g;

        /* renamed from: h  reason: collision with root package name */
        private final int f8917h;

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
            if (r10 < ((float) r8.f12831h)) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.f12832i) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(com.applovin.impl.d9 r7, com.applovin.impl.k6.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f8912b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f7158r
                if (r4 == r3) goto L_0x0014
                int r5 = r8.f12825a
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f7159s
                if (r4 == r3) goto L_0x001c
                int r5 = r8.f12826b
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.f7160t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f12827c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f7149i
                if (r4 == r3) goto L_0x0031
                int r5 = r8.f12828d
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                r6.f8911a = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f7158r
                if (r10 == r3) goto L_0x0040
                int r4 = r8.f12829f
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f7159s
                if (r10 == r3) goto L_0x0048
                int r4 = r8.f12830g
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.f7160t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0055
                int r0 = r8.f12831h
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f7149i
                if (r10 == r3) goto L_0x005f
                int r0 = r8.f12832i
                if (r10 < r0) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                r6.f8913c = r1
                boolean r9 = com.applovin.impl.k6.a((int) r9, (boolean) r2)
                r6.f8914d = r9
                int r9 = r7.f7149i
                r6.f8915f = r9
                int r9 = r7.b()
                r6.f8916g = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x0074:
                com.applovin.impl.ab r10 = r8.f12836m
                int r10 = r10.size()
                if (r2 >= r10) goto L_0x0091
                java.lang.String r10 = r7.f7153m
                if (r10 == 0) goto L_0x008e
                com.applovin.impl.ab r0 = r8.f12836m
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x008e
                r9 = r2
                goto L_0x0091
            L_0x008e:
                int r2 = r2 + 1
                goto L_0x0074
            L_0x0091:
                r6.f8917h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.h.<init>(com.applovin.impl.d9, com.applovin.impl.k6$d, int, boolean):void");
        }

        /* renamed from: a */
        public int compareTo(h hVar) {
            tg tgVar;
            if (!this.f8911a || !this.f8914d) {
                tgVar = k6.f8874g.c();
            } else {
                tgVar = k6.f8874g;
            }
            return w3.e().a(this.f8914d, hVar.f8914d).a(this.f8911a, hVar.f8911a).a(this.f8913c, hVar.f8913c).a(Integer.valueOf(this.f8917h), Integer.valueOf(hVar.f8917h), tg.a().c()).a(Integer.valueOf(this.f8915f), Integer.valueOf(hVar.f8915f), this.f8912b.f12845v ? k6.f8874g.c() : k6.f8875h).a(Integer.valueOf(this.f8916g), Integer.valueOf(hVar.f8916g), tgVar).a(Integer.valueOf(this.f8915f), Integer.valueOf(hVar.f8915f), tgVar).d();
        }
    }

    public k6(Context context) {
        this(context, (f8.b) new i0.b());
    }

    private static void a(po poVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List list) {
        List list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            if (!a(poVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list2.remove(size);
            }
        }
    }

    private static int b(po poVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int intValue = ((Integer) list.get(i20)).intValue();
            if (a(poVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public boolean b() {
        return true;
    }

    public k6(Context context, f8.b bVar) {
        this(d.a(context), bVar);
    }

    public static final class d extends vo {
        public static final d O;
        public static final d P;
        public static final m2.a Q = py.f10763a;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        private final SparseArray M;
        private final SparseBooleanArray N;

        static {
            d b10 = new e().a();
            O = b10;
            P = b10;
        }

        private d(e eVar) {
            super(eVar);
            this.C = eVar.f8894x;
            this.D = eVar.f8895y;
            this.E = eVar.f8896z;
            this.F = eVar.A;
            this.G = eVar.B;
            this.H = eVar.C;
            this.I = eVar.D;
            this.B = eVar.E;
            this.J = eVar.F;
            this.K = eVar.G;
            this.L = eVar.H;
            this.M = eVar.I;
            this.N = eVar.J;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        public final boolean b(int i10, qo qoVar) {
            Map map = (Map) this.M.get(i10);
            return map != null && map.containsKey(qoVar);
        }

        public final boolean d(int i10) {
            return this.N.get(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        private static boolean a(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !a((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(java.util.Map r4, java.util.Map r5) {
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
                com.applovin.impl.qo r1 = (com.applovin.impl.qo) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.applovin.impl.yp.a((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.d.a(java.util.Map, java.util.Map):boolean");
        }

        public final f a(int i10, qo qoVar) {
            Map map = (Map) this.M.get(i10);
            if (map != null) {
                return (f) map.get(qoVar);
            }
            return null;
        }

        public static d a(Context context) {
            return new e(context).a();
        }
    }

    public k6(d dVar, f8.b bVar) {
        this.f8876d = bVar;
        this.f8877e = new AtomicReference(dVar);
    }

    /* access modifiers changed from: protected */
    public f8.a b(qo qoVar, int[][] iArr, int i10, d dVar, boolean z10) {
        f8.a a10 = (dVar.f12846w || dVar.f12845v || !z10) ? null : a(qoVar, iArr, i10, dVar);
        return a10 == null ? a(qoVar, iArr, dVar) : a10;
    }

    private static int[] a(po poVar, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        po poVar2 = poVar;
        int i12 = i10;
        d9 a10 = poVar.a(i10);
        int[] iArr2 = new int[poVar2.f10688a];
        int i13 = 0;
        for (int i14 = 0; i14 < poVar2.f10688a; i14++) {
            if (i14 == i12 || a(poVar.a(i14), iArr[i14], a10, i11, z10, z11, z12)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return Arrays.copyOf(iArr2, i13);
    }

    private static int[] a(po poVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        HashSet hashSet;
        int i21;
        int i22;
        po poVar2 = poVar;
        if (poVar2.f10688a < 2) {
            return f8873f;
        }
        List a10 = a(poVar2, i19, i20, z11);
        if (a10.size() < 2) {
            return f8873f;
        }
        if (!z10) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < a10.size()) {
                String str3 = poVar2.a(((Integer) a10.get(i24)).intValue()).f7153m;
                if (hashSet2.add(str3)) {
                    String str4 = str3;
                    i22 = i23;
                    i21 = i24;
                    hashSet = hashSet2;
                    int b10 = b(poVar, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, a10);
                    if (b10 > i22) {
                        i23 = b10;
                        str2 = str4;
                        i24 = i21 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i22 = i23;
                    i21 = i24;
                    hashSet = hashSet2;
                }
                i23 = i22;
                i24 = i21 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        a(poVar, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, a10);
        return a10.size() < 2 ? f8873f : pb.a((Collection) a10);
    }

    protected static int a(d9 d9Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(d9Var.f7144c)) {
            return 4;
        }
        String a10 = a(str);
        String a11 = a(d9Var.f7144c);
        if (a11 == null || a10 == null) {
            if (!z10 || a11 != null) {
                return 0;
            }
            return 1;
        } else if (a11.startsWith(a10) || a10.startsWith(a11)) {
            return 3;
        } else {
            if (yp.b(a11, "-")[0].equals(yp.b(a10, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
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
            int r4 = com.applovin.impl.yp.a((int) r0, (int) r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.impl.yp.a((int) r3, (int) r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(boolean, int, int, int, int):android.graphics.Point");
    }

    protected static boolean a(int i10, boolean z10) {
        int d10 = hz.d(i10);
        return d10 == 4 || (z10 && d10 == 3);
    }

    private static boolean a(d9 d9Var, int i10, d9 d9Var2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!a(i10, false) || (i12 = d9Var.f7149i) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = d9Var.f7166z) == -1 || i14 != d9Var2.f7166z)) {
            return false;
        }
        if (!z10 && ((str = d9Var.f7153m) == null || !TextUtils.equals(str, d9Var2.f7153m))) {
            return false;
        }
        if (z11 || ((i13 = d9Var.A) != -1 && i13 == d9Var2.A)) {
            return true;
        }
        return false;
    }

    private static boolean a(d9 d9Var, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((d9Var.f7146f & 16384) != 0 || !a(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !yp.a((Object) d9Var.f7153m, (Object) str)) {
            return false;
        }
        int i21 = d9Var.f7158r;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = d9Var.f7159s;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = d9Var.f7160t;
        if ((f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = d9Var.f7149i) != -1 && i19 <= i20 && i20 <= i15) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
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

    private static void a(oc.a aVar, int[][][] iArr, ni[] niVarArr, f8[] f8VarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= aVar.a()) {
                z10 = true;
                break;
            }
            int a10 = aVar.a(i10);
            f8 f8Var = f8VarArr[i10];
            if ((a10 == 1 || a10 == 2) && f8Var != null && a(iArr[i10], aVar.b(i10), f8Var)) {
                if (a10 == 1) {
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
            ni niVar = new ni(true);
            niVarArr[i12] = niVar;
            niVarArr[i11] = niVar;
        }
    }

    protected static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, qo qoVar, f8 f8Var) {
        if (f8Var == null) {
            return false;
        }
        int a10 = qoVar.a(f8Var.a());
        for (int i10 = 0; i10 < f8Var.b(); i10++) {
            if (hz.c(iArr[a10][f8Var.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static f8.a a(qo qoVar, int[][] iArr, int i10, d dVar) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i11 = dVar2.E ? 24 : 16;
        boolean z10 = dVar2.D && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < qoVar2.f11066a) {
            po a10 = qoVar2.a(i12);
            int[] iArr2 = iArr[i12];
            int i13 = dVar2.f12825a;
            int i14 = dVar2.f12826b;
            int i15 = dVar2.f12827c;
            int i16 = dVar2.f12828d;
            int i17 = dVar2.f12829f;
            int i18 = dVar2.f12830g;
            int i19 = dVar2.f12831h;
            int i20 = dVar2.f12832i;
            int i21 = dVar2.f12833j;
            int i22 = dVar2.f12834k;
            boolean z11 = dVar2.f12835l;
            po poVar = a10;
            int i23 = i12;
            int[] a11 = a(a10, iArr2, z10, i11, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, z11);
            if (a11.length > 0) {
                return new f8.a(poVar, a11);
            }
            i12 = i23 + 1;
            qoVar2 = qoVar;
            dVar2 = dVar;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.applovin.impl.k6$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.f8.a[] a(com.applovin.impl.oc.a r22, int[][][] r23, int[] r24, com.applovin.impl.k6.d r25) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.a()
            com.applovin.impl.f8$a[] r10 = new com.applovin.impl.f8.a[r9]
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0042
            int r1 = r7.a(r12)
            if (r14 != r1) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            com.applovin.impl.qo r1 = r7.b(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            com.applovin.impl.f8$a r0 = r0.b(r1, r2, r3, r4, r5)
            r10[r12] = r0
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            com.applovin.impl.qo r1 = r7.b(r12)
            int r1 = r1.f11066a
            if (r1 <= 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r15 = 0
        L_0x003e:
            r13 = r13 | r15
        L_0x003f:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0042:
            r12 = -1
            r16 = 0
            r3 = r16
            r4 = r3
            r2 = -1
            r5 = 0
        L_0x004a:
            if (r5 >= r9) goto L_0x00b5
            int r0 = r7.a(r5)
            if (r15 != r0) goto L_0x00a6
            boolean r0 = r8.L
            if (r0 != 0) goto L_0x005c
            if (r13 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r17 = 0
            goto L_0x005e
        L_0x005c:
            r17 = 1
        L_0x005e:
            com.applovin.impl.qo r1 = r7.b(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r20 = r3
            r3 = r19
            r15 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.a((com.applovin.impl.qo) r1, (int[][]) r2, (int) r3, (com.applovin.impl.k6.d) r4, (boolean) r5)
            if (r0 == 0) goto L_0x00ac
            if (r15 == 0) goto L_0x0088
            java.lang.Object r1 = r0.second
            com.applovin.impl.k6$b r1 = (com.applovin.impl.k6.b) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ac
        L_0x0088:
            if (r14 == r12) goto L_0x008c
            r10[r14] = r16
        L_0x008c:
            java.lang.Object r1 = r0.first
            com.applovin.impl.f8$a r1 = (com.applovin.impl.f8.a) r1
            r10[r19] = r1
            com.applovin.impl.po r2 = r1.f7648a
            int[] r1 = r1.f7649b
            r1 = r1[r11]
            com.applovin.impl.d9 r1 = r2.a((int) r1)
            java.lang.String r3 = r1.f7144c
            java.lang.Object r0 = r0.second
            r4 = r0
            com.applovin.impl.k6$b r4 = (com.applovin.impl.k6.b) r4
            r2 = r19
            goto L_0x00b0
        L_0x00a6:
            r14 = r2
            r20 = r3
            r15 = r4
            r19 = r5
        L_0x00ac:
            r2 = r14
            r4 = r15
            r3 = r20
        L_0x00b0:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004a
        L_0x00b5:
            r20 = r3
            r0 = r16
            r1 = -1
        L_0x00ba:
            if (r11 >= r9) goto L_0x010b
            int r2 = r7.a(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0103
            r4 = 2
            if (r2 == r4) goto L_0x0100
            r5 = 3
            if (r2 == r5) goto L_0x00d6
            com.applovin.impl.qo r5 = r7.b(r11)
            r13 = r23[r11]
            com.applovin.impl.f8$a r2 = r6.a((int) r2, (com.applovin.impl.qo) r5, (int[][]) r13, (com.applovin.impl.k6.d) r8)
            r10[r11] = r2
            goto L_0x0100
        L_0x00d6:
            com.applovin.impl.qo r2 = r7.b(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.a((com.applovin.impl.qo) r2, (int[][]) r5, (com.applovin.impl.k6.d) r8, (java.lang.String) r13)
            if (r2 == 0) goto L_0x0106
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r5 = r2.second
            com.applovin.impl.k6$g r5 = (com.applovin.impl.k6.g) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0106
        L_0x00f0:
            if (r1 == r12) goto L_0x00f4
            r10[r1] = r16
        L_0x00f4:
            java.lang.Object r0 = r2.first
            com.applovin.impl.f8$a r0 = (com.applovin.impl.f8.a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            com.applovin.impl.k6$g r0 = (com.applovin.impl.k6.g) r0
            r1 = r11
            goto L_0x0106
        L_0x0100:
            r13 = r20
            goto L_0x0106
        L_0x0103:
            r13 = r20
            r4 = 2
        L_0x0106:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00ba
        L_0x010b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(com.applovin.impl.oc$a, int[][][], int[], com.applovin.impl.k6$d):com.applovin.impl.f8$a[]");
    }

    /* access modifiers changed from: protected */
    public Pair a(qo qoVar, int[][] iArr, int i10, d dVar, boolean z10) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        f8.a aVar = null;
        b bVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < qoVar2.f11066a; i13++) {
            po a10 = qoVar2.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.f10688a; i14++) {
                if (a(iArr2[i14], dVar2.J)) {
                    b bVar2 = new b(a10.a(i14), dVar2, iArr2[i14]);
                    if ((bVar2.f8878a || dVar2.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        po a11 = qoVar2.a(i11);
        if (!dVar2.f12846w && !dVar2.f12845v && z10) {
            int[] a12 = a(a11, iArr[i11], i12, dVar2.f12840q, dVar2.G, dVar2.H, dVar2.I);
            if (a12.length > 1) {
                aVar = new f8.a(a11, a12);
            }
        }
        if (aVar == null) {
            aVar = new f8.a(a11, i12);
        }
        return Pair.create(aVar, (b) a1.a((Object) bVar));
    }

    private static f8.a a(qo qoVar, int[][] iArr, d dVar) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i10 = -1;
        po poVar = null;
        h hVar = null;
        for (int i11 = 0; i11 < qoVar2.f11066a; i11++) {
            po a10 = qoVar2.a(i11);
            List a11 = a(a10, dVar2.f12833j, dVar2.f12834k, dVar2.f12835l);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.f10688a; i12++) {
                d9 a12 = a10.a(i12);
                if ((a12.f7146f & 16384) == 0 && a(iArr2[i12], dVar2.J)) {
                    h hVar2 = new h(a12, dVar2, iArr2[i12], a11.contains(Integer.valueOf(i12)));
                    if ((hVar2.f8911a || dVar2.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        poVar = a10;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i10);
    }

    /* access modifiers changed from: protected */
    public f8.a a(int i10, qo qoVar, int[][] iArr, d dVar) {
        po poVar = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < qoVar.f11066a; i12++) {
            po a10 = qoVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a10.f10688a; i13++) {
                if (a(iArr2[i13], dVar.J)) {
                    c cVar2 = new c(a10.a(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        poVar = a10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i11);
    }

    /* access modifiers changed from: protected */
    public Pair a(qo qoVar, int[][] iArr, d dVar, String str) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i10 = -1;
        po poVar = null;
        g gVar = null;
        for (int i11 = 0; i11 < qoVar2.f11066a; i11++) {
            po a10 = qoVar2.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.f10688a; i12++) {
                if (a(iArr2[i12], dVar2.J)) {
                    g gVar2 = new g(a10.a(i12), dVar2, iArr2[i12], str);
                    if (gVar2.f8902a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        poVar = a10;
                        i10 = i12;
                        gVar = gVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (poVar == null) {
            return null;
        }
        return Pair.create(new f8.a(poVar, i10), (g) a1.a((Object) gVar));
    }

    /* access modifiers changed from: protected */
    public final Pair a(oc.a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar) {
        d dVar = (d) this.f8877e.get();
        int a10 = aVar.a();
        f8.a[] a11 = a(aVar, iArr, iArr2, dVar);
        int i10 = 0;
        while (true) {
            f8.a aVar3 = null;
            if (i10 >= a10) {
                break;
            }
            int a12 = aVar.a(i10);
            if (dVar.d(i10) || dVar.f12847x.contains(Integer.valueOf(a12))) {
                a11[i10] = null;
            } else {
                qo b10 = aVar.b(i10);
                if (dVar.b(i10, b10)) {
                    f a13 = dVar.a(i10, b10);
                    if (a13 != null) {
                        aVar3 = new f8.a(b10.a(a13.f8898a), a13.f8899b, a13.f8901d);
                    }
                    a11[i10] = aVar3;
                }
            }
            i10++;
        }
        f8[] a14 = this.f8876d.a(a11, a(), aVar2, goVar);
        ni[] niVarArr = new ni[a10];
        for (int i11 = 0; i11 < a10; i11++) {
            niVarArr[i11] = (dVar.d(i11) || dVar.f12847x.contains(Integer.valueOf(aVar.a(i11))) || (aVar.a(i11) != -2 && a14[i11] == null)) ? null : ni.f9995b;
        }
        if (dVar.K) {
            a(aVar, iArr, niVarArr, a14);
        }
        return Pair.create(niVarArr, a14);
    }

    private static List a(po poVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(poVar.f10688a);
        for (int i13 = 0; i13 < poVar.f10688a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            int i14 = a.e.API_PRIORITY_OTHER;
            for (int i15 = 0; i15 < poVar.f10688a; i15++) {
                d9 a10 = poVar.a(i15);
                int i16 = a10.f7158r;
                if (i16 > 0 && (i12 = a10.f7159s) > 0) {
                    Point a11 = a(z10, i10, i11, i16, i12);
                    int i17 = a10.f7158r;
                    int i18 = a10.f7159s;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (((float) a11.x) * 0.98f)) && i18 >= ((int) (((float) a11.y) * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b10 = poVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b10 == -1 || b10 > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
