package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class e {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2261f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    private static SparseIntArray f2262g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f2263h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f2264a = MaxReward.DEFAULT_LABEL;

    /* renamed from: b  reason: collision with root package name */
    public int f2265b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, b> f2266c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f2267d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, a> f2268e = new HashMap<>();

    /* compiled from: ConstraintSet */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2269a;

        /* renamed from: b  reason: collision with root package name */
        String f2270b;

        /* renamed from: c  reason: collision with root package name */
        public final d f2271c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f2272d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f2273e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final C0026e f2274f = new C0026e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, b> f2275g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0025a f2276h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        static class C0025a {

            /* renamed from: a  reason: collision with root package name */
            int[] f2277a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f2278b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f2279c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f2280d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f2281e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f2282f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f2283g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f2284h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f2285i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f2286j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f2287k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f2288l = 0;

            C0025a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, float f10) {
                int i11 = this.f2282f;
                int[] iArr = this.f2280d;
                if (i11 >= iArr.length) {
                    this.f2280d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2281e;
                    this.f2281e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2280d;
                int i12 = this.f2282f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2281e;
                this.f2282f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* access modifiers changed from: package-private */
            public void b(int i10, int i11) {
                int i12 = this.f2279c;
                int[] iArr = this.f2277a;
                if (i12 >= iArr.length) {
                    this.f2277a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2278b;
                    this.f2278b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2277a;
                int i13 = this.f2279c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2278b;
                this.f2279c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(int i10, String str) {
                int i11 = this.f2285i;
                int[] iArr = this.f2283g;
                if (i11 >= iArr.length) {
                    this.f2283g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2284h;
                    this.f2284h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2283g;
                int i12 = this.f2285i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2284h;
                this.f2285i = i12 + 1;
                strArr2[i12] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i10, boolean z10) {
                int i11 = this.f2288l;
                int[] iArr = this.f2286j;
                if (i11 >= iArr.length) {
                    this.f2286j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2287k;
                    this.f2287k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2286j;
                int i12 = this.f2288l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2287k;
                this.f2288l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f2269a = i10;
            b bVar2 = this.f2273e;
            bVar2.f2308j = bVar.f2165e;
            bVar2.f2310k = bVar.f2167f;
            bVar2.f2312l = bVar.f2169g;
            bVar2.f2314m = bVar.f2171h;
            bVar2.f2316n = bVar.f2173i;
            bVar2.f2318o = bVar.f2175j;
            bVar2.f2320p = bVar.f2177k;
            bVar2.f2322q = bVar.f2179l;
            bVar2.f2324r = bVar.f2181m;
            bVar2.f2325s = bVar.f2183n;
            bVar2.f2326t = bVar.f2185o;
            bVar2.f2327u = bVar.f2193s;
            bVar2.f2328v = bVar.f2195t;
            bVar2.f2329w = bVar.f2197u;
            bVar2.f2330x = bVar.f2199v;
            bVar2.f2331y = bVar.G;
            bVar2.f2332z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f2187p;
            bVar2.C = bVar.f2189q;
            bVar2.D = bVar.f2191r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f2304h = bVar.f2161c;
            bVar2.f2300f = bVar.f2157a;
            bVar2.f2302g = bVar.f2159b;
            bVar2.f2296d = bVar.width;
            bVar2.f2298e = bVar.height;
            bVar2.H = bVar.leftMargin;
            bVar2.I = bVar.rightMargin;
            bVar2.J = bVar.topMargin;
            bVar2.K = bVar.bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f2317n0 = bVar.f2158a0;
            bVar2.f2319o0 = bVar.f2160b0;
            bVar2.Z = bVar.P;
            bVar2.f2291a0 = bVar.Q;
            bVar2.f2293b0 = bVar.T;
            bVar2.f2295c0 = bVar.U;
            bVar2.f2297d0 = bVar.R;
            bVar2.f2299e0 = bVar.S;
            bVar2.f2301f0 = bVar.V;
            bVar2.f2303g0 = bVar.W;
            bVar2.f2315m0 = bVar.f2162c0;
            bVar2.P = bVar.f2203x;
            bVar2.R = bVar.f2205z;
            bVar2.O = bVar.f2201w;
            bVar2.Q = bVar.f2204y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f2323q0 = bVar.f2164d0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.L = bVar.getMarginEnd();
                this.f2273e.M = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void g(int i10, f.a aVar) {
            f(i10, aVar);
            this.f2271c.f2351d = aVar.f2369x0;
            C0026e eVar = this.f2274f;
            eVar.f2355b = aVar.A0;
            eVar.f2356c = aVar.B0;
            eVar.f2357d = aVar.C0;
            eVar.f2358e = aVar.D0;
            eVar.f2359f = aVar.E0;
            eVar.f2360g = aVar.F0;
            eVar.f2361h = aVar.G0;
            eVar.f2363j = aVar.H0;
            eVar.f2364k = aVar.I0;
            eVar.f2365l = aVar.J0;
            eVar.f2367n = aVar.f2371z0;
            eVar.f2366m = aVar.f2370y0;
        }

        /* access modifiers changed from: private */
        public void h(c cVar, int i10, f.a aVar) {
            g(i10, aVar);
            if (cVar instanceof a) {
                b bVar = this.f2273e;
                bVar.f2309j0 = 1;
                a aVar2 = (a) cVar;
                bVar.f2305h0 = aVar2.getType();
                this.f2273e.f2311k0 = aVar2.getReferencedIds();
                this.f2273e.f2307i0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f2273e;
            bVar.f2165e = bVar2.f2308j;
            bVar.f2167f = bVar2.f2310k;
            bVar.f2169g = bVar2.f2312l;
            bVar.f2171h = bVar2.f2314m;
            bVar.f2173i = bVar2.f2316n;
            bVar.f2175j = bVar2.f2318o;
            bVar.f2177k = bVar2.f2320p;
            bVar.f2179l = bVar2.f2322q;
            bVar.f2181m = bVar2.f2324r;
            bVar.f2183n = bVar2.f2325s;
            bVar.f2185o = bVar2.f2326t;
            bVar.f2193s = bVar2.f2327u;
            bVar.f2195t = bVar2.f2328v;
            bVar.f2197u = bVar2.f2329w;
            bVar.f2199v = bVar2.f2330x;
            bVar.leftMargin = bVar2.H;
            bVar.rightMargin = bVar2.I;
            bVar.topMargin = bVar2.J;
            bVar.bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f2203x = bVar2.P;
            bVar.f2205z = bVar2.R;
            bVar.G = bVar2.f2331y;
            bVar.H = bVar2.f2332z;
            bVar.f2187p = bVar2.B;
            bVar.f2189q = bVar2.C;
            bVar.f2191r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f2158a0 = bVar2.f2317n0;
            bVar.f2160b0 = bVar2.f2319o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f2291a0;
            bVar.T = bVar2.f2293b0;
            bVar.U = bVar2.f2295c0;
            bVar.R = bVar2.f2297d0;
            bVar.S = bVar2.f2299e0;
            bVar.V = bVar2.f2301f0;
            bVar.W = bVar2.f2303g0;
            bVar.Z = bVar2.G;
            bVar.f2161c = bVar2.f2304h;
            bVar.f2157a = bVar2.f2300f;
            bVar.f2159b = bVar2.f2302g;
            bVar.width = bVar2.f2296d;
            bVar.height = bVar2.f2298e;
            String str = bVar2.f2315m0;
            if (str != null) {
                bVar.f2162c0 = str;
            }
            bVar.f2164d0 = bVar2.f2323q0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.M);
                bVar.setMarginEnd(this.f2273e.L);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f2273e.a(this.f2273e);
            aVar.f2272d.a(this.f2272d);
            aVar.f2271c.a(this.f2271c);
            aVar.f2274f.a(this.f2274f);
            aVar.f2269a = this.f2269a;
            aVar.f2276h = this.f2276h;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet */
    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f2289r0;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = RecyclerView.UNDEFINED_DURATION;
        public int P = RecyclerView.UNDEFINED_DURATION;
        public int Q = RecyclerView.UNDEFINED_DURATION;
        public int R = RecyclerView.UNDEFINED_DURATION;
        public int S = RecyclerView.UNDEFINED_DURATION;
        public int T = RecyclerView.UNDEFINED_DURATION;
        public int U = RecyclerView.UNDEFINED_DURATION;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2290a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f2291a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2292b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f2293b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2294c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f2295c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2296d;

        /* renamed from: d0  reason: collision with root package name */
        public int f2297d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2298e;

        /* renamed from: e0  reason: collision with root package name */
        public int f2299e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f2300f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f2301f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f2302g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f2303g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f2304h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f2305h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2306i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f2307i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2308j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f2309j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2310k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f2311k0;

        /* renamed from: l  reason: collision with root package name */
        public int f2312l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f2313l0;

        /* renamed from: m  reason: collision with root package name */
        public int f2314m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f2315m0;

        /* renamed from: n  reason: collision with root package name */
        public int f2316n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f2317n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f2318o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f2319o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2320p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f2321p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f2322q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f2323q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f2324r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2325s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2326t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f2327u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f2328v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f2329w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f2330x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f2331y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f2332z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2289r0 = sparseIntArray;
            sparseIntArray.append(k.K5, 24);
            f2289r0.append(k.L5, 25);
            f2289r0.append(k.N5, 28);
            f2289r0.append(k.O5, 29);
            f2289r0.append(k.T5, 35);
            f2289r0.append(k.S5, 34);
            f2289r0.append(k.f2562u5, 4);
            f2289r0.append(k.f2553t5, 3);
            f2289r0.append(k.f2535r5, 1);
            f2289r0.append(k.Z5, 6);
            f2289r0.append(k.f2383a6, 7);
            f2289r0.append(k.B5, 17);
            f2289r0.append(k.C5, 18);
            f2289r0.append(k.D5, 19);
            f2289r0.append(k.f2499n5, 90);
            f2289r0.append(k.Z4, 26);
            f2289r0.append(k.P5, 31);
            f2289r0.append(k.Q5, 32);
            f2289r0.append(k.A5, 10);
            f2289r0.append(k.f2607z5, 9);
            f2289r0.append(k.f2410d6, 13);
            f2289r0.append(k.f2437g6, 16);
            f2289r0.append(k.f2419e6, 14);
            f2289r0.append(k.f2392b6, 11);
            f2289r0.append(k.f2428f6, 15);
            f2289r0.append(k.f2401c6, 12);
            f2289r0.append(k.W5, 38);
            f2289r0.append(k.I5, 37);
            f2289r0.append(k.H5, 39);
            f2289r0.append(k.V5, 40);
            f2289r0.append(k.G5, 20);
            f2289r0.append(k.U5, 36);
            f2289r0.append(k.f2598y5, 5);
            f2289r0.append(k.J5, 91);
            f2289r0.append(k.R5, 91);
            f2289r0.append(k.M5, 91);
            f2289r0.append(k.f2544s5, 91);
            f2289r0.append(k.f2526q5, 91);
            f2289r0.append(k.f2400c5, 23);
            f2289r0.append(k.f2418e5, 27);
            f2289r0.append(k.f2436g5, 30);
            f2289r0.append(k.f2445h5, 8);
            f2289r0.append(k.f2409d5, 33);
            f2289r0.append(k.f2427f5, 2);
            f2289r0.append(k.f2382a5, 22);
            f2289r0.append(k.f2391b5, 21);
            f2289r0.append(k.X5, 41);
            f2289r0.append(k.E5, 42);
            f2289r0.append(k.f2517p5, 41);
            f2289r0.append(k.f2508o5, 42);
            f2289r0.append(k.f2446h6, 76);
            f2289r0.append(k.f2571v5, 61);
            f2289r0.append(k.f2589x5, 62);
            f2289r0.append(k.f2580w5, 63);
            f2289r0.append(k.Y5, 69);
            f2289r0.append(k.F5, 70);
            f2289r0.append(k.f2481l5, 71);
            f2289r0.append(k.f2463j5, 72);
            f2289r0.append(k.f2472k5, 73);
            f2289r0.append(k.f2490m5, 74);
            f2289r0.append(k.f2454i5, 75);
        }

        public void a(b bVar) {
            this.f2290a = bVar.f2290a;
            this.f2296d = bVar.f2296d;
            this.f2292b = bVar.f2292b;
            this.f2298e = bVar.f2298e;
            this.f2300f = bVar.f2300f;
            this.f2302g = bVar.f2302g;
            this.f2304h = bVar.f2304h;
            this.f2306i = bVar.f2306i;
            this.f2308j = bVar.f2308j;
            this.f2310k = bVar.f2310k;
            this.f2312l = bVar.f2312l;
            this.f2314m = bVar.f2314m;
            this.f2316n = bVar.f2316n;
            this.f2318o = bVar.f2318o;
            this.f2320p = bVar.f2320p;
            this.f2322q = bVar.f2322q;
            this.f2324r = bVar.f2324r;
            this.f2325s = bVar.f2325s;
            this.f2326t = bVar.f2326t;
            this.f2327u = bVar.f2327u;
            this.f2328v = bVar.f2328v;
            this.f2329w = bVar.f2329w;
            this.f2330x = bVar.f2330x;
            this.f2331y = bVar.f2331y;
            this.f2332z = bVar.f2332z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2291a0 = bVar.f2291a0;
            this.f2293b0 = bVar.f2293b0;
            this.f2295c0 = bVar.f2295c0;
            this.f2297d0 = bVar.f2297d0;
            this.f2299e0 = bVar.f2299e0;
            this.f2301f0 = bVar.f2301f0;
            this.f2303g0 = bVar.f2303g0;
            this.f2305h0 = bVar.f2305h0;
            this.f2307i0 = bVar.f2307i0;
            this.f2309j0 = bVar.f2309j0;
            this.f2315m0 = bVar.f2315m0;
            int[] iArr = bVar.f2311k0;
            if (iArr == null || bVar.f2313l0 != null) {
                this.f2311k0 = null;
            } else {
                this.f2311k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2313l0 = bVar.f2313l0;
            this.f2317n0 = bVar.f2317n0;
            this.f2319o0 = bVar.f2319o0;
            this.f2321p0 = bVar.f2321p0;
            this.f2323q0 = bVar.f2323q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Y4);
            this.f2292b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2289r0.get(index);
                switch (i11) {
                    case 1:
                        this.f2324r = e.l(obtainStyledAttributes, index, this.f2324r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f2322q = e.l(obtainStyledAttributes, index, this.f2322q);
                        break;
                    case 4:
                        this.f2320p = e.l(obtainStyledAttributes, index, this.f2320p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        }
                    case 9:
                        this.f2330x = e.l(obtainStyledAttributes, index, this.f2330x);
                        break;
                    case 10:
                        this.f2329w = e.l(obtainStyledAttributes, index, this.f2329w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f2300f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2300f);
                        break;
                    case 18:
                        this.f2302g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2302g);
                        break;
                    case 19:
                        this.f2304h = obtainStyledAttributes.getFloat(index, this.f2304h);
                        break;
                    case 20:
                        this.f2331y = obtainStyledAttributes.getFloat(index, this.f2331y);
                        break;
                    case 21:
                        this.f2298e = obtainStyledAttributes.getLayoutDimension(index, this.f2298e);
                        break;
                    case 22:
                        this.f2296d = obtainStyledAttributes.getLayoutDimension(index, this.f2296d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f2308j = e.l(obtainStyledAttributes, index, this.f2308j);
                        break;
                    case 25:
                        this.f2310k = e.l(obtainStyledAttributes, index, this.f2310k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f2312l = e.l(obtainStyledAttributes, index, this.f2312l);
                        break;
                    case 29:
                        this.f2314m = e.l(obtainStyledAttributes, index, this.f2314m);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        }
                    case 31:
                        this.f2327u = e.l(obtainStyledAttributes, index, this.f2327u);
                        break;
                    case 32:
                        this.f2328v = e.l(obtainStyledAttributes, index, this.f2328v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f2318o = e.l(obtainStyledAttributes, index, this.f2318o);
                        break;
                    case 35:
                        this.f2316n = e.l(obtainStyledAttributes, index, this.f2316n);
                        break;
                    case 36:
                        this.f2332z = obtainStyledAttributes.getFloat(index, this.f2332z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = e.l(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f2301f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2303g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2305h0 = obtainStyledAttributes.getInt(index, this.f2305h0);
                                        break;
                                    case 73:
                                        this.f2307i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2307i0);
                                        break;
                                    case 74:
                                        this.f2313l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2321p0 = obtainStyledAttributes.getBoolean(index, this.f2321p0);
                                        break;
                                    case 76:
                                        this.f2323q0 = obtainStyledAttributes.getInt(index, this.f2323q0);
                                        break;
                                    case 77:
                                        this.f2325s = e.l(obtainStyledAttributes, index, this.f2325s);
                                        break;
                                    case 78:
                                        this.f2326t = e.l(obtainStyledAttributes, index, this.f2326t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f2291a0 = obtainStyledAttributes.getInt(index, this.f2291a0);
                                        break;
                                    case 83:
                                        this.f2295c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2295c0);
                                        break;
                                    case 84:
                                        this.f2293b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2293b0);
                                        break;
                                    case 85:
                                        this.f2299e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2299e0);
                                        break;
                                    case 86:
                                        this.f2297d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2297d0);
                                        break;
                                    case 87:
                                        this.f2317n0 = obtainStyledAttributes.getBoolean(index, this.f2317n0);
                                        break;
                                    case 88:
                                        this.f2319o0 = obtainStyledAttributes.getBoolean(index, this.f2319o0);
                                        break;
                                    case 89:
                                        this.f2315m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2306i = obtainStyledAttributes.getBoolean(index, this.f2306i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2289r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2289r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f2333o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2334a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2335b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f2336c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f2337d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f2338e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2339f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2340g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f2341h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f2342i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f2343j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f2344k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f2345l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2346m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f2347n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2333o = sparseIntArray;
            sparseIntArray.append(k.f2554t6, 1);
            f2333o.append(k.f2572v6, 2);
            f2333o.append(k.f2608z6, 3);
            f2333o.append(k.f2545s6, 4);
            f2333o.append(k.f2536r6, 5);
            f2333o.append(k.f2527q6, 6);
            f2333o.append(k.f2563u6, 7);
            f2333o.append(k.f2599y6, 8);
            f2333o.append(k.f2590x6, 9);
            f2333o.append(k.f2581w6, 10);
        }

        public void a(c cVar) {
            this.f2334a = cVar.f2334a;
            this.f2335b = cVar.f2335b;
            this.f2337d = cVar.f2337d;
            this.f2338e = cVar.f2338e;
            this.f2339f = cVar.f2339f;
            this.f2342i = cVar.f2342i;
            this.f2340g = cVar.f2340g;
            this.f2341h = cVar.f2341h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2518p6);
            this.f2334a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2333o.get(index)) {
                    case 1:
                        this.f2342i = obtainStyledAttributes.getFloat(index, this.f2342i);
                        break;
                    case 2:
                        this.f2338e = obtainStyledAttributes.getInt(index, this.f2338e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2337d = t.b.f22524c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2337d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2339f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2335b = e.l(obtainStyledAttributes, index, this.f2335b);
                        break;
                    case 6:
                        this.f2336c = obtainStyledAttributes.getInteger(index, this.f2336c);
                        break;
                    case 7:
                        this.f2340g = obtainStyledAttributes.getFloat(index, this.f2340g);
                        break;
                    case 8:
                        this.f2344k = obtainStyledAttributes.getInteger(index, this.f2344k);
                        break;
                    case 9:
                        this.f2343j = obtainStyledAttributes.getFloat(index, this.f2343j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f2346m = obtainStyledAttributes.getInteger(index, this.f2347n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f2345l = string;
                                if (string.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH) <= 0) {
                                    this.f2346m = -1;
                                    break;
                                } else {
                                    this.f2347n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f2346m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2347n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f2346m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2348a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2349b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2350c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2351d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2352e = Float.NaN;

        public void a(d dVar) {
            this.f2348a = dVar.f2348a;
            this.f2349b = dVar.f2349b;
            this.f2351d = dVar.f2351d;
            this.f2352e = dVar.f2352e;
            this.f2350c = dVar.f2350c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.M6);
            this.f2348a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.O6) {
                    this.f2351d = obtainStyledAttributes.getFloat(index, this.f2351d);
                } else if (index == k.N6) {
                    this.f2349b = obtainStyledAttributes.getInt(index, this.f2349b);
                    this.f2349b = e.f2261f[this.f2349b];
                } else if (index == k.Q6) {
                    this.f2350c = obtainStyledAttributes.getInt(index, this.f2350c);
                } else if (index == k.P6) {
                    this.f2352e = obtainStyledAttributes.getFloat(index, this.f2352e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0026e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f2353o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2354a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2355b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2356c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2357d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2358e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2359f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2360g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2361h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f2362i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2363j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2364k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2365l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2366m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f2367n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2353o = sparseIntArray;
            sparseIntArray.append(k.f2483l7, 1);
            f2353o.append(k.f2492m7, 2);
            f2353o.append(k.f2501n7, 3);
            f2353o.append(k.f2465j7, 4);
            f2353o.append(k.f2474k7, 5);
            f2353o.append(k.f2429f7, 6);
            f2353o.append(k.f2438g7, 7);
            f2353o.append(k.f2447h7, 8);
            f2353o.append(k.f2456i7, 9);
            f2353o.append(k.f2510o7, 10);
            f2353o.append(k.f2519p7, 11);
            f2353o.append(k.f2528q7, 12);
        }

        public void a(C0026e eVar) {
            this.f2354a = eVar.f2354a;
            this.f2355b = eVar.f2355b;
            this.f2356c = eVar.f2356c;
            this.f2357d = eVar.f2357d;
            this.f2358e = eVar.f2358e;
            this.f2359f = eVar.f2359f;
            this.f2360g = eVar.f2360g;
            this.f2361h = eVar.f2361h;
            this.f2362i = eVar.f2362i;
            this.f2363j = eVar.f2363j;
            this.f2364k = eVar.f2364k;
            this.f2365l = eVar.f2365l;
            this.f2366m = eVar.f2366m;
            this.f2367n = eVar.f2367n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2420e7);
            this.f2354a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2353o.get(index)) {
                    case 1:
                        this.f2355b = obtainStyledAttributes.getFloat(index, this.f2355b);
                        break;
                    case 2:
                        this.f2356c = obtainStyledAttributes.getFloat(index, this.f2356c);
                        break;
                    case 3:
                        this.f2357d = obtainStyledAttributes.getFloat(index, this.f2357d);
                        break;
                    case 4:
                        this.f2358e = obtainStyledAttributes.getFloat(index, this.f2358e);
                        break;
                    case 5:
                        this.f2359f = obtainStyledAttributes.getFloat(index, this.f2359f);
                        break;
                    case 6:
                        this.f2360g = obtainStyledAttributes.getDimension(index, this.f2360g);
                        break;
                    case 7:
                        this.f2361h = obtainStyledAttributes.getDimension(index, this.f2361h);
                        break;
                    case 8:
                        this.f2363j = obtainStyledAttributes.getDimension(index, this.f2363j);
                        break;
                    case 9:
                        this.f2364k = obtainStyledAttributes.getDimension(index, this.f2364k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2365l = obtainStyledAttributes.getDimension(index, this.f2365l);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2366m = true;
                            this.f2367n = obtainStyledAttributes.getDimension(index, this.f2367n);
                            break;
                        }
                    case 12:
                        this.f2362i = e.l(obtainStyledAttributes, index, this.f2362i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2262g.append(k.A0, 25);
        f2262g.append(k.B0, 26);
        f2262g.append(k.D0, 29);
        f2262g.append(k.E0, 30);
        f2262g.append(k.K0, 36);
        f2262g.append(k.J0, 35);
        f2262g.append(k.f2440h0, 4);
        f2262g.append(k.f2431g0, 3);
        f2262g.append(k.f2395c0, 1);
        f2262g.append(k.f2413e0, 91);
        f2262g.append(k.f2404d0, 92);
        f2262g.append(k.T0, 6);
        f2262g.append(k.U0, 7);
        f2262g.append(k.f2503o0, 17);
        f2262g.append(k.f2512p0, 18);
        f2262g.append(k.f2521q0, 19);
        f2262g.append(k.Y, 99);
        f2262g.append(k.f2556u, 27);
        f2262g.append(k.F0, 32);
        f2262g.append(k.G0, 33);
        f2262g.append(k.f2494n0, 10);
        f2262g.append(k.f2485m0, 9);
        f2262g.append(k.X0, 13);
        f2262g.append(k.f2378a1, 16);
        f2262g.append(k.Y0, 14);
        f2262g.append(k.V0, 11);
        f2262g.append(k.Z0, 15);
        f2262g.append(k.W0, 12);
        f2262g.append(k.N0, 40);
        f2262g.append(k.f2593y0, 39);
        f2262g.append(k.f2584x0, 41);
        f2262g.append(k.M0, 42);
        f2262g.append(k.f2575w0, 20);
        f2262g.append(k.L0, 37);
        f2262g.append(k.f2476l0, 5);
        f2262g.append(k.f2602z0, 87);
        f2262g.append(k.I0, 87);
        f2262g.append(k.C0, 87);
        f2262g.append(k.f2422f0, 87);
        f2262g.append(k.f2386b0, 87);
        f2262g.append(k.f2601z, 24);
        f2262g.append(k.B, 28);
        f2262g.append(k.N, 31);
        f2262g.append(k.O, 8);
        f2262g.append(k.A, 34);
        f2262g.append(k.C, 2);
        f2262g.append(k.f2583x, 23);
        f2262g.append(k.f2592y, 21);
        f2262g.append(k.O0, 95);
        f2262g.append(k.f2530r0, 96);
        f2262g.append(k.f2574w, 22);
        f2262g.append(k.D, 43);
        f2262g.append(k.Q, 44);
        f2262g.append(k.L, 45);
        f2262g.append(k.M, 46);
        f2262g.append(k.K, 60);
        f2262g.append(k.I, 47);
        f2262g.append(k.J, 48);
        f2262g.append(k.E, 49);
        f2262g.append(k.F, 50);
        f2262g.append(k.G, 51);
        f2262g.append(k.H, 52);
        f2262g.append(k.P, 53);
        f2262g.append(k.P0, 54);
        f2262g.append(k.f2539s0, 55);
        f2262g.append(k.Q0, 56);
        f2262g.append(k.f2548t0, 57);
        f2262g.append(k.R0, 58);
        f2262g.append(k.f2557u0, 59);
        f2262g.append(k.f2449i0, 61);
        f2262g.append(k.f2467k0, 62);
        f2262g.append(k.f2458j0, 63);
        f2262g.append(k.R, 64);
        f2262g.append(k.f2468k1, 65);
        f2262g.append(k.X, 66);
        f2262g.append(k.f2477l1, 67);
        f2262g.append(k.f2405d1, 79);
        f2262g.append(k.f2565v, 38);
        f2262g.append(k.f2396c1, 68);
        f2262g.append(k.S0, 69);
        f2262g.append(k.f2566v0, 70);
        f2262g.append(k.f2387b1, 97);
        f2262g.append(k.V, 71);
        f2262g.append(k.T, 72);
        f2262g.append(k.U, 73);
        f2262g.append(k.W, 74);
        f2262g.append(k.S, 75);
        f2262g.append(k.f2414e1, 76);
        f2262g.append(k.H0, 77);
        f2262g.append(k.f2486m1, 78);
        f2262g.append(k.f2377a0, 80);
        f2262g.append(k.Z, 81);
        f2262g.append(k.f2423f1, 82);
        f2262g.append(k.f2459j1, 83);
        f2262g.append(k.f2450i1, 84);
        f2262g.append(k.f2441h1, 85);
        f2262g.append(k.f2432g1, 86);
        SparseIntArray sparseIntArray = f2263h;
        int i10 = k.R3;
        sparseIntArray.append(i10, 6);
        f2263h.append(i10, 7);
        f2263h.append(k.M2, 27);
        f2263h.append(k.U3, 13);
        f2263h.append(k.X3, 16);
        f2263h.append(k.V3, 14);
        f2263h.append(k.S3, 11);
        f2263h.append(k.W3, 15);
        f2263h.append(k.T3, 12);
        f2263h.append(k.L3, 40);
        f2263h.append(k.E3, 39);
        f2263h.append(k.D3, 41);
        f2263h.append(k.K3, 42);
        f2263h.append(k.C3, 20);
        f2263h.append(k.J3, 37);
        f2263h.append(k.f2578w3, 5);
        f2263h.append(k.F3, 87);
        f2263h.append(k.I3, 87);
        f2263h.append(k.G3, 87);
        f2263h.append(k.f2551t3, 87);
        f2263h.append(k.f2542s3, 87);
        f2263h.append(k.R2, 24);
        f2263h.append(k.T2, 28);
        f2263h.append(k.f2425f3, 31);
        f2263h.append(k.f2434g3, 8);
        f2263h.append(k.S2, 34);
        f2263h.append(k.U2, 2);
        f2263h.append(k.P2, 23);
        f2263h.append(k.Q2, 21);
        f2263h.append(k.M3, 95);
        f2263h.append(k.f2587x3, 96);
        f2263h.append(k.O2, 22);
        f2263h.append(k.V2, 43);
        f2263h.append(k.f2452i3, 44);
        f2263h.append(k.f2407d3, 45);
        f2263h.append(k.f2416e3, 46);
        f2263h.append(k.f2398c3, 60);
        f2263h.append(k.f2380a3, 47);
        f2263h.append(k.f2389b3, 48);
        f2263h.append(k.W2, 49);
        f2263h.append(k.X2, 50);
        f2263h.append(k.Y2, 51);
        f2263h.append(k.Z2, 52);
        f2263h.append(k.f2443h3, 53);
        f2263h.append(k.N3, 54);
        f2263h.append(k.f2596y3, 55);
        f2263h.append(k.O3, 56);
        f2263h.append(k.f2605z3, 57);
        f2263h.append(k.P3, 58);
        f2263h.append(k.A3, 59);
        f2263h.append(k.f2569v3, 62);
        f2263h.append(k.f2560u3, 63);
        f2263h.append(k.f2461j3, 64);
        f2263h.append(k.f2453i4, 65);
        f2263h.append(k.f2515p3, 66);
        f2263h.append(k.f2462j4, 67);
        f2263h.append(k.f2381a4, 79);
        f2263h.append(k.N2, 38);
        f2263h.append(k.f2390b4, 98);
        f2263h.append(k.Z3, 68);
        f2263h.append(k.Q3, 69);
        f2263h.append(k.B3, 70);
        f2263h.append(k.f2497n3, 71);
        f2263h.append(k.f2479l3, 72);
        f2263h.append(k.f2488m3, 73);
        f2263h.append(k.f2506o3, 74);
        f2263h.append(k.f2470k3, 75);
        f2263h.append(k.f2399c4, 76);
        f2263h.append(k.H3, 77);
        f2263h.append(k.f2471k4, 78);
        f2263h.append(k.f2533r3, 80);
        f2263h.append(k.f2524q3, 81);
        f2263h.append(k.f2408d4, 82);
        f2263h.append(k.f2444h4, 83);
        f2263h.append(k.f2435g4, 84);
        f2263h.append(k.f2426f4, 85);
        f2263h.append(k.f2417e4, 86);
        f2263h.append(k.Y3, 97);
    }

    private int[] h(View view, String str) {
        int i10;
        Object f10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = j.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f10 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f10 instanceof Integer)) {
                i10 = ((Integer) f10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? k.L2 : k.f2547t);
        p(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* access modifiers changed from: private */
    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    static void m(Object obj, TypedArray typedArray, int i10, int i11) {
        if (obj != null) {
            int i12 = typedArray.peekValue(i10).type;
            if (i12 != 3) {
                int i13 = -2;
                boolean z10 = false;
                if (i12 != 5) {
                    int i14 = typedArray.getInt(i10, 0);
                    if (i14 != -4) {
                        i13 = (i14 == -3 || !(i14 == -2 || i14 == -1)) ? 0 : i14;
                    } else {
                        z10 = true;
                    }
                } else {
                    i13 = typedArray.getDimensionPixelSize(i10, 0);
                }
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        bVar.width = i13;
                        bVar.f2158a0 = z10;
                        return;
                    }
                    bVar.height = i13;
                    bVar.f2160b0 = z10;
                } else if (obj instanceof b) {
                    b bVar2 = (b) obj;
                    if (i11 == 0) {
                        bVar2.f2296d = i13;
                        bVar2.f2317n0 = z10;
                        return;
                    }
                    bVar2.f2298e = i13;
                    bVar2.f2319o0 = z10;
                } else if (obj instanceof a.C0025a) {
                    a.C0025a aVar = (a.C0025a) obj;
                    if (i11 == 0) {
                        aVar.b(23, i13);
                        aVar.d(80, z10);
                        return;
                    }
                    aVar.b(21, i13);
                    aVar.d(81, z10);
                }
            } else {
                n(obj, typedArray.getString(i10), i11);
            }
        }
    }

    static void n(Object obj, String str, int i10) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            o(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).A = trim2;
                        } else if (obj instanceof a.C0025a) {
                            ((a.C0025a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i10 == 0) {
                                    bVar2.width = 0;
                                    bVar2.L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i10 == 0) {
                                    bVar3.f2296d = 0;
                                    bVar3.W = parseFloat;
                                    return;
                                }
                                bVar3.f2298e = 0;
                                bVar3.V = parseFloat;
                            } else if (obj instanceof a.C0025a) {
                                a.C0025a aVar = (a.C0025a) obj;
                                if (i10 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar4.width = 0;
                                bVar4.V = max;
                                bVar4.P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i10 == 0) {
                                bVar5.f2296d = 0;
                                bVar5.f2301f0 = max;
                                bVar5.Z = 2;
                                return;
                            }
                            bVar5.f2298e = 0;
                            bVar5.f2303g0 = max;
                            bVar5.f2291a0 = 2;
                        } else if (obj instanceof a.C0025a) {
                            a.C0025a aVar2 = (a.C0025a) obj;
                            if (i10 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void o(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i11);
                if (substring2.length() > 0) {
                    f10 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i11, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.I = str;
        bVar.J = f10;
        bVar.K = i10;
    }

    private void p(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == k.f2565v || k.N == index || k.O == index)) {
                aVar.f2272d.f2334a = true;
                aVar.f2273e.f2292b = true;
                aVar.f2271c.f2348a = true;
                aVar.f2274f.f2354a = true;
            }
            switch (f2262g.get(index)) {
                case 1:
                    b bVar = aVar.f2273e;
                    bVar.f2324r = l(typedArray, index, bVar.f2324r);
                    break;
                case 2:
                    b bVar2 = aVar.f2273e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f2273e;
                    bVar3.f2322q = l(typedArray, index, bVar3.f2322q);
                    break;
                case 4:
                    b bVar4 = aVar.f2273e;
                    bVar4.f2320p = l(typedArray, index, bVar4.f2320p);
                    break;
                case 5:
                    aVar.f2273e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2273e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f2273e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        b bVar7 = aVar.f2273e;
                        bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f2273e;
                    bVar8.f2330x = l(typedArray, index, bVar8.f2330x);
                    break;
                case 10:
                    b bVar9 = aVar.f2273e;
                    bVar9.f2329w = l(typedArray, index, bVar9.f2329w);
                    break;
                case 11:
                    b bVar10 = aVar.f2273e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f2273e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f2273e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f2273e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f2273e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f2273e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f2273e;
                    bVar16.f2300f = typedArray.getDimensionPixelOffset(index, bVar16.f2300f);
                    break;
                case 18:
                    b bVar17 = aVar.f2273e;
                    bVar17.f2302g = typedArray.getDimensionPixelOffset(index, bVar17.f2302g);
                    break;
                case 19:
                    b bVar18 = aVar.f2273e;
                    bVar18.f2304h = typedArray.getFloat(index, bVar18.f2304h);
                    break;
                case 20:
                    b bVar19 = aVar.f2273e;
                    bVar19.f2331y = typedArray.getFloat(index, bVar19.f2331y);
                    break;
                case 21:
                    b bVar20 = aVar.f2273e;
                    bVar20.f2298e = typedArray.getLayoutDimension(index, bVar20.f2298e);
                    break;
                case 22:
                    d dVar = aVar.f2271c;
                    dVar.f2349b = typedArray.getInt(index, dVar.f2349b);
                    d dVar2 = aVar.f2271c;
                    dVar2.f2349b = f2261f[dVar2.f2349b];
                    break;
                case 23:
                    b bVar21 = aVar.f2273e;
                    bVar21.f2296d = typedArray.getLayoutDimension(index, bVar21.f2296d);
                    break;
                case 24:
                    b bVar22 = aVar.f2273e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f2273e;
                    bVar23.f2308j = l(typedArray, index, bVar23.f2308j);
                    break;
                case 26:
                    b bVar24 = aVar.f2273e;
                    bVar24.f2310k = l(typedArray, index, bVar24.f2310k);
                    break;
                case 27:
                    b bVar25 = aVar.f2273e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f2273e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f2273e;
                    bVar27.f2312l = l(typedArray, index, bVar27.f2312l);
                    break;
                case 30:
                    b bVar28 = aVar.f2273e;
                    bVar28.f2314m = l(typedArray, index, bVar28.f2314m);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        b bVar29 = aVar.f2273e;
                        bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f2273e;
                    bVar30.f2327u = l(typedArray, index, bVar30.f2327u);
                    break;
                case 33:
                    b bVar31 = aVar.f2273e;
                    bVar31.f2328v = l(typedArray, index, bVar31.f2328v);
                    break;
                case 34:
                    b bVar32 = aVar.f2273e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f2273e;
                    bVar33.f2318o = l(typedArray, index, bVar33.f2318o);
                    break;
                case 36:
                    b bVar34 = aVar.f2273e;
                    bVar34.f2316n = l(typedArray, index, bVar34.f2316n);
                    break;
                case 37:
                    b bVar35 = aVar.f2273e;
                    bVar35.f2332z = typedArray.getFloat(index, bVar35.f2332z);
                    break;
                case 38:
                    aVar.f2269a = typedArray.getResourceId(index, aVar.f2269a);
                    break;
                case 39:
                    b bVar36 = aVar.f2273e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f2273e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f2273e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f2273e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f2271c;
                    dVar3.f2351d = typedArray.getFloat(index, dVar3.f2351d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0026e eVar = aVar.f2274f;
                        eVar.f2366m = true;
                        eVar.f2367n = typedArray.getDimension(index, eVar.f2367n);
                        break;
                    }
                case 45:
                    C0026e eVar2 = aVar.f2274f;
                    eVar2.f2356c = typedArray.getFloat(index, eVar2.f2356c);
                    break;
                case 46:
                    C0026e eVar3 = aVar.f2274f;
                    eVar3.f2357d = typedArray.getFloat(index, eVar3.f2357d);
                    break;
                case 47:
                    C0026e eVar4 = aVar.f2274f;
                    eVar4.f2358e = typedArray.getFloat(index, eVar4.f2358e);
                    break;
                case 48:
                    C0026e eVar5 = aVar.f2274f;
                    eVar5.f2359f = typedArray.getFloat(index, eVar5.f2359f);
                    break;
                case 49:
                    C0026e eVar6 = aVar.f2274f;
                    eVar6.f2360g = typedArray.getDimension(index, eVar6.f2360g);
                    break;
                case 50:
                    C0026e eVar7 = aVar.f2274f;
                    eVar7.f2361h = typedArray.getDimension(index, eVar7.f2361h);
                    break;
                case 51:
                    C0026e eVar8 = aVar.f2274f;
                    eVar8.f2363j = typedArray.getDimension(index, eVar8.f2363j);
                    break;
                case 52:
                    C0026e eVar9 = aVar.f2274f;
                    eVar9.f2364k = typedArray.getDimension(index, eVar9.f2364k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0026e eVar10 = aVar.f2274f;
                        eVar10.f2365l = typedArray.getDimension(index, eVar10.f2365l);
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f2273e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f2273e;
                    bVar41.f2291a0 = typedArray.getInt(index, bVar41.f2291a0);
                    break;
                case 56:
                    b bVar42 = aVar.f2273e;
                    bVar42.f2293b0 = typedArray.getDimensionPixelSize(index, bVar42.f2293b0);
                    break;
                case 57:
                    b bVar43 = aVar.f2273e;
                    bVar43.f2295c0 = typedArray.getDimensionPixelSize(index, bVar43.f2295c0);
                    break;
                case 58:
                    b bVar44 = aVar.f2273e;
                    bVar44.f2297d0 = typedArray.getDimensionPixelSize(index, bVar44.f2297d0);
                    break;
                case 59:
                    b bVar45 = aVar.f2273e;
                    bVar45.f2299e0 = typedArray.getDimensionPixelSize(index, bVar45.f2299e0);
                    break;
                case 60:
                    C0026e eVar11 = aVar.f2274f;
                    eVar11.f2355b = typedArray.getFloat(index, eVar11.f2355b);
                    break;
                case 61:
                    b bVar46 = aVar.f2273e;
                    bVar46.B = l(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f2273e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f2273e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f2272d;
                    cVar.f2335b = l(typedArray, index, cVar.f2335b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f2272d.f2337d = t.b.f22524c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f2272d.f2337d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f2272d.f2339f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2272d;
                    cVar2.f2342i = typedArray.getFloat(index, cVar2.f2342i);
                    break;
                case 68:
                    d dVar4 = aVar.f2271c;
                    dVar4.f2352e = typedArray.getFloat(index, dVar4.f2352e);
                    break;
                case 69:
                    aVar.f2273e.f2301f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2273e.f2303g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2273e;
                    bVar49.f2305h0 = typedArray.getInt(index, bVar49.f2305h0);
                    break;
                case 73:
                    b bVar50 = aVar.f2273e;
                    bVar50.f2307i0 = typedArray.getDimensionPixelSize(index, bVar50.f2307i0);
                    break;
                case 74:
                    aVar.f2273e.f2313l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2273e;
                    bVar51.f2321p0 = typedArray.getBoolean(index, bVar51.f2321p0);
                    break;
                case 76:
                    c cVar3 = aVar.f2272d;
                    cVar3.f2338e = typedArray.getInt(index, cVar3.f2338e);
                    break;
                case 77:
                    aVar.f2273e.f2315m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2271c;
                    dVar5.f2350c = typedArray.getInt(index, dVar5.f2350c);
                    break;
                case 79:
                    c cVar4 = aVar.f2272d;
                    cVar4.f2340g = typedArray.getFloat(index, cVar4.f2340g);
                    break;
                case 80:
                    b bVar52 = aVar.f2273e;
                    bVar52.f2317n0 = typedArray.getBoolean(index, bVar52.f2317n0);
                    break;
                case 81:
                    b bVar53 = aVar.f2273e;
                    bVar53.f2319o0 = typedArray.getBoolean(index, bVar53.f2319o0);
                    break;
                case 82:
                    c cVar5 = aVar.f2272d;
                    cVar5.f2336c = typedArray.getInteger(index, cVar5.f2336c);
                    break;
                case 83:
                    C0026e eVar12 = aVar.f2274f;
                    eVar12.f2362i = l(typedArray, index, eVar12.f2362i);
                    break;
                case 84:
                    c cVar6 = aVar.f2272d;
                    cVar6.f2344k = typedArray.getInteger(index, cVar6.f2344k);
                    break;
                case 85:
                    c cVar7 = aVar.f2272d;
                    cVar7.f2343j = typedArray.getFloat(index, cVar7.f2343j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar8 = aVar.f2272d;
                            cVar8.f2346m = typedArray.getInteger(index, cVar8.f2347n);
                            break;
                        } else {
                            aVar.f2272d.f2345l = typedArray.getString(index);
                            if (aVar.f2272d.f2345l.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH) <= 0) {
                                aVar.f2272d.f2346m = -1;
                                break;
                            } else {
                                aVar.f2272d.f2347n = typedArray.getResourceId(index, -1);
                                aVar.f2272d.f2346m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f2272d.f2347n = typedArray.getResourceId(index, -1);
                        c cVar9 = aVar.f2272d;
                        if (cVar9.f2347n == -1) {
                            break;
                        } else {
                            cVar9.f2346m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2262g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f2273e;
                    bVar54.f2325s = l(typedArray, index, bVar54.f2325s);
                    break;
                case 92:
                    b bVar55 = aVar.f2273e;
                    bVar55.f2326t = l(typedArray, index, bVar55.f2326t);
                    break;
                case 93:
                    b bVar56 = aVar.f2273e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f2273e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    m(aVar.f2273e, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar.f2273e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f2273e;
                    bVar58.f2323q0 = typedArray.getInt(index, bVar58.f2323q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2262g.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f2273e;
        if (bVar59.f2313l0 != null) {
            bVar59.f2311k0 = null;
        }
    }

    private static void q(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0025a aVar2 = new a.C0025a();
        aVar.f2276h = aVar2;
        aVar.f2272d.f2334a = false;
        aVar.f2273e.f2292b = false;
        aVar.f2271c.f2348a = false;
        aVar.f2274f.f2354a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f2263h.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f2273e.K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f2273e.E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f2273e.F));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f2273e.L));
                        break;
                    }
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f2273e.R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f2273e.S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f2273e.O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f2273e.Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f2273e.T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f2273e.P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f2273e.f2300f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f2273e.f2302g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f2273e.f2304h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f2273e.f2331y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f2273e.f2298e));
                    break;
                case 22:
                    aVar2.b(22, f2261f[typedArray.getInt(index, aVar.f2271c.f2349b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f2273e.f2296d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f2273e.H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f2273e.G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f2273e.I));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f2273e.M));
                        break;
                    }
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f2273e.J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f2273e.f2332z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2269a);
                    aVar.f2269a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f2273e.W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f2273e.V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f2273e.X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f2273e.Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f2271c.f2351d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar2.d(44, true);
                        aVar2.a(44, typedArray.getDimension(index, aVar.f2274f.f2367n));
                        break;
                    }
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f2274f.f2356c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f2274f.f2357d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f2274f.f2358e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f2274f.f2359f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f2274f.f2360g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f2274f.f2361h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f2274f.f2363j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f2274f.f2364k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar2.a(53, typedArray.getDimension(index, aVar.f2274f.f2365l));
                        break;
                    }
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f2273e.Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f2273e.f2291a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f2273e.f2293b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f2273e.f2295c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f2273e.f2297d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f2273e.f2299e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f2274f.f2355b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f2273e.C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f2273e.D));
                    break;
                case 64:
                    aVar2.b(64, l(typedArray, index, aVar.f2272d.f2335b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, t.b.f22524c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f2272d.f2342i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f2271c.f2352e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f2273e.f2305h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f2273e.f2307i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f2273e.f2321p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f2272d.f2338e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f2271c.f2350c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f2272d.f2340g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f2273e.f2317n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f2273e.f2319o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f2272d.f2336c));
                    break;
                case 83:
                    aVar2.b(83, l(typedArray, index, aVar.f2274f.f2362i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f2272d.f2344k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f2272d.f2343j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar = aVar.f2272d;
                            cVar.f2346m = typedArray.getInteger(index, cVar.f2347n);
                            aVar2.b(88, aVar.f2272d.f2346m);
                            break;
                        } else {
                            aVar.f2272d.f2345l = typedArray.getString(index);
                            aVar2.c(90, aVar.f2272d.f2345l);
                            if (aVar.f2272d.f2345l.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH) <= 0) {
                                aVar.f2272d.f2346m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f2272d.f2347n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f2272d.f2347n);
                                aVar.f2272d.f2346m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f2272d.f2347n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f2272d.f2347n);
                        c cVar2 = aVar.f2272d;
                        if (cVar2.f2347n == -1) {
                            break;
                        } else {
                            cVar2.f2346m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2262g.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f2273e.N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f2273e.U));
                    break;
                case 95:
                    m(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f2273e.f2323q0));
                    break;
                case 98:
                    if (!j.f2071y0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f2269a = typedArray.getResourceId(index, aVar.f2269a);
                            break;
                        } else {
                            aVar.f2270b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2269a);
                        aVar.f2269a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f2270b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f2273e.f2306i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2262g.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((e) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2268e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2268e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else if (this.f2267d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f2268e.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f2268e.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof a) {
                            aVar.f2273e.f2309j0 = 1;
                            a aVar2 = (a) childAt;
                            aVar2.setId(id2);
                            aVar2.setType(aVar.f2273e.f2305h0);
                            aVar2.setMargin(aVar.f2273e.f2307i0);
                            aVar2.setAllowsGoneWidget(aVar.f2273e.f2321p0);
                            b bVar = aVar.f2273e;
                            int[] iArr = bVar.f2311k0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2313l0;
                                if (str != null) {
                                    bVar.f2311k0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f2273e.f2311k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            b.e(childAt, aVar.f2275g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f2271c;
                        if (dVar.f2350c == 0) {
                            childAt.setVisibility(dVar.f2349b);
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 17) {
                            childAt.setAlpha(aVar.f2271c.f2351d);
                            childAt.setRotation(aVar.f2274f.f2355b);
                            childAt.setRotationX(aVar.f2274f.f2356c);
                            childAt.setRotationY(aVar.f2274f.f2357d);
                            childAt.setScaleX(aVar.f2274f.f2358e);
                            childAt.setScaleY(aVar.f2274f.f2359f);
                            C0026e eVar = aVar.f2274f;
                            if (eVar.f2362i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2274f.f2362i);
                                if (findViewById != null) {
                                    float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                    float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - ((float) childAt.getLeft()));
                                        childAt.setPivotY(top - ((float) childAt.getTop()));
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2360g)) {
                                    childAt.setPivotX(aVar.f2274f.f2360g);
                                }
                                if (!Float.isNaN(aVar.f2274f.f2361h)) {
                                    childAt.setPivotY(aVar.f2274f.f2361h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2274f.f2363j);
                            childAt.setTranslationY(aVar.f2274f.f2364k);
                            if (i11 >= 21) {
                                childAt.setTranslationZ(aVar.f2274f.f2365l);
                                C0026e eVar2 = aVar.f2274f;
                                if (eVar2.f2366m) {
                                    childAt.setElevation(eVar2.f2367n);
                                }
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f2268e.get(num);
            if (aVar3 != null) {
                if (aVar3.f2273e.f2309j0 == 1) {
                    a aVar4 = new a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f2273e;
                    int[] iArr2 = bVar3.f2311k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2313l0;
                        if (str2 != null) {
                            bVar3.f2311k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f2273e.f2311k0);
                        }
                    }
                    aVar4.setType(aVar3.f2273e.f2305h0);
                    aVar4.setMargin(aVar3.f2273e.f2307i0);
                    ConstraintLayout.b d10 = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(d10);
                    constraintLayout.addView(aVar4, d10);
                }
                if (aVar3.f2273e.f2290a) {
                    h hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b d11 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(d11);
                    constraintLayout.addView(hVar, d11);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof c) {
                ((c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2268e.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f2267d || id2 != -1) {
                if (!this.f2268e.containsKey(Integer.valueOf(id2))) {
                    this.f2268e.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f2268e.get(Integer.valueOf(id2));
                if (aVar != null) {
                    aVar.f2275g = b.a(this.f2266c, childAt);
                    aVar.f(id2, bVar);
                    aVar.f2271c.f2349b = childAt.getVisibility();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 17) {
                        aVar.f2271c.f2351d = childAt.getAlpha();
                        aVar.f2274f.f2355b = childAt.getRotation();
                        aVar.f2274f.f2356c = childAt.getRotationX();
                        aVar.f2274f.f2357d = childAt.getRotationY();
                        aVar.f2274f.f2358e = childAt.getScaleX();
                        aVar.f2274f.f2359f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0026e eVar = aVar.f2274f;
                            eVar.f2360g = pivotX;
                            eVar.f2361h = pivotY;
                        }
                        aVar.f2274f.f2363j = childAt.getTranslationX();
                        aVar.f2274f.f2364k = childAt.getTranslationY();
                        if (i11 >= 21) {
                            aVar.f2274f.f2365l = childAt.getTranslationZ();
                            C0026e eVar2 = aVar.f2274f;
                            if (eVar2.f2366m) {
                                eVar2.f2367n = childAt.getElevation();
                            }
                        }
                    }
                    if (childAt instanceof a) {
                        a aVar2 = (a) childAt;
                        aVar.f2273e.f2321p0 = aVar2.getAllowsGoneWidget();
                        aVar.f2273e.f2311k0 = aVar2.getReferencedIds();
                        aVar.f2273e.f2305h0 = aVar2.getType();
                        aVar.f2273e.f2307i0 = aVar2.getMargin();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f2268e.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = fVar.getChildAt(i10);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f2267d || id2 != -1) {
                if (!this.f2268e.containsKey(Integer.valueOf(id2))) {
                    this.f2268e.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = this.f2268e.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof c) {
                        aVar2.h((c) childAt, id2, aVar);
                    }
                    aVar2.g(id2, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i11 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i11.f2273e.f2290a = true;
                    }
                    this.f2268e.put(Integer.valueOf(i11.f2269a), i11);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r0 = r9.f2268e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f2269a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.b> r0 = r2.f2275g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.b.d(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.e$c r0 = r2.f2272d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.e$b r0 = r2.f2273e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.e$e r0 = r2.f2274f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.e$d r0 = r2.f2271c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f2273e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2309j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f2273e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2290a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2292b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
