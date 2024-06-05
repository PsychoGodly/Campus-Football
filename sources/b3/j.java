package b3;

import b3.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import k4.a0;
import n2.r1;
import n2.y2;
import s2.h0;
import s6.u;

/* compiled from: VorbisReader */
final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f5515n;

    /* renamed from: o  reason: collision with root package name */
    private int f5516o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5517p;

    /* renamed from: q  reason: collision with root package name */
    private h0.d f5518q;

    /* renamed from: r  reason: collision with root package name */
    private h0.b f5519r;

    /* compiled from: VorbisReader */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h0.d f5520a;

        /* renamed from: b  reason: collision with root package name */
        public final h0.b f5521b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f5522c;

        /* renamed from: d  reason: collision with root package name */
        public final h0.c[] f5523d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5524e;

        public a(h0.d dVar, h0.b bVar, byte[] bArr, h0.c[] cVarArr, int i10) {
            this.f5520a = dVar;
            this.f5521b = bVar;
            this.f5522c = bArr;
            this.f5523d = cVarArr;
            this.f5524e = i10;
        }
    }

    j() {
    }

    static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.g() + 4) {
            a0Var.Q(Arrays.copyOf(a0Var.e(), a0Var.g() + 4));
        } else {
            a0Var.S(a0Var.g() + 4);
        }
        byte[] e10 = a0Var.e();
        e10[a0Var.g() - 4] = (byte) ((int) (j10 & 255));
        e10[a0Var.g() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        e10[a0Var.g() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        e10[a0Var.g() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    private static int o(byte b10, a aVar) {
        if (!aVar.f5523d[p(b10, aVar.f5524e, 1)].f22429a) {
            return aVar.f5520a.f22439g;
        }
        return aVar.f5520a.f22440h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return h0.m(1, a0Var, true);
        } catch (y2 unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        super.e(j10);
        int i10 = 0;
        this.f5517p = j10 != 0;
        h0.d dVar = this.f5518q;
        if (dVar != null) {
            i10 = dVar.f22439g;
        }
        this.f5516o = i10;
    }

    /* access modifiers changed from: protected */
    public long f(a0 a0Var) {
        int i10 = 0;
        if ((a0Var.e()[0] & 1) == 1) {
            return -1;
        }
        int o10 = o(a0Var.e()[0], (a) k4.a.h(this.f5515n));
        if (this.f5517p) {
            i10 = (this.f5516o + o10) / 4;
        }
        long j10 = (long) i10;
        n(a0Var, j10);
        this.f5517p = true;
        this.f5516o = o10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean h(a0 a0Var, long j10, i.b bVar) throws IOException {
        if (this.f5515n != null) {
            k4.a.e(bVar.f5513a);
            return false;
        }
        a q10 = q(a0Var);
        this.f5515n = q10;
        if (q10 == null) {
            return true;
        }
        h0.d dVar = q10.f5520a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f22442j);
        arrayList.add(q10.f5522c);
        bVar.f5513a = new r1.b().g0("audio/vorbis").I(dVar.f22437e).b0(dVar.f22436d).J(dVar.f22434b).h0(dVar.f22435c).V(arrayList).Z(h0.c(u.v(q10.f5521b.f22427b))).G();
        return true;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f5515n = null;
            this.f5518q = null;
            this.f5519r = null;
        }
        this.f5516o = 0;
        this.f5517p = false;
    }

    /* access modifiers changed from: package-private */
    public a q(a0 a0Var) throws IOException {
        h0.d dVar = this.f5518q;
        if (dVar == null) {
            this.f5518q = h0.k(a0Var);
            return null;
        }
        h0.b bVar = this.f5519r;
        if (bVar == null) {
            this.f5519r = h0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.g()];
        System.arraycopy(a0Var.e(), 0, bArr, 0, a0Var.g());
        h0.c[] l10 = h0.l(a0Var, dVar.f22434b);
        return new a(dVar, bVar, bArr, l10, h0.a(l10.length - 1));
    }
}
