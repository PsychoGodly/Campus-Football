package m9;

import v8.j;
import v8.p;
import z8.b;

/* compiled from: BoundingBox */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private b f29253a;

    /* renamed from: b  reason: collision with root package name */
    private p f29254b;

    /* renamed from: c  reason: collision with root package name */
    private p f29255c;

    /* renamed from: d  reason: collision with root package name */
    private p f29256d;

    /* renamed from: e  reason: collision with root package name */
    private p f29257e;

    /* renamed from: f  reason: collision with root package name */
    private int f29258f;

    /* renamed from: g  reason: collision with root package name */
    private int f29259g;

    /* renamed from: h  reason: collision with root package name */
    private int f29260h;

    /* renamed from: i  reason: collision with root package name */
    private int f29261i;

    c(b bVar, p pVar, p pVar2, p pVar3, p pVar4) throws j {
        if (!(pVar == null && pVar3 == null) && (!(pVar2 == null && pVar4 == null) && ((pVar == null || pVar2 != null) && (pVar3 == null || pVar4 != null)))) {
            k(bVar, pVar, pVar2, pVar3, pVar4);
            return;
        }
        throw j.a();
    }

    private void b() {
        if (this.f29254b == null) {
            this.f29254b = new p(0.0f, this.f29256d.d());
            this.f29255c = new p(0.0f, this.f29257e.d());
        } else if (this.f29256d == null) {
            this.f29256d = new p((float) (this.f29253a.k() - 1), this.f29254b.d());
            this.f29257e = new p((float) (this.f29253a.k() - 1), this.f29255c.d());
        }
        this.f29258f = (int) Math.min(this.f29254b.c(), this.f29255c.c());
        this.f29259g = (int) Math.max(this.f29256d.c(), this.f29257e.c());
        this.f29260h = (int) Math.min(this.f29254b.d(), this.f29256d.d());
        this.f29261i = (int) Math.max(this.f29255c.d(), this.f29257e.d());
    }

    private void k(b bVar, p pVar, p pVar2, p pVar3, p pVar4) {
        this.f29253a = bVar;
        this.f29254b = pVar;
        this.f29255c = pVar2;
        this.f29256d = pVar3;
        this.f29257e = pVar4;
        b();
    }

    static c l(c cVar, c cVar2) throws j {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.f29253a, cVar.f29254b, cVar.f29255c, cVar2.f29256d, cVar2.f29257e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m9.c a(int r13, int r14, boolean r15) throws v8.j {
        /*
            r12 = this;
            v8.p r0 = r12.f29254b
            v8.p r1 = r12.f29255c
            v8.p r2 = r12.f29256d
            v8.p r3 = r12.f29257e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            v8.p r13 = new v8.p
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            v8.p r13 = r12.f29255c
            goto L_0x0034
        L_0x0032:
            v8.p r13 = r12.f29257e
        L_0x0034:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            z8.b r14 = r12.f29253a
            int r14 = r14.g()
            if (r0 < r14) goto L_0x004a
            z8.b r14 = r12.f29253a
            int r14 = r14.g()
            int r0 = r14 + -1
        L_0x004a:
            v8.p r14 = new v8.p
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.b()
            m9.c r13 = new m9.c
            z8.b r7 = r12.f29253a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.a(int, int, boolean):m9.c");
    }

    /* access modifiers changed from: package-private */
    public p c() {
        return this.f29255c;
    }

    /* access modifiers changed from: package-private */
    public p d() {
        return this.f29257e;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f29259g;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f29261i;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f29258f;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f29260h;
    }

    /* access modifiers changed from: package-private */
    public p i() {
        return this.f29254b;
    }

    /* access modifiers changed from: package-private */
    public p j() {
        return this.f29256d;
    }

    c(c cVar) {
        k(cVar.f29253a, cVar.f29254b, cVar.f29255c, cVar.f29256d, cVar.f29257e);
    }
}
