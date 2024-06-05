package n2;

import android.content.Context;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import i4.b0;
import j4.f;
import k4.c0;
import k4.d;
import k4.n0;
import n2.j;
import p2.e;
import p3.m;
import p3.x;
import r6.g;
import r6.v;
import s2.i;
import s2.r;

/* compiled from: ExoPlayer */
public interface s extends g3 {

    /* compiled from: ExoPlayer */
    public interface a {
        void A(boolean z10);

        void G(boolean z10);

        void H(boolean z10);
    }

    /* compiled from: ExoPlayer */
    public static final class b {
        boolean A;
        Looper B;
        boolean C;

        /* renamed from: a  reason: collision with root package name */
        final Context f20694a;

        /* renamed from: b  reason: collision with root package name */
        d f20695b;

        /* renamed from: c  reason: collision with root package name */
        long f20696c;

        /* renamed from: d  reason: collision with root package name */
        v<t3> f20697d;

        /* renamed from: e  reason: collision with root package name */
        v<x.a> f20698e;

        /* renamed from: f  reason: collision with root package name */
        v<b0> f20699f;

        /* renamed from: g  reason: collision with root package name */
        v<x1> f20700g;

        /* renamed from: h  reason: collision with root package name */
        v<f> f20701h;

        /* renamed from: i  reason: collision with root package name */
        g<d, o2.a> f20702i;

        /* renamed from: j  reason: collision with root package name */
        Looper f20703j;

        /* renamed from: k  reason: collision with root package name */
        c0 f20704k;

        /* renamed from: l  reason: collision with root package name */
        e f20705l;

        /* renamed from: m  reason: collision with root package name */
        boolean f20706m;

        /* renamed from: n  reason: collision with root package name */
        int f20707n;

        /* renamed from: o  reason: collision with root package name */
        boolean f20708o;

        /* renamed from: p  reason: collision with root package name */
        boolean f20709p;

        /* renamed from: q  reason: collision with root package name */
        int f20710q;

        /* renamed from: r  reason: collision with root package name */
        int f20711r;

        /* renamed from: s  reason: collision with root package name */
        boolean f20712s;

        /* renamed from: t  reason: collision with root package name */
        u3 f20713t;

        /* renamed from: u  reason: collision with root package name */
        long f20714u;

        /* renamed from: v  reason: collision with root package name */
        long f20715v;

        /* renamed from: w  reason: collision with root package name */
        w1 f20716w;

        /* renamed from: x  reason: collision with root package name */
        long f20717x;

        /* renamed from: y  reason: collision with root package name */
        long f20718y;

        /* renamed from: z  reason: collision with root package name */
        boolean f20719z;

        public b(Context context) {
            this(context, new v(context), new x(context));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ t3 h(Context context) {
            return new m(context);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ x.a i(Context context) {
            return new m(context, (r) new i());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ b0 j(Context context) {
            return new i4.m(context);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ x1 l(x1 x1Var) {
            return x1Var;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ t3 m(t3 t3Var) {
            return t3Var;
        }

        public s g() {
            k4.a.f(!this.C);
            this.C = true;
            return new b1(this, (g3) null);
        }

        public b n(w1 w1Var) {
            k4.a.f(!this.C);
            this.f20716w = (w1) k4.a.e(w1Var);
            return this;
        }

        public b o(x1 x1Var) {
            k4.a.f(!this.C);
            k4.a.e(x1Var);
            this.f20700g = new y(x1Var);
            return this;
        }

        public b p(t3 t3Var) {
            k4.a.f(!this.C);
            k4.a.e(t3Var);
            this.f20697d = new z(t3Var);
            return this;
        }

        private b(Context context, v<t3> vVar, v<x.a> vVar2) {
            this(context, vVar, vVar2, new w(context), a0.f36365a, new u(context), t.f36444a);
        }

        private b(Context context, v<t3> vVar, v<x.a> vVar2, v<b0> vVar3, v<x1> vVar4, v<f> vVar5, g<d, o2.a> gVar) {
            this.f20694a = (Context) k4.a.e(context);
            this.f20697d = vVar;
            this.f20698e = vVar2;
            this.f20699f = vVar3;
            this.f20700g = vVar4;
            this.f20701h = vVar5;
            this.f20702i = gVar;
            this.f20703j = n0.Q();
            this.f20705l = e.f21234h;
            this.f20707n = 0;
            this.f20710q = 1;
            this.f20711r = 0;
            this.f20712s = true;
            this.f20713t = u3.f20733g;
            this.f20714u = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
            this.f20715v = 15000;
            this.f20716w = new j.b().a();
            this.f20695b = d.f19684a;
            this.f20717x = 500;
            this.f20718y = 2000;
            this.A = true;
        }
    }

    r1 B();

    void D(boolean z10);

    void L(e eVar, boolean z10);

    void g(boolean z10);

    int getAudioSessionId();

    void o(x xVar);
}
