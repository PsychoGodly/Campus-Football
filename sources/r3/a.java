package r3;

import j4.l;
import j4.p;
import n2.r1;

/* compiled from: BaseMediaChunk */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f22100k;

    /* renamed from: l  reason: collision with root package name */
    public final long f22101l;

    /* renamed from: m  reason: collision with root package name */
    private c f22102m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f22103n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l lVar, p pVar, r1 r1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, pVar, r1Var, i10, obj, j10, j11, j14);
        this.f22100k = j12;
        this.f22101l = j13;
    }

    public final int i(int i10) {
        return ((int[]) k4.a.h(this.f22103n))[i10];
    }

    /* access modifiers changed from: protected */
    public final c j() {
        return (c) k4.a.h(this.f22102m);
    }

    public void k(c cVar) {
        this.f22102m = cVar;
        this.f22103n = cVar.a();
    }
}
