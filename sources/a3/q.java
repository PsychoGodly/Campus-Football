package a3;

import java.io.IOException;
import k4.a0;
import s2.m;

/* compiled from: TrackFragment */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f338a;

    /* renamed from: b  reason: collision with root package name */
    public long f339b;

    /* renamed from: c  reason: collision with root package name */
    public long f340c;

    /* renamed from: d  reason: collision with root package name */
    public long f341d;

    /* renamed from: e  reason: collision with root package name */
    public int f342e;

    /* renamed from: f  reason: collision with root package name */
    public int f343f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f344g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f345h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f346i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f347j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f348k = new boolean[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean f349l;

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f350m = new boolean[0];

    /* renamed from: n  reason: collision with root package name */
    public p f351n;

    /* renamed from: o  reason: collision with root package name */
    public final a0 f352o = new a0();

    /* renamed from: p  reason: collision with root package name */
    public boolean f353p;

    /* renamed from: q  reason: collision with root package name */
    public long f354q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f355r;

    public void a(a0 a0Var) {
        a0Var.l(this.f352o.e(), 0, this.f352o.g());
        this.f352o.T(0);
        this.f353p = false;
    }

    public void b(m mVar) throws IOException {
        mVar.readFully(this.f352o.e(), 0, this.f352o.g());
        this.f352o.T(0);
        this.f353p = false;
    }

    public long c(int i10) {
        return this.f347j[i10];
    }

    public void d(int i10) {
        this.f352o.P(i10);
        this.f349l = true;
        this.f353p = true;
    }

    public void e(int i10, int i11) {
        this.f342e = i10;
        this.f343f = i11;
        if (this.f345h.length < i10) {
            this.f344g = new long[i10];
            this.f345h = new int[i10];
        }
        if (this.f346i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f346i = new int[i12];
            this.f347j = new long[i12];
            this.f348k = new boolean[i12];
            this.f350m = new boolean[i12];
        }
    }

    public void f() {
        this.f342e = 0;
        this.f354q = 0;
        this.f355r = false;
        this.f349l = false;
        this.f353p = false;
        this.f351n = null;
    }

    public boolean g(int i10) {
        return this.f349l && this.f350m[i10];
    }
}
