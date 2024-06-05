package w;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f23432a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23433b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23434c = false;

    /* renamed from: d  reason: collision with root package name */
    p f23435d;

    /* renamed from: e  reason: collision with root package name */
    a f23436e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f23437f;

    /* renamed from: g  reason: collision with root package name */
    public int f23438g;

    /* renamed from: h  reason: collision with root package name */
    int f23439h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f23440i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23441j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f23442k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f23443l = new ArrayList();

    /* compiled from: DependencyNode */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f23435d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f23443l) {
            if (!fVar.f23441j) {
                return;
            }
        }
        this.f23434c = true;
        d dVar2 = this.f23432a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f23433b) {
            this.f23435d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f next : this.f23443l) {
            if (!(next instanceof g)) {
                i10++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f23441j) {
            g gVar = this.f23440i;
            if (gVar != null) {
                if (gVar.f23441j) {
                    this.f23437f = this.f23439h * gVar.f23438g;
                } else {
                    return;
                }
            }
            d(fVar2.f23438g + this.f23437f);
        }
        d dVar3 = this.f23432a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f23442k.add(dVar);
        if (this.f23441j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f23443l.clear();
        this.f23442k.clear();
        this.f23441j = false;
        this.f23438g = 0;
        this.f23434c = false;
        this.f23433b = false;
    }

    public void d(int i10) {
        if (!this.f23441j) {
            this.f23441j = true;
            this.f23438g = i10;
            for (d next : this.f23442k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23435d.f23486b.r());
        sb2.append(":");
        sb2.append(this.f23436e);
        sb2.append("(");
        sb2.append(this.f23441j ? Integer.valueOf(this.f23438g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f23443l.size());
        sb2.append(":d=");
        sb2.append(this.f23442k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
