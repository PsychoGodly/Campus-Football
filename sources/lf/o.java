package lf;

/* compiled from: Segment */
final class o {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f36283a;

    /* renamed from: b  reason: collision with root package name */
    int f36284b;

    /* renamed from: c  reason: collision with root package name */
    int f36285c;

    /* renamed from: d  reason: collision with root package name */
    boolean f36286d;

    /* renamed from: e  reason: collision with root package name */
    boolean f36287e;

    /* renamed from: f  reason: collision with root package name */
    o f36288f;

    /* renamed from: g  reason: collision with root package name */
    o f36289g;

    o() {
        this.f36283a = new byte[8192];
        this.f36287e = true;
        this.f36286d = false;
    }

    public final void a() {
        o oVar = this.f36289g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f36287e) {
            int i10 = this.f36285c - this.f36284b;
            if (i10 <= (8192 - oVar.f36285c) + (oVar.f36286d ? 0 : oVar.f36284b)) {
                f(oVar, i10);
                b();
                p.a(this);
            }
        }
    }

    public final o b() {
        o oVar = this.f36288f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f36289g;
        oVar3.f36288f = oVar;
        this.f36288f.f36289g = oVar3;
        this.f36288f = null;
        this.f36289g = null;
        return oVar2;
    }

    public final o c(o oVar) {
        oVar.f36289g = this;
        oVar.f36288f = this.f36288f;
        this.f36288f.f36289g = oVar;
        this.f36288f = oVar;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public final o d() {
        this.f36286d = true;
        return new o(this.f36283a, this.f36284b, this.f36285c, true, false);
    }

    public final o e(int i10) {
        o oVar;
        if (i10 <= 0 || i10 > this.f36285c - this.f36284b) {
            throw new IllegalArgumentException();
        }
        if (i10 >= 1024) {
            oVar = d();
        } else {
            oVar = p.b();
            System.arraycopy(this.f36283a, this.f36284b, oVar.f36283a, 0, i10);
        }
        oVar.f36285c = oVar.f36284b + i10;
        this.f36284b += i10;
        this.f36289g.c(oVar);
        return oVar;
    }

    public final void f(o oVar, int i10) {
        if (oVar.f36287e) {
            int i11 = oVar.f36285c;
            if (i11 + i10 > 8192) {
                if (!oVar.f36286d) {
                    int i12 = oVar.f36284b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = oVar.f36283a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        oVar.f36285c -= oVar.f36284b;
                        oVar.f36284b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f36283a, this.f36284b, oVar.f36283a, oVar.f36285c, i10);
            oVar.f36285c += i10;
            this.f36284b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f36283a = bArr;
        this.f36284b = i10;
        this.f36285c = i11;
        this.f36286d = z10;
        this.f36287e = z11;
    }
}
