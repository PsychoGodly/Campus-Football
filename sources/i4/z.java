package i4;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import k4.c;
import k4.n0;
import n2.h;
import p3.x0;
import r6.i;
import s6.u;
import s6.v;
import s6.x;

/* compiled from: TrackSelectionParameters */
public class z implements h {
    public static final z B;
    @Deprecated
    public static final z C;
    /* access modifiers changed from: private */
    public static final String D = n0.r0(1);
    /* access modifiers changed from: private */
    public static final String E = n0.r0(2);
    /* access modifiers changed from: private */
    public static final String F = n0.r0(3);
    /* access modifiers changed from: private */
    public static final String G = n0.r0(4);
    /* access modifiers changed from: private */
    public static final String H = n0.r0(5);
    /* access modifiers changed from: private */
    public static final String I = n0.r0(6);
    /* access modifiers changed from: private */
    public static final String J = n0.r0(7);
    /* access modifiers changed from: private */
    public static final String K = n0.r0(8);
    /* access modifiers changed from: private */
    public static final String L = n0.r0(9);
    /* access modifiers changed from: private */
    public static final String M = n0.r0(10);
    /* access modifiers changed from: private */
    public static final String N = n0.r0(11);
    /* access modifiers changed from: private */
    public static final String O = n0.r0(12);
    /* access modifiers changed from: private */
    public static final String P = n0.r0(13);
    /* access modifiers changed from: private */
    public static final String Q = n0.r0(14);
    /* access modifiers changed from: private */
    public static final String R = n0.r0(15);
    /* access modifiers changed from: private */
    public static final String S = n0.r0(16);
    /* access modifiers changed from: private */
    public static final String T = n0.r0(17);
    /* access modifiers changed from: private */
    public static final String U = n0.r0(18);
    /* access modifiers changed from: private */
    public static final String V = n0.r0(19);
    /* access modifiers changed from: private */
    public static final String W = n0.r0(20);
    /* access modifiers changed from: private */
    public static final String X = n0.r0(21);
    /* access modifiers changed from: private */
    public static final String Y = n0.r0(22);
    /* access modifiers changed from: private */
    public static final String Z = n0.r0(23);
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public static final String f19077a0 = n0.r0(24);
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public static final String f19078b0 = n0.r0(25);
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public static final String f19079c0 = n0.r0(26);
    @Deprecated

    /* renamed from: d0  reason: collision with root package name */
    public static final h.a<z> f19080d0 = y.f33291a;
    public final x<Integer> A;

    /* renamed from: a  reason: collision with root package name */
    public final int f19081a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19082b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19083c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19084d;

    /* renamed from: f  reason: collision with root package name */
    public final int f19085f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19086g;

    /* renamed from: h  reason: collision with root package name */
    public final int f19087h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19088i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19089j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19090k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f19091l;

    /* renamed from: m  reason: collision with root package name */
    public final u<String> f19092m;

    /* renamed from: n  reason: collision with root package name */
    public final int f19093n;

    /* renamed from: o  reason: collision with root package name */
    public final u<String> f19094o;

    /* renamed from: p  reason: collision with root package name */
    public final int f19095p;

    /* renamed from: q  reason: collision with root package name */
    public final int f19096q;

    /* renamed from: r  reason: collision with root package name */
    public final int f19097r;

    /* renamed from: s  reason: collision with root package name */
    public final u<String> f19098s;

    /* renamed from: t  reason: collision with root package name */
    public final u<String> f19099t;

    /* renamed from: u  reason: collision with root package name */
    public final int f19100u;

    /* renamed from: v  reason: collision with root package name */
    public final int f19101v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f19102w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f19103x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f19104y;

    /* renamed from: z  reason: collision with root package name */
    public final v<x0, x> f19105z;

    static {
        z A2 = new a().A();
        B = A2;
        C = A2;
    }

    protected z(a aVar) {
        this.f19081a = aVar.f19106a;
        this.f19082b = aVar.f19107b;
        this.f19083c = aVar.f19108c;
        this.f19084d = aVar.f19109d;
        this.f19085f = aVar.f19110e;
        this.f19086g = aVar.f19111f;
        this.f19087h = aVar.f19112g;
        this.f19088i = aVar.f19113h;
        this.f19089j = aVar.f19114i;
        this.f19090k = aVar.f19115j;
        this.f19091l = aVar.f19116k;
        this.f19092m = aVar.f19117l;
        this.f19093n = aVar.f19118m;
        this.f19094o = aVar.f19119n;
        this.f19095p = aVar.f19120o;
        this.f19096q = aVar.f19121p;
        this.f19097r = aVar.f19122q;
        this.f19098s = aVar.f19123r;
        this.f19099t = aVar.f19124s;
        this.f19100u = aVar.f19125t;
        this.f19101v = aVar.f19126u;
        this.f19102w = aVar.f19127v;
        this.f19103x = aVar.f19128w;
        this.f19104y = aVar.f19129x;
        this.f19105z = v.d(aVar.f19130y);
        this.A = x.p(aVar.f19131z);
    }

    public static z A(Bundle bundle) {
        return new a(bundle).A();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f19081a == zVar.f19081a && this.f19082b == zVar.f19082b && this.f19083c == zVar.f19083c && this.f19084d == zVar.f19084d && this.f19085f == zVar.f19085f && this.f19086g == zVar.f19086g && this.f19087h == zVar.f19087h && this.f19088i == zVar.f19088i && this.f19091l == zVar.f19091l && this.f19089j == zVar.f19089j && this.f19090k == zVar.f19090k && this.f19092m.equals(zVar.f19092m) && this.f19093n == zVar.f19093n && this.f19094o.equals(zVar.f19094o) && this.f19095p == zVar.f19095p && this.f19096q == zVar.f19096q && this.f19097r == zVar.f19097r && this.f19098s.equals(zVar.f19098s) && this.f19099t.equals(zVar.f19099t) && this.f19100u == zVar.f19100u && this.f19101v == zVar.f19101v && this.f19102w == zVar.f19102w && this.f19103x == zVar.f19103x && this.f19104y == zVar.f19104y && this.f19105z.equals(zVar.f19105z) && this.A.equals(zVar.A)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f19081a + 31) * 31) + this.f19082b) * 31) + this.f19083c) * 31) + this.f19084d) * 31) + this.f19085f) * 31) + this.f19086g) * 31) + this.f19087h) * 31) + this.f19088i) * 31) + (this.f19091l ? 1 : 0)) * 31) + this.f19089j) * 31) + this.f19090k) * 31) + this.f19092m.hashCode()) * 31) + this.f19093n) * 31) + this.f19094o.hashCode()) * 31) + this.f19095p) * 31) + this.f19096q) * 31) + this.f19097r) * 31) + this.f19098s.hashCode()) * 31) + this.f19099t.hashCode()) * 31) + this.f19100u) * 31) + this.f19101v) * 31) + (this.f19102w ? 1 : 0)) * 31) + (this.f19103x ? 1 : 0)) * 31) + (this.f19104y ? 1 : 0)) * 31) + this.f19105z.hashCode()) * 31) + this.A.hashCode();
    }

    /* compiled from: TrackSelectionParameters */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f19106a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f19107b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f19108c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f19109d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f19110e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f19111f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f19112g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f19113h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f19114i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f19115j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f19116k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public u<String> f19117l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f19118m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public u<String> f19119n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f19120o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f19121p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f19122q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public u<String> f19123r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public u<String> f19124s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public int f19125t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public int f19126u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public boolean f19127v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public boolean f19128w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f19129x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public HashMap<x0, x> f19130y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public HashSet<Integer> f19131z;

        @Deprecated
        public a() {
            this.f19106a = a.e.API_PRIORITY_OTHER;
            this.f19107b = a.e.API_PRIORITY_OTHER;
            this.f19108c = a.e.API_PRIORITY_OTHER;
            this.f19109d = a.e.API_PRIORITY_OTHER;
            this.f19114i = a.e.API_PRIORITY_OTHER;
            this.f19115j = a.e.API_PRIORITY_OTHER;
            this.f19116k = true;
            this.f19117l = u.y();
            this.f19118m = 0;
            this.f19119n = u.y();
            this.f19120o = 0;
            this.f19121p = a.e.API_PRIORITY_OTHER;
            this.f19122q = a.e.API_PRIORITY_OTHER;
            this.f19123r = u.y();
            this.f19124s = u.y();
            this.f19125t = 0;
            this.f19126u = 0;
            this.f19127v = false;
            this.f19128w = false;
            this.f19129x = false;
            this.f19130y = new HashMap<>();
            this.f19131z = new HashSet<>();
        }

        private void B(z zVar) {
            this.f19106a = zVar.f19081a;
            this.f19107b = zVar.f19082b;
            this.f19108c = zVar.f19083c;
            this.f19109d = zVar.f19084d;
            this.f19110e = zVar.f19085f;
            this.f19111f = zVar.f19086g;
            this.f19112g = zVar.f19087h;
            this.f19113h = zVar.f19088i;
            this.f19114i = zVar.f19089j;
            this.f19115j = zVar.f19090k;
            this.f19116k = zVar.f19091l;
            this.f19117l = zVar.f19092m;
            this.f19118m = zVar.f19093n;
            this.f19119n = zVar.f19094o;
            this.f19120o = zVar.f19095p;
            this.f19121p = zVar.f19096q;
            this.f19122q = zVar.f19097r;
            this.f19123r = zVar.f19098s;
            this.f19124s = zVar.f19099t;
            this.f19125t = zVar.f19100u;
            this.f19126u = zVar.f19101v;
            this.f19127v = zVar.f19102w;
            this.f19128w = zVar.f19103x;
            this.f19129x = zVar.f19104y;
            this.f19131z = new HashSet<>(zVar.A);
            this.f19130y = new HashMap<>(zVar.f19105z);
        }

        private static u<String> C(String[] strArr) {
            u.a p10 = u.p();
            for (String e10 : (String[]) k4.a.e(strArr)) {
                p10.a(n0.E0((String) k4.a.e(e10)));
            }
            return p10.k();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((n0.f19738a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f19125t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f19124s = u.z(n0.X(locale));
                }
            }
        }

        public z A() {
            return new z(this);
        }

        /* access modifiers changed from: protected */
        public a D(z zVar) {
            B(zVar);
            return this;
        }

        public a E(Context context) {
            if (n0.f19738a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f19114i = i10;
            this.f19115j = i11;
            this.f19116k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O = n0.O(context);
            return G(O.x, O.y, z10);
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        protected a(z zVar) {
            B(zVar);
        }

        protected a(Bundle bundle) {
            u<x> uVar;
            String a10 = z.I;
            z zVar = z.B;
            this.f19106a = bundle.getInt(a10, zVar.f19081a);
            this.f19107b = bundle.getInt(z.J, zVar.f19082b);
            this.f19108c = bundle.getInt(z.K, zVar.f19083c);
            this.f19109d = bundle.getInt(z.L, zVar.f19084d);
            this.f19110e = bundle.getInt(z.M, zVar.f19085f);
            this.f19111f = bundle.getInt(z.N, zVar.f19086g);
            this.f19112g = bundle.getInt(z.O, zVar.f19087h);
            this.f19113h = bundle.getInt(z.P, zVar.f19088i);
            this.f19114i = bundle.getInt(z.Q, zVar.f19089j);
            this.f19115j = bundle.getInt(z.R, zVar.f19090k);
            this.f19116k = bundle.getBoolean(z.S, zVar.f19091l);
            this.f19117l = u.v((String[]) i.a(bundle.getStringArray(z.T), new String[0]));
            this.f19118m = bundle.getInt(z.f19078b0, zVar.f19093n);
            this.f19119n = C((String[]) i.a(bundle.getStringArray(z.D), new String[0]));
            this.f19120o = bundle.getInt(z.E, zVar.f19095p);
            this.f19121p = bundle.getInt(z.U, zVar.f19096q);
            this.f19122q = bundle.getInt(z.V, zVar.f19097r);
            this.f19123r = u.v((String[]) i.a(bundle.getStringArray(z.W), new String[0]));
            this.f19124s = C((String[]) i.a(bundle.getStringArray(z.F), new String[0]));
            this.f19125t = bundle.getInt(z.G, zVar.f19100u);
            this.f19126u = bundle.getInt(z.f19079c0, zVar.f19101v);
            this.f19127v = bundle.getBoolean(z.H, zVar.f19102w);
            this.f19128w = bundle.getBoolean(z.X, zVar.f19103x);
            this.f19129x = bundle.getBoolean(z.Y, zVar.f19104y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(z.Z);
            if (parcelableArrayList == null) {
                uVar = u.y();
            } else {
                uVar = c.b(x.f19074f, parcelableArrayList);
            }
            this.f19130y = new HashMap<>();
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                x xVar = uVar.get(i10);
                this.f19130y.put(xVar.f19075a, xVar);
            }
            int[] iArr = (int[]) i.a(bundle.getIntArray(z.f19077a0), new int[0]);
            this.f19131z = new HashSet<>();
            for (int valueOf : iArr) {
                this.f19131z.add(Integer.valueOf(valueOf));
            }
        }
    }
}
