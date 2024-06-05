package t7;

import com.google.protobuf.i;
import java.util.Objects;
import r7.f1;
import u7.w;
import y7.x;

/* compiled from: TargetData */
public final class i4 {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f30453a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30454b;

    /* renamed from: c  reason: collision with root package name */
    private final long f30455c;

    /* renamed from: d  reason: collision with root package name */
    private final h1 f30456d;

    /* renamed from: e  reason: collision with root package name */
    private final w f30457e;

    /* renamed from: f  reason: collision with root package name */
    private final w f30458f;

    /* renamed from: g  reason: collision with root package name */
    private final i f30459g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f30460h;

    i4(f1 f1Var, int i10, long j10, h1 h1Var, w wVar, w wVar2, i iVar, Integer num) {
        this.f30453a = (f1) x.b(f1Var);
        this.f30454b = i10;
        this.f30455c = j10;
        this.f30458f = wVar2;
        this.f30456d = h1Var;
        this.f30457e = (w) x.b(wVar);
        this.f30459g = (i) x.b(iVar);
        this.f30460h = num;
    }

    public Integer a() {
        return this.f30460h;
    }

    public w b() {
        return this.f30458f;
    }

    public h1 c() {
        return this.f30456d;
    }

    public i d() {
        return this.f30459g;
    }

    public long e() {
        return this.f30455c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4.class != obj.getClass()) {
            return false;
        }
        i4 i4Var = (i4) obj;
        if (!this.f30453a.equals(i4Var.f30453a) || this.f30454b != i4Var.f30454b || this.f30455c != i4Var.f30455c || !this.f30456d.equals(i4Var.f30456d) || !this.f30457e.equals(i4Var.f30457e) || !this.f30458f.equals(i4Var.f30458f) || !this.f30459g.equals(i4Var.f30459g) || !Objects.equals(this.f30460h, i4Var.f30460h)) {
            return false;
        }
        return true;
    }

    public w f() {
        return this.f30457e;
    }

    public f1 g() {
        return this.f30453a;
    }

    public int h() {
        return this.f30454b;
    }

    public int hashCode() {
        return (((((((((((((this.f30453a.hashCode() * 31) + this.f30454b) * 31) + ((int) this.f30455c)) * 31) + this.f30456d.hashCode()) * 31) + this.f30457e.hashCode()) * 31) + this.f30458f.hashCode()) * 31) + this.f30459g.hashCode()) * 31) + Objects.hashCode(this.f30460h);
    }

    public i4 i(Integer num) {
        return new i4(this.f30453a, this.f30454b, this.f30455c, this.f30456d, this.f30457e, this.f30458f, this.f30459g, num);
    }

    public i4 j(w wVar) {
        return new i4(this.f30453a, this.f30454b, this.f30455c, this.f30456d, this.f30457e, wVar, this.f30459g, this.f30460h);
    }

    public i4 k(i iVar, w wVar) {
        return new i4(this.f30453a, this.f30454b, this.f30455c, this.f30456d, wVar, this.f30458f, iVar, (Integer) null);
    }

    public i4 l(long j10) {
        return new i4(this.f30453a, this.f30454b, j10, this.f30456d, this.f30457e, this.f30458f, this.f30459g, this.f30460h);
    }

    public String toString() {
        return "TargetData{target=" + this.f30453a + ", targetId=" + this.f30454b + ", sequenceNumber=" + this.f30455c + ", purpose=" + this.f30456d + ", snapshotVersion=" + this.f30457e + ", lastLimboFreeSnapshotVersion=" + this.f30458f + ", resumeToken=" + this.f30459g + ", expectedCount=" + this.f30460h + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i4(r7.f1 r11, int r12, long r13, t7.h1 r15) {
        /*
            r10 = this;
            u7.w r7 = u7.w.f30653b
            com.google.protobuf.i r8 = x7.z0.f31204t
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.i4.<init>(r7.f1, int, long, t7.h1):void");
    }
}
