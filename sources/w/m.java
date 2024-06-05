package w;

import java.util.ArrayList;
import v.f;

/* compiled from: RunGroup */
class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f23459h;

    /* renamed from: a  reason: collision with root package name */
    public int f23460a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23461b = false;

    /* renamed from: c  reason: collision with root package name */
    p f23462c = null;

    /* renamed from: d  reason: collision with root package name */
    p f23463d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<p> f23464e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    int f23465f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f23466g;

    public m(p pVar, int i10) {
        int i11 = f23459h;
        this.f23465f = i11;
        f23459h = i11 + 1;
        this.f23462c = pVar;
        this.f23463d = pVar;
        this.f23466g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f23435d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f23442k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f23442k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f23435d != pVar) {
                    j11 = Math.min(j11, c(fVar2, ((long) fVar2.f23437f) + j10));
                }
            }
        }
        if (fVar != pVar.f23493i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f23492h, j12)), j12 - ((long) pVar.f23492h.f23437f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f23435d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f23442k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f23442k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f23435d != pVar) {
                    j11 = Math.max(j11, d(fVar2, ((long) fVar2.f23437f) + j10));
                }
            }
        }
        if (fVar != pVar.f23492h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f23493i, j12)), j12 - ((long) pVar.f23493i.f23437f));
    }

    public void a(p pVar) {
        this.f23464e.add(pVar);
        this.f23463d = pVar;
    }

    public long b(f fVar, int i10) {
        int i11;
        long j10;
        p pVar = this.f23462c;
        long j11 = 0;
        if (pVar instanceof c) {
            if (((c) pVar).f23490f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0;
            }
        } else if (!(pVar instanceof n)) {
            return 0;
        }
        f fVar2 = (i10 == 0 ? fVar.f23077e : fVar.f23079f).f23492h;
        f fVar3 = (i10 == 0 ? fVar.f23077e : fVar.f23079f).f23493i;
        boolean contains = pVar.f23492h.f23443l.contains(fVar2);
        boolean contains2 = this.f23462c.f23493i.f23443l.contains(fVar3);
        long j12 = this.f23462c.j();
        if (contains && contains2) {
            long d10 = d(this.f23462c.f23492h, 0);
            long c10 = c(this.f23462c.f23493i, 0);
            long j13 = d10 - j12;
            p pVar2 = this.f23462c;
            int i12 = pVar2.f23493i.f23437f;
            if (j13 >= ((long) (-i12))) {
                j13 += (long) i12;
            }
            int i13 = pVar2.f23492h.f23437f;
            long j14 = ((-c10) - j12) - ((long) i13);
            if (j14 >= ((long) i13)) {
                j14 -= (long) i13;
            }
            float o10 = pVar2.f23486b.o(i10);
            if (o10 > 0.0f) {
                j11 = (long) ((((float) j14) / o10) + (((float) j13) / (1.0f - o10)));
            }
            float f10 = (float) j11;
            long j15 = ((long) ((f10 * o10) + 0.5f)) + j12 + ((long) ((f10 * (1.0f - o10)) + 0.5f));
            p pVar3 = this.f23462c;
            j10 = ((long) pVar3.f23492h.f23437f) + j15;
            i11 = pVar3.f23493i.f23437f;
        } else if (contains) {
            f fVar4 = this.f23462c.f23492h;
            return Math.max(d(fVar4, (long) fVar4.f23437f), ((long) this.f23462c.f23492h.f23437f) + j12);
        } else if (contains2) {
            f fVar5 = this.f23462c.f23493i;
            return Math.max(-c(fVar5, (long) fVar5.f23437f), ((long) (-this.f23462c.f23493i.f23437f)) + j12);
        } else {
            p pVar4 = this.f23462c;
            j10 = ((long) pVar4.f23492h.f23437f) + pVar4.j();
            i11 = this.f23462c.f23493i.f23437f;
        }
        return j10 - ((long) i11);
    }
}
